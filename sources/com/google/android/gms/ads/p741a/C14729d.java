package com.google.android.gms.ads.p741a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C14732b;
import com.google.android.gms.ads.C14745e;
import com.google.android.gms.ads.C14766h;
import com.google.android.gms.ads.C14871k;
import com.google.android.gms.ads.C14873l;
import com.google.android.gms.internal.ads.C15522at;
import com.google.android.gms.internal.ads.afm;

/* renamed from: com.google.android.gms.ads.a.d */
public final class C14729d extends ViewGroup {

    /* renamed from: a */
    private final C15522at f38070a;

    public final C14871k getVideoController() {
        return this.f38070a.f41002a;
    }

    public final void setVideoOptions(C14873l lVar) {
        this.f38070a.mo40004a(lVar);
    }

    public final C14873l getVideoOptions() {
        return this.f38070a.f41007f;
    }

    public final C14732b getAdListener() {
        return this.f38070a.f41003b;
    }

    public final C14745e getAdSize() {
        return this.f38070a.mo40010b();
    }

    public final C14745e[] getAdSizes() {
        return this.f38070a.f41004c;
    }

    public final String getAdUnitId() {
        return this.f38070a.mo40012c();
    }

    public final C14725a getAppEventListener() {
        return this.f38070a.f41005d;
    }

    public final C14726b getOnCustomRenderedAdLoadedListener() {
        return this.f38070a.f41006e;
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.f38070a.mo40008a(z);
    }

    public final void setAdListener(C14732b bVar) {
        this.f38070a.mo40002a(bVar);
    }

    public final void setAdSizes(C14745e... eVarArr) {
        if (eVarArr == null || eVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f38070a.mo40011b(eVarArr);
    }

    public final void setAdUnitId(String str) {
        this.f38070a.mo40007a(str);
    }

    public final void setAppEventListener(C14725a aVar) {
        this.f38070a.mo40000a(aVar);
    }

    public final void setCorrelator(C14766h hVar) {
        this.f38070a.mo40003a(hVar);
    }

    public final void setOnCustomRenderedAdLoadedListener(C14726b bVar) {
        this.f38070a.mo40001a(bVar);
    }

    public final String getMediationAdapterClassName() {
        return this.f38070a.mo40015f();
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
