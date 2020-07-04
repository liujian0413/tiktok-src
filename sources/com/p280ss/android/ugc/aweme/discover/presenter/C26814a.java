package com.p280ss.android.ugc.aweme.discover.presenter;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter.DiscoverV4DataObserver;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse;
import com.p280ss.android.ugc.aweme.discover.model.DiscoveryV4CellDetailResponse;
import com.p280ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.presenter.a */
public final class C26814a extends C25674b<DiscoveryV4DetailListModel> implements DiscoverV4DataObserver {

    /* renamed from: a */
    public final String f70766a;

    /* renamed from: d */
    private final List<Aweme> f70767d = new ArrayList();

    public final void onNeedUpdateData(String str) {
        C7573i.m23587b(str, "tabName");
    }

    /* renamed from: U_ */
    public final void mo59134U_() {
        super.mo59134U_();
        DiscoverV4PlayListDataCenter.Companion.getINSTANCE().unRegister(this);
    }

    /* renamed from: f */
    private final DiscoverV4PlayListResponse m88093f() {
        List<DiscoverPlayListStructV4> list;
        DiscoverV4PlayListResponse data = DiscoverV4PlayListDataCenter.Companion.getINSTANCE().getData(DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST());
        if (data != null) {
            list = data.cells;
        } else {
            list = null;
        }
        if (list == null) {
            return null;
        }
        List arrayList = new ArrayList();
        for (DiscoverPlayListStructV4 discoverPlayListStructV4 : data.cells) {
            List<Aweme> list2 = discoverPlayListStructV4.awemes;
            if (list2 != null) {
                Aweme aweme = (Aweme) C7525m.m23511f(list2);
                if (aweme != null) {
                    arrayList.add(aweme);
                }
            }
        }
        C25640a aVar = this.f67571b;
        C7573i.m23582a((Object) aVar, "mModel");
        DiscoveryV4DetailListModel discoveryV4DetailListModel = (DiscoveryV4DetailListModel) aVar;
        boolean z = true;
        if (data.hasMore != 1) {
            z = false;
        }
        discoveryV4DetailListModel.setData(new DiscoveryV4CellDetailResponse(arrayList, z, data.logPb));
        return data;
    }

