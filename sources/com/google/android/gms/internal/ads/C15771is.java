package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.C14793ay;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.is */
public final class C15771is implements blv {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile C15763ik f44519a;

    /* renamed from: b */
    private final Context f44520b;

    public C15771is(Context context) {
        this.f44520b = context;
    }

    /* renamed from: a */
    public final bor mo39236a(bqk<?> bqk) throws zzae {
        zzaju a = zzaju.m52662a(bqk);
        long b = C14793ay.m42901g().mo38685b();
        try {
            agu agu = new agu();
            this.f44519a = new C15763ik(this.f44520b, C14793ay.m42908n().mo39258a(), new C15775iw(this, agu), new C15776ix(this, agu));
            this.f44519a.mo38565l();
            agj a2 = afy.m45818a(afy.m45819a((agj<A>) agu, (aft<? super A, ? extends B>) new C15772it<Object,Object>(this, a), (Executor) acj.f39998a), (long) ((Integer) bym.m50299d().mo41272a(C15585bw.f43904cs)).intValue(), TimeUnit.MILLISECONDS, acj.f40000c);
            a2.mo39308a(new C15774iv(this), acj.f39998a);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) a2.get();
            long b2 = C14793ay.m42901g().mo38685b() - b;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(b2);
            sb.append("ms");
            acd.m45438a(sb.toString());
            zzajw zzajw = (zzajw) new zzaxu(parcelFileDescriptor).mo42176a(zzajw.CREATOR);
            if (zzajw == null) {
                return null;
            }
            if (zzajw.f45517a) {
                throw new zzae(zzajw.f45518b);
            } else if (zzajw.f45521e.length != zzajw.f45522f.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                for (int i = 0; i < zzajw.f45521e.length; i++) {
                    hashMap.put(zzajw.f45521e[i], zzajw.f45522f[i]);
                }
                bor bor = new bor(zzajw.f45519c, zzajw.f45520d, (Map<String, String>) hashMap, zzajw.f45523g, zzajw.f45524h);
                return bor;
            }
        } catch (InterruptedException | ExecutionException unused) {
            long b3 = C14793ay.m42901g().mo38685b() - b;
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(b3);
            sb2.append("ms");
            acd.m45438a(sb2.toString());
            return null;
        } catch (Throwable th) {
            long b4 = C14793ay.m42901g().mo38685b() - b;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(b4);
            sb3.append("ms");
            acd.m45438a(sb3.toString());
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m51090a() {
        if (this.f44519a != null) {
            this.f44519a.mo38559f();
            Binder.flushPendingCommands();
        }
    }
}
