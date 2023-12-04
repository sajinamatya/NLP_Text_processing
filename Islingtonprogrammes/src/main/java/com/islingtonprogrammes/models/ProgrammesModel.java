/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.islingtonprogrammes.models;

/**
 *
 * @author LENOVO
 */
public class ProgrammesModel {

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getProgrammes() {
        return programmes;
    }

    public void setProgrammes(String programmes) {
        this.programmes = programmes;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename;
    }
    private int sno;
    private String programmes;
    private String modulename;

    public ProgrammesModel(int sNo, String programmes, String moduleName) {
        this.sno = sNo;
        this.programmes = programmes;
        this.modulename = moduleName;
    }

    
}
