
//Works off Real Picture class and is just the proxy
public class PictureProxy implements Picture
{
    private String pictureFileLocation;

    private Picture proxiedPicture;


    @Override
    public void showPicture()
    {
        proxiedPicture = new RealPicture(pictureFileLocation);
        proxiedPicture.showPicture();
    }

    public PictureProxy(String location)
    {
        this.pictureFileLocation = location;
    }
}
