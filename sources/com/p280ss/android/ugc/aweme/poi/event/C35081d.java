package com.p280ss.android.ugc.aweme.poi.event;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.event.d */
public final class C35081d {

    /* renamed from: a */
    public final C35082e f91742a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f91742a, (java.lang.Object) ((com.p280ss.android.ugc.aweme.poi.event.C35081d) r2).f91742a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.poi.event.C35081d
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.poi.event.d r2 = (com.p280ss.android.ugc.aweme.poi.event.C35081d) r2
            com.ss.android.ugc.aweme.poi.event.e r0 = r1.f91742a
            com.ss.android.ugc.aweme.poi.event.e r2 = r2.f91742a
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.event.C35081d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C35082e eVar = this.f91742a;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QAUpdateEvent(editedQA=");
        sb.append(this.f91742a);
        sb.append(")");
        return sb.toString();
    }

    public C35081d(C35082e eVar) {
        C7573i.m23587b(eVar, "editedQA");
        this.f91742a = eVar;
    }
}
