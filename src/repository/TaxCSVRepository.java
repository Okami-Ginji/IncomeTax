/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;
import dataacess.IncomeTaxDAO;

/**
 *
 * @author Administrator
 */
public class TaxCSVRepository implements ITaxCSVRepository{

    @Override
    public void addFamily() {
        IncomeTaxDAO.Instance().addFamily();
    }
    
}
