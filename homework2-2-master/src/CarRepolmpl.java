public class CarRepolmpl implements CarRepo {
    @Override
    public void newSound(Car car) {
        System.out.println(car.getNewSound());
    }
}
