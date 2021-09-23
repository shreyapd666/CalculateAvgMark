/*Create a class Student with data members regno, name and age. Student class contains two member functions
 (do nothing functions) named get_data() and put_data().
 The classes Arts and Science has been derived from Class Student.
 Class Arts has the data members m1,m2,m3,avg and get_data() function to get the details of arts student
 (inherits the data members from class Student) and put_data() function to display the details.
 Class Science has the data members m1,m2,m3,avg and get_data() function to get the details of Science students
 (inherits the data members from Student)  and put_data() function to display the  details Science student.
 Compare the average of Arts student and Science student averages and display the greater one on screen.
 *Note: Class Student must be an abstract class.*/

import java.util.Scanner;
abstract class Student{
    int regno;
    String name;
    int age;
    abstract void get_data() ;
    abstract void put_data();
}
class Art extends Student{
    int m1,m2,m3;
    public int avg;
    Scanner scan = new Scanner(System.in);
    public void get_data() {
        System.out.println("Entering details of the arts student");
        System.out.print("Enter the regno: ");
        regno= scan.nextInt();
        System.out.print("Enter the name: ");
        name= scan.next();
        System.out.print("Enter the age: ");
        age= scan.nextInt();
        System.out.print("Enter the mark of Commerce: ");
        m1= scan.nextInt();
        System.out.print("Enter the mark of Economics: ");
        m2= scan.nextInt();
        System.out.print("Enter the mark of History: ");
        m3= scan.nextInt();
        avg=(m1+m2+m3)/3;
    }
    public void put_data(){
        System.out.println("Displaying the details of the arts student");
        System.out.println("Regno= "+regno+"\n" + "Name= "+name+"\n"+ "Age= "+age+"\n" + "Commerce= "+m1+ "\n"
                           +"Economics= "+ m2 +"\n" + "History= " +m3+ "\n" + "Average= "+ avg);
    }
}
class Science extends Student{
    int m1;
    int m2;
    int m3;
    public int avg;
    Scanner scan = new Scanner(System.in);
    public void get_data() {
        System.out.println("\nEntering details of the science student");
        System.out.print("Enter the regno: ");
        regno= scan.nextInt();
        System.out.print("Enter the name: ");
        name= scan.next();
        System.out.print("Enter the age: ");
        age= scan.nextInt();
        System.out.print("Enter the mark of Physics: ");
        m1= scan.nextInt();
        System.out.print("Enter the mark of Chemistry: ");
        m2= scan.nextInt();
        System.out.print("Enter the mark of Maths: ");
        m3= scan.nextInt();
        avg=(m1+m2+m3)/3;
    }
    public void put_data() {
        System.out.println("Displaying the details of the science student");
        System.out.println("Regno= " + regno + "\n" + "Name= " + name + "\n" + "Age= " + age + "\n" + "Physics= " + m1 + "\n"
                + "Chemistry= " + m2 + "\n" + "Maths= " + m3 + "\n" + "Average= " + avg);
    }
}

public class StudentAverage {
    public static void main(String[] args){
        Art s1=new Art();
        s1.get_data();
        s1.put_data();
        int avg1=s1.avg;
        Science s2=new Science();
        s2.get_data();
        s2.put_data();
        int avg2=s2.avg;
        int average= Math.max(avg1, avg2);
        System.out.println("The best average is "+average);
    }
}
