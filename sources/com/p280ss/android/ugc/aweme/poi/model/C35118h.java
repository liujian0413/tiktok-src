package com.p280ss.android.ugc.aweme.poi.model;

import android.os.Message;
import bolts.C1591g;
import bolts.C1592h;
import bolts.C1606i;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26098c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.newfollow.model.C34146c;
import com.p280ss.android.ugc.aweme.poi.C35086h;
import com.p280ss.android.ugc.aweme.poi.api.PoiFeedApi;
import com.p280ss.android.ugc.aweme.poi.utils.C35456o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.poi.model.h */
public class C35118h extends C26098c<C34145b, C34146c> implements Cloneable {

    /* renamed from: h */
    public static final PoiFeedApi f91861h = ((PoiFeedApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(PoiFeedApi.class));

    /* renamed from: b */
    protected int f91862b;

    /* renamed from: c */
    protected String f91863c;

    /* renamed from: d */
    protected String f91864d;

    /* renamed from: e */
    protected String f91865e;

    /* renamed from: f */
    protected String f91866f;

    /* renamed from: g */
    protected String f91867g;

    /* renamed from: i */
    private boolean f91868i = true;

    public boolean checkParams(Object... objArr) {
        return true;
    }

    /* renamed from: b */
    protected static String m113316b() {
        return String.valueOf(System.currentTimeMillis());
    }

    /* renamed from: d */
    public final PoiCouponActivityStruct mo89412d() {
        PoiQRDetailStruct c = mo89409c();
        if (c != null) {
            return c.getActivity();
        }
        return null;
    }

    public List<C34145b> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C34146c) this.mData).f88979a;
    }

    public boolean isDataEmpty() {
        if (super.isDataEmpty() || this.f91868i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private int mo57985a() {
        switch (this.f91862b) {
            case 65440:
                return 1;
            case 65441:
                return 2;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C35118h clone() {
        try {
            C35118h hVar = (C35118h) super.clone();
            hVar.mData = ((C34146c) this.mData).clone();
            return hVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final PoiQRDetailStruct mo89409c() {
        List items = getItems();
        if (!C6307b.m19566a((Collection<T>) items)) {
            C34145b bVar = (C34145b) items.get(0);
            if (bVar instanceof PoiDetail) {
                return ((PoiDetail) bVar).getPoiActivityResponse();
            }
        }
        return null;
    }

    public boolean isHasMore() {
        if (this.mData == null || !((C34146c) this.mData).mo86838a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C35118h mo89406a(String str) {
        this.f91864d = str;
        return this;
    }

    /* renamed from: b */
    public final C35118h mo89408b(String str) {
        this.f91865e = str;
        return this;
    }

    /* renamed from: c */
    public final C35118h mo89410c(String str) {
        this.f91866f = str;
        return this;
    }

    /* renamed from: d */
    public final C35118h mo89413d(String str) {
        this.f91867g = str;
        return this;
    }

    public C35118h(int i) {
        this.f91862b = i;
    }

    public void loadMoreList(Object... objArr) {
        if (m113315a(2, objArr)) {
            String b = m113316b();
            this.f91863c = b;
            C35086h hVar = objArr[1];
            m113312a(hVar.f91750a, hVar.f91759j, b, hVar.f91760k, hVar.f91753d, hVar.f91754e, hVar.f91752c);
        }
    }

    public void refreshList(Object... objArr) {
        if (m113315a(2, objArr)) {
            C35086h hVar = objArr[1];
            m113313a(hVar.f91750a, hVar.f91759j, hVar.f91754e, hVar.f91753d, hVar.f91755f, hVar.f91761l, (int) hVar.f91758i, hVar.f91752c, hVar.f91756g, hVar.f91757h);
        }
    }

    /* renamed from: a */
    private void m113314a(Object... objArr) {
        if (m113315a(2, objArr)) {
            if (this.mData != null) {
                ((C34146c) this.mData).f88981c = 0;
                if (!C6307b.m19566a((Collection<T>) ((C34146c) this.mData).f88979a)) {
                    ArrayList arrayList = new ArrayList();
                    for (C34145b bVar : ((C34146c) this.mData).f88979a) {
                        if (bVar instanceof PoiDetail) {
                            arrayList.add(bVar);
                        }
                    }
                    ((C34146c) this.mData).f88979a.clear();
                    ((C34146c) this.mData).f88979a.addAll(arrayList);
                }
            }
            String b = m113316b();
            this.f91863c = b;
            C35086h hVar = objArr[1];
            m113312a(hVar.f91750a, hVar.f91759j, b, hVar.f91760k, hVar.f91753d, hVar.f91754e, hVar.f91752c);
        }
    }

    public boolean sendRequest(Object... objArr) {
        if (!checkParams(objArr)) {
            return false;
        }
        this.mIsLoading = true;
        if (isDataEmpty()) {
            this.mListQueryType = 1;
        } else {
            this.mListQueryType = objArr[0].intValue();
        }
        switch (this.mListQueryType) {
            case 1:
                refreshList(objArr);
                break;
            case 2:
                loadLatestList(objArr);
                break;
            case 4:
                loadMoreList(objArr);
                break;
            case 5:
                m113314a(objArr);
                break;
        }
        return true;
    }

    public void handleMsg(Message message) {
        if (message.what != 65282) {
            if (message.obj instanceof C34146c) {
                C34146c cVar = (C34146c) message.obj;
                if (C6319n.m19593a(this.f91863c) || this.f91863c.equalsIgnoreCase(cVar.f88985g)) {
                    this.mIsLoading = false;
                    if (cVar.f88986h != null) {
                        if (this.mNotifyListeners != null) {
                            for (C25678f a : this.mNotifyListeners) {
                                a.mo57296a(cVar.f88986h);
                            }
                        }
                        return;
                    }
                }
            }
            super.handleMsg(message);
        } else if (message.obj != null && (message.obj instanceof C34146c)) {
            C34146c cVar2 = (C34146c) message.obj;
            if (C6319n.m19593a(this.f91863c) || this.f91863c.equalsIgnoreCase(cVar2.f88985g)) {
                this.mIsLoading = false;
                if (cVar2.f88986h != null) {
                    if (this.mNotifyListeners != null) {
                        for (C25678f a2 : this.mNotifyListeners) {
                            a2.mo57296a(cVar2.f88986h);
                        }
                    }
                    return;
                }
                handleData(cVar2);
                if (this.mNotifyListeners != null) {
                    for (C25678f b : this.mNotifyListeners) {
                        b.mo56977b();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void handleData(C34146c cVar) {
        boolean z;
        if (cVar == null) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            this.f91868i = false;
            if (this.mListQueryType == 2 && !isDataEmpty()) {
                ((C34146c) this.mData).f88979a.clear();
            }
            int size = cVar.f88979a.size();
            for (int i = 0; i < size; i++) {
                C34145b bVar = (C34145b) cVar.f88979a.get(i);
                if (bVar != null && bVar.getFeedType() == 65280) {
                    Aweme aweme = bVar.getAweme();
                    aweme.appendMobParam("page_poi_id", this.f91864d);
                    aweme.appendMobParam("page_poi_city", this.f91865e);
                    aweme.appendMobParam("page_poi_device_samecity", this.f91866f);
                    aweme.appendMobParam("page_poi_backend_type", this.f91867g);
                    Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme);
                    IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                    StringBuilder sb = new StringBuilder();
                    sb.append(updateAweme.getAid());
                    sb.append(10);
                    iRequestIdService.setRequestIdAndIndex(sb.toString(), cVar.f88984f, i);
                    bVar.setAweme(updateAweme);
                    cVar.f88979a.set(i, bVar);
                }
            }
            if (this.mListQueryType != 1) {
                Iterator it = cVar.f88979a.iterator();
                while (it.hasNext()) {
                    C34145b bVar2 = (C34145b) it.next();
                    if (!isDataEmpty() && ((C34146c) this.mData).f88979a.indexOf(bVar2) >= 0) {
                        it.remove();
                    }
                }
            }
            switch (this.mListQueryType) {
                case 1:
                    this.mData = cVar;
                    break;
                case 2:
                    cVar.f88979a.addAll(getItems());
                    ((C34146c) this.mData).f88979a = cVar.f88979a;
                    break;
                case 4:
                case 5:
                    ((C34146c) this.mData).f88979a.addAll(cVar.f88979a);
                    ((C34146c) this.mData).f88982d &= cVar.f88982d;
                    break;
            }
            mo89407a(cVar);
            for (int i2 = 0; i2 < ((C34146c) this.mData).f88979a.size(); i2++) {
                if (((C34145b) ((C34146c) this.mData).f88979a.get(i2)).getFeedType() == 65280) {
                    ((C34145b) ((C34146c) this.mData).f88979a.get(i2)).getAweme().setAwemePosition(i2);
                }
            }
            return;
        }
        if (this.mListQueryType == 1) {
            this.mData = null;
        }
        if (!(this.mData == null || this.mListQueryType == 2)) {
            ((C34146c) this.mData).f88982d = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo89407a(C34146c cVar) {
        if (((C34146c) this.mData).f88981c != 0) {
            ((C34146c) this.mData).f88981c = Math.max(((C34146c) this.mData).f88981c, cVar.f88981c);
        }
        if (((C34146c) this.mData).f88980b != 0) {
            ((C34146c) this.mData).f88980b = Math.max(((C34146c) this.mData).f88980b, cVar.f88980b);
        }
    }

    /* renamed from: a */
    protected static boolean m113315a(int i, Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m113312a(String str, int i, String str2, long j, String str3, String str4, String str5) {
        long j2;
        PoiFeedApi poiFeedApi = f91861h;
        if (C6307b.m19566a((Collection<T>) getItems())) {
            j2 = 0;
        } else {
            j2 = ((C34146c) this.mData).f88981c;
        }
        poiFeedApi.getAwemeList(str, i, 20, j2, j, str3, str4, 3, str5).mo6876a((C1591g<TResult, TContinuationResult>) new C35104a<TResult,TContinuationResult>(this.mHandler, TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN, str2), C1592h.f5958b);
    }

    /* renamed from: a */
    private void m113313a(String str, int i, String str2, String str3, int i2, boolean z, int i3, String str4, boolean z2, String str5) {
        int i4;
        Object obj;
        Object obj2;
        String str6 = str;
        C1592h awemeList = f91861h.getAwemeList(str, i, 20, 0, str4);
        Aweme rawAdAwemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(str4);
        PoiFeedApi poiFeedApi = f91861h;
        String str7 = "all";
        int a = mo57985a();
        if (rawAdAwemeById == null || !rawAdAwemeById.isAd()) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        C1592h poiDetail = poiFeedApi.getPoiDetail(str, str3, str2, str7, a, i2, i4, str4);
        if (!C30538p.m99745a()) {
            obj = f91861h.getPoiCommonBanner((long) i3, 53, str);
        } else {
            C1606i iVar = new C1606i();
            obj = iVar.f6010a;
            iVar.mo6900a(null);
        }
        if (z) {
            obj2 = f91861h.getQRDetail(str, z2, str5);
        } else {
            C1606i iVar2 = new C1606i();
            obj2 = iVar2.f6010a;
            iVar2.mo6900a(null);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(awemeList);
        arrayList.add(poiDetail);
        arrayList.add(obj2);
        arrayList.add(obj);
        C35456o.m114534a((Collection<? extends C1592h<TResult>>) arrayList).mo6876a((C1591g<TResult, TContinuationResult>) new C35119i<TResult,TContinuationResult>(this.mHandler, TextExtraStruct.TYPE_CUSTOM, this.f91862b), (Executor) C1592h.f5957a);
    }
}
