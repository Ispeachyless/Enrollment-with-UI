import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Create extends JFrame implements ActionListener {
    JPanel panel, p2;
    JLabel s0, s1, s2, s3, s4, s5, s6, s7, ran, mm, nn; // studentId, name, course, subjectId, subject, unit
    JTextField i1, i2, i3, i4, i5; // name, courseId, sId, subject, unit
    JButton b1, b2, b3, b4, ex, testbutton; // viewCourse, addSubject, enrollStudent, returnMenu

    public Create() throws FileNotFoundException {
        initComponents();
    }

    public void initComponents() throws FileNotFoundException {
        // Components
        panel = new JPanel();
        s0 = new JLabel();
        s1 = new JLabel();
        p2 = new JPanel();
        s2 = new JLabel();
        s3 = new JLabel();
        s4 = new JLabel();
        s5 = new JLabel();
        s6 = new JLabel();
        s7 = new JLabel();
        ran = new JLabel();
        mm = new JLabel();
        nn = new JLabel();
        i1 = new JTextField();
        i2 = new JTextField();
        i3 = new JTextField();
        i4 = new JTextField();
        i5 = new JTextField();
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        ex = new JButton();
        testbutton = new JButton();

        Color bg = new Color(255, 255, 255);
        Color fg = new Color(27, 40, 69);
        Border bb = BorderFactory.createLineBorder(fg);
        // Color

        Font bold = new Font("Helvitica", 1, 28);
        // Font bsmoll = new Font("Helvitica", 1, 20);
        // Font light = new Font("Helvitica", 4, 20);
        Font regular = new Font("Helvitica", 0, 22);
        // Font

        setSize(600, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setLocationRelativeTo(null);

        p2.setBackground(fg);
        p2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        s1.setText("LUMINARY HEIGHTS");
        s1.setIconTextGap(10);
        s1.setIcon(new ImageIcon("s.png"));
        s1.setForeground(bg);
        s1.setHorizontalAlignment(SwingConstants.LEFT);
        s1.setPreferredSize(new Dimension(400, 50));
        s1.setBorder(new EmptyBorder(10, 30, 10, 0));
        s1.setVerticalAlignment(SwingConstants.TOP);
        s1.setFont(bold);

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

        mm.setText("Student Enrollment");
        mm.setForeground(fg);
        mm.setHorizontalAlignment(SwingConstants.CENTER);
        mm.setVerticalAlignment(SwingConstants.TOP);
        mm.setPreferredSize(new Dimension(480, 50));
        mm.setBorder(new EmptyBorder(0, 0, 0, 0));
        mm.setFont(regular);

        int stId1 = 1000; // default ID
        Scanner scan = new Scanner(new FileReader(Main.student_));
        while (scan.hasNextLine()) {
            scan.nextLine();
            stId1++;
        }
        stId1 = stId1 + 1;
        s0.setText("" + stId1);
        s2.setText("Student ID: " + stId1);
        s2.setForeground(fg);
        s2.setHorizontalAlignment(SwingConstants.LEFT);
        s2.setVerticalAlignment(SwingConstants.TOP);
        s2.setPreferredSize(new Dimension(480, 40));
        s2.setBorder(new EmptyBorder(0, 0, 0, 0));
        s2.setFont(regular);
        scan.close();

        s3.setText("Name: ");
        s3.setForeground(fg);
        s3.setPreferredSize(new Dimension(240, 50));
        s3.setHorizontalAlignment(SwingConstants.LEFT);
        s3.setBorder(new EmptyBorder(0, 0, 0, 0));
        s3.setFont(regular);

        i1.setForeground(fg);
        i1.setPreferredSize(new Dimension(240, 30));
        i1.setBorder(bb);
        i1.setBackground(bg);
        i1.setHorizontalAlignment(SwingConstants.LEFT);
        i1.setFont(regular);

        s4.setText("Course ID: ");
        s4.setForeground(fg);
        s4.setPreferredSize(new Dimension(240, 50));
        s4.setHorizontalAlignment(SwingConstants.LEFT);
        s4.setBorder(new EmptyBorder(0, 0, 0, 0));
        s4.setFont(regular);

        i2.setForeground(fg);
        i2.setPreferredSize(new Dimension(240, 30));
        i2.setBorder(bb);
        i2.setBackground(bg);
        i2.setHorizontalAlignment(SwingConstants.LEFT);
        i2.setFont(regular);

        nn.setText("Add Subject");
        nn.setForeground(fg);
        nn.setHorizontalAlignment(SwingConstants.CENTER);
        nn.setVerticalAlignment(SwingConstants.TOP);
        nn.setPreferredSize(new Dimension(480, 50));
        nn.setBorder(new EmptyBorder(15, 0, 0, 0));
        nn.setFont(regular);

        s5.setText("Subject ID: ");
        s5.setForeground(fg);
        s5.setPreferredSize(new Dimension(240, 50));
        s5.setHorizontalAlignment(SwingConstants.LEFT);
        s5.setBorder(new EmptyBorder(0, 0, 0, 0));
        s5.setFont(regular);

        i3.setForeground(fg);
        i3.setPreferredSize(new Dimension(240, 30));
        i3.setBorder(bb);
        i3.setBackground(bg);
        i3.setHorizontalAlignment(SwingConstants.LEFT);
        i3.setFont(regular);

        s6.setText("Subject: ");
        s6.setForeground(fg);
        s6.setPreferredSize(new Dimension(240, 50));
        s6.setHorizontalAlignment(SwingConstants.LEFT);
        s6.setBorder(new EmptyBorder(0, 0, 0, 0));
        s6.setFont(regular);

        i4.setForeground(fg);
        i4.setPreferredSize(new Dimension(240, 30));
        i4.setBorder(bb);
        i4.setBackground(bg);
        i4.setHorizontalAlignment(SwingConstants.LEFT);
        i4.setFont(regular);

        s7.setText("Unit: ");
        s7.setForeground(fg);
        s7.setPreferredSize(new Dimension(240, 50));
        s7.setHorizontalAlignment(SwingConstants.LEFT);
        s7.setBorder(new EmptyBorder(0, 0, 0, 0));
        s7.setFont(regular);

        i5.setForeground(fg);
        i5.setPreferredSize(new Dimension(240, 30));
        i5.setBorder(bb);
        i5.setBackground(bg);
        i5.setHorizontalAlignment(SwingConstants.LEFT);
        i5.setFont(regular);

        b1.setText("View Available Courses");
        b1.setForeground(fg);
        b1.setHorizontalAlignment(SwingConstants.LEFT);
        // b1.setVerticalAlignment(SwingConstants.TOP);
        b1.setPreferredSize(new Dimension(480, 50));
        b1.setBorder(new javax.swing.border.LineBorder(bg));
        b1.setContentAreaFilled(false);
        b1.setFocusPainted(false);
        b1.setMargin(new java.awt.Insets(0, 15, 0, 0));
        b1.setFont(regular);

        b2.setText("Add Subject");
        b2.setForeground(fg);
        b2.setHorizontalAlignment(SwingConstants.RIGHT);
        b2.setPreferredSize(new Dimension(480, 50));
        b2.setBorder(new javax.swing.border.LineBorder(bg));
        b2.setContentAreaFilled(false);
        b2.setFocusPainted(false);
        b2.setMargin(new java.awt.Insets(0, 15, 0, 0));
        b2.setFont(regular);

        b3.setText("Enroll Student");
        b3.setForeground(fg);
        b3.setHorizontalAlignment(SwingConstants.CENTER);
        b3.setPreferredSize(new Dimension(480, 50));
        b3.setBorder(new javax.swing.border.LineBorder(bg));
        b3.setContentAreaFilled(false);
        b3.setFocusPainted(false);
        b3.setMargin(new java.awt.Insets(0, 15, 0, 0));
        b3.setFont(regular);

        b4.setForeground(fg);
        b4.setHorizontalAlignment(SwingConstants.LEFT);
        b4.setPreferredSize(new Dimension(440, 50));
        b4.setBorder(new javax.swing.border.LineBorder(bg));
        b4.setContentAreaFilled(false);
        b4.setFocusPainted(false);
        b4.setMargin(new java.awt.Insets(0, 15, 0, 0));
        b4.setFont(regular);
        b4.setIcon(new ImageIcon("m.png"));

        // testbutton
        testbutton.setIconTextGap(10);
        testbutton.setIcon(new ImageIcon("refresh.png"));
        testbutton.setForeground(fg);
        testbutton.setHorizontalAlignment(SwingConstants.RIGHT);
        testbutton.setPreferredSize(new Dimension(40, 50));
        testbutton.setBorder(new javax.swing.border.LineBorder(bg));
        testbutton.setContentAreaFilled(false);
        testbutton.setFocusPainted(false);
        testbutton.setMargin(new java.awt.Insets(0, 15, 0, 0));
        testbutton.setFont(regular);
        testbutton.addActionListener(this);

        p2.add(s1);
        p2.add(ex);
        p2.add(ran);
        panel.add(p2);
        panel.add(b4);
        panel.add(testbutton);
        panel.add(mm);
        panel.add(s2);
        panel.add(s3);
        panel.add(i1);
        panel.add(s4);
        panel.add(i2);
        panel.add(b1);
        panel.add(nn);
        panel.add(s5);
        panel.add(i3);
        panel.add(s6);
        panel.add(i4);
        panel.add(s7);
        panel.add(i5);
        panel.add(b2);
        panel.add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        ex.addActionListener(this);

        panel.setBackground(bg);
        panel.setAutoscrolls(true);
        panel.setPreferredSize(new Dimension(600, 700));

        this.setContentPane(panel);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
    }

    public void actionPerformed(ActionEvent e) {
        Student student = new Student();
        Main home = new Main();
        SubjectCRUD subjectManager = new SubjectCRUD();
        StudentCRUD studentManager = new StudentCRUD();
        CourseCRUD courseManager = new CourseCRUD();

        if (e.getSource().equals(b1)) {
            this.dispose();
            V3 view3 = new V3();
            view3.setVisible(true);
        }
        if (e.getSource().equals(ex)) {
            this.dispose();
            System.exit(0);
        }
        if (e.getSource().equals(b4)) {
            this.dispose();
            home.setVisible(true);
        }
        if (e.getSource().equals(b2)) {
            if (i3.getText().equals("") && i4.getText().equals("") && i5.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "No input found");
            } else if (i4.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Insufficient Information");
            } else if (i5.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Insufficient Information");
            } else if (i3.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Insufficient Information");
            } else {
                List<Student> subject_list = subjectManager.getAllSubjects();

                for (Student record : subject_list) {
                    try {
                        if (record.getSId() == (Integer.parseInt(i3.getText()))) {
                            throw new ErrorHandler("Duplicate ID Error");
                        }
                    } catch (ErrorHandler error) {
                        JOptionPane.showMessageDialog(this, "Error: " + error.getMessage());
                    }
                }

                student.setStId(Integer.parseInt(s0.getText()));
                student.setSId(Integer.parseInt(i3.getText()));
                student.setSubject(i4.getText());
                student.setUnit(Integer.parseInt(i5.getText()));

                subjectManager.createSubject(student);

                i3.setText("");
                i4.setText("");
                i5.setText("");

            }
        }
        List<Course> courses = courseManager.getAllCourse();
        String cs = "";
        for (Course course : courses) {
            if (Integer.parseInt(i2.getText()) == course.getCId()) {
                cs = course.getCourse();
            }
        }

        if (e.getSource().equals(b3)) {
            if (i1.getText().equals("") && i2.getText().equals("") && i3.getText().equals("") && i4.getText().equals("")
                    && i5.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "No input found");
            } else if (i2.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Insufficient Information");
            } else if (i1.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Insufficient Information");
            } else {
                student.setStId(Integer.parseInt(s0.getText()));
                student.setName(i1.getText());
                student.setCId(Integer.parseInt(i2.getText()));

                studentManager.createStudent(student);

                JOptionPane.showMessageDialog(this,
                        "Student ID: " + student.getStId() + "\nName: " + student.getName()
                                + "\nCourse ID: "
                                + student.getCId() + "\nCourse: " + cs + "\nStudent is now enrolled");

                s0.setText("" + (student.getStId() + 1));
                s2.setText("Student ID: " + (student.getStId() + 1));
                i1.setText("");
                i2.setText("");
                i3.setText("");
                i4.setText("");
                i5.setText("");

                // this.dispose();
                // home.setVisible(true);
            }

        }
        if (e.getSource().equals(testbutton)) {
            i1.setText("");
            i2.setText("");
            i3.setText("");
            i4.setText("");
            i5.setText("");
        }
    }
}