package week1;

/**
 * Created by Theresa on 2/11/15.
 */
public class CreateConstructor {

    //attributes
    int width;
    int height;


    //constructor
    public CreateConstructor(int i, int j)
    {
        width = i;
        height = j;
    }

    public int getAreaofRectangle()
    {
        return width * height;
    }
}

