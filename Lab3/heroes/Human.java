package heroes;

public abstract class Human {

    protected String name;
    protected SkinColor colour;
    public double weight;

    public Human(String name, SkinColor colour, double weight){
        this.name = name;
        this.colour = colour;
        this.weight = weight;
    }


    public String getName() {
        return this.name;
    }
    public double getWeight() {
        return this.weight;
    }


    public abstract void doSomething();


    //Переопределенные методы Object

    @Override
    public String toString() {
        return "Существо с именем " + getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        return false;
    }

    @Override
    public int hashCode() {
        int result = 15;
        result = 15 * result + name.hashCode();
        return result;
    }


}
