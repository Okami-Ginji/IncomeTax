/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Library;
import repository.TaxCSVRepository;
import view.Menu;

/**
 *
 * @author Administrator
 */
public class TaxProgram extends Menu<String>{
    
    static String[] mc = {"Income Tax Calculator", "Exit"};
    TaxCSVRepository program;
    
    public TaxProgram() {
        super("\tINCOME TAX", mc);
        program = new TaxCSVRepository();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1:
                program.addFamily();
                break;
            case 2:
                System.exit(0);
        }
    }

}
