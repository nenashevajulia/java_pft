package ru.stqa.rft.sandbox;

public class MyFirstProgram {
	public static void main(String [] args)  {
		hello ("world!");
		hello ("user");
		hello("Juli!");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " =" + s.area());

		Rectangle r = new Rectangle(4,6);
		System.out.println("Площадь прямоугольник со стороной "+ r.a + " и " + r.b + " =" + r.area());
		}

	public static void hello (String somebody){
		System.out.println("Hello, " + somebody + "!");
	}

	}

