# Magical Arena Game

## Overview

This is a simple console-based magical arena game implemented in Java. Two players take turns attacking each other until one of them wins or the game ends in a draw.

## Classes

### Main
- **Purpose**: Serves as the entry point of the application. It initializes players, sets up the game, and starts the `MagicalArena`.
- **Key Responsibilities**: 
  - Gathers player information using `PlayerInitializer`.
  - Initializes and starts the game using `MagicalArena`.

### PlayerInitializer
- **Purpose**: Handles input and validation for player information.
- **Key Responsibilities**:
  - Collects and validates player details such as name, health, strength, and attack.
  - Ensures that the attributes are valid positive integers.

### Player
- **Purpose**: Represents a player in the game.
- **Key Responsibilities**:
  - Stores attributes like name, health, strength, and attack.
  - Provides methods to access these attributes.
  - Simulates an attack on another player, calculating damage and then reduces the player's health by specified damage

### MagicalArena
- **Purpose**: Manages the game logic and flow between two players.
- **Key Responsibilities**:
  - Determines which player attacks first based on health or randomly if tied.
  - Starts and controls the game flow, displaying relevant information about the game state.

## To execute the game 

1. Extract Zip folder
2. Navigate to the `src/main` directory of the extracted project.
3. Compile the `Main.java` file using the `javac` command:
     ```
     javac Main.java
     ```
4. Execute the compiled Java program using the `java` command:
     ```
     java Main
     ```

5.  Follow the prompts in the terminal to enter details for Player A and Player B as the game initializes.
   - Enjoy playing the Magical Arena game!

Make sure you have Java Development Kit (JDK) installed on your system and configured in your PATH environment variable to successfully compile and run the Java program.