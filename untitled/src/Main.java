// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


// test code for the LED strip
        // good for further refinements

        System.out.println("LED strip app started ...");
// Initialize the RGB
        int pixels = 4;
        final LedStrip ledStrip = new LedStrip(pi4j, pixels, 0.5);

//set them all off, so nothing is shining
        System.out.println("Starting with setting all leds off");
        ledStrip.allOff();

        System.out.println("setting the LEDs to RED");
        ledStrip.setStripColor(LedStrip.PixelColor.RED);
        ledStrip.render();
        delay(3000);

        System.out.println("setting the LEDs to Light Blue");
        ledStrip.setStripColor(LedStrip.PixelColor.LIGHT_BLUE);
        ledStrip.render();
        delay(3000);

        System.out.println("setting the first led to Purple");
        ledStrip.setPixelColor(0, LedStrip.PixelColor.PURPLE);
        ledStrip.render();
        delay(3000);

        System.out.println("setting the brightness to full and just show the first led as White");
        ledStrip.allOff();
        ledStrip.setBrightness(1);
        ledStrip.setPixelColor(0, LedStrip.PixelColor.WHITE);
        ledStrip.render();
        delay(3000);

//finishing and closing
        ledStrip.close();
        System.out.println("closing the app");
        System.out.println("Color "+ ledStrip.getPixelColor(0));

        System.out.println("LED strip app done.");








        /*
  package com.pi4j.catalog.components;

import com.pi4j.catalog.ComponentTest;
import com.pi4j.plugin.mock.provider.spi.MockSpi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

        public class LedStripTest extends ComponentTest {

            private MockSpi spi;
            private LedStrip strip;
            private int pixels;

            @BeforeEach
            public void setUp() {
                this.pixels = 10;
                strip = new LedStrip(pi4j, pixels, 0.5);
                spi = toMock(strip.spi);
            }


            @Test
            public void testSetPixelColor() {
                //when
                strip.allOff();
                strip.setPixelColor(1, LedStrip.PixelColor.YELLOW);

                //then
                assertEquals(LedStrip.PixelColor.YELLOW, strip.getPixelColor(1));
            }

            @Test
            public void testSetStripColor() {
                //when
                strip.allOff();
                strip.setStripColor(LedStrip.PixelColor.YELLOW);

                //then
                assertEquals(LedStrip.PixelColor.YELLOW, strip.getPixelColor(5));
            }

            @Test
            public void testGetNumLEDS() {
                assertEquals(pixels, strip.getNumPixels());
            }

            @Test
            public void testGetPixelChannels() {
                //when
                int red = LedStrip.PixelColor.RED;
                int blue = LedStrip.PixelColor.BLUE;
                int green = LedStrip.PixelColor.GREEN;
                int white = LedStrip.PixelColor.WHITE;

                //then
                assertEquals(LedStrip.PixelColor.getRedComponent(red), 255);
                assertEquals(LedStrip.PixelColor.getGreenComponent(red), 0);
                assertEquals(LedStrip.PixelColor.getBlueComponent(red), 0);

                assertEquals(LedStrip.PixelColor.getRedComponent(green), 0);
                assertEquals(LedStrip.PixelColor.getGreenComponent(green), 255);
                assertEquals(LedStrip.PixelColor.getBlueComponent(green), 0);

                assertEquals(LedStrip.PixelColor.getRedComponent(blue), 0);
                assertEquals(LedStrip.PixelColor.getGreenComponent(blue), 0);
                assertEquals(LedStrip.PixelColor.getBlueComponent(blue), 255);

                assertEquals(255, LedStrip.PixelColor.getRedComponent(white));
                assertEquals(255, LedStrip.PixelColor.getGreenComponent(white));
                assertEquals(255, LedStrip.PixelColor.getBlueComponent(white));
            }
        }
        }
    }

         */
    }
}