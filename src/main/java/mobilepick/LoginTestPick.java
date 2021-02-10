package mobilepick;

import io.testproject.java.annotations.v2.Test;
import io.testproject.java.execution.results.StepExecutionResult;
import io.testproject.java.sdk.v2.Runner;
import java.lang.Exception;
import java.lang.String;

/**
 * This class was automatically generated by TestProject
 * Provides an example how to run coded TestProject tests
 */

public class LoginTestPick {
  public static String developerToken = "Lqn4t-zmGLrnJhwuUWSKIm_DgA9xo95mu_4zJN-2_Xo";

  public static String deviceUdid = "52006084fe18840b";

  public static String androidPackage = "com.ctcorpdigital.pickpack";

  public static String androidName = "com.ctcorpdigital.pickpack.MainActivity";
public static void main(String[] args) {
    try {
      runTestpick();
    }
    catch (Exception e) {
    }
  }

  /**
   * Runs "Testpick"
   */
  
  public static StepExecutionResult runTestpick() throws Exception {
    Runner runner = Runner.createAndroid(developerToken,deviceUdid,androidPackage,androidName);
    return runner.run(new LoginBasePick(), true);
  }
}