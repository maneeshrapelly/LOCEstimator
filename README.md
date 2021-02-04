# LOCEstimator

This is a simple parsing tool that takes input a programming language source file path and returns the output with classifying each line as either blank or 
comment(single line) or code. This tool currently supports only java file and classify them with their syntaxes. It can be extended with following features
1) add support for more programming languages
2) accepts a directory path as input and parse all the files and print the classification of lines type

Sample runs:
1) Valid java file:
input: 
```
import java.util.*;
// file created on 1st Jan 2020
// author: @openenvoy

/**
Multi comment
**/
public class Sample {

    // This is another comment line
    public static void main(String[] args) {
        System.out.println("Hello world!"); // code, not comment 11
    }

}
```
output:
```
Enter file path
/home/gaian/Desktop/Sample.java
{BLANK=3, CODE=9, COMMENT=3}
TOTAL: 15
```
2) Invalid path:
```
Enter file path
/home/gaian/Desktop/abc.js
Wrong input!, make sure file exists and provide absolute path of a file
```
3) Unsupported programming language file:
```
Enter file path
/home/gaian/Desktop/Sample_cpp.cpp
Unsupported file type. Provide Java/C/Javascript files
```
4) Directory path:

