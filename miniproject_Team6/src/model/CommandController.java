package model;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public enum CommandController {
    FIRST("1"),
    SECOND("2"),
    THIRD("3"),
    QUIT("Q");

    private static final String INVALID_COMMAND_MSG = "¬ë°”ë¥´ì Šì …ë ¥…ë‹ˆ";
    private final String command;

    public static CommandController from(String command){
        return Arrays.stream(values())
                .filter(commandController -> commandController.command.equals(command))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(INVALID_COMMAND_MSG));
    }
    public boolean isNotQuit() { 
    	return this != QUIT; }


}
