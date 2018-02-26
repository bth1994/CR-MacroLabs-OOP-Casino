# Link to UML
https://www.draw.io/?state=%7B%22ids%22:%5B%221aWeJrvWc9mUz3M-0Vy4yWdcVE7IEKbao%22%5D,%22action%22:%22open%22,%22userId%22:%22114537038964000705337%22%7D#G1aWeJrvWc9mUz3M-0Vy4yWdcVE7IEKbao



# TC-Casino
* Objective:
  * To create a casino simulation.

## Minimum Viable Product (MVP)
* Your application must have at the very least 3 games:
  * Go Fish a card game
  * BlackJack a card game
  * Craps a dice game

## Specs
* This repo contains a [UML](https://github.com/Zipcoder/CR-MacroLabs-OOP-Casino/blob/master/UML.pdf) to help get you started.
* The project should include some concept of
  * `Player` class
    * `Player` objects should be created upon input from a user.
  * `Game` interface
    * Contract which ensures that a class enforces some aspect of _playing_.
  * `Gamble` interface
    * Contract which ensures that a class enforces some aspect of _waging money_.
  
 

## Developmental Notes
* Go fish is a friendly game and should not involve gambling.
* `BlackJack` and `GoFish` are both Card Games and should therefore inherit from a common `CardGame`.
* Any common logic or fields between the games should live CardGame class, **not** BlackJack **nor** GoFish.
* The UML provided is missing classes, properties, and definitions required to complete this project.
* You must have a completed and approved UML diagram before you proceed to do any development
* You can either work by yourself , or in a group no bigger than 3.
* All public methods should be tested.
