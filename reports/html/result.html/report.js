$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("boost.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: ishan.s@outlook.com"
    },
    {
      "line": 2,
      "value": "#Created on: January 13, 2017"
    },
    {
      "line": 3,
      "value": "#Summary: This feature file describes the \u0027Boost\u0027 feature of \u0027All-In-One Toolbox\u0027 app."
    }
  ],
  "line": 6,
  "name": "Boost",
  "description": "User should able to improve system performance by using boost feature.",
  "id": "boost",
  "keyword": "Feature",
  "tags": [
    {
      "line": 5,
      "name": "@boost"
    }
  ]
});
formatter.scenario({
  "line": 10,
  "name": "Boost feature should clear unused app data from RAM",
  "description": "",
  "id": "boost;boost-feature-should-clear-unused-app-data-from-ram",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@regression"
    },
    {
      "line": 9,
      "name": "@ss"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user is on boost page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user clicked on boost button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user should get message system performance is boost",
  "keyword": "Then "
});
formatter.match({
  "location": "BoostStepDefs.user_is_on_boost_page()"
});
formatter.result({
  "duration": 2701215586,
  "status": "passed"
});
formatter.match({
  "location": "BoostStepDefs.user_clicked_on_boost_button()"
});
formatter.result({
  "duration": 23583,
  "status": "passed"
});
formatter.match({
  "location": "BoostStepDefs.user_should_get_message_system_performance_is_boost()"
});
formatter.result({
  "duration": 21923,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 3270645280,
  "status": "passed"
});
formatter.after({
  "duration": 1823128293,
  "status": "passed"
});
formatter.uri("clean.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: ishan.s@outlook.com"
    },
    {
      "line": 2,
      "value": "#Created on: January 12, 2017"
    },
    {
      "line": 3,
      "value": "#Summary: This feature file describes the \u0027Clean\u0027 feature of \u0027All-In-One Toolbox\u0027 app."
    }
  ],
  "line": 6,
  "name": "Clean",
  "description": "User should able to improve system performance by using \u0027Clean\u0027 feature.",
  "id": "clean",
  "keyword": "Feature",
  "tags": [
    {
      "line": 5,
      "name": "@clean"
    }
  ]
});
formatter.scenario({
  "line": 10,
  "name": "Clean feature should clear unused app data from RAM",
  "description": "",
  "id": "clean;clean-feature-should-clear-unused-app-data-from-ram",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@regression"
    },
    {
      "line": 9,
      "name": "@ss"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user is on clean page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user clicked on clean button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user should get message system performance is improved",
  "keyword": "Then "
});
formatter.match({
  "location": "CleanStepDefs.user_is_on_boost_page()"
});
formatter.result({
  "duration": 2392278985,
  "status": "passed"
});
formatter.match({
  "location": "CleanStepDefs.user_clicked_on_boost_selected_button()"
});
formatter.result({
  "duration": 10032974148,
  "status": "passed"
});
formatter.match({
  "location": "CleanStepDefs.user_should_get_message_system_performance_is_improved()"
});
formatter.result({
  "duration": 52070,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 2259469640,
  "status": "passed"
});
formatter.after({
  "duration": 4714745952,
  "status": "passed"
});
formatter.uri("toolbox/batch_uninstall.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: ishan.s@outlook.com"
    },
    {
      "line": 2,
      "value": "#Creation date: December 30, 2016"
    },
    {
      "line": 3,
      "value": "#Summary: This feature file depicts the \u0027Batch Uninstall\u0027 feature of the \u0027All In One Toolbox\u0027 app with concrete scenarios describing feature behavior."
    }
  ],
  "line": 6,
  "name": "Batch Uninstall",
  "description": "User should able to uninstall multiple apps in one go\nUser should able to search an app by name\nBy default apps in batch uninstall page should be sorted by name\nUser should able to sort apps by size or install time in batch uninstall page\nHeader of batch uninstall page should show number of apps currently installed and total space occupied by those",
  "id": "batch-uninstall",
  "keyword": "Feature",
  "tags": [
    {
      "line": 5,
      "name": "@batch_uninstall"
    }
  ]
});
formatter.scenario({
  "line": 14,
  "name": "Batch uninstall",
  "description": "",
  "id": "batch-uninstall;batch-uninstall",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user is on batch uninstall page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user select below apps",
  "rows": [
    {
      "cells": [
        "App Name"
      ],
      "line": 17
    },
    {
      "cells": [
        "PumpCurves"
      ],
      "line": 18
    },
    {
      "cells": [
        "Selenium Tutorial"
      ],
      "line": 19
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "click on uninstall selected button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "accept all confirmations",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user get uninstall finished message",
  "keyword": "Then "
});
formatter.match({
  "location": "BatchUninstallStepDefs.user_is_on_batch_uninstall_page()"
});
formatter.result({
  "duration": 3455016421,
  "status": "passed"
});
formatter.match({
  "location": "BatchUninstallStepDefs.user_selected_below_apps(DataTable)"
});
formatter.result({
  "duration": 20295735995,
  "status": "passed"
});
formatter.match({
  "location": "BatchUninstallStepDefs.click_on_uninstall_selected_button()"
});
formatter.result({
  "duration": 487723292,
  "status": "passed"
});
formatter.match({
  "location": "BatchUninstallStepDefs.accept_all_confirmations()"
});
formatter.result({
  "duration": 3612633818,
  "status": "passed"
});
formatter.match({
  "location": "BatchUninstallStepDefs.user_get_uninstall_finished_message()"
});
formatter.result({
  "duration": 31070,
  "status": "passed"
});
formatter.after({
  "duration": 4245281198,
  "status": "passed"
});
formatter.after({
  "duration": 458059662,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Batch uninstall number of apps selected count",
  "description": "",
  "id": "batch-uninstall;batch-uninstall-number-of-apps-selected-count",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "user is on batch uninstall page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "user select below apps",
  "rows": [
    {
      "cells": [
        "App Name"
      ],
      "line": 28
    },
    {
      "cells": [
        "Google Hindi Input"
      ],
      "line": 29
    },
    {
      "cells": [
        "mab"
      ],
      "line": 30
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "number of apps selected count is displayed on the uninstall selected button",
  "keyword": "Then "
});
formatter.match({
  "location": "BatchUninstallStepDefs.user_is_on_batch_uninstall_page()"
});
formatter.result({
  "duration": 3719651110,
  "status": "passed"
});
formatter.match({
  "location": "BatchUninstallStepDefs.user_selected_below_apps(DataTable)"
});
formatter.result({
  "duration": 32513134430,
  "status": "passed"
});
formatter.match({
  "location": "BatchUninstallStepDefs.number_of_apps_selected_count_is_displayed_on_the_uninstall_selected_button()"
});
formatter.result({
  "duration": 162450298,
  "status": "passed"
});
formatter.after({
  "duration": 3382154898,
  "status": "passed"
});
formatter.after({
  "duration": 508622178,
  "status": "passed"
});
});