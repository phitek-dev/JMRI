@webtest
Feature: JMRI Web Server 

Scenario Outline: Basic Http requests
   Given I am using <browser>
   When I ask for the url <PageURL>
   Then a page with title <PageTitle> is returned

   @firefox
   Examples: Firefox Tests
   | browser | PageURL | PageTitle |
   | firefox | http://localhost:12080/       | My JMRI Railroad |
   | firefox | http://localhost:12080/index.html | My JMRI Railroad |

   @chrome
   Examples: Chrome Tests
   | browser | PageURL | PageTitle |
   | chrome  | http://localhost:12080/       | My JMRI Railroad |
   | chrome  | http://localhost:12080/index.html | My JMRI Railroad |
