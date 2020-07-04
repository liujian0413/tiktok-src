package com.p280ss.android.ugc.aweme.poi.search;

import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.poi.api.POIApiManager;
import com.p280ss.android.ugc.aweme.poi.model.C35126o;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.poi.search.m */
public final class C35243m extends C25673a<PoiStruct, C35126o> {

    /* renamed from: a */
    public String f92307a;

    /* renamed from: b */
    public String f92308b;

    /* renamed from: c */
    private String f92309c;

    /* renamed from: d */
    private String f92310d;

    /* renamed from: e */
    private int f92311e;

    /* renamed from: f */
    private String f92312f;

    /* renamed from: a */
    public final PoiStruct mo89708a() {
        if (this.mData == null) {
            return null;
        }
        return ((C35126o) this.mData).f91886d;
    }

    public final List<PoiStruct> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C35126o) this.mData).f91883a;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((C35126o) this.mData).f91884b) {
            return false;
        }
        return true;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || (objArr.length != 6 && objArr.length != 1)) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        String str = this.f92307a;
        String str2 = this.f92309c;
        String str3 = this.f92310d;
        int i2 = this.f92311e;
        if (isDataEmpty()) {
            i = 0;
        } else {
            i = ((C35126o) this.mData).f91885c;
        }
        m113700a(str, str2, str3, i2, i, 20, 0, this.f92312f);
    }

    public final void refreshList(Object... objArr) {
        this.f92307a = objArr[1];
        this.f92309c = String.valueOf(objArr[2]);
        this.f92310d = String.valueOf(objArr[3]);
        this.f92311e = objArr[4].intValue();
        this.f92312f = String.valueOf(objArr[5]);
        m113700a((String) objArr[1], (String) objArr[2], (String) objArr[3], objArr[4].intValue(), 1, 20, 1, this.f92312f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C35126o oVar) {
        boolean z = true;
        if (oVar != null && this.mListQueryType == 1) {
            this.f92308b = C28199ae.m92689a().mo71790a(oVar.f91887e);
        }
        if (oVar != null) {
            if (oVar.f91883a != null) {
                for (PoiStruct put : oVar.f91883a) {
                    put.put(POIService.KEY_LOGPB, this.f92308b);
                }
            }
            if (oVar.f91886d != null) {
                oVar.f91886d.put(POIService.KEY_LOGPB, this.f92308b);
            }
        }
        int i = this.mListQueryType;
        if (i != 1) {
            if (i == 4 && this.mData != null) {
                if (oVar != null && !C6307b.m19566a((Collection<T>) oVar.f91883a)) {
                    z = false;
                }
                this.mIsNewDataEmpty = z;
                if (this.mIsNewDataEmpty) {
                    ((C35126o) this.mData).f91884b = false;
                    return;
                }
                ((C35126o) this.mData).f91883a.addAll(oVar.f91883a);
                ((C35126o) this.mData).f91884b = oVar.f91884b;
                ((C35126o) this.mData).f91885c = oVar.f91885c;
            } else {
                return;
            }
            return;
        }
        this.mData = oVar;
    }

    /* renamed from: a */
    private void m113700a(String str, String str2, String str3, int i, int i2, int i3, int i4, String str4) {
        C23397p a = C23397p.m76735a();
        C6309f fVar = this.mHandler;
        final String str5 = str;
        final String str6 = str2;
        final String str7 = str3;
        final int i5 = i;
        final int i6 = i2;
        final int i7 = i4;
        final String str8 = str4;
        C352441 r1 = new Callable(20) {
            public final Object call() throws Exception {
                return POIApiManager.m113160a(str5, str6, str7, i5, i6, 20, i7, str8);
            }
        };
        a.mo60807a(fVar, r1, 0);
    }
}
