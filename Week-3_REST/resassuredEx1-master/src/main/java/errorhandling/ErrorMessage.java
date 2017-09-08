package errorhandling;

public class ErrorMessage {

  public ErrorMessage(String  msg, int code) {
    this.code = code;
    this.message = msg;        
  }

  private int code;
  private String message;
}
