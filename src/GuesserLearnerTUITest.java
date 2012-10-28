import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GuesserLearnerTUITest {

	String question;
	@Before
	public void setUp() throws Exception {
		question = "Is this a question?";
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void askQuestionTest() {
		GuesserLearnerTUI tui = new GuesserLearnerTUI();
		String response = tui.askQuestion(question);
		assertNotNull(response);
		
	}

}
