package com.p280ss.android.ugc.aweme.challenge.p1084c;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.challenge.data.C23693d;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeList;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.challenge.c.e */
public final class C23676e extends C25673a<Challenge, ChallengeList> {
    /* renamed from: a */
    private void m77622a() {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() {
                return C23693d.m77662a();
            }
        }, 0);
    }

    public final List<Challenge> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((ChallengeList) this.mData).items;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((ChallengeList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        C7213d.m22500a();
    }

    public final void refreshList(Object... objArr) {
        C7213d.m22500a();
        m77622a();
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(ChallengeList challengeList) {
        boolean z;
        if (challengeList == null || C6307b.m19566a((Collection<T>) challengeList.items)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = challengeList;
            } else if (i == 4) {
                ((ChallengeList) this.mData).items.addAll(challengeList.items);
                ((ChallengeList) this.mData).maxCursor = Math.min(((ChallengeList) this.mData).maxCursor, challengeList.maxCursor);
                ((ChallengeList) this.mData).hasMore = ((ChallengeList) this.mData).hasMore;
            }
        } else {
            if (this.mData != null) {
                ((ChallengeList) this.mData).hasMore = false;
            }
        }
    }
}
