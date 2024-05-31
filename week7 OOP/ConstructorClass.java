public class ConstructorClass {
    public static void main(String[] args) {
        ConstructorExample ce = new ConstructorExample();
        System.out.println("after object");
        ParamConstructor pc =new ParamConstructor(10,20);
        System.out.println(pc.data2);
    }

class ParamConstructor{
    private int data1;
    public int data2;
    void setData1(int data1){
        this.data1=data1;
    }
    ParamConstructor(int d1 ,int d2){
    data1=d1;
    data2=d2;
}
}
class ConstructorExample{
    //non paramaiaerzed CPnstructor
    ConstructorExample(){
        System.out.println("I run in object creation");
        //Add more logics
        //Only called once, to set attributer value in most case
    }
}
