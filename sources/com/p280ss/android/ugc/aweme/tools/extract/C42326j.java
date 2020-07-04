package com.p280ss.android.ugc.aweme.tools.extract;

import android.graphics.Bitmap.CompressFormat;
import bolts.C1592h;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.asve.recorder.p922b.C20676a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.C40426a;
import com.p280ss.android.ugc.aweme.tools.extract.C42320g.C42321a;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.j */
public final class C42326j extends C42312a {

    /* renamed from: j */
    private static final String f110094j = "j";

    /* renamed from: e */
    public final C20676a f110095e;

    /* renamed from: f */
    public long f110096f;

    /* renamed from: g */
    public boolean f110097g = C35563c.f93230L.mo93342a(Property.IsExportHqFrame);

    /* renamed from: h */
    public AtomicBoolean f110098h = new AtomicBoolean(false);

    /* renamed from: i */
    private ScheduledExecutorService f110099i;

    /* renamed from: f */
    public final String mo103802f() {
        return "extract_shot";
    }

    /* renamed from: a */
    public final void mo103790a() {
        super.mo103790a();
        if (this.f110099i != null) {
            this.f110099i.shutdown();
        }
    }

    /* renamed from: a */
    public final void mo103794a(boolean z) {
        super.mo103794a(z);
    }

    /* renamed from: a */
    public final Runnable mo103807a(final int i) {
        return new Runnable() {
            public final void run() {
                boolean z;
                String a;
                if (C42326j.this.f110076b) {
                    if (i == 2 || i == 4) {
                        C42326j.this.f110098h.set(true);
                    }
                    if (!C42326j.this.f110098h.get() || !C42326j.this.f110097g || C40426a.m129285d()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        a = C42326j.this.f110077c.mo103805b();
                    } else {
                        a = C42326j.this.f110077c.mo88162a();
                    }
                    String str = a;
                    C42326j.this.f110096f = System.currentTimeMillis();
                    int[] iArr = z ? new int[]{C35563c.f93254q.getVideoWidth(), C35563c.f93254q.getVideoHeight()} : C42319f.f110087a;
                    C42326j.this.f110098h.set(false);
                    C42326j.this.f110095e.mo55899a(str, iArr[0], iArr[1], C40426a.m129285d(), CompressFormat.JPEG, (C7562b<? super Integer, C7581n>) new C42328k<Object,C7581n>(this, str, i));
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ Object mo103809a(Integer num, String str) throws Exception {
                if (num.intValue() == 0) {
                    C42326j.this.f110075a.addFrameAtLastSegment(str);
                }
                return null;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ C7581n mo103810a(String str, int i, Integer num) {
                int i2;
                int currentTimeMillis = (int) (System.currentTimeMillis() - C42326j.this.f110096f);
                C1592h.m7855a((Callable<TResult>) new C42329l<TResult>(this, num, str), C1592h.f5958b);
                C42326j jVar = C42326j.this;
                Runnable a = C42326j.this.mo103807a(i + 1);
                if (currentTimeMillis > 2000) {
                    i2 = 0;
                } else {
                    i2 = AdError.SERVER_ERROR_CODE - currentTimeMillis;
                }
                jVar.mo103808a(a, i2);
                return C7581n.f20898a;
            }
        };
    }

    public C42326j(C20676a aVar) {
        this.f110095e = aVar;
    }

    /* renamed from: a */
    public final void mo103792a(C42321a aVar) {
        int i;
        super.mo103792a(aVar);
        if (m134573b()) {
            if (this.f110075a != null) {
                i = this.f110075a.getAllFrames().size();
            } else {
                i = 0;
            }
            mo103808a(mo103807a(i), 0);
        }
    }

    /* renamed from: a */
    public final void mo103808a(Runnable runnable, int i) {
        if (this.f110099i == null || this.f110099i.isShutdown()) {
            this.f110099i = C42330m.m134618a();
        }
        this.f110099i.schedule(runnable, (long) i, TimeUnit.MILLISECONDS);
    }
}
