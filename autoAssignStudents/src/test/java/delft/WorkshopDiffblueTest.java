package delft;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class WorkshopDiffblueTest {
    /**
     * Test {@link Workshop#Workshop(int, String, Map)}.
     *
     * <p>Method under test: {@link Workshop#Workshop(int, String, Map)}
     */
    @Test
    @DisplayName("Test new Workshop(int, String, Map)")
    @Tag("MaintainedByDiffblue")
    void testNewWorkshop() {
        // Arrange and Act
        Workshop actualWorkshop = new Workshop(1, "Name", new HashMap<>());

        // Assert
        assertEquals("Name", actualWorkshop.getName());
        assertEquals(1, actualWorkshop.getId());
        assertTrue(actualWorkshop.getSpotsPerDate().isEmpty());
    }

    /**
     * Test {@link Workshop#getSpotsPerDate()}.
     *
     * <p>Method under test: {@link Workshop#getSpotsPerDate()}
     */
    @Test
    @DisplayName("Test getSpotsPerDate()")
    @Tag("MaintainedByDiffblue")
    void testGetSpotsPerDate() {
        // Arrange
        Workshop workshop = new Workshop(1, "Name", new HashMap<>());

        // Act and Assert
        assertTrue(workshop.getSpotsPerDate().isEmpty());
    }

    /**
     * Test getters and setters.
     *
     * <p>Methods under test:
     *
     * <ul>
     *   <li>{@link Workshop#getId()}
     *   <li>{@link Workshop#getName()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    void testGettersAndSetters() {
        // Arrange
        Workshop workshop = new Workshop(1, "Name", new HashMap<>());

        // Act
        int actualId = workshop.getId();

        // Assert
        assertEquals("Name", workshop.getName());
        assertEquals(1, actualId);
    }

    /**
     * Test {@link Workshop#hasAvailableDate()}.
     *
     * <p>Method under test: {@link Workshop#hasAvailableDate()}
     */
    @Test
    @DisplayName("Test hasAvailableDate()")
    @Tag("MaintainedByDiffblue")
    void testHasAvailableDate() {
        // Arrange
        HashMap<ZonedDateTime, Integer> spotsPerDate = new HashMap<>();
        spotsPerDate.put(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC), 0);
        Workshop workshop = new Workshop(1, "Name", spotsPerDate);

        // Act and Assert
        assertFalse(workshop.hasAvailableDate());
    }

    /**
     * Test {@link Workshop#hasAvailableDate()}.
     *
     * <ul>
     *   <li>Then return {@code false}.
     * </ul>
     *
     * <p>Method under test: {@link Workshop#hasAvailableDate()}
     */
    @Test
    @DisplayName("Test hasAvailableDate(); then return 'false'")
    @Tag("MaintainedByDiffblue")
    void testHasAvailableDate_thenReturnFalse() {
        // Arrange
        Workshop workshop = new Workshop(1, "Name", new HashMap<>());

        // Act and Assert
        assertFalse(workshop.hasAvailableDate());
    }

    /**
     * Test {@link Workshop#hasAvailableDate()}.
     *
     * <ul>
     *   <li>Then return {@code true}.
     * </ul>
     *
     * <p>Method under test: {@link Workshop#hasAvailableDate()}
     */
    @Test
    @DisplayName("Test hasAvailableDate(); then return 'true'")
    @Tag("MaintainedByDiffblue")
    void testHasAvailableDate_thenReturnTrue() {
        // Arrange
        HashMap<ZonedDateTime, Integer> spotsPerDate = new HashMap<>();
        spotsPerDate.put(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC), 42);
        Workshop workshop = new Workshop(1, "Name", spotsPerDate);

        // Act and Assert
        assertTrue(workshop.hasAvailableDate());
    }

    /**
     * Test {@link Workshop#getNextAvailableDate()}.
     *
     * <p>Method under test: {@link Workshop#getNextAvailableDate()}
     */
    @Test
    @DisplayName("Test getNextAvailableDate()")
    @Tag("MaintainedByDiffblue")
    void testGetNextAvailableDate() {
        // Arrange
        HashMap<ZonedDateTime, Integer> spotsPerDate = new HashMap<>();

        LocalDate ofResult = LocalDate.of(1970, 1, 1);
        spotsPerDate.put(ofResult.atStartOfDay().atZone(ZoneOffset.UTC), 42);
        Workshop workshop = new Workshop(1, "Name", spotsPerDate);

        // Act
        ZonedDateTime actualNextAvailableDate = workshop.getNextAvailableDate();

        // Assert
        LocalDateTime toLocalDateTimeResult = actualNextAvailableDate.toLocalDateTime();
        assertEquals("00:00", toLocalDateTimeResult.toLocalTime().toString());
        LocalDate toLocalDateResult = toLocalDateTimeResult.toLocalDate();
        assertEquals("1970-01-01", toLocalDateResult.toString());
        assertEquals("Z", actualNextAvailableDate.getZone().toString());
        assertSame(ofResult, toLocalDateResult);
    }

    /**
     * Test {@link Workshop#getNextAvailableDate()}.
     *
     * <p>Method under test: {@link Workshop#getNextAvailableDate()}
     */
    @Test
    @DisplayName("Test getNextAvailableDate()")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetNextAvailableDate2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException: No value present
        //       at java.base/java.util.Optional.get(Optional.java:143)
        //       at delft.Workshop.getNextAvailableDate(AutoAssigner.java:105)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Workshop workshop = new Workshop(1, "Name", new HashMap<>());

        // Act
        workshop.getNextAvailableDate();
    }

    /**
     * Test {@link Workshop#getNextAvailableDate()}.
     *
     * <p>Method under test: {@link Workshop#getNextAvailableDate()}
     */
    @Test
    @DisplayName("Test getNextAvailableDate()")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetNextAvailableDate3() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException: No value present
        //       at java.base/java.util.Optional.get(Optional.java:143)
        //       at delft.Workshop.getNextAvailableDate(AutoAssigner.java:105)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        HashMap<ZonedDateTime, Integer> spotsPerDate = new HashMap<>();
        spotsPerDate.put(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC), 0);
        Workshop workshop = new Workshop(1, "Name", spotsPerDate);

        // Act
        workshop.getNextAvailableDate();
    }

    /**
     * Test {@link Workshop#getNextAvailableDate()}.
     *
     * <ul>
     *   <li>Given {@link HashMap#HashMap()} now atStartOfDay atZone {@link ZoneOffset#UTC} is one.
     * </ul>
     *
     * <p>Method under test: {@link Workshop#getNextAvailableDate()}
     */
    @Test
    @DisplayName("Test getNextAvailableDate(); given HashMap() now atStartOfDay atZone UTC is one")
    @Tag("MaintainedByDiffblue")
    void testGetNextAvailableDate_givenHashMapNowAtStartOfDayAtZoneUtcIsOne() {
        // Arrange
        HashMap<ZonedDateTime, Integer> spotsPerDate = new HashMap<>();
        spotsPerDate.put(LocalDate.now().atStartOfDay().atZone(ZoneOffset.UTC), 1);
        spotsPerDate.put(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC), 42);
        Workshop workshop = new Workshop(1, "Name", spotsPerDate);

        // Act
        ZonedDateTime actualNextAvailableDate = workshop.getNextAvailableDate();

        // Assert
        LocalDateTime toLocalDateTimeResult = actualNextAvailableDate.toLocalDateTime();
        assertEquals("00:00", toLocalDateTimeResult.toLocalTime().toString());
        assertEquals("1970-01-01", toLocalDateTimeResult.toLocalDate().toString());
        assertEquals("Z", actualNextAvailableDate.getZone().toString());
    }

    /**
     * Test {@link Workshop#getNextAvailableDate()}.
     *
     * <ul>
     *   <li>Given {@link HashMap#HashMap()} now atStartOfDay atZone {@link ZoneOffset#UTC} is zero.
     * </ul>
     *
     * <p>Method under test: {@link Workshop#getNextAvailableDate()}
     */
    @Test
    @DisplayName("Test getNextAvailableDate(); given HashMap() now atStartOfDay atZone UTC is zero")
    @Tag("MaintainedByDiffblue")
    void testGetNextAvailableDate_givenHashMapNowAtStartOfDayAtZoneUtcIsZero() {
        // Arrange
        HashMap<ZonedDateTime, Integer> spotsPerDate = new HashMap<>();
        spotsPerDate.put(LocalDate.now().atStartOfDay().atZone(ZoneOffset.UTC), 0);
        spotsPerDate.put(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC), 42);
        Workshop workshop = new Workshop(1, "Name", spotsPerDate);

        // Act
        ZonedDateTime actualNextAvailableDate = workshop.getNextAvailableDate();

        // Assert
        LocalDateTime toLocalDateTimeResult = actualNextAvailableDate.toLocalDateTime();
        assertEquals("00:00", toLocalDateTimeResult.toLocalTime().toString());
        assertEquals("1970-01-01", toLocalDateTimeResult.toLocalDate().toString());
        assertEquals("Z", actualNextAvailableDate.getZone().toString());
    }

    /**
     * Test {@link Workshop#takeASpot(ZonedDateTime)}.
     *
     * <p>Method under test: {@link Workshop#takeASpot(ZonedDateTime)}
     */
    @Test
    @DisplayName("Test takeASpot(ZonedDateTime)")
    @Tag("MaintainedByDiffblue")
    void testTakeASpot() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        HashMap<ZonedDateTime, Integer> spotsPerDate = new HashMap<>();
        spotsPerDate.put(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC), 42);
        Workshop workshop = new Workshop(1, "Name", spotsPerDate);

        // Act
        workshop.takeASpot(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC));
    }

    /**
     * Test {@link Workshop#takeASpot(ZonedDateTime)}.
     *
     * <p>Method under test: {@link Workshop#takeASpot(ZonedDateTime)}
     */
    @Test
    @DisplayName("Test takeASpot(ZonedDateTime)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testTakeASpot2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the
        // return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.map$get(java.util.Map,
        // Object)" is null
        //       at delft.Workshop.takeASpot(AutoAssigner.java:115)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Workshop workshop = new Workshop(1, "Name", new HashMap<>());

        // Act
        workshop.takeASpot(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC));
    }

    /**
     * Test {@link Workshop#equals(Object)}, and {@link Workshop#hashCode()}.
     *
     * <ul>
     *   <li>When other is equal.
     *   <li>Then return equal.
     * </ul>
     *
     * <p>Methods under test:
     *
     * <ul>
     *   <li>{@link Workshop#equals(Object)}
     *   <li>{@link Workshop#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
    @Tag("MaintainedByDiffblue")
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
        // Arrange
        Workshop workshop = new Workshop(1, "Name", new HashMap<>());
        Workshop workshop2 = new Workshop(1, "Name", new HashMap<>());

        // Act and Assert
        assertEquals(workshop, workshop2);
        assertEquals(workshop.hashCode(), workshop2.hashCode());
    }

    /**
     * Test {@link Workshop#equals(Object)}, and {@link Workshop#hashCode()}.
     *
     * <ul>
     *   <li>When other is same.
     *   <li>Then return equal.
     * </ul>
     *
     * <p>Methods under test:
     *
     * <ul>
     *   <li>{@link Workshop#equals(Object)}
     *   <li>{@link Workshop#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
    @Tag("MaintainedByDiffblue")
    void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
        // Arrange
        Workshop workshop = new Workshop(1, "Name", new HashMap<>());

        // Act and Assert
        assertEquals(workshop, workshop);
        int expectedHashCodeResult = workshop.hashCode();
        assertEquals(expectedHashCodeResult, workshop.hashCode());
    }

    /**
     * Test {@link Workshop#equals(Object)}.
     *
     * <ul>
     *   <li>When other is different.
     *   <li>Then return not equal.
     * </ul>
     *
     * <p>Method under test: {@link Workshop#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
        // Arrange
        Workshop workshop = new Workshop(2, "Name", new HashMap<>());

        // Act and Assert
        assertNotEquals(workshop, new Workshop(1, "Name", new HashMap<>()));
    }

    /**
     * Test {@link Workshop#equals(Object)}.
     *
     * <ul>
     *   <li>When other is different.
     *   <li>Then return not equal.
     * </ul>
     *
     * <p>Method under test: {@link Workshop#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
        // Arrange
        Workshop workshop = new Workshop(1, null, new HashMap<>());

        // Act and Assert
        assertNotEquals(workshop, new Workshop(1, "Name", new HashMap<>()));
    }

    /**
     * Test {@link Workshop#equals(Object)}.
     *
     * <ul>
     *   <li>When other is different.
     *   <li>Then return not equal.
     * </ul>
     *
     * <p>Method under test: {@link Workshop#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
        // Arrange
        HashMap<ZonedDateTime, Integer> spotsPerDate = new HashMap<>();
        spotsPerDate.put(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC), 42);
        Workshop workshop = new Workshop(1, "Name", spotsPerDate);

        // Act and Assert
        assertNotEquals(workshop, new Workshop(1, "Name", new HashMap<>()));
    }

    /**
     * Test {@link Workshop#equals(Object)}.
     *
     * <ul>
     *   <li>When other is {@code null}.
     *   <li>Then return not equal.
     * </ul>
     *
     * <p>Method under test: {@link Workshop#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
    @Tag("MaintainedByDiffblue")
    void testEquals_whenOtherIsNull_thenReturnNotEqual() {
        // Arrange, Act and Assert
        assertNotEquals(new Workshop(1, "Name", new HashMap<>()), null);
    }

    /**
     * Test {@link Workshop#equals(Object)}.
     *
     * <ul>
     *   <li>When other is wrong type.
     *   <li>Then return not equal.
     * </ul>
     *
     * <p>Method under test: {@link Workshop#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
    @Tag("MaintainedByDiffblue")
    void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
        // Arrange, Act and Assert
        assertNotEquals(new Workshop(1, "Name", new HashMap<>()), "Different type to Workshop");
    }
}
