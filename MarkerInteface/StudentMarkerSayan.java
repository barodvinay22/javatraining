//Marker interface is an interface that doen't have any methods inside them,
// they just instruct the compiler to do some special task
//Example Serializable , Clonable
//transient is used to not saved the value of the filed in the file
public class StudentMarkerSayan implements java.io.Serializable{
    private Integer rollNo; //nullable valus are allowed in Interger , int starts with zero.4\
// we don't know the inforation , hence Interger is used as Null is a valid value
    private String name;
    private transient String ssnNo;

    StudentMarkerSayan(Integer rollNo , String name ,String ssnNo){ //parametiarized constructor
        this.rollNo = rollNo;
        this.name = name;
        this.ssnNo = ssnNo;
    }

    @Override
    public String toString() {
        return "StudentMarkerSayan{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", ssnNo='" + ssnNo + '\'' +
                '}';
    }
}

