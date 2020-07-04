package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.support.p029v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.bytedance.android.live.core.utils.C3391k;

public class LiveTextView extends AppCompatTextView {

    /* renamed from: b */
    protected static C3391k f10235b;

    /* renamed from: c */
    protected static boolean f10236c;

    public static void setEnableHostTypeface(boolean z) {
        f10236c = z;
    }

    public static void setFontManager(C3391k kVar) {
        f10235b = kVar;
    }

    public LiveTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m12697a(AttributeSet attributeSet) {
        if (f10236c && attributeSet != null) {
            int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "textStyle", 0);
            if (f10235b != null) {
                Typeface a = f10235b.mo10284a(attributeIntValue);
                if (a != null) {
                    setTypeface(a);
                }
            }
        }
    }

    public LiveTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12697a(attributeSet);
    }

    public LiveTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12697a(attributeSet);
    }
}
