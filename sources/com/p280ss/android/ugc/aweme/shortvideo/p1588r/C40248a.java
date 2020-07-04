package com.p280ss.android.ugc.aweme.shortvideo.p1588r;

import com.google.common.base.C17427g;
import com.google.common.collect.C17795bu;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.r.a */
public final class C40248a implements C17427g<Challenge, AVChallenge> {
    /* renamed from: b */
    public final /* synthetic */ Object mo44914b(Object obj) {
        return m128593a((Challenge) obj);
    }

    /* renamed from: a */
    public static ArrayList<AVChallenge> m128594a(List<Challenge> list) {
        return C17795bu.m59144a((Iterable<? extends E>) C17795bu.m59147a(list, (C17427g<? super F, ? extends T>) new C40248a<Object,Object>()));
    }

    /* renamed from: a */
    public static AVChallenge m128593a(Challenge challenge) {
        AVChallenge aVChallenge = new AVChallenge();
        aVChallenge.cid = challenge.getCid();
        aVChallenge.challengeName = challenge.getChallengeName();
        aVChallenge.stickerId = challenge.getStickerId();
        aVChallenge.type = challenge.getType();
        aVChallenge.viewCount = challenge.getViewCount();
        aVChallenge.userCount = challenge.getUserCount();
        return aVChallenge;
    }
}
