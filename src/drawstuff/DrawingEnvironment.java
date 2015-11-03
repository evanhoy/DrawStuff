/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author evanhoy
 */
class DrawingEnvironment extends Environment {

    Image logo;

    public DrawingEnvironment() {
        logo = ResourceTools.loadImageFromResource("drawstuff/Apple_Logo_Blue_Transparent.png");
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        graphics.setFont(new Font("Calibri", Font.BOLD, 55));
        graphics.drawString("As good as Microsoft.", 230, 350);
        if (logo != null) {
            graphics.drawImage(logo, 385, 90, 140, 160, this);

            graphics.setColor(new Color(250, 200, 10, 50));
            graphics.fillOval(169, 342, 150, 150);
            graphics.setColor(new Color(250, 200, 10, 50));
            graphics.fillOval(446, 243, 150, 150);
            graphics.setColor(new Color(250, 200, 10, 50));
            graphics.fillOval(-20, 234, 150, 150);
            graphics.setColor(new Color(250, 200, 10, 50));
            graphics.fillOval(358, 450, 150, 150);
            graphics.setColor(new Color(250, 200, 10, 50));
            graphics.fillOval(79, 48, 150, 150);
            graphics.setColor(new Color(250, 200, 10, 50));
            graphics.fillOval(300, 100, 150, 150);
            graphics.setColor(new Color(250, 200, 10, 50));
            graphics.fillOval(700, 130, 150, 150);
            graphics.setColor(new Color(250, 200, 10, 50));
            graphics.fillOval(507, 020, 150, 150);
            graphics.setColor(new Color(250, 200, 10, 50));
            graphics.fillOval(610, 360, 150, 150);
            graphics.setColor(new Color(250, 200, 10, 50));
            graphics.fillOval(780, 450, 150, 150);
        }
    }

}
