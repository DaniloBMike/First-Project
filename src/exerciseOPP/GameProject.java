package exerciseOPP;

public class GameProject {

    String gameName;
    int characterQuantity;
    boolean openWorldGame;
    String characterName;
    boolean mmoRpg;
    int classificationAge;
    int developmentGameTime;
    String mainLanguage;
    String soundTrackMusic;
    String whichPlatform;
    boolean pixelGame;



    public void buildingGame () {

        System.out.println(" Game Name : " + gameName);
        System.out.println(" The Quantity of characters is : " + characterQuantity);
        System.out.println(" It is a open world game  ? " + openWorldGame);
        System.out.println(" Characters Name : " + characterName);
        System.out.println(" It is a MMO RPG ? : " + mmoRpg);
        System.out.println(" What is the classification age ? : " + classificationAge);
        System.out.println(" Development Game Time : " + developmentGameTime);
        System.out.println(" What is the main language to the game ? " + mainLanguage);
        System.out.println(" What is the sound track music to the game ? : " +  soundTrackMusic);
        System.out.println(" Which platform we can play the game ? " + whichPlatform);
        System.out.println(" It is a pixel game ? " + pixelGame );
    }
}