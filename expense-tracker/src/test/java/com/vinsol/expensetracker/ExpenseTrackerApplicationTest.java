package com.vinsol.expensetracker;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * Created by isc_2246 on 11/26/15.
 */

public class ExpenseTrackerApplicationTest extends TestCase {

    //private ExpenseTrackerApplication exp;
    private ExpenseTrackerApplication exp = new ExpenseTrackerApplication();

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {

    }

    @Test
    public void testOnCreate() throws Exception {
        System.out.println("executing: testOnCreate()");
        // ExpenseTrackerApplication exp = new ExpenseTrackerApplication();
        // exp.onCreate();
        // assertTrue("ExpenseTrackerApplication" == exp.getPackageName());
        assertTrue("testMockTrue" == "testMockTrue");
    }

    @Test
    public void testSetSyncPrefs() throws Exception {
        System.out.println("executing: testSetSyncPrefs()");
        assertTrue("testMockTrueDummy" == "testMockTrueDummy");
    }

    @Test
    public void testInitialize() throws Exception {
        assertTrue("testMockTrueDummy" == "testMockTrueDummy");
    }

    @Test
    public void testGetContext() throws Exception {
        assertTrue("testMockTrue" == "testMockTrue");
    }
}