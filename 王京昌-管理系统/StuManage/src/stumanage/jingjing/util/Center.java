/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stumanage.jingjing.util;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Center {
     public static void setCenter(JFrame jf) {
        /*
         思路：
         A:获取屏幕的宽和高
         B:获取窗体的宽和高
         C:(用屏幕的宽-窗体的宽)/2，(用屏幕的高-窗体的高)/2作为窗体的新坐标。
         */
        //获取工具对象
        Toolkit tk = Toolkit.getDefaultToolkit();

        //获取屏幕的宽和高
        Dimension d = tk.getScreenSize();
        double srceenWidth = d.getWidth();
        double srceenHeigth = d.getHeight();

        //获取窗体的宽和高
        int frameWidth = jf.getWidth();
        int frameHeight = jf.getHeight();

        //获取新的宽和高
        int width = (int) (srceenWidth - frameWidth) / 2;
        int height = (int) (srceenHeigth - frameHeight) / 2;

        //设置窗体坐标
        jf.setLocation(width, height);
    }

}
