
import javax.swing.ImageIcon;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GUI extends javax.swing.JFrame {

String QuizName0;
String QuizName1 = "Placeholder Name1";
String QuizName2 = "Placeholder Name2";
String QuizName3 = "Placeholder Name3";
String QuizName4 = "Placeholder Name4";
String QuizName5 = "Placeholder Name5";
String QuizName6 = "Placeholder Name6";
String QuizName7 = "Placeholder Name7";
String QuizName8 = "Placeholder Name8";
String FileName1;
String Question1S;
String Question2S;
String Question3S;
String Question4S;
int AnswerMulti1 = 0;
int AnswerTF = 0;
int correctAnswerMulti1 = 10;
int correctAnswerTF = 10;
boolean Option1MultiB = false;
boolean Option2MultiB = false;
boolean Option3MultiB = false;
boolean Option4MultiB = false;
boolean TrueOption1B = false;
boolean FalseOption1B = false;
boolean NextButFix = false;
boolean NextTest1 = false;
boolean EndTestB = false;
int Question1Line;
int QuestionType = 0;
int correctAnswers = 0;

int LineNumber;
private Scanner Scanner1;
    public void openFile() {
        try {
            Scanner1 = new Scanner(new File(System.getProperty("user.dir")+FileName1));
        }
        catch(Exception e){
            System.out.println("File not found 2");
        }
    }

    public void readTittleV1() throws IOException {
        try {
            Scanner1 = new Scanner(new File(System.getProperty("user.dir")+FileName1));
        }
        catch(Exception e){
            System.out.println("File not found 2");
        }
        String readLine = Files.readAllLines(Paths.get(System.getProperty("user.dir")+FileName1)).get(0);
        QuizNameLabel.setText(readLine);
        QuizName1 = readLine;
        Scanner1.close();
    }
    public void closeFile1() {
        //Closes this file scanner
        Scanner1.close();
    }
    
    
    public void readQuestion1M() throws IOException {
        try {
            Scanner1 = new Scanner(new File(System.getProperty("user.dir")+FileName1));
        }
        catch(Exception e){
            System.out.println("File not found 2");
        }
        System.out.println(Question1Line);
        String readLine = Files.readAllLines(Paths.get(System.getProperty("user.dir")+FileName1)).get(Question1Line-1);
        System.out.println("The currect qread line is" + readLine);
        String endTest = Files.readAllLines(Paths.get(System.getProperty("user.dir")+FileName1)).get(Question1Line-1);
        if (endTest.equals("END QUIZ")){
            EndTestB = true;
            int TotalQuestions = (Question1Line -2)/5;
            MultiChoiceDisp.setVisible(false);
            TFChoiceDisp.setVisible(false);
            QuestionLabelM.setText("Quiz Over");
            endTest = " ";            
        }
        if (readLine.equals("T1")&& EndTestB == false){
            MultiChoiceDisp.setVisible(true);
            TFChoiceDisp.setVisible(false);
            QuestionType = 1;
            String answerOption1 = Files.readAllLines(Paths.get(System.getProperty("user.dir")+FileName1)).get(Question1Line + 1);
            String answerOption2 = Files.readAllLines(Paths.get(System.getProperty("user.dir")+FileName1)).get(Question1Line + 2);
            String answerOption3 = Files.readAllLines(Paths.get(System.getProperty("user.dir")+FileName1)).get(Question1Line + 3);
            String answerOption4 = Files.readAllLines(Paths.get(System.getProperty("user.dir")+FileName1)).get(Question1Line + 4);
            String veno1 = answerOption1.substring(3);
            Option1Multi.setText(veno1);
            String check1 = answerOption1.substring(0, 2);
            String veno2 = answerOption2.substring(3);
            Option2Multi.setText(veno2);
            String check2 = answerOption2.substring(0, 2);
            String veno3 = answerOption3.substring(3);
            Option3Multi.setText(veno3);
            String check3 = answerOption3.substring(0, 2);
            String veno4 = answerOption4.substring(3);
            Option4Multi.setText(veno4);
            String check4 = answerOption4.substring(0, 2);
            if (check1.equals("CA")){
                correctAnswerMulti1 = 1;
                System.out.println("Chekc1");
            }
            else if (check2.equals("CA")){
                correctAnswerMulti1 = 2;
                System.out.println("Chekc2");
            }
            else if (check3.equals("CA")){
                correctAnswerMulti1 = 3;
                System.out.println("Chekc3");
            }
            else if (check4.equals("CA")) {
                correctAnswerMulti1 = 4;
                System.out.println("Chekc1");
            }
            
            
        }
        else if (readLine.equals("T2")&& EndTestB == false){
            MultiChoiceDisp.setVisible(false);
            TFChoiceDisp.setVisible(true);
            QuestionType = 2;
            String answerOption1 = Files.readAllLines(Paths.get(System.getProperty("user.dir")+FileName1)).get(Question1Line + 1);
            String answerOption2 = Files.readAllLines(Paths.get(System.getProperty("user.dir")+FileName1)).get(Question1Line + 2);
            String check1 = answerOption1.substring(0, 2);
            String check2 = answerOption2.substring(0, 2);
            if (check1.equals("CA")){
                correctAnswerMulti1 = 1;
            }
            else if (check2.equals("CA")){
                correctAnswerMulti1 = 2;
            }
        }
        else if (readLine.equals("T3")&& EndTestB == false){
            
            QuestionType = 3;
        }
        if (EndTestB == false){
        String readLine1 = Files.readAllLines(Paths.get(System.getProperty("user.dir")+FileName1)).get(Question1Line);
        Question1S = readLine1;
        QuestionLabelM.setText(Question1S);
        NextButFix = false;
        Scanner1.close();
    }
    }
    
    public void setQuestions1M() throws IOException {
        
    }

    
    public void Option1MultiM(){
    ImageIcon Ireg = new ImageIcon(getClass().getResource("/Images/MultiChoiceClick.png"));
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/MultiChoiceDef.png"));
    Option1Multi.setIcon(Ireg);
    Option2Multi.setIcon(IIreg);
    Option3Multi.setIcon(IIreg);
    Option4Multi.setIcon(IIreg);
    AnswerMulti1 = 1;
    }
    public void Option1RMultiM(){
    ImageIcon Ireg = new ImageIcon(getClass().getResource("/Images/MultiChoiceClick.png"));
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/MultiChoiceDef.png"));
    Option1Multi.setIcon(IIreg);
    AnswerMulti1 = 0;
    }
    public void Option2MultiM(){
    ImageIcon Ireg = new ImageIcon(getClass().getResource("/Images/MultiChoiceClick.png"));
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/MultiChoiceDef.png"));
    Option1Multi.setIcon(IIreg);
    Option2Multi.setIcon(Ireg);
    Option3Multi.setIcon(IIreg);
    Option4Multi.setIcon(IIreg);
    AnswerMulti1 = 2;
    }
    public void Option2RMultiM(){
    ImageIcon Ireg = new ImageIcon(getClass().getResource("/Images/MultiChoiceClick.png"));
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/MultiChoiceDef.png"));
    Option2Multi.setIcon(IIreg);
    AnswerMulti1 = 0;
    }
    public void Option3MultiM(){
    ImageIcon Ireg = new ImageIcon(getClass().getResource("/Images/MultiChoiceClick.png"));
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/MultiChoiceDef.png"));
    Option1Multi.setIcon(IIreg);
    Option2Multi.setIcon(IIreg);
    Option3Multi.setIcon(Ireg);
    Option4Multi.setIcon(IIreg);
    AnswerMulti1 = 3;
    }
    public void Option3RMultiM(){
    ImageIcon Ireg = new ImageIcon(getClass().getResource("/Images/MultiChoiceClick.png"));
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/MultiChoiceDef.png"));
    Option3Multi.setIcon(IIreg);
    AnswerMulti1 = 0;
    }
    public void Option4MultiM(){
    ImageIcon Ireg = new ImageIcon(getClass().getResource("/Images/MultiChoiceClick.png"));
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/MultiChoiceDef.png"));
    Option1Multi.setIcon(IIreg);
    Option2Multi.setIcon(IIreg);
    Option3Multi.setIcon(IIreg);
    Option4Multi.setIcon(Ireg);
    AnswerMulti1 = 4;
    }
    public void Option4RMultiM(){
    ImageIcon Ireg = new ImageIcon(getClass().getResource("/Images/MultiChoiceClick.png"));
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/MultiChoiceDef.png"));
    Option4Multi.setIcon(IIreg);
    AnswerMulti1 = 0;
    }

    public GUI() {
        initComponents();
        //Hides all other panels to avoid bugs exept start
        MainMenuPanel.setVisible(false);
        StartMenuPanel.setVisible(true);
        QuizPanelMain.setVisible(false);
        MakeQuizMain.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        StartMenuPanel = new javax.swing.JPanel();
        StartBut = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        MainMenuBack = new javax.swing.JLabel();
        MainBackground = new javax.swing.JLabel();
        MainMenuPanel = new javax.swing.JPanel();
        QuitButLabel = new javax.swing.JLabel();
        HomeButLabel = new javax.swing.JLabel();
        MainMenuBack1 = new javax.swing.JLabel();
        BlueLineBottom = new javax.swing.JLabel();
        MainContentPanel = new javax.swing.JPanel();
        QuizPanelM = new javax.swing.JPanel();
        QuizIconM1 = new javax.swing.JLabel();
        QuizStartM1 = new javax.swing.JLabel();
        QuizPanelM2 = new javax.swing.JPanel();
        QuizStartM2 = new javax.swing.JLabel();
        QuizIconM2 = new javax.swing.JLabel();
        QuizPanelM3 = new javax.swing.JPanel();
        QuizStartM3 = new javax.swing.JLabel();
        QuizIconM3 = new javax.swing.JLabel();
        QuizPanelM4 = new javax.swing.JPanel();
        QuizStartM4 = new javax.swing.JLabel();
        QuizIconM4 = new javax.swing.JLabel();
        QuizPanelM5 = new javax.swing.JPanel();
        QuizStartM5 = new javax.swing.JLabel();
        QuizIconM5 = new javax.swing.JLabel();
        QuizPanelM6 = new javax.swing.JPanel();
        QuizStartM6 = new javax.swing.JLabel();
        QuizIconM6 = new javax.swing.JLabel();
        QuizPanelM7 = new javax.swing.JPanel();
        QuizStartM7 = new javax.swing.JLabel();
        QuizIconM7 = new javax.swing.JLabel();
        QuizPanelM8 = new javax.swing.JPanel();
        QuizIconM8 = new javax.swing.JLabel();
        QuizStartM8 = new javax.swing.JLabel();
        MainBackground1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        QuizPanelMain = new javax.swing.JPanel();
        ExitQuizBut = new javax.swing.JLabel();
        MainQuizDisp = new javax.swing.JPanel();
        QuestionDisp = new javax.swing.JPanel();
        QuizNameLabel = new javax.swing.JLabel();
        QuestionLabelM = new javax.swing.JLabel();
        CheckBut1 = new javax.swing.JLabel();
        NextBut1 = new javax.swing.JLabel();
        QuizInputPanel = new javax.swing.JPanel();
        TFChoiceDisp = new javax.swing.JPanel();
        TrueOption1 = new javax.swing.JLabel();
        FalseOption1 = new javax.swing.JLabel();
        MultiChoiceDisp = new javax.swing.JPanel();
        MultiChoiceDisp1 = new javax.swing.JPanel();
        Option1Multi = new javax.swing.JLabel();
        Option2Multi = new javax.swing.JLabel();
        Option3Multi = new javax.swing.JLabel();
        Option4Multi = new javax.swing.JLabel();
        QuitButLabel2 = new javax.swing.JLabel();
        MainMenuBack3 = new javax.swing.JLabel();
        MainBackground2 = new javax.swing.JLabel();
        MakeQuizMain = new javax.swing.JPanel();
        ExitQuizBut2 = new javax.swing.JLabel();
        QuitButLabel3 = new javax.swing.JLabel();
        MainMenuBack4 = new javax.swing.JLabel();
        MainBackground3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StartMenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StartBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/StartButHov2.png"))); // NOI18N
        StartBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StartButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StartButMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                StartButMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                StartButMouseReleased(evt);
            }
        });
        StartMenuPanel.add(StartBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 580, 300, 100));

        MainMenuBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MenuBackground1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenuBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenuBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        StartMenuPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 40));

        MainBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MainBackground_1.png"))); // NOI18N
        StartMenuPanel.add(MainBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 850));

        jLayeredPane1.add(StartMenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MainMenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        QuitButLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuitButLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuitButDef.png"))); // NOI18N
        QuitButLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        QuitButLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuitButLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QuitButLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QuitButLabelMouseExited(evt);
            }
        });
        MainMenuPanel.add(QuitButLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 100, 50));

        HomeButLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomeButLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HomeBut1.png"))); // NOI18N
        HomeButLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        HomeButLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeButLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeButLabelMouseExited(evt);
            }
        });
        MainMenuPanel.add(HomeButLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 100, 50));

        MainMenuBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MenuBackground1.png"))); // NOI18N
        MainMenuBack1.setPreferredSize(new java.awt.Dimension(1920, 40));
        MainMenuPanel.add(MainMenuBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 40));

        BlueLineBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MenuBackground1.png"))); // NOI18N
        BlueLineBottom.setPreferredSize(new java.awt.Dimension(1920, 40));
        MainMenuPanel.add(BlueLineBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 840, 1420, 10));

        MainContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainContentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        QuizPanelM.setBackground(new java.awt.Color(255, 255, 255));
        QuizPanelM.setPreferredSize(new java.awt.Dimension(292, 292));

        QuizIconM1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuizIconM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuizIconType2.png"))); // NOI18N
        QuizIconM1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        QuizStartM1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuizStartM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuizStartDef.png"))); // NOI18N
        QuizStartM1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QuizStartM1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QuizStartM1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QuizStartM1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                QuizStartM1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout QuizPanelMLayout = new javax.swing.GroupLayout(QuizPanelM);
        QuizPanelM.setLayout(QuizPanelMLayout);
        QuizPanelMLayout.setHorizontalGroup(
            QuizPanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QuizStartM1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
            .addComponent(QuizIconM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        QuizPanelMLayout.setVerticalGroup(
            QuizPanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanelMLayout.createSequentialGroup()
                .addComponent(QuizIconM1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(QuizStartM1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainContentPanel.add(QuizPanelM, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        QuizPanelM2.setBackground(new java.awt.Color(255, 255, 255));
        QuizPanelM2.setPreferredSize(new java.awt.Dimension(292, 292));

        QuizStartM2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuizStartM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuizStartDef.png"))); // NOI18N
        QuizStartM2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QuizStartM2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QuizStartM2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QuizStartM2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                QuizStartM2MouseReleased(evt);
            }
        });

        QuizIconM2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuizIconM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuizIconType3.png"))); // NOI18N
        QuizIconM2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout QuizPanelM2Layout = new javax.swing.GroupLayout(QuizPanelM2);
        QuizPanelM2.setLayout(QuizPanelM2Layout);
        QuizPanelM2Layout.setHorizontalGroup(
            QuizPanelM2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QuizIconM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QuizStartM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        QuizPanelM2Layout.setVerticalGroup(
            QuizPanelM2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanelM2Layout.createSequentialGroup()
                .addComponent(QuizIconM2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(QuizStartM2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainContentPanel.add(QuizPanelM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        QuizPanelM3.setBackground(new java.awt.Color(255, 255, 255));
        QuizPanelM3.setPreferredSize(new java.awt.Dimension(292, 292));

        QuizStartM3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuizStartM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuizStartDef.png"))); // NOI18N
        QuizStartM3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QuizStartM3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QuizStartM3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QuizStartM3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                QuizStartM3MouseReleased(evt);
            }
        });

        QuizIconM3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuizIconM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuizIconType3.png"))); // NOI18N
        QuizIconM3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout QuizPanelM3Layout = new javax.swing.GroupLayout(QuizPanelM3);
        QuizPanelM3.setLayout(QuizPanelM3Layout);
        QuizPanelM3Layout.setHorizontalGroup(
            QuizPanelM3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QuizIconM3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QuizStartM3, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
        );
        QuizPanelM3Layout.setVerticalGroup(
            QuizPanelM3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanelM3Layout.createSequentialGroup()
                .addComponent(QuizIconM3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(QuizStartM3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainContentPanel.add(QuizPanelM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, -1, -1));

        QuizPanelM4.setBackground(new java.awt.Color(255, 255, 255));
        QuizPanelM4.setPreferredSize(new java.awt.Dimension(292, 292));

        QuizStartM4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuizStartM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuizStartDef.png"))); // NOI18N
        QuizStartM4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QuizStartM4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QuizStartM4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QuizStartM4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                QuizStartM4MouseReleased(evt);
            }
        });

        QuizIconM4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuizIconM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuizIconType6.png"))); // NOI18N
        QuizIconM4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout QuizPanelM4Layout = new javax.swing.GroupLayout(QuizPanelM4);
        QuizPanelM4.setLayout(QuizPanelM4Layout);
        QuizPanelM4Layout.setHorizontalGroup(
            QuizPanelM4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QuizIconM4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QuizStartM4, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
        );
        QuizPanelM4Layout.setVerticalGroup(
            QuizPanelM4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanelM4Layout.createSequentialGroup()
                .addComponent(QuizIconM4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(QuizStartM4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainContentPanel.add(QuizPanelM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 100, -1, -1));

        QuizPanelM5.setBackground(new java.awt.Color(255, 255, 255));
        QuizPanelM5.setPreferredSize(new java.awt.Dimension(292, 292));

        QuizStartM5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuizStartM5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuizStartDef.png"))); // NOI18N
        QuizStartM5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QuizStartM5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QuizStartM5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QuizStartM5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                QuizStartM5MouseReleased(evt);
            }
        });

        QuizIconM5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuizIconM5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuizIconType4.png"))); // NOI18N
        QuizIconM5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout QuizPanelM5Layout = new javax.swing.GroupLayout(QuizPanelM5);
        QuizPanelM5.setLayout(QuizPanelM5Layout);
        QuizPanelM5Layout.setHorizontalGroup(
            QuizPanelM5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QuizIconM5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QuizStartM5, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
        );
        QuizPanelM5Layout.setVerticalGroup(
            QuizPanelM5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanelM5Layout.createSequentialGroup()
                .addComponent(QuizIconM5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(QuizStartM5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainContentPanel.add(QuizPanelM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        QuizPanelM6.setBackground(new java.awt.Color(255, 255, 255));
        QuizPanelM6.setPreferredSize(new java.awt.Dimension(292, 292));

        QuizStartM6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuizStartM6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuizStartDef.png"))); // NOI18N
        QuizStartM6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QuizStartM6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QuizStartM6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QuizStartM6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                QuizStartM6MouseReleased(evt);
            }
        });

        QuizIconM6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuizIconM6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuizIconType1.png"))); // NOI18N
        QuizIconM6.setToolTipText("");
        QuizIconM6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout QuizPanelM6Layout = new javax.swing.GroupLayout(QuizPanelM6);
        QuizPanelM6.setLayout(QuizPanelM6Layout);
        QuizPanelM6Layout.setHorizontalGroup(
            QuizPanelM6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QuizIconM6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QuizStartM6, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
        );
        QuizPanelM6Layout.setVerticalGroup(
            QuizPanelM6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanelM6Layout.createSequentialGroup()
                .addComponent(QuizIconM6, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(QuizStartM6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainContentPanel.add(QuizPanelM6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        QuizPanelM7.setBackground(new java.awt.Color(255, 255, 255));
        QuizPanelM7.setPreferredSize(new java.awt.Dimension(292, 292));

        QuizStartM7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuizStartM7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuizStartDef.png"))); // NOI18N
        QuizStartM7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QuizStartM7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QuizStartM7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QuizStartM7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                QuizStartM7MouseReleased(evt);
            }
        });

        QuizIconM7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuizIconM7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuizIconType1.png"))); // NOI18N
        QuizIconM7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout QuizPanelM7Layout = new javax.swing.GroupLayout(QuizPanelM7);
        QuizPanelM7.setLayout(QuizPanelM7Layout);
        QuizPanelM7Layout.setHorizontalGroup(
            QuizPanelM7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QuizIconM7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QuizStartM7, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
        );
        QuizPanelM7Layout.setVerticalGroup(
            QuizPanelM7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanelM7Layout.createSequentialGroup()
                .addComponent(QuizIconM7, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(QuizStartM7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainContentPanel.add(QuizPanelM7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, -1, -1));

        QuizPanelM8.setBackground(new java.awt.Color(255, 255, 255));
        QuizPanelM8.setPreferredSize(new java.awt.Dimension(292, 292));

        QuizStartM8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuizStartM8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuizStartDef.png"))); // NOI18N
        QuizStartM8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QuizStartM8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QuizStartM8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QuizStartM8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                QuizStartM8MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout QuizPanelM8Layout = new javax.swing.GroupLayout(QuizPanelM8);
        QuizPanelM8.setLayout(QuizPanelM8Layout);
        QuizPanelM8Layout.setHorizontalGroup(
            QuizPanelM8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QuizIconM8, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
            .addComponent(QuizStartM8, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
        );
        QuizPanelM8Layout.setVerticalGroup(
            QuizPanelM8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanelM8Layout.createSequentialGroup()
                .addComponent(QuizIconM8, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(QuizStartM8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainContentPanel.add(QuizPanelM8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 420, -1, -1));

        MainBackground1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MainBackgroud2.png"))); // NOI18N
        MainContentPanel.add(MainBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 850));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MainBackgroud2.png"))); // NOI18N
        MainContentPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 810));

        MainMenuPanel.add(MainContentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1420, 810));

        jLayeredPane1.add(MainMenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        QuizPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExitQuizBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ExitButDef.png"))); // NOI18N
        ExitQuizBut.setPreferredSize(new java.awt.Dimension(1920, 40));
        ExitQuizBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitQuizButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitQuizButMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitQuizButMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ExitQuizButMouseReleased(evt);
            }
        });
        QuizPanelMain.add(ExitQuizBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 200, 60));

        MainQuizDisp.setBackground(new java.awt.Color(255, 255, 255));
        MainQuizDisp.setForeground(new java.awt.Color(255, 255, 255));

        QuestionDisp.setBackground(new java.awt.Color(255, 255, 255));
        QuestionDisp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        QuizNameLabel.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 24)); // NOI18N
        QuizNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuizNameLabel.setText("[Insert Quiz Name Here]");
        QuestionDisp.add(QuizNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 75));

        QuestionLabelM.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        QuestionLabelM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuestionLabelM.setText("[Placeholder Question here]");
        QuestionLabelM.setToolTipText("");
        QuestionDisp.add(QuestionLabelM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 81, 1420, 66));

        CheckBut1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CheckBut1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CheckButDef.png"))); // NOI18N
        CheckBut1.setToolTipText("");
        CheckBut1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckBut1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CheckBut1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CheckBut1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CheckBut1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CheckBut1MouseReleased(evt);
            }
        });
        QuestionDisp.add(CheckBut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, 210, 60));

        NextBut1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NextBut1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NextButDef.png"))); // NOI18N
        NextBut1.setToolTipText("");
        NextBut1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextBut1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NextBut1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NextBut1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NextBut1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                NextBut1MouseReleased(evt);
            }
        });
        QuestionDisp.add(NextBut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 660, 210, 60));

        QuizInputPanel.setBackground(new java.awt.Color(255, 255, 255));
        QuizInputPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TFChoiceDisp.setBackground(new java.awt.Color(255, 255, 255));
        TFChoiceDisp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TrueOption1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TrueOption1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TrueButDef.png"))); // NOI18N
        TrueOption1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TrueOption1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TrueOption1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TrueOption1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TrueOption1MouseReleased(evt);
            }
        });
        TFChoiceDisp.add(TrueOption1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 210, 50));

        FalseOption1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FalseOption1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FalseButDef.png"))); // NOI18N
        FalseOption1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FalseOption1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FalseOption1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FalseOption1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FalseOption1MouseReleased(evt);
            }
        });
        TFChoiceDisp.add(FalseOption1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 210, 50));

        QuizInputPanel.add(TFChoiceDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 1080, 370));

        MultiChoiceDisp.setBackground(new java.awt.Color(255, 255, 255));
        MultiChoiceDisp.setPreferredSize(new java.awt.Dimension(710, 516));
        MultiChoiceDisp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MultiChoiceDisp1.setBackground(new java.awt.Color(255, 255, 255));
        MultiChoiceDisp1.setPreferredSize(new java.awt.Dimension(710, 516));

        Option1Multi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MultiChoiceDef.png"))); // NOI18N
        Option1Multi.setText("          [Placeholder Questionhere]");
        Option1Multi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Option1MultiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Option1MultiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Option1MultiMouseExited(evt);
            }
        });

        Option2Multi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MultiChoiceDef.png"))); // NOI18N
        Option2Multi.setText("          [Placeholder Questionhere]");
        Option2Multi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Option2MultiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Option2MultiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Option2MultiMouseExited(evt);
            }
        });

        Option3Multi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MultiChoiceDef.png"))); // NOI18N
        Option3Multi.setText("          [Placeholder Questionhere]");
        Option3Multi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Option3MultiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Option3MultiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Option3MultiMousePressed(evt);
            }
        });

        Option4Multi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MultiChoiceDef.png"))); // NOI18N
        Option4Multi.setText("          [Placeholder Questionhere]");
        Option4Multi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Option4MultiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Option4MultiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Option4MultiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout MultiChoiceDisp1Layout = new javax.swing.GroupLayout(MultiChoiceDisp1);
        MultiChoiceDisp1.setLayout(MultiChoiceDisp1Layout);
        MultiChoiceDisp1Layout.setHorizontalGroup(
            MultiChoiceDisp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MultiChoiceDisp1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(MultiChoiceDisp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Option4Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Option3Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Option2Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Option1Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MultiChoiceDisp1Layout.setVerticalGroup(
            MultiChoiceDisp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MultiChoiceDisp1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(Option1Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Option2Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Option3Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Option4Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        MultiChoiceDisp.add(MultiChoiceDisp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 11, -1, 360));

        QuizInputPanel.add(MultiChoiceDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 0, 1150, 390));

        QuestionDisp.add(QuizInputPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 1380, -1));

        javax.swing.GroupLayout MainQuizDispLayout = new javax.swing.GroupLayout(MainQuizDisp);
        MainQuizDisp.setLayout(MainQuizDispLayout);
        MainQuizDispLayout.setHorizontalGroup(
            MainQuizDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QuestionDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MainQuizDispLayout.setVerticalGroup(
            MainQuizDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainQuizDispLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(QuestionDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        QuizPanelMain.add(MainQuizDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1420, 790));

        QuitButLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuitButLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuitButDef.png"))); // NOI18N
        QuitButLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        QuitButLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuitButLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QuitButLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QuitButLabel2MouseExited(evt);
            }
        });
        QuizPanelMain.add(QuitButLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 100, 50));

        MainMenuBack3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MenuBackground1.png"))); // NOI18N
        MainMenuBack3.setPreferredSize(new java.awt.Dimension(1920, 40));
        QuizPanelMain.add(MainMenuBack3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 40));

        MainBackground2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MainBackgroud2.png"))); // NOI18N
        QuizPanelMain.add(MainBackground2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 850));

        jLayeredPane1.add(QuizPanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MakeQuizMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExitQuizBut2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ExitButDef.png"))); // NOI18N
        ExitQuizBut2.setPreferredSize(new java.awt.Dimension(1920, 40));
        ExitQuizBut2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitQuizBut2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitQuizBut2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitQuizBut2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ExitQuizBut2MouseReleased(evt);
            }
        });
        MakeQuizMain.add(ExitQuizBut2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 200, 60));

        QuitButLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuitButLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuitButDef.png"))); // NOI18N
        QuitButLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        QuitButLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuitButLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QuitButLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QuitButLabel3MouseExited(evt);
            }
        });
        MakeQuizMain.add(QuitButLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 100, 50));

        MainMenuBack4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MenuBackground1.png"))); // NOI18N
        MainMenuBack4.setPreferredSize(new java.awt.Dimension(1920, 40));
        MakeQuizMain.add(MainMenuBack4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 40));

        MainBackground3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MainBackgroud2.png"))); // NOI18N
        MakeQuizMain.add(MainBackground3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 850));

        jLayeredPane1.add(MakeQuizMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartButMouseEntered
    //Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/StartButDef.png"));
    StartBut.setIcon(IIreg);
    }//GEN-LAST:event_StartButMouseEntered

    private void StartButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartButMouseExited
    //Changes label to reg state
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/StartButHov2.png"));
    StartBut.setIcon(IIreg);
    }//GEN-LAST:event_StartButMouseExited

    private void StartButMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartButMousePressed
 //Changes label to clicked state
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/StartButClick2.png"));
    StartBut.setIcon(IIreg);
    }//GEN-LAST:event_StartButMousePressed

    private void StartButMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartButMouseReleased
    //Changes label to reg state
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/StartButHov2.png"));
    StartBut.setIcon(IIreg);
    //Switches to main menu
    MainMenuPanel.setVisible(true);
    StartMenuPanel.setVisible(false);
    QuizPanelMain.setVisible(false);
    MakeQuizMain.setVisible(false);
       
    }//GEN-LAST:event_StartButMouseReleased

    private void HomeButLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButLabelMouseEntered
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/HomeButHov.png"));
    HomeButLabel.setIcon(IIreg);
    }//GEN-LAST:event_HomeButLabelMouseEntered

    private void HomeButLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButLabelMouseExited
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/HomeBut1.png"));
    HomeButLabel.setIcon(IIreg);
    }//GEN-LAST:event_HomeButLabelMouseExited

    private void QuitButLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitButLabelMouseEntered
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuitButHov.png"));
    QuitButLabel.setIcon(IIreg);
    }//GEN-LAST:event_QuitButLabelMouseEntered

    private void QuitButLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitButLabelMouseExited
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuitButDef.png"));
    QuitButLabel.setIcon(IIreg);
    }//GEN-LAST:event_QuitButLabelMouseExited

    private void QuitButLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitButLabelMouseClicked
    //Exiting Program
    System.exit(0);
    }//GEN-LAST:event_QuitButLabelMouseClicked

    private void QuizStartM1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM1MouseEntered
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartHov.png"));
    QuizStartM1.setIcon(IIreg);       
    }//GEN-LAST:event_QuizStartM1MouseEntered

    private void QuizStartM1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM1MouseExited
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartDef.png"));
    QuizStartM1.setIcon(IIreg); 
    }//GEN-LAST:event_QuizStartM1MouseExited

    private void QuizStartM1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM1MousePressed
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartClick.png"));
    QuizStartM1.setIcon(IIreg); 
    }//GEN-LAST:event_QuizStartM1MousePressed

    private void QuizStartM1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM1MouseReleased
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartHov.png"));
    QuizStartM1.setIcon(IIreg);
