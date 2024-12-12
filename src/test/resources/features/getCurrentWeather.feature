@Regression
Feature: Get Current Weather Feature

  @Positive @getCurrentWeather
  Scenario: Get the current weather data of Terban, Sleman, Yogyakarta
    When send "GET" request to "http://api.openweathermap.org/data/2.5/weather" with queryParams
      | lat   | 7.7220                           |
      | lon   | 110.3560                         |
      | appid | 3f6dccd74fd9aa09e246b32fdfe370ce |
      | mode  |                                  |
      | units |                                  |
      | lang  |                                  |
    Then the response code should be 200
    And the response should match the expected JSON schema
      | Path | data/jsonSchema/currentWeather.json |