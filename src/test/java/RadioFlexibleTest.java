import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioFlexibleTest {

    @Test
    public void testValidStation() {
        Radio radio = new Radio(100);

        radio.setCurrentStation(50);

        int expected = 50;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationMin() {
        Radio radio = new Radio(100);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationOverMin() {
        Radio radio = new Radio(100);

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationMax() {
        Radio radio = new Radio(100);

        radio.setCurrentStation(99);

        int expected = 99;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationUnderMax() {
        Radio radio = new Radio(100);

        radio.setCurrentStation(98);

        int expected = 98;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationValid() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(50);

        radio.nextStation();

        int expected = 51;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationMin() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationOverMin() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(1);

        radio.nextStation();

        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationMax() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(99);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationUnderMax() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(98);

        radio.nextStation();

        int expected = 99;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationValid() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(50);

        radio.prevStation();

        int expected = 49;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationMin() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 99;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationOverMin() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationMax() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(99);

        radio.prevStation();

        int expected = 98;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationUnderMax() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(98);

        radio.prevStation();

        int expected = 97;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    }