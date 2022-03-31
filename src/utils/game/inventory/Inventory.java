package utils.game.inventory;

import utils.game.items.Item;

public class Inventory {

    public static Item[] items;

    public Inventory(int length)
    {
        items = new Item[length];
    }

    public void swapItem(int pos, Item item)
    {
        items[pos] = item;
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

    public String getInventoryIds()
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
