package Tests.UTToolwrapper;

import ToolWrapper.WordNetFunctionality;
import ToolWrapper.WordNetInitializer;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class UTWordnet {

    @Test
    public void evaluateWordnetInvocation() throws IOException {

        /***check Initialiaztion***/
        WordNetInitializer wni= WordNetInitializer.getInstance();
        assertEquals("WorNet Initialization Issue: Not initialized.",true, wni!=null);

        /***check Functionality***/
        WordNetFunctionality wnf = new WordNetFunctionality();

        assertEquals("WorNet Functionality Issue: wnf can not be received.",true, wnf!=null);
        assertEquals( "WordNet Functionality Issue: Problem with 'isAnimate()'." , true , wnf.isAnimate("woman") == true);
        assertEquals( "WordNet Functionality Issue: Problem with 'canBePersonOrSystem()'." , true , wnf.canBePersonOrSystem("Lisa", "she") == true);
        assertEquals( "WordNet Functionality Issue: Problem with 'canBeGroupAction()'." , true , wnf.canBeGroupAction("exchange") == true);
        assertEquals( "WordNet Functionality Issue: Problem with 'isTimePeriod()'." , true , wnf.isTimePeriod("day") == true);
        assertEquals( "WordNet Functionality Issue: Problem with 'deriveVerb()'." , "speak" , wnf.deriveVerb("speaker"));
        assertEquals( "WordNet Functionality Issue: Problem with 'isWeakVerb()'." , true , wnf.isWeakVerb("be") == true);
        assertEquals( "WordNet Functionality Issue: Problem with 'isVerbOfType()'." , true , wnf.isVerbOfType("run", "move") == true);
        assertEquals( "WordNet Functionality Issue: Problem with 'canBeDataObject()'." , true , wnf.canBeDataObject("email", "text") == true);

    }

}
