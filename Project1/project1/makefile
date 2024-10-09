all: mylexer.g
	java -jar antlr-3.5.2-complete-no-st3.jar mylexer.g
	javac -cp antlr-3.5.2-complete-no-st3.jar mylexer.java testLexer.java

clean:
	rm mylexer.java mylexer.tokens *.class