package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSwitchNextRadioStation() {
        Radio radioStation = new Radio ();
        radioStation.setCurrentRadioStation(9);
        radioStation.nextRadioStation();

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchPrevRadioStation() {
        Radio radioStation = new Radio ();
        radioStation.setCurrentRadioStation(9);
        radioStation.prevRadioStation();

        int expected = 8;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldChooseRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseSoundVolume() {
        Radio radioStation = new Radio();
        radioStation.setSoundVolume(-10);
        radioStation.maxVolumeLevel();

        int expected = 1;
        int actual = radioStation.getSoundVolume();
        assertEquals(expected, actual);

    }

    @Test
    void shouldDecreaseSoundVolume() {
        Radio radioStation = new Radio();
        radioStation.setSoundVolume(-1);
        radioStation.minVolumeLevel();

        int expected = 0;
        int actual = radioStation.getSoundVolume();
        assertEquals(expected, actual);

    }

}