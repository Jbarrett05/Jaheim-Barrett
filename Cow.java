public class Cow {
    //creates instance variables for cow's name and image
    private String name;
    private String image;

    //sets name given to name
    public Cow (String name)
    {
        this.name = name;
    }

    //returns name
    public String getName()
    {
        return name;
    }

    //returns image
    public String getImage()
    {
        return image;
    }

    //sets image
    public void setImage (String _image)
    {
        this.image = _image;
    }

}

