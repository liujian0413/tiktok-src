package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.ip */
final class C16621ip<T> implements C16633ja<T> {

    /* renamed from: a */
    private final C16615ij f46475a;

    /* renamed from: b */
    private final C16651js<?, ?> f46476b;

    /* renamed from: c */
    private final boolean f46477c;

    /* renamed from: d */
    private final C16567gu<?> f46478d;

    private C16621ip(C16651js<?, ?> jsVar, C16567gu<?> guVar, C16615ij ijVar) {
        this.f46476b = jsVar;
        this.f46477c = guVar.mo42899a(ijVar);
        this.f46478d = guVar;
        this.f46475a = ijVar;
    }

    /* renamed from: a */
    static <T> C16621ip<T> m54323a(C16651js<?, ?> jsVar, C16567gu<?> guVar, C16615ij ijVar) {
        return new C16621ip<>(jsVar, guVar, ijVar);
    }

    /* renamed from: a */
    public final T mo42991a() {
        return this.f46475a.mo42936k().mo42941c();
    }

    /* renamed from: a */
    public final boolean mo42994a(T t, T t2) {
        if (!this.f46476b.mo43057b(t).equals(this.f46476b.mo43057b(t2))) {
            return false;
        }
        if (this.f46477c) {
            return this.f46478d.mo42893a((Object) t).equals(this.f46478d.mo42893a((Object) t2));
        }
        return true;
    }

    /* renamed from: a */
    public final int mo42990a(T t) {
        int hashCode = this.f46476b.mo43057b(t).hashCode();
        return this.f46477c ? (hashCode * 53) + this.f46478d.mo42893a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: b */
    public final void mo42996b(T t, T t2) {
        C16635jc.m54415a(this.f46476b, t, t2);
        if (this.f46477c) {
            C16635jc.m54413a(this.f46478d, t, t2);
        }
    }

    /* renamed from: a */
    public final void mo42993a(T t, C16675kl klVar) throws IOException {
        Iterator d = this.f46478d.mo42893a((Object) t).mo42906d();
        while (d.hasNext()) {
            Entry entry = (Entry) d.next();
            C16572gz gzVar = (C16572gz) entry.getKey();
            if (gzVar.mo42917c() != zzxx.MESSAGE || gzVar.mo42918d() || gzVar.mo42919e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof C16594hp) {
                klVar.mo42851a(gzVar.mo42913a(), (Object) ((C16594hp) entry).mo42953a().mo42962c());
            } else {
                klVar.mo42851a(gzVar.mo42913a(), entry.getValue());
            }
        }
        C16651js<?, ?> jsVar = this.f46476b;
        jsVar.mo43059b(jsVar.mo43057b(t), klVar);
    }

    /* renamed from: a */
    public final void mo42992a(T t, C16631iz izVar, C16565gt gtVar) throws IOException {
        boolean z;
        C16651js<?, ?> jsVar = this.f46476b;
        C16567gu<?> guVar = this.f46478d;
        Object c = jsVar.mo43061c(t);
        C16570gx b = guVar.mo42900b(t);
        do {
            try {
                if (izVar.mo42801a() == Integer.MAX_VALUE) {
                    jsVar.mo43060b((Object) t, c);
                    return;
                }
                int b2 = izVar.mo42806b();
                if (b2 == 11) {
                    Object obj = null;
                    zzte zzte = null;
                    int i = 0;
                    while (izVar.mo42801a() != Integer.MAX_VALUE) {
                        int b3 = izVar.mo42806b();
                        if (b3 == 16) {
                            i = izVar.mo42834o();
                            obj = guVar.mo42894a(gtVar, this.f46475a, i);
                        } else if (b3 == 26) {
                            if (obj != null) {
                                guVar.mo42896a(izVar, obj, gtVar, b);
                            } else {
                                zzte = izVar.mo42832n();
                            }
                        } else if (!izVar.mo42811c()) {
                            break;
                        }
                    }
                    if (izVar.mo42806b() != 12) {
                        throw zzuv.zzwt();
                    } else if (zzte != null) {
                        if (obj != null) {
                            guVar.mo42898a(zzte, obj, gtVar, b);
                        } else {
                            jsVar.mo43052a(c, i, zzte);
                        }
                    }
                } else if ((b2 & 7) == 2) {
                    Object a = guVar.mo42894a(gtVar, this.f46475a, b2 >>> 3);
                    if (a != null) {
                        guVar.mo42896a(izVar, a, gtVar, b);
                    } else {
                        z = jsVar.mo43056a(c, izVar);
                        continue;
                    }
                } else {
                    z = izVar.mo42811c();
                    continue;
                }
                z = true;
                continue;
            } finally {
                jsVar.mo43060b((Object) t, c);
            }
        } while (z);
    }

    /* renamed from: c */
    public final void mo42997c(T t) {
        this.f46476b.mo43063d(t);
        this.f46478d.mo42901c(t);
    }

    /* renamed from: d */
    public final boolean mo42998d(T t) {
        return this.f46478d.mo42893a((Object) t).mo42909f();
    }

    /* renamed from: b */
    public final int mo42995b(T t) {
        C16651js<?, ?> jsVar = this.f46476b;
        int e = jsVar.mo43064e(jsVar.mo43057b(t)) + 0;
        return this.f46477c ? e + this.f46478d.mo42893a((Object) t).mo42911h() : e;
    }
}
