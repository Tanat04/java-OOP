package Year1.TermProject;

public abstract class PlaceInformation {

    // Its final so that it cannot be alter.
    public final void PLACEINFO(){
        ownerName();
        getStories();
        getSize();
        getRooms();
        getKitchen();
        getBahtrooms();
    }

    public void ownerName(){
        System.out.println("The owner of this place is Mr.Tanat Arora");
    }

    public void getKitchen(){
        System.out.println("There's 1 kitchen.");
    }

    public abstract void getStories();
    public abstract void getSize();
    public abstract void getRooms();
    public abstract void getBahtrooms();

}
