package com.bytedance.ies.dmt.p262ui.widget.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.ies.dmt.R$styleable;
import java.util.Map;

/* renamed from: com.bytedance.ies.dmt.ui.widget.util.b */
public class C10832b {

    /* renamed from: a */
    private static volatile C10832b f29321a;

    /* renamed from: b */
    private boolean f29322b;

    private C10832b() {
    }

    /* renamed from: a */
    public static C10832b m31784a() {
        if (f29321a == null) {
            synchronized (C10832b.class) {
                if (f29321a == null) {
                    f29321a = new C10832b();
                }
            }
        }
        return f29321a;
    }

    /* renamed from: a */
    public final synchronized Typeface mo26161a(String str) {
        if (!this.f29322b) {
            return null;
        }
        return C10831a.m31777a().mo26159a(str);
    }

    /* renamed from: b */
    private void m31785b(TextView textView, AttributeSet attributeSet) {
        if (textView != null && attributeSet != null) {
            if (this.f29322b) {
                if (m31786c(textView, attributeSet)) {
                    textView.setIncludeFontPadding(true);
                }
            } else if (!m31787d(textView, attributeSet)) {
                textView.setIncludeFontPadding(true);
            }
        }
    }

    /* renamed from: c */
    private static boolean m31786c(TextView textView, AttributeSet attributeSet) {
        boolean z = false;
        if (textView == null) {
            return false;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(attributeSet, R$styleable.FontConfig);
            z = obtainStyledAttributes.getBoolean(2, false);
            obtainStyledAttributes.recycle();
        }
        return z;
    }

    /* renamed from: d */
    private static boolean m31787d(TextView textView, AttributeSet attributeSet) {
        boolean z = false;
        if (textView == null) {
            return false;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(attributeSet, R$styleable.FontConfig);
            z = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
        }
        return z;
    }

    /* renamed from: e */
    private static int m31788e(TextView textView, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return 1;
        }
        TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(attributeSet, R$styleable.FontConfig);
        int i = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
        return i;
    }

    /* renamed from: a */
    public final synchronized void mo26162a(Context context, Map<String, String> map) {
        this.f29322b = false;
        if (!(context == null || map == null || map.size() <= 0)) {
            C10831a.m31779b();
            C10831a.m31777a().mo26160a(context, map);
            this.f29322b = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo26163a(android.widget.TextView r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            r1.m31785b(r2, r3)     // Catch:{ all -> 0x001d }
            boolean r0 = r1.f29322b     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x000a
            monitor-exit(r1)
            return
        L_0x000a:
            int r3 = m31788e(r2, r3)     // Catch:{ all -> 0x001d }
            com.bytedance.ies.dmt.ui.widget.util.a r0 = com.bytedance.ies.dmt.p262ui.widget.util.C10831a.m31777a()     // Catch:{ all -> 0x001d }
            android.graphics.Typeface r3 = r0.mo26158a(r3)     // Catch:{ all -> 0x001d }
            if (r3 == 0) goto L_0x001b
            r2.setTypeface(r3)     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r1)
            return
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p262ui.widget.util.C10832b.mo26163a(android.widget.TextView, android.util.AttributeSet):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0017, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo26164a(android.widget.TextView r2, java.lang.String r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L_0x0016
            boolean r0 = r1.f29322b     // Catch:{ all -> 0x0013 }
            if (r0 != 0) goto L_0x0008
            goto L_0x0016
        L_0x0008:
            android.graphics.Typeface r3 = r1.mo26161a(r3)     // Catch:{ all -> 0x0013 }
            if (r3 == 0) goto L_0x0011
            r2.setTypeface(r3)     // Catch:{ all -> 0x0013 }
        L_0x0011:
            monitor-exit(r1)
            return
        L_0x0013:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0016:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p262ui.widget.util.C10832b.mo26164a(android.widget.TextView, java.lang.String):void");
    }
}
