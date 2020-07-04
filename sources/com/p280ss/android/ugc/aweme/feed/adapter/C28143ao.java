package com.p280ss.android.ugc.aweme.feed.adapter;

import bolts.C1591g;
import com.p280ss.android.ugc.aweme.friends.api.C30030b;
import com.p280ss.android.ugc.aweme.friends.api.RecommendApi;
import com.p280ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.p280ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34028a;
import com.p280ss.android.ugc.aweme.net.C34089j;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.ao */
public final class C28143ao extends C34028a<SuperAccountList> {

    /* renamed from: a */
    private List<String> f74224a;

    /* renamed from: b */
    private RecommendApi f74225b = C30030b.m98492a();

    /* renamed from: a */
    public final void mo71746a() {
        this.f74225b.recommendSuperAccount().mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
    }

    /* renamed from: a */
    public final int mo71745a(String str) {
        if (this.f74224a != null) {
            return this.f74224a.indexOf(str);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo71747a(User user) {
        if (this.mData != null && !((SuperAccountList) this.mData).getUserList().isEmpty()) {
            List<UserWithAweme> userList = ((SuperAccountList) this.mData).getUserList();
            userList.remove(user);
            ((SuperAccountList) this.mData).userList = userList;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SuperAccountList superAccountList) {
        if (this.mQueryType == 1) {
            super.handleData(superAccountList);
        } else if (this.mQueryType == 4) {
            if (this.mData != null) {
                List<UserWithAweme> userList = ((SuperAccountList) this.mData).getUserList();
                userList.addAll(superAccountList.getUserList());
                this.mData = superAccountList;
                ((SuperAccountList) this.mData).userList = userList;
            } else {
                this.mData = superAccountList;
            }
        }
        if (this.f74224a == null) {
            this.f74224a = new ArrayList();
        } else {
            this.f74224a.clear();
        }
        if (superAccountList != null && superAccountList.getUserList() != null) {
            for (UserWithAweme user : superAccountList.getUserList()) {
                this.f74224a.add(user.getUser().getUid());
            }
        }
    }
}
