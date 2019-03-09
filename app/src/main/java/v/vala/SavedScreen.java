package v.vala;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SavedScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_screen);

        TabLayout menuTab =  findViewById(R.id.menuTabs);

        TabLayout.Tab savedTab = menuTab.getTabAt(1);

        savedTab.select();
    }
}
