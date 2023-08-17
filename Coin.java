/*
 * Coins.java
 * Ingrid and Isabel Crant
 * Main currency of Jetpack Joyride. Barry collects them throughout his run and 600 coins can be used to buy a shield.
 */

import java.awt.*;
import java.awt.image.*;
import java.util.Random;

public class Coin extends Rectangle {
    private static BufferedImage coinSpriteImage = JetpackJoyridePanel.loadBuffImg("coinsprite.png");
    private static final int NUMSPRITES = 6;                                                                               // number of sprites in the image
    public static final int WIDTH = coinSpriteImage.getWidth()/6, HEIGHT = coinSpriteImage.getHeight(), GAP = WIDTH + 2;
    private static BufferedImage[] sprites = getSprites(coinSpriteImage, NUMSPRITES);
    private static final Random rand = new Random();

    private static boolean isRotating;  // for if the coin is rotating or not
    private int currentSprite, x, y;

    public Coin(int xx, int yy) {
        super(xx, yy, sprites[0].getWidth(), sprites[0].getHeight());
        x = xx;
        this.y = yy;
        currentSprite = rand.nextInt(NUMSPRITES);                     // chooses a random sprite out of the 6 sprites in the image
        isRotating = true;                                            // the coin is rotating
    }
