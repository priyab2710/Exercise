$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("addBankAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Add bank account",
  "description": "",
  "id": "add-bank-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 2,
      "value": "#\tUser Story"
    },
    {
      "line": 3,
      "value": "#   As a Xero User,"
    },
    {
      "line": 4,
      "value": "#\tIn order to manage my business successfully,"
    },
    {
      "line": 5,
      "value": "#\tI want to be able to add an �ANZ (NZ)� bank account inside any Xero Organisation."
    }
  ],
  "line": 7,
  "name": "",
  "description": "",
  "id": "add-bank-account;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "Xero user is logged in with correct \"priyab2710@gmail.com\" and \"Saurabh#7\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Xero user has organisation added and selects the existing organization \"Priya Test\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "add bank account options is available to user and is able to click on link for \"Priya Test\" organization",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is able to add \"ANZ (NZ)\" bank account with \u003caccount_name\u003e and \u003caccount_type\u003e and \u003caccount_number\u003e",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "add-bank-account;;",
  "rows": [
    {
      "cells": [
        "account_name",
        "account_type",
        "account_number"
      ],
      "line": 14,
      "id": "add-bank-account;;;1"
    },
    {
      "cells": [
        "Xero Everyday 01",
        "Everyday",
        "01045667789"
      ],
      "line": 15,
      "id": "add-bank-account;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8218657900,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "",
  "description": "",
  "id": "add-bank-account;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "Xero user is logged in with correct \"priyab2710@gmail.com\" and \"Saurabh#7\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Xero user has organisation added and selects the existing organization \"Priya Test\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "add bank account options is available to user and is able to click on link for \"Priya Test\" organization",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is able to add \"ANZ (NZ)\" bank account with Xero Everyday 01 and Everyday and 01045667789",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "priyab2710@gmail.com",
      "offset": 37
    },
    {
      "val": "Saurabh#7",
      "offset": 64
    }
  ],
  "location": "StepDefinition.xero_user_is_logged_in_with_correct_something_and_something(String,String)"
});
formatter.result({
  "duration": 11190932300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Priya Test",
      "offset": 72
    }
  ],
  "location": "StepDefinition.xero_user_has_organisation_added_and_selects_the_existing_organization_something(String)"
});
formatter.result({
  "duration": 10460862000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Priya Test",
      "offset": 80
    }
  ],
  "location": "StepDefinition.add_bank_account_options_is_available_to_user_and_is_able_to_click_on_link_for_something_organization(String)"
});
formatter.result({
  "duration": 2339095000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ANZ (NZ)",
      "offset": 21
    },
    {
      "val": "Xero Everyday 01",
      "offset": 49
    },
    {
      "val": "Everyday",
      "offset": 70
    },
    {
      "val": "01045667789",
      "offset": 83
    }
  ],
  "location": "StepDefinition.user_is_able_to_add_something_bank_account_with_and_and(String,String,String,String)"
});
formatter.result({
  "duration": 18290723300,
  "status": "passed"
});
formatter.after({
  "duration": 2391591100,
  "status": "passed"
});
});