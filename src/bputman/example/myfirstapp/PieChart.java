package bputman.example.myfirstapp;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class PieChart extends View {

	private Paint mTextPaint;
	private int mTextColor;
	private int mTextHeight;
	private Paint mPiePaint;
	private Paint mShadowPaint;

	public PieChart(Context context, AttributeSet attrs) {
		super(context,attrs);
	}
	
	private void init() {
		   mTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		   mTextPaint.setColor(mTextColor);
		   if (mTextHeight == 0) {
		       mTextHeight = (int) mTextPaint.getTextSize();
		   } else {
		       mTextPaint.setTextSize(mTextHeight);
		   }

		   mPiePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		   mPiePaint.setStyle(Paint.Style.FILL);
		   mPiePaint.setTextSize(mTextHeight);

		   mShadowPaint = new Paint(0);
		   mShadowPaint.setColor(0xff101010);
		   mShadowPaint.setMaskFilter(new BlurMaskFilter(8, BlurMaskFilter.Blur.NORMAL));
	}
}
