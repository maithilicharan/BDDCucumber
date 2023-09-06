package rover;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertEquals;

public class MarsRoverStepDefs {
    Rover marsRover = new Rover();
    @Given("^the Mars Rover is at position \\((\\d+), (\\d+)\\) facing \"([^\"]*)\"$")
    public void theMarsRoverIsAtPositionFacing(int arg0, int arg1, String arg2) throws Throwable {
        marsRover.setPosition(arg0, arg1, arg2);
    }

    @When("^I set the Mars Rover's position to \\((\\d+), (\\d+)\\) and facing \"([^\"]*)\"$")
    public void iSetTheMarsRoverSPositionToAndFacing(int arg0, int arg1, String arg2) throws Throwable {
        marsRover.setPosition(arg0, arg1, arg2);
    }

    @Then("^the Mars Rover's position should be \\((\\d+), (\\d)\\) and facing \"([^\"]*)\"$")
    public void theMarsRoverSPositionShouldBeAndFacing(int arg0, int arg1, String arg2) throws Throwable {
        marsRover.printPosition();
        assertEquals(marsRover.x.intValue(), arg0);
        assertEquals(marsRover.y.intValue(), arg1);
        assertEquals(marsRover.facing, marsRover.getDirection(arg2).intValue());
    }

    @When("^I move the Mars Rover forward$")
    public void iMoveTheMarsRoverForward() {
        marsRover.process("M");
    }


    @When("^I move the Mars Rover backward$")
    public void iMoveTheMarsRoverBackward() {
        marsRover.process("M");
    }

    @Then("^the Mars Rover should be at position \\((\\d+), -(\\d+)\\) facing \"([^\"]*)\"$")
    public void theMarsRoverShouldBeAtPositionFacing(int arg0, int arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I follow the given scenario \"([^\"]*)\"$")
    public void iFollowTheGivenScenario(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
