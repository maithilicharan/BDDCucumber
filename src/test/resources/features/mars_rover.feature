Feature: Mars Rover Test
As a Mars Rover operator
I want to control the movement of the rover for possible scenarios
So that it can explore the Mars surface.

@Test-a
Scenario: Initialize Rover's direction and position
Given the Mars Rover is at position (0, 0) facing "North"
When I set the Mars Rover's position to (1, 2) and facing "North"
Then the Mars Rover's position should be (1, 2) and facing "North"

@Test-b1
Scenario: Move the Rover forward
Given the Mars Rover is at position (0, 0) facing "North"
When I move the Mars Rover forward
Then the Mars Rover's position should be (0, 1) and facing "North"

@Test-b2
Scenario: Move the Rover backward
Given the Mars Rover is at position (0, 0) facing "South"
When I move the Mars Rover backward
Then the Mars Rover should be at position (0, -1) facing "South"

@Test-c
Scenario: Move the Rover based on the given problem scenario
Given the Mars Rover is at position (1, 2) facing "North"
When I follow the given scenario "LMLMLMLMM"
Then the Mars Rover's position should be (1, 3) and facing "North"

