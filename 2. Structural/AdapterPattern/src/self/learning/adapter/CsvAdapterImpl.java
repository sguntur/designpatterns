package self.learning.adapter;

public class CsvAdapterImpl implements TextFormattable {
	CsvFormattable csvFormatter;
	
	public CsvAdapterImpl(CsvFormattable csvFormatter){
		this.csvFormatter = csvFormatter;
	}
	
	@Override
	public String formatText(String text) {
		return this.csvFormatter.formatCsvText(text);
	}

}
