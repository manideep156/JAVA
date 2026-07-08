public class ConstructorWorking {
    int number;
    ConstructorWorking(int num){
        this.number=num;
    }
    public static void main(String[] args){
        ConstructorWorking num = new ConstructorWorking(10);
        System.out.println(num.number);
    }
    
}