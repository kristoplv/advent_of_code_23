package day_2;

import java.util.*;
import java.util.AbstractMap.SimpleEntry;

public class Handler {
    private int reds = 12;
    private int greens = 13;
    private int blues = 14;

    private int counted_reds = 0;
    private int counted_greens = 0;
    private int counted_blues = 0;
    private int current_id;

    public int HandlerGo(String input) {
        boolean illegal = false;
        String[] current_game = input.split(":");
        current_id = Integer.parseInt(current_game[0].replaceAll("[^\\d.]", ""));
        String[] arr_of_game = current_game[1].split(";");
        for (int i = 0; i < arr_of_game.length; i++) {
            String[] game = arr_of_game[i].split(",");
            for (int a = 0; a < game.length; a++) {
                String[] locale = game[a].split(" ");
                int val = Integer.parseInt(locale[1]);
                switch (locale[2]) {
                    case "red":
                        if (val > reds) {
                            illegal = true;
                        }
                        break;
                    case "green":
                        if (val > greens) {
                            illegal = true;
                        }
                        break;
                    case "blue":
                        if (val > blues) {
                            illegal = true;
                        }
                        break;

                    default:
                        break;
                }

            }
        }
        if (!illegal) {
            return current_id;
        } else {
            return 0;
        }

    }
}
