public class EmplyeeSayanDemo implements Comparable<EmplyeeSayanDemo>{
    private int empId;
    private String empName;
    private String empAddress;


    public EmplyeeSayanDemo(int id1) {
        this.empId = id1;
    }
    EmplyeeSayanDemo(int id1 , String name1){
        this.empId = id1;
        this.empName = name1;
    }
    EmplyeeSayanDemo(int id1 , String name1 , String address1){
        this.empId = id1;
        this.empName = name1;
        this.empAddress = address1;
    }
    public int getId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setId(int id1) {
        this.empId = id1;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    @Override
    public String toString() {
        return "EmplyeeSayanDemo{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }

    @Override
    public int compareTo(EmplyeeSayanDemo emplyeeSayanDemo) {
        return this.empId - emplyeeSayanDemo.empId;
    }
}

//this line indicates return this.empId - emplyeeSayanDemo.empId; 0 /-1 /1. It is comparing ids.
//if 0 then both empid are same
//if -1 then this.empId is greater
//if 1 then this.empId is lesser