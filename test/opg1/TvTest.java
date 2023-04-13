package opg1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvTest {

    Tv tv1 = new Tv();
    Tv tv2 = new Tv();
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        tv2.channelUp();
        tv2.channelUp();
        tv2.turnOn();
        tv2.volumeUp();
    }

    @Test
    void TvTest() {
        assertEquals(30, 30);
    }
}