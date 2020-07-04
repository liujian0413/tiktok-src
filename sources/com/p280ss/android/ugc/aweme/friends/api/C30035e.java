package com.p280ss.android.ugc.aweme.friends.api;

import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.Comparator;

/* renamed from: com.ss.android.ugc.aweme.friends.api.e */
final /* synthetic */ class C30035e implements Comparator {

    /* renamed from: a */
    static final Comparator f79009a = new C30035e();

    private C30035e() {
    }

    public final int compare(Object obj, Object obj2) {
        return SummonFriendApi.m98481a((IMUser) obj, (IMUser) obj2);
    }
}
