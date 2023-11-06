import java.util.Date;

public class Customer
{

	private String custId;
	private String custname;
	private String address;
	private String topping;
	private int orderId;
	private int Id;
	private Long phno;
	private double price;
	private Date date;

	public String getCustId()
	{
		return this.custId;
	}

	public void setCustId(String custId)
	{
		this.custId = custId;
	}

	public String getCustname()
	{
		return this.custname;
	}

	public void setCustname(String custname)
	{
		this.custname = custname;
	}

	public String getAddress()
	{
		return this.address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getTopping()
	{
		return this.topping;
	}

	public void setTopping(String topping)
	{
		this.topping = topping;
	}

	public int getOrderId()
	{
		return this.orderId;
	}

	public void setOrderId(int orderId)
	{
		this.orderId = orderId;
	}

	public int getId()
	{
		return this.Id;
	}

	public void setId(int Id)
	{
		this.Id = Id;
	}

	public Long getPhno()
	{
		return this.phno;
	}

	public void setPhno(Long phno)
	{
		this.phno = phno;
	}

	public double getPrice()
	{
		return this.price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public Date getDate()
	{
		return this.date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

}