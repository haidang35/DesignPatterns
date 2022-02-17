package flyweight_pattern.gameapp;

public class Soldier  implements ISoldier{
    private final String name;

    public Soldier(String name) {
        this.name = name;
        System.out.println("Soldier is created! - " + name);
    }

    @Override
    public void promote(Context context) {
        System.out.println(name + " " + context.getId() + " promoted " + context.getStar());
    }
}
