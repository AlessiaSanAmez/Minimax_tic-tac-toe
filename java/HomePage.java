import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame {
    private boolean numberPlayer = true;
    private JButton start, easy, normal, hard, onePlayer, twoPlayer;
    private JLabel nameLabel, difLabel, playersLabel, titleLabel;
    private JTextField txtOnePlayer, txtTwoPlayer;
    private CardLayout cardLayout;
    private JPanel pnlMain, pnlOnePlayer, pnlTwoPlayer;

    public HomePage(){
        super("Tic-Tac-Toe Game");

        // Botones
        start = new JButton("Start!");
        easy = new JButton("Easy");
        normal = new JButton("Normal");
        hard = new JButton("Hard");
        onePlayer = new JButton("One player");
        twoPlayer = new JButton("Two players");

        // Labels
        nameLabel = new JLabel("Player name:");
        difLabel = new JLabel("Choose difficulty:");
        playersLabel = new JLabel("Number of players:");
        titleLabel = new JLabel("Tic-tac-toe Game");

        // JTextField
        txtOnePlayer = new JTextField("", 6);
        txtTwoPlayer = new JTextField("", 6);

        // Panels
        cardLayout = new CardLayout();
        pnlMain = new JPanel(cardLayout);

        // One Player pannel
        pnlOnePlayer = new JPanel();
        pnlOnePlayer.add(titleLabel);
        pnlOnePlayer.add(playersLabel);
        pnlOnePlayer.add(nameLabel);
        pnlOnePlayer.add(onePlayer);
        pnlOnePlayer.add(twoPlayer);
        pnlOnePlayer.add(txtOnePlayer);
        pnlOnePlayer.add(difLabel);
        pnlOnePlayer.add(easy);
        pnlOnePlayer.add(normal);
        pnlOnePlayer.add(hard);
        pnlOnePlayer.add(start);

        // Two Player pannel
        pnlTwoPlayer = new JPanel();
        pnlTwoPlayer.add(titleLabel);
        pnlTwoPlayer.add(playersLabel);
        pnlTwoPlayer.add(nameLabel);
        pnlTwoPlayer.add(onePlayer);
        pnlTwoPlayer.add(twoPlayer);
        pnlTwoPlayer.add(txtOnePlayer);
        pnlTwoPlayer.add(txtTwoPlayer);
        pnlTwoPlayer.add(start);

        pnlMain.add(pnlOnePlayer, "One Player");
        pnlMain.add(pnlTwoPlayer, "Two Players");

        add(pnlMain);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String oneName = txtOnePlayer.getText();
                String twoName = txtTwoPlayer.getText();
                if(numberPlayer){
                    if(!oneName.isEmpty()) {
                        // mandar al juego
                    }else{
                        // ex
                    }
                }else{
                    // two players
                }
            }
        });
    }

    public static void main(String[] args) {
        HomePage home = new HomePage();
    }
}
