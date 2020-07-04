package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.acd;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.overlay.r */
public final class C14851r extends C14836c {
    public C14851r(Activity activity) {
        super(activity);
    }

    /* renamed from: a */
    public final void mo37811a(Bundle bundle) {
        acd.m45438a("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f38428d = 3;
        this.f38425a.finish();
    }
}
