package self.learning.prototype;

public class NDAgreement extends PrototypeCapableDocument{
	
	private AuthorizedSignatory authorizedSignatory;

	public AuthorizedSignatory getAuthorizedSignatory() {
		return authorizedSignatory;
	}
	public void setAuthorizedSignatory(AuthorizedSignatory authorizedSignatory) {
		this.authorizedSignatory = authorizedSignatory;
	}

	@Override
	public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
		NDAgreement ndAgreement=null;
		try {
			ndAgreement = (NDAgreement)super.clone();
			AuthorizedSignatory authorizedSignatoryClone = (AuthorizedSignatory)ndAgreement.getAuthorizedSignatory().clone();
			ndAgreement.setAuthorizedSignatory(authorizedSignatoryClone);
			
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return ndAgreement;
	}
	
	@Override
	public String toString() {
		return "NDAgreement [authorizedSignatory=" + authorizedSignatory + ", getVendorName()=" + getVendorName()
				+ ", getContent()=" + getContent() + "]";
	}
	

	
}
