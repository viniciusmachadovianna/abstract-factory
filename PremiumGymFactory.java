public class PremiumGymFactory implements AbstractGymFactory {
    @Override
    public AbstractGym createGym() {
        return new PremiumGym();
    }

    @Override
    public Trainer createTrainer() {
        return new PremiumTrainer();
    }
}
