
    //Marker interface is an interface that doen't have any methods inside them,
// they just instruct the compiler to do some special task
//Example Serializable , Clonable
//transient is used to not saved the value of the filed in the file
    public class User implements java.io.Serializable{
        private Integer id; //nullable valus are allowed in Interger , int starts with zero.4\
        // we don't know the inforation , hence Interger is used as Null is a valid value
        private String name;
        private String address;
        private transient String password;

        public User(Integer id, String name, String address, String password) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.password = password;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }


