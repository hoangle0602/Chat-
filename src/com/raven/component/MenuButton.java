
package com.raven.component;

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JButton;


public class MenuButton extends JButton{

    /**
     * @return the iconSimple
     */
    public Icon getIconSimple() {
        return iconSimple;
    }

    /**
     * @param iconSimple the iconSimple to set
     */
    public void setIconSimple(Icon iconSimple) {
        this.iconSimple = iconSimple;
    }

    /**
     * @return the iconSelected
     */
    public Icon getIconSelected() {
        return iconSelected;
    }

    /**
     * @param iconSelected the iconSelected to set
     */
    public void setIconSelected(Icon iconSelected) {
        this.iconSelected = iconSelected;
    }
     private Icon iconSimple;
     private Icon iconSelected;
     
    public MenuButton() {
        setContentAreaFilled(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    @Override
    public void setSelected(boolean bln) {
        super.setSelected(bln); 
        if(bln) {
            setIcon(iconSelected);
            
        } else {
            setIcon(iconSimple);
        }
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs); 
        if (isSelected()) {
            grphcs.setColor(new Color(110,213,255));
            grphcs.fillRect(0, getHeight() - 3, getWidth(), getHeight());
        }
    }
    
    
}
