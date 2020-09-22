package IntroductionToNashorn;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.*;

public class Practice {

	public static void main(String[] args) throws ScriptException, FileNotFoundException, NoSuchMethodException {
		// TODO Auto-generated method stub
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");
		FileReader f = new FileReader("C:\\Users\\Shayan\\Desktop\\app.js");
		engine.eval(f);
		Invocable invocable = (Invocable)engine;
		String msg = invocable.invokeFunction("checkPrime", 53).toString();
		System.out.println(msg);
	}

}
