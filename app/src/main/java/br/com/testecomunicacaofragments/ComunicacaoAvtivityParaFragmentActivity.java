package br.com.testecomunicacaofragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ComunicacaoAvtivityParaFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacao_avtivity_para_fragment);

        Button botaoVerde = findViewById(R.id.btn_verde);
        botaoVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarFragment("verde");
            }
        });

        Button botaoRosa = findViewById(R.id.btn_rosa);
        botaoRosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarFragment("rosa");
          }
        });
    }

    private void iniciarFragment(String cor){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        CoresFragment coresFragment = new CoresFragment();

        Bundle bundle = new Bundle();
        bundle.putString("COR", cor);

        coresFragment.setArguments(bundle);

        transaction.replace(R.id.container_id, coresFragment);
        transaction.commit();
    }
}
