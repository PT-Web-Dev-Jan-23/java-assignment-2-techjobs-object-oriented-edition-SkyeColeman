package org.launchcode.techjobs.oo.test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields () {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //test the fields using 'assertTrue' and 'assertEquals'
        assertTrue(job instanceof Job);

        assertEquals("Product tester", job.getName());
        //Employer field
        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals("ACME", job.getEmployer().getValue());
        //Location field

        assertTrue(job.getLocation() instanceof Location);

        assertEquals("Desert", job.getLocation().getValue());


        //Position field
        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job.getPositionType().getValue());

        //CoreCompetency field
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
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String jobString = job.toString();

        assertTrue(jobString.startsWith("\n"));
        assertTrue(jobString.endsWith("\n"));

        String[] lines = jobString.split("\n");

        assertEquals("ID: " + job.getId(), lines[1]);
        assertEquals("Name: " + job.getName(), lines[2]);
        assertEquals("Employer: " + job.getEmployer(), lines[3]);
        assertEquals("Location: " + job.getLocation(), lines[4]);
        assertEquals("Position Type: " + job.getPositionType(), lines[5]);
        assertEquals("Core Competency: " + job.getCoreCompetency(), lines[6]);

    }
    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String jobString = job.toString();

        assertTrue(jobString.contains("Name: Data not available"));
        assertTrue(jobString.contains("Employer: Data not available"));
        assertTrue(jobString.contains("Location: Data not available"));
        assertTrue(jobString.contains("Position Type: Data not available"));
    }

    @Test
    public void testToStringContainsCorrectLablesAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String jobString = job.toString();

        assertTrue(jobString.contains("ID: " + job.getId()));
        assertTrue(jobString.contains("Name: " + job.getName()));
        assertTrue(jobString.contains("Employer: " + job.getEmployer()));
        assertTrue(jobString.contains("Location: " + job.getLocation()));
        assertTrue(jobString.contains("Position Type: " + job.getPositionType()));
        assertTrue(jobString.contains("Core Competency: " + job.getCoreCompetency()));
    }
    }

