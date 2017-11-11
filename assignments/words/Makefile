CLASSPATH=.:/usr/share/java/junit4.jar

OUT=bin

default: run

run: Main.class
	@java -cp ${CLASSPATH}:bin ie.tcd.cs3102.Main

test: MainTests.class
	@java -cp ${CLASSPATH}:bin ie.tcd.cs3102.MainTests

%.class: src/ie/tcd/cs3102/%.java
	javac -cp ${CLASSPATH} -d bin $| $<

clean:
	@find -name "*.class" | xargs rm -f
