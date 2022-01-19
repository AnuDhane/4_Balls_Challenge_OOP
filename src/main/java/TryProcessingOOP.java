import processing.core.PApplet;
public class TryProcessingOOP extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int speedOfBallOne = 1;
    int speedOfBallTwo = 2;
    int speedOfBallThree = 3;
    int speedOfBallFour = 4;

    Ball ballOne;
    Ball ballTwo;
    Ball ballThree;
    Ball ballFour;

    public static void main(String[] args) {

        PApplet.main("TryProcessingOOP", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ballOne = new Ball(DIAMETER, 0, HEIGHT / 5, speedOfBallOne);
        ballTwo = new Ball(DIAMETER, 0, 2 * HEIGHT / 5, speedOfBallTwo);
        ballThree = new Ball(DIAMETER, 0, 3 * HEIGHT / 5, speedOfBallThree);
        ballFour = new Ball(DIAMETER, 0, 4 * HEIGHT / 5, speedOfBallFour);
    }

    @Override
    public void draw() {
        drawCircle(ballOne);
        drawCircle(ballTwo);
        drawCircle(ballThree);
        drawCircle(ballFour);
    }

    private void drawCircle(Ball ball) {
        ellipse(ball.xLocation, ball.yLocation, ball.diameter, ball.diameter);
        ball.xLocation += ball.speed;
    }
}