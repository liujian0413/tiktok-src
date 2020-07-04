package com.google.android.gms.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.p741a.C14725a;
import com.google.android.gms.internal.ads.C15522at;
import com.google.android.gms.internal.ads.afm;
import com.google.android.gms.internal.ads.bxr;

/* renamed from: com.google.android.gms.ads.g */
class C14765g extends ViewGroup {

    /* renamed from: a */
    protected final C15522at f38133a = new C15522at(this, 0);

    public C14765g(Context context, int i) {
        super(context);
    }

    /* renamed from: c */
    public void mo37458c() {
        this.f38133a.mo39999a();
    }

    public C14732b getAdListener() {
        return this.f38133a.f41003b;
    }

    public C14745e getAdSize() {
        return this.f38133a.mo40010b();
    }

    public String getAdUnitId() {
        return this.f38133a.mo40012c();
    }

    /* renamed from: a */
    public void mo37455a(C14743d dVar) {
        this.f38133a.mo40005a(dVar.f38094a);
    }

    /* renamed from: b */
    public void mo37457b() {
        this.f38133a.mo40013d();
    }

    /* renamed from: a */
    public void mo37454a() {
        this.f38133a.mo40014e();
    }

    public void setAdListener(C14732b bVar) {
        this.f38133a.mo40002a(bVar);
        if (bVar == null) {
            this.f38133a.mo40006a((bxr) null);
            this.f38133a.mo40000a((C14725a) null);
            return;
        }
        if (bVar instanceof bxr) {
            this.f38133a.mo40006a((bxr) bVar);
        }
        if (bVar instanceof C14725a) {
            this.f38133a.mo40000a((C14725a) bVar);
        }
    }

    public void setAdSize(C14745e eVar) {
        this.f38133a.mo40009a(eVar);
    }

    /* renamed from: a */
    public void mo37456a(C14745e... eVarArr) {
        this.f38133a.mo40011b(eVarArr);
    }

    public void setAdUnitId(String str) {
        this.f38133a.mo40007a(str);
    }

    public String getMediationAdapterClassName() {
        return this.f38133a.mo40015f();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    public void onMeasure(int i, int i2) {
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
