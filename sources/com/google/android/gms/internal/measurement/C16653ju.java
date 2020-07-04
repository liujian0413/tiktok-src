package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ju */
final class C16653ju extends C16651js<C16652jt, C16652jt> {
    C16653ju() {
    }

    /* renamed from: a */
    private static void m54518a(Object obj, C16652jt jtVar) {
        ((C16579hf) obj).zzbyd = jtVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo43063d(Object obj) {
        ((C16579hf) obj).zzbyd.mo43070c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ int mo43065f(Object obj) {
        return ((C16652jt) obj).mo43072e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ int mo43064e(Object obj) {
        return ((C16652jt) obj).mo43071d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Object mo43062c(Object obj, Object obj2) {
        C16652jt jtVar = (C16652jt) obj;
        C16652jt jtVar2 = (C16652jt) obj2;
        if (jtVar2.equals(C16652jt.m54507a())) {
            return jtVar;
        }
        return C16652jt.m54508a(jtVar, jtVar2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo43059b(Object obj, C16675kl klVar) throws IOException {
        ((C16652jt) obj).mo43067a(klVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo43054a(Object obj, C16675kl klVar) throws IOException {
        ((C16652jt) obj).mo43069b(klVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo43060b(Object obj, Object obj2) {
        m54518a(obj, (C16652jt) obj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Object mo43061c(Object obj) {
        C16652jt jtVar = ((C16579hf) obj).zzbyd;
        if (jtVar != C16652jt.m54507a()) {
            return jtVar;
        }
        C16652jt b = C16652jt.m54510b();
        m54518a(obj, b);
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Object mo43057b(Object obj) {
        return ((C16579hf) obj).zzbyd;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo43055a(Object obj, Object obj2) {
        m54518a(obj, (C16652jt) obj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo43049a(Object obj) {
        C16652jt jtVar = (C16652jt) obj;
        jtVar.mo43070c();
        return jtVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo43048a() {
        return C16652jt.m54510b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo43053a(Object obj, int i, Object obj2) {
        ((C16652jt) obj).mo43066a((i << 3) | 3, (Object) (C16652jt) obj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo43052a(Object obj, int i, zzte zzte) {
        ((C16652jt) obj).mo43066a((i << 3) | 2, (Object) zzte);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo43058b(Object obj, int i, long j) {
        ((C16652jt) obj).mo43066a((i << 3) | 1, (Object) Long.valueOf(j));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo43050a(Object obj, int i, int i2) {
        ((C16652jt) obj).mo43066a((i << 3) | 5, (Object) Integer.valueOf(i2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo43051a(Object obj, int i, long j) {
        ((C16652jt) obj).mo43066a(i << 3, (Object) Long.valueOf(j));
    }
}
