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
    public void testJobConstructorSetsAllFields(){
       Job job =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
   //assertTrue(job.getName());

    }
}
