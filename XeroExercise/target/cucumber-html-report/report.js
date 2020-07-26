$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("addBankAccount.feature");
formatter.feature({
  "line": 1,
  "name": "As a Xero User, In order to manage my business successfully, I want to be able to add an �ANZ (NZ)� bank account inside any Xero Organisation.",
  "description": "",
  "id": "as-a-xero-user,-in-order-to-manage-my-business-successfully,-i-want-to-be-able-to-add-an-�anz-(nz)�-bank-account-inside-any-xero-organisation.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "",
  "description": "",
  "id": "as-a-xero-user,-in-order-to-manage-my-business-successfully,-i-want-to-be-able-to-add-an-�anz-(nz)�-bank-account-inside-any-xero-organisation.;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Xero user is logged in with correct \"priyab2710@gmail.com\" and \"Xeroqa@27\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Xero user has organisation added and selects the existing organization \"Priya Test\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "add bank account options is available to user and is able to click on link for \"Priya Test\" organization",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user is able to add \"ANZ (NZ)\" bank account with \u003caccount_name\u003e and \u003caccount_type\u003e and \u003caccount_number\u003e",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "as-a-xero-user,-in-order-to-manage-my-business-successfully,-i-want-to-be-able-to-add-an-�anz-(nz)�-bank-account-inside-any-xero-organisation.;;",
  "rows": [
    {
      "cells": [
        "account_name",
        "account_type",
        "account_number"
      ],
      "line": 10,
      "id": "as-a-xero-user,-in-order-to-manage-my-business-successfully,-i-want-to-be-able-to-add-an-�anz-(nz)�-bank-account-inside-any-xero-organisation.;;;1"
    },
    {
      "cells": [
        "Test Everyday",
        "Everyday",
        "01045667789"
      ],
      "line": 11,
      "id": "as-a-xero-user,-in-order-to-manage-my-business-successfully,-i-want-to-be-able-to-add-an-�anz-(nz)�-bank-account-inside-any-xero-organisation.;;;2"
    },
    {
      "cells": [
        "Test Loan",
        "Loan",
        "99609090909"
      ],
      "line": 12,
      "id": "as-a-xero-user,-in-order-to-manage-my-business-successfully,-i-want-to-be-able-to-add-an-�anz-(nz)�-bank-account-inside-any-xero-organisation.;;;3"
    },
    {
      "cells": [
        "Test Deposit",
        "Term Deposit",
        "4567895667"
      ],
      "line": 13,
      "id": "as-a-xero-user,-in-order-to-manage-my-business-successfully,-i-want-to-be-able-to-add-an-�anz-(nz)�-bank-account-inside-any-xero-organisation.;;;4"
    },
    {
      "cells": [
        "Test Other",
        "Other",
        "1111222"
      ],
      "line": 14,
      "id": "as-a-xero-user,-in-order-to-manage-my-business-successfully,-i-want-to-be-able-to-add-an-�anz-(nz)�-bank-account-inside-any-xero-organisation.;;;5"
    },
    {
      "cells": [
        "Test Credit Card",
        "Credit Card",
        "4555"
      ],
      "line": 15,
      "id": "as-a-xero-user,-in-order-to-manage-my-business-successfully,-i-want-to-be-able-to-add-an-�anz-(nz)�-bank-account-inside-any-xero-organisation.;;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8130963600,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "",
  "description": "",
  "id": "as-a-xero-user,-in-order-to-manage-my-business-successfully,-i-want-to-be-able-to-add-an-�anz-(nz)�-bank-account-inside-any-xero-organisation.;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Xero user is logged in with correct \"priyab2710@gmail.com\" and \"Xeroqa@27\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Xero user has organisation added and selects the existing organization \"Priya Test\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "add bank account options is available to user and is able to click on link for \"Priya Test\" organization",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user is able to add \"ANZ (NZ)\" bank account with Test Everyday and Everyday and 01045667789",
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
      "val": "Xeroqa@27",
      "offset": 64
    }
  ],
  "location": "StepDefinition.xero_user_is_logged_in_with_correct_something_and_something(String,String)"
});
formatter.result({
  "duration": 10034647700,
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
  "duration": 8891011000,
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
  "duration": 2176167300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ANZ (NZ)",
      "offset": 21
    },
    {
      "val": "Test Everyday",
      "offset": 49
    },
    {
      "val": "Everyday",
      "offset": 67
    },
    {
      "val": "01045667789",
      "offset": 80
    }
  ],
  "location": "StepDefinition.user_is_able_to_add_something_bank_account_with_and_and(String,String,String,String)"
});
formatter.result({
  "duration": 21548295700,
  "status": "passed"
});
formatter.after({
  "duration": 2258723900,
  "status": "passed"
});
formatter.before({
  "duration": 5590403800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "",
  "description": "",
  "id": "as-a-xero-user,-in-order-to-manage-my-business-successfully,-i-want-to-be-able-to-add-an-�anz-(nz)�-bank-account-inside-any-xero-organisation.;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Xero user is logged in with correct \"priyab2710@gmail.com\" and \"Xeroqa@27\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Xero user has organisation added and selects the existing organization \"Priya Test\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "add bank account options is available to user and is able to click on link for \"Priya Test\" organization",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user is able to add \"ANZ (NZ)\" bank account with Test Loan and Loan and 99609090909",
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
      "val": "Xeroqa@27",
      "offset": 64
    }
  ],
  "location": "StepDefinition.xero_user_is_logged_in_with_correct_something_and_something(String,String)"
});
formatter.result({
  "duration": 10147274700,
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
  "duration": 8332188900,
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
  "duration": 2166277700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ANZ (NZ)",
      "offset": 21
    },
    {
      "val": "Test Loan",
      "offset": 49
    },
    {
      "val": "Loan",
      "offset": 63
    },
    {
      "val": "99609090909",
      "offset": 72
    }
  ],
  "location": "StepDefinition.user_is_able_to_add_something_bank_account_with_and_and(String,String,String,String)"
});
formatter.result({
  "duration": 21380076400,
  "status": "passed"
});
formatter.after({
  "duration": 1147538900,
  "status": "passed"
});
formatter.before({
  "duration": 5570929300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "",
  "description": "",
  "id": "as-a-xero-user,-in-order-to-manage-my-business-successfully,-i-want-to-be-able-to-add-an-�anz-(nz)�-bank-account-inside-any-xero-organisation.;;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Xero user is logged in with correct \"priyab2710@gmail.com\" and \"Xeroqa@27\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Xero user has organisation added and selects the existing organization \"Priya Test\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "add bank account options is available to user and is able to click on link for \"Priya Test\" organization",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user is able to add \"ANZ (NZ)\" bank account with Test Deposit and Term Deposit and 4567895667",
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
      "val": "Xeroqa@27",
      "offset": 64
    }
  ],
  "location": "StepDefinition.xero_user_is_logged_in_with_correct_something_and_something(String,String)"
});
formatter.result({
  "duration": 10279256700,
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
  "duration": 8830203800,
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
  "duration": 2175599300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ANZ (NZ)",
      "offset": 21
    },
    {
      "val": "Test Deposit",
      "offset": 49
    },
    {
      "val": "Term Deposit",
      "offset": 66
    },
    {
      "val": "4567895667",
      "offset": 83
    }
  ],
  "location": "StepDefinition.user_is_able_to_add_something_bank_account_with_and_and(String,String,String,String)"
});
formatter.result({
  "duration": 20969759300,
  "status": "passed"
});
formatter.after({
  "duration": 990961400,
  "status": "passed"
});
formatter.before({
  "duration": 5589185000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "",
  "description": "",
  "id": "as-a-xero-user,-in-order-to-manage-my-business-successfully,-i-want-to-be-able-to-add-an-�anz-(nz)�-bank-account-inside-any-xero-organisation.;;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Xero user is logged in with correct \"priyab2710@gmail.com\" and \"Xeroqa@27\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Xero user has organisation added and selects the existing organization \"Priya Test\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "add bank account options is available to user and is able to click on link for \"Priya Test\" organization",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user is able to add \"ANZ (NZ)\" bank account with Test Other and Other and 1111222",
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
      "val": "Xeroqa@27",
      "offset": 64
    }
  ],
  "location": "StepDefinition.xero_user_is_logged_in_with_correct_something_and_something(String,String)"
});
formatter.result({
  "duration": 10591260300,
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
  "duration": 8936107800,
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
  "duration": 2179076500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ANZ (NZ)",
      "offset": 21
    },
    {
      "val": "Test Other",
      "offset": 49
    },
    {
      "val": "Other",
      "offset": 64
    },
    {
      "val": "1111222",
      "offset": 74
    }
  ],
  "location": "StepDefinition.user_is_able_to_add_something_bank_account_with_and_and(String,String,String,String)"
});
formatter.result({
  "duration": 7410450300,
  "status": "passed"
});
formatter.after({
  "duration": 962990900,
  "status": "passed"
});
formatter.before({
  "duration": 5577486800,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "",
  "description": "",
  "id": "as-a-xero-user,-in-order-to-manage-my-business-successfully,-i-want-to-be-able-to-add-an-�anz-(nz)�-bank-account-inside-any-xero-organisation.;;;6",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Xero user is logged in with correct \"priyab2710@gmail.com\" and \"Xeroqa@27\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Xero user has organisation added and selects the existing organization \"Priya Test\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "add bank account options is available to user and is able to click on link for \"Priya Test\" organization",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user is able to add \"ANZ (NZ)\" bank account with Test Credit Card and Credit Card and 4555",
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
      "val": "Xeroqa@27",
      "offset": 64
    }
  ],
  "location": "StepDefinition.xero_user_is_logged_in_with_correct_something_and_something(String,String)"
});
formatter.result({
  "duration": 10074970800,
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
  "duration": 8910440500,
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
  "duration": 2193135000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ANZ (NZ)",
      "offset": 21
    },
    {
      "val": "Test Credit Card",
      "offset": 49
    },
    {
      "val": "Credit Card",
      "offset": 70
    },
    {
      "val": "4555",
      "offset": 86
    }
  ],
  "location": "StepDefinition.user_is_able_to_add_something_bank_account_with_and_and(String,String,String,String)"
});
formatter.result({
  "duration": 21696427100,
  "status": "passed"
});
formatter.after({
  "duration": 1001867000,
  "status": "passed"
});
});