import java.util.List;

public class MachineCafe {
    private List<Parfum> parfumList;

    public List<Parfum> getParfumList() {
        return parfumList;
    }

    public MachineCafe(List<Parfum> parfumList) {
        this.parfumList = parfumList;
    }

    public void ShowParfumList(){
        for(Parfum p: parfumList){
            if(p.isAvailable()){
                System.out.println("name: "+p.getName() + "price: "+p.getPrice());
            }
        }
    }
    public boolean BuyCoffee(User user, String parfumName,int quantity){
        for(Parfum p : parfumList){
            if(p.getName().equalsIgnoreCase(parfumName)){
                if(p.getQuantity()<quantity){
                    System.out.println("nsufficient quantity in stock for this fragrance");
                    return false;
                }

                double priceTotal = p.getPrice()*quantity;
                if(priceTotal > user.getBalance()){
                    System.out.println("Insufficient balance");
                }

                user.deductArgent(priceTotal);
                p.setQuantity(p.getQuantity() - quantity);
                System.out.println("Successful purchase");
                return true;
            }
        }
        System.out.println("Parfum not found");
        return false;
    }
}
