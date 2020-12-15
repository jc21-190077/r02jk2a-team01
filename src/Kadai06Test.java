import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class Kadai06Test {

	@Test
	void testget2ndMax() {
		Kadai06 k = new Kadai06();
		int [] d = {1,5,2,4};
		int i1 = k.get2ndMax(d);
		assertThat(i1,is(4));
	}
}
