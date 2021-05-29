Feature: Post feature on the facebook 
	this will test the post functionality at the user wall

Senario: Post a text on the user wall
	Given user shoul be logged in 
	And Sould be a person on its own wall 
	When I type the text on the txt box 
	And Click on post button 
	Then  The message sould be get posted 
	
Senario: Post a video on user wall 
	Given  User should be logged in 
	And  Should be present in its own wall 
	When  User supply the Youtube link in the text box 
	And  Click on hte poset button 
	Then  Giveo should be on the user wall 
	And  The video should be have proper subnail
	
	//  /takamasa_ex