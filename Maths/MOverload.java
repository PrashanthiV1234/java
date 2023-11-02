
class MOverload{
    void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    void add(int a,double b){
        double c=a+b;
        System.out.println(c);
    }
public static void main(String[] args){
    MOverload obj=new MOverload();
    obj.add(2,3);
    obj.add(42,52.5);
}
}//5
//94.5