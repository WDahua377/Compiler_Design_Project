all: myparser.g
	java -jar ./antlr-3.5.2-complete-no-st3.jar myparser.g
	javac -cp ./antlr-3.5.2-complete-no-st3.jar testParser.java myparserLexer.java myparserParser.java

clean:
	rm mylexer.java myParser.java myParser.tokens *.class