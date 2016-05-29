import wci.frontend.Source;

import java.io.BufferedReader;
import java.io.StringReader;

/**
 * Created by croese on 5/28/16.
 */
public class Program {
  public static void main(String[] args) throws Exception {
    Source src = new Source(
        new BufferedReader(new StringReader("ABCDE")));

    System.out.println(src.currentChar());
    System.out.println(src.nextChar());
    System.out.println(src.nextChar());
    System.out.println(src.nextChar());
    System.out.println(src.currentChar());
    System.out.println(src.currentChar());
    System.out.println(src.nextChar());
    System.out.println(src.nextChar() == Source.EOL);
  }
}
