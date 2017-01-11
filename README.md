# testproject

Notes:

I Just written one test to finish all scenarios together. I did use Thread.sleep here basically I don’t prefer to use this but instead I prefer to use some other options like ExpectedConditions etc.

I did use selenium 3.0 and java 1.7 + so while running maven test it needs to compile and test using 1.7+ compiler otherwise will throw errors.

Few places I declared exceptions and which are mandatory as per Java specification since those are checked exceptions.

I used Firefox browser with GeckoDriver (unix executable) on selenium 3.0 version and used OOPS concepts to handle one driver instance for all page objects.

If you are running in your machine, please download GeckoDriver and update the path in the code base (DriverUtility.java) and also file upload path (TestPage.java) as well.

Paths which I used for GeckoDriver and file upload option are /Users/kirangorantla/Downloads/geckodriver
And /Users/kirangorantla/Documents/test.txt
respectively.

And also I did not add automation for deleting the snippet here.




BUGS :

1) Snippets were allowing duplicates.

2) I can see all users, specific to the instanceid without logging.

3) I can see all user's snippets without logging in.

4) After logging in, it is not showing specific to the user but showing all other users as well.

5) All snippets and My snippets both options are same but after logging in one is not giving delete option but other one.

6) When I try to upload .exe file, it is only saying max size allowed. It is not suppose to accept any exe file for security reasons. So it has to say invalid file format.

