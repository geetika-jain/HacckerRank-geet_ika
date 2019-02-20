import java.util.*;
import java.math.*;

    class Checker implements Comparator<Student>{
        public int compare(Student A, Student B){
            int cgpacomp, namecomp, idcomp;
            BigDecimal a,b;
            a=new BigDecimal(A.getCgpa());
            b=new BigDecimal(B.getCgpa());
            cgpacomp=compare(a, b);
            namecomp=compare(A.getFname(), B.getFname());
            idcomp=compare(A.getId(), B.getId());

            if(cgpacomp==0){
                if(namecomp==0){
                    return((idcomp==0)? namecomp: idcomp);
                }
                else return namecomp;

            }
            return cgpacomp;

        }
        public int compare(BigDecimal a, BigDecimal b){
            return b.compareTo(a);
        }
        public int compare(String a, String b){
            return a.compareTo(b);
        }
        public int compare(int a, int b){
            return b-a;
        }

    }

    class Student{
        private int id;
        private String fname;
        private double cgpa;
        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }
        public int getId() {
            return id;
        }
        public String getFname() {
            return fname;
        }
        public double getCgpa() {
            return cgpa;
        }
    }


    //Complete the code
    public class SortStudent {

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());
            Checker checker=new Checker();
            List<Student> studentList = new ArrayList<Student>();
            while(testCases>0){
                int id = in.nextInt();
                String fname = in.next();
                double cgpa = in.nextDouble();

                Student st = new Student(id, fname, cgpa);
                studentList.add(st);

                testCases--;
            }
            Collections.sort(studentList, checker);
            for(Student st: studentList){
                System.out.println(st.getFname());
            }
        }
    }





