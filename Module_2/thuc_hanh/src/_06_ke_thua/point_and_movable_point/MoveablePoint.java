package _06_ke_thua.point_and_movable_point;

public class MoveablePoint extends Point{
    public float xSpeed = 0.0f;
    public float ySpeed = 0.0f;

    public MoveablePoint(){

    }

    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{this.getXSpeed(), this.getYSpeed()};
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString(){
        return "Điểm này có toạ độ (" + super.getX() + ", " + super.getY() + "), có tốc độ là (" + this.getXSpeed() + ", " + this.getYSpeed() + ").";
    }

    public MoveablePoint move(){
        setX(getX() + getXSpeed());
        setY(getY() + getYSpeed());
        return this;
    }
}
