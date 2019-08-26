package toys.entity.commodity;

import toys.entity.Country;
import toys.entity.User;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * Created by Michail on 6/7/2019.
 */
@MappedSuperclass
public abstract class Commodity {
    //int id;

    int price;
    String name;
    String description;
  //  Image image;
  @ManyToOne
  @JoinColumn(name="country_id")
  private Country country;
    String brand;





    public Commodity(int price, String name, String description,Country country,String brand) {
        this.price = price;
        this.name = name;
        this.description = description;
      //  this.producingCountry = producingCountry;
        this.brand = brand;
    }

    public Commodity() {
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public Image getImage() {
//        return image;
//    }
//
//    public void setImage(Image image) {
//        this.image = image;
//    }

/*    public String getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }*/

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Commodity{" +

                ", price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +


                ", brand='" + brand + '\'' +
                '}';
    }
}
