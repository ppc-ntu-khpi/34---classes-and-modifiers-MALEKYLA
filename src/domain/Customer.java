  public class Customer
{
    public int getID()
    {
        return ID;
    }
    public void setID(int nID)
    {
        if(nID>=0)
        {
            ID=nID;
        }
    }
    public boolean isIsNew()
    {
        return isNew;
    }
    public void setIsNew(boolean isNew)
    {
        this.isNew=isNew;
    }
    public float getTotal()
    {
        return total;
    }
    public void setTotal(float ntotal)
    {
        if(ntotal>=0)
        {
            total=ntotal;
        } 
    }
    int ID; 
    boolean isNew;
    float total;

    Customer()
    {
        ID=77;
        isNew=true;
        total=977F;
    }

    public void displayCustomerInfo()
    {
        System.out.println("Номер клиента: "+ID);
        System.out.println("Новый клиент: "+isNew);
        System.out.println("Количество заказов за год: "+total);
    }
}
