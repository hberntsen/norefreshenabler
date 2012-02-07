package hberntsen.prst1.norefreshenabler;

import hberntsen.prst1.norefreshenabler.R;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;

public class NoRefreshEnablerActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		init(this,false,false);
	}

	public static void init(final Activity activity, boolean enableRefreshMode, boolean leaveAfterSet) {
		activity.setContentView(R.layout.main);
		FrameLayout lo = (FrameLayout) activity.findViewById(R.id.frameLayout1);
		
		final EinkListView eilv = new EinkListView(activity);		
		lo.addView(eilv);
		
		if(enableRefreshMode) {
			eilv.mUpdateMode = 34;
		} else {
			eilv.mUpdateMode = 5;
		}
		eilv.invalidate();
		
		eilv.setAdapter(new ArrayAdapter<String>(activity, R.layout.list_item,
				new String[0]));

		
/*		((Button) activity.findViewById(R.id.button1))
				.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						eilv.mUpdateMode = 5;
						eilv.invalidate();
						activity.finish();
					}
				});
		
		((Button) activity.findViewById(R.id.button2))
		.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				eilv.mUpdateMode = 34;
				eilv.invalidate();
				activity.finish();
			}
		});	*/

		if(leaveAfterSet) {
			Handler handler = new Handler(); 
		    handler.postDelayed(new Runnable() { 
		         public void run() { 
		        	 activity.finish();
		         } 
		    }, 2000);		
		}
	}
}