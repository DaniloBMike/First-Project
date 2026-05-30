package exerciseOPP;

public class game2 {

    public static void main(String[] args) {

        gameproject game2 = new gameproject();

        game2.gameName = "Dead Cat";
        game2.characterQuantity = 7;
        game2.openWorldGame = false;
        game2.pixelGame = true;
        game2.characterName = "Nina" + ", " + "Tigrao" + ", " + "juarez" + ", " + "joelma" + ", " + "talice" + ", " + "joao" + ", " + "marcia";
        game2.classificationAge = 10;
        game2.developmentGameTime = 3;
        game2.mainLanguage = "English"  + ", " + "Portuguese" + ", " + "Japanese";
        game2.soundTrackMusic = "classicPiano" + ", " + "pixelsaberpunk";
        game2.whichPlatform = "pc" + ", " + "mobile";
        game2.mmoRpg = true;


        game2.buildingGame();

    }

}
