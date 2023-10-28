package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job instanceof Job);
        assertEquals("Product tester", job.getName());

        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals("ACME", job.getEmployer().getValue());

        assertTrue(job.getLocation() instanceof Location);
        assertEquals("Desert", job.getLocation().getValue());

        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job.getPositionType().getValue());

        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine () {
        String newline = System.lineSeparator();
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedMessage = newline +  "ID: " + job.getId() + newline +
                "Name: " + job.getName() + newline +
                "Employer: " + job.getEmployer().getValue() + newline +
                "Location: " + job.getLocation().getValue() + newline +
                "Position Type: " + job.getPositionType().getValue() + newline +
                "Core Competency: " + job.getCoreCompetency().getValue() +
                newline;
        assertEquals(expectedMessage, job.toString());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData () {
        String newline = System.lineSeparator();
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedMessage = newline +
                "ID: " + job.getId() + newline +
                "Name: " + job.getName() + newline +
                "Employer: " + job.getEmployer().getValue() + newline +
                "Location: " + job.getLocation().getValue() + newline +
                "Position Type: " + job.getPositionType().getValue() + newline +
                "Core Competency: " + job.getCoreCompetency().getValue() +
                newline;
        assertEquals(expectedMessage, job.toString());
    }

    @Test
    public void testToStringHandlesEmptyField () {
        String newline = System.lineSeparator();
        Job job = new Job("Product tester", new Employer(""), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String expectedMessage = newline +
            "ID: " + job.getId() + newline +
            "Name: " + job.getName() + newline +
            "Employer: " + "Data not available" + newline +
            "Location: " + "Data not available" + newline +
            "Position Type: " + job.getPositionType().getValue() + newline +
            "Core Competency: " + job.getCoreCompetency().getValue() +
            newline;
        assertEquals(expectedMessage, job.toString());

    }

}
