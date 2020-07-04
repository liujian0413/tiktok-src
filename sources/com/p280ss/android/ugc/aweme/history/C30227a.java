package com.p280ss.android.ugc.aweme.history;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.detail.p1164h.C26066a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.festival.christmas.api.ChristmasApi;
import com.p280ss.android.ugc.aweme.history.dao.C30234a;
import com.p280ss.android.ugc.aweme.net.C34089j;
import com.p280ss.android.ugc.aweme.p1708y.p1709a.C43569a;
import com.p280ss.android.ugc.aweme.p1708y.p1709a.p1710a.C43571a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.history.a */
public final class C30227a extends C25673a<Aweme, C26066a> {

    /* renamed from: e */
    public static final C30228a f79542e = new C30228a(null);

    /* renamed from: a */
    public List<C30234a> f79543a;

    /* renamed from: b */
    public Map<String, Long> f79544b = new LinkedHashMap();

    /* renamed from: c */
    public int f79545c = 1;

    /* renamed from: d */
    public String f79546d;

    /* renamed from: com.ss.android.ugc.aweme.history.a$a */
    public static final class C30228a {
        private C30228a() {
        }

        public /* synthetic */ C30228a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.history.a$b */
    static final class C30229b<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C30227a f79547a;

        C30229b(C30227a aVar) {
            this.f79547a = aVar;
        }

        public final /* synthetic */ Object call() {
            m98882a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m98882a() {
            this.f79547a.mo79680a(this.f79547a.mo79679a(this.f79547a.f79545c + 1));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.history.a$c */
    static final class C30230c<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C30227a f79548a;

        /* renamed from: b */
        final /* synthetic */ Object[] f79549b;

        C30230c(C30227a aVar, Object[] objArr) {
            this.f79548a = aVar;
            this.f79549b = objArr;
        }

        public final /* synthetic */ Object call() {
            m98883a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m98883a() {
            this.f79548a.f79543a = ((C43571a) C43569a.f112819b.mo105516a(C43571a.class)).mo79686b(this.f79549b[0].toString());
            if (this.f79548a.f79543a != null) {
                C30227a aVar = this.f79548a;
                List<C30234a> list = this.f79548a.f79543a;
                if (list == null) {
                    C7573i.m23580a();
                }
                aVar.mo79681a(list);
            }
            this.f79548a.f79545c = 1;
            this.f79548a.mo79680a(this.f79548a.mo79679a(this.f79548a.f79545c));
        }
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        return true;
    }

    public final boolean isHasMore() {
        if (this.f79543a != null) {
            List<C30234a> list = this.f79543a;
            if (list == null) {
                C7573i.m23580a();
            }
            if (list.size() > this.f79545c * 20) {
                return true;
            }
        }
        return false;
    }

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return new ArrayList<>();
        }
        Object obj = this.mData;
        C7573i.m23582a(obj, "mData");
        this.f79546d = ((C26066a) obj).f68879b;
        Object obj2 = this.mData;
        C7573i.m23582a(obj2, "mData");
        List<Aweme> list = ((C26066a) obj2).f68878a;
        if (list == null) {
            list = new ArrayList<>();
        }
        return new ArrayList<>(list);
    }

    /* renamed from: a */
    private final boolean m98878a(Object... objArr) {
        if (!checkParams(objArr)) {
            return false;
        }
        this.mIsLoading = true;
        return true;
    }

    /* renamed from: a */
    public final void mo79680a(String str) {
        C7573i.m23587b(str, "ids");
        ChristmasApi.m95577a().getAwemeDetail(str).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
    }

    public final void loadMoreList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        C1592h.m7855a((Callable<TResult>) new C30229b<TResult>(this), (Executor) C1592h.f5957a);
    }

    public final void refreshList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        C1592h.m7855a((Callable<TResult>) new C30230c<TResult>(this, objArr), (Executor) C1592h.f5957a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C26066a aVar) {
        List<Aweme> list;
        int i = this.mListQueryType;
        if (i != 1) {
            if (i == 4) {
                if (this.mData == null) {
                    this.mData = aVar;
                    return;
                }
                this.f79545c++;
                if (aVar != null) {
                    list = aVar.f68878a;
                } else {
                    list = null;
                }
                if (list != null) {
                    Object obj = this.mData;
                    C7573i.m23582a(obj, "mData");
                    List<Aweme> list2 = ((C26066a) obj).f68878a;
                    List<Aweme> list3 = aVar.f68878a;
                    C7573i.m23582a((Object) list3, "data.items");
                    list2.addAll(list3);
                }
            }
            return;
        }
        this.mData = aVar;
    }

    public final boolean sendRequest(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        if (!m98878a(objArr)) {
            return false;
        }
        Integer num = objArr[0];
        if (num != null) {
            this.mListQueryType = num.intValue();
            int i = this.mListQueryType;
            if (i == 1) {
                refreshList(objArr[1]);
            } else if (i == 4) {
                loadMoreList(objArr);
            }
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
    }

    /* renamed from: a */
    public final String mo79679a(int i) {
        if (this.f79543a == null) {
            return "";
        }
        int i2 = i * 20;
        List<C30234a> list = this.f79543a;
        if (list == null) {
            C7573i.m23580a();
        }
        if (i2 > list.size()) {
            List<C30234a> list2 = this.f79543a;
            if (list2 == null) {
                C7573i.m23580a();
            }
            i2 = list2.size();
        }
        List<C30234a> list3 = this.f79543a;
        if (list3 == null) {
            C7573i.m23580a();
        }
        List<C30234a> subList = list3.subList((i - 1) * 20, i2);
        StringBuilder sb = new StringBuilder("[");
        for (C30234a aVar : subList) {
            sb.append(aVar.f79552b);
            sb.append(",");
        }
        sb.append("]");
        String sb2 = sb.toString();
        C7573i.m23582a((Object) sb2, "builder.toString()");
        return sb2;
    }

    /* renamed from: a */
    public final void mo79681a(List<C30234a> list) {
        this.f79544b.clear();
        for (C30234a aVar : list) {
            this.f79544b.put(aVar.f79552b, Long.valueOf(aVar.f79551a));
        }
    }
}
