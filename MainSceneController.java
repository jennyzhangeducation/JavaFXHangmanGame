import java.io.FileNotFoundException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;

public class MainSceneController {

    @FXML
    private Button A;

    @FXML
    private Button B;

    @FXML
    private Button C;

    @FXML
    private Button D;

    @FXML
    private Button E;

    @FXML
    private Button F;

    @FXML
    private Button G;

    @FXML
    private Button H;

    @FXML
    private Button I;

    @FXML
    private Button J;

    @FXML
    private Button K;

    @FXML
    private Button L;

    @FXML
    private Button M;

    @FXML
    private Button N;

    @FXML
    private Button O;

    @FXML
    private Button P;

    @FXML
    private Button Q;

    @FXML
    private Button R;

    @FXML
    private Button S;

    @FXML
    private Button T;

    @FXML
    private Button U;

    @FXML
    private Button V;

    @FXML
    private Button W;

    @FXML
    private Button X;

    @FXML
    private Button Y;

    @FXML
    private Button Z;

    @FXML
    private Line armleft;

    @FXML
    private Line armright;

    @FXML
    private Line body;

    @FXML
    private Ellipse head;

    @FXML
    private Label lable0;
    @FXML 
    private Label lable1;
    @FXML 
    private Label lable2; 
   
    @FXML
    private Label lable3;
    @FXML 
    private Label lable4;
    @FXML 
    private Label lable5;
    @FXML
    private Label win_lose;
    @FXML
    private Line stick01;

    @FXML
    private Line stick02;

    @FXML
    private Line stick03;

    private int mistakes;
    private int correct;
    private String[] words = {"apple","banana","horse"};
    private String myWord ="";
    private String[] myLetters;
    private String[] answer;
    String word;
    private Label[] labels ;
    private Button[] buttons;

    public MainSceneController() throws FileNotFoundException {
    }

    @FXML
    public void initialize() {
        labels = new Label[]{lable0, lable1, lable2, lable3, lable4, lable5};
        buttons = new Button[]{A, B, C, D, E, F, G, H, I, J, K, L, M, N, O,
                P, Q, R, S, T, U, V, W, X, Y, Z};
        armleft.setVisible(false);
        armright.setVisible(false);
        body.setVisible(false);
        head.setVisible(false);
        stick01.setVisible(false);
        stick02.setVisible(false);
        stick03.setVisible(false);
        lable1.setVisible(false);
        lable2.setVisible(false);
        lable3.setVisible(false);
        lable4.setVisible(false);
        lable5.setVisible(false);
        lable0.setVisible(false);
        win_lose.setVisible(false);
        correct=0;
        mistakes=0;
        word = words[(int) (Math.random() * words.length)].toUpperCase();
        /* 
        for (int i = 0; i < word.length(); i++) {
            myWord = "_" + myWord;
        }
        */
        for(int i =0;i < word.length();i++){
            labels[i].setVisible(true);
            //labels[i].setText("_");
        }
        System.out.println(word);


    }
    public void onClick(ActionEvent event){

        String letter = ((Button)event.getSource()).getText();
        ((Button) event.getSource()).setDisable(true);
                System.out.println(letter);
                //String word = words[(int) (Math.random() * words.length)].toUpperCase();
                //System.out.println(word);
                    if (word.indexOf(letter) != -1) {
                        for (int i = 0; i < word.length(); i++) {
                            if (word.charAt(i) == letter.charAt(0)) {
                                labels[i].setText(word.charAt(i) + "");
                                correct++;
                            }
                        }
                        System.out.println(correct);
                        // Rest of the code...
                        if(correct==word.length()){
                            win_lose.setVisible(true);
                            win_lose.setText("You Win!");
                            for(int i=0; i<26; i++){
                                buttons[i].setDisable(true);
                            }
                            
                        }
                    }
                
                else {
                    mistakes++;
                    if (mistakes == 1) {
                        stick01.setVisible(true);
                    } else if (mistakes == 2) {
                        stick02.setVisible(true);
                    } else if (mistakes == 3) {
                        stick03.setVisible(true);
                    } else if (mistakes == 4) {
                        head.setVisible(true);
                    } else if (mistakes == 5) {
                        body.setVisible(true);
                    } else if (mistakes == 6) {
                        armleft.setVisible(true);
                    } else if (mistakes == 7) {
                        armright.setVisible(true);
                    } else {
                        win_lose.setVisible(true);
                        win_lose.setText("You lose!");
                        for(int i=0; i<26; i++){
                            buttons[i].setDisable(true);
                        }
                        
                    }
                }
            }

            public void newGame(ActionEvent event){
                for(int i=0; i<6; i++){
                    labels[i].setText("");
                }

                for(int i=0; i<26; i++){
                    buttons[i].setDisable(false);
                }
                initialize();
            }
            
        }
    
        
    


