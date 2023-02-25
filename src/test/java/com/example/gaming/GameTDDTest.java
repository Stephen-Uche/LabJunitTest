package com.example.gaming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTDDTest {

    private GameTDD gameTDD;

    @BeforeEach
    void setUp() {

        gameTDD = new GameTDD();

    }

    @Test
    void spareIsToKnockDownAllPinsWithTwoRolls() {

        //Given
        gameTDD.roll(2);
        gameTDD.roll(8);
        //When
        //Then
        assertEquals(1, gameTDD.spare = 1);
    }
    @Test
    void strikeIsToKnockDownAllPinsWithOneRolls() {

    }
}
