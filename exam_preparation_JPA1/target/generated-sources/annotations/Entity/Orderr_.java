package Entity;

import Entity.Customer;
import Entity.OrderLine;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-24T16:15:45")
@StaticMetamodel(Orderr.class)
public class Orderr_ { 

    public static volatile ListAttribute<Orderr, OrderLine> orderLines;
    public static volatile SingularAttribute<Orderr, Long> id;
    public static volatile SingularAttribute<Orderr, Customer> customer;

}