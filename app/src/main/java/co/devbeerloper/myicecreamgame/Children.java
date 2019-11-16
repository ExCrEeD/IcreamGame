package co.devbeerloper.myicecreamgame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Children {
    public static final float INIT_X =2000;
    public static final float INIT_Y =850;
    public static final int SPRITE_SIZE_WIDTH =250;
    public static final int SPRITE_SIZE_HEIGTH=250;
    public static final float GRAVITY_FORCE=10;
    private final int MIN_SPEED = 1;
    private final int MAX_SPEED = 20;

    private float maxY;
    private float maxX;

    private float speed = 0;
    private float positionX;
    private float positionY;
    private Bitmap spriteChildren;
    private boolean isJumping;


    public Children (Context context, float screenWidth, float screenHeigth){

        speed = 1;
        positionX = this.INIT_X;
        positionY = this.INIT_Y;
        isJumping = false;
        //Getting bitmap from resource
        Bitmap originalBitmap= BitmapFactory.decodeResource(context.getResources(), R.drawable.kid);
        spriteChildren  = Bitmap.createScaledBitmap(originalBitmap, SPRITE_SIZE_WIDTH, SPRITE_SIZE_HEIGTH, false);

        this.maxX = screenWidth - (spriteChildren.getWidth()/2);
        this.maxY = screenHeigth - spriteChildren.getHeight();
    }

    public Children (Context context, float initialX, float initialY, float screenWidth, float screenHeigth){

        speed = 1;
        positionX = initialX;
        positionY = initialY;

        Bitmap originalBitmap= BitmapFactory.decodeResource(context.getResources(), R.drawable.kid);
        spriteChildren  = Bitmap.createScaledBitmap(originalBitmap, SPRITE_SIZE_WIDTH, SPRITE_SIZE_HEIGTH, false);

        this.maxX = screenWidth - (spriteChildren.getWidth()/2);
        this.maxY = screenHeigth - spriteChildren.getHeight();

    }

    public static float getInitX() {
        return INIT_X;
    }

    public static float getInitY() {
        return INIT_Y;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getPositionX() {
        return positionX;
    }

    public void setPositionX(float positionX) {
        this.positionX = positionX;
    }

    public float getPositionY() {
        return positionY;
    }

    public void setPositionY(float positionY) {
        this.positionY = positionY;
    }

    public Bitmap getSpriteChildren() {
        return spriteChildren;
    }

    public void setSpriteChildren(Bitmap spriteChildren) {
        this.spriteChildren = spriteChildren;
    }


    /**
     * Control the position and behaviour of the icecream car
     */
    public void updateInfo () {

       /* if (isJumping) {
            speed += 5;
        } else {
            speed -= 5;
        }

        if (speed > MAX_SPEED) {
            speed = MAX_SPEED;
        }
        if (speed < MIN_SPEED) {
            speed = MIN_SPEED;
        }
        this.positionY -= speed - GRAVITY_FORCE;

        if (positionY < 0) {
            positionY = 0;
        }
        if (positionY > maxY) {
            positionY = maxY;
        }*/
       positionX -=5;
       if(positionX<=0)
       {
           positionX = getInitX();
       }
    }
}
