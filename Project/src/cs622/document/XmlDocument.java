package cs622.document;

public class XmlDocument extends Document {

	private String wsdlUrl;

	public XmlDocument(String wsdlUrl) {
		this.wsdlUrl = wsdlUrl;
	}

	@Override
	public void parse(String input) {
		// TODO Auto-generated method stub

	}

	public String getWsdlUrl() {
		return wsdlUrl;
	}

	public void setWsdlUrl(String wsdlUrl) {
		this.wsdlUrl = wsdlUrl;
	}

}
