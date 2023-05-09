package ru.netology.Radio.Control;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SoundVolumeLevelTest {
    @Test
    public void setTheVolume() {                        //установить громкость
        SoundVolumeLevel volume = new SoundVolumeLevel();   //новый объект уровень громкости звука
        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolume() {
        SoundVolumeLevel volume = new SoundVolumeLevel();
        volume.setCurrentVolume(99);                   //текущая громкость звука (допустимые значения от 0 до 100)
        volume.increaseVolume();                        //громкость звука увеличить на 1

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeMax() {
        SoundVolumeLevel volume = new SoundVolumeLevel();
        volume.setCurrentVolume(100);                   //текущая громкость звука (допустимые значения от 0 до 100)
        volume.increaseVolume();                        //громкость звука увеличить на 1

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerTheVolume() {
        SoundVolumeLevel volume = new SoundVolumeLevel();
        volume.setCurrentVolume(1);                     //текущая громкость звука (допустимые значения от 0 до 100)
        volume.lowerVolume();                           //громкость звука уменьшить на 1

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerTheVolumeMin() {
        SoundVolumeLevel volume = new SoundVolumeLevel();
        volume.setCurrentVolume(-1);                     //текущая громкость звука (допустимые значения от 0 до 100)
        volume.lowerVolume();                           //громкость звука уменьшить на 1

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
