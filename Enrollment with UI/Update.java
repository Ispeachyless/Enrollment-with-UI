// convert updateData from Menu.java

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

public class Update extends JFrame implements ActionListener {
    JPanel panel, p1;
    JLabel s1, s2, s3, s4, s5, title, courseIdLabel, newCourseNameLabel, ran;
    JTextField i1, i2, i3, courseIdField, newCourseNameField;
    JButton b1, b2, b3, updateButton, backButton, ex, testbutton;

    public Update() {
        initComponents();
    }

    // Initialize Components neh Tanan in a class
    private void initComponents() {
        // Components
        panel = new JPanel();
        s1 = new JLabel();
        p1 = new JPanel();
        s2 = new JLabel();
        s3 = new JLabel();
        s4 = new JLabel();
        s5 = new JLabel();
        i1 = new JTextField();
        i2 = new JTextField();
        i3 = new JTextField();
        ran = new JLabel();
        title = new JLabel();
        courseIdLabel = new JLabel();
        newCourseNameLabel = new JLabel();
        courseIdField = new JTextField();
        newCourseNameField = new JTextField();
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        updateButton = new JButton();
        backButton = new JButton();
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

        p1.setBackground(fg);
        p1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

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

        title.setText("Insert new course");
        title.setForeground(fg);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setVerticalAlignment(SwingConstants.TOP);
        title.setPreferredSize(new Dimension(480, 50));
        title.setBorder(new EmptyBorder(15, 0, 0, 0));
        title.setFont(regular);

        s3.setText("Course ID: ");
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

        s4.setText("Course name: ");
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

        s5.setText("Rate per unit: ");
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

        b3.setText("Insert Course");
        b3.setForeground(fg);
        b3.setHorizontalAlignment(SwingConstants.RIGHT);
        b3.setPreferredSize(new Dimension(480, 50));
        b3.setBorder(new javax.swing.border.LineBorder(bg));
        b3.setContentAreaFilled(false);
        b3.setFocusPainted(false);
        b3.setMargin(new java.awt.Insets(0, 15, 0, 0));
        b3.setFont(regular);

        s2.setText("Update Course Name");
        s2.setForeground(fg);
        s2.setHorizontalAlignment(SwingConstants.CENTER);
        s2.setVerticalAlignment(SwingConstants.TOP);
        s2.setPreferredSize(new Dimension(480, 50));
        s2.setBorder(new EmptyBorder(15, 0, 0, 0));
        s2.setFont(regular);

        courseIdLabel.setText("Course ID:");
        courseIdLabel.setForeground(fg);
        courseIdLabel.setPreferredSize(new Dimension(240, 50));
        courseIdLabel.setHorizontalAlignment(SwingConstants.LEFT);
        courseIdLabel.setBorder(new EmptyBorder(0, 0, 0, 0));
        courseIdLabel.setFont(regular);

        courseIdField.setForeground(fg);
        courseIdField.setPreferredSize(new Dimension(240, 30));
        courseIdField.setBorder(bb);
        courseIdField.setBackground(bg);
        courseIdField.setHorizontalAlignment(SwingConstants.LEFT);
        courseIdField.setFont(regular);

        newCourseNameLabel.setText("New Course Name:");
        newCourseNameLabel.setForeground(fg);
        newCourseNameLabel.setPreferredSize(new Dimension(240, 50));
        newCourseNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
        newCourseNameLabel.setBorder(new EmptyBorder(0, 0, 0, 10));
        newCourseNameLabel.setFont(regular);

        newCourseNameField.setForeground(bg);
        newCourseNameField.setPreferredSize(new Dimension(240, 30));
        newCourseNameField.setBorder(new javax.swing.border.LineBorder(bg));
        newCourseNameField.setFont(regular);

        newCourseNameField.setForeground(fg);
        newCourseNameField.setPreferredSize(new Dimension(240, 30));
        newCourseNameField.setBorder(bb);
        newCourseNameField.setBackground(bg);
        newCourseNameField.setHorizontalAlignment(SwingConstants.LEFT);
        newCourseNameField.setFont(regular);

        b2.setText("View Available Courses");
        b2.setForeground(fg);
        b2.setHorizontalAlignment(SwingConstants.LEFT);
        // b1.setVerticalAlignment(SwingConstants.TOP);
        b2.setPreferredSize(new Dimension(480, 50));
        b2.setBorder(new javax.swing.border.LineBorder(bg));
        b2.setContentAreaFilled(false);
        b2.setFocusPainted(false);
        b2.setMargin(new java.awt.Insets(0, 15, 0, 0));
        b2.setFont(regular);

        updateButton.setText("Update Course");
        updateButton.setForeground(fg);
        updateButton.setHorizontalAlignment(SwingConstants.RIGHT);
        updateButton.setVerticalAlignment(SwingConstants.TOP);
        updateButton.setPreferredSize(new Dimension(480, 50));
        updateButton.setBorder(new javax.swing.border.LineBorder(bg));
        updateButton.setContentAreaFilled(false);
        updateButton.setFocusPainted(false);
        updateButton.setBorder(new EmptyBorder(15, 0, 0, 0));
        updateButton.setMargin(new java.awt.Insets(0, 15, 0, 0));
        updateButton.setFont(regular);

        backButton.setForeground(fg);
        backButton.setHorizontalAlignment(SwingConstants.LEFT);
        backButton.setPreferredSize(new Dimension(440, 50));
        backButton.setBorder(new javax.swing.border.LineBorder(bg));
        backButton.setContentAreaFilled(false);
        backButton.setFocusPainted(false);
        backButton.setMargin(new java.awt.Insets(0, 15, 0, 0));
        backButton.setFont(regular);
        backButton.setIcon(new ImageIcon("m.png"));

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

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        updateButton.addActionListener(this);
        backButton.addActionListener(this);
        ex.addActionListener(this);

        p1.add(s1);
        p1.add(ex);
        p1.add(ran);
        panel.add(p1);
        panel.add(backButton);
        panel.add(testbutton);
        panel.add(title);
        panel.add(s3);
        panel.add(i1);
        panel.add(s4);
        panel.add(i2);
        panel.add(b1);
        panel.add(s5);
        panel.add(i3);
        panel.add(b3);
        panel.add(s2);
        panel.add(courseIdLabel);
        panel.add(courseIdField);
        panel.add(newCourseNameLabel);
        panel.add(newCourseNameField);
        panel.add(b2);
        panel.add(updateButton);

        panel.setBackground(bg);
        panel.setAutoscrolls(true);
        panel.setPreferredSize(new Dimension(600, 450));

        this.setContentPane(panel);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
    }

