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
        secondMethod();
    }

    static void secondMethod(){
        System.out.println("secondMethod()");
        thirdMethod();
    }

    static void thirdMethod(){
        System.out.println("thirdMethod()");
        finalMethod();
    }

    static void finalMethod(){
        System.out.println("finalMethod()");
    }

    public static void main(String[] args){
        firstMethod();
    }
}


class CallStack5_2 {

    static void firstMethod() {
        secondMethod();
        System.out.println("firstMethod()");
    }

    static void secondMethod() {
        thirdMethod();
        System.out.println("secondMethod()");
    }

    static void thirdMethod() {
        finalMethod();
        System.out.println("thirdMethod()");
    }

    static void finalMethod(){
        System.out.println("finalMethod()");
    }

    public static void main(String[] args) {
        firstMethod();
    }
}




class Data6_1{
    int x;
    int y;
}

class Data6_1Main{
    public static void main(String[] args){

        Data6_1 data = new Data6_1();
        data.x = 10;
        data.y = 20;

        System.out.println("Data6_1 클래스로 만든 data 인스턴스의 인스턴스 변수 x,y값 확인");
        System.out.println("data 인스턴스 변수 x = " + data.x);
        System.out.println("data 인스턴스 변수 y = " + data.y);
        System.out.println();

        changeParameter(data.x, data.y);
        System.out.println("Data6_1 클래스로 만든 data 인스턴스의 인스턴스 변수의 값이 변경되었는지 확인");
        System.out.println("changeParameter 메서드 수행 후 data 인스턴스 변수 x = " + data.x);
        System.out.println("changeParameter 메서드 수행 후 data 인스턴스 변수 y = " + data.y);

        data.x = 999;
        System.out.println(data.x);
    }

    static void changeParameter(int x, int y){
        System.out.println();
        System.out.println("changeParameter 메서드 시작");
        System.out.println("입력 받은 매개변수 x와 y의 값 확인");
        System.out.println("입력 받은 매개변수 x = " + x);
        System.out.println("입력 받은 매개변수 y = " + y);

        System.out.println();
        System.out.println("입력 받은 매개변수 x와 y의 값을 변경 한 후 확인");
        x = 100;
        y = 200;
        System.out.println("변경 한 후 x = " + x);
        System.out.println("변경 한 후 y = " + y);
        System.out.println("changeParameter 메서드 끝");
    }
}


class Data6_2{
    Data6_3 data2 = new Data6_3();  // 참조형
}

class Data6_3{
    int x;
    int y;
}

class Data6_2Main{
    public static void main(String[] args){

        Data6_2 data = new Data6_2();
        data.data2.x = 10;
        data.data2.y = 20;

        System.out.println("Data6_2 클래스로 만든 data 인스턴스의 data2인스턴스의 인스턴스 변수 값 확인");
        System.out.println("참조변수 data2의 인스턴스 변수 x = " + data.data2.x);
        System.out.println("참조변수 data2의 인스턴스 변수 y = " + data.data2.y);

        System.out.println("입력받은 매개변수의 값을 바꾸는 메서드 수행");
        changeParameter(data.data2);
        System.out.println();

        System.out.println("Data6_3 클래스로 만든 data 인스턴스의 참조변수 data2의 인스턴스 변수 값이 변경되었는지 확인");
        System.out.println("changeParameter 메서드 수행 후 data2의 인스턴스 변수 x = " + data.data2.x);
        System.out.println("changeParameter 메서드 수행 후 data2의 인스턴스 변수 y = " + data.data2.y);


    }

    static void changeParameter(Data6_3 data2){
        System.out.println();
        System.out.println("changeParameter 메서드 시작");
        System.out.println("입력 받은 매개변수 data2의 인스턴스 x와 y의 값 확인");
        System.out.println("입력 받은 매개변수 data2의 인스턴스 x = " + data2.x);
        System.out.println("입력 받은 매개변수 data2의 인스턴스 y = " + data2.y);

        System.out.println();
        System.out.println("입력 받은 매개변수 data2의 인스턴스 x와 y의 값을 변경한 후 확인");
        data2.x = 100;
        data2.y = 200;
        System.out.println("변경 한 후 data2의 인스턴스 x = " + data2.x);
        System.out.println("변경 한 후 data2의 인스턴스 y = " + data2.y);
        System.out.println("changeParameter 메서드 끝");
    }
}



class StaticMethod7_1{
    int num1, num2; // 인스턴스 변수

    //static int num1, num2; // 클래스 변수

    static int add(int num1, int num2){
        System.out.println();
        System.out.println("매개변수로 입력 받은 num1, num2 확인");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("num1 + num2 = " + (num1 + num2));

        // 클래스변수(static) 활용해보기
        //System.out.println("시험" + StaticMethod7_1.num1);

        return (num1 + num2);
    }
}

