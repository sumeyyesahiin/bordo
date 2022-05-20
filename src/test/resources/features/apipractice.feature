@APITest
Feature:Api Test

  Scenario:status code assert
    Given Kullanici "swagger.json" endpointine istek atar.
    And Status code 200 assert edilmesi.

  Scenario:clients assert
    Given Kullanici "gen/clients" endpointine istek atar.
    And Swagger client sayisi olan 56 ile response donen client sayisi assert edilmesi.