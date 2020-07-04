package com.p280ss.android.ugc.gamora.recorder;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.p1550b.C38505a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.gamora.recorder.b */
public final class C44461b {
    /* renamed from: a */
    public static final int m140632a(ShortVideoContext shortVideoContext) {
        switch (shortVideoContext.f99766b) {
            case 1:
                return shortVideoContext.f99719X;
            case 2:
                return C38505a.m123085b().shootMode;
            default:
                return -1;
        }
    }

    /* renamed from: b */
    private static final int m140634b(ShortVideoContext shortVideoContext) {
        if (!C6399b.m19946v() || !shortVideoContext.f99745af) {
            return R.string.dci;
        }
        return R.string.dcj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (com.bytedance.ies.ugc.appcontext.C6399b.m19946v() != false) goto L_0x0062;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m140633a(com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext r1, int r2) {
        /*
            boolean r0 = r1.f99765az
            if (r0 == 0) goto L_0x0013
            android.app.Application r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93238a
            r2 = 2131826157(0x7f1115ed, float:1.928519E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "AVEnv.application.getStr…g.record_mode_status_tag)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            return r1
        L_0x0013:
            boolean r0 = r1.f99764ay
            if (r0 == 0) goto L_0x0021
            android.app.Application r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93238a
            r2 = 2131826150(0x7f1115e6, float:1.9285176E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0068
        L_0x0021:
            boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.C38427ad.m122857c()
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.shortvideo.ad r0 = com.p280ss.android.ugc.aweme.shortvideo.C38427ad.f99866a
            boolean r0 = r0.mo96334e()
            if (r0 == 0) goto L_0x0045
            switch(r2) {
                case 10: goto L_0x003b;
                case 11: goto L_0x0037;
                default: goto L_0x0032;
            }
        L_0x0032:
            int r1 = m140634b(r1)
            goto L_0x003e
        L_0x0037:
            r1 = 2131826144(0x7f1115e0, float:1.9285164E38)
            goto L_0x003e
        L_0x003b:
            r1 = 2131826143(0x7f1115df, float:1.9285162E38)
        L_0x003e:
            android.app.Application r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93238a
            java.lang.String r1 = r2.getString(r1)
            goto L_0x0068
        L_0x0045:
            android.app.Application r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93238a
            r2 = 2131826145(0x7f1115e1, float:1.9285166E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0068
        L_0x004f:
            r1 = 2131826154(0x7f1115ea, float:1.9285184E38)
            r0 = 2131826141(0x7f1115dd, float:1.9285158E38)
            switch(r2) {
                case 0: goto L_0x005f;
                case 1: goto L_0x0062;
                default: goto L_0x0058;
            }
        L_0x0058:
            boolean r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()
            if (r2 == 0) goto L_0x005f
            goto L_0x0062
        L_0x005f:
            r1 = 2131826141(0x7f1115dd, float:1.9285158E38)
        L_0x0062:
            android.app.Application r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93238a
            java.lang.String r1 = r2.getString(r1)
        L_0x0068:
            java.lang.String r2 = "if (shortVideoContext.mT…g(tagRes)\n        }\n    }"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.recorder.C44461b.m140633a(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, int):java.lang.String");
    }
}
