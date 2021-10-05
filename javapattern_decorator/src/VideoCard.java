public class VideoCard extends DecoratorClass {

    public VideoCard(EndDevice endDevice) {
        super(endDevice);
    }

    @Override
    public String component() {
        return endDevice.component() + " add video card";
    }

}
