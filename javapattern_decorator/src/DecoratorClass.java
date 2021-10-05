public abstract class DecoratorClass implements EndDevice {
    EndDevice endDevice;

    public DecoratorClass(EndDevice endDevice){
        this.endDevice = endDevice;
    }

    public abstract String component();

}
