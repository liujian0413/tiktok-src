package com.google.android.gms.ads.p743c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C14732b;
import com.google.android.gms.ads.C14745e;
import com.google.android.gms.internal.ads.C15522at;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.afm;

@C6505uv
/* renamed from: com.google.android.gms.ads.c.b */
public final class C14742b extends ViewGroup {

    /* renamed from: a */
    private final C15522at f38093a;

    public final C14732b getAdListener() {
        return this.f38093a.f41003b;
    }

    public final C14745e getAdSize() {
        return this.f38093a.mo40010b();
    }

    public final String getAdUnitId() {
        return this.f38093a.mo40012c();
    }

    public final void setAdListener(C14732b bVar) {
        this.f38093a.mo40002a(bVar);
    }

    public final void setAdSize(C14745e eVar) {
        this.f38093a.mo40009a(eVar);
    }

    public final void setAdUnitId(String str) {
        this.f38093a.mo40007a(str);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            C14745e eVar = null;
            try {
                eVar = getAdSize();
            } catch (NullPointerException e) {
                afm.m45778b("Unable to retrieve ad size.", e);
            }
            if (eVar != null) {
                Context context = getContext();
                int b = eVar.mo37450b(context);
                i3 = eVar.mo37448a(context);
                i4 = b;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }
}
