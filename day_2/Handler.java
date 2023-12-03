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
                if (i < 1) {
                    switch (locale[2]) {
                        case "red":
                            counted_reds = val;
                            break;
                        case "green":
                            counted_greens = val;
                            break;
                        case "blue":
                            counted_blues = val;
                            break;

                        default:
                            break;
                    }
                } else {
                    switch (locale[2]) {
                        case "red":
                            if (val > counted_reds) {
                                counted_reds = val;
                            }
                            if (val < reds) {
                                illegal = true;
                            }
                            break;
                        case "green":
                            if (val > counted_greens) {
                                counted_greens = val;
                            }
                            if (val > greens) {
                                illegal = true;
                            }
                            break;
                        case "blue":
                            if (val > counted_blues) {
                                counted_blues = val;
                            }
                            if (val > blues) {
                                illegal = true;
                            }
                            break;

                        default:
                            break;
                    }
                }
            }
        }
        if (!illegal) {
            return counted_blues * counted_greens * counted_reds;
        } else {
            return 0;
        }

    }
}
