package com.p280ss.android.ugc.aweme.discover.presenter;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.discover.api.SearchApi;
import com.p280ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p280ss.android.ugc.aweme.discover.model.SearchMusicList;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26612d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.presenter.n */
public final class C26835n extends C26826h<SearchMusic, SearchMusicList> {

    /* renamed from: b */
    public String f70821b;

    public final int aF_() {
        return 1;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((SearchMusicList) this.mData).hasMore) {
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
            i = ((SearchMusicList) this.mData).cursor;
        }
        m88134a(str, i, 1, 20, this.f70791g, objArr[3].intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchMusicList searchMusicList) {
        boolean z;
        super.handleData(searchMusicList);
        List<SearchMusic> list = searchMusicList.searchMusicList;
        boolean z2 = false;
        if (searchMusicList == null || C6307b.m19566a((Collection<T>) list)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            for (SearchMusic requestId : list) {
                requestId.setRequestId(this.f70790f);
            }
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = searchMusicList;
                ((SearchMusicList) this.mData).musicList = new ArrayList();
                mo69488b(list);
            } else if (i == 4) {
                mo69490c(list);
                SearchMusicList searchMusicList2 = (SearchMusicList) this.mData;
                if (searchMusicList.hasMore && ((SearchMusicList) this.mData).hasMore) {
                    z2 = true;
                }
                searchMusicList2.hasMore = z2;
                ((SearchMusicList) this.mData).cursor = searchMusicList.cursor;
            }
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchMusicList;
                mo69487b();
            }
            if (this.mData != null) {
                ((SearchMusicList) this.mData).hasMore = false;
            }
        }
    }

    public final void refreshList(Object... objArr) {
        C26612d.f70187a.mo68301a();
        if (objArr.length >= 5) {
            m88134a((String) objArr[1], 0, objArr[2].intValue(), objArr[3].intValue(), "", objArr[4].intValue());
            return;
        }
        m88134a((String) objArr[1], 0, objArr[2].intValue(), 20, "", objArr[3].intValue());
    }

    /* renamed from: a */
    private void m88134a(String str, int i, int i2, int i3, String str2, int i4) {
        final String str3 = str;
        this.f70821b = str3;
        C23397p a = C23397p.m76735a();
        C6309f fVar = this.mHandler;
        final int i5 = i;
        final int i6 = i3;
        final int i7 = i2;
        final String str4 = str2;
        final int i8 = i4;
        C268361 r0 = new Callable() {
            public final Object call() throws Exception {
                if (TextUtils.isEmpty(str3)) {
                    return SearchApi.m87309b((long) i5, i6);
                }
                return SearchApi.m87310b(str3, (long) i5, i6, i7, C26835n.this.f70789e, str4, i8);
            }
        };
        a.mo60807a(fVar, r0, 0);
    }
}
