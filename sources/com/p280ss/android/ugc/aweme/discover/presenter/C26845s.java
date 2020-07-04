package com.p280ss.android.ugc.aweme.discover.presenter;

import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.discover.api.SearchApi;
import com.p280ss.android.ugc.aweme.discover.model.SearchUser;
import com.p280ss.android.ugc.aweme.discover.model.SearchUserList;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.presenter.s */
public final class C26845s extends C26826h<SearchUser, SearchUserList> {

    /* renamed from: b */
    public String f70848b;

    /* renamed from: c */
    public String f70849c = "";

    public final int aF_() {
        return 0;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((SearchUserList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo69486a(String str) {
        this.f70849c = str;
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        int i2;
        if (objArr.length >= 4) {
            String str = (String) objArr[1];
            if (isDataEmpty()) {
                i2 = 0;
            } else {
                i2 = ((SearchUserList) this.mData).cursor;
            }
            m88144a(str, i2, 1, 10, this.f70791g, objArr[3].intValue());
            return;
        }
        String str2 = (String) objArr[1];
        if (isDataEmpty()) {
            i = 0;
        } else {
            i = ((SearchUserList) this.mData).cursor;
        }
        m88144a(str2, i, 1, 10, this.f70791g, 0);
    }

    public final void refreshList(Object... objArr) {
        if (objArr.length >= 5) {
            m88144a((String) objArr[1], 0, objArr[2].intValue(), objArr[3].intValue(), "", objArr[4].intValue());
        } else if (objArr.length >= 4) {
            m88144a((String) objArr[1], 0, objArr[2].intValue(), 10, "", objArr[3].intValue());
        } else {
            m88144a((String) objArr[1], 0, objArr[2].intValue(), 10, "", 0);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        if (r7.mData != null) goto L_0x00a3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleData(com.p280ss.android.ugc.aweme.discover.model.SearchUserList r8) {
        /*
            r7 = this;
            super.handleData(r8)
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchUser> r0 = r8.userList
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L_0x0012
            boolean r3 = com.bytedance.common.utility.collection.C6307b.m19566a(r0)
            if (r3 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r3 = 0
            goto L_0x0013
        L_0x0012:
            r3 = 1
        L_0x0013:
            r7.mIsNewDataEmpty = r3
            boolean r3 = r7.mIsNewDataEmpty
            r4 = 4
            if (r3 != 0) goto L_0x0069
            java.util.Iterator r3 = r0.iterator()
        L_0x001e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0032
            java.lang.Object r5 = r3.next()
            com.ss.android.ugc.aweme.discover.model.SearchUser r5 = (com.p280ss.android.ugc.aweme.discover.model.SearchUser) r5
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.user
            java.lang.String r6 = r7.f70790f
            r5.setRequestId(r6)
            goto L_0x001e
        L_0x0032:
            int r3 = r7.mListQueryType
            if (r3 == r2) goto L_0x0058
            if (r3 == r4) goto L_0x0039
            return
        L_0x0039:
            r7.mo69490c(r0)
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r0 = (com.p280ss.android.ugc.aweme.discover.model.SearchUserList) r0
            boolean r3 = r8.hasMore
            if (r3 == 0) goto L_0x004d
            java.lang.Object r3 = r7.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r3 = (com.p280ss.android.ugc.aweme.discover.model.SearchUserList) r3
            boolean r3 = r3.hasMore
            if (r3 == 0) goto L_0x004d
            r1 = 1
        L_0x004d:
            r0.hasMore = r1
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r0 = (com.p280ss.android.ugc.aweme.discover.model.SearchUserList) r0
            int r8 = r8.cursor
            r0.cursor = r8
            return
        L_0x0058:
            r7.mData = r8
            java.lang.Object r8 = r7.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r8 = (com.p280ss.android.ugc.aweme.discover.model.SearchUserList) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.userList = r1
            r7.mo69488b(r0)
            return
        L_0x0069:
            int r0 = r7.mListQueryType
            if (r0 == r2) goto L_0x009a
            if (r0 == r4) goto L_0x0070
            goto L_0x00a9
        L_0x0070:
            java.lang.Object r0 = r7.mData
            if (r0 == 0) goto L_0x00a9
            if (r8 == 0) goto L_0x00a3
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r0 = (com.p280ss.android.ugc.aweme.discover.model.SearchUserList) r0
            boolean r3 = r8.hasMore
            if (r3 == 0) goto L_0x0087
            java.lang.Object r3 = r7.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r3 = (com.p280ss.android.ugc.aweme.discover.model.SearchUserList) r3
            boolean r3 = r3.hasMore
            if (r3 == 0) goto L_0x0087
            r1 = 1
        L_0x0087:
            r0.hasMore = r1
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r0 = (com.p280ss.android.ugc.aweme.discover.model.SearchUserList) r0
            boolean r0 = r0.hasMore
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r0 = (com.p280ss.android.ugc.aweme.discover.model.SearchUserList) r0
            int r8 = r8.cursor
            r0.cursor = r8
            return
        L_0x009a:
            r7.mData = r8
            r7.mo69487b()
            java.lang.Object r8 = r7.mData
            if (r8 == 0) goto L_0x00a9
        L_0x00a3:
            java.lang.Object r8 = r7.mData
            com.ss.android.ugc.aweme.discover.model.SearchUserList r8 = (com.p280ss.android.ugc.aweme.discover.model.SearchUserList) r8
            r8.hasMore = r1
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.presenter.C26845s.handleData(com.ss.android.ugc.aweme.discover.model.SearchUserList):void");
    }

    /* renamed from: a */
    private void m88144a(String str, int i, int i2, int i3, String str2, int i4) {
        final String str3 = str;
        this.f70848b = str3;
        C23397p a = C23397p.m76735a();
        C6309f fVar = this.mHandler;
        final int i5 = i;
        final int i6 = i3;
        final int i7 = i2;
        final String str4 = str2;
        final int i8 = i4;
        C268461 r0 = new Callable() {
            public final Object call() throws Exception {
                return SearchApi.m87308a(str3, (long) i5, i6, i7, C26845s.this.f70789e, C26845s.this.f70849c, str4, i8);
            }
        };
        a.mo60807a(fVar, r0, 0);
    }
}
