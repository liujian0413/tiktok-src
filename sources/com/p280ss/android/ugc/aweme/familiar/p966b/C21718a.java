package com.p280ss.android.ugc.aweme.familiar.p966b;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29367b;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.familiar.b.a */
public final class C21718a {

    /* renamed from: a */
    public static final C21718a f58162a = new C21718a();

    private C21718a() {
    }

    /* renamed from: a */
    public final void mo57995a(Aweme aweme, String str) {
        m72639a(aweme, str, -1);
    }

    /* renamed from: a */
    public static String m72637a(User user) {
        int i;
        if (user != null) {
            i = user.getFollowerCount();
        } else {
            i = 0;
        }
        if (i < 1000) {
            return "below_1000";
        }
        return "above_1000";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        if (r1 == null) goto L_0x0044;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m72639a(com.p280ss.android.ugc.aweme.feed.model.Aweme r3, java.lang.String r4, int r5) {
        /*
            if (r3 == 0) goto L_0x006d
            boolean r0 = r3.isFamiliar()
            r1 = 1
            if (r0 != r1) goto L_0x006c
            boolean r0 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136762a(r3)
            if (r0 == 0) goto L_0x0010
            goto L_0x006c
        L_0x0010:
            com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = "homepage_hot"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "event_type"
            com.ss.android.ugc.aweme.app.g.d r4 = r0.mo59973a(r1, r4)
            java.lang.String r0 = "rec_uid"
            java.lang.String r1 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107205a(r3)
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r0, r1)
            java.lang.String r0 = "req_id"
            java.lang.String r1 = r3.getRequestId()
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r0, r1)
            java.lang.String r0 = "rec_reason"
            com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r1 = r3.getRelationLabel()
            if (r1 == 0) goto L_0x0044
            java.lang.String r1 = r1.getLabelInfo()
            if (r1 != 0) goto L_0x0046
        L_0x0044:
            java.lang.String r1 = ""
        L_0x0046:
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r0, r1)
            java.lang.String r0 = "card_type"
            java.lang.String r1 = "item"
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r0, r1)
            java.lang.String r0 = "group_id"
            java.lang.String r3 = r3.getAid()
            com.ss.android.ugc.aweme.app.g.d r3 = r4.mo59973a(r0, r3)
            r4 = -1
            if (r5 == r4) goto L_0x0064
            java.lang.String r4 = "feed_order"
            r3.mo59970a(r4, r5)
        L_0x0064:
            java.lang.String r4 = "follow_card"
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r3)
            return
        L_0x006c:
            return
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.familiar.p966b.C21718a.m72639a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, int):void");
    }

    /* renamed from: a */
    public static void m72640a(Aweme aweme, String str, String str2) {
        if (aweme != null && aweme.isFamiliar() && !C43122ff.m136762a(aweme)) {
            C6907h.m21524a("follow_from_card", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59973a("previous_page", "homepage_hot").mo59973a("to_user_id", str).mo59973a("log_pb", str2).mo59973a("card_type", "item").mo59973a("group_id", aweme.getAid()).f60753a);
        }
    }

    /* renamed from: a */
    public static void m72641a(Aweme aweme, String str, String str2, String str3, int i) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        C7573i.m23587b(str3, "cardType");
        if (!C43122ff.m136762a(aweme) && (C29367b.m96458a(aweme) || aweme.getAwemeType() == 2)) {
            C6907h.m21524a("follow_card", (Map) C22984d.m75611a().mo59973a("enter_from", "homepage_familiar").mo59973a("event_type", str).mo59973a("rec_uid", C33230ac.m107248w(aweme)).mo59973a("req_id", aweme.getRequestId()).mo59973a("rec_reason", str2).mo59973a("card_type", str3).mo59970a("impr_order", i).f60753a);
        }
    }
}
