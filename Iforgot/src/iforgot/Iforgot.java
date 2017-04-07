/*
 *
 */
package iforgot;
import AppController.ApplicationController;
import httpUrlConnection.IforgotHttpUrlConnection;
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
        
        IforgotHttpUrlConnection loadweb = new IforgotHttpUrlConnection();
//            loadweb.loadToGit(startApp.start());
    }
    
}
