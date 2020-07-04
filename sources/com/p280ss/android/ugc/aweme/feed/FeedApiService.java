package com.p280ss.android.ugc.aweme.feed;

import com.p280ss.android.ugc.aweme.feed.api.FeedApi;
import com.p280ss.android.ugc.aweme.feed.cache.C28289e;
import com.p280ss.android.ugc.aweme.feed.cache.IFeedApi;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.feed.netdetector.C28548b;
import com.p280ss.android.ugc.aweme.feed.netdetector.base.BlockHookThrowableWrap;
import com.p280ss.android.ugc.aweme.feed.netdetector.base.C28553b;
import com.p280ss.android.ugc.aweme.feed.netdetector.base.C28554c;

/* renamed from: com.ss.android.ugc.aweme.feed.FeedApiService */
public class FeedApiService implements IFeedApi {
    /* renamed from: a */
    static final /* synthetic */ FeedItemList m91691a(int i, long j, long j2, int i2, Integer num, String str, int i3, int i4, String str2, String str3, String str4, long j3, C28289e eVar) {
        try {
            return FeedApi.m92739a(i, j, j2, i2, num, str, i3, i4, str2, str3, str4, j3, eVar);
        } catch (Throwable th) {
            throw new BlockHookThrowableWrap(th);
        }
    }

    public FeedItemList fetchFeedList(int i, long j, long j2, int i2, Integer num, String str, int i3, int i4, String str2, String str3, String str4, long j3, C28289e eVar) throws Exception {
        long j4 = j;
        long j5 = j2;
        int i5 = i2;
        Integer num2 = num;
        String str5 = str;
        int i6 = i3;
        int i7 = i4;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        long j6 = j3;
        C28289e eVar2 = eVar;
        int i8 = i;
        C28674q qVar = r0;
        C28553b a = C28548b.m93757a(i, i3);
        C28674q qVar2 = new C28674q(i8, j4, j5, i5, num2, str5, i6, i7, str6, str7, str8, j6, eVar2);
        return (FeedItemList) C28554c.m93775a(a, qVar);
    }
}
