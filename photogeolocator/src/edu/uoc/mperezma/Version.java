/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.uoc.mperezma;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;
import edu.uoc.mperezma.maps.R;

/**
 *
 * @author mperezma
 */
public class Version extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.version);
        EditText mEditor = (EditText) findViewById(R.id.editor);
        mEditor.setClickable(false);
        mEditor.setFocusable(false);
        mEditor.setText("" +
                "Photo Geolocator" +
                "\n" +
                getText(R.string.version) + " 1.0 Beta (Build 201005172249)" +
                "\n" +
                "\n" +
                "Mario Pérez Madueño - mario@oiram.com" +
                "\n" +
                "\n" +
                getText(R.string.betaTestTeam) +
                "\n" +
                "\n" +
                "Montxo - HTC Dream" +
                "\n" +
                "Pablo Carmona - HTC Magic" +
                "\n" +
                "Javier Gallego - HTC Hero" +
                "\n" +
                "Emiliano García - HTC Hero / Tatoo" +
                "\n" +
                "Manel García - HTC Tatoo" +
                "\n" +
                "Javier Gavilán - HTC Hero" +
                "\n" +
                "David Godino - HTC Legend" +
                "\n" +
                "Enric Heredia - HTC Tatoo" +
                "\n" +
                "Ángel Martínez - HTC Hero" +
                "\n" +
                "Juan Manuel Patón - HTC Hero" +
                "\n" +
                "Marco Antonio Pérez - HTC Magic" +
                "\n" +
                "Moisés Regalon - HTC Magic" +
                "\n" +
                "\n" +
                getText(R.string.thisAppUsesLibrary) + " Sanselan Android (http://code.google.com/p/sanselanandroid)");
    }

}
