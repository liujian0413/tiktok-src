package androidx.work.impl.utils;

import androidx.work.WorkerParameters.C1450a;
import androidx.work.impl.C1544f;

/* renamed from: androidx.work.impl.utils.d */
public final class C1572d implements Runnable {

    /* renamed from: a */
    private C1544f f5919a;

    /* renamed from: b */
    private String f5920b;

    /* renamed from: c */
    private C1450a f5921c;

    public final void run() {
        this.f5919a.f5839f.mo6740a(this.f5920b, this.f5921c);
    }

    public C1572d(C1544f fVar, String str, C1450a aVar) {
        this.f5919a = fVar;
        this.f5920b = str;
        this.f5921c = aVar;
    }
}
