public class Taxi extends PublicTransportation{
    int totalPrice;

    public Taxi(int taxiNum) {
        super.startOperation = "일반";
        super.num = taxiNum; // Taxi 번호
        super.currentPassenger = 0; // 탑승 승객 수
        super.maxPassenger = 4; // 잔여 승객 수
        super.fuelVolume = 100; // 택시 주유량
    }

    public void taxiBoardingPassenger(int newPassenger, String destination, int distanceDestination) {
        super.currentPassenger = 0;
        super.price = 3000;
        super.maxPassenger = 4;
        super.state = "일반";
        if (state.equals("일반") && newPassenger <= maxPassenger) {
            super.currentPassenger += newPassenger;
            System.out.println("탑승 승객 = " + newPassenger);
            System.out.println("잔여 승객 = " + currentPassenger);
            System.out.println("기본 요금 확인 = " + price);
            System.out.println("목적지 = " + destination);
            System.out.println("목적지까지 거리 = " + distanceDestination + "km");
            super.state = "운행중";
            distanceMoneyPlus(distanceDestination);
            totalPrice = totalPrice + price;
            System.out.println("누적 요금 = " + totalPrice);
        } else {
            System.out.println("최대 승객 수 초과");
        }
    }

    // 택시 상태 출력
    public void checkTaxi () {
        System.out.println("이 택시의 번호는 " + num + "번 입니다.");
        System.out.println("주유량 = " + fuelVolume);
        System.out.println("상태 = " + startOperation);
    }

    @Override
    public void boardingPassenger(int newPassenger, String destination, int distanceDestination) {

        if (distanceDestination > 1) {
            distanceMoneyPlus(distanceDestination);
        }
    }

    // 거리당 요금 추가
    public int distanceMoneyPlus(int distanceDestination) {
        price = 3000 + (distanceDestination - 1) * 1000;
        System.out.println("지불할 금액 = " + price);
        System.out.println("상태 = " + state);
        return price;
    }

    // 요금 결제
    public void payment() {
        System.out.println("현재 금액은 " + getPrice() + "원 입니다.");
        this.currentPassenger = 0;
        super.state = "일반";
    }

    @Override
    public void changeState(String 운행) {
        super.changeState(운행);
        if (fuelVolume < 10) {
            this.state = "운행불가";
        }
    }


}
