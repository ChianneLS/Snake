// import libary needed
import javax.swing.JFrame;

// make gameframe extend the libary
public class GameFrame extends JFrame {

// set up everything to be a new game
GameFrame(){

    this.add(new GamePanel());
    this.setTitle("Snake");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);
}
}