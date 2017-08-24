package Entity;

import Entity.DiscountType;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-23T12:07:13")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, Integer> quantity;
    public static volatile ListAttribute<Customer, DiscountType> DiscountTypes;
    public static volatile SingularAttribute<Customer, Double> priceItem;
    public static volatile SingularAttribute<Customer, Long> id;

}