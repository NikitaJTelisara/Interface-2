/* you have to implement each and every metod from a interface*/
public class Silk implements Cloth{
    int price = 0;
    public int calculateCost(int clotheLength){
        return (clotheLength * 5);
    }

    public void printCost(int price){
        System.out.println("Silk Cost is :"+price);
    }

    public static void main(String[] args){
        Silk s = new Silk();
        s.price = 10;
        System.out.println(s.calculateCost(s.price));
        s.printCost(s.price);
    }
}
