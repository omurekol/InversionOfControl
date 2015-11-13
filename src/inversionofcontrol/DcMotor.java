/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversionofcontrol;

/**
 *
 * @author omur.alcin
 */
public class DcMotor implements IGucKaynagi{

    @Override
    public void yakit() {
         System.out.println("Elektrik");
    }

    @Override
    public void enerji() {
         System.out.println("2900 kal/joule");
    }
    
}
