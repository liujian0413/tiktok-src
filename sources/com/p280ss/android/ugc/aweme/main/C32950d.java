package com.p280ss.android.ugc.aweme.main;

import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.audio.AudioUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.main.d */
public final class C32950d {

    /* renamed from: a */
    public static final C32950d f85898a = new C32950d();

    /* renamed from: com.ss.android.ugc.aweme.main.d$a */
    static final class C32951a<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ String f85899a;

        C32951a(String str) {
            this.f85899a = str;
        }

        public final /* synthetic */ Object call() {
            m106525a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m106525a() {
            String str;
            if (AudioUtils.m75903e(C6399b.m19921a())) {
                str = "on";
            } else {
                str = "off";
            }
            C6907h.m21524a("earphone_status", (Map) C22984d.m75611a().mo59973a("plugin_type", this.f85899a).mo59973a("to_status", str).f60753a);
        }
    }

    private C32950d() {
    }

    /* renamed from: a */
    public static final void m106523a(String str) {
        C7573i.m23587b(str, "pluginType");
        C1592h.m7855a((Callable<TResult>) new C32951a<TResult>(str), (Executor) C6907h.m21516a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r5 == null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r1 == null) goto L_0x0020;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m106524a(java.lang.String r3, java.lang.String r4, com.p280ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            java.lang.String r0 = "earphone_unplug"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "video_status"
            com.ss.android.ugc.aweme.app.g.d r3 = r1.mo59973a(r2, r3)
            java.lang.String r1 = "enter_from"
            if (r4 != 0) goto L_0x0012
            java.lang.String r4 = ""
        L_0x0012:
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r1, r4)
            java.lang.String r4 = "group_id"
            if (r5 == 0) goto L_0x0020
            java.lang.String r1 = r5.getAid()
            if (r1 != 0) goto L_0x0022
        L_0x0020:
            java.lang.String r1 = ""
        L_0x0022:
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r1)
            java.lang.String r4 = "author_id"
            if (r5 == 0) goto L_0x0030
            java.lang.String r5 = r5.getAuthorUid()
            if (r5 != 0) goto L_0x0032
        L_0x0030:
            java.lang.String r5 = ""
        L_0x0032:
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.main.C32950d.m106524a(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
