package com.p280ss.android.ugc.aweme.p313im.sdk.module.stranger.p1339a;

import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.C31478i;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.C7007f;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.StrangerSessionList;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C7020e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31868an;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.stranger.a.a */
public final class C31530a extends C25673a<C7020e, StrangerSessionList> {

    /* renamed from: a */
    private long f82537a;

    public final boolean checkParams(Object... objArr) {
        return objArr != null;
    }

    public final List<C7020e> getItems() {
        if (this.mData != null) {
            return C31478i.m102351a(((StrangerSessionList) this.mData).getLastMsg());
        }
        return null;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((StrangerSessionList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        m102502a(0, 20, true);
    }

    public final void loadMoreList(Object... objArr) {
        this.f82537a += 20;
        m102502a(this.f82537a, 20, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(StrangerSessionList strangerSessionList) {
        boolean z;
        if (strangerSessionList == null || C6307b.m19566a((Collection<T>) strangerSessionList.getLastMsg())) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        int i = this.mListQueryType;
        if (i == 1) {
            this.mData = strangerSessionList;
            if (this.mIsNewDataEmpty) {
                C7705c.m23799a().mo20394d(new C7007f());
            }
        } else if (i == 4 && !this.mIsNewDataEmpty) {
            List lastMsg = ((StrangerSessionList) this.mData).getLastMsg();
            lastMsg.addAll(strangerSessionList.getLastMsg());
            ((StrangerSessionList) this.mData).setLastMsg(lastMsg);
            ((StrangerSessionList) this.mData).setHasMore(strangerSessionList.isHasMore());
        }
    }

    /* renamed from: a */
    private void m102502a(long j, long j2, boolean z) {
        C23397p a = C23397p.m76735a();
        C6309f fVar = this.mHandler;
        final long j3 = j;
        C315311 r0 = new Callable(20, true) {
            public final Object call() throws Exception {
                try {
                    return C7077s.m22141a(j3, 20, true);
                } catch (ExecutionException e) {
                    throw C31868an.m103554a(e);
                }
            }
        };
        a.mo60807a(fVar, r0, 0);
    }
}
