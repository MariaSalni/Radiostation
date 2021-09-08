package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSwitchNextRadioStation() {
        Radio radioStation = new Radio ();
        radioStation.setCurrentRadioStation(9);
        radioStation.NextRadioStation();

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchPrevRadioStation() {
        Radio radioStation = new Radio ();
        radioStation.setCurrentRadioStation(0);
        radioStation.PrevRadioStation();

        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldChooseRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(2);
        radioStation.SelectRadioStation();

        int expected = 2;
        int actual = radioStation.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseSoundVolume() {
        Radio radioStation = new Radio();
        radioStation.setSoundVolume(10);
        radioStation.MaxVolumeLevel();

        int expected = 10;
        int actual = radioStation.getSoundVolume();
        assertEquals(expected, actual);

    }

    @Test
    void shouldDecreaseSoundVolume() {
        Radio radioStation = new Radio();
        radioStation.setSoundVolume(0);
        radioStation.MinVolumeLevel();

        int expected = 0;
        int actual = radioStation.getSoundVolume();
        assertEquals(expected, actual);

    }

}