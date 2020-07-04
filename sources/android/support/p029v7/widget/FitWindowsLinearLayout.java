package android.support.p029v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p029v7.widget.C1442z.C1443a;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.widget.FitWindowsLinearLayout */
public class FitWindowsLinearLayout extends LinearLayout implements C1442z {

    /* renamed from: a */
    private C1443a f4714a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public void setOnFitSystemWindowsListener(C1443a aVar) {
        this.f4714a = aVar;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (this.f4714a != null) {
            this.f4714a.mo4326a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
