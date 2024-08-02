import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;

public class Main extends JFrame implements ActionListener {

    public static File course_ = new File("Course.txt"); // file for course
    public static File student_ = new File("Student.txt"); // file for student
    public static File subject_ = new File("Subject.txt"); // file for subject
    // Files

    public static Student s;
    public static Create c;
    public static Update u;
    public static Read r;
    public static Search se;
    // JFRAMES

    public static CourseCRUD courseManager; // crud for courses
    public static SubjectCRUD subjectManager; // crud for subjects
    public static StudentCRUD studentManager; // crud for students
    // CRUD

    Color bg = new Color(255, 255, 255);
    Color fg = new Color(27, 40, 69);
    // Color

    Font bold = new Font("Helvitica", 1, 28);
    Font bsmoll = new Font("Helvitica", 1, 20);
    Font light = new Font("Helvitica", 4, 20);
    Font regular = new Font("Helvitica", 0, 22);
    // Font

    JPanel panel, p1, p2;
    JLabel title, sName, ran, ic, bc;
    JButton f1, f2, f3, f4, f5, ex;
    // Component

    public Main() {
        initComponents();
    }

    public void initComponents() {
        // Components
        panel = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        title = new JLabel();
        sName = new JLabel();
        f1 = new JButton();
        f2 = new JButton();
        f3 = new JButton();
        f4 = new JButton();
        f5 = new JButton();
        ex = new JButton();
        ran = new JLabel();
        ic = new JLabel();
        bc = new JLabel();

        setSize(600, 600);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        p1.setBackground(fg);
        p1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        sName.setText("LUMINARY HEIGHTS");
        sName.setIconTextGap(10);
        sName.setIcon(new ImageIcon("s.png"));
        sName.setForeground(bg);
        sName.setHorizontalAlignment(SwingConstants.LEFT);
        sName.setPreferredSize(new Dimension(400, 50));
        sName.setBorder(new EmptyBorder(10, 30, 10, 0));
        sName.setVerticalAlignment(SwingConstants.TOP);
        sName.setFont(bold);

        ex.setForeground(bg);
        ex.setIcon(new ImageIcon("e.png"));
        ex.setHorizontalAlignment(SwingConstants.RIGHT);
        ex.setVerticalAlignment(SwingConstants.TOP);
        ex.setPreferredSize(new Dimension(200, 50));
        ex.setBorder(new javax.swing.border.LineBorder(fg));
        ex.setContentAreaFilled(false);
        ex.setFocusPainted(false);
        // e.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ex.setFont(regular);
        ran.setPreferredSize(new Dimension(15, 50));

        title.setText("MAIN MENU");
        title.setForeground(fg);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setVerticalAlignment(SwingConstants.TOP);
        title.setPreferredSize(new Dimension(480, 80));
        title.setBorder(new EmptyBorder(15, 0, 0, 0));
        title.setFont(bold);

        ic.setIcon(new ImageIcon("big.png"));
        ic.setPreferredSize(new Dimension(480, 270));
        ic.setHorizontalAlignment(SwingConstants.CENTER);

        f1.setText("Enroll student");
        f1.setIconTextGap(30);
        f1.setIcon(new ImageIcon("add.png"));
        f1.setForeground(fg);
        f1.setHorizontalAlignment(SwingConstants.LEFT);
        f1.setVerticalAlignment(SwingConstants.TOP);
        // f1.setVerticalTextPosition(SwingConstants.BOTTOM);
        // f1.setHorizontalTextPosition(SwingConstants.CENTER);
        f1.setPreferredSize(new Dimension(240, 50));
        f1.setBorder(new javax.swing.border.LineBorder(bg));
        f1.setContentAreaFilled(false);
        f1.setFocusPainted(false);
        f1.setMargin(new java.awt.Insets(0, 15, 0, 0));
        f1.setFont(regular);

        f3.setText("Edit course");
        f3.setIconTextGap(30);
        f3.setIcon(new ImageIcon("update.png"));
        f3.setForeground(fg);
        f3.setHorizontalAlignment(SwingConstants.LEFT);
        f3.setVerticalAlignment(SwingConstants.TOP);
        // f3.setVerticalTextPosition(SwingConstants.BOTTOM);
        // f3.setHorizontalTextPosition(SwingConstants.CENTER);
        f3.setPreferredSize(new Dimension(240, 50));
        f3.setBorder(new javax.swing.border.LineBorder(bg));
        f3.setContentAreaFilled(false);
        f3.setFocusPainted(false);
        f3.setMargin(new java.awt.Insets(0, 15, 0, 0));
        f3.setFont(regular);

        f4.setText("Search student");
        f4.setIconTextGap(30);
        f4.setIcon(new ImageIcon("search.png"));
        f4.setForeground(fg);
        f4.setHorizontalAlignment(SwingConstants.LEFT);
        f4.setVerticalAlignment(SwingConstants.TOP);
        f4.setPreferredSize(new Dimension(240, 50));
        f4.setBorder(new javax.swing.border.LineBorder(bg));
        f4.setContentAreaFilled(false);
        f4.setFocusPainted(false);
        f4.setMargin(new java.awt.Insets(0, 15, 0, 0));
        f4.setFont(regular);

        f5.setText("View course");
        f5.setIconTextGap(30);
        f5.setIcon(new ImageIcon("view.png"));
        f5.setForeground(fg);
        f5.setHorizontalAlignment(SwingConstants.LEFT);
        f5.setVerticalAlignment(SwingConstants.TOP);
        f5.setPreferredSize(new Dimension(240, 50));
        f5.setBorder(new javax.swing.border.LineBorder(bg));
        f5.setContentAreaFilled(false);
        f5.setFocusPainted(false);
        f5.setMargin(new java.awt.Insets(0, 15, 0, 0));
        f5.setFont(regular);

        f1.addActionListener(this);
        f2.addActionListener(this);
        f3.addActionListener(this);
        f4.addActionListener(this);
        f5.addActionListener(this);
        ex.addActionListener(this);

        // panel design
        p1.add(sName);
        p1.add(ex);
        p1.add(ran);
        panel.add(p1);
        panel.add(ic);
        panel.add(title);
        panel.add(f1);
        panel.add(f4);
        panel.add(f3);
        panel.add(f5);

        panel.setBackground(bg);
        panel.setAutoscrolls(true);
        panel.setPreferredSize(new Dimension(600, 700));

        this.setContentPane(panel);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

    }

    public static void main(String[] args) throws FileNotFoundException {
        courseManager = new CourseCRUD(); // use to call CourseCRUD
        subjectManager = new SubjectCRUD(); // use to call SubjectCRUD
        studentManager = new StudentCRUD(); // use to call StudentCRUD
        s = new Student();
        c = new Create();
        u = new Update();
        se = new Search();
        r = new Read();
        Main home = new Main();
        home.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(f1)) {
            this.dispose();
            c.setVisible(true);
        } else if (e.getSource().equals(f3)) {
            this.dispose();
            u.setVisible(true);
        } else if (e.getSource().equals(f4)) {
            this.dispose();
            se.setVisible(true);
        } else if (e.getSource().equals(f5)) {
            this.dispose();
            r.setVisible(true);
        } else if (e.getSource().equals(ex)) {
            this.dispose();
            System.exit(0);
        }
    }

}