    /* renamed from: e */
    private final void m88092e() {
        C25640a aVar = this.f67571b;
        C7573i.m23582a((Object) aVar, "mModel");
        if (((DiscoveryV4DetailListModel) aVar).getItems() != null) {
            int i = 0;
            C25640a aVar2 = this.f67571b;
            C7573i.m23582a((Object) aVar2, "mModel");
            List<Aweme> items = ((DiscoveryV4DetailListModel) aVar2).getItems();
            if (items == null) {
                C7573i.m23580a();
            }
            for (Aweme aweme : items) {
                C25640a aVar3 = this.f67571b;
                C7573i.m23582a((Object) aVar3, "mModel");
                aweme.setRequestId(((DiscoveryV4CellDetailResponse) ((DiscoveryV4DetailListModel) aVar3).getData()).logPb.getImprId());
                DiscoveryV4DetailListModel discoveryV4DetailListModel = (DiscoveryV4DetailListModel) mo66539h();
                C7573i.m23582a((Object) discoveryV4DetailListModel, "model");
                List items2 = discoveryV4DetailListModel.getItems();
                if (items2 == null) {
                    C7573i.m23580a();
                }
                Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme);
                C7573i.m23582a((Object) updateAweme, "ServiceManager.get().get….java).updateAweme(aweme)");
                items2.set(i, updateAweme);
                IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                StringBuilder sb = new StringBuilder();
                sb.append(aweme.getAid());
                sb.append(9001);
                iRequestIdService.setRequestIdAndIndex(sb.toString(), aweme.getRequestId(), i);
                this.f70767d.add(aweme);
                i++;
            }
            C28199ae a = C28199ae.m92689a();
            C25640a aVar4 = this.f67571b;
            C7573i.m23582a((Object) aVar4, "mModel");
            String imprId = ((DiscoveryV4CellDetailResponse) ((DiscoveryV4DetailListModel) aVar4).getData()).logPb.getImprId();
            C25640a aVar5 = this.f67571b;
            C7573i.m23582a((Object) aVar5, "mModel");
            a.mo71792a(imprId, ((DiscoveryV4CellDetailResponse) ((DiscoveryV4DetailListModel) aVar5).getData()).logPb);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (((com.p280ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel) r3).isNewDataEmpty() == false) goto L_0x0045;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56977b() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.common.a r0 = r5.f67571b
            if (r0 == 0) goto L_0x0087
            com.ss.android.ugc.aweme.common.e r0 = r5.f67572c
            if (r0 != 0) goto L_0x000a
            goto L_0x0087
        L_0x000a:
            com.ss.android.ugc.aweme.common.a r0 = r5.f67571b
            java.lang.String r1 = "mModel"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel r0 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel) r0
            int r0 = r0.mListQueryType
            r1 = 1
            if (r0 == r1) goto L_0x0049
            r2 = 4
            if (r0 == r2) goto L_0x001c
            goto L_0x0048
        L_0x001c:
            r5.m88092e()
            com.ss.android.ugc.aweme.common.e r0 = r5.f67572c
            com.ss.android.ugc.aweme.common.e.c r0 = (com.p280ss.android.ugc.aweme.common.p1144e.C25675c) r0
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r5.f70767d
            com.ss.android.ugc.aweme.common.a r3 = r5.f67571b
            java.lang.String r4 = "mModel"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            com.ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel r3 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel) r3
            boolean r3 = r3.isHasMore()
            if (r3 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.common.a r3 = r5.f67571b
            java.lang.String r4 = "mModel"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            com.ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel r3 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel) r3
            boolean r3 = r3.isNewDataEmpty()
            if (r3 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            r0.mo59108b(r2, r1)
        L_0x0048:
            return
        L_0x0049:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r5.f70767d
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0056
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r5.f70767d
            r0.clear()
        L_0x0056:
            com.ss.android.ugc.aweme.common.a r0 = r5.f67571b
            java.lang.String r1 = "mModel"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel r0 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel) r0
            boolean r0 = r0.isDataEmpty()
            if (r0 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.common.e r0 = r5.f67572c
            com.ss.android.ugc.aweme.common.e.c r0 = (com.p280ss.android.ugc.aweme.common.p1144e.C25675c) r0
            r0.ae_()
            return
        L_0x006d:
            r5.m88092e()
            com.ss.android.ugc.aweme.common.e r0 = r5.f67572c
            com.ss.android.ugc.aweme.common.e.c r0 = (com.p280ss.android.ugc.aweme.common.p1144e.C25675c) r0
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r5.f70767d
            com.ss.android.ugc.aweme.common.a r2 = r5.f67571b
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            com.ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel r2 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel) r2
            boolean r2 = r2.isHasMore()
            r0.mo59099a(r1, r2)
            return
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.presenter.C26814a.mo56977b():void");
    }

    public C26814a(String str) {
        C7573i.m23587b(str, "tabName");
        this.f70766a = str;
        if (TextUtils.equals(this.f70766a, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
            DiscoverV4PlayListDataCenter.Companion.getINSTANCE().register(this);
        }
    }

    public final void onDataChanged(String str) {
        C7573i.m23587b(str, "tabName");
        if (TextUtils.equals(str, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST()) && m88093f() != null) {
            C25675c cVar = (C25675c) this.f67572c;
            C25640a aVar = this.f67571b;
            C7573i.m23582a((Object) aVar, "mModel");
            List items = ((DiscoveryV4DetailListModel) aVar).getItems();
            C25640a aVar2 = this.f67571b;
            C7573i.m23582a((Object) aVar2, "mModel");
            cVar.mo59108b(items, ((DiscoveryV4DetailListModel) aVar2).isHasMore());
        }
    }

    /* renamed from: a */
    public final boolean mo56976a(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        Integer num = objArr[0];
        if (num != null) {
            if (num.intValue() == 1) {
                Integer num2 = objArr[1];
                if (num2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                } else if (num2.intValue() == 2 && m88093f() != null) {
                    C25640a aVar = this.f67571b;
                    C7573i.m23582a((Object) aVar, "mModel");
                    if (((DiscoveryV4DetailListModel) aVar).isDataEmpty()) {
                        ((C25675c) this.f67572c).ae_();
                    } else {
                        C25675c cVar = (C25675c) this.f67572c;
                        C25640a aVar2 = this.f67571b;
                        C7573i.m23582a((Object) aVar2, "mModel");
                        List items = ((DiscoveryV4DetailListModel) aVar2).getItems();
                        C25640a aVar3 = this.f67571b;
                        C7573i.m23582a((Object) aVar3, "mModel");
                        cVar.mo59099a(items, ((DiscoveryV4DetailListModel) aVar3).isHasMore());
                    }
                    return true;
                }
            }
            Integer num3 = objArr[0];
            if (num3 != null) {
                if (num3.intValue() == 1) {
                    Integer num4 = objArr[1];
                    if (num4 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                    } else if (num4.intValue() == 1) {
                        IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
                        String str = objArr[5];
                        if (str != null) {
                            Aweme awemeById = iAwemeService.getAwemeById(str);
                            if (awemeById != null) {
                                ((DiscoveryV4DetailListModel) this.f67571b).insertItem(awemeById);
                                mo56977b();
                                return true;
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                }
                return super.mo56976a(Arrays.copyOf(objArr, objArr.length));
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
    }
}
