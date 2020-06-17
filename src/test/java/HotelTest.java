import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private ArrayList<Bedroom> bedrooms;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private ConferenceRoom conferenceRoom3;
    private ArrayList<ConferenceRoom> conferenceRooms;

    @Before
    public void before() {
        bedroom1 = new Bedroom("1", 1, "single");
        bedroom2 = new Bedroom("2", 2, "double");
        bedroom3 = new Bedroom("Honeymoon Suite", 2, "suite");
        bedrooms = new ArrayList<Bedroom>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);
        conferenceRoom1 = new ConferenceRoom("The Macleod Suite", 100, false);
        conferenceRoom2 = new ConferenceRoom("The Campbell Suite", 200, true);
        conferenceRoom3 = new ConferenceRoom("The Hungary Suite", 300, true);
        conferenceRooms = new ArrayList<ConferenceRoom>();
        conferenceRooms.add(conferenceRoom1);
        conferenceRooms.add(conferenceRoom2);
        conferenceRooms.add(conferenceRoom3);
        hotel = new Hotel("The Grand Budapest Hotel", bedrooms, conferenceRooms);
    }

    @Test
    public void hasName() {
        assertEquals("The Grand Budapest Hotel", hotel.getName());
    }

    @Test
    public void hasBedrooms() {
        assertEquals(bedrooms, hotel.getBedrooms());
    }

    @Test
    public void hasConferenceRooms() {
        assertEquals(conferenceRooms, hotel.getConferenceRooms());
    }
}