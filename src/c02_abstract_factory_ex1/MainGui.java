package c02_abstract_factory_ex1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGui {
    private JButton btnSearch;
    private JPanel panelMain;
    private JPanel westLabelPanel;
    private JPanel eastTextPanel;
    private JPanel southButtons;
    private JLabel vehicleLabel;
    private JLabel vehicleTypeLabel;
    private JLabel searchResultLabel;
    private JComboBox cbxVehicleCategory;
    private JComboBox cbxVehicleType;
    private JLabel txtResult;
    private JButton btnExit;

    public static final String CAR ="Car";
    public static final String SUV ="SUV";

    public MainGui() {

        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchResult = null;
                String category = (String) cbxVehicleCategory.getSelectedItem();
                String type = (String) cbxVehicleType.getSelectedItem();
                VehicleFactory vf = VehicleFactory.getVehicleFactory(category);

                if(type.equals(MainGui.CAR)){
                    Car c = vf.getCar();
                    searchResult = "Name: " + c.getCarName() + " Features: " + c.getCarFeatures();
                }else if (type.equals(MainGui.SUV)) {
                    SUV s = vf.getSUV();
                    searchResult = "Name: " + s.getSUVName() + " Features: " + s.getSUVFeatures();
                }
                txtResult.setText(searchResult);
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame  frame = new JFrame("App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new MainGui().panelMain);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
