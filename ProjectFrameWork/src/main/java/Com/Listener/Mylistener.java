package Com.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import Com.Base.BaseClass;
import Com.Utils.DriverUtils;

public class Mylistener extends BaseClass implements ITestListener{

	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getName());
		
		
		
	}

	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS,"pass");
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL,"Fail");
		String path = DriverUtils.ScreenShot(result.getName());
		test.addScreenCaptureFromPath(path);
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "skip");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {
		report.flush();
		
	}

}
