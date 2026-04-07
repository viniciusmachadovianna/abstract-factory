public class GymFactoryProducer {
    public static AbstractGymFactory getFactory(String gymLevel) {
        switch (gymLevel.toLowerCase()) {
            case "basic":
                return new BasicGymFactory();
            case "premium":
                return new PremiumGymFactory();
            default:
                throw new IllegalArgumentException("Unknown gym factory level: " + gymLevel);
        }
    }
}
