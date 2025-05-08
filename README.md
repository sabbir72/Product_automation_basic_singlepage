PROJECT SUMMARY:
This Selenium WebDriver automation script performs a series of actions on the Demoblaze online store to:

Log in using predefined credentials.

Navigate through categories.

Add a product to the cart.

Handle alerts.

Verify successful login and session.

KEY POINTS:
Setup:

Uses Selenium WebDriver with ChromeDriver.

WebDriverManager is used for automatic ChromeDriver setup.

Login Automation:

Logs in with the username “Learn” and password “learn123”.

Verifies login with the welcome message "Welcome Learn".

Navigation & Interaction:

Clicks on a product category and adds an item to the cart.

Scrolls the page to ensure visibility of elements.

Alert Handling:

Accepts a browser alert after adding an item to the cart.

Verification:

Checks if the login was successful by verifying the username on the page.

Technologies Used:
Selenium WebDriver for browser automation.

TestNG for managing the test.

WebDriverManager for handling the ChromeDriver setup.

Test Execution:
Runs the test using TestNG.

WebDriverManager automatically handles ChromeDriver version compatibility.

Extended Project Functionality Overview:
This project demonstrates basic website automation using Selenium WebDriver with TestNG for a demo e-commerce site (Demoblaze). The script automates logging in, product navigation, adding an item to the shopping cart, and verifying successful login. Below is an extended version with references for further reading.

References and Additional Details:
WebDriverManager Integration:

WebDriverManager simplifies the process of managing browser drivers, ensuring that the correct version is automatically downloaded. It removes the need to manually download browser-specific drivers.

Reference: WebDriverManager GitHub

Key Point: WebDriverManager handles the setup of ChromeDriver dynamically, ensuring compatibility with the current version of Chrome.

ChromeDriver Setup:

ChromeDriver is used to interact with Google Chrome and perform the automated tasks.

Reference: Selenium WebDriver Docs on ChromeDriver

Key Point: ChromeDriver is a specific WebDriver implementation for controlling the Chrome browser.

Maximizing Browser Window:

driver.manage().window().maximize(); ensures the browser window is maximized, which helps in ensuring that elements are accessible and visible for interaction.

Reference: Selenium WebDriver Documentation: Window Management

Key Point: Maximize window ensures consistent screen resolution and avoids issues with elements being outside the visible area.

Implicit Wait:

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); makes the WebDriver wait for a specified time before throwing an exception if it cannot find an element.

Reference: Selenium Implicit Wait Documentation

Key Point: Helps in scenarios where elements may take some time to load, ensuring the script does not fail prematurely.

Navigating to the Webpage:

driver.get("https://www.demoblaze.com/"); opens the target URL (in this case, Demoblaze's homepage).

Reference: Selenium WebDriver Documentation: Navigation

Key Point: This is the basic way to navigate to a URL in Selenium.

Logging In:

User Authentication is automated by entering credentials and clicking the login button.

Reference: Selenium WebDriver Form Handling

Key Point: Automating login allows the test script to simulate a user entering credentials on the login page.

Explicit Wait (Advanced Waiting Mechanism):

WebDriverWait provides an explicit wait for a certain condition to be met, such as waiting for an element to be visible or clickable.

Reference: Selenium Explicit Wait Documentation

Key Point: This is more efficient than implicit wait when you're waiting for specific conditions, such as the appearance of a modal or a pop-up.

Scrolling into View (JavaScript Execution):

js.executeScript("arguments[0].scrollIntoView();", Cat); scrolls the page to bring the specified element into view.

Reference: Selenium WebDriver JavaScript Executor

Key Point: JavaScript execution is used to simulate browser-level actions like scrolling, which is not directly available through WebDriver.

Selecting and Adding Products to Cart:

Product Interaction is done by locating product elements by XPath or class and then performing actions like clicking to view or add items to the cart.

Reference: Handling Links, Buttons, and Forms with Selenium WebDriver

Key Point: Identifying and interacting with web elements such as product links, add-to-cart buttons, and more.

Handling Alerts:

driver.switchTo().alert().accept(); interacts with pop-up alerts in the browser, accepting or dismissing them.

Reference: Selenium WebDriver Handling Alerts

Key Point: Alerts are common in many web applications for confirmations and warnings, and Selenium provides methods to interact with them.

Verifying the Login:

Assertions are used to verify that the expected result (i.e., a successful login message) appears on the page.

Reference: TestNG Assertion Methods

Key Point: Verifying that the test behaves as expected is a crucial part of any test case. TestNG’s assertTrue() helps verify conditions, such as successful login.

Closing the Browser:

driver.close(); closes the browser window after the test is completed, ending the session.

Reference: Selenium WebDriver Documentation: Closing the Browser

Key Point: Properly closing the browser ensures that resources are released after the test completes.

Additional Learning Resources:
Selenium WebDriver Documentation:

Official Selenium Documentation: Selenium Documentation

This is the official source of all WebDriver functionalities and use cases.

TestNG Documentation:

Official TestNG Docs: TestNG Documentation

TestNG is a popular testing framework used alongside Selenium WebDriver. It's useful for managing test cases, creating reports, and executing parallel tests.

JavaScript Executor in Selenium:

JavaScript Executor Tutorial: JavaScript Executor in Selenium

The JavaScript Executor allows you to execute JavaScript within the browser from the WebDriver.

Handling Alerts in Selenium:

Alert Handling: Handling Alerts

This section explains how to handle browser alerts like pop-ups or confirmation boxes.

Selenium Waits:

Waits in Selenium: Selenium Waits

This is crucial for dealing with elements that load asynchronously (e.g., after AJAX calls or during dynamic page updates).

Conclusion and Key Takeaways:
This project demonstrates the power of Selenium WebDriver and TestNG for automating web interactions and testing user flows such as logging in, adding items to a cart, and verifying results.

Key concepts like explicit waits, JavaScript execution, alert handling, and TestNG assertions are all vital for writing robust and reliable automation scripts.

These functionalities enable automation of real-world scenarios for testing and interacting with dynamic websites.

By exploring the above references, you will deepen your understanding of how to leverage Selenium WebDriver to automate web applications effectively and handle various browser events and conditions.
