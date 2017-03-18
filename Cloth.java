/*An interface is implicitly abstract. You do not need to use the abstract keyword while declaring an interface.
Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.
Methods in an interface are implicitly public.*/
public interface Cloth {
    public int calculateCost(int clothLength);
    public void printCost(int price);
}
