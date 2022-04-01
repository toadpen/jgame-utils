package utils.game.inventory;

import utils.game.items.Item;

public class Inventory {

    public Item[] items;
    // Use this array to add more attributes
    public Object[] attribs;

    public Inventory(int length, Object[] inattribs)
    {
        this.items = new Item[length];
        this.attribs = inattribs;
    }

    public void swapItem(int pos, Item item)
    {
        items[pos] = item;
    }

    public String getItemName(int pos)
    {
        return items[pos].name;
    }

    public String getItemID(int pos)
    {
        return Integer.toString(items[pos].id);
    }

    public String getInventoryNames()
    {
        String out = "";
        int i = 0;
        while (i < items.length)
        {
            String name = items[i].name;
            out = out.concat(name+"\n");
            i++;
        }
        return out;
    }

    public String getInventoryIDs()
    {
        String out = "";
        int i = 0;
        while (i < items.length)
        {
            int name = items[i].id;
            out = out.concat(name+"\n");
            i++;
        }
        return out;
    }


}