//Switches to quiz panel
    MainMenuPanel.setVisible(false);
    StartMenuPanel.setVisible(false);
    QuizPanelMain.setVisible(true);
    MakeQuizMain.setVisible(false);
//Sets quiz name in quiz panel
    correctAnswerMulti1 = 0;
    correctAnswers = 0;    
    QuizNameLabel.setText(QuizName1);
    Question1Line = 3;
    EndTestB = false;
    FileName1 = "/src/Files/QuizText1.txt";
    try {
        readTittleV1();
    } catch (IOException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        //Prepares Question 1
        readQuestion1M();
    } catch (IOException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_QuizStartM1MouseReleased

    private void QuizStartM2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM2MouseEntered
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartHov.png"));
    QuizStartM2.setIcon(IIreg); 
    }//GEN-LAST:event_QuizStartM2MouseEntered

    private void QuizStartM2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM2MouseExited
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartDef.png"));
    QuizStartM2.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM2MouseExited

    private void QuizStartM2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM2MousePressed
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartClick.png"));
    QuizStartM2.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM2MousePressed

    private void QuizStartM2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM2MouseReleased
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartHov.png"));
    QuizStartM2.setIcon(IIreg);
//Switches to quiz panel
    MainMenuPanel.setVisible(false);
    StartMenuPanel.setVisible(false);
    QuizPanelMain.setVisible(true);
    MakeQuizMain.setVisible(false);

