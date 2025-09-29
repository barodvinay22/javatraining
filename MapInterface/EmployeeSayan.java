import java.util.Objects;

//public class EmployeeSayan implements Comparable{
    public class EmployeeSayan {

        private int id;
        private String name;
        private int age;

    public EmployeeSayan(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeSayan that = (EmployeeSayan) o;
        return id == that.id && age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "EmployeeSayan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(Object o) {
//        return this.(new EmployeeSayan()) - o.(new EmployeeSayan());
//    }
}
