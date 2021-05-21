import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {

    // Объявление всех компонентов калькулятора
    JPanel windowContent;
    JFormattedTextField displayField;
    JButton[] numButtons = new JButton[10];
    JButton buttonPoint;
    JButton buttonEqual;
    JPanel p1;
    JPanel p2;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonDivide;
    JButton buttonMultiply;

        /*
         В конструкторе создаются все компоненты и добавляются на фрейм с помощью
         комбинации Borderlayout и Gridlayout
         */
        Calculator() {

            windowContent = new JPanel();

            // Задаём схему для этой панели
            BorderLayout bl = new BorderLayout();
            windowContent.setLayout(bl);

            /*
             Создаём и отображаем поле. Добавляем его в Северную область окна
             */
            displayField = new JFormattedTextField(displayField);
            displayField.setColumns(50);
            displayField.setHorizontalAlignment(JFormattedTextField.RIGHT);
            windowContent.add("North", displayField);

            /*
            Создаём кнопки, используя конструктор класса JButton, который принимает
            текст кнопки в качестве параметра
             */
            for (int i = 0; i < 10; i++) {
                numButtons[i] = new JButton(Integer.toString(i));
            }
            buttonPoint = new JButton(".");
            buttonEqual = new JButton("=");
            buttonPlus = new JButton("+");
            buttonMinus = new JButton("-");
            buttonDivide = new JButton("/");
            buttonMultiply = new JButton("*");

            /*
            Создаём панель с GridLayout, которая содержит 12 кнопок: 10 кнопок
            с числами и кнопки с точкой и знаком равно
             */

            p1 = new JPanel();
            GridLayout g1 = new GridLayout(4,3);
            p1.setLayout(g1);

            // Добавляем кнопки на панель p1
            for (int i = 1; i < 10; i++) {
                p1.add(numButtons[i]);
            }
            p1.add(numButtons[0]);
            p1.add(buttonPoint);
            p1.add(buttonEqual);

            // Помещаем панель p1 в центральную область окна
            windowContent.add("Center", p1);

            // Создаём панель GridLayout с 6 кнопками (нам нужно 4)
            p2 = new JPanel();
            GridLayout g2 = new GridLayout(2,3);
            p2.setLayout(g2);

            // Добавляем кнопки на панель p2
            p2.add(buttonPlus);
            p2.add(buttonMinus);
            p2.add(buttonDivide);
            p2.add(buttonMultiply);

            // Помещаем панель p2 в восточную область окна
            windowContent.add("East", p2);

            // Создаём фрейм и задаём его основную панель
            JFrame frame = new JFrame("Calculator");
            frame.setContentPane(windowContent);

            // Делаем размер окна достаточным для того, чтобы вместить все компоненты
            frame.pack();

            // Наконец, отображаем окно
            frame.setVisible(true);

        }

    public static void main(String[] args) {

            Calculator calc = new Calculator();
    }

}
