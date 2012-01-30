package hberntsen.prst1.norefreshenabler;

import hberntsen.prst1.norefreshenabler.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;

public class NoRefreshEnablerActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		FrameLayout lo = (FrameLayout) findViewById(R.id.frameLayout1);
		
		final EinkListView eilv = new EinkListView(this);		
		lo.addView(eilv);
		eilv.mUpdateMode = 5;
		eilv.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item,
				new String[0]));
		eilv.invalidate();
		
		((Button) findViewById(R.id.button1))
				.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						finish();
					}
				});
	}

}