package exerciseOPP;

public class game {
    public static void main (String[]args ) {

        gameproject game = new gameproject();

        game.gameName = "Open Gate";
        game.characterQuantity = 5;
        game.openWorldGame = true;
        game.characterName = "Alice" + " " + "Danilo" + " " + "Enzo" + " " + "Cecilia" + " " + "Vanessa" ;
        game.mmoRpg = true;
        game.classificationAge = 14;
        game.developmentGameTime = 5;
        game.mainLanguage = "English";
        game.soundTrackMusic = "Techno and pixel";
        game.whichPlatform = "pc, ps5, and xbox ";



        game.buildingGame();

    }
}
