package fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.detcov.R;
import com.example.detcov.diagnosa_covid;
import com.example.detcov.menu_covid;
import com.example.detcov.menu_odp;
import com.example.detcov.menu_pencegahan;
import com.example.detcov.menu_penularan;
import com.example.detcov.testcovid;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_home extends Fragment implements View.OnClickListener {

    public fragment_home() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btn_call = view.findViewById(R.id.btn_callnow);
        btn_call.setOnClickListener(this);

        Button btn_diagnosa = view.findViewById(R.id.btn_diagnosa);
        btn_diagnosa.setOnClickListener(this);

        ImageView ivCovid = view.findViewById(R.id.menu_covid);
        ivCovid.setOnClickListener(this);

        ImageView ivPencegahan = view.findViewById(R.id.menu_pencegahan);
        ivPencegahan.setOnClickListener(this);

        ImageView ivPenularan = view.findViewById(R.id.menu_penularan);
        ivPenularan.setOnClickListener(this);

        ImageView ivODP = view.findViewById(R.id.menu_odppdp);
        ivODP.setOnClickListener(this);

        LinearLayout ivTest = view.findViewById(R.id.menu_testcovid);
        ivTest.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_callnow:
                String phoneNumber = "119";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
            case R.id.btn_diagnosa:
                Intent intentdiagnosa = new Intent(getActivity(), diagnosa_covid.class);
                startActivity(intentdiagnosa);
                break;
            case R.id.menu_covid:
                Intent intent4 = new Intent(getActivity(), menu_covid.class);
                startActivity(intent4);
                break;
            case R.id.menu_pencegahan:
                Intent intent = new Intent(getActivity(), menu_pencegahan.class);
                startActivity(intent);
                break;
            case R.id.menu_penularan:
                Intent intent2 = new Intent(getActivity(), menu_penularan.class);
                startActivity(intent2);
                break;
            case R.id.menu_odppdp:
                Intent intent3 = new Intent(getActivity(), menu_odp.class);
                startActivity(intent3);
                break;
            case R.id.menu_testcovid:
                Intent intent5 = new Intent(getActivity(), testcovid.class);
                startActivity(intent5);
                break;
        }
    }
}