//Sets quiz name in quiz panel
    correctAnswerMulti1 = 0;
    correctAnswers = 0;    
    QuizNameLabel.setText(QuizName1);
    Question1Line = 3;
    EndTestB = false;
    FileName1 = "/src/Files/QuizText2.txt";
    try {
        readTittleV1();
    } catch (IOException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        //Prepares Question 1
        readQuestion1M();
    } catch (IOException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_QuizStartM2MouseReleased

    private void QuizStartM3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM3MouseEntered
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartHov.png"));
    QuizStartM3.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM3MouseEntered

    private void QuizStartM3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM3MouseExited
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartDef.png"));
    QuizStartM3.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM3MouseExited

    private void QuizStartM3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM3MousePressed
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartClick.png"));
    QuizStartM3.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM3MousePressed

    private void QuizStartM3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM3MouseReleased
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartHov.png"));
    QuizStartM3.setIcon(IIreg);

//Switches to quiz panel
    MainMenuPanel.setVisible(false);
    StartMenuPanel.setVisible(false);
    QuizPanelMain.setVisible(true);
    MakeQuizMain.setVisible(false);

//Sets quiz name in quiz panel
    correctAnswerMulti1 = 0;
    correctAnswers = 0;    
    QuizNameLabel.setText(QuizName1);
    Question1Line = 3;
    EndTestB = false;
    FileName1 = "/src/Files/QuizText3.txt";
    try {
        readTittleV1();
    } catch (IOException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        //Prepares Question 1
        readQuestion1M();
    } catch (IOException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_QuizStartM3MouseReleased

    private void QuizStartM4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM4MouseEntered
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartHov.png"));
    QuizStartM4.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM4MouseEntered

    private void QuizStartM4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM4MouseExited
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartDef.png"));
    QuizStartM4.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM4MouseExited

    private void QuizStartM4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM4MousePressed
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartClick.png"));
    QuizStartM4.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM4MousePressed

    private void QuizStartM4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM4MouseReleased
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartHov.png"));
    QuizStartM4.setIcon(IIreg);
//Switches to quiz panel
    MainMenuPanel.setVisible(false);
    StartMenuPanel.setVisible(false);
    QuizPanelMain.setVisible(true);
    MakeQuizMain.setVisible(false);

//Sets quiz name in quiz panel
    correctAnswerMulti1 = 0;
    correctAnswers = 0;    
    QuizNameLabel.setText(QuizName1);
    Question1Line = 3;
    EndTestB = false;
    FileName1 = "/src/Files/QuizText4.txt";
    try {
        readTittleV1();
    } catch (IOException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        //Prepares Question 1
        readQuestion1M();
    } catch (IOException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_QuizStartM4MouseReleased

    private void QuizStartM5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM5MouseEntered
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartHov.png"));
    QuizStartM5.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM5MouseEntered

    private void QuizStartM5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM5MouseExited
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartDef.png"));
    QuizStartM5.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM5MouseExited

    private void QuizStartM5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM5MousePressed
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartClick.png"));
    QuizStartM5.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM5MousePressed

    private void QuizStartM5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM5MouseReleased
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartHov.png"));
    QuizStartM5.setIcon(IIreg);
//Switches to quiz panel
    MainMenuPanel.setVisible(false);
    StartMenuPanel.setVisible(false);
    QuizPanelMain.setVisible(true);
    MakeQuizMain.setVisible(false);
//Sets quiz name in quiz panel
    correctAnswerMulti1 = 0;
    correctAnswers = 0;    
    QuizNameLabel.setText(QuizName1);
    Question1Line = 3;
    EndTestB = false;
    FileName1 = "/src/Files/QuizText5.txt";
    try {
        readTittleV1();
    } catch (IOException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        //Prepares Question 1
        readQuestion1M();
    } catch (IOException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_QuizStartM5MouseReleased

    private void QuizStartM6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM6MouseEntered
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartHov.png"));
    QuizStartM6.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM6MouseEntered

    private void QuizStartM6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM6MouseExited
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartDef.png"));
    QuizStartM6.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM6MouseExited

    private void QuizStartM6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM6MousePressed
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartClick.png"));
    QuizStartM6.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM6MousePressed

    private void QuizStartM6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM6MouseReleased
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartHov.png"));
    QuizStartM6.setIcon(IIreg);
//Switches to quiz panel
    MainMenuPanel.setVisible(false);
    StartMenuPanel.setVisible(false);
    QuizPanelMain.setVisible(true);
    MakeQuizMain.setVisible(false);

//Sets quiz name in quiz panel
    correctAnswerMulti1 = 0;
    correctAnswers = 0;    
    QuizNameLabel.setText(QuizName1);
    Question1Line = 3;
    EndTestB = false;
    FileName1 = "/src/Files/QuizText6.txt";
    try {
        readTittleV1();
    } catch (IOException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        //Prepares Question 1
        readQuestion1M();
    } catch (IOException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_QuizStartM6MouseReleased

    private void QuizStartM7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM7MouseEntered
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartHov.png"));
    QuizStartM7.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM7MouseEntered

    private void QuizStartM7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM7MouseExited
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartDef.png"));
    QuizStartM7.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM7MouseExited

    private void QuizStartM7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM7MousePressed
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartClick.png"));
    QuizStartM7.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM7MousePressed

    private void QuizStartM7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM7MouseReleased
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartHov.png"));
    QuizStartM7.setIcon(IIreg);
//Switches to quiz panel
    MainMenuPanel.setVisible(false);
    StartMenuPanel.setVisible(false);
    QuizPanelMain.setVisible(true);
    MakeQuizMain.setVisible(false);

//Sets quiz name in quiz panel
    correctAnswerMulti1 = 0;
    correctAnswers = 0;    
    QuizNameLabel.setText(QuizName1);
    Question1Line = 3;
    EndTestB = false;
    FileName1 = "/src/Files/QuizText7.txt";
    try {
        readTittleV1();
    } catch (IOException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        //Prepares Question 1
        readQuestion1M();
    } catch (IOException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_QuizStartM7MouseReleased

    private void QuizStartM8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM8MouseEntered
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartHov.png"));
    QuizStartM8.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM8MouseEntered

    private void QuizStartM8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM8MouseExited
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartDef.png"));
    QuizStartM8.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM8MouseExited

    private void QuizStartM8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM8MousePressed
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartClick.png"));
    QuizStartM8.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM8MousePressed

    private void QuizStartM8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizStartM8MouseReleased
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuizStartHov.png"));
    QuizStartM8.setIcon(IIreg);
    }//GEN-LAST:event_QuizStartM8MouseReleased

    private void ExitQuizButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitQuizButMouseEntered
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/ExitButHov.png"));
    ExitQuizBut.setIcon(IIreg);        
    }//GEN-LAST:event_ExitQuizButMouseEntered

    private void ExitQuizButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitQuizButMouseExited
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/ExitButDef.png"));
    ExitQuizBut.setIcon(IIreg);  
    }//GEN-LAST:event_ExitQuizButMouseExited

    private void ExitQuizButMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitQuizButMousePressed
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/ExitButClick.png"));
    ExitQuizBut.setIcon(IIreg); 
    }//GEN-LAST:event_ExitQuizButMousePressed

    private void ExitQuizButMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitQuizButMouseReleased
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/ExitButHov.png"));
    ExitQuizBut.setIcon(IIreg);
    MainMenuPanel.setVisible(true);
    StartMenuPanel.setVisible(false);
    QuizPanelMain.setVisible(false);
    }//GEN-LAST:event_ExitQuizButMouseReleased

    private void QuitButLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitButLabel2MouseClicked
    //Exiting Program
    System.exit(0);
    }//GEN-LAST:event_QuitButLabel2MouseClicked

    private void QuitButLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitButLabel2MouseEntered
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuitButHov.png"));
    QuitButLabel2.setIcon(IIreg);
    }//GEN-LAST:event_QuitButLabel2MouseEntered

    private void QuitButLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitButLabel2MouseExited
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/QuitButDef.png"));
    QuitButLabel2.setIcon(IIreg);
    }//GEN-LAST:event_QuitButLabel2MouseExited

    private void ExitQuizBut2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitQuizBut2MouseEntered
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/ExitButHov.png"));
    ExitQuizBut2.setIcon(IIreg); 
    }//GEN-LAST:event_ExitQuizBut2MouseEntered

    private void ExitQuizBut2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitQuizBut2MouseExited
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/ExitButDef.png"));
    ExitQuizBut2.setIcon(IIreg); 
    }//GEN-LAST:event_ExitQuizBut2MouseExited

    private void ExitQuizBut2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitQuizBut2MousePressed
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/ExitButClick.png"));
    ExitQuizBut2.setIcon(IIreg); 
    }//GEN-LAST:event_ExitQuizBut2MousePressed

    private void ExitQuizBut2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitQuizBut2MouseReleased
