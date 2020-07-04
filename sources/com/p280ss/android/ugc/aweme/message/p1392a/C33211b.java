package com.p280ss.android.ugc.aweme.message.p1392a;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.message.api.MultiUserNoticeApi;
import com.p280ss.android.ugc.aweme.message.model.MultiUserNoticeCountResponse;
import com.p280ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.p280ss.android.ugc.aweme.notice.api.bean.NoticeList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.message.a.b */
public class C33211b {

    /* renamed from: a */
    private static C33211b f86421a;

    /* renamed from: b */
    private HashMap<Long, Integer> f86422b = new HashMap<>();

    /* renamed from: a */
    private static boolean m107128a(int i) {
        return i == 3 || i == 7 || i == 6 || i == 2;
    }

    /* renamed from: a */
    public static C33211b m107126a() {
        if (f86421a == null) {
            synchronized (C33211b.class) {
                if (f86421a == null) {
                    f86421a = new C33211b();
                }
            }
        }
        return f86421a;
    }

    /* renamed from: a */
    public final int mo84995a(String str) {
        try {
            return m107125a(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private int m107125a(long j) {
        Integer num = (Integer) this.f86422b.get(Long.valueOf(j));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: a */
    private void m107127a(MultiUserNoticeCountResponse multiUserNoticeCountResponse) {
        if (multiUserNoticeCountResponse != null && !C6307b.m19566a((Collection<T>) multiUserNoticeCountResponse.noticeLists)) {
            this.f86422b.clear();
            for (NoticeList noticeList : multiUserNoticeCountResponse.noticeLists) {
                int i = 0;
                for (NoticeCount noticeCount : noticeList.getItems()) {
                    if (m107128a(noticeCount.getGroup())) {
                        i += noticeCount.getCount();
                    }
                }
                this.f86422b.put(noticeList.getUserId(), Integer.valueOf(i));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo84996a(C1592h hVar) throws Exception {
        if (hVar != null && hVar.mo6882b()) {
            m107127a((MultiUserNoticeCountResponse) hVar.mo6890e());
        }
        return null;
    }

    /* renamed from: a */
    public final void mo84997a(List<String> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            MultiUserNoticeApi.m107163a(list).mo6876a((C1591g<TResult, TContinuationResult>) new C33212c<TResult,TContinuationResult>(this), (Executor) C1592h.f5957a);
        }
    }
}
