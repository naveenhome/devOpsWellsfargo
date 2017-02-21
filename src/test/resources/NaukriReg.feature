Feature: Registration
In order to apply for new job
As a jobseeker
I want to register

Scenario: Valid registration with new email id
Given User has entered "Naveen Singh" as name, email as "naveenhome@msn.com"
When Click on "Register"
Then System display message "Registration Successful"
And Send mail on given mail id
