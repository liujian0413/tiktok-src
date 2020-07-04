package com.p280ss.android.ugc.aweme.favorites.model;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.favorites.api.MediumApi;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27698c;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27699d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.c */
public final class C27764c extends C25673a<C27699d, C27698c> {

    /* renamed from: com.ss.android.ugc.aweme.favorites.model.c$a */
    static final class C27765a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ int f73208a;

        /* renamed from: b */
        final /* synthetic */ int f73209b;

        C27765a(int i, int i2) {
            this.f73208a = i;
            this.f73209b = i2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C27698c call() {
            return MediumApi.f73165c.mo71204a(this.f73208a, this.f73209b);
        }
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        return true;
    }

    public final List<C27699d> getItems() {
        ArrayList<C27699d> arrayList;
        C27698c cVar = (C27698c) this.mData;
        if (cVar != null) {
            arrayList = cVar.f73009c;
        } else {
            arrayList = null;
        }
        return arrayList;
    }

    public final boolean isHasMore() {
        Integer num;
        C27698c cVar = (C27698c) this.mData;
        if (cVar != null) {
            num = cVar.f73011e;
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    public final void refreshList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        m91020a(0, 10);
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        C7573i.m23587b(objArr, "params");
        C27698c cVar = (C27698c) this.mData;
        if (cVar != null) {
            Integer num = cVar.f73010d;
            if (num != null) {
                i = num.intValue();
                m91020a(i, 10);
            }
        }
        i = 0;
        m91020a(i, 10);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0052  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleData(com.p280ss.android.ugc.aweme.favorites.p1210a.C27698c r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0006
            java.util.ArrayList<com.ss.android.ugc.aweme.favorites.a.d> r1 = r4.f73009c
            goto L_0x0007
        L_0x0006:
            r1 = r0
        L_0x0007:
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.bytedance.common.utility.collection.C6307b.m19566a(r1)
            r3.mIsNewDataEmpty = r1
            boolean r1 = r3.mIsNewDataEmpty
            if (r1 != 0) goto L_0x005d
            int r1 = r3.mListQueryType
            r2 = 1
            if (r1 == r2) goto L_0x0057
            r2 = 4
            if (r1 == r2) goto L_0x001c
            goto L_0x005d
        L_0x001c:
            java.lang.Object r1 = r3.mData
            if (r1 != 0) goto L_0x0023
            r3.mData = r4
            return
        L_0x0023:
            if (r4 == 0) goto L_0x0036
            java.util.ArrayList<com.ss.android.ugc.aweme.favorites.a.d> r1 = r4.f73009c
            if (r1 == 0) goto L_0x0036
            java.lang.Object r2 = r3.mData
            com.ss.android.ugc.aweme.favorites.a.c r2 = (com.p280ss.android.ugc.aweme.favorites.p1210a.C27698c) r2
            java.util.ArrayList<com.ss.android.ugc.aweme.favorites.a.d> r2 = r2.f73009c
            if (r2 == 0) goto L_0x0036
            java.util.Collection r1 = (java.util.Collection) r1
            r2.addAll(r1)
        L_0x0036:
            java.lang.Object r1 = r3.mData
            com.ss.android.ugc.aweme.favorites.a.c r1 = (com.p280ss.android.ugc.aweme.favorites.p1210a.C27698c) r1
            if (r4 == 0) goto L_0x0045
            java.lang.Integer r2 = r4.f73011e
            if (r2 == 0) goto L_0x0045
            int r2 = r2.intValue()
            goto L_0x0046
        L_0x0045:
            r2 = 0
        L_0x0046:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.f73011e = r2
            java.lang.Object r1 = r3.mData
            com.ss.android.ugc.aweme.favorites.a.c r1 = (com.p280ss.android.ugc.aweme.favorites.p1210a.C27698c) r1
            if (r4 == 0) goto L_0x0054
            java.lang.Integer r0 = r4.f73010d
        L_0x0054:
            r1.f73010d = r0
            goto L_0x005d
        L_0x0057:
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r4)
            r3.mData = r4
            return
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.model.C27764c.handleData(com.ss.android.ugc.aweme.favorites.a.c):void");
    }

    /* renamed from: a */
    private final void m91020a(int i, int i2) {
        C23397p.m76735a().mo60807a(this.mHandler, new C27765a(i, 10), 0);
    }
}
