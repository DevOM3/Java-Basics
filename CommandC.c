#include<stdio.h>
#include<dos.h>

void main()
 {
	system("javac CommandLine.java");
	system("java CommandLine %d %c %f %s", 10, 'c', 1.24, "Hello WOrld ");

 }