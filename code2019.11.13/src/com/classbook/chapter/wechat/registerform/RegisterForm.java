﻿package com.classbook.chapter.wechat.registerform;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @program: classprogram
 * @Description:
 * @author: JT
 * @date: 2019/11/11 5:34 下午
 */
public class RegisterForm extends JFrame {

    private JPanel panelRegister;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton backButton;
    private JButton registerButton;

    public JButton getBackButton() {
        return backButton;
    }

    public RegisterForm(){
        setTitle("Register Form");
        setSize(280, 160);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelRegister = new JPanel();
        panelRegister.setLayout(null);

        userLabel = new JLabel("User:");
        userLabel.setBounds(10,20,80,25);
        panelRegister.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panelRegister.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panelRegister.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panelRegister.add(passwordText);

        backButton = new JButton("back");
        backButton.setBounds(100, 100, 80, 25);
        panelRegister.add(backButton);

        registerButton = new JButton("register");
        registerButton.setBounds(10, 100, 80, 25);
        panelRegister.add(registerButton);

        add(panelRegister);

    }

    /**
    * @Description: 设置界面可见
    * @Param: [visible]
    * @return: void
    * @Author: JT
    * @Date: 2019/11/13 1:50 下午
    */
    public void setFrameRegisterVisible(Boolean visible){
        setVisible(visible);
    }
}
