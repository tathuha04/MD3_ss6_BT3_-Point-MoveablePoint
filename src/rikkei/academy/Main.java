package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------Point----------");
        Point point = new Point();
        System.out.println("Trước khi gán giá trị---> "+point);
        point.setXY(1,2);
        System.out.println("sau khi gán giá trị--->" + point);

        System.out.println("----------MoveablePoint---------");
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(1,2,1,2);
        System.out.println("vị trí x, y khi chưa thay đổi tốc độ : "+moveablePoint);
        moveablePoint.setSpeed(2,4);
        System.out.println("---->" + moveablePoint);
        System.out.println("sau khi thay đổi tốc độ---->"+ moveablePoint.move());

    }
}