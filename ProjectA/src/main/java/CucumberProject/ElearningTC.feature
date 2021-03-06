Feature: Elearning TC
 
  Scenario Outline:   Registered as Student
    Given navigate to Elearing page "<Url>"
  	When Click on Sign Up link "<FirstName>","<LastName>","<email>","<userName>","<pass>","<cPass>","<phoneNo>","<Language>"
		Then Verify user is able to login successfully 
		
		Examples: Student Details 
		|Url||FirstName||LastName||email||userName||pass||cPass||phoneNo||Language|       
		|http://elearningm1.upskills.in/|| manzoor ||mehadi| |pbhola1102@gmail.com||ptest4||manzoor||manzoor||9954667889||Englisg| 
	
	Scenario Outline: get logged in by entering valid credentials
	
		Given navigate to Elearing page "<Url>"
		When Enter username and passowrd  "<userName>","<password>"
		Then verify login successfully
		
		Examples: user name and password detail
		|Url||userName||password|
		|http://elearningm1.upskills.in/|| ptest3 |	|manzoor|
		
	Scenario Outline: change the password in Edit Profile page
	
		Given navigate to Elearing page "<Url>"
		When Enter username and passowrd  "<userName>","<password>"
		And click on profile edit
		And Enter valid password "<presentPwd>","<currentPwd>","<currentPwdA>"
		Then password had changes successfully 
		
		Examples:
		|Url||userName||password||presentPwd||currentPwd||currentPwdA|
		|http://elearningm1.upskills.in/|| ptest1 |	|manzoor||manzoor||mehadi||mehadi|
	
	
		
     
	
		