//Changes label to imagehovered
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/ExitButHov.png"));
    ExitQuizBut2.setIcon(IIreg); 
    }//GEN-LAST:event_ExitQuizBut2MouseReleased

    private void QuitButLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitButLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_QuitButLabel3MouseClicked

    private void QuitButLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitButLabel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_QuitButLabel3MouseEntered

    private void QuitButLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitButLabel3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_QuitButLabel3MouseExited

    private void Option1MultiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option1MultiMouseEntered
    if (Option1MultiB == false){
        ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/MultiChoiceHov.png"));
        Option1Multi.setIcon(IIreg);        
    }
    else if (Option1MultiB == true) {
        
    }    
    }//GEN-LAST:event_Option1MultiMouseEntered

    private void Option1MultiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option1MultiMouseExited
    if (Option1MultiB == false){
        ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/MultiChoiceDef.png"));
        Option1Multi.setIcon(IIreg);        
    }
    else if (Option1MultiB == true) {
        
    } 
    }//GEN-LAST:event_Option1MultiMouseExited

    private void Option1MultiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option1MultiMouseClicked
    if (Option1MultiB == false){
        Option1MultiM();
        Option1MultiB = true;
        Option2MultiB = false;
        Option3MultiB = false;
        Option4MultiB = false;
        AnswerMulti1 = 1;
    }
    else if (Option1MultiB == true) {
        Option1RMultiM();
        Option1MultiB = false;
        Option2MultiB = false;
        Option3MultiB = false;
        Option4MultiB = false;
    }
        
    }//GEN-LAST:event_Option1MultiMouseClicked

    private void Option2MultiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option2MultiMouseEntered
