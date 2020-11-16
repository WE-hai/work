public class Cup {
    int height; //高度
    double V;   //容积
    String color;   //颜色

    public Cup() {
        height = 10;
        V = 100;
        color = "glass";
    }

    public Cup(int height) {
        this.height = height;
    }

    public Cup(double v) {
        V = v;
    }

    public Cup(int height, double V) {
        this.height = height;
        this.V = V;
    }
    public Cup(String color) {
        this.color = color;
    }

    public Cup(int height, double v, String color) {
        this.height = height;
        V = v;
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getV() {
        return V;
    }

    public void setV(double v) {
        V = v;
    }

    public void changeColor(String color) {
        this.color = color;
    }

    public void show() {
        System.out.println("杯子的高度："+height+"厘米");
        System.out.println("杯子的体积："+V+"毫升");
        System.out.println("杯子的颜色："+color);
    }

    public void use() {
        System.out.println("正在使用的杯子的特点：" +
                "高度是"+height+"厘米，容积是"+V+"毫升，颜色是"+color);
    }
    public void use(double d) {
        System.out.println("正在使用的杯子的特点：" +
                "高度是"+height+"厘米，容积是"+(V-d)+"毫升，颜色是"+color);
    }

    public static void main(String[] args) {
        Cup cup1 = new Cup();
        Cup cup2 = new Cup(30);
        Cup cup3 = new Cup(40,500);
        Cup cup4 = new Cup(50,1000,"black");
        cup4.show();
        cup1.changeColor("white");
        cup1.show();
        cup4.use(10);
    }
}

//手机
//型号，价格，尺寸
//发信息，第三方应用
//娱乐