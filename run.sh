export JAVA8_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_71.jdk/Contents/Home
export JAVA_HOME="$JAVA8_HOME"
export PATH="$JAVA8_HOME/bin:$PATH"

java -version
javac EvalScript.java && java EvalScript

echo

export JAVA8_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_72.jdk/Contents/Home
export JAVA_HOME="$JAVA8_HOME"
export PATH="$JAVA8_HOME/bin:$PATH"

java -version
javac EvalScript.java && java EvalScript
