package Projekt2;

public class Player {

    private String name;
    private String thePlayer;
    private Inventory inventory1;
    private int position;

    Gui gui;

    public Player(String name, int startRoom, Gui g) {

        this.gui = g;
        this.name = name;
        this.thePlayer = name;
        this.position = startRoom;
        this.inventory1 = new Inventory(6,g);

    }
    // rummets inventory
    public Inventory getInventory(){
        return this.inventory1;
    }
    public String toString (){
        return this.name + " is carrying " +this.inventory1;
    }

}
