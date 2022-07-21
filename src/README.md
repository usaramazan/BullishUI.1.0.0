Framework:
* Test cases are stored in features folder.
* url, default browser name and credential info in configuration file.
* Used page object model and stored web elements in the page classes.
* There are some runner options in runner folder.
* Used hook class for Before and After annotations
* Test cases implementations are in the stepDef folder.
* There is browser util class for some reusable methods.
* And there is Driver class to initilize the driver depends on selected browser type.

Test Run:
* We can use the tags annotations to be able to run specific tests.
* We need to use same tags for scenario feature files.
* We can see the html and json reports under the target folder.
* Also we can re-run failed test by useing FailedRunner class.