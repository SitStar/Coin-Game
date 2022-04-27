import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

public class RareCoin extends Coin {

    public static final int AMOUNT = 200;

    public RareCoin(int x, int y) {
        super(x, y, AMOUNT, "images/green-circle.png");
    }
}
