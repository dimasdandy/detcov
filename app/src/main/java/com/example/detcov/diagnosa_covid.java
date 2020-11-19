package com.example.detcov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class diagnosa_covid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa_covid);

        final CheckBox cb_riwayatkontak = findViewById(R.id.cb_riwayatkontak);
        final CheckBox cb_riwayatperjalanan = findViewById(R.id.cb_riwayatperjalanan);
        final CheckBox cb_tidakadagejala = findViewById(R.id.cb_tidakadagejala);
        final CheckBox cb_demam = findViewById(R.id.cb_demam);
        final CheckBox cb_batuk = findViewById(R.id.cb_batuk);
        final CheckBox cb_pilek = findViewById(R.id.cb_pilek);
        final CheckBox cb_sakittenggorokan = findViewById(R.id.cb_sakittenggorokan);
        final CheckBox cb_sesaknafas = findViewById(R.id.cb_sesaknafas);
        final CheckBox cb_pneunomia = findViewById(R.id.cb_pneunomia);

        final TextView tv_hasil = findViewById(R.id.hasildiagnosa);
        final TextView tv_analisa = findViewById(R.id.tv_analisa);
        Button btn_hasil = findViewById(R.id.btn_hasildiagnosa);

        btn_hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kategori = "";
                String analisa = "";

                //PDP
                if (cb_batuk.isChecked() && cb_demam.isChecked() && cb_pilek.isChecked() && cb_pneunomia.isChecked() && cb_riwayatkontak.isChecked()
                        && cb_riwayatperjalanan.isChecked() && cb_sakittenggorokan.isChecked() && cb_sesaknafas.isChecked() && cb_tidakadagejala.isChecked()){
                    kategori += "";
                    analisa += "";
                }
                else if (cb_batuk.isChecked() && cb_demam.isChecked() && cb_pilek.isChecked() && cb_pneunomia.isChecked() && cb_riwayatkontak.isChecked()
                    && cb_riwayatperjalanan.isChecked() && cb_sakittenggorokan.isChecked() && cb_sesaknafas.isChecked()){
                    kategori += "Pasien Dalam Pengawasan (PDP) & Gejala Terinfeksi Virus Covid-19";
                    analisa += "Karena anda menderita seluruh gejala Covid-19, kontak dengan pasien positif Covid-19, " +
                            "serta pernah melakukan perjalanan dalam/luar negeri. " +
                            "\n\nSegera hubungi hotline 119 atau segera Periksakan diri anda di RS Rujukan terdekat untuk melakukan Rapid / SWAB Test.\n";
                }

                //ODP
                else if(cb_demam.isChecked() && cb_batuk.isChecked() && cb_pilek.isChecked() && cb_sakittenggorokan.isChecked()
                        && cb_riwayatkontak.isChecked() &&cb_riwayatkontak.isChecked() && cb_tidakadagejala.isChecked()){
                    kategori += "";
                    analisa += "";
                }
                else if(cb_demam.isChecked() && cb_batuk.isChecked() && cb_pilek.isChecked() && cb_sakittenggorokan.isChecked()
                        && cb_riwayatkontak.isChecked() &&cb_riwayatkontak.isChecked() && cb_pneunomia.isChecked()){
                    kategori += "";
                    analisa += "";
                }
                else if(cb_demam.isChecked() && cb_batuk.isChecked() && cb_pilek.isChecked() && cb_sakittenggorokan.isChecked()
                        && cb_riwayatkontak.isChecked() &&cb_riwayatkontak.isChecked() && cb_sesaknafas.isChecked()){
                    kategori += "";
                    analisa += "";
                }
                else if(cb_demam.isChecked() && cb_batuk.isChecked() && cb_pilek.isChecked() && cb_sakittenggorokan.isChecked()
                        && cb_riwayatkontak.isChecked() &&cb_riwayatkontak.isChecked()){
                    kategori += "Orang Dalam Pantauan (ODP)";
                    analisa += "Karena anda menderita demam >= 38°C, batuk kering, pilek, sakit tenggorokan, kontak dengan pasien positif Covid-19, " +
                            "serta pernah melakukan perjalanan dalam/luar negeri. " +
                            "\n\nSegera hubungi hotline 119 atau segera Periksakan diri anda di RS Rujukan terdekat untuk melakukan Rapid / SWAB Test.\n";
                }
                else if(cb_demam.isChecked() && cb_riwayatkontak.isChecked() &&cb_riwayatkontak.isChecked()){
                    kategori += "Orang Dalam Pantauan (ODP)";
                    analisa += "Karena anda menderita atau memiliki riwayat demam >= 38°C, kontak dengan pasien positif Covid-19, " +
                            "serta pernah melakukan perjalanan dalam/luar negeri. " +
                            "\n\nSegera hubungi hotline 119 atau segera Periksakan diri anda di RS Rujukan terdekat untuk melakukan Rapid / SWAB Test.\n";
                }
                else if(cb_riwayatkontak.isChecked() &&cb_riwayatperjalanan.isChecked()){
                    kategori += "Orang Dalam Pantauan (ODP)";
                    analisa += "Karena anda kontak dengan pasien positif Covid-19, serta pernah melakukan perjalanan dalam/luar negeri." +
                            "\n\nSegera hubungi hotline 119 atau segera Periksakan diri anda di RS Rujukan terdekat untuk melakukan Rapid / SWAB Test.\n";
                }
                else if(cb_riwayatkontak.isChecked() &&cb_demam.isChecked()){
                    kategori += "Orang Dalam Pantauan (ODP)";
                    analisa += "Karena anda kontak dengan pasien positif Covid-19, serta pernah melakukan perjalanan dalam/luar negeri." +
                            "\n\nSegera hubungi hotline 119 atau segera Periksakan diri anda di RS Rujukan terdekat untuk melakukan Rapid / SWAB Test.\n";
                }
                else if(cb_riwayatperjalanan.isChecked() &&cb_demam.isChecked()){
                    kategori += "Orang Dalam Pantauan (ODP)";
                    analisa += "Karena anda kontak dengan pasien positif Covid-19, serta pernah melakukan perjalanan dalam/luar negeri." +
                            "\n\nSegera hubungi hotline 119 atau segera Periksakan diri anda di RS Rujukan terdekat untuk melakukan Rapid / SWAB Test.\n";
                }

                //OTG
                else if (cb_riwayatkontak.isChecked() && cb_tidakadagejala.isChecked()){
                    kategori += "Orang Tanpa Gejala (OTG)";
                    analisa += "Anda tidak mengalami gejala Covid-19 dan memiliki kontak dengan pasien positif Covid-19" +
                            "\nSegera isolasi mandiri dirumah selama 14, bila dalam kurun waktu tersebut mengalami gejala covid." +
                            " Segera hubungi hotline 119 atau segera Periksakan diri anda di RS Rujukan terdekat untuk melakukan Rapid / SWAB Test.\n";
                }

                //Satu pilihan
                else if (cb_tidakadagejala.isChecked()){
                    kategori += "Anda Tidak Mengalami Gejala Covid-19";
                    analisa += "Karena anda tidak mengalami gejala, tidak kontak dengan pasien positif corona, dan tidak pernah melakukan perjalanan dalam/luar negeri." +
                            "Maka anda tidak termasuk kategori manapun. Tetap jaga kesehatan anda!\n";
                }
                else if(cb_batuk.isChecked()){
                    kategori += "Di luar gejala terpapar Virus Covid-19";
                    analisa += "Kemungkinan anda menderita flu, atau batuk. Segera minum obat dan vitamin\n";
                }
                else if(cb_pilek.isChecked()){
                    kategori += "Di luar gejala terpapar Virus Covid-19";
                    analisa += "Kemungkinan anda menderita flu, atau batuk. Segera minum obat dan vitamin\n";
                }
                else if(cb_sakittenggorokan.isChecked()){
                    kategori += "Di luar gejala terpapar Virus Covid-19";
                    analisa += "Kemungkinan anda menderita flu, atau batuk. Segera minum obat dan vitamin\n";
                }
                else if(cb_demam.isChecked()){
                    kategori += "Di luar gejala terpapar Virus Covid-19";
                    analisa += "Kemungkinan anda menderita flu, atau batuk. Segera minum obat dan vitamin\n";
                }
                else if(cb_sesaknafas.isChecked()){
                    kategori += "Di luar gejala terpapar Virus Covid-19";
                    analisa += "Kemungkinan anda menderita flu, atau batuk. Segera minum obat dan vitamin\n";
                }
                else if(cb_pneunomia.isChecked()){
                    kategori += "Di luar gejala terpapar Virus Covid-19";
                    analisa += "Anda menderita pneunomia, segera berobat ke Rumah sakit terdekat\n";
                }
                else{
                    kategori += "";
                    analisa += "";
                }

                tv_hasil.setText(kategori);
                tv_analisa.setText(analisa);
            }
        });
    }
}
