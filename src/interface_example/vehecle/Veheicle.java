package interface_example.vehecle;

public interface Veheicle {
    // 탈것에 올라타는
    void start();
    // 탈것에서 내려오는
    void stop();
    // 가속
    void accelerate(int speed);
    // 감속
    void decelerate(int speed);
    // 방향 전환
    void turn(String direction);
}
