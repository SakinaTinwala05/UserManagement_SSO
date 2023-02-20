package page.web;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import driver.DriverBase;
import driver.WebDriverOperations;

public class CommonPage extends DriverBase {

	public WebDriverOperations operations;

	public CommonPage() {
		operations = new WebDriverOperations();
	}

	public String getCopiedText() {
		String path = null, result = "";
		File dir = new File("temp");
		if (!dir.exists())
			dir.mkdir();
		try {
			operations.waits.pauseInSeconds(10);
			Robot robot = new Robot();
			Runtime rs = Runtime.getRuntime();
			rs.exec("notepad");
			operations.waits.pauseInSeconds(10);
			robot.keyPress(KeyEvent.VK_CONTROL);
			operations.waits.pauseInMilliSeconds(100);
			robot.keyPress(KeyEvent.VK_V);
			operations.waits.pauseInMilliSeconds(100);
			robot.keyRelease(KeyEvent.VK_V);
			operations.waits.pauseInMilliSeconds(100);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			operations.waits.pauseInMilliSeconds(100);
			robot.keyPress(KeyEvent.VK_CONTROL);
			operations.waits.pauseInMilliSeconds(100);
			robot.keyPress(KeyEvent.VK_S);
			operations.waits.pauseInMilliSeconds(100);
			robot.keyRelease(KeyEvent.VK_S);
			operations.waits.pauseInMilliSeconds(100);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			operations.waits.pauseInSeconds(10);
			path = dir.getAbsolutePath() + File.separator + System.nanoTime() + ".txt";
			StringSelection stringSelection = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			Thread.sleep(3000);
			operations.waits.pauseInMilliSeconds(100);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			operations.waits.pauseInMilliSeconds(100);
			robot.keyRelease(KeyEvent.VK_V);
			operations.waits.pauseInMilliSeconds(100);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			operations.waits.pauseInSeconds(10);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Process process = Runtime.getRuntime().exec("taskkill /f /im notepad.exe");
			process.waitFor();
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String content = "";
			content = br.readLine();
			while (content != null) {
				result = result + content;
				content = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
