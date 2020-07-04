package android.support.p029v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p029v7.widget.C1442z.C1443a;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.widget.FitWindowsFrameLayout */
public class FitWindowsFrameLayout extends FrameLayout implements C1442z {

    /* renamed from: a */
    private C1443a f4713a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public void setOnFitSystemWindowsListener(C1443a aVar) {
        this.f4713a = aVar;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (this.f4713a != null) {
            this.f4713a.mo4326a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