//Changes label to imagehovered
    if (Option2MultiB == false){
        ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/MultiChoiceHov.png"));
        Option2Multi.setIcon(IIreg);        
    }
    else if (Option2MultiB == true) {
    } 
    }//GEN-LAST:event_Option2MultiMouseEntered

    private void Option2MultiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option2MultiMouseExited
//Changes label to image def
    if (Option2MultiB == false){
        ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/MultiChoiceDef.png"));
        Option2Multi.setIcon(IIreg);        
    }
    else if (Option2MultiB == true) {
    } 
    }//GEN-LAST:event_Option2MultiMouseExited

    private void Option2MultiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option2MultiMouseClicked
//Changes label to clicked and changes others to def
    if (Option2MultiB == false){
        Option2MultiM();
        Option1MultiB = false;
        Option2MultiB = true;
        Option3MultiB = false;
        Option4MultiB = false;
        AnswerMulti1 = 2;
    }
    else if (Option2MultiB == true) {
        Option2RMultiM();
        Option1MultiB = false;
        Option2MultiB = false;
        Option3MultiB = false;
        Option4MultiB = false;
    }
    }//GEN-LAST:event_Option2MultiMouseClicked

    private void Option3MultiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option3MultiMouseEntered
//Changes label to imagehovered
    if (Option3MultiB == false){
        ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/MultiChoiceHov.png"));
        Option3Multi.setIcon(IIreg);        
    }
    else if (Option3MultiB == true) {
        
    } 
    }//GEN-LAST:event_Option3MultiMouseEntered

    private void Option3MultiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option3MultiMouseExited
