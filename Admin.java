public class Admin
{

	private String customerId;
	private String Topping;
	private int orderId;
	private double price;

	public String getCustomerId()
	{
		return this.customerId;
	}

	public void setCustomerId(String customerId)
	{
		this.customerId = customerId;
	}

	public String getTopping()
	{
		return this.Topping;
	}

	public void setTopping(String Topping)
	{
		this.Topping = Topping;
	}

	public int getOrderId()
	{
		return this.orderId;
	}

	public void setOrderId(int orderId)
	{
		this.orderId = orderId;
	}

	public double getPrice()
	{
		return this.price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

}