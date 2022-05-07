package Manifacture;

public class Robot extends Model { // Наследование от абстрактного класса
    public final RobotType type = RobotType.Wide;
    public RobotColor color = RobotColor.BLACK;
    private Integer weight = 0;
    private Integer speed = 0;

    // Инкапсуляция поля weight
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    // Инкапсуляция поля speed
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Robot(Integer id, String name) {
        super(id, name);
    }

    public Robot(Integer id, String name, RobotColor color, Integer weight, Integer speed) {
        super(id, name);
        this.color = color;
        this.weight = weight;
        this.speed = speed;
    }

    @Override
    public String toString() { // Полиморфизм
        return String.format("Robot %s #%d: %s color", name, id, color);
    }
}
