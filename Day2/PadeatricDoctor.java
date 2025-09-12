public class PadeatricDoctor extends Doctor{
    int experience;
    public PadeatricDoctor(String name, int experience) {
        super(name);//This will reference parent class
        this.experience = experience;// This reference to current class
    }

    @Override
    public String toString() {
        return "Name="+ super.getName() + ", Experience=" + experience;
    }
}