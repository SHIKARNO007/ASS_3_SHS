public class Main {
    public static void main(String[] args) {
        EndDevice laptop = new VideoCard(new SSD(new Laptop()));
        EndDevice computer= new SSD(new RAM(new Computer()));
        System.out.println(laptop.component());
        System.out.println(computer.component());
    }
}
