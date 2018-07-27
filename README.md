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
