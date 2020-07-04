package com.p280ss.android.ugc.aweme.discover.presenter;

import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.discover.abtest.GuideSearchUIOptimization;
import com.p280ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.p280ss.android.ugc.aweme.discover.model.SearchMix;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26612d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.search.filter.C37384a;
import com.p280ss.android.ugc.aweme.search.filter.FilterOption;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.presenter.f */
public final class C26823f extends C26826h<Aweme, SearchMix> {

    /* renamed from: b */
    public String f70776b;

    /* renamed from: c */
    public String f70777c = "video_search";

    public final int aF_() {
        return 4;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((SearchMix) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        if (objArr.length == 1) {
            m88108a(this.f70776b, 0, 0, 10, "", 1, this.f70788d);
            return;
        }
        m88108a((String) objArr[1], 0, objArr[2].intValue(), 10, "", objArr[3].intValue(), (FilterOption) objArr[4]);
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        int i2;
        if (objArr.length == 1) {
            String str = this.f70776b;
            if (isDataEmpty()) {
                i2 = 0;
            } else {
                i2 = ((SearchMix) this.mData).cursor;
            }
            m88108a(str, i2, 1, 10, this.f70791g, 1, this.f70788d);
            return;
        }
        String str2 = (String) objArr[1];
        if (isDataEmpty()) {
            i = 0;
        } else {
            i = ((SearchMix) this.mData).cursor;
        }
        m88108a(str2, i, 1, 10, this.f70791g, objArr[3].intValue(), (FilterOption) objArr[4]);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchMix searchMix) {
        boolean z;
        int i;
        boolean z2 = true;
        if (!(searchMix == null || C10292j.m30480a().mo25012a(GuideSearchUIOptimization.class, "search_new_gs_style", C6384b.m19835a().mo15294c().getSearchNewGsStyle()) != 1 || searchMix.queryCorrectInfo == null)) {
            if (searchMix.guideSearchWordList != null) {
                searchMix.guideSearchWordList.clear();
            }
            if (mo69494g() != null) {
                mo69494g().clear();
            }
        }
        super.handleData(searchMix);
        if (searchMix == null || C6307b.m19566a((Collection<T>) searchMix.awemeList)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
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
            int i3 = this.mListQueryType;
            if (i3 != 1) {
                if (i3 == 4) {
                    mo69490c(list);
                    SearchMix searchMix2 = (SearchMix) this.mData;
                    if (!searchMix.hasMore || !((SearchMix) this.mData).hasMore) {
                        z2 = false;
                    }
                    searchMix2.hasMore = z2;
                    ((SearchMix) this.mData).cursor = searchMix.cursor;
                }
                return;
            }
            this.mData = searchMix;
            mo69488b(list);
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchMix;
                mo69487b();
            }
            if (this.mData != null) {
                ((SearchMix) this.mData).hasMore = false;
            }
        }
    }

    /* renamed from: a */
    private void m88108a(String str, int i, int i2, int i3, String str2, int i4, FilterOption filterOption) {
        final String str3 = str;
        this.f70776b = str3;
        this.f70788d = C37384a.m119984b(filterOption);
        C23397p a = C23397p.m76735a();
        C6309f fVar = this.mHandler;
        final int i5 = i;
        final int i6 = i2;
        final String str4 = str2;
        final int i7 = i4;
        final FilterOption filterOption2 = filterOption;
        C268241 r0 = new Callable(10) {
            public final Object call() throws Exception {
                C26612d.f70187a.mo68301a();
                return SearchApiNew.m87314b().searchFeedList(str3, (long) i5, 10, C26823f.this.f70777c, i6, C26823f.this.f70789e, str4, i7, C37384a.m119983a(filterOption2), C26823f.this.f70788d.getSortType(), C26823f.this.f70788d.getPublishTime()).get();
            }
        };
        a.mo60807a(fVar, r0, 0);
    }
}
