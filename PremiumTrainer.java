public class PremiumTrainer implements Trainer {
    @Override
    public void trainMember(String memberName) {
        System.out.println("Premium trainer provides advanced coaching to " + memberName + ".");
    }

    @Override
    public String getTrainerType() {
        return "Premium Trainer";
    }
}
