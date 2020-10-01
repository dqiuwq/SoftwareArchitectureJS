import java.util.logging.*;
import java.io.IOException;

public class LoggingTest {
  private static Logger slog = Logger.getLogger("Screen logger");
  private static Logger flog = Logger.getLogger("File logger");
  
  public static void main(String[] args) throws IOException {
    // Fake messages
    String iMessage = "Information only";
    String wMessage = "Warning, be careful";
    String sMessage = "Error, help help";

    // Configuration 
    flog.setUseParentHandlers(false);
    // 2 ways to handle the exception, 1) use try catch, 2) method throw
    FileHandler logFileHandler = new FileHandler("logfile.txt"); // by default will throw IOException
    logFileHandler.setFormatter(new SimpleFormatter()); // by default is xml format, use SimpleFormatter to change to plain text
    flog.addHandler(logFileHandler);

    //slog.setLevel(Level.SEVERE);
    slog.setLevel(Level.WARNING);
    flog.setLevel(Level.SEVERE);
    
    // Testing
    slog.info(slog.getName() + " " + iMessage);
    slog.warning(slog.getName() + " " + wMessage);
    slog.severe(slog.getName() + " " + sMessage);

    flog.info(flog.getName() + " " + iMessage);
    flog.warning(flog.getName() + " " + wMessage);
    flog.severe(flog.getName() + " " + sMessage);

    try {
      System.out.println(100/0);
    } catch (RuntimeException rte) {
      flog.log(Level.SEVERE, "Payroll calculation", rte);
    }
  }
}