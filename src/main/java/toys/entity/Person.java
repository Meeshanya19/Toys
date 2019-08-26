package toys.entity;

import javax.persistence.MappedSuperclass;

/**
 * Created by Michail on 6/7/2019.
 */
@MappedSuperclass
public abstract class Person {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
    private String name;
    private String pssword;
    private String email;

    public Person() {
    }

    public Person(String name, String pssword, String email) {
        this.name = name;
        this.pssword = pssword;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPssword() {
        return pssword;
    }

    public void setPssword(String pssword) {
        this.pssword = pssword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    @Override
    public String toString() {
        return  name.toString()
                 + email.toString() ;
    }
}
