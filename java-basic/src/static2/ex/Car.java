package static2.ex;

public class Car {
    private String car_Name;
    private static int car_Num;

    public Car(String car_Name) {
        this.car_Name = car_Name;
        System.out.println("차량 구입, 이름 :" + car_Name);
        car_Num++;
    }

    static void showTotalCars() {
        System.out.println("구매한 차량 수 " + car_Num);
    }
}
