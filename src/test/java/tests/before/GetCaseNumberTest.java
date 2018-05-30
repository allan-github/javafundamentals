package tests.before;

import org.junit.Test;
import steps.before.GetCaseNumberStep;

public class GetCaseNumberTest
{

    @Test
    public void validateCanGetNewCaseNumber() {
        GetCaseNumberStep getCaseNumberStep = new GetCaseNumberStep();
        getCaseNumberStep.generateNewCaseNumberSelfContained();
    }

}