//Changes label to image def
    if (Option3MultiB == false){
        ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/MultiChoiceDef.png"));
        Option3Multi.setIcon(IIreg);        
    }
    else if (Option3MultiB == true) {
        
    } 
    }//GEN-LAST:event_Option3MultiMouseExited

    private void Option3MultiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option3MultiMousePressed
//Changes label to clicked and changes others to def
    if (Option3MultiB == false){
        Option3MultiM();
        Option1MultiB = false;
        Option2MultiB = false;
        Option3MultiB = true;
        Option4MultiB = false;
        AnswerMulti1 = 3;
    }
    else if (Option3MultiB == true) {
        Option3RMultiM();
        Option1MultiB = false;
        Option2MultiB = false;
        Option3MultiB = false;
        Option4MultiB = false;
    }
    }//GEN-LAST:event_Option3MultiMousePressed

    private void Option4MultiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option4MultiMouseEntered
//Changes label to imagehovered
    if (Option4MultiB == false){
        ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/MultiChoiceHov.png"));
        Option4Multi.setIcon(IIreg);        
    }
    else if (Option4MultiB == true) {
        
    } 
    }//GEN-LAST:event_Option4MultiMouseEntered

    private void Option4MultiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option4MultiMouseExited
//Changes label to image def
    if (Option4MultiB == false){
        ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/MultiChoiceDef.png"));
        Option4Multi.setIcon(IIreg);        
    }
    else if (Option4MultiB == true) {
        
    } 
    }//GEN-LAST:event_Option4MultiMouseExited

    private void Option4MultiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Option4MultiMouseClicked
