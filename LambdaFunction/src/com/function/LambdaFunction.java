package com.function;
import java.util.function.Function;
public class LambdaFunction 
{
public static void main(String args[])
{
	Function<Integer,String>fun=t->t*10+" Hello India";
	System.out.println(fun.apply(3));
}
}
