/*
8. For a programme (such as, BCSE), each Instructor has name and phone number. Each textbook
has a title, author name and publisher. Each course (that is, subject) has a course name, instructor and
text book.
• One can set the data for a textbook and view the same.
• One can view instructor information and set the information.
• One can set the course data and view the same.
Design and implement the classes.
*/

import java.util.Scanner;;

class Instructor{
    String name;
    String phone;
    void show_instrution_details(){
        System.out.println("instruction name :"+name);
        System.out.println("instrcution phone number:"+phone);
    }
    void get_intstruction_details( String  name , String phone){
        this.name = name;
        this.phone = phone;
    }
    Instructor( String  name , String phone){
        this.name = name;
        this.phone = phone;
    }
}
class Text_book{
    String title,author,publisher;
    Text_book(String title , String author , String  publisher){
         this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    void show_text_book(){
        System.out.println("text_book  title is :"+title);
        System.out.println("text  book author is :"+author);
        System.out.println("text_book_publisher_is"+publisher);
    }
    void get_text_book_data(String title , String author , String  publisher){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    
}
class course{
    String name;
    Text_book t;
    Instructor i;

    void set_course(String S , Text_book m , Instructor x){
        this.name = S;
        this.t = m;
        this.i = x;
    }
    void show_course_data(){
        System.out.println("course name is "+name);
        t.show_text_book();
        i.show_instrution_details();
    }
    void de(){
        System.out.println("jj");
    }
    course(String name,Text_book t , Instructor i){
        this.name = name;
        this.t= t;
        this.i = i;
    }

    
}
public class Problem_eight {
    public static void main(String[] args) {
        Text_book t1 = new Text_book("praloy","hello","llll");
        Instructor i1 =new Instructor("cch mam", "90514887");
        course c = new course("math",t1,i1);
        c.show_course_data();  
    }
    
}
