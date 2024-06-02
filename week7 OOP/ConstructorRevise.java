public class ConstructorRevise {
    public static void main(String[] args) {
        NonParameterizedConstructor np = new NonParameterizedConstructor();
        
        System.out.println(np.data2);
        ParamitarizedConstructor pc = new ParamitarizedConstructor(10, "Ram2");
        System.out.println(pc.data2);
        pc.data2="Changing";
        pc.setData1(100);
        System.out.println(pc.getData1());
    }
    
}
class ParamitarizedConstructor {
    private int data1;
    String data2;

    //write only access to private property
    void setData1(int data1){
        this.data1=data1;

    }
    public char[] getData1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getData1'");
    }
    //read only access to p rivate property 
    ParamitarizedConstructor(int data1,String data2){
        this.data1 = data1;
        this.data2 = data2;    
    }
}
class NonParameterizedConstructor {
    private int data1;
    String data2;

    void setData1(int data1){
        this.data1 = data1;
    }
    int getData1(){
        return this.data1
    }
    NonParameterizedConstructor(){
        data1=10;
        data2 ="Ram";
        System.out.println("Running in object creation");
    }
}
