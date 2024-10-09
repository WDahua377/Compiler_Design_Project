all: myparser.g
	java -jar ./antlr-3.5.2-complete-no-st3.jar myInterp.g
	javac -cp ./antlr-3.5.2-complete-no-st3.jar myInterp_test.java myInterpLexer.java myInterpParser.java

clean:
	rm myInterplexer.java myInterpParser.java myInterp.tokens *.class