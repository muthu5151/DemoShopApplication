$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DemoShop.feature");
formatter.feature({
  "line": 2,
  "name": "Addding product to my cart/wishlist in Demoshop application",
  "description": "",
  "id": "addding-product-to-my-cart/wishlist-in-demoshop-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DemoShop"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "verify_the_selected_items_in_my_wishlist_\u003cTC_ID\u003e",
  "description": "",
  "id": "addding-product-to-my-cart/wishlist-in-demoshop-application;verify-the-selected-items-in-my-wishlist-\u003ctc-id\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC001"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I add \"\u003citem_count\u003e\" different product to my wish list",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I view my wishlist table",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I find total \"\u003citem_count\u003e\" selected items in my Wishlist",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "addding-product-to-my-cart/wishlist-in-demoshop-application;verify-the-selected-items-in-my-wishlist-\u003ctc-id\u003e;",
  "rows": [
    {
      "cells": [
        "TC_ID",
        "item_count"
      ],
      "line": 11,
      "id": "addding-product-to-my-cart/wishlist-in-demoshop-application;verify-the-selected-items-in-my-wishlist-\u003ctc-id\u003e;;1"
    },
    {
      "cells": [
        "001",
        "4"
      ],
      "line": 12,
      "id": "addding-product-to-my-cart/wishlist-in-demoshop-application;verify-the-selected-items-in-my-wishlist-\u003ctc-id\u003e;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9163283200,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "verify_the_selected_items_in_my_wishlist_001",
  "description": "",
  "id": "addding-product-to-my-cart/wishlist-in-demoshop-application;verify-the-selected-items-in-my-wishlist-\u003ctc-id\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC001"
    },
    {
      "line": 1,
      "name": "@DemoShop"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I add \"4\" different product to my wish list",
  "matchedColumns": [
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I view my wishlist table",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I find total \"4\" selected items in my Wishlist",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 7
    }
  ],
  "location": "DemoshopSteps.i_add_different_product_to_my_wish_list(String)"
});
formatter.result({
  "duration": 2488791100,
  "status": "passed"
});
formatter.match({
  "location": "DemoshopSteps.i_view_my_wishlist_table()"
});
formatter.result({
  "duration": 753152000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 14
    }
  ],
  "location": "DemoshopSteps.i_find_total_selected_items_in_my_Wishlist(String)"
});
formatter.result({
  "duration": 473169200,
  "status": "passed"
});
formatter.after({
  "duration": 941298800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "verify_the_\u003crate\u003e_price_item_in_my_cart_\u003cTC_ID\u003e",
  "description": "",
  "id": "addding-product-to-my-cart/wishlist-in-demoshop-application;verify-the-\u003crate\u003e-price-item-in-my-cart-\u003ctc-id\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@TC002"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I search for \"\u003crate\u003e\" price product",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I am able to add the \"\u003crate\u003e\" price item to my cart",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I am able to verify the item in my cart",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "addding-product-to-my-cart/wishlist-in-demoshop-application;verify-the-\u003crate\u003e-price-item-in-my-cart-\u003ctc-id\u003e;",
  "rows": [
    {
      "cells": [
        "TC_ID",
        "rate"
      ],
      "line": 21,
      "id": "addding-product-to-my-cart/wishlist-in-demoshop-application;verify-the-\u003crate\u003e-price-item-in-my-cart-\u003ctc-id\u003e;;1"
    },
    {
      "cells": [
        "002",
        "lowest"
      ],
      "line": 22,
      "id": "addding-product-to-my-cart/wishlist-in-demoshop-application;verify-the-\u003crate\u003e-price-item-in-my-cart-\u003ctc-id\u003e;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5137872100,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "verify_the_lowest_price_item_in_my_cart_002",
  "description": "",
  "id": "addding-product-to-my-cart/wishlist-in-demoshop-application;verify-the-\u003crate\u003e-price-item-in-my-cart-\u003ctc-id\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@TC002"
    },
    {
      "line": 1,
      "name": "@DemoShop"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I search for \"lowest\" price product",
  "matchedColumns": [
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I am able to add the \"lowest\" price item to my cart",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I am able to verify the item in my cart",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "lowest",
      "offset": 14
    }
  ],
  "location": "DemoshopSteps.i_search_for_price_product(String)"
});
formatter.result({
  "duration": 1218997300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lowest",
      "offset": 22
    }
  ],
  "location": "DemoshopSteps.i_am_able_to_add_the_price_item_to_my_cart(String)"
});
formatter.result({
  "duration": 951990800,
  "status": "passed"
});
formatter.match({
  "location": "DemoshopSteps.i_am_able_to_verify_the_item_in_my_cart()"
});
formatter.result({
  "duration": 1010777000,
  "status": "passed"
});
formatter.after({
  "duration": 909476900,
  "status": "passed"
});
});