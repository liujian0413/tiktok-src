package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.ahs.C15480a;
import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class bds extends bdr {
    /* renamed from: a */
    public static bds m48500a(String str, Context context, boolean z) {
        m48490a(context, z);
        return new bds(context, str, z);
    }

    private bds(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<Callable<Void>> mo40531a(beh beh, Context context, C16247a aVar, C15480a aVar2) {
        if (beh.f41761b == null || !this.f41728r) {
            return super.mo40531a(beh, context, aVar, aVar2);
        }
        int b = beh.mo40555b();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo40531a(beh, context, aVar, aVar2));
        bfd bfd = new bfd(beh, "qFtd4C5d0KtcWzWeFLmuiEXghbgUuLNC6Ve2ufc1M4U3XrnmTraQBUqm3xNwgk3c", "CKWARAW2rIlqCmo31AsybLnBFwRJcX2Vc+m6JImxUIM=", aVar, b, 24);
        arrayList.add(bfd);
        return arrayList;
    }
}
