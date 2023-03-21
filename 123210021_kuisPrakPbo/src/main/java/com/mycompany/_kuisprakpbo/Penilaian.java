/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._kuisprakpbo;

/**
 *
 * @author Lab Informatika
 */
public class Penilaian implements hitungPenilaian{
     double tatabhs, keindahan, eyd, struktur, kreatifitas;

    public Penilaian(double tatabhs, double eyd, double struktur, double kreatifitas) {
        this.tatabhs = tatabhs;
        this.keindahan = keindahan;
        this.eyd = eyd;
        this.struktur = struktur;
        this.kreatifitas = kreatifitas;
    }

    @Override
    public double hitungKarya() {
        return 0.15*tatabhs+0.35*eyd+0.25*struktur+0.25*kreatifitas;
    }

    @Override
    public double hitungPusi() {
      return 0.30*keindahan+0.20*eyd+0.20*struktur+0.30*kreatifitas;  
    }
    
}
