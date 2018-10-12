package dom;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import javax.swing.tree.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.w3c.dom.CharacterData;

/**
 * This program displays an XML document as a tree.
 * @version 1.12 2012-06-03
 * @author Cay Horstmann
 */
public class TreeViewer
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {
               DOMTreeFrame frame = (DOMTreeFrame) new DOMTreeFrame();
               frame.setTitle("TreeViewer");
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
            }
         });
   }
}