package rhynix.eliud.simpleweather;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by eliud on 10/7/16.
 */

public class CityPreference {

    SharedPreferences pref;
    public CityPreference(Activity activity){
        pref = activity.getPreferences(Activity.MODE_PRIVATE);

    }
    // If the user has not chosen a city yet, return
    // Sydney as the default city
    String getCity(){
        return pref.getString("city","Sydney,AU");
    }
    void setCity(String city){

        pref.edit().putString("city",city).commit();

    }
}
