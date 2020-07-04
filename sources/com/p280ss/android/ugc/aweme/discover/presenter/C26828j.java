package com.p280ss.android.ugc.aweme.discover.presenter;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.discover.api.SearchApi;
import com.p280ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p280ss.android.ugc.aweme.discover.model.SearchChallengeList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.presenter.j */
public final class C26828j extends C26826h<SearchChallenge, SearchChallengeList> {

    /* renamed from: b */
    public String f70794b;

    public final int aF_() {
        return 2;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((SearchChallengeList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            i = 0;
        } else {
            i = ((SearchChallengeList) this.mData).cursor;
        }
        m88125a(str, i, 1, 20, this.f70791g, objArr[3].intValue());
    }

    public final void refreshList(Object... objArr) {
        if (objArr.length >= 5) {
            m88125a((String) objArr[1], 0, objArr[2].intValue(), objArr[3].intValue(), "", objArr[4].intValue());
            return;
        }
        m88125a((String) objArr[1], 0, objArr[2].intValue(), 20, "", objArr[3].intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchChallengeList searchChallengeList) {
        boolean z;
        super.handleData(searchChallengeList);
        List<SearchChallenge> list = searchChallengeList.challengeList;
        boolean z2 = false;
        if (searchChallengeList == null || C6307b.m19566a((Collection<T>) list)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            for (SearchChallenge searchChallenge : list) {
                if (searchChallenge.getChallenge() != null) {
                    searchChallenge.getChallenge().setRequestId(this.f70790f);
                }
                searchChallenge.setRequestId(searchChallengeList.getRequestId());
            }
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = searchChallengeList;
                ((SearchChallengeList) this.mData).challengeList = new ArrayList();
                mo69488b(list);
            } else if (i == 4) {
                mo69490c(list);
                SearchChallengeList searchChallengeList2 = (SearchChallengeList) this.mData;
                if (searchChallengeList.hasMore && ((SearchChallengeList) this.mData).hasMore) {
                    z2 = true;
                }
                searchChallengeList2.hasMore = z2;
                ((SearchChallengeList) this.mData).cursor = searchChallengeList.cursor;
            }
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchChallengeList;
                mo69487b();
            }
            if (this.mData != null) {
                ((SearchChallengeList) this.mData).hasMore = false;
            }
        }
    }

    /* renamed from: a */
    private void m88125a(String str, int i, int i2, int i3, String str2, int i4) {
        final String str3 = str;
        this.f70794b = str3;
        C23397p a = C23397p.m76735a();
        C6309f fVar = this.mHandler;
        final int i5 = i;
        final int i6 = i3;
        final int i7 = i2;
        final String str4 = str2;
        final int i8 = i4;
        C268291 r0 = new Callable() {
            public final Object call() throws Exception {
                if (TextUtils.isEmpty(str3)) {
                    return SearchApi.m87303a((long) i5, i6);
                }
                return SearchApi.m87304a(str3, (long) i5, i6, i7, C26828j.this.f70789e, str4, i8);
            }
        };
        a.mo60807a(fVar, r0, 0);
    }
}