//Changes label to clicked and changes others to def
    if (Option4MultiB == false){
        Option4MultiM();
        Option1MultiB = false;
        Option2MultiB = false;
        Option3MultiB = false;
        Option4MultiB = true;
        AnswerMulti1 = 4;
    }
    else if (Option4MultiB == true) {
        Option4RMultiM();
        Option1MultiB = false;
        Option2MultiB = false;
        Option3MultiB = false;
        Option4MultiB = false;
    }
    }//GEN-LAST:event_Option4MultiMouseClicked

    private void NextBut1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextBut1MouseEntered
    //Changes button to hov view
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/NextButHov.png"));
    NextBut1.setIcon(IIreg); 
    }//GEN-LAST:event_NextBut1MouseEntered

    private void NextBut1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextBut1MouseExited
    //Changes button to def view
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/NextButDef.png"));
    NextBut1.setIcon(IIreg); 
    }//GEN-LAST:event_NextBut1MouseExited

    private void NextBut1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextBut1MouseClicked

    }//GEN-LAST:event_NextBut1MouseClicked

    private void NextBut1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextBut1MousePressed
    //Changes button to click view
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/NextButClick.png"));
    NextBut1.setIcon(IIreg); 
    }//GEN-LAST:event_NextBut1MousePressed

    private void NextBut1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextBut1MouseReleased
    //Changes button to hov view
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/NextButHov.png"));
    NextBut1.setIcon(IIreg);
    Question1Line = Question1Line + 6;
        try {
        //Prepares next question
        readQuestion1M();
        } catch (IOException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
         
    }
        TrueOption1B = false;
        FalseOption1B = false;
        Option1MultiB = false;
        Option2MultiB = false;
        Option3MultiB = false;
        Option4MultiB = false;
        ImageIcon Ireg = new ImageIcon(getClass().getResource("/Images/MultiChoiceDef.png"));
        Option1Multi.setIcon(Ireg);
        Option2Multi.setIcon(Ireg);
        Option3Multi.setIcon(Ireg);
        Option4Multi.setIcon(Ireg);
        AnswerMulti1 = 0;
        ImageIcon IIIreg = new ImageIcon(getClass().getResource("/Images/TrueButDef.png"));
        ImageIcon IIIIreg = new ImageIcon(getClass().getResource("/Images/FalseButDef.png"));
        TrueOption1.setIcon(IIIreg); 
        FalseOption1.setIcon(IIIIreg); 
    
    if (AnswerMulti1 == correctAnswerMulti1){
        correctAnswers = correctAnswers + 1;
        System.out.println("Currect Correct answer was" + correctAnswerMulti1);
        System.out.println("Currect Correct answers is" + correctAnswers);
    }
    System.out.println("Currect Correct answer was" + correctAnswerMulti1);
    AnswerMulti1=10;
    
    
    
    }//GEN-LAST:event_NextBut1MouseReleased

    private void TrueOption1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrueOption1MouseEntered
    //Changes button to hov view
    if (TrueOption1B == false){
        ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/TrueButHov.png"));
        TrueOption1.setIcon(IIreg);         
    }
    else if (TrueOption1B == true) {
        
    } 
    
    }//GEN-LAST:event_TrueOption1MouseEntered

    private void TrueOption1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrueOption1MouseExited
    //Changes button to hov view
    if (TrueOption1B == false){
        ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/TrueButDef.png"));
        TrueOption1.setIcon(IIreg);         
    }
    else if (TrueOption1B == true) {
        
    } 
    }//GEN-LAST:event_TrueOption1MouseExited

    private void TrueOption1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrueOption1MousePressed
    //Changes button to hov view
    if (TrueOption1B == false){
        ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/TrueButClick.png"));
        TrueOption1.setIcon(IIreg);         
    }
    else if (TrueOption1B == true) {
        
    } 
    }//GEN-LAST:event_TrueOption1MousePressed

    private void TrueOption1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrueOption1MouseReleased
    //Changes button to hov view
    if (TrueOption1B == false){
        ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/TrueButDef.png"));
        TrueOption1.setIcon(IIreg); 
        TrueOption1B = true;
        FalseOption1B = true;
    }
    else if (TrueOption1B == true) {
        
    }
    ImageIcon TCreg = new ImageIcon(getClass().getResource("/Images/TrueButCA.png"));
    ImageIcon TWreg = new ImageIcon(getClass().getResource("/Images/TrueButWA.png"));
    ImageIcon FCreg = new ImageIcon(getClass().getResource("/Images/FalseButCA.png"));
    ImageIcon FWreg = new ImageIcon(getClass().getResource("/Images/FalseButWA.png"));
    if (correctAnswerMulti1==1 ){            
        TrueOption1.setIcon(TCreg);
        FalseOption1.setIcon(FWreg);
        AnswerTF = 1;
    }
    if (correctAnswerMulti1==2){            
        TrueOption1.setIcon(TWreg);
        FalseOption1.setIcon(FCreg);
    }
    NextTest1 = true;
    }//GEN-LAST:event_TrueOption1MouseReleased

    private void FalseOption1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FalseOption1MouseEntered
   //Changes button to hov view
    if (FalseOption1B == false){
        ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/FalseButHov.png"));
        FalseOption1.setIcon(IIreg);         
    }
    else if (FalseOption1B == true) {
        
    } 
    }//GEN-LAST:event_FalseOption1MouseEntered

    private void FalseOption1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FalseOption1MouseExited
   //Changes button to def view
    if (FalseOption1B == false){
        ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/FalseButDef.png"));
        FalseOption1.setIcon(IIreg);         
    }
    else if (FalseOption1B == true) {
        
    } 
    }//GEN-LAST:event_FalseOption1MouseExited

    private void FalseOption1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FalseOption1MousePressed
   //Changes button to click view
    if (FalseOption1B == false){
        ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/FalseButClick.png"));
        FalseOption1.setIcon(IIreg);         
    }
    else if (FalseOption1B == true) {
        
    }
    }//GEN-LAST:event_FalseOption1MousePressed

    private void FalseOption1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FalseOption1MouseReleased
