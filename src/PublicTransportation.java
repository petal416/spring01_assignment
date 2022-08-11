public abstract class PublicTransportation {
    protected String startOperation;
    int num; //번호
    int fuelVolume = 100; //주유랑
    int speed; //속도
    int maxPassenger; //최대 승객 수
    int currentPassenger; //현재 승객 수
    int price; // 요금
    String state; //상태


    // 운행 시작
    public void startOperation(String state) {
        this.state = state;
    }

    public abstract void boardingPassenger(int newPassenger, String destination, int distanceDestination);

    // 상태 변경
    public void changeState(String state) {
        this.state = state;
        System.out.println("버스 상태 = " + state);
    }

    // 승객 탑승 - 버스
    public void busBoardingPassenger(int newPassenger) {
        this.maxPassenger = 30;
        this.state = "운행";
        if (this.currentPassenger + newPassenger <= maxPassenger && state.equals("운행")) {
            this.currentPassenger += newPassenger;
            System.out.println("탑승 승객 = " + newPassenger);
            System.out.println("잔여 승객 = " + (maxPassenger - newPassenger));
            System.out.println("요금 확인 = " + price * newPassenger);
        } else {
            System.out.println("최대 승객 수를 초과하였습니다");
            currentPassenger = 0;
        }
    }

    // 버스 주유량 변경
    public void busSetFuelVolume(int setFuelVolume) {
        fuelVolume += setFuelVolume;
        System.out.println("주유량 = " + fuelVolume);
        if (fuelVolume < 10 ) {
            this.state = "차고지행";
            System.out.println(state);
            System.out.println("주유 필요!");
        }
    }

    // 택시 주유량 변경
    public void taxiSetFuelVolume(int setFuelVolume) {
        fuelVolume += setFuelVolume;
        System.out.println("주유량 = " + fuelVolume);
        if (fuelVolume == 0 ) {
            this.state = "운행 불가";
            System.out.println(state);
            System.out.println("주유 필요!");
        }
    }

    // 현재 금액
    public int getPrice() {
        return price;
    }

}