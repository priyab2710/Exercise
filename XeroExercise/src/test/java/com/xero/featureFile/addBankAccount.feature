Feature: As a Xero User, In order to manage my business successfully, I want to be able to add an “ANZ (NZ)” bank account inside any Xero Organisation.

Scenario Outline: 
Given Xero user is logged in with correct "priyab2710@gmail.com" and "Xeroqa@27"
When Xero user has organisation added and selects the existing organization "Priya Test"
Then add bank account options is available to user and is able to click on link for "Priya Test" organization
And user is able to add "ANZ (NZ)" bank account with <account_name> and <account_type> and <account_number>

Examples:
|  account_name   		| account_type   	| account_number 	|
|  Test Everyday		| Everyday          | 01045667789       |
|  Test Loan 			| Loan           	| 99609090909      	|
|  Test Deposit  		| Term Deposit      | 4567895667      	|
|  Test Other        	| Other           	| 1111222      		|
|  Test Credit Card  	| Credit Card       | 4555              |
