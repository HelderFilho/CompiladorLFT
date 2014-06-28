//Helder Filho e Heudder Mello

package compiladorLFT;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.io.Reader;
import java.util.Formatter;
import compiladorLFT.lexer.*;
import compiladorLFT.node.*;
import compiladorLFT.parser.*;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
  try{
	  Reader read = new FileReader("Codigo Fonte Para Testes.txt");
//	  Parser p = new Parser( new MyLexer(new PushbackReader(new InputStreamReader(System.in))));
	  Parser p = new Parser( new MyLexer(new PushbackReader(read)));
	  Start tree = p.parse();
  
	  
	  
	  
	  
  }catch (Exception e){

	  
	  System.out.println(e);
  }
    	
    	
    	
  /*  	
    	
    	// TODO code application logic here
    Reader read;
    boolean sair = true;
    String nome = "1";
     try {   
     	read = new FileReader("Codigo Fonte Para Testes.txt");
        MyLexer lexer = new MyLexer(new PushbackReader(read));    
			try {
			 while (sair==true) {
		       Token token;
		       token = lexer.next();
		 	//Instancia um Token da proxima sequencia de caracteres do arquivo
                nome = token.getClass().getSimpleName();
            //verifica o nome do Token
                  if (!nome.equals("EOF")) {
                     nome = nome.substring(1, nome.length());
           //retira o "T" do nome da classe do Token
                    } 
             	 if (token.getClass().getSimpleName().equals("TVazio")){
                    System.out.print(token.getText());
           //Imprimir vazio faz com que tabulações e quebras de linhas também sejam impressas
           //O que faz com que a impressão final não fique toda na mesma linha e sem espaçamento
                    }
                  else{
                        System.out.print(nome + " " );
           //Se o nome da classe não for "TVazio", imprime o nome da classe
                    }
                  
                  		
                  
                    if (token.getClass().getSimpleName().equals("EOF")){
                    sair = false;
           //Se encontrar o EOF, é porque o arquivo terminou e ja pode sair da impressão
                     }
                }}
			catch (LexerException e) {
					// TODO Auto-generated catch block
					System.err.println("Token Desconhecido ou Invalido Encontrado, o analisador será parado");
                	//e.printStackTrace();
				}
            
        } catch (FileNotFoundException ex) {
           System.err.println("Arquivo não encontrado");}

*/    }

}
