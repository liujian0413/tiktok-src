package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.support.p029v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import com.bytedance.android.live.core.utils.C3391k;

public class LiveEditText extends AppCompatEditText {

    /* renamed from: a */
    protected static C3391k f10233a;

    /* renamed from: b */
    protected static boolean f10234b;

    public static void setEnableHostTypeface(boolean z) {
        f10234b = z;
    }

    public static void setFontManager(C3391k kVar) {
        f10233a = kVar;
    }

    public LiveEditText(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m12696a(AttributeSet attributeSet) {
        if (f10234b && attributeSet != null) {
            int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "textStyle", 0);
            if (f10233a != null) {
                Typeface a = f10233a.mo10284a(attributeIntValue);
                if (a != null) {
                    setTypeface(a);
                }
            }
        }
    }

    public LiveEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12696a(attributeSet);
    }

    public LiveEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
