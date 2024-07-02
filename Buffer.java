import java.util.ArrayList;
import java.util.List;

public class Buffer {
    private int capacity ;
    private List<Integer> products = new ArrayList<>();

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    public void addProduct(int productId , int product){
        System.out.println(">>>----------------");
        System.out.println("San Pham Da Duoc Them " + productId);
        products.add(product);
        System.out.println("Ten San Pham Duoc Them " + product);
        System.out.println("So Luong Ton Kho , Sau Khi Them " + products.size());
    }
    public void removeProduct(int consumerId){
        System.out.println("<<<-------------");
        System.out.println("Khach Hang" + consumerId + "Da Mua San Pham" + products.get(0));
        products.remove(0);
        System.out.println("So Luong Ton Kho La" + products.size());
    }

    public int getCapacity() {
        return capacity;
    }
    public int getSizeProducts(){
        return this.products.size();
    }
}
