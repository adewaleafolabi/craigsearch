#Craigslist Parser
This is a simple application that allows you to perform a search on craiglists.ca.

The application provides a swaggerUI page that shows how to use this API. The swagger page is available at http://ADDRESS:PORT/swagger-ui.html


**Compilation Instructions**

**Requirements**
* JDK 8 
* Maven 3

To compile simply run **mvn clean package**


**To run** : **java -jar search-0.0.1-SNAPSHOT.jar**


**Usage**

The API requires two query parameters

*query - The search term

*category - This is the craigslist search category code. See the table below


|Code|Category|
|---|---|
|ccc |community|
eee|events|
|sss|for sale|
|ggg|gigs|
|hhh|housing|
|jjj|jobs|
|rrr|resumes|
|bbb|services


Example: http://127.0.0.1:9090/api/v1/?query=apartment&category=hhh

This will search for the keyword **apartment** in the category **housing**

`[{"title":"Rent 55 Merchants' Wharf Toronto For Lease $4990 (Toronto)","date":"Jul 27"},{"title":"Rent 55 Merchants' Wharf Toronto For Lease $4750 (Toronto)","date":"Jul 27"},{"title":"Rent 55 Merchants' Wharf Toronto For Lease $3500 (Toronto)","date":"Jul 27"},{"title":"Apart. - 23 Sheppard Ave E - Toronto $2100 (Yonge/Sheppard)","date":"Jul 27"},{"title":"Renovated 1st Floor Junction 1 Bdrm $1400/m utilities included $1400 (Junction/Dundas)","date":"Jul 27"},...]`