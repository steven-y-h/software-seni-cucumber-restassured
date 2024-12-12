@Regression
Feature: Get Current Air Pollution Feature

  @Positive
  Scenario: Get the current air pollution index of Terban, Sleman, Yogyakarta
    Given send "GET" request to "http://api.openweathermap.org/data/2.5/air_pollution" with queryParams
      | lat   | 7.7220                           |
      | lon   | 110.3560                         |
      | appid | 3f6dccd74fd9aa09e246b32fdfe370ce |
    Then the response code should be 200
    And the response should match the expected JSON schema
      | Path | data/jsonSchema/currentAirPollution.json |