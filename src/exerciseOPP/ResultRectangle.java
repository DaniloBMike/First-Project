package exerciseOPP;

public class ResultRectangle {
    public static void main(String[] args) {

        Rectangle resultRectangle = new Rectangle();

        resultRectangle.nameId = " firstRectangle ";
        resultRectangle.width = 50.50;
        resultRectangle.height = 35.35;


        Rectangle resultRectangle2 = new Rectangle();

        resultRectangle2.nameId = " secondRectangle ";
        resultRectangle2.width = 20.55;
        resultRectangle2.height = 70.80;


        resultRectangle.describe();
        resultRectangle2.describe();
    }
}
