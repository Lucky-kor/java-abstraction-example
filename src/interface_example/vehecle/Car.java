package interface_example.vehecle;

public class Car implements Veheicle{
    private int speed = 0;

    public int getSpeed() {
        return speed;
    }

    @Override
    public void start() {
        System.out.println("자동차에 탑승하고 시동을 겁니다 부릉부릉");
    }

    @Override
    public void stop() {
        System.out.println("차에서 시동을 끄고 하차합니다.");
    }

    @Override
    public void accelerate(int speed) {
        this.speed += (speed * 2);
        System.out.printf("자동차의 현재 속도는 %d입니다.%n", this.speed);
    }

    @Override
    public void decelerate(int speed) {
        this.speed -= speed;
        System.out.printf("자동차의 현재 속도는 %d입니다.%n", this.speed);
    }

    @Override
    public void turn(String direction) {
        System.out.printf("자동차의 방향을 %s로 변경합니다.%n", direction);
    }
}
