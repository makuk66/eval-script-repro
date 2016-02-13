This code shows a change between 1.8.0_71 and 1.8.0_72:
```
$ ./run.sh 
java version "1.8.0_71"
Java(TM) SE Runtime Environment (build 1.8.0_71-b15)
Java HotSpot(TM) 64-Bit Server VM (build 25.71-b15, mixed mode)
MYLOG we were called with msg msg1

java version "1.8.0_72"
Java(TM) SE Runtime Environment (build 1.8.0_72-b15)
Java HotSpot(TM) 64-Bit Server VM (build 25.72-b15, mixed mode)
Exception in thread "main" javax.script.ScriptException: ReferenceError: "logger" is not defined in <eval> at line number 1
	at jdk.nashorn.api.scripting.NashornScriptEngine.throwAsScriptException(NashornScriptEngine.java:467)
	at jdk.nashorn.api.scripting.NashornScriptEngine.invokeImpl(NashornScriptEngine.java:389)
	at jdk.nashorn.api.scripting.NashornScriptEngine.invokeMethod(NashornScriptEngine.java:199)
	at EvalScript.runTest(EvalScript.java:24)
	at EvalScript.main(EvalScript.java:12)
Caused by: <eval>:1 ReferenceError: "logger" is not defined
	at jdk.nashorn.internal.runtime.ECMAErrors.error(ECMAErrors.java:57)
	at jdk.nashorn.internal.runtime.ECMAErrors.referenceError(ECMAErrors.java:319)
	at jdk.nashorn.internal.runtime.ECMAErrors.referenceError(ECMAErrors.java:291)
	at jdk.nashorn.internal.objects.Global.__noSuchProperty__(Global.java:1428)
	at jdk.nashorn.internal.scripts.Script$Recompilation$1$15A$\^eval\_.L:1(<eval>:1)
	at jdk.nashorn.internal.runtime.ScriptFunctionData.invoke(ScriptFunctionData.java:625)
	at jdk.nashorn.internal.runtime.ScriptFunction.invoke(ScriptFunction.java:494)
	at jdk.nashorn.internal.runtime.ScriptRuntime.apply(ScriptRuntime.java:393)
	at jdk.nashorn.internal.objects.NativeFunction.call(NativeFunction.java:192)
	at jdk.nashorn.internal.runtime.ScriptFunctionData.invoke(ScriptFunctionData.java:616)
	at jdk.nashorn.internal.runtime.ScriptFunction.invoke(ScriptFunction.java:494)
	at jdk.nashorn.internal.runtime.ScriptRuntime.apply(ScriptRuntime.java:393)
	at jdk.nashorn.api.scripting.ScriptObjectMirror.callMember(ScriptObjectMirror.java:199)
	at jdk.nashorn.api.scripting.NashornScriptEngine.invokeImpl(NashornScriptEngine.java:383)
	... 3 more
```
