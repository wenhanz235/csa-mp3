# csa-mp3
## In this repository:
- My solutions to 2024 FRQs

Question 1: Throughout the question, I first focused on the conditions that would affect the currentFood private instance variable which would be posibility of appearing a bear or not where it would clear the variable and otherwise subtract the value to be a random value within 10 to 50 range with a multiplication response to the numOfBirds variable. I thought of managing use on Math.random from a range of 1 to 100 as it was the most direct approach to creating a response of 95% and 5% possibility. Then, with these in mind, I could simply manipulate if and else statements to clarify which situation would be triggered along with the functions that comes with that specific event. Furthermore, for the second part, it was fairly obvious to me as I only had to record the number of times that the currentFood could hold within the number of simulated days provided within the input of the method, I immediately created a count variable to count times that currentFood didn't reach 0 after a use of simulateOneDay and also return a count number that is one higher after it reaches 0 to include the last day in the simulation.

Question 2: Throughout the question, I first decided to create instance variables to hold values of team1 name, team2 name, team1 score, and team2 score. After a while, I've considered that I required a variable to track whose turn it was when the code executed methods like recordPlay or getScore, I decided to use a boolean variable as it seemed the most direct and obvious in the context of the variable to decide whether team 1 or team 2 should acquire the score that is earned at the current round where a true value indicated that team 1 was active and team 2 otherwise.

Question 3:
