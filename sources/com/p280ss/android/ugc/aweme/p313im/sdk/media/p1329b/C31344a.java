package com.p280ss.android.ugc.aweme.p313im.sdk.media.p1329b;

import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService.CompileParam;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService.CompileResult;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.b.a */
public final class C31344a {

    /* renamed from: a */
    public final CompileParam f82128a;

    /* renamed from: b */
    public final C7562b<CompileResult, C7581n> f82129b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f82129b, (java.lang.Object) r3.f82129b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.p313im.sdk.media.p1329b.C31344a
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.im.sdk.media.b.a r3 = (com.p280ss.android.ugc.aweme.p313im.sdk.media.p1329b.C31344a) r3
            com.ss.android.ugc.aweme.services.video.IImVideoCompileService$CompileParam r0 = r2.f82128a
            com.ss.android.ugc.aweme.services.video.IImVideoCompileService$CompileParam r1 = r3.f82128a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            kotlin.jvm.a.b<com.ss.android.ugc.aweme.services.video.IImVideoCompileService$CompileResult, kotlin.n> r0 = r2.f82129b
            kotlin.jvm.a.b<com.ss.android.ugc.aweme.services.video.IImVideoCompileService$CompileResult, kotlin.n> r3 = r3.f82129b
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.media.p1329b.C31344a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        CompileParam compileParam = this.f82128a;
        int i = 0;
        int hashCode = (compileParam != null ? compileParam.hashCode() : 0) * 31;
        C7562b<CompileResult, C7581n> bVar = this.f82129b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompileTask(compileParam=");
        sb.append(this.f82128a);
        sb.append(", callback=");
        sb.append(this.f82129b);
        sb.append(")");
        return sb.toString();
    }

    public C31344a(CompileParam compileParam, C7562b<? super CompileResult, C7581n> bVar) {
        C7573i.m23587b(compileParam, "compileParam");
        C7573i.m23587b(bVar, "callback");
        this.f82128a = compileParam;
        this.f82129b = bVar;
    }
}
