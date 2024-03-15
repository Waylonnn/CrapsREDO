public class Dice {
    int max = 6;
    int min = 1;
    int range = max - min + 1;


    private int num = 0;
    public Dice(){
        roll();
    }
    public void roll(){
        num = (int)(Math.random() * range) + min;
    }
    public int getRoll(){
        return num;
    }


}
