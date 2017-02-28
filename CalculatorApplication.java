package lab08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * <p>
 * This application is a simulation of a simple hand-held
 * calculator.  GUI components are used for input and
 * output.  The user can click on the buttons to enter
 * numbers and select computations, and the results are
 * displayed in the text area at the top.
 * </p>
 * 
 * @author *** Your name here ***
 * @version Spring 2017
 */
public class CalculatorApplication implements Runnable
{
    static public void main (String[] args)
    {
        // Build an object for this class.  
        //   We're in a static main method, there is no 'this'.
        //   We need a runnable object.  Since this
        //   class implements the Runnable interface,
        //   and since this class has a run method, we
        //   can make an object from this class and use
        //   it as a Runnable object.
        
        CalculatorApplication app = new CalculatorApplication ();
        
        // Use this helper method to ask the GUI thread to 'run' our
        //   object.  The GUI thread will execute our run method (later).
        
        SwingUtilities.invokeLater(app);
        
        // Note:  If you wanted two copies of the application, you could
        //   create and run two CalculatorApplication objects.  (They
        //   should be different objects, don't just run the same one twice.)
        //   Two windows would appear.  Cool.
    }
    
    /**
     * <p>This method represents our official starting point of
     * the GUI code for the application.  It must be executed
     * by the GUI thread of execution.  (Remember, we now have
     * multicore processors, and a program can be executing in
     * two places at once.  Each thread represents an individual
     * (and separate) execution path.   GUI code must run in
     * the GUI thread, so this method must be executed by the
     * GUI thread.  See 'main' above to see how to make this happen.
     * </p>
     */
    public void run ()
    {
        // Create the window.
        

        // Create a content panel for the window.  We will add our
        //   GUI controls to this container.  Set the layout to use
        //   BorderLayout.
        

        // Create, customize, and add the calculator components.
        // First, create a number display and add it to the north in
        //   the window.
        

        // Create an inner panel to hold the number buttons.  Set it
        //   to use GridLayout.  Add it to the south side of the
        //   main window.
        
        
        // Create the buttons, add them to the inner panel.
        
                
        // Create an object to listen to button events.
        //   Have our 'listening' object listen to events from every 
        //   button (by adding our object to each button as a listener ).
        
                
        // Force the window to compute its own size.  (Pack it.)
        
                
        // Make the window unresizeable, visible.
        
               
        // Run method terminates, the window remains visible.
        //   The GUI thread event loop will call our listeners
        //   (assuming we added them correctly) whenever
        //   the user interacts with the GUI buttons.
    }
}
