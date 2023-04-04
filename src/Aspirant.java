public class Aspirant extends Student{
    public Aspirant(String firstName, String lastName, String group, int averageMark) {
        super(firstName,lastName,group,averageMark);
    }

    @Override
    public String toString() {
        return "Aspirant{}"+super.toString();
    }

    @Override
    public int getScholArship() {
        if (5<=getAverageMark()){
            return 2500;
        }else {
            return 2200;
        }

    }
}
