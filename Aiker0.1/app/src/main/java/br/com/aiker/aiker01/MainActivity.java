package br.com.aiker.aiker01;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;

public class MainActivity extends AppCompatActivity {
    private ProgressDialog dialog;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    private Runnable location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.

}



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    // Adquire a referência ao Location Manager
    LocationManager locationManager = (LocationManager) this
            .getSystemService(Context.LOCATION_SERVICE);

    // Define o listener que responde às atualizações de localização
    LocationListener locationListener = new LocationListener() {

        @Override
        public void onLocationChanged(Location location) {
            // Chamado quando uma nova localização é encontrada

            location.getLatitude();// Latitude coletada
            location.getLongitude();// Longitude coletada
        }

       // @Override
        public void onStatusChanged(String provider, int status, Bundle extras) { }

      //  @Override
        public void onProviderEnabled(String provider) { }

      //  @Override
        public void onProviderDisabled(String provider) { }
    };

    LocationManager service = (LocationManager) getSystemService(LOCATION_SERVICE);

    // Verifica se o GPS está ativo
    boolean enabled = service.isProviderEnabled(LocationManager.GPS_PROVIDER);

// Caso não esteja ativo abre um novo diálogo com as configurações para
// realizar se ativamento
    //if(!enabled){
       // Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
        //startActivity(intent);
   // }



    // Define um critério para selecionar o location provider
    //Criteria criteria = new Criteria();
    //provider = locationManager.getBestProvider(criteria, false);

    // Retorna a localização com a data da última localização conhecida
    //Location location = locationManager.getLastKnownLocation(provider);
// Registra o listener com o Location Manager desejado para receber as atualizações
    //locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 	0, locationListener);
}

