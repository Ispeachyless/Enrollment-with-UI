import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.util.List;
// import java.util.Scanner;

public class Search extends JFrame implements ActionListener, MouseListener {
    JPanel panel, p2;
    JLabel s1, s2, ran, mm, totalUnitsLabel, totalBalanceLabel, em, s3, s4;
    JButton ex, sr, b4, testbutton;
    JTextField i1, i2, i3, i4, totalUnitsField, totalBalanceField;
    DefaultTableModel tableModel;
    JTable table;
    JScrollPane sc;
    JPanel tablePanel;

    public Search() throws FileNotFoundException {
        initComponents();
    }

    public void initComponents() throws FileNotFoundException {
        panel = new JPanel();
        p2 = new JPanel();
        s1 = new JLabel();
        ran = new JLabel();
        mm = new JLabel();
        ex = new JButton();
        i1 = new JTextField();
        sr = new JButton();
        b4 = new JButton();
        s2 = new JLabel();
        i2 = new JTextField();
        i3 = new JTextField();
        s3 = new JLabel();
        s4 = new JLabel();
        i4 = new JTextField();
        totalUnitsLabel = new JLabel();
        totalBalanceLabel = new JLabel();
        totalUnitsField = new JTextField();
        totalBalanceField = new JTextField();
        em = new JLabel();
        testbutton = new JButton();

        // Components
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

        mm.setText("Search Student Information");
        mm.setForeground(fg);
        mm.setHorizontalAlignment(SwingConstants.CENTER);
        mm.setVerticalAlignment(SwingConstants.TOP);
        mm.setPreferredSize(new Dimension(480, 50));
        mm.setBorder(new EmptyBorder(0, 0, 0, 0));
        mm.setFont(regular);

        i1.setForeground(Color.gray);
        i1.setText("Enter Student ID");
        i1.setPreferredSize(new Dimension(440, 30));
        i1.setBorder(bb);
        i1.setBackground(bg);
        i1.setHorizontalAlignment(SwingConstants.LEFT);
        i1.setFont(regular);
        i1.addMouseListener(this);

        sr.setForeground(bg);
        sr.setIcon(new ImageIcon("search.png"));
        sr.setHorizontalAlignment(SwingConstants.RIGHT);
        sr.setPreferredSize(new Dimension(40, 40));
        sr.setBorder(new javax.swing.border.LineBorder(bg));
        sr.setContentAreaFilled(false);
        sr.setFocusPainted(false);

        b4.setForeground(fg);
        b4.setHorizontalAlignment(SwingConstants.LEFT);
        b4.setPreferredSize(new Dimension(440, 50));
        b4.setBorder(new javax.swing.border.LineBorder(bg));
        b4.setContentAreaFilled(false);
        b4.setFocusPainted(false);
        b4.setMargin(new java.awt.Insets(0, 15, 0, 0));
        b4.setFont(regular);
        b4.setIcon(new ImageIcon("m.png"));

        s2.setText("Name: ");
        s2.setForeground(fg);
        s2.setPreferredSize(new Dimension(240, 50));
        s2.setHorizontalAlignment(SwingConstants.LEFT);
        s2.setBorder(new EmptyBorder(0, 0, 0, 0));
        s2.setFont(regular);

        i2.setForeground(fg);
        i2.setPreferredSize(new Dimension(240, 30));
        i2.setBorder(bb);
        i2.setBackground(bg);
        i2.setHorizontalAlignment(SwingConstants.LEFT);
        i2.setFont(regular);
        i2.setEditable(false);

        s4.setText("Course: ");
        s4.setForeground(fg);
        s4.setPreferredSize(new Dimension(240, 50));
        s4.setHorizontalAlignment(SwingConstants.LEFT);
        s4.setBorder(new EmptyBorder(0, 0, 0, 0));
        s4.setFont(regular);

        i4.setForeground(fg);
        i4.setPreferredSize(new Dimension(240, 30));
        i4.setBorder(bb);
        i4.setBackground(bg);
        i4.setHorizontalAlignment(SwingConstants.LEFT);
        i4.setFont(regular);
        i4.setEditable(false);

        s3.setText("Rate Per Unit: ");
        s3.setForeground(fg);
        s3.setPreferredSize(new Dimension(240, 50));
        s3.setHorizontalAlignment(SwingConstants.LEFT);
        s3.setBorder(new EmptyBorder(0, 0, 0, 0));
        s3.setFont(regular);

        i3.setForeground(fg);
        i3.setPreferredSize(new Dimension(240, 30));
        i3.setBorder(bb);
        i3.setBackground(bg);
        i3.setHorizontalAlignment(SwingConstants.LEFT);
        i3.setFont(regular);
        i3.setEditable(false);

        totalUnitsLabel.setText("Total Units:");
        totalUnitsLabel.setForeground(fg);
        totalUnitsLabel.setPreferredSize(new Dimension(240, 50));
        totalUnitsLabel.setBorder(new EmptyBorder(0, 0, 0, 0));
        totalUnitsLabel.setHorizontalAlignment(SwingConstants.LEFT);
        totalUnitsLabel.setFont(regular);

        totalUnitsField.setForeground(fg);
        totalUnitsField.setPreferredSize(new Dimension(240, 30));
        totalUnitsField.setBorder(bb);
        totalUnitsField.setBackground(bg);
        totalUnitsField.setHorizontalAlignment(SwingConstants.LEFT);
        totalUnitsField.setFont(regular);
        totalUnitsField.setEditable(false);

        totalBalanceLabel.setText("Total Balance:");
        totalBalanceLabel.setForeground(fg);
        totalBalanceLabel.setPreferredSize(new Dimension(240, 50));
        totalBalanceLabel.setBorder(new EmptyBorder(0, 0, 0, 0));
        totalBalanceLabel.setHorizontalAlignment(SwingConstants.LEFT);
        totalBalanceLabel.setFont(regular);

        totalBalanceField.setForeground(fg);
        totalBalanceField.setPreferredSize(new Dimension(240, 30));
        totalBalanceField.setBorder(bb);
        totalBalanceField.setBackground(bg);
        totalBalanceField.setHorizontalAlignment(SwingConstants.LEFT);
        totalBalanceField.setFont(regular);
        totalBalanceField.setEditable(false);

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

        em.setPreferredSize(new Dimension(480, 10));

        // table
        tableModel = new DefaultTableModel(new Object[] { "Subject ID", "Subject Name", "Per Unit" }, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table = new JTable(tableModel);
        // table.setDefaultEditor(Object.class, null);
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setFont(regular);
        table.getTableHeader().setForeground(fg);
        table.setFont(regular);
        table.setBackground(bg);
        table.setForeground(fg);
        table.setRowHeight(30);
        table.getColumnModel().getColumn(0).setPreferredWidth(3);

        // to scroll
        sc = new JScrollPane(table);

        // table panel
        // panel
        JPanel tablePanel = new JPanel();
        tablePanel.setPreferredSize(new Dimension(480, 200));
        tablePanel.setLayout(new BorderLayout());
        tablePanel.add(sc, BorderLayout.CENTER);

        p2.add(s1);
        p2.add(ex);
        p2.add(ran);
        panel.add(p2);
        panel.add(b4);
        panel.add(testbutton);
        panel.add(mm);
        // panel.add(ran2);
        panel.add(i1);
        panel.add(sr);
        panel.add(s2);
        panel.add(i2);
        panel.add(s4);
        panel.add(i4);
        panel.add(s3);
        panel.add(i3);
        panel.add(totalUnitsLabel);
        panel.add(totalUnitsField);
        panel.add(totalBalanceLabel);
        panel.add(totalBalanceField);
        panel.add(em);
        panel.add(tablePanel);

        ex.addActionListener(this);
        sr.addActionListener(this);
        b4.addActionListener(this);

        panel.setBackground(bg);
        panel.setAutoscrolls(true);
        panel.setPreferredSize(new Dimension(600, 700));

        this.setContentPane(panel);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
    }

    public void actionPerformed(ActionEvent e) {
        StudentCRUD studentManager = new StudentCRUD();
        SubjectCRUD subjectManager = new SubjectCRUD();
        CourseCRUD courseManager = new CourseCRUD();

        if (e.getSource().equals(ex)) {
            this.dispose();
            System.exit(0);
        } else if (e.getSource().equals(b4)) {
            this.dispose();
            Main home = new Main();
            home.setVisible(true);
        } else if (e.getSource().equals(testbutton)) {
            i1.setForeground(Color.gray);
            i1.setText("Enter Student ID");
            i1.addMouseListener(this);
            clearFields();
        } else if (e.getSource().equals(sr)) {
            if (i1.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "No input found");
            } else {
                boolean flag = false;
                int stId = Integer.parseInt(i1.getText());
                List<Student> studentList = studentManager.getAllStudents();
                List<Student> subjectList = subjectManager.getAllSubjects();
                List<Course> courseList = courseManager.getAllCourse();

                clearFields(); // Clear previous data

                for (Student student : studentList) {
                    if (student.getStId() == stId) {
                        i2.setText(student.getName());
                        flag = true;
                    }
                }

                if (flag) {
                    for (Student subject : subjectList) {
                        if (subject.getStId() == stId) {
                            tableModel
                                    .addRow(new Object[] { subject.getSId(), subject.getSubject(), subject.getUnit() });
                        }
                    }

                    int totalUnits = 0;
                    double totalBalance = 0;

                    for (Student subject : subjectList) {
                        if (subject.getStId() == stId) {
                            totalUnits += subject.getUnit();
                        }
                    }

                    for (Student student : studentList) {
                        if (student.getStId() == stId) {
                            for (Course course : courseList) {
                                if (student.getCId() == course.getCId()) {
                                    i4.setText(course.getCourse());
                                    i3.setText(String.valueOf(course.getPerUnit()));
                                    totalBalance = course.getPerUnit() * totalUnits;
                                    totalUnitsField.setText(String.valueOf(totalUnits));
                                    totalBalanceField.setText(String.valueOf(totalBalance));
                                }
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Student not found. Try again");
                }
            }
        }

    }

    private void clearFields() {
        i2.setText("");
        totalUnitsField.setText("");
        totalBalanceField.setText("");
        i4.setText("");
        i3.setText("");
        // You may want to clear the JTable as well
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        // i1.setForeground(new Color(27, 40, 69));
        // i1.setText("");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        i1.setForeground(new Color(27, 40, 69));
        i1.setText("");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }
}
