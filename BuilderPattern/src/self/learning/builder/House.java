package self.learning.builder;

public class House {
	
	private String foundation;
	private String structure;
	private String roof;
	private Boolean furnished;
	private Boolean painted;
	
	public String getFoundation() {
		return foundation;
	}
	public void setFoundation(String foundation) {
		this.foundation = foundation;
	}
	public String getStructure() {
		return structure;
	}
	public void setStructure(String structure) {
		this.structure = structure;
	}
	public String getRoof() {
		return roof;
	}
	public void setRoof(String roof) {
		this.roof = roof;
	}
	public Boolean getFurnished() {
		return furnished;
	}
	public void setFurnished(Boolean furnished) {
		this.furnished = furnished;
	}
	public Boolean getPainted() {
		return painted;
	}
	public void setPainted(Boolean painted) {
		this.painted = painted;
	}
	@Override
	public String toString() {
		return "House [fondation=" + foundation + ", structure=" + structure + ", roof=" + roof + ", furnished="
				+ furnished + ", painted=" + painted + "]";
	}
	
}
