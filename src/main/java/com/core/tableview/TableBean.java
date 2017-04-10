/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.core.tableview;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * 
 * @author Gonzalo H. Mendoza
 * email: yogonza524@gmail.com
 * StackOverflow: http://stackoverflow.com/users/5079517/gonza
 */
@ManagedBean(name="tableBean")
@ViewScoped
public class TableBean {

    private List<Person> persons;

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
    
    @PostConstruct
    public void init(){
        persons = new ArrayList<>();
        
        persons.add(new Person("Gonzalo","Mendoza",29));
        persons.add(new Person("Lionel","Messi",29));
        persons.add(new Person("Javier","Mascherano",34));
        persons.add(new Person("Paolo","Maldini",39));
        persons.add(new Person("Thiery","Henry",30));
        persons.add(new Person("David","Beckham",38));
        persons.add(new Person("Samuel","Eto",31));
        persons.add(new Person("Luis","Suarez",32));
        persons.add(new Person("Albert","Kaka",31));
        persons.add(new Person("Andres","Iniesta",32));
        persons.add(new Person("Roberto","Carlos",36));
        persons.add(new Person("Gonzalo","Mendoza",29));
        persons.add(new Person("Lionel","Messi",29));
        persons.add(new Person("Javier","Mascherano",34));
        persons.add(new Person("Paolo","Maldini",39));
        persons.add(new Person("Thiery","Henry",30));
        persons.add(new Person("David","Beckham",38));
        persons.add(new Person("Samuel","Eto",31));
        persons.add(new Person("Luis","Suarez",32));
        persons.add(new Person("Albert","Kaka",31));
        persons.add(new Person("Andres","Iniesta",32));
        persons.add(new Person("Roberto","Carlos",36));
    }
    
    public class Person implements Serializable{
        private String name;
        private String lastName;
        private int age;

        public Person() {
        }

        public Person(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 89 * hash + Objects.hashCode(this.name);
            hash = 89 * hash + Objects.hashCode(this.lastName);
            hash = 89 * hash + this.age;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Person other = (Person) obj;
            if (!Objects.equals(this.name, other.name)) {
                return false;
            }
            if (!Objects.equals(this.lastName, other.lastName)) {
                return false;
            }
            return true;
        }
        
        
    }
}