    public void actionPerformed(ActionEvent e) {
        CourseCRUD courseManager = new CourseCRUD();

        if (e.getSource().equals(updateButton)) {
            if (newCourseNameField.getText().equals("") && courseIdField.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "No input found");
            } else if (courseIdField.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Insufficient Information");
            } else if (newCourseNameField.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Insufficient Information");
            } else {
                int courseIdToUpdate = Integer.parseInt(courseIdField.getText());
                String newCourseName = newCourseNameField.getText();
                updateCourseName(courseIdToUpdate, newCourseName);

                courseIdField.setText("");
                newCourseNameField.setText("");
            }

        } else if (e.getSource().equals(backButton)) {
            this.dispose();
            Main home = new Main();
            home.setVisible(true);
        } else if (e.getSource().equals(b1)) {
            this.dispose();
            V1 view1 = new V1();
            view1.setVisible(true);
        } else if (e.getSource().equals(ex)) {
            this.dispose();
            System.exit(0);
        } else if (e.getSource().equals(b2)) {
            this.dispose();
            V2 view2 = new V2();
            view2.setVisible(true);
        } else if (e.getSource().equals(b3)) {
            if (i1.getText().equals("") && i2.getText().equals("") && i3.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "No input found");
            } else if (i2.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Insufficient Information");
            } else if (i3.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Insufficient Information");
            } else if (i1.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Insufficient Information");
            } else {
                List<Course> course_list = courseManager.getAllCourse();

                for (Course record : course_list) {
                    try {
                        if (record.getCId() == (Integer.parseInt(i1.getText()))) {
                            throw new ErrorHandler("Duplicate ID Error");
                        }
                    } catch (ErrorHandler error) {
                        JOptionPane.showMessageDialog(this, "Error: " + error.getMessage());
                    }
                }
                Course courses = new Course();
                courses.setCId(Integer.parseInt(i1.getText()));
                courses.setCourse(i2.getText());
                courses.setPerUnit(Double.parseDouble(i3.getText()));
                // setters for course

                courseManager.createCourse(courses);
                // pass contents of courses to CRUD
            }

            i1.setText("");
            i2.setText("");
            i3.setText("");
        } else if (e.getSource().equals(testbutton)) {
            i1.setText("");
            i2.setText("");
            i3.setText("");
            courseIdField.setText("");
            newCourseNameField.setText("");
        }
    }

    // Function sya to update the course name
    private void updateCourseName(int courseId, String newCourseName) {
        try {
            CourseCRUD courseCRUD = new CourseCRUD();
            courseCRUD.updateCourse(courseId, newCourseName);
            JOptionPane.showMessageDialog(this, "Course name updated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating course name!");
        }
    }
}
