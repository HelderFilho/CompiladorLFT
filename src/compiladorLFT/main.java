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
	  Reader read = new FileReader("Codigo.txt");
	  Parser p = new Parser( new MyLexer(new PushbackReader(read)));
	  Start tree = p.parse();
    }
  catch (Exception e){
  System.out.println(e);
  }
 }
}
