package com.p280ss.android.ugc.aweme.commercialize.utils;

import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.android.gms.ads.p742b.C14733a;
import com.google.android.gms.ads.p742b.C14733a.C14734a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C7581n;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ae */
public final class C25223ae {

    /* renamed from: a */
    public static final C25223ae f66543a = new C25223ae();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f66544b = true;

    /* renamed from: c */
    private static boolean f66545c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final AtomicBoolean f66546d = new AtomicBoolean(false);

    /* renamed from: e */
    private static final AtomicBoolean f66547e = new AtomicBoolean(false);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ae$a */
    static final class C25224a<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C25224a f66548a = new C25224a();

        C25224a() {
        }

        public final /* synthetic */ Object call() {
            m82935a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m82935a() {
            boolean z;
            try {
                C25223ae aeVar = C25223ae.f66543a;
                C14734a a = C14733a.m42585a(C6399b.m19921a());
                if (a != null) {
                    z = a.f38080b;
                } else {
                    z = true;
                }
                C25223ae.f66544b = z;
            } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException unused) {
            } catch (Throwable th) {
                C25223ae.f66546d.set(false);
                throw th;
            }
            C25223ae.f66546d.set(false);
        }
    }

    private C25223ae() {
    }

    /* renamed from: a */
    public static final boolean m82934a() {
        if (f66547e.compareAndSet(false, true)) {
            f66545c = !C25371n.m83443a(C6399b.m19921a());
        }
        if (f66545c) {
            return true;
        }
        if (f66546d.compareAndSet(false, true)) {
            C1592h.m7853a((Callable<TResult>) C25224a.f66548a);
        }
        return f66544b;
    }
}
