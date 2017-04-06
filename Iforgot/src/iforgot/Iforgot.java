/*
 *
 */
package iforgot;
import AppController.ApplicationController;
/**
 *
 * @author josecovarrubias
 */    
public class Iforgot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This line leads to the application controller, in charge of the 
        // initial logic of the application. 
        ApplicationController startApp = new ApplicationController();
        startApp.start();
    }
    
}
