public class SSD extends DecoratorClass {
    public SSD(EndDevice endDevice) {
        super(endDevice);
    }

    @Override
    public String component() {
        return endDevice.component() + " add SSD";
    }
}
