package CH.ifa.draw.test.samples.javadraw;

import junit.framework.TestCase;
// JUnitDoclet begin import
import CH.ifa.draw.samples.javadraw.BouncingDrawing;
// JUnitDoclet end import

/*
* Generated by JUnitDoclet, a tool provided by
* ObjectFab GmbH under LGPL.
* Please see www.junitdoclet.org, www.gnu.org
* and www.objectfab.de for informations about
* the tool, the licence and the authors.
*/


// JUnitDoclet begin javadoc_class
/**
* TestCase BouncingDrawingTest is generated by
* JUnitDoclet to hold the tests for BouncingDrawing.
* @see CH.ifa.draw.samples.javadraw.BouncingDrawing
*/
// JUnitDoclet end javadoc_class
public class BouncingDrawingTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  // instance variables, helper methods, ... put them in this marker
  CH.ifa.draw.samples.javadraw.BouncingDrawing bouncingdrawing = null;
  // JUnitDoclet end class
  
  /**
  * Constructor BouncingDrawingTest is
  * basically calling the inherited constructor to
  * initiate the TestCase for use by the Framework.
  */
  public BouncingDrawingTest(String name) {
    // JUnitDoclet begin method BouncingDrawingTest
    super(name);
    // JUnitDoclet end method BouncingDrawingTest
  }
  
  /**
  * Factory method for instances of the class to be tested.
  */
  public CH.ifa.draw.samples.javadraw.BouncingDrawing createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new CH.ifa.draw.samples.javadraw.BouncingDrawing();
    // JUnitDoclet end method testcase.createInstance
  }
  
  /**
  * Method setUp is overwriting the framework method to
  * prepare an instance of this TestCase for a single test.
  * It's called from the JUnit framework only.
  */
  protected void setUp() throws Exception {
    // JUnitDoclet begin method testcase.setUp
    super.setUp();
    bouncingdrawing = createInstance();
    // JUnitDoclet end method testcase.setUp
  }
  
  /**
  * Method tearDown is overwriting the framework method to
  * clean up after each single test of this TestCase.
  * It's called from the JUnit framework only.
  */
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    bouncingdrawing = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }
  
  // JUnitDoclet begin javadoc_method add()
  /**
  * Method testAdd is testing add
  * @see CH.ifa.draw.samples.javadraw.BouncingDrawing#add(CH.ifa.draw.framework.Figure)
  */
  // JUnitDoclet end javadoc_method add()
  public void testAdd() throws Exception {
    // JUnitDoclet begin method add
    // JUnitDoclet end method add
  }
  
  // JUnitDoclet begin javadoc_method remove()
  /**
  * Method testRemove is testing remove
  * @see CH.ifa.draw.samples.javadraw.BouncingDrawing#remove(CH.ifa.draw.framework.Figure)
  */
  // JUnitDoclet end javadoc_method remove()
  public void testRemove() throws Exception {
    // JUnitDoclet begin method remove
    // JUnitDoclet end method remove
  }
  
  // JUnitDoclet begin javadoc_method replace()
  /**
  * Method testReplace is testing replace
  * @see CH.ifa.draw.samples.javadraw.BouncingDrawing#replace(CH.ifa.draw.framework.Figure, CH.ifa.draw.framework.Figure)
  */
  // JUnitDoclet end javadoc_method replace()
  public void testReplace() throws Exception {
    // JUnitDoclet begin method replace
    // JUnitDoclet end method replace
  }
  
  // JUnitDoclet begin javadoc_method animationStep()
  /**
  * Method testAnimationStep is testing animationStep
  * @see CH.ifa.draw.samples.javadraw.BouncingDrawing#animationStep()
  */
  // JUnitDoclet end javadoc_method animationStep()
  public void testAnimationStep() throws Exception {
    // JUnitDoclet begin method animationStep
    // JUnitDoclet end method animationStep
  }
  
  
  
  // JUnitDoclet begin javadoc_method testVault
  /**
  * JUnitDoclet moves marker to this method, if there is not match
  * for them in the regenerated code and if the marker is not empty.
  * This way, no test gets lost when regenerating after renaming.
  * <b>Method testVault is supposed to be empty.</b>
  */
  // JUnitDoclet end javadoc_method testVault
  public void testVault() throws Exception {
    // JUnitDoclet begin method testcase.testVault
    // JUnitDoclet end method testcase.testVault
  }
  
  /**
  * Method to execute the TestCase from command line
  * using JUnit's textui.TestRunner .
  */
  public static void main(String[] args) {
    // JUnitDoclet begin method testcase.main
    junit.textui.TestRunner.run(BouncingDrawingTest.class);
    // JUnitDoclet end method testcase.main
  }
}
