﻿package com.classbook.chapter.wechat.wechatform;

import javax.swing.*;

/**
 * @program: classprogram
 * @Description:
 * @author: JT
 * @date: 2019/11/11 5:36 下午
 */
public class WeChatForm extends JFrame {
    private JPanel panelMain;

    public WeChatForm(){
        setTitle("WeChat Form");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelMain = new JPanel();
        panelMain.setLayout(null);

    }

    /**
    * @Description:设置主界面可见
    * @Param: [visible]
    * @return: void
    * @Author: JT
    * @Date: 2019/11/13 1:52 下午
    */
    public void setFrameWeChatVisible(Boolean visible){
        setVisible(visible);
    }
}
