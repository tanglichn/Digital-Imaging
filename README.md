# HELP

# setup openccv3 with java
- install opencv3 with java module
- locate opencv-###.jar file
- locate opencv_java###.so folder

# to compile java class with opencv
javac -cp /PATH_JAR/opencv-320.jar CLASSNAME.java

# to run java class with opencv
java -cp /PATH_JAR/opencv-320.jar:. -Djava.library.path=/PATH_SO/ CLASSNAME

# example
javac -cp ../opencv-lib/opencv-320.jar HistogramEqualizationImage.java
java -cp ../opencv-lib/opencv-320.jar:. -Djava.library.path=../opencv-lib/ HistogramEqualizationImage

# PATH on Linux system at Durham

/opt/local/opencv/3.0/share/OpenCV/java/opencv-300.jar

/opt/local/opencv/3.1/share/OpenCV/java/opencv-310.jar
