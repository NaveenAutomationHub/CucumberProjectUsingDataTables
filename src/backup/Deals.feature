Feature: Free CRM ContactsPage Test
Scenario: Create New Contacts under Contacts Page
 Given Login to Free CRM
 When Providing valid username and password
 |naveendommata|Welcome@123|
 Then Go to deals page , create new deal by entering title, company, and amount
 |new deal|s2tech|27000|
 Then close the browser
 
