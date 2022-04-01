package utils.game.items;

public class Item {

    // You can add more attributes as you please.
    public String name;
    public int id;
    // Use this attribute array to add more attributes
    public Object[] attribs;

    public Item(String inname, int inid, Object[] inattribs)
    {
        this.name = inname;
        this.id = inid;
        this.attribs = inattribs;
    }

}
