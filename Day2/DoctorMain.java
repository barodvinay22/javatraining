public class DoctorMain {
    public static void main(String[] args) {
        Doctor doctor=new PadeatricDoctor("Nakul",10);//Reference is doctor and Object is New Padeatric
        System.out.println(doctor);
        doctor = new Doctor("john");
        System.out.println(doctor);
    }
}