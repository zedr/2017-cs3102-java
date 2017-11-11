CLASSPATH=.:/usr/share/java/junit4.jar

default: run

run: Main.class
	@java -cp ${CLASSPATH}:src/ ie.tcd.cs3102.Main

Main.class:
	javac -cp ${CLASSPATH} src/ie/tcd/cs3102/Main.java

clean:
	@find -name "*.class" | xargs rm -f
