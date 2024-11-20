package org.hcilab.projects.nlogx;

import static org.junit.Assert.assertEquals;

import android.app.Application;
import android.content.Context;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;

//import android.test.ApplicationTestCase;
@RunWith(AndroidJUnit4.class)
/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest {
	@Test
	public void useAppContext() {
		// Context of the app under test.
		Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
		assertEquals("org.hcilab.projects.nlogx", appContext.getPackageName());
	}
}