package com.predicate;
import java.util.function.Predicate;
public class LambdaPredicate 
{
public static void main(String arg[])
{
	Predicate<String>check=str->str.length()>20;
	System.out.println(check.test("Hello,World"));
}
}
