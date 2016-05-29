package wci.frontend;

import java.util.Objects;

public class Token {
  protected TokenType type;
  protected String text;
  protected Object value;
  protected Source source;
  protected int lineNum;
  protected int position;

  public Token(Source source) throws Exception {
    this.source = source;
    this.lineNum = source.getLineNum();
    this.position = source.getPosition();
    
    extract();
  }

  protected void extract() throws Exception {
    text = Character.toString(currentChar());
    value = null;

    nextChar();
  }

  protected void nextChar() throws Exception {
    source.nextChar();
  }

  protected char currentChar() throws Exception {
    return source.currentChar();
  }

  protected char peekChar() throws Exception {
    return source.peekChar();
  }
}
