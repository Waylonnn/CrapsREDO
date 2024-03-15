public class Dice {
    int max = 6;
    int min = 1;
    int range = max - min + 1;
    int roll = (int)(Math.random() * range) + min;

    private int num = 0;
    public Dice(){
        roll();
    }
    public void roll(){
        num = roll;
    }
    public int getRoll(){
        return num;
    }


}
