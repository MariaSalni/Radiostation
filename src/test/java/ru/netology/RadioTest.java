package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSwitchNextRadioStation() {
        Radio radioStation = new Radio (9, 10,0, 9, 50, 0, 100);
        radioStation.nextRadioStation();
        assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchPrevRadioStation() {
        Radio radioStation = new Radio (0, 10, 0, 9, 50, 0, 100);
        radioStation.prevRadioStation();

        assertEquals(9, radioStation.getCurrentRadioStation());
    }

    @Test
    void shouldChooseRadioStation() {
        Radio radioStation = new Radio(2, 10, 0, 9, 50, 0, 100);

        assertEquals(2, radioStation.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseSoundVolume() {
        Radio radioStation = new Radio(9, 10,0, 10, 50, 0, 100);
        radioStation.maxVolumeLevel();

        assertEquals(51, radioStation.getSoundVolume());

    }

    @Test
    void shouldDecreaseSoundVolume() {
        Radio radioStation = new Radio(9, 10, 0, 9, 50, 0, 100);
        radioStation.minVolumeLevel();

        assertEquals(49, radioStation.getSoundVolume());

    }

    @Test
    void shouldNoArgsConstructor() {
        Radio radioStation = new Radio();

        assertEquals(10, radioStation.getAmountStation());
    }

}