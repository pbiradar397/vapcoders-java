package oops;

public class Mobile {
    public String battery;
    public String simSlot;
    public long imei;
    public String model;
    public String memory;
    public String screenSize;
    public int price;
    public String camera;

    public String getModel() {
        System.out.println("Model: "+model);
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMemory() {
        System.out.println("Memory:"+memory);
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getScreenSize() {
        System.out.println("Screen Size: "+screenSize);
        return screenSize;

    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public int getPrice() {
        System.out.println("Price: "+price);
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCamera() {
        System.out.println("Camera Quality: "+camera);
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public Mobile(String battery, String simSlot, long imei) {
        this.battery = battery;
        this.simSlot = simSlot;
        this.imei = imei;
        System.out.println("Mobile specifications: \nBattery: "+this.battery+"\nSim Capacity:"+this.simSlot+"\nIMEI:"+this.imei);
    }


}
