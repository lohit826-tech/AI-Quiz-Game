import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SingleQuestionAIQuiz extends JFrame implements ActionListener {

    JLabel questionLabel;
    JButton option1, option2, option3, option4;
    JLabel feedbackLabel;

    // Correct answer
    String correctAnswer = "Paris";

    public SingleQuestionAIQuiz() {
        setTitle("AI Quiz Game - Single Question");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 1));

        // Question
        questionLabel = new JLabel("What is the capital of France?", SwingConstants.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(questionLabel);

        // Options
        option1 = new JButton("London");
        option2 = new JButton("Paris"); // correct
        option3 = new JButton("Rome");
        option4 = new JButton("Berlin");

        option1.addActionListener(this);
        option2.addActionListener(this);
        option3.addActionListener(this);
        option4.addActionListener(this);

        add(option1);
        add(option2);
        add(option3);
        add(option4);

        // Feedback label
        feedbackLabel = new JLabel("", SwingConstants.CENTER);
        feedbackLabel.setFont(new Font("Arial", Font.ITALIC, 16));
        add(feedbackLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (clicked.getText().equals(correctAnswer)) {
            feedbackLabel.setText("Correct! ✅");
            feedbackLabel.setForeground(Color.GREEN);
        } else {
            feedbackLabel.setText("Wrong! ❌ The correct answer is " + correctAnswer);
            feedbackLabel.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        new SingleQuestionAIQuiz();
    }
}
