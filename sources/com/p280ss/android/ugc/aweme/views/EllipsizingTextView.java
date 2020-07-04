package com.p280ss.android.ugc.aweme.views;

import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextUtils.TruncateAt;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.views.EllipsizingTextView */
public class EllipsizingTextView extends DmtTextView {

    /* renamed from: b */
    public boolean f112243b;

    /* renamed from: c */
    private final List<Object> f112244c;

    /* renamed from: d */
    private boolean f112245d;

    /* renamed from: e */
    private boolean f112246e;

    /* renamed from: f */
    private String f112247f;

    /* renamed from: g */
    private int f112248g;

    /* renamed from: h */
    private float f112249h;

    /* renamed from: i */
    private float f112250i;

    public int getMaxLines() {
        return this.f112248g;
    }

    public void setEllipsize(TruncateAt truncateAt) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m137580a() {
        /*
            r7 = this;
            int r0 = r7.getMaxLines()
            java.lang.String r1 = r7.f112247f
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 == r2) goto L_0x0060
            android.text.Layout r5 = r7.m137579a(r1)
            int r6 = r5.getLineCount()
            if (r6 <= r0) goto L_0x0060
            java.lang.String r1 = r7.f112247f
            int r6 = r0 + -1
            int r5 = r5.getLineEnd(r6)
            java.lang.String r1 = r1.substring(r4, r5)
            java.lang.String r1 = r1.trim()
        L_0x0025:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r6 = "..."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.text.Layout r5 = r7.m137579a(r5)
            int r5 = r5.getLineCount()
            if (r5 <= r0) goto L_0x004d
            r5 = 32
            int r5 = r1.lastIndexOf(r5)
            if (r5 == r2) goto L_0x004d
            java.lang.String r1 = r1.substring(r4, r5)
            goto L_0x0025
        L_0x004d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "..."
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r0 = 1
            goto L_0x0061
        L_0x0060:
            r0 = 0
        L_0x0061:
            java.lang.CharSequence r2 = r7.getText()
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0077
            r7.f112246e = r3
            r7.setText(r1)     // Catch:{ all -> 0x0073 }
            r7.f112246e = r4
            goto L_0x0077
        L_0x0073:
            r0 = move-exception
            r7.f112246e = r4
            throw r0
        L_0x0077:
            r7.f112245d = r4
            boolean r1 = r7.f112243b
            if (r0 == r1) goto L_0x008f
            r7.f112243b = r0
            java.util.List<java.lang.Object> r0 = r7.f112244c
            java.util.Iterator r0 = r0.iterator()
        L_0x0085:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x008f
            r0.next()
            goto L_0x0085
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.views.EllipsizingTextView.m137580a():void");
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.f112248g = i;
        this.f112245d = true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (VERSION.SDK_INT >= 11) {
            super.setEllipsize(TruncateAt.END);
        } else if (this.f112245d) {
            super.setEllipsize(null);
            m137580a();
        }
        super.onDraw(canvas);
    }

    /* renamed from: a */
    private Layout m137579a(String str) {
        StaticLayout staticLayout = new StaticLayout(str, getPaint(), (getWidth() - getPaddingLeft()) - getPaddingRight(), Alignment.ALIGN_NORMAL, this.f112249h, this.f112250i, false);
        return staticLayout;
    }

    public void setLineSpacing(float f, float f2) {
        if (VERSION.SDK_INT < 11) {
            this.f112250i = f;
            this.f112249h = f2;
            super.setLineSpacing(f, f2);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (VERSION.SDK_INT < 11 && !this.f112246e) {
            this.f112247f = charSequence.toString();
            this.f112245d = true;
        }
    }
}
