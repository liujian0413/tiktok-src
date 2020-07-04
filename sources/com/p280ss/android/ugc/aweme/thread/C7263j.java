package com.p280ss.android.ugc.aweme.thread;

import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.common.utility.p254b.C9714c;
import com.p280ss.android.p294e.p295d.C19544a;
import com.p280ss.android.ugc.aweme.net.C34097q;
import com.p280ss.android.ugc.aweme.thread.C7260i.C7262a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.p350f.C7332a;

/* renamed from: com.ss.android.ugc.aweme.thread.j */
public final class C7263j {

    /* renamed from: a */
    private static final List<String> f20319a = new ArrayList<String>(16) {
        {
            add("com.ss.android.linkselector");
            add("com.ss.android.deviceregister");
            add("com.bytedance.frameworks.plugin");
            add("com.crashlytics.android.core");
        }
    };

    /* renamed from: a */
    private static void m22755a() {
        C7332a.m23028a(C42114k.f109635a);
    }

    /* renamed from: a */
    public static void m22756a(boolean z) {
        m22757b(z);
        C7258h.m22725a((C7245c) new C42115l());
        C34097q.m109768a(C7258h.m22730c());
        C42112e.m134069a();
        C6304f.setExecutorService(C7258h.m22730c());
        C9714c.m28651a(C7258h.m22731d());
        m22755a();
        C19544a.m64412a(C7258h.m22730c());
    }

    /* renamed from: b */
    private static void m22757b(boolean z) {
        long j;
        long j2;
        long j3;
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(ThreadPoolType.IO);
            arrayList.add(ThreadPoolType.DEFAULT);
            arrayList.add(ThreadPoolType.BACKGROUND);
            arrayList.add(ThreadPoolType.SERIAL);
            arrayList.add(ThreadPoolType.FIXED);
        } else {
            arrayList.add(ThreadPoolType.IO);
            arrayList.add(ThreadPoolType.DEFAULT);
            arrayList.add(ThreadPoolType.SERIAL);
            arrayList.add(ThreadPoolType.BACKGROUND);
        }
        C7262a b = C7260i.m22746a().mo18988a(z).mo18987a((List<ThreadPoolType>) arrayList).mo18991b(f20319a);
        if (z) {
            j = TimeUnit.SECONDS.toMillis(1);
        } else {
            j = TimeUnit.MINUTES.toMillis(5);
        }
        C7262a a = b.mo18986a(j);
        if (z) {
            j2 = TimeUnit.SECONDS.toMillis(1);
        } else {
            j2 = TimeUnit.MINUTES.toMillis(5);
        }
        C7262a b2 = a.mo18990b(j2);
        if (z) {
            j3 = TimeUnit.MINUTES.toMillis(1);
        } else {
            j3 = TimeUnit.MINUTES.toMillis(15);
        }
        C7258h.m22726a(b2.mo18992c(j3).mo18989a());
    }
}
