package a1708965.brunel.uk.ak.appv1;

public class Listing {
    private int ID;
    private String title;
    private String desc;
    private String catagory;
    private double price;
    //private Image image;
    public Listing(int id, String d,String t,String c, double p){
        this.ID = id;
        this.desc = d;
        this.title = t;
        this.catagory = c;
        this.price = p;
        //this.image = ;
    }

    public int getID() {
        return ID;
    }

    public double getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public String getTitle() {
        return title;
    }
    public String getCatagory() {
        return catagory;
    }

    /*
    public Image getImage() {
        return image;
    }*/
}
