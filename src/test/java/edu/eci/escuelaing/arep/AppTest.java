package edu.eci.escuelaing.arep;

import static org.junit.Assert.assertEquals;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	 public AppTest( String testName )
	    {
	        
	        LinkedList lista = new LinkedList();
	        lista.addFirst(159.847);
	        lista.addFirst(0.379);lista.addFirst(753);lista.addFirst(15.5);
	        lista.addFirst(33.5);lista.addFirst(88.78);lista.addFirst(99.0);
	        assertEquals(99.0, ((Nodo) lista.removeFirst()).getData(),0.1);
	        assertEquals(88.78, ((Nodo) lista.removeFirst()).getData(),0.01);
	        assertEquals(33.5, ((Nodo) lista.removeFirst()).getData(),0.1);
	        assertEquals(15.5, ((Nodo) lista.removeFirst()).getData(),0.1);
	        assertEquals(753, ((Nodo) lista.removeFirst()).getData(),0.1);
	        assertEquals(0.379, ((Nodo) lista.removeFirst()).getData(),0.001);
	    }



	    /**
	     * Rigourous Test :-)
	     */
	    public void testApp()
	    {
	    	 LinkedList lista = new LinkedList();
	    	 lista.addFirst(159.847);
	         lista.addFirst(0.379);lista.addFirst(753);lista.addFirst(15.5);
	         lista.addFirst(33.5);lista.addFirst(88.78);lista.addFirst(99.0);
	         Calculator cal = new Calculator(lista);
	         
	         double mean = cal.mean();
	         double deviation = cal.standardDeviation();
	         
	         assertEquals( 164.286,mean,0.001);	
	         assertEquals(245.727,deviation, 0.001);
	    }
}
