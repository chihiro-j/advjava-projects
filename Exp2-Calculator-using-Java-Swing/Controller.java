import java.awt.event.*;

public class CalculatorController implements ActionListener {
    CalculatorView view;
    CalculatorModel model;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;

        view.btnAdd.addActionListener(this);
        view.btnSub.addActionListener(this);
        view.btnMul.addActionListener(this);
        view.btnDiv.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(view.txtNum1.getText());
        double num2 = Double.parseDouble(view.txtNum2.getText());
        double result = 0;

        if(e.getSource() == view.btnAdd) result = model.add(num1, num2);
        else if(e.getSource() == view.btnSub) result = model.subtract(num1, num2);
        else if(e.getSource() == view.btnMul) result = model.multiply(num1, num2);
        else if(e.getSource() == view.btnDiv) result = model.divide(num1, num2);

        view.txtResult.setText(String.valueOf(result));
    }
}
