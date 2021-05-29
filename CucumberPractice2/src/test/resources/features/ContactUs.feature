Feature: Contact Us Feature

Scenario Outline: Contact Us scenario with different set of data
Given  user navigate to contact us page
When user fills the form from given sheetname "<SheetName>" and rownumebr "<RowNumber>"
And  suer cilick on send button
Then it shows a successful message "your message has been successfully sent to our team."
Examples:
|SheetName|RowNumber|
|contactus|0|
|contactus|1 |