package practice.functioninterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Employee1 {
    public String ename;
    public int salary;
    Employee1(String ename,int salary){
        this.ename=ename;
        this.salary=salary;
    }

    public static void main(String[] args){
        ArrayList<Employee1>list=new ArrayList<>();
        list.add(new Employee1("Amit kumar",8000));
        list.add(new Employee1("Suman Singh",19000));
        list.add(new Employee1("Ayush Kumar",29000));
        list.add(new Employee1("Suraj Kumar Singh",50000));
        //Using Function Functional Interface

        Function<Employee1,Integer> function=e-> {
            int sal = e.salary;
            if (sal<= 10000) {
                return sal * 10 / 100;
            } else if (sal <= 20000) {
                return sal * 20 / 100;
            } else {
                return sal * 30 / 100;
            }

        };
        for(Employee1 e:list){
            int bonus=function.apply(e);
            System.out.println(e.ename+" "+ e.salary);
            System.out.println(bonus);
        }



    }
}
