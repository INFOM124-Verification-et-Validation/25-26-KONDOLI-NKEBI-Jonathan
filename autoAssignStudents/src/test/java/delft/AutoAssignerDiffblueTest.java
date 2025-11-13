package delft;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AutoAssignerDiffblueTest {
    /**
     * Test {@link AutoAssigner#assign(List, List)}.
     *
     * <ul>
     *   <li>Given {@link HashMap#HashMap()} {@link LocalDate} with {@code 1970} and one and one
     *       atStartOfDay atZone {@link ZoneOffset#UTC} is one.
     * </ul>
     *
     * <p>Method under test: {@link AutoAssigner#assign(List, List)}
     */
    @Test
    @DisplayName(
            "Test assign(List, List); given HashMap() LocalDate with '1970' and one and one atStartOfDay atZone UTC is one")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testAssign_givenHashMapLocalDateWith1970AndOneAndOneAtStartOfDayAtZoneUtcIsOne() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "delft.Student.getName()" because "student"
        // is null
        //       at delft.AssignmentsLogger.assign(AutoAssigner.java:160)
        //       at delft.AutoAssigner.assign(AutoAssigner.java:192)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        AutoAssigner autoAssigner = new AutoAssigner();

        ArrayList<Student> students = new ArrayList<>();
        students.add(null);

        HashMap<ZonedDateTime, Integer> spotsPerDate = new HashMap<>();
        spotsPerDate.put(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC), 1);
        Workshop workshop = new Workshop(1, "Name", spotsPerDate);

        ArrayList<Workshop> workshops = new ArrayList<>();
        workshops.add(workshop);

        // Act
        autoAssigner.assign(students, workshops);
    }

    /**
     * Test {@link AutoAssigner#assign(List, List)}.
     *
     * <ul>
     *   <li>Given {@link HashMap#HashMap()} {@link LocalDate} with {@code 1970} and one and one
     *       atStartOfDay atZone {@link ZoneOffset#UTC} is zero.
     * </ul>
     *
     * <p>Method under test: {@link AutoAssigner#assign(List, List)}
     */
    @Test
    @DisplayName(
            "Test assign(List, List); given HashMap() LocalDate with '1970' and one and one atStartOfDay atZone UTC is zero")
    @Tag("MaintainedByDiffblue")
    void testAssign_givenHashMapLocalDateWith1970AndOneAndOneAtStartOfDayAtZoneUtcIsZero() {
        // Arrange
        AutoAssigner autoAssigner = new AutoAssigner();

        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student(1, "Name", "jane.doe@example.org");
        students.add(student);

        HashMap<ZonedDateTime, Integer> spotsPerDate = new HashMap<>();
        spotsPerDate.put(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC), 0);
        Workshop workshop = new Workshop(1, "Name", spotsPerDate);

        ArrayList<Workshop> workshops = new ArrayList<>();
        workshops.add(workshop);

        // Act
        AssignmentsLogger actualAssignResult = autoAssigner.assign(students, workshops);

        // Assert
        List<String> errors = actualAssignResult.getErrors();
        assertEquals(1, errors.size());
        assertEquals("Name,Name", errors.get(0));
        assertTrue(actualAssignResult.getAssignments().isEmpty());
    }

    /**
     * Test {@link AutoAssigner#assign(List, List)}.
     *
     * <ul>
     *   <li>Given {@code null}.
     *   <li>When {@link ArrayList#ArrayList()} add {@code null}.
     * </ul>
     *
     * <p>Method under test: {@link AutoAssigner#assign(List, List)}
     */
    @Test
    @DisplayName("Test assign(List, List); given 'null'; when ArrayList() add 'null'")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testAssign_givenNull_whenArrayListAddNull() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "delft.Student.getName()" because "student"
        // is null
        //       at delft.AssignmentsLogger.noAvailableSpots(AutoAssigner.java:155)
        //       at delft.AutoAssigner.assign(AutoAssigner.java:187)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        AutoAssigner autoAssigner = new AutoAssigner();

        ArrayList<Student> students = new ArrayList<>();
        students.add(null);

        ArrayList<Workshop> workshops = new ArrayList<>();
        Workshop workshop = new Workshop(1, "Name", new HashMap<>());
        workshops.add(workshop);

        // Act
        autoAssigner.assign(students, workshops);
    }

    /**
     * Test {@link AutoAssigner#assign(List, List)}.
     *
     * <ul>
     *   <li>Given {@code null}.
     *   <li>When {@link ArrayList#ArrayList()} add {@code null}.
     * </ul>
     *
     * <p>Method under test: {@link AutoAssigner#assign(List, List)}
     */
    @Test
    @DisplayName("Test assign(List, List); given 'null'; when ArrayList() add 'null'")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testAssign_givenNull_whenArrayListAddNull2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "delft.Workshop.hasAvailableDate()" because
        // "workshop" is null
        //       at delft.AutoAssigner.assign(AutoAssigner.java:186)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        AutoAssigner autoAssigner = new AutoAssigner();

        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student(1, "Name", "jane.doe@example.org");
        students.add(student);

        ArrayList<Workshop> workshops = new ArrayList<>();
        workshops.add(null);

        // Act
        autoAssigner.assign(students, workshops);
    }

    /**
     * Test {@link AutoAssigner#assign(List, List)}.
     *
     * <ul>
     *   <li>Then return Assignments size is one.
     * </ul>
     *
     * <p>Method under test: {@link AutoAssigner#assign(List, List)}
     */
    @Test
    @DisplayName("Test assign(List, List); then return Assignments size is one")
    @Tag("MaintainedByDiffblue")
    void testAssign_thenReturnAssignmentsSizeIsOne() {
        // Arrange
        AutoAssigner autoAssigner = new AutoAssigner();

        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student(1, "Name", "jane.doe@example.org");
        students.add(student);

        HashMap<ZonedDateTime, Integer> spotsPerDate = new HashMap<>();
        spotsPerDate.put(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC), 1);
        Workshop workshop = new Workshop(1, "Name", spotsPerDate);

        ArrayList<Workshop> workshops = new ArrayList<>();
        workshops.add(workshop);

        // Act
        AssignmentsLogger actualAssignResult = autoAssigner.assign(students, workshops);

        // Assert
        List<String> assignments = actualAssignResult.getAssignments();
        assertEquals(1, assignments.size());
        assertEquals("Name,Name,01/01/1970 00:00", assignments.get(0));
        assertTrue(actualAssignResult.getErrors().isEmpty());
    }

    /**
     * Test {@link AutoAssigner#assign(List, List)}.
     *
     * <ul>
     *   <li>Then return Errors size is one.
     * </ul>
     *
     * <p>Method under test: {@link AutoAssigner#assign(List, List)}
     */
    @Test
    @DisplayName("Test assign(List, List); then return Errors size is one")
    @Tag("MaintainedByDiffblue")
    void testAssign_thenReturnErrorsSizeIsOne() {
        // Arrange
        AutoAssigner autoAssigner = new AutoAssigner();

        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student(1, "Name", "jane.doe@example.org");
        students.add(student);

        ArrayList<Workshop> workshops = new ArrayList<>();
        Workshop workshop = new Workshop(1, "Name", new HashMap<>());
        workshops.add(workshop);

        // Act
        AssignmentsLogger actualAssignResult = autoAssigner.assign(students, workshops);

        // Assert
        List<String> errors = actualAssignResult.getErrors();
        assertEquals(1, errors.size());
        assertEquals("Name,Name", errors.get(0));
        assertTrue(actualAssignResult.getAssignments().isEmpty());
    }

    /**
     * Test {@link AutoAssigner#assign(List, List)}.
     *
     * <ul>
     *   <li>Then return Errors size is two.
     * </ul>
     *
     * <p>Method under test: {@link AutoAssigner#assign(List, List)}
     */
    @Test
    @DisplayName("Test assign(List, List); then return Errors size is two")
    @Tag("MaintainedByDiffblue")
    void testAssign_thenReturnErrorsSizeIsTwo() {
        // Arrange
        AutoAssigner autoAssigner = new AutoAssigner();

        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student(1, "Name", "jane.doe@example.org");
        students.add(student);
        Student student2 = new Student(1, "Name", "jane.doe@example.org");
        students.add(student2);

        ArrayList<Workshop> workshops = new ArrayList<>();
        Workshop workshop = new Workshop(1, "Name", new HashMap<>());
        workshops.add(workshop);

        // Act
        AssignmentsLogger actualAssignResult = autoAssigner.assign(students, workshops);

        // Assert
        List<String> errors = actualAssignResult.getErrors();
        assertEquals(2, errors.size());
        assertEquals("Name,Name", errors.get(0));
        assertEquals("Name,Name", errors.get(1));
        assertTrue(actualAssignResult.getAssignments().isEmpty());
    }

    /**
     * Test {@link AutoAssigner#assign(List, List)}.
     *
     * <ul>
     *   <li>When {@link ArrayList#ArrayList()}.
     *   <li>Then return Errors Empty.
     * </ul>
     *
     * <p>Method under test: {@link AutoAssigner#assign(List, List)}
     */
    @Test
    @DisplayName("Test assign(List, List); when ArrayList(); then return Errors Empty")
    @Tag("MaintainedByDiffblue")
    void testAssign_whenArrayList_thenReturnErrorsEmpty() {
        // Arrange
        AutoAssigner autoAssigner = new AutoAssigner();
        ArrayList<Student> students = new ArrayList<>();

        // Act
        AssignmentsLogger actualAssignResult = autoAssigner.assign(students, new ArrayList<>());

        // Assert
        assertTrue(actualAssignResult.getAssignments().isEmpty());
        assertTrue(actualAssignResult.getErrors().isEmpty());
    }

    /**
     * Test {@link AutoAssigner#assign(List, List)}.
     *
     * <ul>
     *   <li>When {@link ArrayList#ArrayList()}.
     *   <li>Then return Errors Empty.
     * </ul>
     *
     * <p>Method under test: {@link AutoAssigner#assign(List, List)}
     */
    @Test
    @DisplayName("Test assign(List, List); when ArrayList(); then return Errors Empty")
    @Tag("MaintainedByDiffblue")
    void testAssign_whenArrayList_thenReturnErrorsEmpty2() {
        // Arrange
        AutoAssigner autoAssigner = new AutoAssigner();
        ArrayList<Student> students = new ArrayList<>();

        ArrayList<Workshop> workshops = new ArrayList<>();
        Workshop workshop = new Workshop(1, "Name", new HashMap<>());
        workshops.add(workshop);

        // Act
        AssignmentsLogger actualAssignResult = autoAssigner.assign(students, workshops);

        // Assert
        assertTrue(actualAssignResult.getAssignments().isEmpty());
        assertTrue(actualAssignResult.getErrors().isEmpty());
    }

    /**
     * Test {@link AutoAssigner#assign(List, List)}.
     *
     * <ul>
     *   <li>When {@link ArrayList#ArrayList()}.
     *   <li>Then return Errors Empty.
     * </ul>
     *
     * <p>Method under test: {@link AutoAssigner#assign(List, List)}
     */
    @Test
    @DisplayName("Test assign(List, List); when ArrayList(); then return Errors Empty")
    @Tag("MaintainedByDiffblue")
    void testAssign_whenArrayList_thenReturnErrorsEmpty3() {
        // Arrange
        AutoAssigner autoAssigner = new AutoAssigner();
        ArrayList<Student> students = new ArrayList<>();

        ArrayList<Workshop> workshops = new ArrayList<>();
        Workshop workshop = new Workshop(1, "Name", new HashMap<>());
        workshops.add(workshop);
        Workshop workshop2 = new Workshop(1, "Name", new HashMap<>());
        workshops.add(workshop2);

        // Act
        AssignmentsLogger actualAssignResult = autoAssigner.assign(students, workshops);

        // Assert
        assertTrue(actualAssignResult.getAssignments().isEmpty());
        assertTrue(actualAssignResult.getErrors().isEmpty());
    }
}
