package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
 public void  testSettingJobId(){

        Job aJob = new Job ();
        Job aJob2= new Job();
        assertNotEquals(aJob.getId(),aJob2.getId());
    }

   @Test
    public void testJobConstructorSetsAllFields(){
       Job job =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       Employer employer = job.getEmployer();
       Location location = job.getLocation();
       PositionType positionType = job.getPositionType();
       CoreCompetency coreCompetency = job.getCoreCompetency();


       assertTrue(job instanceof Job);
       assertTrue( job.getPositionType() instanceof PositionType);
       assertTrue( job.getEmployer() instanceof Employer);
       assertTrue(job.getLocation() instanceof Location);
       assertTrue(job.getCoreCompetency() instanceof CoreCompetency);

       assertEquals("Product tester",job.getName());
       assertEquals("ACME",employer.getValue());
       assertEquals("Desert", location.getValue());
       assertEquals("Quality control", positionType.getValue());
       assertEquals("Persistence", coreCompetency.getValue());


    }
    @Test
   public void testJobsForEquality(){
      Job job1 =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       Job job2 =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

       assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
     char firstChar= job.toString().charAt(0);
     char lastChar = job.toString().charAt(job.toString().length()-1);
        assertEquals( firstChar, '\n');
        assertEquals( lastChar,'\n');
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals( "\nID: "+ job.getId() +"\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n", job.toString());

    }
    @Test
   public void testToStringHandlesEmptyField(){
        Job job =  new Job("Product tester", new Employer("ACME"),new Location(""),new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: "+ job.getId() +"\nName: Product tester\nEmployer: ACME\nLocation: Data not available\nPosition Type: Quality control\nCore Competency: Persistence\n", job.toString());
    }
    @Test
    public  void testToStringHandlesFieldContainingOnlyID(){
        Job job = new Job();
        assertEquals("\nOOPS! This job does not seem to exist.\n",job.toString() );
    }



}
