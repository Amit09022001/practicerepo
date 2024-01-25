import practice.lambda.Employee;
import practice.lambda.Printsumation;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Printsumation sf = (x, y) -> {
            return x + y;
        };
        System.out.println("Sum of two number: " + sf.printSum(34, 56));
        
        //EXAMPLE OF CONSUMER INTERFACE  WHO TAKE ONLY ONE PARAMETER AND RETURN TYPE IS VOID.

        ArrayList<Integer> list = new ArrayList();
        list.add(12);
        list.add(22);
        list.add(32);
        list.add(41);
        list.forEach(n -> System.out.println(n));
        System.out.println("======================");
        list.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
        ArrayList<Employee> list1 = new ArrayList<>();
        list1.add(new Employee("AYUSH KUMAR", 45000, 3));
        list1.add(new Employee("AMAN KUMAR", 55000, 4));
        list1.add(new Employee("ADITYA KUMAR", 35000, 5));
        list1.add(new Employee("AMIT KUMAR", 25000, 2));


        //USING PREDICATE FUNTIONAL INTERFACE RETURN TYPE-BOOLEAN AND TAKING ONLY ONE ARGUMENT OR PARAMETER
        Predicate<Employee> predicate = emp1 -> (emp1.salary > 10000) && (emp1.experience >2);
        for(Employee emp:list1) {
            if (predicate.test(emp)) {
                System.out.println(emp.toString());

            }
        }
         //Funtion Functional interface
        //Example-1 print square of a number
        Function <Integer,Integer> square=n->n*n;
        System.out.println("Square is : " +square.apply(12));//144

        //Example-2 print Square of all array element
        int []arr ={12,4,20,45};
        Function<Integer,Integer> sqrOfArrayElement=s->s*s;
        for(int a:arr){
            System.out.println("Square of "+a+" is: "+sqrOfArrayElement.apply(a));
        }
    }
}
