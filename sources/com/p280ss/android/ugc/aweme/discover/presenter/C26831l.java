package com.p280ss.android.ugc.aweme.discover.presenter;

import android.support.p022v4.util.C0901h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.discover.api.SearchApi;
import com.p280ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p280ss.android.ugc.aweme.discover.model.SearchMix;
import com.p280ss.android.ugc.aweme.discover.model.SearchPoi;
import com.p280ss.android.ugc.aweme.discover.model.SearchUser;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.Music;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.presenter.l */
public final class C26831l extends C26826h<Aweme, SearchMix> {

    /* renamed from: b */
    public String f70802b;

    /* renamed from: c */
    private String f70803c;

    public final int aF_() {
        return 3;
    }

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((SearchMix) this.mData).awemeList;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((SearchMix) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        int i2;
        if (objArr.length == 1) {
            String str = this.f70802b;
            if (isDataEmpty()) {
                i2 = 0;
            } else {
                i2 = ((SearchMix) this.mData).cursor;
            }
            m88129a(str, i2, 1, 10, this.f70791g, 1);
            return;
        }
        String str2 = (String) objArr[1];
        if (isDataEmpty()) {
            i = 0;
        } else {
            i = ((SearchMix) this.mData).cursor;
        }
        m88129a(str2, i, 1, 10, this.f70791g, objArr[3].intValue());
    }

    public final void refreshList(Object... objArr) {
        boolean a = C0901h.m3836a(objArr[2], Integer.valueOf(1));
        if (objArr.length == 6) {
            m88128a((String) objArr[1], 0, 10, a, objArr[3].doubleValue(), objArr[4].doubleValue(), "", objArr[5].intValue());
            return;
        }
        m88128a((String) objArr[1], 0, 10, a ? 1 : 0, 0.0d, 0.0d, "", 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchMix searchMix) {
        boolean z;
        int i;
        super.handleData(searchMix);
        boolean z2 = false;
        if (searchMix == null || C6307b.m19566a((Collection<T>) searchMix.awemeList)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (1 == this.mListQueryType) {
                this.f70803c = C28199ae.m92689a().mo71790a(searchMix.logPb);
            }
            if (searchMix.poiList != null) {
                for (SearchPoi searchPoi : searchMix.poiList) {
                    searchPoi.logPb = this.f70803c;
                }
            }
            List<Aweme> list = searchMix.awemeList;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme((Aweme) searchMix.awemeList.get(i2));
                if (this.mData == null || ((SearchMix) this.mData).awemeList == null) {
                    i = 0;
                } else {
                    i = ((SearchMix) this.mData).awemeList.size();
                }
                updateAweme.setRequestId(this.f70790f);
                IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                StringBuilder sb = new StringBuilder();
                sb.append(updateAweme.getAid());
                sb.append(9);
                iRequestIdService.setRequestIdAndIndex(sb.toString(), this.f70790f, i + i2);
                list.set(i2, updateAweme);
            }
            List<SearchUser> list2 = searchMix.users;
            if (!C6307b.m19566a((Collection<T>) list2)) {
                for (SearchUser searchUser : list2) {
                    searchUser.user.setRequestId(this.f70790f);
                }
            }
            List<SearchChallenge> list3 = searchMix.challengeList;
            if (!C6307b.m19566a((Collection<T>) list3)) {
                for (SearchChallenge searchChallenge : list3) {
                    if (searchChallenge.getChallenge() != null) {
                        searchChallenge.getChallenge().setRequestId(this.f70790f);
                    }
                }
            }
            List<Music> list4 = searchMix.musicLists;
            if (!C6307b.m19566a((Collection<T>) list4)) {
                for (Music requestId : list4) {
                    requestId.setRequestId(this.f70790f);
                }
            }
            int i3 = this.mListQueryType;
            if (i3 != 1) {
                if (i3 == 4) {
                    ((SearchMix) this.mData).awemeList.addAll(list);
                    SearchMix searchMix2 = (SearchMix) this.mData;
                    if (searchMix.hasMore && ((SearchMix) this.mData).hasMore) {
                        z2 = true;
                    }
                    searchMix2.hasMore = z2;
                    ((SearchMix) this.mData).cursor = searchMix.cursor;
                }
                return;
            }
            this.mData = searchMix;
            ((SearchMix) this.mData).awemeList = list;
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchMix;
            }
            if (this.mData != null) {
                ((SearchMix) this.mData).hasMore = false;
            }
        }
    }

    /* renamed from: a */
    private void m88129a(String str, int i, int i2, int i3, String str2, int i4) {
        C23397p a = C23397p.m76735a();
        C6309f fVar = this.mHandler;
        final String str3 = str;
        final int i5 = i;
        final String str4 = str2;
        final int i6 = i4;
        C268332 r0 = new Callable(10, 1) {
            public final Object call() throws Exception {
                return SearchApi.m87306a(str3, (long) i5, 10, "general_search", 1, C26831l.this.f70789e, str4, i6);
            }
        };
        a.mo60807a(fVar, r0, 0);
    }

    /* renamed from: a */
    private void m88128a(String str, int i, int i2, int i3, double d, double d2, String str2, int i4) {
        final String str3 = str;
        this.f70802b = str3;
        C23397p a = C23397p.m76735a();
        C6309f fVar = this.mHandler;
        final int i5 = i3;
        final double d3 = d;
        final double d4 = d2;
        final String str4 = str2;
        final int i6 = i4;
        C268321 r0 = new Callable(0, 10) {
            public final Object call() throws Exception {
                return SearchApi.m87305a(str3, (long) 0, 10, i5, C26831l.this.f70789e, d3, d4, str4, i6);
            }
        };
        a.mo60807a(fVar, r0, 0);
    }
}
