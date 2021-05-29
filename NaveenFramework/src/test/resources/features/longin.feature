Feature: Login page feature
Given user is on login page
When user gets the title of the page
Then page title should be "login - my store"

Senatio: Forgot password link
When user is on login page
Then Forgot passwoed link should be displayed

Scenariso: Login with correct credentials 
Given user is on login page
When user enters username "mbbugra1!gmail.com"
When user enter password "bugra1"
Then user gets the title of the page
And page title should be "My Account"