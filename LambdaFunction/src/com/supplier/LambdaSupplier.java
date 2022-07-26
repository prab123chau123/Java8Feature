package com.supplier;
import java.util.function.Supplier;
import java.lang.Math;
public class LambdaSupplier
{
public static void main(String args[])
{
	Supplier<Double>random=()->Math.random();
	System.out.println(random.get());
}
}
