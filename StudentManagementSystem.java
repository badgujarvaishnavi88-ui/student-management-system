import java.util.ArrayList;
import java.util.Scanner;


class Student {

    int rollNo;
    String name;
    int marks;


    Student(int rollNo, String name, int marks){

        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;

    }


    void display(){

        System.out.println("Roll No : " + rollNo);

        System.out.println("Name : " + name);

        System.out.println("Marks : " + marks);

        System.out.println("----------------");

    }

}



public class StudentManagementSystem {


    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);


        ArrayList<Student> students = new ArrayList<>();


        while(true){


            System.out.println("\n1. Add Student");

            System.out.println("2. View Students");

            System.out.println("3. Exit");


            System.out.print("Enter choice : ");

            int choice = sc.nextInt();



            if(choice == 1){


                System.out.print("Enter Roll Number : ");

                int roll = sc.nextInt();


                System.out.print("Enter Name : ");

                String name = sc.next();


                System.out.print("Enter Marks : ");

                int marks = sc.nextInt();



                students.add(new Student(roll,name,marks));


                System.out.println("Student Added Successfully");


            }



            else if(choice == 2){


                System.out.println("\nStudent Records");


                for(Student s : students){

                    s.display();

                }


            }



            else if(choice == 3){


                System.out.println("Thank You");

                break;

            }



            else{


                System.out.println("Invalid Choice");


            }


        }


        sc.close();


    }


}