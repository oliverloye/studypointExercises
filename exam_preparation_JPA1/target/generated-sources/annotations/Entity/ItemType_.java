package Entity;

import Entity.OrderLine;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-24T16:15:45")
@StaticMetamodel(ItemType.class)
public class ItemType_ { 

    public static volatile ListAttribute<ItemType, OrderLine> orderLines;
    public static volatile SingularAttribute<ItemType, Double> price;
    public static volatile SingularAttribute<ItemType, String> name;
    public static volatile SingularAttribute<ItemType, String> description;
    public static volatile SingularAttribute<ItemType, Long> id;

}