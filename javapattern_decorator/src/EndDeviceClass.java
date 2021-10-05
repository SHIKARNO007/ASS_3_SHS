public abstract class EndDeviceClass implements EndDevice {
    String component;

    @Override
    public String component() {
        return component;
    }
}
