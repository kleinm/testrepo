package org.p13.magk.area51;

import org.junit.Test;
import org.jvnet.hudson.test.HudsonTestCase;
import org.apache.commons.io.FileUtils;
import hudson.model.*;
import hudson.tasks.Shell;

public class TestCase1 extends HudsonTestCase
{
    public TestCase1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

    @Test
	public void test1() throws Exception {
//        FreeStyleProject project = createFreeStyleProject();
//        project.getBuildersList().add(new Shell("echo hello"));
//
//        FreeStyleBuild build = project.scheduleBuild2(0).get();
//        System.out.println(build.getDisplayName()+" completed");
//
//        // TODO: change this to use HtmlUnit
//        String s = FileUtils.readFileToString(build.getLogFile());
//        assertTrue(s.contains("+ echo hello"));
        
        assertEquals(1,2);
    }

    @Test
    public void test2() {
    	assertEquals(1,1);
    }
    

}