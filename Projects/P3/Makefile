JAVAC = javac -cp 
JVM = java -cp
LIB = "tests/junit-4.10.jar:src/:tests/"
TESTSRC = tests/
MAINSRC = src/
CLASSES = TestPacManValidMoves TestGhostValidMoves TestMapMove


.SUFFIXES: .class .java

all: 
	$(JAVAC) $(LIB) $(MAINSRC)*.java $(TESTSRC)*.java

test_j: 
	$(JVM) $(LIB) org.junit.runner.JUnitCore $(CLASSES)

clean: 
	rm -rf $(MAINSRC)*.class $(TESTSRC)*.class


.PHONY: all test_j clean