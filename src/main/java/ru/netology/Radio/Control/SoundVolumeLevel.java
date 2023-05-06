package ru.netology.Radio.Control;

public class SoundVolumeLevel {
    private int currentVolume;      //текущий уровень громкости звука

    public int getCurrentVolume() { //отдать текущий уровень громкости звука
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {//установить уровень громкости
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
    public void increaseVolume () {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
    public void lowerVolume () {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}





