package things;

public class Rocket extends Item {
    protected int height;
    protected int width;
    protected int depth;

    public Rocket(String name, int height, int width, int depth){
        super(name);
        this.height = height;
        this.width = width;
        this.depth = depth;
    }


}
