package toys.entity.commodity;

import toys.entity.Country;
import toys.entity.Enum.Sex;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Michail on 6/7/2019.
 */
@Entity
public class Toys extends Commodity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int age;
    @Enumerated(EnumType.STRING)
    private Sex sex;

    @ManyToMany
    @JoinTable(name ="orders_toys",
            joinColumns = @JoinColumn(name="toys_id"),
            inverseJoinColumns = @JoinColumn(name = "orders_id"))
    private List<Toys> toys;



    public Toys() {
        }

    public Toys(int price, String name, String description, Country country, String brand, int age, Sex sex) {
        super(price, name, description,country, brand);
        this.age = age;
        this.sex = sex;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Toys{" +
                "id=" + id +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
