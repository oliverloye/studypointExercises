package Entity;

import Entity.Orderr;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-24T16:15:45")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile ListAttribute<Customer, Orderr> orderrs;
    public static volatile SingularAttribute<Customer, String> Email;
    public static volatile SingularAttribute<Customer, String> name;
    public static volatile SingularAttribute<Customer, Long> id;

}