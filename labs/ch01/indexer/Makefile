default: run

run: Indexer.class
	@java -cp . com.example.cs3102.Indexer

Indexer.class:
	@javac com/example/cs3102/Indexer.java

clean:
	@find -name "*.class" | xargs rm -f
