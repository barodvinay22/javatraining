public class PadeatricDoctor extends Doctor{
    int experience;
    public PadeatricDoctor(String name, int experience) {
        super(name);//
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Name="+ super.getName() + ", Experience=" + experience;
    }
}