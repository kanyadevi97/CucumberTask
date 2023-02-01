Feature: Verifying Adactin Hotel details

  Scenario Outline: a
    Given User is on the adactin page
    When User should perform login "<userName>" and "<password>"
    And User should click login button
    And User should search a hotel "<location>", "<hotels>", "<roomtype>", "<numberOfRooms>", "<checkInDate>", "<checkOutDate>", "<adultsPerRoom>" and "<childrenPerRoom>"
    And User should select hotel
    And User should book a hotel "<firstName>", "<lastName>", "<billingAddress>", "<creditCardNumber>", "<creditCardType>", "<expiryDateMonth>", "<expiryDateYear>" and "<cvvNumber>"
    And User should print the order number

    Examples: 
      | userName  | password | location | hotels         | roomtype     | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName | lastName | billingAddress | creditCardNumber | creditCardType | expiryDateMonth | expiryDateYear | cvvNumber |
      | kanya1997 | kanya123 | New York | Hotel Sunshine | Super Deluxe | 3 - Three     | 05/01/2023  | 07/01/2023   | 2 - Two       | 0 - None        | kanya     | devi     | Chennai        | 1234123412341234 | VISA           | December        |           2022 |      0213 |

  #| kanya1997 | kanya123 | New York | Hotel Sunshine | Super Deluxe | 3 - Three     | 05/01/2023  | 07/01/2023   | 2 - Two       | 0 - None        | kanya     | devi     | Chennai        | 1234123412341234 | VISA           | December        |           2022 |      0213 |
  #| kanya1997 | kanya123 | New York | Hotel Sunshine | Super Deluxe | 3 - Three     | 05/01/2023  | 07/01/2023   | 2 - Two       | 0 - None        | kanya     | devi     | Chennai        | 1234123412341234 | VISA           | December        |           2022 |      0213 |
  #| kanya1997 | kanya123 | New York | Hotel Sunshine | Super Deluxe | 3 - Three     | 05/01/2023  | 07/01/2023   | 2 - Two       | 0 - None        | kanya     | devi     | Chennai        | 1234123412341234 | VISA           | December        |           2022 |      0213 |
  #| kanya1997 | kanya123 | New York | Hotel Sunshine | Super Deluxe | 3 - Three     | 05/01/2023  | 07/01/2023   | 2 - Two       | 0 - None        | kanya     | devi     | Chennai        | 1234123412341234 | VISA           | December        |           2022 |      0213 |
  #| kanya1997 | kanya123 | New York | Hotel Sunshine | Super Deluxe | 3 - Three     | 05/01/2023  | 07/01/2023   | 2 - Two       | 0 - None        | kanya     | devi     | Chennai        | 1234123412341234 | VISA           | December        |           2022 |      0213 |
  #| kanya1997 | kanya123 | New York | Hotel Sunshine | Super Deluxe | 3 - Three     | 05/01/2023  | 07/01/2023   | 2 - Two       | 0 - None        | kanya     | devi     | Chennai        | 1234123412341234 | VISA           | December        |           2022 |      0213 |
  #| kanya1997 | kanya123 | New York | Hotel Sunshine | Super Deluxe | 3 - Three     | 05/01/2023  | 07/01/2023   | 2 - Two       | 0 - None        | kanya     | devi     | Chennai        | 1234123412341234 | VISA           | December        |           2022 |      0213 |
  #| kanya1997 | kanya123 | New York | Hotel Sunshine | Super Deluxe | 3 - Three     | 05/01/2023  | 07/01/2023   | 2 - Two       | 0 - None        | kanya     | devi     | Chennai        | 1234123412341234 | VISA           | December        |           2022 |      0213 |
  #| kanya1997 | kanya123 | New York | Hotel Sunshine | Super Deluxe | 3 - Three     | 05/01/2023  | 07/01/2023   | 2 - Two       | 0 - None        | kanya     | devi     | Chennai        | 1234123412341234 | VISA           | December        |           2022 |      0213 |
  
  
  Scenario Outline: b
    Given User is on the adactin page
    When User should perform login "<userName>" and "<password>"
    And User should click login button
    And User should search a hotel "<location>", "<hotels>", "<roomtype>", "<numberOfRooms>", "<checkInDate>", "<checkOutDate>", "<adultsPerRoom>" and "<childrenPerRoom>"
    And User should select hotel
    And User should book a hotel "<firstName>", "<lastName>", "<billingAddress>", "<creditCardNumber>", "<creditCardType>", "<expiryDateMonth>", "<expiryDateYear>" and "<cvvNumber>"
    And User should print the order number

    Examples: 
      | userName  | password | location | hotels         | roomtype     | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName | lastName | billingAddress | creditCardNumber | creditCardType | expiryDateMonth | expiryDateYear | cvvNumber |
      | kanya1997 | kanya123 | New York | Hotel Sunshine | Super Deluxe | 3 - Three     | 05/01/2023  | 07/01/2023   | 2 - Two       | 0 - None        | kaira     | tagore     | Chennai        | 1234123412341234 | VISA           | December        |           2022 |      0213 |
