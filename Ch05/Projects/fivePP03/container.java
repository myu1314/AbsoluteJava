package Ch05.Projects.fivePP02;

public class Container{
    public double mxCapcity;
    public doubl equantity;
    public Conatiner(double mxCapcityInp){
        maxCapcity = mxCapcityInp;
        quantity = 0;
    }
    public double getQuantity(){
        return quantity;
    }
    public double getLeft(){
        return (mxCapcity - quantity);
        
    }
    public void full(){
        quantity = mxCapcity;
    }
    public void empty(){
        quantity = 0;
    }
    public void transfter(container container1, double transferNum){
        double aSpace = container1.getLeft();
        double transferAmount = 0;
        if (transferNum <= 0){
            System.out.println("Transfer amount must be positive");
            return; 
        }
        if (quantity < amount){
            System.out.println("Not enough in current container");
        }
        if (aSpace = 0){
            System.out.println("Transfer Container has no more space");
        }
        if(transferNum <= aSpace){
            transferAmount = transferNum;
        }
        else{
            transferAmount = aSpace;
        } 
        quantity -= transferAmount;
        container1.quantity += transferAmount;
        System.out.println("Transfered " + transferAmount + " to the other container");

    }
    public void displayQuantity(){
        System.out.println("The current quantity is " + quantity);
    }

}

