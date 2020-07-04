package com.p280ss.android.ugc.aweme.analysis;

import com.p280ss.android.agilelogger.ALog;
import com.p280ss.android.ugc.aweme.framework.p312a.C6923c;

/* renamed from: com.ss.android.ugc.aweme.analysis.a */
public final class C22500a implements C6923c {

    /* renamed from: a */
    private static int f59944a = 52428800;

    /* renamed from: b */
    private static int f59945b = 20971520;

    /* renamed from: c */
    private boolean f59946c;

    /* renamed from: b */
    public final String mo17354b() {
        return "AppLog";
    }

    /* renamed from: a */
    public final boolean mo17353a() {
        return this.f59946c;
    }

    public C22500a(boolean z) {
        this.f59946c = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17350a(android.content.Context r7) {
        /*
            r6 = this;
            java.io.File r0 = com.p280ss.android.ugc.aweme.shortvideo.util.C41564p.m132392e(r7)
            boolean r1 = com.bytedance.storage.C12920c.m37608a()
            if (r1 == 0) goto L_0x0031
            boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r1 == 0) goto L_0x0018
            r1 = 20971520(0x1400000, float:3.526483E-38)
            f59944a = r1
            r1 = 10485760(0xa00000, float:1.469368E-38)
            f59945b = r1
        L_0x0018:
            long r1 = r0.getFreeSpace()
            r3 = 8
            long r1 = r1 / r3
            int r3 = f59944a
            long r3 = (long) r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0031
            int r3 = f59945b
            long r3 = (long) r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0034
            int r1 = f59945b
            long r1 = (long) r1
            goto L_0x0034
        L_0x0031:
            int r1 = f59944a
            long r1 = (long) r1
        L_0x0034:
            com.ss.android.agilelogger.a$a r3 = new com.ss.android.agilelogger.a$a
            android.content.Context r7 = r7.getApplicationContext()
            r3.<init>(r7)
            int r7 = (int) r1
            com.ss.android.agilelogger.a$a r7 = r3.mo50872a(r7)
            r1 = 2097152(0x200000, float:2.938736E-39)
            com.ss.android.agilelogger.a$a r7 = r7.mo50875b(r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r0.getAbsolutePath()
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            com.ss.android.agilelogger.a$a r7 = r7.mo50873a(r0)
            com.ss.android.agilelogger.a r7 = r7.mo50874a()
            java.lang.Class<com.ss.android.ugc.aweme.framework.a.a> r0 = com.p280ss.android.ugc.aweme.framework.p312a.C6921a.class
            java.lang.String r0 = r0.getCanonicalName()
            com.p280ss.android.agilelogger.ALog.m20856a(r0)
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19928c()
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19941q()
            java.lang.String r1 = "local_test"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19941q()
            java.lang.String r1 = "local_test_av"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            r0 = 0
            goto L_0x0083
        L_0x0082:
            r0 = 1
        L_0x0083:
            com.p280ss.android.agilelogger.ALog.m20860a(r0)
            com.ss.android.ugc.aweme.analysis.a$1 r0 = new com.ss.android.ugc.aweme.analysis.a$1
            r0.<init>()
            com.p280ss.android.agilelogger.ALog.m20854a(r0)
            com.p280ss.android.agilelogger.ALog.m20861a(r7)
            com.ss.android.ugc.aweme.analysis.b r7 = new com.ss.android.ugc.aweme.analysis.b
            r7.<init>()
            com.p280ss.p1783b.p1784a.C45771a.m143703a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.analysis.C22500a.mo17350a(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo17352a(String str, Throwable th) {
        ALog.m20864b(str, th);
    }

    /* renamed from: a */
    public final void mo17351a(String str, String str2, Exception exc) {
        ALog.m20863b(str, str2, exc);
    }

    /* renamed from: a */
    public final void mo17349a(int i, String str, String str2) {
        switch (i) {
            case 2:
                ALog.m20857a(str, str2);
                return;
            case 3:
                ALog.m20862b(str, str2);
                return;
            case 4:
                ALog.m20867c(str, str2);
                return;
            case 5:
                ALog.m20869d(str, str2);
                break;
            case 6:
                ALog.m20871e(str, str2);
                return;
        }
    }
}
