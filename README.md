# 🛒 Flipkart End-to-End Automation Project

This project automates the end-to-end user journey on **Flipkart**, including searching for products, adding them to the cart with excel using Selenium WebDriver with Cucumber (BDD).

---

## 🚀 Project Overview
The goal of this project is to validate the complete Flipkart user workflow using automation testing techniques. It demonstrates practical implementation of:
- Selenium WebDriver
- Cucumber BDD (Gherkin syntax)
- TestNG
- Maven project structure
- Page Object Model (POM) design pattern

---

## 🧰 Tech Stack
| Component | Description |
|------------|--------------|
| **Language** | Java |
| **Automation Tool** | Selenium WebDriver |
| **BDD Framework** | Cucumber |
| **Build Tool** | Maven |
| **Test Framework** | TestNG |
| **Reporting** | Extent Reports  |
| **IDE** | IntelliJ IDEA |
| **Logging** | Log4j |

---


---

## ⚙️ How to Run the Tests
1️⃣ Clone the repository
```bash
git clone https://github.com/hema2019-am/Flipkart_End_To_End.git

2️⃣ Open the project in IntelliJ IDEA
3️⃣ Install dependencies

Maven will auto-download dependencies, or you can run:

mvn clean install

4️⃣ Execute test suite

Run from terminal:

mvn test

🧩 Cucumber + TestNG Integration
@CucumberOptions(

        features = "src/main/resources/Features",
        glue = {"com.StepDefination","com.Hooks"},
        plugin = {
                "html:src/main/resources/Reports/cucumber-reports.html",
                "json:src/main/resources/Reports/cucumber.json",
                "testng:src/main/resources/Reports/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "pretty",
        },tags = "@Regression"
)
public class Runner extends AbstractTestNGCucumberTests {
}

📊 Reports

After test execution:

Extent Report:

src/main/resources/Reports/cucumber-reports.html

🧠 Key Features

Page Object Model design

Data-driven testing

Centralized configuration management

Screenshot capture on failure

Extent reporting integration
