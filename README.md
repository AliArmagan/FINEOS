#Instructions:



- To Run Test, you can Run the "CucumberRunner" class or feature file.(By right click and Run or open the class and click on the small green icon)
- To run only one test open the "CucumberRunner" class under runner folder,
 and write the tag that you wanna run inside the double code next to the tags.(Ex=> tags = "@add_user") or run feature file that you wanna run.
 
-I have Hooks class inside the "step_definitions" folder.If you wanna comment out "Driver.closeDriver()", to make sure
 result as expected before browser close,it is under @After tag inside tearDown.
 
- I have too tags that you can run.@delete_user and @add_user

- I created 2 different feature file for each scenario.If you wanna check,you can see under features folder(src/test/resources/features).

- All elements and related methods for the page, locate under pages folder; inside the UserPage class.

- Under Utilities I have Driver and ConfigurationReader classes,if you want to check.

- If you wanna change browser and run on firefox you can change it on configuration.properties.I did not wanna add another browser.



