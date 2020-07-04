package com.bytedance.android.livesdk.fansclub;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.fansclub.l */
final /* synthetic */ class C5909l implements OnClickListener {

    /* renamed from: a */
    private final LiveFansClubEntryWidget f17480a;

    /* renamed from: b */
    private final String f17481b;

    C5909l(LiveFansClubEntryWidget liveFansClubEntryWidget, String str) {
        this.f17480a = liveFansClubEntryWidget;
        this.f17481b = str;
    }

    public final void onClick(View view) {
        this.f17480a.mo14438a(this.f17481b, view);
    }
}
