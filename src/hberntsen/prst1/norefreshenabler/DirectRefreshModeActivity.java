package hberntsen.prst1.norefreshenabler;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;

public class DirectRefreshModeActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		NoRefreshEnablerActivity.init(this, true, true);
		
	}

}