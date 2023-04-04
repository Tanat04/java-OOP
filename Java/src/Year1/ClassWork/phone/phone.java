package Year1.ClassWork.phone;

public abstract class phone {

     private String modelName;
     private String color;
     private int storage;
     private int ram;

     public String getModelName() {
          return modelName;
     }

     public void setModelName(String modelName) {
          this.modelName = modelName;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public int getStorage() {
          return storage;
     }

     public void setStorage(int storage) {
          this.storage = storage;
     }

     public int getRam() {
          return ram;
     }

     public void setRam(int ram) {
          this.ram = ram;
     }
}
