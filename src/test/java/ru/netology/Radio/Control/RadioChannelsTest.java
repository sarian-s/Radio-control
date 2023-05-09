package ru.netology.Radio.Control;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioChannelsTest {
    @Test
    public void channelNumber() {               //установить текущий номер радиостанции
        RadioChannels channel = new RadioChannels();              //новый объект Radio
        channel.setTheRadioStationNumber(5);  //допустимые номера радиостанций от 0 до 9

        int expected = 5;                       //ожидаемый номер радиостанции
        int actual = channel.getCurrentRadioStationNumber();//фактический номер радиостанции

        Assertions.assertEquals(expected, actual);//сравнение ОР и ФР
    }
    @Test
    public void channelNumberLowerBound() {               //установить текущий номер радиостанции нижняя граница
        RadioChannels channel = new RadioChannels ();              //новый объект Radio
        channel.setTheRadioStationNumber(0);  //допустимые номера радиостанций от 0 до 9

        int expected = 0;                       //ожидаемый номер радиостанции
        int actual = channel.getCurrentRadioStationNumber();//фактический номер радиостанции

        Assertions.assertEquals(expected, actual);//сравнение ОР и ФР
    }
    @Test
    public void channelNumberUpperBound() {               //установить текущий номер радиостанции верхняя граница
        RadioChannels  channel = new RadioChannels ();              //новый объект Radio
        channel.setTheRadioStationNumber(9);  //допустимые номера радиостанций от 0 до 9

        int expected = 9;                       //ожидаемый номер радиостанции
        int actual = channel.getCurrentRadioStationNumber();//фактический номер радиостанции

        Assertions.assertEquals(expected, actual);//сравнение ОР и ФР
    }

    @Test
    public void shouldNotSetStationNumberAboveMax() {//установить текущий номер радиостанции выше максимального
        RadioChannels  channel = new RadioChannels ();
        channel.setTheRadioStationNumber(10);         //недопустимые номера: кроме от 0 до 9

        int expected = 0;
        int actual = channel.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberAboveMin() {//установить текущий номер радиостанции ниже минимального
        RadioChannels  channel = new RadioChannels ();
        channel.setTheRadioStationNumber(-1);         //недопустимые номера: кроме от 0 до 9

        int expected = 0;
        int actual = channel.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannel() {                      //установить текущий номер на следующий номер
        RadioChannels  channel = new RadioChannels ();
        channel.setCurrentRadioStationNumber(6);
        channel.next1ChannelNumber();

        int expected = 7;
        int actual = channel.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextChannelCarousel() {                      //установить текущий номер на следующий номер по карусели
        RadioChannels  channel = new RadioChannels ();
        channel.setCurrentRadioStationNumber(9);              //установить текущий номер 9
        channel.next1ChannelNumber();

        int expected = 0;
        int actual = channel.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChannel() {                      //установить текущий номер на предыдущий номер
        RadioChannels  channel = new RadioChannels ();
        channel.setCurrentRadioStationNumber(7);
        channel.prev1ChannelNumber();

        int expected = 6;
        int actual = channel.getCurrentRadioStationNumber();
        Assertions.assertEquals(6, channel.getCurrentRadioStationNumber());
    }
    @Test
    public void prevChannelCarousel() {                      //установить текущий номер на предыдущий номер по карусели
        RadioChannels  channel = new RadioChannels ();
        channel.setCurrentRadioStationNumber(0);      //установить текущий номер 0
        channel.prev1ChannelNumber();

        Assertions.assertEquals(9, channel.getCurrentRadioStationNumber());
    }

}
