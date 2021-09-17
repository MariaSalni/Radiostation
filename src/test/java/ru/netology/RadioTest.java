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
        radioStation.setCurrentRadioStation(0);
        radioStation.prevRadioStation();

        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldChooseRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(2);

        int expected = 2;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseSoundVolume() {
        Radio radioStation = new Radio();
        radioStation.setSoundVolume(10);
        radioStation.maxVolumeLevel();

        int expected = 10;
        int actual = radioStation.getSoundVolume();
        assertEquals(expected, actual);

    }

    @Test
    void shouldDecreaseSoundVolume() {
        Radio radioStation = new Radio();
        radioStation.setSoundVolume(0);
        radioStation.minVolumeLevel();

        int expected = 0;
        int actual = radioStation.getSoundVolume();
        assertEquals(expected, actual);

    }

}