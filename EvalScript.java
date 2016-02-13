import javax.script.*;
public class EvalScript {

	public class MyLogger {
		public void info(String str) {
			System.err.println("MYLOG " + str);
		}
	}

	public static void main(String[] args) throws Exception {
		EvalScript evalscript = new EvalScript();
		evalscript.runTest();
	}

	public void runTest() throws Exception {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("nashorn");
		ScriptContext scriptContext = new SimpleScriptContext();
		MyLogger mylogger = new MyLogger();
		scriptContext.setAttribute("logger", mylogger, ScriptContext.ENGINE_SCOPE);
		String script = "function (msg) { logger.info('we were called with msg ' + msg); }";
		CompiledScript compiledScript = ((Compilable)engine).compile(script);
		Object ret = compiledScript.eval(scriptContext);
		Object newReturn = ((Invocable) compiledScript.getEngine()).invokeMethod(ret, "call", ret, "msg1", null);
	}
}
