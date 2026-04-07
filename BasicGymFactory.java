public class BasicGymFactory implements AbstractGymFactory {
    @Override
    public AbstractGym createGym() {
        return new BasicGym();
    }

    @Override
    public Trainer createTrainer() {
        return new BasicTrainer();
    }
}
