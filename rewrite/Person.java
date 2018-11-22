
package vize.rewrite;

     /* author : Oguzhan Bayrak  */
        //name-surname-year of birth
public class Person implements Comparable <Person> {
    
        String name,surname;
        int yearOfBirth;

    public Person(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }
    public Person(){
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    @Override
     public String toString(){
        return "{"+"\nPerson name :"+getName().substring(0,3)+ " " +"\tSurname :"+ getSurname().toUpperCase() +"\t Date of Birth :"+(2016-getYearOfBirth())+"}" ; 

    }
    @Override
    public int compareTo(Person t) {
            int year = t.getYearOfBirth();
            return year-this.yearOfBirth;
            
    }
    
}
