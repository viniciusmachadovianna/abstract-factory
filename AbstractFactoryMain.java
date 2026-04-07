public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractGymFactory basicFactory = GymFactoryProducer.getFactory("basic");
        AbstractGym basicGym = basicFactory.createGym();
        Trainer basicTrainer = basicFactory.createTrainer();

        System.out.println("Created: " + basicGym.getName() + " with " + basicTrainer.getTrainerType());
        basicGym.addMember("Marco");
        basicTrainer.trainMember("Marco");

        AbstractGymFactory premiumFactory = GymFactoryProducer.getFactory("premium");
        AbstractGym premiumGym = premiumFactory.createGym();
        Trainer premiumTrainer = premiumFactory.createTrainer();

        System.out.println("\nCreated: " + premiumGym.getName() + " with " + premiumTrainer.getTrainerType());
        premiumGym.addMember("Araujo");
        premiumTrainer.trainMember("Araujo");

        System.out.println("\nBasic Gym current members: " + basicGym.getCurrentMembers());
        System.out.println("Premium Gym current members: " + premiumGym.getCurrentMembers());
    }
