import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.io.FileNotFoundException;
import javax.swing.*;
// import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class V3 extends JFrame implements ActionListener {
    JPanel panel, p1, p2;
    String[] column = { "Student ID", "Course Name", "Students Enrolled" };
    TableModel tableModel = new DefaultTableModel(column, 1);
    JTable table;
    JScrollPane sc;
    JLabel sName, label, ran;
    JButton button, ex, updateButton, testbutton;

    public V3() {
        initComponents();
    }

    public void initComponents() {
        label = new JLabel();
        p1 = new JPanel();
        sName = new JLabel();
        panel = new JPanel();
        ran = new JLabel();
        p2 = new JPanel();
        ex = new JButton();
        button = new JButton();
        updateButton = new JButton("Update Button");
        testbutton = new JButton();

        Color bg = new Color(255, 255, 255);
        Color fg = new Color(27, 40, 69);
        // Border bb = BorderFactory.createLineBorder(fg);
        // Color

        Font bold = new Font("Helvitica", 1, 28);
        // Font bsmoll = new Font("Helvitica", 1, 20);
        // Font light = new Font("Helvitica", 4, 20);
        Font rr = new Font("Helvitica", 0, 14);
        Font regular = new Font("Helvitica", 0, 22);
        // Font

        setSize(600, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setLocationRelativeTo(null);

        p2.setBackground(fg);
        p2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

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

        // label
        label.setText("Student Course");
        label.setForeground(fg);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.TOP);
        label.setPreferredSize(new Dimension(480, 50));
        label.setBorder(new EmptyBorder(0, 0, 0, 0));
        label.setFont(regular);

        // button
        button.setForeground(fg);
        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.setPreferredSize(new Dimension(440, 50));
        button.setBorder(new javax.swing.border.LineBorder(bg));
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setMargin(new java.awt.Insets(0, 15, 0, 0));
        button.setFont(regular);
        button.setIcon(new ImageIcon("m.png"));

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

        // update button
        updateButton.setForeground(fg);
        updateButton.setVerticalAlignment(SwingConstants.BOTTOM);
        updateButton.setPreferredSize(new Dimension(480, 50));
        updateButton.setBorder(new javax.swing.border.LineBorder(bg));
        updateButton.setContentAreaFilled(false);
        updateButton.setFocusPainted(false);
        updateButton.setMargin(new java.awt.Insets(0, 15, 0, 0));
        updateButton.setFont(regular);
        updateButton.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            int courseNameColumn = 1;

            if (selectedRow != -1) {
                String newCourseName = JOptionPane.showInputDialog("Enter a new course");

                tableModel.setValueAt(newCourseName, selectedRow, courseNameColumn);
                // tableModel.fireTableDataChanged();
            } else {
                JOptionPane.showMessageDialog(panel, "Please select a row to edit");
            }

        });

        table = new JTable(tableModel);
        table.setDefaultEditor(Object.class, null);
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setFont(rr);
        table.getTableHeader().setForeground(fg);
        table.setFont(rr);
        table.setBackground(bg);
        table.setForeground(fg);
        table.setRowHeight(40);
        table.getColumnModel().getColumn(0).setPreferredWidth(5);

        // to scroll
        sc = new JScrollPane(table);

        // panel
        JPanel tablePanel = new JPanel();
        tablePanel.setBounds(90, 30, 300, 45);
        tablePanel.setLayout(new BorderLayout());
        tablePanel.add(sc, BorderLayout.CENTER);

        button.addActionListener(this);
        ex.addActionListener(this);

        p2.add(sName);
        p2.add(ex);
        p2.add(ran);
        panel.add(p2);
        panel.add(button);
        panel.add(testbutton);
        panel.add(label);
        panel.add(tablePanel);

        panel.setBackground(bg);
        panel.setAutoscrolls(true);
        panel.setPreferredSize(new Dimension(600, 700));

        this.setContentPane(panel);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        ViewCourseList();

    }

    public void ViewCourseList() {
        CourseCRUD courseManager = new CourseCRUD();
        StudentCRUD studentManager = new StudentCRUD();
        List<Course> course_List = courseManager.getAllCourse();
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);

        if (course_List.size() > 0) {
            String[] smple = new String[3];
            for (Course course : course_List) {
                int qty = getQty(studentManager, course.getCId());
                smple[0] = course.getCId() + "";
                smple[1] = course.getCourse();
                smple[2] = Integer.toString(qty);
                // tableModel.addRow(new Object[]{course.getCId(),course.getCourse(),qty});
                tableModel.addRow(smple);
            }
            table.setModel(tableModel);
            tableModel.fireTableDataChanged();
        }

    }

    public static int getQty(StudentCRUD studentManager, int CId) {
        List<Student> student_List = studentManager.getAllStudents();
        int qty = 0;
        for (Student student : student_List) {
            if (student.getCId() == CId) {
                qty++;
            }
        }
        return qty;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(button)) {
            this.dispose();
            Main home = new Main();
            home.setVisible(true);
        }
        if (e.getSource().equals(testbutton)) {
            // DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
            // tableModel.setRowCount(0);
            CourseCRUD courseManager = new CourseCRUD();
            StudentCRUD studentManager = new StudentCRUD();
            List<Course> course_List = courseManager.getAllCourse();
            DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
            tableModel.setRowCount(0);

            if (course_List.size() > 0) {
                String[] smple = new String[3];
                for (Course course : course_List) {
                    int qty = getQty(studentManager, course.getCId());
                    smple[0] = course.getCId() + "";
                    smple[1] = course.getCourse();
                    smple[2] = Integer.toString(qty);

                    tableModel.addRow(smple);
                }
                table.setModel(tableModel);
                tableModel.fireTableDataChanged();
            }
        }
        if (e.getSource().equals(ex)) {
            this.dispose();
            System.exit(0);
        }
    }
}