
package personalfinance;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import personalfinance.settings.Text;

public class PersonalFinance {


    public static void main(String[] args) {
       init();
//        System.out.println(Text.get("PROGRAMM_NAME"));
//        System.out.println(Arrays.toString(Text.getMonths()));
    }
    
    private static void init(){
        try {
            Text.init();
            GraphicsEnvironment ge= GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT,new File("fonts/Roboto-Light.ttf")));
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(PersonalFinance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
