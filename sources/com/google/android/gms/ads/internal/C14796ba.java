package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.adj;
import com.google.android.gms.internal.ads.afa;
import com.google.android.gms.internal.ads.ami;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.ads.internal.ba */
public final class C14796ba extends ViewSwitcher {

    /* renamed from: a */
    public final adj f38294a;

    /* renamed from: b */
    private final afa f38295b;

    /* renamed from: c */
    private boolean f38296c = true;

    public C14796ba(Context context, String str, String str2, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        super(context);
        this.f38294a = new adj(context);
        this.f38294a.f40030b = str;
        this.f38294a.f40031c = str2;
        if (context instanceof Activity) {
            this.f38295b = new afa((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
        } else {
            this.f38295b = new afa(null, this, onGlobalLayoutListener, onScrollChangedListener);
        }
        this.f38295b.mo39269a();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f38296c) {
            this.f38294a.mo39215a(motionEvent);
        }
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof ami)) {
                arrayList.add((ami) childAt);
            }
        }
        super.removeAllViews();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((ami) obj).destroy();
        }
    }

    /* renamed from: a */
    public final void mo37708a() {
        acd.m45438a("Disable position monitoring on adFrame.");
        if (this.f38295b != null) {
            this.f38295b.mo39270b();
        }
    }

    /* renamed from: b */
    public final void mo37709b() {
        acd.m45438a("Enable debug gesture detector on adFrame.");
        this.f38296c = true;
    }

    /* renamed from: c */
    public final void mo37710c() {
        acd.m45438a("Disable debug gesture detector on adFrame.");
        this.f38296c = false;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f38295b != null) {
            this.f38295b.mo39271c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f38295b != null) {
            this.f38295b.mo39272d();
        }
    }
}
