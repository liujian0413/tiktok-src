package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class ToggleImageButton extends ImageButton {

    /* renamed from: e */
    private static final int[] f120591e = {R.attr.a38};

    /* renamed from: a */
    public boolean f120592a;

    /* renamed from: b */
    String f120593b;

    /* renamed from: c */
    String f120594c;

    /* renamed from: d */
    final boolean f120595d;

    /* renamed from: a */
    private void m146942a() {
        setToggledOn(!this.f120592a);
    }

    public boolean performClick() {
        if (this.f120595d) {
            m146942a();
        }
        return super.performClick();
    }

    public ToggleImageButton(Context context) {
        this(context, null);
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.f120592a) {
            mergeDrawableStates(onCreateDrawableState, f120591e);
        }
        return onCreateDrawableState;
    }

    public void setToggledOn(boolean z) {
        String str;
        this.f120592a = z;
        if (z) {
            str = this.f120593b;
        } else {
            str = this.f120594c;
        }
        setContentDescription(str);
        refreshDrawableState();
    }

    public ToggleImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ToggleImageButton(android.content.Context r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            r3.<init>(r4, r5, r6)
            r0 = 0
            android.content.res.Resources$Theme r4 = r4.getTheme()     // Catch:{ all -> 0x0040 }
            int[] r1 = com.twitter.sdk.android.tweetui.R$styleable.ToggleImageButton     // Catch:{ all -> 0x0040 }
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r6, r2)     // Catch:{ all -> 0x0040 }
            r5 = 1
            java.lang.String r6 = r4.getString(r5)     // Catch:{ all -> 0x003e }
            java.lang.String r0 = r4.getString(r2)     // Catch:{ all -> 0x003e }
            if (r6 != 0) goto L_0x0020
            java.lang.CharSequence r6 = r3.getContentDescription()     // Catch:{ all -> 0x003e }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x003e }
        L_0x0020:
            r3.f120593b = r6     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x002b
            java.lang.CharSequence r6 = r3.getContentDescription()     // Catch:{ all -> 0x003e }
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x003e }
        L_0x002b:
            r3.f120594c = r0     // Catch:{ all -> 0x003e }
            r6 = 3
            boolean r5 = r4.getBoolean(r6, r5)     // Catch:{ all -> 0x003e }
            r3.f120595d = r5     // Catch:{ all -> 0x003e }
            r3.setToggledOn(r2)     // Catch:{ all -> 0x003e }
            if (r4 == 0) goto L_0x003d
            r4.recycle()
            return
        L_0x003d:
            return
        L_0x003e:
            r5 = move-exception
            goto L_0x0042
        L_0x0040:
            r5 = move-exception
            r4 = r0
        L_0x0042:
            if (r4 == 0) goto L_0x0047
            r4.recycle()
        L_0x0047:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.tweetui.ToggleImageButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
