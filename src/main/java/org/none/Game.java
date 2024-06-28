package org.none;

import java.util.Scanner;

public class Game {
    //Start new game
    Character player = new Character();

    //main game loop
    while(true) {
        Scanner scanner = new Scanner(System.in);

        if (player.getName() == null) {
            player.characterLoop();
        } else if () {
            System.out.print("> ");
            String userInput = scanner.nextLine();
        }
    }
}
