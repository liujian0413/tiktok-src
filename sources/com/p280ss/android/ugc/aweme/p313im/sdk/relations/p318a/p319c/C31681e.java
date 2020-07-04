package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p319c;

import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.ShareStateResponse;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.ShareStateResponse.ShareUserStruct;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C31742f;
import com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31850a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c.e */
public final class C31681e {

    /* renamed from: a */
    public static final C31681e f82899a = new C31681e();

    /* renamed from: b */
    private static long f82900b = -1;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c.e$a */
    static final class C31682a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ List f82901a;

        C31682a(List list) {
            this.f82901a = list;
        }

        public final /* synthetic */ Object call() {
            m102907a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102907a() {
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            List<IMContact> d = C7525m.m23509d((Collection<? extends T>) this.f82901a);
            if (d.size() > 30) {
                d = d.subList(0, 30);
            }
            for (IMContact iMContact : d) {
                if (iMContact instanceof IMUser) {
                    IMUser iMUser = (IMUser) iMContact;
                    String secUid = iMUser.getSecUid();
                    C7573i.m23582a((Object) secUid, "contact.secUid");
                    arrayList.add(secUid);
                    String uid = iMUser.getUid();
                    C7573i.m23582a((Object) uid, "contact.uid");
                    arrayList2.add(uid);
                }
            }
            List a = C31850a.m103357a().mo82681a(arrayList2, 30, 0, C31850a.m103370i());
            C7573i.m23582a((Object) a, "IMUserDao.inst().findWit…_PAGE_ITEM, 0, condition)");
            List<IMUser> d2 = C7525m.m23509d((Collection<? extends T>) a);
            if (!C6307b.m19566a((Collection<T>) d2)) {
                for (IMUser iMUser2 : d2) {
                    if (!arrayList.contains(iMUser2.getSecUid())) {
                        String secUid2 = iMUser2.getSecUid();
                        C7573i.m23582a((Object) secUid2, "user.secUid");
                        arrayList.add(secUid2);
                    }
                }
            }
            if (arrayList.size() > 30) {
                arrayList = arrayList.subList(0, 30);
            }
            if (arrayList.size() > 0) {
                C7077s.m22162b(C31742f.m103082a(arrayList), C316831.f82902a);
            }
        }
    }

    private C31681e() {
    }

    /* renamed from: a */
    public static final void m102906a(List<IMContact> list) {
        C7573i.m23587b(list, "recentContacts");
        if (System.currentTimeMillis() - f82900b >= 30000) {
            f82900b = System.currentTimeMillis();
            C1592h.m7853a((Callable<TResult>) new C31682a<TResult>(list));
        }
    }

    /* renamed from: a */
    public static void m102905a(ShareStateResponse shareStateResponse) {
        if (shareStateResponse != null) {
            ShareUserStruct[] shareUserStructArr = shareStateResponse.mShareUserStructs;
            if (shareUserStructArr != null) {
                List arrayList = new ArrayList();
                for (ShareUserStruct shareUserStruct : shareUserStructArr) {
                    C7573i.m23582a((Object) shareUserStruct, "shareUserStruct");
                    String userId = shareUserStruct.getUserId();
                    C7573i.m23582a((Object) userId, "shareUserStruct.userId");
                    arrayList.add(userId);
                }
                List<IMUser> a = C31850a.m103357a().mo82680a(arrayList, 30, 0);
                if (!C6307b.m19566a((Collection<T>) a)) {
                    for (ShareUserStruct shareUserStruct2 : shareUserStructArr) {
                        for (IMUser iMUser : a) {
                            C7573i.m23582a((Object) shareUserStruct2, "shareUserStruct");
                            CharSequence userId2 = shareUserStruct2.getUserId();
                            C7573i.m23582a((Object) iMUser, "user");
                            if (TextUtils.equals(userId2, iMUser.getSecUid())) {
                                iMUser.setShareStatus(shareUserStruct2.getShareStatus());
                                if (!(shareUserStruct2.getFollowStatus() == -1 || shareUserStruct2.getFollowStatus() == 0)) {
                                    iMUser.setFollowStatus(shareUserStruct2.getFollowStatus());
                                }
                                C6961d.m21657a().mo18027a(iMUser, iMUser.isHasUnreadStory());
                            }
                        }
                    }
                    C31850a.m103357a();
                    C31850a.m103362b(a);
                }
            }
        }
    }
}
