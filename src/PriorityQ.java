import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;
        /*
         * Create the Student and Priorities classes here.
         */
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;
        import java.util.*;

/*
 * Create the Student and Priorities classes here.
 */
class Student{
    int id;
    String name;
    double cgpa;

    public Student( String b, double c,int a){
        id=a;
        name=b;
        cgpa=c;
        System.out.println(id+" "+name+" "+ cgpa);
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return id;
    }
    public double getCGPA(){
        return cgpa;
    }
}
class Priorities{

    public List<Student> getStudents(List<String> events){
        PriorityQueue<Student> pq = new PriorityQueue<Student>(10,new comp());
        Scanner sc=new Scanner(System.in);
        String n;double d;int i;
        while(sc.hasNext()){
            String s=sc.next();
            switch(s){
                case "ENTER":
                    n=sc.next();
                    d=sc.nextDouble();
                    i=sc.nextInt();
                    Student a=new Student(n,d,i);
                    pq.add(a);
                    break;
                case "SERVED": // pq.poll();break;
            }
        }
        ArrayList<Student> st=new ArrayList<Student>(pq);
        //Object[] ob = pq.toArray();

        return st;
    }

}
class comp implements Comparator<Student>{
    public int compare(Student a, Student b){
        if(a.cgpa-b.cgpa !=0) return (Double.compare(a.cgpa,b.cgpa));
        else{
            if(a.name.compareTo(b.name) !=0) return a.name.compareTo(b.name);
            else return a.id-b.id;
        }
    }
}



public class PriorityQ {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
