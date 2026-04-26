javac --release 21 -d out102 Java102_chooseNum.java TestJava102.java
java -javaagent:jacoco-agent.jar=destfile=jacoco102.exec -cp out102 TestJava102
java -jar jacoco-cli.jar report jacoco102.exec --classfiles out102 --sourcefiles . --html coverage-report-102


javac --release 21 -d out15 Java15_stringSequence.java TestJava15.java
java -javaagent:jacoco-agent.jar=destfile=jacoco15.exec -cp out15 TestJava15
java -jar jacoco-cli.jar report jacoco15.exec --classfiles out15 --sourcefiles . --html coverage-report-15

javac --release 21 -d out16 Java16_countDistinctCharacters.java TestJava16.java
java -javaagent:jacoco-agent.jar=destfile=jacoco16.exec -cp out16 TestJava16
java -jar jacoco-cli.jar report jacoco16.exec --classfiles out16 --sourcefiles . --html coverage-report-16

javac --release 21 -d out18 Java18_howManyTimes.java TestJava18.java
java -javaagent:jacoco-agent.jar=destfile=jacoco18.exec -cp out18 TestJava18
java -jar jacoco-cli.jar report jacoco18.exec --classfiles out18 --sourcefiles . --html coverage-report-18


javac --release 21 -d out23 Java23_strlen.java TestJava23.java
java -javaagent:jacoco-agent.jar=destfile=jacoco23.exec -cp out23 TestJava23
java -jar jacoco-cli.jar report jacoco23.exec --classfiles out23 --sourcefiles . --html coverage-report-23


javac --release 21 -d out27 Java27_flipCase.java TestJava27.java
java -javaagent:jacoco-agent.jar=destfile=jacoco27.exec -cp out27 TestJava27
java -jar jacoco-cli.jar report jacoco27.exec --classfiles out27 --sourcefiles . --html coverage-report-27


javac --release 21 -d out32 Java32_findZero.java TestJava32.java
java -javaagent:jacoco-agent.jar=destfile=jacoco32.exec -cp out32 TestJava32
java -jar jacoco-cli.jar report jacoco32.exec --classfiles out32 --sourcefiles . --html coverage-report-32
  

javac --release 21 -d out34 Java34_uniqueSorted.java TestJava34.java
java -javaagent:jacoco-agent.jar=destfile=jacoco34.exec -cp out34 TestJava34
java -jar jacoco-cli.jar report jacoco34.exec --classfiles out34 --sourcefiles . --html coverage-report-34



javac --release 21 -d out48 Java48_isPalindrome.java TestJava48.java
java -javaagent:jacoco-agent.jar=destfile=jacoco48.exec -cp out48 TestJava48
java -jar jacoco-cli.jar report jacoco48.exec --classfiles out48 --sourcefiles . --html coverage-report-48

javac --release 21 -d out87 Java87_getRow.java TestJava87.java
java -javaagent:jacoco-agent.jar=destfile=jacoco87.exec -cp out87 TestJava87
java -jar jacoco-cli.jar report jacoco87.exec --classfiles out87 --sourcefiles . --html coverage-report-87

javac --release 21 -d out93 Java93_encode.java TestJava93.java
java -javaagent:jacoco-agent.jar=destfile=jacoco93.exec -cp out93 TestJava93
java -jar jacoco-cli.jar report jacoco93.exec --classfiles out93 --sourcefiles . --html coverage-report-93
