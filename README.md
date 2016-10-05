# Card-Game
A terrible game of poker

How to run the game:

1. Import the project into IntelliJ IDEA

2. Run from the project root: `./gradlew Clean and Assemble`

3. Run from the project root: `java -jar build/libs/cardGame-1.0-SNAPSHOT.jar 1000 6`
  
  **Note**: 
  `arg[0]` is the number of games which can be scaled to many more games (1000 default)
  
  `arg[1]` is the number of players which can be scaled to many more players (6 default)

Assumptions:
 
1. We get 2 startup arguments for the number of games and number of players with values > 0.

2. Players are always seated at the same location at the table regardless of how many players.

3. There are no ties. There is always a winner. In the case of a tie, the first player to set the highest number of suited cards wins.