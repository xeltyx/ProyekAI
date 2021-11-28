package ProyekAI.game.handler;

import ProyekAI.game.stat.Stat;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends JFrame {
    Stat s = new Stat();
    ImageIcon charaImg;
    final JLabel chara;
    ImageIcon creditImg;
    JLabel credit;
    JPanel creditPane = new JPanel();
    JPanel nameInsert = new JPanel();
    JPanel classTitle = new JPanel();
    ImageIcon titleClass;
    JLabel ctitle;
    JPanel titlePane = new JPanel();
    boolean newGame = false;
    boolean enterGame = false;
    boolean contButton = false;
    JPanel continueMenu = new JPanel();
    JPanel newgameMenu = new JPanel();
    ImageIcon clickedCon;
    final JLabel cCon = new JLabel();
    ImageIcon titleImage;
    ImageIcon continueImage;
    Image imageModified;
    final JLabel title;
    final JLabel con;
    Image scaler;
    ImageIcon menuBack;
    final JLabel menuB;
    ImageIcon clickedNew;
    final JLabel background;
    ImageIcon newImage;
    final JLabel newg;
    JPanel menuContainer = new JPanel();
    final JLabel menuB2;
    ImageIcon exitBack;
    final JLabel menuBexit;
    JPanel exitConf = new JPanel();
    File hoverFX;
    Clip hoverSfx;
    AudioInputStream hoverAudio;
    ImageIcon yesButton;
    ImageIcon noButton;
    ImageIcon clickedYes;
    ImageIcon clickedNo;
    final JLabel yes;
    final JLabel no;
    ImageIcon playButton;
    ImageIcon playClicked;
    JPanel startingMenu = new JPanel();
    final JLabel playIcon;
    final JLabel[] classButton = new JLabel[5];
    ImageIcon chooseBack;
    final JLabel choose;
    JLabel className = new JLabel("", JLabel.CENTER);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public MainMenu() throws FileNotFoundException, IOException, UnsupportedAudioFileException, LineUnavailableException {
        charaImg = new ImageIcon("");
        scaler = charaImg.getImage();
        imageModified = scaler.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
        charaImg = new ImageIcon(imageModified);
        chara = new JLabel("", charaImg, JLabel.CENTER);
        chara.setBounds((int) (screenSize.getWidth() / 1.8), (int) (screenSize.getHeight() / 1.5), 150, 200);
        className.setFont(new Font("Times New Roman", 1, 40));
        className.setSize(400, 400);
        className.setForeground(Color.WHITE);
        ImageIcon[] classImg = new ImageIcon[5];
        String[] classDir = new String[5];
        String[] clickedClass = new String[5];
        ImageIcon[] clickedCimg = new ImageIcon[5];
        classDir[0] = "src/classImg/assassinClass.png";
        classDir[1] = "src/classImg/gunnerClass.png";
        classDir[2] = "src/classImg/paladinClass.png";
        classDir[3] = "src/classImg/swordmanClass.png";
        classDir[4] = "src/classImg/warlockClass.png";
        clickedClass[0] = "src/classImg/assassinHovered.png";
        clickedClass[1] = "src/classImg/gunnerHovered.png";
        clickedClass[2] = "src/classImg/paladinHovered.png";
        clickedClass[3] = "src/classImg/swordmanHovered.png";
        clickedClass[4] = "src/classImg/warlockHovered.png";
        for (int i = 0; i < 5; i++) {
            classImg[i] = new ImageIcon(classDir[i]);
            scaler = classImg[i].getImage();
            imageModified = scaler.getScaledInstance(200, 200, 300);
            classImg[i] = new ImageIcon(imageModified);
            classButton[i] = new JLabel("", classImg[i], JLabel.CENTER);
        }
        for (int i = 0; i < 5; i++) {
            clickedCimg[i] = new ImageIcon(clickedClass[i]);
            scaler = clickedCimg[i].getImage();
            imageModified = scaler.getScaledInstance(200, 200, 10);
            clickedCimg[i] = new ImageIcon(imageModified);

        }

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);

        int widthDivider = (int) screenSize.getWidth() / 5;
        classButton[0].setBounds((int) (widthDivider * 0.13), (int) (screenSize.getHeight() / 3.75), 200, 200);
        classButton[1].setBounds((int) (widthDivider * 1.13), (int) (screenSize.getHeight() / 3.75), 200, 200);
        classButton[2].setBounds((int) (widthDivider * 2.13), (int) (screenSize.getHeight() / 3.75), 200, 200);
        classButton[3].setBounds((int) (widthDivider * 3.13), (int) (screenSize.getHeight() / 3.75), 200, 200);
        classButton[4].setBounds((int) (widthDivider * 4.13), (int) (screenSize.getHeight() / 3.75), 200, 200);

        for (int i = 0; i < 5; i++) {
            newgameMenu.add(classButton[i]);
        }

        chooseBack = new ImageIcon("src/res/chooseBack.png");
        scaler = chooseBack.getImage();
        imageModified = scaler.getScaledInstance((int) screenSize.getWidth(), (int) screenSize.getHeight(), java.awt.Image.SCALE_SMOOTH);

        chooseBack = new ImageIcon(imageModified);
        choose = new JLabel("", chooseBack, JLabel.CENTER);
        choose.setBounds(0, 0, ((int) screenSize.getWidth()), ((int) screenSize.getHeight()));
        playButton = new ImageIcon("src/res/buttonPlay.png");
        scaler = playButton.getImage();
        imageModified = scaler.getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH);
        playButton = new ImageIcon(imageModified);
        playIcon = new JLabel("", playButton, JLabel.CENTER);
        playIcon.setBounds((int) (screenSize.getWidth() / 3.15), (int) (screenSize.getHeight() / 2.75), 500, 300);

        playClicked = new ImageIcon("src/res/buttonPlayClicked.png");
        scaler = playClicked.getImage();
        imageModified = scaler.getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH);
        playClicked = new ImageIcon(imageModified);
        startingMenu.add(playIcon);

        yesButton = new ImageIcon("src/res/yesButton.png");
        scaler = yesButton.getImage();
        imageModified = scaler.getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH);
        yesButton = new ImageIcon(imageModified);
        yes = new JLabel("", yesButton, JLabel.CENTER);
        yes.setBounds((int) (screenSize.getWidth() / 3.25), (int) (screenSize.getHeight() / 2.5), 200, 100);

        noButton = new ImageIcon("src/res/noButton.png");
        scaler = noButton.getImage();
        imageModified = scaler.getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH);
        noButton = new ImageIcon(imageModified);
        no = new JLabel("", noButton, JLabel.CENTER);
        no.setBounds((int) (screenSize.getWidth() / 1.825), (int) (screenSize.getHeight() / 2.5), 200, 100);

        clickedYes = new ImageIcon("src/res/clickedYes.png");
        scaler = clickedYes.getImage();
        imageModified = scaler.getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH);
        clickedYes = new ImageIcon(imageModified);

        clickedNo = new ImageIcon("src/res/clickedNo.png");
        scaler = clickedNo.getImage();
        imageModified = scaler.getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH);
        clickedNo = new ImageIcon(imageModified);

        exitBack = new ImageIcon("src/res/exitMenu.png");
        scaler = exitBack.getImage();
        imageModified = scaler.getScaledInstance(700, 200, java.awt.Image.SCALE_SMOOTH);
        exitBack = new ImageIcon(imageModified);
        menuBexit = new JLabel("", exitBack, JLabel.CENTER);
        menuBexit.setBounds((int) (screenSize.getWidth() / 4.1), (int) (screenSize.getHeight() / 2.95), 700, 200);
        exitConf.add(yes);
        exitConf.add(no);
        exitConf.add(menuBexit);
        exitConf.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                new ImageIcon("src/res/cursor.png").getImage(),
                new Point(0, 0), "custom cursor"));

        className.setBounds((int) (screenSize.getWidth() / 2.85), (int) (screenSize.getHeight() / 2.5), 400, 400);
        newgameMenu.add(className);

        clickedCon = new ImageIcon("src/res/clickedContinue.png");
        scaler = clickedCon.getImage();
        imageModified = scaler.getScaledInstance(300, 100, java.awt.Image.SCALE_SMOOTH);
        clickedCon = new ImageIcon(imageModified);

        newImage = new ImageIcon("src/res/newButton.png");
        scaler = newImage.getImage();
        imageModified = scaler.getScaledInstance(300, 100, java.awt.Image.SCALE_SMOOTH);
        newImage = new ImageIcon(imageModified);
        newg = new JLabel("", newImage, JLabel.CENTER);

        clickedNew = new ImageIcon("src/res/clickedNewgame.png");
        scaler = clickedNew.getImage();
        imageModified = scaler.getScaledInstance(300, 100, java.awt.Image.SCALE_SMOOTH);
        clickedNew = new ImageIcon(imageModified);

        continueImage = new ImageIcon("src/res/continueButton.png");
        scaler = continueImage.getImage();
        imageModified = scaler.getScaledInstance(300, 100, java.awt.Image.SCALE_SMOOTH);
        continueImage = new ImageIcon(imageModified);
        con = new JLabel("", continueImage, JLabel.CENTER);

        titleImage = new ImageIcon("src/res/titleNew.png");
        scaler = titleImage.getImage();
        imageModified = scaler.getScaledInstance(600, 200, java.awt.Image.SCALE_SMOOTH);
        titleImage = new ImageIcon(imageModified);
        title = new JLabel("", titleImage, JLabel.CENTER);

        menuBack = new ImageIcon("src/res/menuBack.png");
        scaler = menuBack.getImage();
        imageModified = scaler.getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH);
        menuBack = new ImageIcon(imageModified);
        menuB = new JLabel("", menuBack, JLabel.CENTER);

        titleClass = new ImageIcon("src/res/topClass.png");
        scaler = titleClass.getImage();
        imageModified = scaler.getScaledInstance(750, 150, java.awt.Image.SCALE_SMOOTH);
        titleClass = new ImageIcon(imageModified);
        ctitle = new JLabel("", titleClass, JLabel.CENTER);
        ctitle.setBounds((int) (screenSize.getWidth() / 4.45), 10, 750, 150);
        classTitle.add(ctitle);

        ImageIcon img = new ImageIcon("src/res/bground.png");
        scaler = img.getImage();
        imageModified = scaler.getScaledInstance((int) screenSize.getWidth(), (int) screenSize.getHeight(), java.awt.Image.SCALE_SMOOTH);
        img = new ImageIcon(imageModified);
        background = new JLabel("", img, JLabel.CENTER);
        final ImageIcon b1 = img;
        final ImageIcon b2 = chooseBack;
        final ImageIcon con2 = clickedCon;
        final ImageIcon new1 = newImage;
        final ImageIcon new2 = clickedNew;
        final ImageIcon con1 = continueImage;
        final ImageIcon yes1 = yesButton;
        final ImageIcon yes2 = clickedYes;
        final ImageIcon no1 = noButton;
        final ImageIcon no2 = clickedNo;
        final ImageIcon p1 = playButton;
        final ImageIcon p2 = playClicked;
        final ImageIcon[] class1 = classImg;
        final ImageIcon[] class2 = clickedCimg;
        classTitle.setLayout(null);
        exitConf.setLayout(null);
        menuContainer.setLayout(null);
        continueMenu.setLayout(null);
        startingMenu.setLayout(null);
        newgameMenu.setLayout(null);
        newgameMenu.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                new ImageIcon("src/res/cursor.png").getImage(),
                new Point(0, 0), "custom cursor"));
        startingMenu.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                new ImageIcon("src/res/cursor.png").getImage(),
                new Point(0, 0), "custom cursor"));
        con.setBounds((int) (screenSize.getWidth() / 2.58), (int) (screenSize.getHeight() / 2.2), 300, 100);
        title.setBounds((int) (screenSize.getWidth() / 3.60), 10, 600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        newg.setBounds((int) (screenSize.getWidth() / 2.58), (int) (screenSize.getHeight() / 1.5), 300, 100);

        menuB.setBounds((int) (screenSize.getWidth() / 2.85), (int) (screenSize.getHeight() / 2.5), 400, 400);
        background.setBounds(0, 0, (int) screenSize.getWidth(), (int) screenSize.getHeight());

        menuContainer.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                new ImageIcon("src/res/cursor.png").getImage(),
                new Point(0, 0), "custom cursor"));

        mouseAction(con1, con2, new1, new2, yes1, yes2, no1, no2, p1, p2, class1, class2, b1, b2);
        setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                new ImageIcon("src/res/cursor.png").getImage(),
                new Point(0, 0), "custom cursor"));
        titlePane.add(title);
        titlePane.setBounds(0, 0, (int) screenSize.getWidth(), (int) screenSize.getHeight() / 3);
        titlePane.setBackground(new Color(0, 0, 0, 0));

        menuContainer.add(con);
        menuContainer.add(newg);
        menuContainer.add(menuB);

        menuContainer.setBounds(0, 0, (int) screenSize.getWidth(), (int) screenSize.getHeight());
        menuContainer.setBackground(new Color(213, 134, 145, 123));
        continueMenu.setBounds(0, 0, (int) screenSize.getWidth(), (int) screenSize.getHeight());
        continueMenu.setBackground(new Color(213, 134, 145, 123));
        exitConf.setBounds(0, 0, (int) screenSize.getWidth(), (int) screenSize.getHeight());
        exitConf.setBackground(new Color(213, 134, 145, 123));
        startingMenu.setBounds(0, 0, (int) screenSize.getWidth(), (int) screenSize.getHeight());
        startingMenu.setBackground(new Color(213, 134, 145, 123));
        newgameMenu.setBounds(0, 0, (int) screenSize.getWidth(), (int) screenSize.getHeight());
        newgameMenu.setBackground(new Color(213, 134, 145, 123));
        newgameMenu.add(ctitle);
        add(titlePane);
        add(startingMenu);
        add(menuContainer);
        add(exitConf);
        add(newgameMenu);
        newgameMenu.add(chara);
        menuBack = new ImageIcon("src/res/menuBack.png");
        scaler = menuBack.getImage();
        imageModified = scaler.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH);
        menuBack = new ImageIcon(imageModified);
        menuB2 = new JLabel("", menuBack, JLabel.CENTER);
        menuB2.setBounds((int) (screenSize.getWidth() / 3.15), (int) (screenSize.getHeight() / 2.95), 500, 500);
        continueMenu.add(menuB2);
        add(continueMenu);
        add(background);
        titlePane.setVisible(true);

        startingMenu.setVisible(true);
        newgameMenu.setVisible(false);
        menuContainer.setVisible(false);
        continueMenu.setVisible(false);
        exitConf.setVisible(false);
        pack();
        setVisible(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    if (enterGame) {
                        if (contButton || newGame) {
                            titlePane.setVisible(true);
                            classTitle.setVisible(false);

                            exitConf.setVisible(false);
                            menuContainer.setVisible(true);
                            startingMenu.setVisible(false);
                            continueMenu.setVisible(false);
                            newgameMenu.setVisible(false);
                            newGame = false;
                            contButton = false;

                        } else {
                            titlePane.setVisible(true);
                            classTitle.setVisible(false);

                            exitConf.setVisible(false);
                            menuContainer.setVisible(false);
                            startingMenu.setVisible(true);
                            continueMenu.setVisible(false);
                            newgameMenu.setVisible(false);
                            enterGame = false;
                        }
                    } else {
                        titlePane.setVisible(false);
                        classTitle.setVisible(false);

                        exitConf.setVisible(true);
                        menuContainer.setVisible(false);
                        startingMenu.setVisible(false);
                        continueMenu.setVisible(false);
                        newgameMenu.setVisible(false);
                    }
                }
            }
        }
        );

    }

    private void mouseAction(ImageIcon con1, ImageIcon con2, ImageIcon new1, ImageIcon new2, ImageIcon yes1, ImageIcon yes2, ImageIcon no1, ImageIcon no2, ImageIcon p1, ImageIcon p2, ImageIcon[] class1, ImageIcon[] class2, ImageIcon b1, ImageIcon b2) {
        ImageIcon[] character = new ImageIcon[5];
        character[0] = new ImageIcon("src/character/assassin.png");
        character[1] = new ImageIcon("src/character/gunner.png");
        character[2] = new ImageIcon("src/character/paladin.png");
        character[3] = new ImageIcon("src/character/swordsman.png");
        character[4] = new ImageIcon("src/character/warlock.png");
        for (int j = 0; j < 5; j++) {
            scaler = character[j].getImage();
            imageModified = scaler.getScaledInstance(150, 250, java.awt.Image.SCALE_SMOOTH);
            character[j] = new ImageIcon(imageModified);
        }
        newg.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent arg0) {
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                classTitle.setVisible(true);
                exitConf.setVisible(false);
                menuContainer.setVisible(false);
                startingMenu.setVisible(false);
                continueMenu.setVisible(false);
                newgameMenu.setVisible(true);
                titlePane.setVisible(false);
                newgameMenu.setBackground(Color.DARK_GRAY);
                newGame = true;
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                newg.setIcon(new1);
                menuContainer.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                        new ImageIcon("src/res/cursor.png").getImage(),
                        new Point(0, 0), "custom cursor"));
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                newg.setIcon(new2);
                menuContainer.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                        new ImageIcon("src/res/cursorPoint.png").getImage(),
                        new Point(0, 0), "custom cursor"));
            }

            @Override
            public void mouseClicked(MouseEvent arg0) {
            }

        }
        );

        con.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent arg0) {
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                titlePane.setVisible(true);
                exitConf.setVisible(false);
                menuContainer.setVisible(false);
                startingMenu.setVisible(false);
                continueMenu.setVisible(true);
                newgameMenu.setVisible(false);

                contButton = true;
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                con.setIcon(con1);
                menuContainer.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                        new ImageIcon("src/res/cursor.png").getImage(),
                        new Point(0, 0), "custom cursor"));
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                con.setIcon(con2);
                menuContainer.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                        new ImageIcon("src/res/cursorPoint.png").getImage(),
                        new Point(0, 0), "custom cursor"));

            }

            @Override
            public void mouseClicked(MouseEvent arg0) {
            }
        });
        yes.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent arg0) {
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                System.exit(0);
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                yes.setIcon(yes1);
                exitConf.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                        new ImageIcon("src/res/cursor.png").getImage(),
                        new Point(0, 0), "custom cursor"));

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                yes.setIcon(yes2);
                exitConf.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                        new ImageIcon("src/res/cursorPoint.png").getImage(),
                        new Point(0, 0), "custom cursor"));

            }

            @Override
            public void mouseClicked(MouseEvent arg0) {
            }
        });
        no.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent arg0) {
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                classTitle.setVisible(false);

                titlePane.setVisible(true);
                exitConf.setVisible(false);
                menuContainer.setVisible(false);
                startingMenu.setVisible(true);
                continueMenu.setVisible(false);
                newgameMenu.setVisible(false);

            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                no.setIcon(no1);
                exitConf.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                        new ImageIcon("src/res/cursor.png").getImage(),
                        new Point(0, 0), "custom cursor"));
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                no.setIcon(no2);
                exitConf.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                        new ImageIcon("src/res/cursorPoint.png").getImage(),
                        new Point(0, 0), "custom cursor"));
            }

            @Override
            public void mouseClicked(MouseEvent arg0) {
            }
        });
        playIcon.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent arg0) {
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                classTitle.setVisible(false);

                titlePane.setVisible(true);
                startingMenu.setVisible(false);
                exitConf.setVisible(false);
                menuContainer.setVisible(true);
                continueMenu.setVisible(false);
                newgameMenu.setVisible(false);

                enterGame = true;
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                playIcon.setIcon(p1);
                startingMenu.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                        new ImageIcon("src/res/cursor.png").getImage(),
                        new Point(0, 0), "custom cursor"));
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                playIcon.setIcon(p2);
                startingMenu.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                        new ImageIcon("src/res/cursorPoint.png").getImage(),
                        new Point(0, 0), "custom cursor"));

            }

            @Override
            public void mouseClicked(MouseEvent arg0) {
            }
        });
        for (int i = 0; i < 5; i++) {
            int p = i;
            classButton[p].addMouseListener(new MouseListener() {
                @Override
                public void mouseReleased(MouseEvent arg0) {
                }

                @Override
                public void mousePressed(MouseEvent arg0) {
                    enterGame = true;
                }

                @Override
                public void mouseExited(MouseEvent arg0) {
                    classButton[p].setIcon(class1[p]);
                    newgameMenu.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                            new ImageIcon("src/res/cursor.png").getImage(),
                            new Point(0, 0), "custom cursor"));
                    className.setText(null);
                    chara.setIcon(null);

                }

                @Override
                public void mouseEntered(MouseEvent arg0) {

                    classButton[p].setIcon(class2[p]);
                    newgameMenu.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                            new ImageIcon("src/res/cursorPoint.png").getImage(),
                            new Point(0, 0), "custom cursor"));

                    if (p == 0) {
                        className.setText("Assassin");
                        chara.setIcon(character[0]);
                    } else if (p == 1) {
                        className.setText("Gunner");
                        chara.setIcon(character[1]);
                    } else if (p == 2) {
                        className.setText("Paladin");
                        chara.setIcon(character[2]);
                    } else if (p == 3) {
                        className.setText("Swordsman");
                        chara.setIcon(character[3]);
                    } else if (p == 4) {
                        className.setText("Warlock");
                        chara.setIcon(character[4]);
                    }
                }

                @Override
                public void mouseClicked(MouseEvent arg0) {
                    if(p==1)
                    {
                        s.setAssassin(false);
                        s.setGunner(true);
                        s.setPaladin(false);
                        s.setSwordman(false);
                        s.setWarlock(false);
                    }
                    else if(p==2)
                    {
                        s.setAssassin(false);
                        s.setGunner(false);
                        s.setPaladin(true);
                        s.setSwordman(false);
                        s.setWarlock(false);
                    }
                    else if(p==3)
                    {
                        s.setAssassin(false);
                        s.setGunner(false);
                        s.setPaladin(false);
                        s.setSwordman(true);
                        s.setWarlock(false);
                    }
                    else if(p==4)
                    {
                         s.setAssassin(false);
                        s.setGunner(false);
                        s.setPaladin(false);
                        s.setSwordman(false);
                        s.setWarlock(true);
                    }
                    else if(p==0)
                    {
                        s.setAssassin(true);
                        s.setGunner(false);
                        s.setPaladin(false);
                        s.setSwordman(false);
                        s.setWarlock(false);
                    }
                    Stat.setIngame(true);
                    Stat.setHome(false);
                    Stat.setStage1(false);
                    Stat.setStage2(false);
                    Stat.setStage3(false);
                    Stat.setTambah(true);
                    Stat.setTambahplayer(true);
                    game gam = new game("",1280,720);
                    gam.start();
                    setVisible(false);
                }
            });
        }
    }
}
