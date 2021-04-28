class Student{
String name;
String qualification;
int age;

void  displaydetails()
{
System.out.println( name+ " " +age+" "+qualification+"  ");
}
public static void main(String[] args){
Student pavitra = new Student();
pavitra. name = "Pavitra";
pavitra.qualification = "Btech";
pavitra.age = 24;


pavitra.displaydetails();

Student ranjitha = new Student();
ranjitha.name = "Ranjitha";
ranjitha.qualification = "Btech";
ranjitha.age = 25;

ranjitha. displaydetails();

Student harshita = new Student();
harshita.name = "Harshita";
harshita.qualification = "Be";
harshita.age = 24;

harshita.displaydetails();

}
}
