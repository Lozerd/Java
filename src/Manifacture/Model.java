package Manifacture;

public abstract class Model {
    protected final Integer id;
    protected final String name;

    public Model(Integer id, String name){
        this.id = id;
        this.name = name;
    }

}
