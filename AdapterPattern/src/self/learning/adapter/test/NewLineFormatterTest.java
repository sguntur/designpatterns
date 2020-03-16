package self.learning.adapter.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import self.learning.adapter.CsvAdapterImpl;
import self.learning.adapter.CsvFormattable;
import self.learning.adapter.CsvFormatter;
import self.learning.adapter.NewLineFormatter;
import self.learning.adapter.TextFormattable;

class NewLineFormatterTest {

	static String testString="";
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		testString=" Formatting line 1. Formatting line 2. Formatting line 3.";
	}

	@Test
	void test() {
		TextFormattable newLineFormatter = new NewLineFormatter();
		String newLineFormattedText = newLineFormatter.formatText(testString);
		System.out.println(newLineFormattedText);
		
		CsvFormattable csvFormatter = new CsvFormatter();
		TextFormattable csvAdapter = new CsvAdapterImpl(csvFormatter);
		String csvFormattedText = csvAdapter.formatText(testString);
		System.out.println(csvFormattedText);
	}

}