//Changes button to def view and runs a check code
    if (FalseOption1B == false){
        ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/FalseButDef.png"));
        FalseOption1.setIcon(IIreg); 
        FalseOption1B = true;
        TrueOption1B = true;
    }
    else if (FalseOption1B == true) {
        
    }
    ImageIcon TCreg = new ImageIcon(getClass().getResource("/Images/TrueButCA.png"));
    ImageIcon TWreg = new ImageIcon(getClass().getResource("/Images/TrueButWA.png"));
    ImageIcon FCreg = new ImageIcon(getClass().getResource("/Images/FalseButCA.png"));
    ImageIcon FWreg = new ImageIcon(getClass().getResource("/Images/FalseButWA.png"));
    if (correctAnswerMulti1==1 ){            
        TrueOption1.setIcon(TCreg);
        FalseOption1.setIcon(FWreg);
    }
    if (correctAnswerMulti1==2){            
        TrueOption1.setIcon(TWreg);
        FalseOption1.setIcon(FCreg);
        AnswerTF = 1;
    }
    }//GEN-LAST:event_FalseOption1MouseReleased

    private void CheckBut1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckBut1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBut1MouseClicked

    private void CheckBut1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckBut1MouseEntered
//Changes button to hov view
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/CheckButHov.png"));
    CheckBut1.setIcon(IIreg);
    }//GEN-LAST:event_CheckBut1MouseEntered

    private void CheckBut1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckBut1MouseExited
//Changes button to def view
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/CheckButDef.png"));
    CheckBut1.setIcon(IIreg);
    }//GEN-LAST:event_CheckBut1MouseExited

    private void CheckBut1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckBut1MousePressed
//Changes button to def view
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/CheckButClick.png"));
    CheckBut1.setIcon(IIreg);
    }//GEN-LAST:event_CheckBut1MousePressed

    private void CheckBut1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckBut1MouseReleased
//Changes button to def view
    ImageIcon IIreg = new ImageIcon(getClass().getResource("/Images/CheckButHov.png"));
    CheckBut1.setIcon(IIreg);
    
    if (QuestionType == 1) {        
        ImageIcon Creg = new ImageIcon(getClass().getResource("/Images/MultiChoiceCA.png"));
        ImageIcon Wreg = new ImageIcon(getClass().getResource("/Images/MultiChoiceWA.png"));
        if (correctAnswerMulti1==1 ){
            
            Option1Multi.setIcon(Creg);
            Option2Multi.setIcon(Wreg);
            Option3Multi.setIcon(Wreg);
            Option4Multi.setIcon(Wreg);
        }
        if (correctAnswerMulti1==2){
            
            Option1Multi.setIcon(Wreg);
            Option2Multi.setIcon(Creg);
            Option3Multi.setIcon(Wreg);
            Option4Multi.setIcon(Wreg);
        }
        if (correctAnswerMulti1==3){
            
            Option1Multi.setIcon(Wreg);
            Option2Multi.setIcon(Wreg);
            Option3Multi.setIcon(Creg);
            Option4Multi.setIcon(Wreg);
        }
        if (correctAnswerMulti1==4){
            
            Option1Multi.setIcon(Wreg);
            Option2Multi.setIcon(Wreg);
            Option3Multi.setIcon(Wreg);
            Option4Multi.setIcon(Creg);
        }
        }
        if (QuestionType == 2){
            System.out.println("Enetered type 2");
            ImageIcon TCreg = new ImageIcon(getClass().getResource("/Images/TrueButCA.png"));
            ImageIcon TWreg = new ImageIcon(getClass().getResource("/Images/TrueButWA.png"));
            ImageIcon FCreg = new ImageIcon(getClass().getResource("/Images/FalseeButCA.png"));
            ImageIcon FWreg = new ImageIcon(getClass().getResource("/Images/FalseButWA.png"));
            if (correctAnswerMulti1==1 ){            
            TrueOption1.setIcon(TCreg);
            FalseOption1.setIcon(FWreg);
            }
            if (correctAnswerMulti1==2){            
            TrueOption1.setIcon(TWreg);
            FalseOption1.setIcon(FCreg);
            }
        }
        NextTest1 = true;
    
    }//GEN-LAST:event_CheckBut1MouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BlueLineBottom;
    private javax.swing.JLabel CheckBut1;
    private javax.swing.JLabel ExitQuizBut;
    private javax.swing.JLabel ExitQuizBut2;
    private javax.swing.JLabel FalseOption1;
    private javax.swing.JLabel HomeButLabel;
    private javax.swing.JLabel MainBackground;
    private javax.swing.JLabel MainBackground1;
    private javax.swing.JLabel MainBackground2;
    private javax.swing.JLabel MainBackground3;
    private javax.swing.JPanel MainContentPanel;
    private javax.swing.JLabel MainMenuBack;
    private javax.swing.JLabel MainMenuBack1;
    private javax.swing.JLabel MainMenuBack3;
    private javax.swing.JLabel MainMenuBack4;
    private javax.swing.JPanel MainMenuPanel;
    private javax.swing.JPanel MainQuizDisp;
    private javax.swing.JPanel MakeQuizMain;
    private javax.swing.JPanel MultiChoiceDisp;
    private javax.swing.JPanel MultiChoiceDisp1;
    private javax.swing.JLabel NextBut1;
    private javax.swing.JLabel Option1Multi;
    private javax.swing.JLabel Option2Multi;
    private javax.swing.JLabel Option3Multi;
    private javax.swing.JLabel Option4Multi;
    private javax.swing.JPanel QuestionDisp;
    private javax.swing.JLabel QuestionLabelM;
    private javax.swing.JLabel QuitButLabel;
    private javax.swing.JLabel QuitButLabel2;
    private javax.swing.JLabel QuitButLabel3;
    private javax.swing.JLabel QuizIconM1;
    private javax.swing.JLabel QuizIconM2;
    private javax.swing.JLabel QuizIconM3;
    private javax.swing.JLabel QuizIconM4;
    private javax.swing.JLabel QuizIconM5;
    private javax.swing.JLabel QuizIconM6;
    private javax.swing.JLabel QuizIconM7;
    private javax.swing.JLabel QuizIconM8;
    private javax.swing.JPanel QuizInputPanel;
    private javax.swing.JLabel QuizNameLabel;
    private javax.swing.JPanel QuizPanelM;
    private javax.swing.JPanel QuizPanelM2;
    private javax.swing.JPanel QuizPanelM3;
    private javax.swing.JPanel QuizPanelM4;
    private javax.swing.JPanel QuizPanelM5;
    private javax.swing.JPanel QuizPanelM6;
    private javax.swing.JPanel QuizPanelM7;
    private javax.swing.JPanel QuizPanelM8;
    private javax.swing.JPanel QuizPanelMain;
    private javax.swing.JLabel QuizStartM1;
    private javax.swing.JLabel QuizStartM2;
    private javax.swing.JLabel QuizStartM3;
    private javax.swing.JLabel QuizStartM4;
    private javax.swing.JLabel QuizStartM5;
    private javax.swing.JLabel QuizStartM6;
    private javax.swing.JLabel QuizStartM7;
    private javax.swing.JLabel QuizStartM8;
    private javax.swing.JLabel StartBut;
    private javax.swing.JPanel StartMenuPanel;
    private javax.swing.JPanel TFChoiceDisp;
    private javax.swing.JLabel TrueOption1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
