import java.sql.SQLOutput;

class Tv1_1{
    // 속성 : 변수 선언
    String color;
    boolean power = false;
    int channel = 1;

    // 기능 : 메소드 선언
    void power(){
        power = !power;
        if (power) {
            System.out.println("전원 ON");
        } else {
            System.out.println("전원 OFF");
        }
    }

    void channelUp(){
        channel++;
        System.out.println("채널 증가");
    }

    void channelDown(){
        channel--;
        System.out.println("채널 감소");
    }
}

class Tv1_1Main {
    public static void main(String[] args){
        Tv1_1 t1 = new Tv1_1(); // TV1 인스턴스
        t1.color = "검정색";
        Tv1_1 t2 = new Tv1_1(); // TV2 인스턴스
        t2.color = "흰색";

        System.out.println("TV1 인스턴스 색깔 = " + t1.color);
        System.out.println("TV2 인스턴스 색깔 = " + t2.color);

        t1.power(); // 매서드 호출
        System.out.println("TV1 인스턴스 채널 = " + t1.channel);

        t1.channelUp(); // 매서드 호출
        System.out.println("TV1 인스턴스 채널 = " + t1.channel);
        t1.channelDown(); // 매서드 호출
        System.out.println("TV1 인스턴스 채널 = " + t1.channel);

        t1.power(); // 매서드 호출

        t2 = t1; // TV2 인스턴스 참조변수에 TV1 인스턴스의 주소 저장 했을 때

        System.out.println("TV1 인스턴스 색깔 = " + t1.color);
        System.out.println("TV2 인스턴스 색깔 = " + t2.color);

        // TV2인스턴스의 색이 흰색에서 검정색으로 바뀐게 아니라
        // t2의 인스턴스 주소값이 사라지고, t1주소값이 들어가버림
        // 더이상 t2로 TV2인스턴스에 접근 불가능
    }
}




class Tv1_2 {
    // 속성 : 변수 선언
    String color;
    boolean power = false;
    int channel = 1;
    String brand; // 브랜드 이름 추가

    // 기능 : 메서드 선언
    void power() {
        power = !power;
        if (power) {
            System.out.println("전원 ON");
        }
    }

    void channelUp() {
        channel++;
        System.out.println("채널 증가");
    }

    void channelDown() {
        channel--;
        System.out.println("채널 감소");
    }
}

class Tv1_2Main{
    public static void main(String[] args){
        Tv1_2[] tvArr = new Tv1_2[3];

        tvArr[0] = new Tv1_2();
        tvArr[1] = new Tv1_2();
        tvArr[2] = new Tv1_2();

        tvArr[0].color = "보라색";
        tvArr[1].color = "주황색";
        tvArr[2].color = "핑크색";

        for (int i=0; i<tvArr.length; i++){
            System.out.println(i + 1 + "번째 Tv인스턴스 색깔: " + tvArr[i].color);
        }

        for (int i=0; i<tvArr.length; i++){
            System.out.print(i + 1 + "번째 Tv인스턴스 ");
            tvArr[i].power();
        }
        System.out.println();

        for (int i=0; i<tvArr.length; i++){
            System.out.print(i + 1 + "번째 Tv인스턴스의 브랜드 명: ");
            System.out.println(tvArr[i].brand);
        }
        System.out.println();

        // 새로운 참조변수(ex samsung, lg..) 에 배열 안에 들어있는 객체의 주소값을 배정
        Tv1_2 samsung = tvArr[0];
        Tv1_2 lg = tvArr[1];
        Tv1_2 apple = tvArr[2];

        samsung.brand = "samsung";
        lg.brand = "lg";
        apple.brand = "apple";

        for (int i=0; i<tvArr.length; i++){
            System.out.print(i + 1 + "번째 Tv인스턴스의 브랜드 명: ");
            System.out.println(tvArr[i].brand);
        }

        System.out.println(samsung.brand);
    }
}




class Time3_1 {
    int hour;
    int minute;
    int second;
}

class Time3_1Main{
    public static void main(String[] args){
        // 총 3명의 시간을 객체로 관리 (클래스 안쓰면 냅따 변수 다 지정해야함..)
        Time3_1 t1 = new Time3_1();
        Time3_1 t2 = new Time3_1();
        Time3_1 t3 = new Time3_1();

        // 총 3명의 시간을 객체'배열'로 관리
        Time3_1[] timeArr = new Time3_1[3];
        timeArr[0] = new Time3_1();
        timeArr[1] = new Time3_1();
        timeArr[2] = new Time3_1();
    }
}



class Obj4_1{
    int iv;
    static int cv;

    void method(){
        int lv;
        //System.out.println("lv는 지역 변수(초기화전) = " + lv); // 초기화 안하면 에러
        lv = 30;
        // 지역변수 (매서드 영역의 변수)는 자동으로 초기화 되지 않기 때문에 반드시 초기화 해줘야 함.
        System.out.println("lv는 지역 변수 = " + lv);
    }
}

class Obj4_1Main{
    public static void main(String[] args){

        System.out.println("ObjVar.cv 클래스 변수(초기화전) = " + Obj4_1.cv);
        Obj4_1.cv = 10;
        System.out.println("ObjVar.cv 클래스 변수 = " + Obj4_1.cv);

        Obj4_1 objVar = new Obj4_1();
        System.out.println("objVar.iv 인스턴스 변수(초기화전) = " + objVar.iv);
        objVar.iv = 20;
        System.out.println("objVar.iv 인스턴스 변수 = " + objVar.iv);

        objVar.method();
    }
}




class Method5_1{
    int add(int x, int y) {
        int result = x + y;
        return result;
    }
}

class Method5_1Main{
    public static void main(String[] args){
        Method5_1 method = new Method5_1();

        int result = method.add(3,5);
        System.out.println(result);
    }
}




class Method5_2{
    void gugudan(int dan){
        if (!(dan>=2 && dan<=9)){
            System.out.println(dan + "단은 없습니다.");
            return;
        }
        System.out.println(dan + "단 시작!");
        for(int i=1; i<10; i++){
            System.out.println(dan + "*" + i + "=" + dan*i);
        }
        System.out.println();
    }

    boolean checkMax(int x, int y){
        if(x>y){
            return true;
        }
        else
            return false;
    }
}

class Method5_2Main{
    public static void main(String[] args){
        Method5_2 method = new Method5_2();

        method.gugudan(2);
        method.gugudan(5);
        method.gugudan(10);
        method.gugudan(9);

        System.out.println("method.checkMax(10, 8) = " + method.checkMax(10, 8));
        System.out.println("method.checkMax(5, 9) = " + method.checkMax(5, 9));
    }
}




class Time5_1 {
    int hour;
    int minute;
    int second;
}

class Method5_3{
    static void initObj(Time5_1 time, int hour, int minute, int second){
        time.hour = hour;
        time.minute = minute;
        time.second = second;
    }
}

class Mehtod5_3Main{
    public static void main(String[] args){
        Time5_1 t1 = new Time5_1();
        Time5_1 t2 = new Time5_1();
        Time5_1 t3 = new Time5_1();

        Method5_3.initObj(t1,100,20,43);
        Method5_3.initObj(t2,22,30,23);
        Method5_3.initObj(t3,45,40,52);

        System.out.println(t1.hour +" "+ t1.minute +" "+ t1.second);
    }
}




class Callstack5_1{
    static void firstMethod(){
        System.out.println("firstMethod()");
        second
    }
}
