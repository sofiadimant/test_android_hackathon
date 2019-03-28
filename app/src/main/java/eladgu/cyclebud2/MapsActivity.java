package eladgu.cyclebud2;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }



    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1020);
        } else {
            mMap.setMyLocationEnabled(true);
        }

        // Add a marker in Sydney and move the camera
        LatLng test_marker = new LatLng(32.086696, 34.789754);
        mMap.addMarker(new MarkerOptions().position(test_marker).title("Marker in Hamedina Square"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(test_marker));
        mMap.setTrafficEnabled(true);
        mMap.setBuildingsEnabled(true);

        addMarkersToMap(mMap, getMarkersCoordinates()); // TODO: adds the markers received from the server

        UiSettings uiSettings = mMap.getUiSettings();
        uiSettings.setZoomControlsEnabled(true);
        uiSettings.setCompassEnabled(true);
        uiSettings.setMyLocationButtonEnabled(true);
        uiSettings.setScrollGesturesEnabled(true);
        uiSettings.setZoomControlsEnabled(true);


    }


    private void addMarkersToMap(GoogleMap mMap, LatLng[] markersCoordinates) {
        for(int i=0;i<markersCoordinates.length; i++) {
            mMap.addMarker(new MarkerOptions().position(markersCoordinates[i]).title(String.format("Marker num %d", i)));
        }
    }

    private LatLng[] getMarkersCoordinates() {
        LatLng[] coor_array;
        coor_array = new LatLng[3];
        coor_array[0] = new LatLng(32.089696, 34.799754);
        coor_array[1] = new LatLng(32.090696, 34.809754);
        coor_array[2] = new LatLng(32.091696, 34.819754);
        return coor_array;
    }
}
