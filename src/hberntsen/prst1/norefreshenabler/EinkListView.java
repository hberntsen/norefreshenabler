package hberntsen.prst1.norefreshenabler;

import java.lang.reflect.Method;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ListView;



public class EinkListView extends ListView {
	public int mUpdateMode = 0;
	
	public EinkListView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public EinkListView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public EinkListView(Context context) {
		super(context);
	}

	@Override
	public void invalidate() {
		//super.invalidate(mUpdateMode);
		try {
			Method invalidateMethod = super.getClass().getMethod("invalidate", int.class);
			invalidateMethod.invoke(this, mUpdateMode);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void invalidate(int l, int t, int r, int b) {
		//super.invalidate(l, t, r, b, mUpdateMode);
		try {
			Method invalidateMethod = super.getClass().getMethod("invalidate", 
					int.class, int.class, int.class, int.class, int.class);
			invalidateMethod.invoke(this, l, t, r, b, mUpdateMode);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void invalidate(Rect dirty) {
		//super.invalidate(dirty, mUpdateMode);
		try {
			Method invalidateMethod = super.getClass().getMethod("invalidate", 
					Rect.class, int.class);
			invalidateMethod.invoke(this, dirty, mUpdateMode);
		} catch(Exception e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void invalidateDrawable(Drawable drawable) {
		//super.invalidateDrawable(drawable, mUpdateMode);
		try {
			Method invalidateMethod = super.getClass().getMethod("invalidateDrawable", 
					Drawable.class, int.class);
			invalidateMethod.invoke(this, drawable, mUpdateMode);
		} catch(Exception e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void postInvalidate() {
		//super.postInvalidate(mUpdateMode);
		try {
			Method invalidateMethod = super.getClass().getMethod("postInvalidate", int.class);
			invalidateMethod.invoke(this, mUpdateMode);
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void postInvalidate(int left, int top, int right, int bottom) {
		//super.postInvalidate(left, top, right, bottom, mUpdateMode);
		try {
			Method invalidateMethod = super.getClass().getMethod("postInvalidate", 
					int.class, int.class, int.class, int.class, int.class);
			invalidateMethod.invoke(this, left, top, right, bottom, mUpdateMode);
		} catch(Exception e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void postInvalidateDelayed(long delayMilliseconds, int left,
			int top, int right, int bottom) {
		//super.postInvalidateDelayed(delayMilliseconds, left, top, right, bottom, mUpdateMode);
		try {
			Method invalidateMethod = super.getClass().getMethod("postInvalidateDelayed", 
					long.class, int.class, int.class, int.class, int.class, int.class);
			invalidateMethod.invoke(this, delayMilliseconds, left, top, right, bottom, mUpdateMode); 
		} catch(Exception e) {
			e.printStackTrace();
		}			
	}

	@Override
	public void postInvalidateDelayed(long delayMilliseconds) {
		//super.postInvalidateDelayed(delayMilliseconds, mUpdateMode);
		try {
			Method invalidateMethod = super.getClass().getMethod("postInvalidateDelayed", 
					long.class, int.class);
			invalidateMethod.invoke(this, delayMilliseconds, mUpdateMode); 
		} catch(Exception e) {
			e.printStackTrace();
		}				
	}

	@Override
	public void scrollBy(int x, int y) {
		//super.scrollBy(x, y, mUpdateMode);
		try {
			Method invalidateMethod = super.getClass().getMethod("scrollBy", 
					int.class, int.class, int.class);
			invalidateMethod.invoke(this, x, y , mUpdateMode); 
		} catch(Exception e) {
			e.printStackTrace();
		}			
	}

	@Override
	public void scrollTo(int x, int y) {
		//super.scrollTo(x, y, mUpdateMode);
		try {
			Method invalidateMethod = super.getClass().getMethod("scrollTo", 
					int.class, int.class, int.class);
			invalidateMethod.invoke(this, x, y , mUpdateMode); 
		} catch(Exception e) {
			e.printStackTrace();
		}			
	}
}
