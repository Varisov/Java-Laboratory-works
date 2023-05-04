import java.util.*;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Student[] st = new Student[3];
            String fac;
            st[0] = new Student(1, "Murat Nazerke", 2004, "FIT", 1, "VT");
            st[1] = new Student(2, "Laila", 2005, "FIT", 3, "Sib 39");
            st[2] = new Student(3, "Dana", 2003, "FSN", 2, "VT");
            while(true){
                System.out.println("""
                        1)список студ зад. факультета
                        2)список студ для каждого факультета и курса
                        3)список студ родивш после заданного года
                        4)список группы
                        5) выход
                        """);
                try {
                    int n = Integer.parseInt(sc.next());
                    if(n == 1) {
                        System.out.println("nujny facultet");
                        fac = sc.next(); // 4
                        for (int i = 0; i < st.length; i++) {
                            if(st[i].getFaculty().equalsIgnoreCase(fac)){
                                System.out.println(st[i].toString());
                            }
                        }
                    }
                    if(n == 2) {
                        try {
                            System.out.println("kerekty facultety");
                            fac = sc.next();
                            System.out.println("kerekty course");
                            int course = sc.nextInt();
                            for (int i = 0; i < st.length; i++) {
                                if(st[i].getFaculty().equalsIgnoreCase(fac) &&
                                        st[i].getCourse() == course) {
                                    System.out.println(st[i].toString());
                                }
                            }
                        } catch (InputMismatchException e) {
                            System.err.println("Ne pravilny vvod" + e);
                        }
                    }
                    if(n == 3) {
                        int year = sc.nextInt();
                        for (int i = 0; i < st.length; i++) {
                            if(st[i].getYear() == year) {
                                System.out.println(st[i].toString());
                            }
                        }
                    }
                    if(n == 4) {
                        for (int i = 0; i < st.length; i++) {
                            System.out.println(st[i].toString());
                        }
                    }
                    if(n == 5) {
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Esep tipy durys zhazulmady");
                }
            }
        } catch (NegativeArraySizeException e){
            System.out.println("Your number negative" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Massiv tolyp ketty" + e);
        }
        finally {
            System.out.println("The end!!");
        }
    }
}