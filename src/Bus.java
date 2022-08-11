public class Bus extends PublicTransportation{
    //버스 정보
    public Bus(int busNum) {
        super.startOperation("운행");
        super.num = busNum;
        super.maxPassenger = 30;
        super.price = 1000;
        super.currentPassenger = 0;
    }

    // 버스 번호 확인
    public void checkBusNumber () {
        System.out.println("이 버스의 번호는 " + num + "번 입니다.");
    }

    public void changeState(String state) {
        super.state = state;
        System.out.println("버스 상태 = " + state);
    }

    @Override
    public void boardingPassenger(int newPassenger, String destination, int distanceDestination) {

    }
}
