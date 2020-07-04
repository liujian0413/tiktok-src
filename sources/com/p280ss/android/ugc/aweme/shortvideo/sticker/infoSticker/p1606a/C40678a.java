package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.p1606a;

import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43755e;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.a.a */
public final class C40678a implements C43755e {

    /* renamed from: a */
    private long f105789a;

    /* renamed from: b */
    private final String f105790b;

    /* renamed from: c */
    private final C43755e f105791c;

    /* renamed from: b */
    public final void mo9282b(Effect effect) {
        this.f105789a = System.currentTimeMillis();
        C43755e eVar = this.f105791c;
        if (eVar != null) {
            eVar.mo9282b(effect);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (r3 == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r3 == null) goto L_0x0050;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9280a(com.p280ss.android.ugc.effectmanager.effect.model.Effect r9) {
        /*
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r8.f105789a
            long r0 = r0 - r2
            java.lang.String r2 = r8.f105790b
            com.ss.android.ugc.aweme.app.g.c r3 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21381a()
            java.lang.String r4 = "url"
            com.ss.android.ugc.aweme.port.in.n r5 = com.p280ss.android.ugc.aweme.port.p1479in.C35574k.m114859a()
            com.google.gson.e r5 = r5.mo70085S()
            r6 = 0
            if (r9 == 0) goto L_0x001f
            com.ss.android.ugc.effectmanager.common.model.UrlModel r7 = r9.getFileUrl()
            goto L_0x0020
        L_0x001f:
            r7 = r6
        L_0x0020:
            java.lang.String r5 = r5.mo15979b(r7)
            if (r5 != 0) goto L_0x0028
            java.lang.String r5 = ""
        L_0x0028:
            com.ss.android.ugc.aweme.app.g.c r3 = r3.mo16887a(r4, r5)
            java.lang.String r4 = "duration"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.app.g.c r0 = r3.mo16887a(r4, r0)
            java.lang.String r1 = "effect_id"
            if (r9 == 0) goto L_0x0040
            java.lang.String r3 = r9.getEffectId()
            if (r3 != 0) goto L_0x0042
        L_0x0040:
            java.lang.String r3 = ""
        L_0x0042:
            com.ss.android.ugc.aweme.app.g.c r0 = r0.mo16887a(r1, r3)
            java.lang.String r1 = "effect_name"
            if (r9 == 0) goto L_0x0050
            java.lang.String r3 = r9.getName()
            if (r3 != 0) goto L_0x0052
        L_0x0050:
            java.lang.String r3 = ""
        L_0x0052:
            com.ss.android.ugc.aweme.app.g.c r0 = r0.mo16887a(r1, r3)
            java.lang.String r1 = "effect_type"
            if (r9 == 0) goto L_0x0062
            int r3 = r9.getEffectType()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
        L_0x0062:
            com.ss.android.ugc.aweme.app.g.c r0 = r0.mo16885a(r1, r6)
            org.json.JSONObject r0 = r0.mo16888b()
            r1 = 0
            com.p280ss.android.ugc.aweme.base.C6893q.m21444a(r2, r1, r0)
            com.ss.android.ugc.effectmanager.effect.b.e r0 = r8.f105791c
            if (r0 == 0) goto L_0x0076
            r0.mo9280a(r9)
            return
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.p1606a.C40678a.mo9280a(com.ss.android.ugc.effectmanager.effect.model.Effect):void");
    }

    public C40678a(String str, C43755e eVar) {
        C7573i.m23587b(str, "serviceName");
        this.f105790b = str;
        this.f105791c = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r3 == null) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r3 == null) goto L_0x0025;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9281a(com.p280ss.android.ugc.effectmanager.effect.model.Effect r6, com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c r7) {
        /*
            r5 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.C7573i.m23587b(r7, r0)
            java.lang.String r0 = r5.f105790b
            com.ss.android.ugc.aweme.app.g.c r1 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21381a()
            java.lang.String r2 = "effect_id"
            if (r6 == 0) goto L_0x0015
            java.lang.String r3 = r6.getEffectId()
            if (r3 != 0) goto L_0x0017
        L_0x0015:
            java.lang.String r3 = ""
        L_0x0017:
            com.ss.android.ugc.aweme.app.g.c r1 = r1.mo16887a(r2, r3)
            java.lang.String r2 = "effect_name"
            if (r6 == 0) goto L_0x0025
            java.lang.String r3 = r6.getName()
            if (r3 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r3 = ""
        L_0x0027:
            com.ss.android.ugc.aweme.app.g.c r1 = r1.mo16887a(r2, r3)
            java.lang.String r2 = "effect_type"
            if (r6 == 0) goto L_0x0038
            int r3 = r6.getEffectType()
        L_0x0033:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x003a
        L_0x0038:
            r3 = -1
            goto L_0x0033
        L_0x003a:
            com.ss.android.ugc.aweme.app.g.c r1 = r1.mo16885a(r2, r3)
            java.lang.String r2 = "url"
            com.ss.android.ugc.aweme.port.in.n r3 = com.p280ss.android.ugc.aweme.port.p1479in.C35574k.m114859a()
            com.google.gson.e r3 = r3.mo70085S()
            if (r6 == 0) goto L_0x004f
            com.ss.android.ugc.effectmanager.common.model.UrlModel r4 = r6.getFileUrl()
            goto L_0x0050
        L_0x004f:
            r4 = 0
        L_0x0050:
            java.lang.String r3 = r3.mo15979b(r4)
            if (r3 != 0) goto L_0x0058
            java.lang.String r3 = ""
        L_0x0058:
            com.ss.android.ugc.aweme.app.g.c r1 = r1.mo16887a(r2, r3)
            java.lang.String r2 = "exception"
            java.lang.Exception r3 = r7.f113222c
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.String r3 = android.util.Log.getStackTraceString(r3)
            com.ss.android.ugc.aweme.app.g.c r1 = r1.mo16887a(r2, r3)
            java.lang.String r2 = "errorCode"
            int r3 = r7.f113220a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.ss.android.ugc.aweme.app.g.c r1 = r1.mo16885a(r2, r3)
            java.lang.String r2 = "errorMsg"
            java.lang.String r3 = r7.f113221b
            com.ss.android.ugc.aweme.app.g.c r1 = r1.mo16887a(r2, r3)
            org.json.JSONObject r1 = r1.mo16888b()
            r2 = 1
            com.p280ss.android.ugc.aweme.base.C6893q.m21444a(r0, r2, r1)
            com.ss.android.ugc.effectmanager.effect.b.e r0 = r5.f105791c
            if (r0 == 0) goto L_0x008e
            r0.mo9281a(r6, r7)
            return
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.p1606a.C40678a.mo9281a(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.effectmanager.common.d.c):void");
    }

    /* renamed from: a */
    public final void mo70696a(Effect effect, int i, long j) {
        C43755e eVar = this.f105791c;
        if (eVar != null) {
            eVar.mo70696a(effect, i, j);
        }
    }
}
