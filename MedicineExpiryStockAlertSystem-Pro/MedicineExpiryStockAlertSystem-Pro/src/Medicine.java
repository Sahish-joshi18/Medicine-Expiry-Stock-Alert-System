import java.io.Serializable;
public class Medicine implements Serializable {
 private String id,name,company,batch,expiry; private int quantity,minStock; private double price;
 public Medicine(String id,String name,String company,String batch,int quantity,double price,String expiry,int minStock){this.id=id;this.name=name;this.company=company;this.batch=batch;this.quantity=quantity;this.price=price;this.expiry=expiry;this.minStock=minStock;}
 public String getId(){return id;} public String getName(){return name;} public String getCompany(){return company;} public String getBatchNo(){return batch;} public int getQuantity(){return quantity;} public double getPrice(){return price;} public String getExpiryDate(){return expiry;} public int getMinStock(){return minStock;}
 public void setName(String x){name=x;} public void setCompany(String x){company=x;} public void setBatchNo(String x){batch=x;} public void setQuantity(int x){quantity=x;} public void setPrice(double x){price=x;} public void setExpiryDate(String x){expiry=x;} public void setMinStock(int x){minStock=x;}
}
