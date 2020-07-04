package com.bytedance.android.livesdk.p410o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.bytedance.android.livesdk.p410o.C8735f.C8737a;
import com.bytedance.android.livesdk.p410o.p412b.C8720c;

/* renamed from: com.bytedance.android.livesdk.o.j */
final /* synthetic */ class C8744j implements OnCancelListener {

    /* renamed from: a */
    private final C8737a f23752a;

    /* renamed from: b */
    private final C8720c f23753b;

    C8744j(C8737a aVar, C8720c cVar) {
        this.f23752a = aVar;
        this.f23753b = cVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f23752a.mo21739a(this.f23753b, dialogInterface);
    }
}
