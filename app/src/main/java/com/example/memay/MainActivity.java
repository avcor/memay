// instead of button click there would be card click that u r job to manage.
// there is bottomsheet that i have created with XML and java (namely bottom_sheet) (same that is the tray shown in prototype)
// bottom sheet is like fragment, manage number of post and show it in this fragment
// nothing to touch with, i have colors lib made already. u will find all the color at same place
// i am on holidays. Dont disturb me till 31 aug, 2020.
// thank you
// urs verma mc

package com.example.memay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {

    public ScrollView scrollView;
    public ChipNavigationBar chipNavigationBar;
    //private FrameLayout fragmentcontainer;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //fragmentcontainer = (FrameLayout)findViewById(R.id.fragment_tray);
        button = (Button)findViewById(R.id.button);
        scrollView = (ScrollView)findViewById(R.id.scroll_main);
        chipNavigationBar = (ChipNavigationBar)findViewById(R.id.nav_bar);
        chipNavigationBar.setItemSelected(R.id.menu_politics,true);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                exampleBottomSheetDialog bottomSheetDialog = new exampleBottomSheetDialog();
                bottomSheetDialog.show(getSupportFragmentManager(),"tray");
            }
        });

    }
/*    public void openfragment(){
        fragment_tray fragment = fragment_tray.newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.anim.from_bottom,R.anim.to_down,R.anim.from_bottom,R.anim.to_down);
        transaction.addToBackStack(null);
        transaction.add(R.id.fragment_tray, fragment,"blank_fragment").commit();

    }*/
}