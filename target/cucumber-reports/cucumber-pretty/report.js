$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/DesktopFeature.feature");
formatter.feature({
  "line": 2,
  "name": "Desktop Retail Website Feature",
  "description": "",
  "id": "desktop-retail-website-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Desktop"
    }
  ]
});
formatter.before({
  "duration": 2442834900,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click on Desktops tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User click on Show all desktops",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 4139696000,
  "status": "passed"
});
formatter.match({
  "location": "RetailPageTestStepDefinitions.user_click_on_Desktops_tab()"
});
formatter.result({
  "duration": 84094000,
  "status": "passed"
});
formatter.match({
  "location": "RetailPageTestStepDefinitions.user_click_on_show_all_desktops()"
});
formatter.result({
  "duration": 3839631500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User verify all items are present in Desktops tab",
  "description": "",
  "id": "desktop-retail-website-feature;user-verify-all-items-are-present-in-desktops-tab",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@ItemsPresentDesktop"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User should see all items are present in Desktop page",
  "keyword": "Then "
});
formatter.match({
  "location": "DesktopTestStepDefinitions.all_items_are_present_in_Desktop_page()"
});
formatter.result({
  "duration": 1060165800,
  "status": "passed"
});
formatter.after({
  "duration": 687499600,
  "status": "passed"
});
formatter.before({
  "duration": 1537634000,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click on Desktops tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User click on Show all desktops",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 2677601300,
  "status": "passed"
});
formatter.match({
  "location": "RetailPageTestStepDefinitions.user_click_on_Desktops_tab()"
});
formatter.result({
  "duration": 59311900,
  "status": "passed"
});
formatter.match({
  "location": "RetailPageTestStepDefinitions.user_click_on_show_all_desktops()"
});
formatter.result({
  "duration": 979286900,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User add HP LP3065  from Desktops tab to the cart",
  "description": "",
  "id": "desktop-retail-website-feature;user-add-hp-lp3065--from-desktops-tab-to-the-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@addHPLP3065FromDesktopTabToCart"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User click ADD TO CARToption on HP LP3065 item",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User select quantity \u00271\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User click add to Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User should see a message Success: You have added HP LP3065 to your shopping cart!",
  "keyword": "Then "
});
formatter.match({
  "location": "DesktopTestStepDefinitions.user_click_ADD_TO_CARToption_on_HP_LP_item()"
});
formatter.result({
  "duration": 54290100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 22
    }
  ],
  "location": "DesktopTestStepDefinitions.user_select_quantity(String)"
});
formatter.result({
  "duration": 4774333400,
  "status": "passed"
});
formatter.match({
  "location": "DesktopTestStepDefinitions.user_click_add_to_Cart_button()"
});
formatter.result({
  "duration": 386226800,
  "status": "passed"
});
formatter.match({
  "location": "DesktopTestStepDefinitions.user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart()"
});
formatter.result({
  "duration": 346178000,
  "status": "passed"
});
formatter.after({
  "duration": 788104200,
  "status": "passed"
});
});