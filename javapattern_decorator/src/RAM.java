public class RAM extends DecoratorClass {

    public RAM(EndDevice endDevice) {
        super(endDevice);
    }

    @Override
    public String component() {
        return endDevice.component() + " add RAM";
    }
}
