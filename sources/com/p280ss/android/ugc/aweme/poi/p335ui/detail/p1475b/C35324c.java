package com.p280ss.android.ugc.aweme.poi.p335ui.detail.p1475b;

import android.os.Handler;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26112p;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.newfollow.model.C34146c;
import com.p280ss.android.ugc.aweme.poi.C35086h;
import com.p280ss.android.ugc.aweme.poi.api.PoiFeedApi;
import com.p280ss.android.ugc.aweme.poi.model.C35118h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.b.c */
public final class C35324c extends C35118h implements C26112p {

    /* renamed from: j */
    public static final C35325a f92602j = new C35325a(null);

    /* renamed from: i */
    public boolean f92603i;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.b.c$a */
    public static final class C35325a {
        private C35325a() {
        }

        public /* synthetic */ C35325a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static List<Aweme> m114027a(List<? extends C34145b> list) {
            if (list == null) {
                return new ArrayList<>();
            }
            List<Aweme> arrayList = new ArrayList<>();
            for (C34145b bVar : list) {
                if (bVar != null) {
                    Aweme aweme = bVar.getAweme();
                    if (aweme != null) {
                        arrayList.add(aweme);
                    }
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.b.c$b */
    static final class C35326b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C35324c f92604a;

        C35326b(C35324c cVar) {
            this.f92604a = cVar;
            super(0);
        }

        /* renamed from: a */
        private void m114028a() {
            this.f92604a.f92603i = true;
        }

        public final /* synthetic */ Object invoke() {
            m114028a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.b.c$c */
    static final class C35327c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C35324c f92605a;

        C35327c(C35324c cVar) {
            this.f92605a = cVar;
            super(0);
        }

        /* renamed from: a */
        private void m114029a() {
            this.f92605a.f92603i = true;
        }

        public final /* synthetic */ Object invoke() {
            m114029a();
            return C7581n.f20898a;
        }
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        return true;
    }

    public C35324c() {
        super(65441);
    }

    /* renamed from: a */
    public final List<Aweme> mo57985a() {
        return C35325a.m114027a(getItems());
    }

    public final boolean isHasMore() {
        C34146c cVar = (C34146c) getData();
        if (cVar == null || cVar.f88982d != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo89407a(C34146c cVar) {
        C7573i.m23587b(cVar, "data");
        Object obj = this.mData;
        C7573i.m23582a(obj, "mData");
        ((C34146c) obj).f88981c = cVar.f88981c;
        Object obj2 = this.mData;
        C7573i.m23582a(obj2, "mData");
        ((C34146c) obj2).f88980b = cVar.f88980b;
        Object obj3 = this.mData;
        C7573i.m23582a(obj3, "mData");
        ((C34146c) obj3).f88983e = cVar.f88983e;
    }

    public final void loadMoreList(Object... objArr) {
        long j;
        C7573i.m23587b(objArr, "params");
        this.f91863c = m113316b();
        C35086h hVar = objArr[1];
        if (hVar != null) {
            C35086h hVar2 = hVar;
            PoiFeedApi poiFeedApi = C35118h.f91861h;
            String str = hVar2.f91750a;
            if (C6307b.m19566a((Collection<T>) getItems())) {
                j = 0;
            } else {
                Object obj = this.mData;
                C7573i.m23582a(obj, "mData");
                j = ((C34146c) obj).f88981c;
            }
            Object obj2 = this.mData;
            C7573i.m23582a(obj2, "mData");
            C1592h rateAwemeList = poiFeedApi.getRateAwemeList(str, 20, j, ((C34146c) obj2).f88983e);
            C6309f fVar = this.mHandler;
            C7573i.m23582a((Object) fVar, "mHandler");
            Handler handler = fVar;
            String str2 = this.f91863c;
            C7573i.m23582a((Object) str2, "mCurrentAwemeRequestKey");
            C35323b bVar = new C35323b(handler, TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN, str2, this.f92603i, new C35326b(this));
            rateAwemeList.mo6876a((C1591g<TResult, TContinuationResult>) bVar, C1592h.f5958b);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.PoiParams");
    }

    public final void refreshList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        this.f91863c = m113316b();
        C35086h hVar = objArr[1];
        if (hVar != null) {
            C1592h rateAwemeList = C35118h.f91861h.getRateAwemeList(hVar.f91750a, 20, 0, 1);
            C6309f fVar = this.mHandler;
            C7573i.m23582a((Object) fVar, "mHandler");
            Handler handler = fVar;
            String str = this.f91863c;
            C7573i.m23582a((Object) str, "mCurrentAwemeRequestKey");
            C35323b bVar = new C35323b(handler, TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN, str, this.f92603i, new C35327c(this));
            rateAwemeList.mo6876a((C1591g<TResult, TContinuationResult>) bVar, C1592h.f5958b);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.PoiParams");
    }
}
