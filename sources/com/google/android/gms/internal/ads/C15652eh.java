package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.eh */
final class C15652eh implements C15630dn {

    /* renamed from: a */
    private final /* synthetic */ View f44410a;

    /* renamed from: b */
    private final /* synthetic */ C15650ef f44411b;

    C15652eh(C15650ef efVar, View view) {
        this.f44411b = efVar;
        this.f44410a = view;
    }

    /* renamed from: a */
    public final void mo41541a() {
        if (this.f44411b.m50681a(C15650ef.f44397a)) {
            this.f44411b.onClick(this.f44410a);
        }
    }

    /* renamed from: a */
    public final void mo41542a(MotionEvent motionEvent) {
        this.f44411b.onTouch(null, motionEvent);
    }
}
