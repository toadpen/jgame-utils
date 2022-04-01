# jgame-utils
A java utility library for games.

## Note
I tried to make it easy to use and expandable, you can add more attributes to your item objects with no problem (i think).
You can also add to really anything and expand and add more functions as you please.

There are currently 3 classes.
- Files (for reading and writing to files easily)
- Inventory (for creating an inventory)
- Item (for creating a new item that can be put into an inventory)

## Game Related
### To create an item
To create an item create a new instance of the Item class and give it a name and ID. You can easily add more attributes if you want.

### To Create an inventory
To create an inventory create a new instance of the inventory class and give the imventory a length. You can also add more attributes to the Inventory as you please.

### To put an item into an inventory
To put an item into an inventory or to swap an item out of a slot and replace it you call 

- swapItem(int pos, Item item);
- 
Input the position of the item you want to change and the item object you want to replace it with.

### To get all items in an inventory
To get all items in an inventory use
- getInventoryNames();
or
- getInventoryIds();

They will return all item names and Ids as strings.

## General related
### To read a file
To read a file create a new Files object and call

- readFile(String fileSource)

input your file source as an argument and it will return the contents as a String.

### To write to a file
To write to a file create a new Files object and call

- writeFile(String fileSource, String data)

input your file source as an argument and your string data as an argument and it will write to a file.
It will return true if it has successfully wrote to a file, else it will return false and an exception will occur.
