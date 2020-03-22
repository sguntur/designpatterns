package self.learning.prototype;

public abstract class PrototypeCapableDocument implements Cloneable{
	private String vendorName;
	private String content;
	
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String conent) {
		this.content = conent;
	}
	
	public abstract PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException;
	
	@Override
	public String toString() {
		return "PrototypeCapableDocument [vendorName=" + vendorName + ", content=" + content + "]";
	}
	
}