class StaticMethod7_1Main{
    public static void main(String[] args){
        StaticMethod7_1 methodTest = new StaticMethod7_1(); // methodTest라는 객체 생성
        methodTest.num1 = 30;
        methodTest.num2 = 40;

        // add는 static 함수이기 때문에 객체로 생성된 참조변수로는 접근할 수 없음
        // methodTest.add(methodTest.num1, methodTest.num2);

        StaticMethod7_1.add(methodTest.num1, methodTest.num2);
        // 클래스이름.메서드이름() 방식으로 static 메서드 호출하여야 함.
    }
}





class InstMethod7_1{
    int num1, num2; //인스턴스 변수 선언
    static int num3 = 100; //클래스 변수 선언

    int add(int num1, int num2){
        System.out.println();
        System.out.println("매개변수로 입력 받은 num1, num2 확인");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("this.num1 = " + this.num1);
        System.out.println("매개변수 이자 지역변수 num1 = " + num1);

        return num1 + num2;
    }
}

class InstMethod7_1Main{
    public static void main(String[] args){
        InstMethod7_1 methodTest = new InstMethod7_1(); // 객체 생성
        methodTest.num1 = 10;
        methodTest.num2 = 20;

        System.out.println("result : " + methodTest.add(methodTest.num1, methodTest.num2));
        System.out.println("result : " + methodTest.add(80,90));
    }
}




class Overloading8_1{
    int add(int a, int b){
        System.out.println("int add(int a, int b)");
        return a+b;
    }

    long add(long a, long b){
        System.out.println("long add(long a, long b)");
        return a+b;
    }

    long add(long a, int b){
        System.out.println("long add(long a, int b)");
        return a+b;
    }

    long add(int a, long b){
        System.out.println("long add(int a, long b)");
        return a+b;
    }
}

class Overloading8_1Main{
    public static void main(String[] args){
        Overloading8_1 test = new Overloading8_1();
        System.out.println(test.add(10,20));
        System.out.println(test.add(13L, 17L));
        System.out.println(test.add(5L, 10));
        System.out.println(test.add(12,23L));

        System.out.println();
    }
}





class Tv9_1{
    boolean power;
    int channel;
    String color;
    long price;

    public Tv9_1(){ // 초기값이 필요한 값들을 초기화 해주는 기본 생성자
        power = false;
        channel = 1;
    }

    //오버로딩 한 생성자 - 매장 진열 용. 가격과 색깔의 초기화가 필요합니다. this는 매개변수와 인스턴스변수를 구분하기 위해 사용
    public Tv9_1(String color, long price){
        power = false;
        // this.power, power 둘다 지금 상황에서는 인스턴스 변수를 명확하게 판단 할 수 있기 때문에 어떤걸 사용해도 상관 없습니다.
        channel = 1;
        this.color = color;
        this.price = price;
    }

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

class Tv9_1Main{
    public static void main(String[] args){
        Tv9_1 tv = new Tv9_1(); // 기본 초기화된 TV9_1 생성
        System.out.println("기본 생성자 TV: ");
        tv.power();

        Tv9_1 exTv = new Tv9_1("보라색", 3456789); // 진열 용 Tv9_1 생성
        System.out.println("오버로딩 생성자 TV: ");
        exTv.power();
        System.out.println("exTv.color = " + exTv.color);
        System.out.println("exTv.price = " + exTv.price);
    }
}




class Tv10_1{
    // 속성 : 변수 선언
    boolean power;
    int channel;
    String color;
    long price;

    public Tv10_1(){ // 기본 생성자. 필수 내용 초기화
        this.power = false;
        this.channel = 1;
    }

    public Tv10_1(String color, long price){
//        this.power = false;
//        this.channel = 1;
        this();
        this.color = color;
        this.price = price;
    }

    void power() {
        this.power = !power;
        if(this.power){
            System.out.println("전원 ON");
        } else {
            System.out.println("전원 OFF");
        }
    }

    void channelUp() {
        this.channel++;
        System.out.println("채널 증가");
    }

    void channelDown() {
        this.channel--;
        System.out.println("채널 감소");
    }

    // 색깔을 수정하고 자기 자신을 반환하는 메서드
    Tv10_1 changeColor(String color){ // 반환타입이 자기 자신
        this.color = color;
        System.out.println("색깔 변경 완료!");
        return this; // this는 자기 자신을 가리키는 참조변수!
    }
}

class Tv10_1Main{
    public static void main(String[] args){
        // 기본 초기화된 Tv10_1 생성
        Tv10_1 tv = new Tv10_1();
        System.out.println("기본 생성자 Tv10_1: ");
        tv.power();

        Tv10_1 exTv = new Tv10_1("보라색", 3456789);
        System.out.println("오버로딩 생성자 Tv10_1: ");
        exTv.power();
        System.out.println("exTv.color = " + exTv.color);
        System.out.println("exTv.price = " + exTv.price);
        System.out.println();

        Tv10_1 exTvThis = exTv.changeColor("파란색");
        System.out.println("색깔이 변경되었는지 확인 exTvThis.color : " + exTvThis.color);
        System.out.println("exTv.color = " + exTv.color);
    }
}





