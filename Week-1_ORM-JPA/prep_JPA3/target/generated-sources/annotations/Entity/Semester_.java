package Entity;

import Entity.Student;
import Entity.Teacher;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-24T22:45:54")
@StaticMetamodel(Semester.class)
public class Semester_ { 

    public static volatile SingularAttribute<Semester, String> name;
    public static volatile SingularAttribute<Semester, String> description;
    public static volatile CollectionAttribute<Semester, Student> studentCollection;
    public static volatile SingularAttribute<Semester, Long> id;
    public static volatile CollectionAttribute<Semester, Teacher> teacherCollection;

}