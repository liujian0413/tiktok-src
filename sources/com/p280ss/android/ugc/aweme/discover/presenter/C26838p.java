package com.p280ss.android.ugc.aweme.discover.presenter;

import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.discover.api.SearchApi;
import com.p280ss.android.ugc.aweme.discover.model.SearchPoi;
import com.p280ss.android.ugc.aweme.discover.model.SearchPoiList;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.presenter.p */
public final class C26838p extends C26826h<SearchPoi, SearchPoiList> {

    /* renamed from: b */
    public String f70829b;

    /* renamed from: c */
    public String f70830c;

    public final int aF_() {
        return 5;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((SearchPoiList) this.mData).hasMore) {
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
            i = ((SearchPoiList) this.mData).cursor;
        }
        m88137a(str, i, 10, objArr[3].doubleValue(), objArr[4].doubleValue(), this.f70791g, objArr[5].intValue());
    }

    public final void refreshList(Object... objArr) {
        m88137a((String) objArr[1], 0, 10, objArr[3].doubleValue(), objArr[4].doubleValue(), "", objArr[5].intValue());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b5, code lost:
        if (r8.mData != null) goto L_0x00b7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleData(com.p280ss.android.ugc.aweme.discover.model.SearchPoiList r9) {
        /*
            r8 = this;
            super.handleData(r9)
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchPoi> r0 = r9.poiList
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L_0x0012
            boolean r3 = com.bytedance.common.utility.collection.C6307b.m19566a(r0)
            if (r3 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r3 = 0
            goto L_0x0013
        L_0x0012:
            r3 = 1
        L_0x0013:
            r8.mIsNewDataEmpty = r3
            boolean r3 = r8.mIsNewDataEmpty
            r4 = 4
            if (r3 != 0) goto L_0x007d
            int r3 = r8.mListQueryType
            if (r3 != r2) goto L_0x002a
            com.ss.android.ugc.aweme.feed.ae r3 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()
            com.ss.android.ugc.aweme.feed.model.LogPbBean r5 = r9.logPb
            java.lang.String r3 = r3.mo71790a(r5)
            r8.f70830c = r3
        L_0x002a:
            java.util.Iterator r3 = r0.iterator()
        L_0x002e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0046
            java.lang.Object r5 = r3.next()
            com.ss.android.ugc.aweme.discover.model.SearchPoi r5 = (com.p280ss.android.ugc.aweme.discover.model.SearchPoi) r5
            com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct r6 = r5.poi
            java.lang.String r7 = r8.f70790f
            r6.setRequestId(r7)
            java.lang.String r6 = r8.f70830c
            r5.logPb = r6
            goto L_0x002e
        L_0x0046:
            int r3 = r8.mListQueryType
            if (r3 == r2) goto L_0x006c
            if (r3 == r4) goto L_0x004d
            return
        L_0x004d:
            r8.mo69490c(r0)
            java.lang.Object r0 = r8.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r0 = (com.p280ss.android.ugc.aweme.discover.model.SearchPoiList) r0
            boolean r3 = r9.hasMore
            if (r3 == 0) goto L_0x0061
            java.lang.Object r3 = r8.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r3 = (com.p280ss.android.ugc.aweme.discover.model.SearchPoiList) r3
            boolean r3 = r3.hasMore
            if (r3 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            r0.hasMore = r1
            java.lang.Object r0 = r8.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r0 = (com.p280ss.android.ugc.aweme.discover.model.SearchPoiList) r0
            int r9 = r9.cursor
            r0.cursor = r9
            return
        L_0x006c:
            r8.mData = r9
            java.lang.Object r9 = r8.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r9 = (com.p280ss.android.ugc.aweme.discover.model.SearchPoiList) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r9.poiList = r1
            r8.mo69488b(r0)
            return
        L_0x007d:
            int r0 = r8.mListQueryType
            if (r0 == r2) goto L_0x00ae
            if (r0 == r4) goto L_0x0084
            goto L_0x00bd
        L_0x0084:
            java.lang.Object r0 = r8.mData
            if (r0 == 0) goto L_0x00bd
            if (r9 == 0) goto L_0x00b7
            java.lang.Object r0 = r8.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r0 = (com.p280ss.android.ugc.aweme.discover.model.SearchPoiList) r0
            boolean r3 = r9.hasMore
            if (r3 == 0) goto L_0x009b
            java.lang.Object r3 = r8.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r3 = (com.p280ss.android.ugc.aweme.discover.model.SearchPoiList) r3
            boolean r3 = r3.hasMore
            if (r3 == 0) goto L_0x009b
            r1 = 1
        L_0x009b:
            r0.hasMore = r1
            java.lang.Object r0 = r8.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r0 = (com.p280ss.android.ugc.aweme.discover.model.SearchPoiList) r0
            boolean r0 = r0.hasMore
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r8.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r0 = (com.p280ss.android.ugc.aweme.discover.model.SearchPoiList) r0
            int r9 = r9.cursor
            r0.cursor = r9
            return
        L_0x00ae:
            r8.mData = r9
            r8.mo69487b()
            java.lang.Object r9 = r8.mData
            if (r9 == 0) goto L_0x00bd
        L_0x00b7:
            java.lang.Object r9 = r8.mData
            com.ss.android.ugc.aweme.discover.model.SearchPoiList r9 = (com.p280ss.android.ugc.aweme.discover.model.SearchPoiList) r9
            r9.hasMore = r1
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.presenter.C26838p.handleData(com.ss.android.ugc.aweme.discover.model.SearchPoiList):void");
    }

    /* renamed from: a */
    private void m88137a(String str, int i, int i2, double d, double d2, String str2, int i3) {
        final String str3 = str;
        this.f70829b = str3;
        C23397p a = C23397p.m76735a();
        C6309f fVar = this.mHandler;
        final int i4 = i;
        final double d3 = d;
        final double d4 = d2;
        final String str4 = str2;
        final int i5 = i3;
        C268391 r0 = new Callable(10) {
            public final Object call() throws Exception {
                return SearchApi.m87307a(str3, (long) i4, 10, C26838p.this.f70789e, d3, d4, str4, i5);
            }
        };
        a.mo60807a(fVar, r0, 0);
    }
}
