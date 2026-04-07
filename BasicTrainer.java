public class BasicTrainer implements Trainer {
    @Override
    public void trainMember(String memberName) {
        System.out.println("Basic trainer helps " + memberName + " with foundational exercises.");
    }

    @Override
    public String getTrainerType() {
        return "Basic Trainer";
    }
}
