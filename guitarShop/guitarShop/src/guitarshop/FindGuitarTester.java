package guitarshop;

public class FindGuitarTester {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", 0, "fender", "Stratocastor", "electric", "Alder", "Alder");

        Guitar guitar = inventory.search(whatErinLikes);
        if (guitar != null) {
            System.out.println("Erin, you might like this " +
                    guitar.getBuilder() + " " + guitar.getModel() + " " +
                    guitar.getType() + " guitar:\n   " +
                    guitar.getBackwood() + " back and sides,\n   " +
                    guitar.getTopwood() + " top.\nYou can have it for only $" +
                    guitar.getPrice() + "!");
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    public static void initializeInventory(Inventory inventory){
        //add guitars to the inventory
        GuitarSpec spec = new GuitarSpec(Builder.FENDER ,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER,"12-String");

        inventory.addGuitar("V00001",
                1499.99, spec);

        spec = new GuitarSpec(Builder.GIBSON,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER,"6-String");

        inventory.addGuitar("V00002",
                1199.99, spec);

        spec = new GuitarSpec(Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER,"12-String");

        inventory.addGuitar("V00003",
                1500.99,spec);

        spec = new GuitarSpec(Builder.GIBSON,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER,"6-String");

        inventory.addGuitar("V00004",
                1699.99,spec);

    }

}

}
