public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();

        System.out.println("\n--- Mudando o comportamento em tempo de execução ---");

        Duck model = new ModelDuck();
        model.display();
        model.performFly(); // inicialmente, não voa

        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly(); // agora voa com foguete

        model.setQuackBehavior(new Squeak());
        model.performQuack();
    }
}
