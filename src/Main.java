public class Main {
    public static void main(String[] args) {
        // 버스 2대 생성
        Bus busA = new Bus(1234);
        Bus busB = new Bus(3456);

        //버스 번호 확인
        busA.checkBusNumber();
        busB.checkBusNumber();

        // 승객 + 2
        busA.busBoardingPassenger(2);

        // 주유량 -50
        busA.busSetFuelVolume(-50);

        //버스 상태 변경
        busA.changeState("차고지행");

        // 주유량 +10
        busA.busSetFuelVolume(10);

        // 승객 +45
        busA.busBoardingPassenger(45);

        // 승객 +5
        busA.busBoardingPassenger(5);

        // 주유량 -55
        busA.busSetFuelVolume(-55);
        busA.changeState("차고지행");

        //택시 2대 생성
        Taxi taxiA = new Taxi(2345);
        Taxi taxiB = new Taxi(5678);

        // 택시 번호 확인
        taxiA.checkTaxi();
        taxiB.checkTaxi();

        // 택시 승객 탑승
        taxiA.taxiBoardingPassenger(2,"서울역",2);

        //택시 주유량 변경
        taxiA.taxiSetFuelVolume(-80);

        //요금 결제
        taxiA.payment();

        //택시 승객 +5
        taxiA.taxiBoardingPassenger(5,"서울역",2);

        // 택시 승객 +3
        taxiA.taxiBoardingPassenger(3,"구로디지털단지역",12);

        //택시 주유량 변경
        taxiA.taxiSetFuelVolume(-20);
    }
}
