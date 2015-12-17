import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RadarTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RadarTest
{
    final int ROWS =100; 
    final int COLS=100; 
    public RadarTest()
    {
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test 
    public void testOne() 
    {
        Radar radar= new Radar(ROWS,COLS);
        //intially setting a location for the monster 
        radar.setMonsterLocation(10,25); 
        for(int i=0; i<100; i++) 
        {
            radar.scan(); 
        }
        int maxium=radar.getAccumulatedDetection(0,0); 
        int rows=0; 
        int cols=0; 
        for(int i=0; i<100; i++) 
        {
            for(int j=0; j<100; j++)
            {
                if(radar.getAccumulatedDetection(i,j)>maxium)  
                {
                    maxium= radar.getAccumulatedDetection(i,j);
                    rows=i; 
                    cols=j;
                }    
            }    
        }
        assertEquals(10,rows); 
        assertEquals(25,cols); 
    }
    
    @Test
    public void testTwo() 
    {
        Radar radar= new Radar(ROWS,COLS); 
        radar.setMonsterLocation(84,23); 
        for(int i=0; i<100; i++) 
        {
            radar.scan(); 
        }
        int maxium=radar.getAccumulatedDetection(0,0); 
        int rows=0; 
        int cols=0; 
        for(int i=0; i<100; i++) 
        {
            for(int j=0; j<100; j++)
            {
                if(radar.getAccumulatedDetection(i,j)>maxium)
                {
                    maxium= radar.getAccumulatedDetection(i,j);
                    rows=i; 
                    cols=j;
                }    
            }    
        }
        assertEquals(84,rows); 
        assertEquals(23,cols); 
        
        
    }    
}
