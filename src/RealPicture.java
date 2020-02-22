//Real picture class

public class RealPicture implements Picture
{
    @Override
    public void showPicture()
    {

    }

    public void openPicture(String pictureLocation)
    {

    }

    public RealPicture(String location)
    {
        openPicture(location);
    }
}

class Testers
{
    public static void main(String[] asdasdsad)
    {
        Picture anotherPicture = new PictureProxy("location2");

        anotherPicture.showPicture();

        Picture realPictureWithNoProxy = new RealPicture("location1");

        realPictureWithNoProxy.showPicture();
    }
}