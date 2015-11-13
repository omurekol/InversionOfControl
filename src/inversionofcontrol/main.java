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
public class main {
    public static void main(String[] args) {
            Arac arac = new Arac();
            IctenYanmaliMotor ictenYanmaliMotor = new IctenYanmaliMotor();
            DcMotor dcMotor = new DcMotor();
//            Dependency Inversion ile sadece bu kısmı değiştiriyoruz.          
//            bu işlemi Tool ile otomatik yapınca IOC oluyor
            arac.setGuckaynagi(dcMotor);
           // arac.setGuckaynagi(ictenYanmaliMotor);
            arac.getGuckaynagi().enerji();
            arac.getGuckaynagi().yakit();
    }
}
