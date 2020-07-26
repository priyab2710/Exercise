Feature: Add bank account
#	User Story
#   As a Xero User,
#	In order to manage my business successfully,
#	I want to be able to add an “ANZ (NZ)” bank account inside any Xero Organisation.

Scenario Outline: 
Given Xero user is logged in with correct "priyab2710@gmail.com" and "Xeroqa@27"
When Xero user has organisation added and selects the existing organization "Priya Test"
Then add bank account options is available to user and is able to click on link for "Priya Test" organization
And user is able to add "ANZ (NZ)" bank account with <account_name> and <account_type> and <account_number>

Examples:
|  account_name   		    | account_type   	| account_number 	|
|  Xero Everyday 01 		| Everyday          | 01045667789       |
#|  Xero Loan 01  			| Loan           	| 99609090909      	|
#|  Xero Deposit 01  		| Term Deposit      | 4567895667      	|
#|  Xero Other 01	        | Other           	| 1111222      		|
#|  Xero Credit Card 01  	| Credit Card       | 4555              |


#Scenario:
#Given Xero user is logged in with correct credentials
#And completes 2factor authentication successfully with correct security answers
#When Xero user does not have organisation and user adds new organization
#Then add bank account options is available to user and is able to click on link
#And user is able to add ANZ bank account with account name, account number  account type

#Scenario: Xero user with correct credentials, organisation exists, bank account exists, no option to add bank account
#Scenario: Xero user with correct credentials, organisation does not exists, close
#Scenario: Xero user with incorrect credentials*/



