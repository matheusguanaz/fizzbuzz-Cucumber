package com.amdocs.dio.steps;

import com.amdocs.dio.FizzBuzz;
import com.amdocs.dio.Sequence;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FizzBuzzStepDef {

    private int number;
    private int length;
    private String answer;
    private List<String> out;

    @Given("the user selected the number {int}")
    public void selectNumber(int number){
        this.number = number;
    }

    @When("the user clicked the FizzBuzz number")
    public void fizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        answer = fizzBuzz.render(number);
    }

    @Then("The program prints {word}")
    public void checkAnswer(String expected){
        assertEquals(expected, answer);
    }

    @Given("the user wants a sequence of {int} numbers")
    public void theUserWantsASequenceOfNumbers(int length) {
        this.length = length;
    }

    @When("the user clicked the FizzBuzzSequence number")
    public void theUserClickedTheFizzBuzzSequenceNumber() {
        Sequence sequence = new Sequence(new FizzBuzz());
        this.out = sequence.generate(length);
    }

    @Then("the program printed")
    public void theProgramPrinted(List<String> expected) {
        assertNotNull(out);
        assertEquals(expected.size(), out.size());
        for (int i = 0; i < out.size(); i++){
            assertEquals(expected.get(i), out.get(i));
        }
    }
}
