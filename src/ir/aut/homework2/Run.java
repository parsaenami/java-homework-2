package ir.aut.homework2;

import ir.aut.homework2.q1.*;
import ir.aut.homework2.q2.*;
import ir.aut.homework2.q3.*;
import ir.aut.homework2.q4.*;
import ir.aut.homework2.q5.*;

import java.util.Scanner;

public class Run {
    private static void question1() {
        ComplexNumber number = new ComplexNumber(1, 2);
        ComplexNumber number1 = new ComplexNumber();
        number1.setR(1);
        number1.setI(2);
        System.out.println(number.add(number1));
        System.out.println(number.sub(number1));
        System.out.println(number.muliply(number1));
        System.out.println(number.divide(number1));
        int countNumbers = number.getComplexCounter();
        System.out.println(number.isEqual(number1));
        double imaginary = number.getI();
        double reality = number.getR();
        System.out.println(countNumbers);
        System.out.println(imaginary);
        System.out.println(reality);
    }

    private static void question2() {
        Circle circle = new Circle(2);
        Circle circle1 = new Circle();
        Square square = new Square(4);
        Square square1 = new Square();
        Rectangle rectangle = new Rectangle(3, 4);
        Rectangle rectangle1 = new Rectangle();
        Triangle triangle = new Triangle(3, 4, 5);
        Triangle triangle1 = new Triangle();
        circle1.setR(2);
        System.out.println(circle.perimeter());
        System.out.println(circle.area());
        System.out.println(circle.isEqual(circle1));
        double r = circle.getR();
        System.out.println(r);
        square1.setA(3);
        System.out.println(square.perimeter());
        System.out.println(square.area());
        System.out.println(square.diameter());
        double a = square.getA();
        System.out.println(a);
        System.out.println(square.isEqual(square1));
        rectangle1.setA(6);
        rectangle1.setB(4);
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.area());
        System.out.println(rectangle1.distinguish());
        System.out.println(rectangle.isEqual(rectangle1));
        double x = rectangle.getA();
        double y = rectangle.getB();
        System.out.println(x);
        System.out.println(y);
        triangle1.setA(4);
        triangle1.setB(4);
        triangle1.setC(5);
        System.out.println(triangle.perimeter());
        System.out.println(triangle.area());
        System.out.println(triangle.isEqual(triangle1));
        Triangle.type triType = triangle.triangleType();
        System.out.println(triType);
        double m = triangle.getA();
        double n = triangle.getB();
        double p = triangle.getC();
        System.out.println(m);
        System.out.println(n);
        System.out.println(p);
    }

    private static void question3() {
        Address address = new Address("32", "jomhuri", "tehran", "123456789");
        Address address1 = new Address("24", "jamali", "1", "shiraz", "012346679");
        Address address2 = new Address("32", "jomhuri", "tehran", "123456789");
        String s = address.toString();
        System.out.println(s);
        System.out.println(address.isEqual(address2));
        String b1 = address1.getBlock();
        String s1 = address1.getStreet();
        String a1 = address1.getApartmentNo();
        String c1 = address1.getCity();
        String z1 = address1.getZipCode();
        System.out.println(b1);
        System.out.println(s1);
        System.out.println(a1);
        System.out.println(c1);
        System.out.println(z1);
    }

    private static void question4() {
        Contact contact = new Contact("", "", "");
        contact.setName("ali");
        contact.setNumber("02166666666");
        String S = "7-June";
        contact.setBirthday(S);
        System.out.println(contact.toString());
        System.out.println();
        Contact contact1 = new Contact("parsa", "09109122944", "7-July");
        AddressBook book = new AddressBook();
        book.addToKeeper(contact1);
        Contact contact2 = new Contact("ahmad", "09126548763");
        book.addToKeeper(contact2);
        Contact contact3 = new Contact("hamid", "09153469211");
        book.addToKeeper(contact3);
        book.printContact(book.getContactKeeper());
        System.out.println();
        Contact contact4 = new Contact("hesam", "09192568754", "21-December");
        book.addToKeeper(contact4);
        book.printContact(book.getContactKeeper());
        System.out.println();
        book.removeFromKeeper("parsa");
        book.printContact(book.getContactKeeper());
        System.out.println();
        book.removeFromKeeper("09153469211");
        book.printContact(book.getContactKeeper());
        System.out.println();
        book.removeFromKeeper("akbar");
        book.printContact(book.getContactKeeper());
        System.out.println(book.getContactCounter());
    }

    private static void question5() {
        Machine machine = new Machine("enami");
        Machine machine1 = new Machine();
        machine1.setOwner("hadifar");
        machine1.setSpeed(40);
        machine1.setDegree(45);
        machine1.setCarCode(123456789);
        machine.setSpeed(50);
        machine.setDegree(-90);
        machine.setCarCode(246824680);
        machine.highSpeedArr(machine);
        machine.highSpeedArr(machine1);

        long id = machine.getCarCode();
        System.out.println(id);
        String sCar = machine.toString();
        System.out.println(sCar);
        System.out.println(machine.turnDirect());


    }

    public static void main(String[] args) {
        int choice;
        System.out.println("please select a homework to check out:");
        Scanner choose = new Scanner(System.in);
        choice = choose.nextInt();
        switch (choice){
            case 1:
                question1();
                break;
            case 2:
                question2();
                break;
            case 3:
                question3();
                break;
            case 4:
                question4();
                break;
            case 5:
                question5();
                break;
        }
    }
}
