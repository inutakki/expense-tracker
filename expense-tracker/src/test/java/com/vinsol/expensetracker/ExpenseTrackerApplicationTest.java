package com.vinsol.expensetracker;

import junit.framework.TestCase;

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

    public void testOnCreate() throws Exception {
        // System.out.println(exp.getPackageName());
        // ExpenseTrackerApplication exp = new ExpenseTrackerApplication();
        // exp.onCreate();
        // assertTrue("ExpenseTrackerApplication" == exp.getPackageName());
    }

    public void testSetSyncPrefs() throws Exception {

    }

    public void testInitialize() throws Exception {
        assertTrue(true);
    }

    public void testGetContext() throws Exception {

    }
}