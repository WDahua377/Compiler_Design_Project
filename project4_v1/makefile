all: myCompiler.g
	java -jar ./antlr-3.5.2-complete-no-st3.jar myCompiler.g
	javac -cp ./antlr-3.5.2-complete-no-st3.jar:. *.java
clean:
	rm myCompilerLexer.java myCompilerParser.java myCompier.tokens *.class