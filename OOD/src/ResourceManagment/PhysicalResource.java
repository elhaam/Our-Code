package ResourceManagment;


public class PhysicalResource extends Resource{
	private int propertyNo;
	private String type;
	private String modelName;
	public PhysicalResource(int p,String t,String m) {
		// TODO Auto-generated constructor stub
		super(ResourceType.PHYSICAL);
		this.modelName=m;
		this.type=t;
		this.propertyNo=p;
		
	}

}
