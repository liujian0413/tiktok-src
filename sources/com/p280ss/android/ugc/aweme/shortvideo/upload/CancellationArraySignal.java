package com.p280ss.android.ugc.aweme.shortvideo.upload;

import android.support.p022v4.p027os.C0879b.C0880a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.CancellationArraySignal */
public class CancellationArraySignal implements C0880a {

    /* renamed from: a */
    private List<C0880a> f107788a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void mo3282a() {
        for (C0880a a : this.f107788a) {
            a.mo3282a();
        }
    }

    /* renamed from: a */
    public final void mo102055a(C0880a aVar) {
        this.f107788a.add(aVar);
    }
}
