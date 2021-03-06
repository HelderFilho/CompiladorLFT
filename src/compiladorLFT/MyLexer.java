package compiladorLFT;

import compiladorLFT.lexer.*;

import compiladorLFT.node.*;
public class MyLexer extends Lexer
{ private int count;
  private TComment comment;
  private StringBuffer text;
  // We define a constructor
  public MyLexer(java.io.PushbackReader in)
  { super(in);
  }
  // We define a filter that recognizes nested comments.
  protected void filter() throws LexerException
  { // if we are in the comment state
    if(state.equals(State.COMMENT))
    { // if we are just entering this state
      if(comment == null)
      { // The token is supposed to be a comment.
        // We keep a reference to it and set the count to one
        comment = (TComment) token;
        text = new StringBuffer(comment.getText());
        count = 1;
        token = null; // continue to scan the input.
      }
      else
      { // we were already in the comment state
        text.append(token.getText()); // accumulate the text.
        if(token instanceof TComment)
          count++;
        else if(token instanceof TCommentEnd)
          count--;
    	if (token instanceof EOF){
    		throw new LexerException(null,"Token Desconhecido ou Invalido Encontrado, o analisador ser� parado" );  
		}if(count != 0){
        	token = null; // continue to scan the input.

        
        
        }else
        {
          token = comment; //return a comment with the full text.
          state = State.NORMAL; //go back to normal.
          comment = null; // We release this reference.
        }
      }
    }
  }
}