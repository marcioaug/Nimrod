package CH.ifa.draw.test.contrib;

import junit.framework.TestCase;
// JUnitDoclet begin import
import CH.ifa.draw.contrib.StandardLayouter;
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
* TestCase StandardLayouterTest is generated by
* JUnitDoclet to hold the tests for StandardLayouter.
* @see CH.ifa.draw.contrib.StandardLayouter
*/
// JUnitDoclet end javadoc_class
public class StandardLayouterTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  // instance variables, helper methods, ... put them in this marker
  CH.ifa.draw.contrib.StandardLayouter standardlayouter = null;
  // JUnitDoclet end class
  
  /**
  * Constructor StandardLayouterTest is
  * basically calling the inherited constructor to
  * initiate the TestCase for use by the Framework.
  */
  public StandardLayouterTest(String name) {
    // JUnitDoclet begin method StandardLayouterTest
    super(name);
    // JUnitDoclet end method StandardLayouterTest
  }
  
  /**
  * Factory method for instances of the class to be tested.
  */
  public CH.ifa.draw.contrib.StandardLayouter createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new CH.ifa.draw.contrib.StandardLayouter();
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
    standardlayouter = createInstance();
    // JUnitDoclet end method testcase.setUp
  }
  
  /**
  * Method tearDown is overwriting the framework method to
  * clean up after each single test of this TestCase.
  * It's called from the JUnit framework only.
  */
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    standardlayouter = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }
  
  // JUnitDoclet begin javadoc_method create()
  /**
  * Method testCreate is testing create
  * @see CH.ifa.draw.contrib.StandardLayouter#create(CH.ifa.draw.contrib.Layoutable)
  */
  // JUnitDoclet end javadoc_method create()
  public void testCreate() throws Exception {
    // JUnitDoclet begin method create
    // JUnitDoclet end method create
  }
  
  // JUnitDoclet begin javadoc_method calculateLayout()
  /**
  * Method testCalculateLayout is testing calculateLayout
  * @see CH.ifa.draw.contrib.StandardLayouter#calculateLayout(java.awt.Point, java.awt.Point)
  */
  // JUnitDoclet end javadoc_method calculateLayout()
  public void testCalculateLayout() throws Exception {
    // JUnitDoclet begin method calculateLayout
    // JUnitDoclet end method calculateLayout
  }
  
  // JUnitDoclet begin javadoc_method layout()
  /**
  * Method testLayout is testing layout
  * @see CH.ifa.draw.contrib.StandardLayouter#layout(java.awt.Point, java.awt.Point)
  */
  // JUnitDoclet end javadoc_method layout()
  public void testLayout() throws Exception {
    // JUnitDoclet begin method layout
    // JUnitDoclet end method layout
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
    junit.textui.TestRunner.run(StandardLayouterTest.class);
    // JUnitDoclet end method testcase.main
  }
}
