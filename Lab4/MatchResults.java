import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MatchResults extends JFrame{

    JButton milan = new JButton("AC Milan");
    JButton madrid = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    Label winner = new Label("Winner: Draw");

    int milanScore = 0;
    int madridScore = 0;


    MatchResults(){
        super("Match Results");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(570, 250);
        setSize(400,250);
        setLayout(new GridBagLayout());
        GridBagConstraints locate = new GridBagConstraints();

        locate.gridx = 0;
        locate.gridy = 0;
        locate.weightx = 0.5f;
        milan.setPreferredSize(new Dimension(150, 60));
        milan.setBackground(Color.RED);
        milan.setForeground(Color.WHITE);
        add(milan, locate);

        locate.gridx = 1;
        locate.gridy = 0;
        locate.weightx = 0.5f;
        madrid.setPreferredSize(new Dimension(150, 60));
        madrid.setBackground(Color.BLUE);
        madrid.setForeground(Color.YELLOW);
        add(madrid, locate);

        locate.gridx = 0;
        locate.gridy = 1;
        locate.gridwidth = GridBagConstraints.REMAINDER;
        locate.insets = new Insets(10,0,0,0);
        result.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(result, locate);

        locate.gridx = 0;
        locate.gridy = 2;
        locate.gridwidth = GridBagConstraints.REMAINDER;
        locate.insets = new Insets(10,0,0,0);
        lastScorer.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(lastScorer, locate);

        locate.gridx = 0;
        locate.gridy = 3;
        locate.gridwidth = GridBagConstraints.REMAINDER;
        locate.insets = new Insets(20,0,0,0);
        winner.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(winner, locate);

        setVisible(true);

        madrid.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                madridScore = madridScore + 1;
                result.setText("Result: " + milanScore + " X " + madridScore);
                lastScorer.setText("Last Scorer: Real Madrid");
                if (madridScore > milanScore){
                    winner.setText("Winner: Real Madrid");
                    winner.setForeground(Color.BLUE);
                } else if (milanScore > madridScore){
                    winner.setText("Winner: AC Milan");
                    winner.setForeground(Color.RED);
                } else {
                    winner.setText("Winner: DRAW");
                    winner.setForeground(Color.BLACK);
                }
            }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });

        milan.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                milanScore = milanScore + 1;
                result.setText("Result: " + milanScore + " X " + madridScore);
                lastScorer.setText("Last Scorer: AC Milan");
                if (madridScore > milanScore){
                    winner.setText("Winner: Real Madrid");
                    winner.setForeground(Color.BLUE);
                } else if (milanScore > madridScore){
                    winner.setText("Winner: AC Milan");
                    winner.setForeground(Color.RED);
                } else {
                    winner.setText("Winner: DRAW");
                    winner.setForeground(Color.BLACK);
                }
            }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });
    }

    public static void main(String[]args){
        new MatchResults();
    }
}
