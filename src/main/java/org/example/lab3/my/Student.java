package org.example.lab3.my;

public class Student
{
    private int student_id;

    public Student(int student_id)
    {
        this.student_id = student_id;
    }

    public boolean equals(Object obj)
    {
        if(obj == this){
            return true;
        }



        if(obj == null){
            return false;
        }



        if(!(getClass() == obj.getClass())){
            return false;
        }
        else{
            Student tmp = (Student)obj;
            if(tmp.student_id == this.student_id){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public static void main(String[] args)
    {
        Student s1 = new Student(8888);
        Student s2 = new Student(8888);

        if(s1.equals(s2)){
            System.out.println("Они равны!");
        }
        else{
            System.out.println("Они не равны!");
        }
    }
}