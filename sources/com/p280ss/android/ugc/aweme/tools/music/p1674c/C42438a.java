package com.p280ss.android.ugc.aweme.tools.music.p1674c;

import com.google.common.base.C17427g;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.music.c.a */
public final class C42438a implements C17427g<Challenge, AVChallenge> {

    /* renamed from: a */
    public static final C42439a f110335a = new C42439a(null);

    /* renamed from: com.ss.android.ugc.aweme.tools.music.c.a$a */
    public static final class C42439a {
        private C42439a() {
        }

        public /* synthetic */ C42439a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static AVChallenge m134895a(Challenge challenge) {
            if (challenge == null) {
                return null;
            }
            new C42438a();
            return C42438a.m134893a(challenge);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo44914b(Object obj) {
        return m134893a((Challenge) obj);
    }

    /* renamed from: a */
    public static AVChallenge m134893a(Challenge challenge) {
        AVChallenge aVChallenge = new AVChallenge();
        if (challenge == null) {
            C7573i.m23580a();
        }
        aVChallenge.cid = challenge.getCid();
        aVChallenge.challengeName = challenge.getChallengeName();
        aVChallenge.stickerId = challenge.getStickerId();
        aVChallenge.type = challenge.getType();
        aVChallenge.viewCount = challenge.getViewCount();
        aVChallenge.userCount = challenge.getUserCount();
        return aVChallenge;
    }
}
