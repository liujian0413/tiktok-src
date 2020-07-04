package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a */
    private final int f5610a = getResources().getDimensionPixelOffset(R.dimen.cr);

    /* renamed from: b */
    private final int f5611b = getResources().getDimensionPixelOffset(R.dimen.cq);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f5610a * 2), this.f5611b), 1073741824), i2);
    }
}
