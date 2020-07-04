package com.p280ss.android.ugc.aweme.tutorial.p1683a;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.tutorial.api.TutorialAwemeListApi.C42671a;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tutorial.a.b */
public final class C42666b extends C25673a<Aweme, C42669d> {

    /* renamed from: com.ss.android.ugc.aweme.tutorial.a.b$a */
    static final class C42667a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ String f110916a;

        /* renamed from: b */
        final /* synthetic */ long f110917b;

        /* renamed from: c */
        final /* synthetic */ int f110918c;

        C42667a(String str, long j, int i) {
            this.f110916a = str;
            this.f110917b = j;
            this.f110918c = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C42669d call() {
            return C42671a.m135517a(this.f110916a, this.f110917b, this.f110918c);
        }
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        return true;
    }

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C42669d) this.mData).f110921a;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((C42669d) this.mData).f110923c) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        String str = objArr[1];
        if (str != null) {
            m135515a(str, 0, 20);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }

    public final void loadMoreList(Object... objArr) {
        long j;
        C7573i.m23587b(objArr, "params");
        String str = objArr[1];
        if (str != null) {
            String str2 = str;
            if (isDataEmpty()) {
                j = 0;
            } else {
                j = ((C42669d) this.mData).f110922b;
            }
            m135515a(str2, j, 20);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C42669d dVar) {
        boolean z;
        if (dVar == null || C6307b.m19566a((Collection<T>) dVar.f110921a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (dVar == null) {
                C7573i.m23580a();
            }
            int size = dVar.f110921a.size();
            for (int i = 0; i < size; i++) {
                Object obj = dVar.f110921a.get(i);
                C7573i.m23582a(obj, "data.awemeList[i]");
                Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme((Aweme) obj);
                C7573i.m23582a((Object) updateAweme, "ServiceManager.get().get….java).updateAweme(aweme)");
                dVar.f110921a.set(i, updateAweme);
            }
            int i2 = this.mListQueryType;
            if (i2 != 1) {
                if (i2 == 4) {
                    ((C42669d) this.mData).f110921a.addAll(dVar.f110921a);
                    ((C42669d) this.mData).f110922b = dVar.f110922b;
                    ((C42669d) this.mData).f110923c = dVar.f110923c & ((C42669d) this.mData).f110923c;
                }
                return;
            }
            this.mData = dVar;
            return;
        }
        C42669d dVar2 = (C42669d) this.mData;
        if (dVar2 != null) {
            dVar2.f110923c = false;
        }
    }

    /* renamed from: a */
    private final void m135515a(String str, long j, int i) {
        C23397p.m76735a().mo60807a(this.mHandler, new C42667a(str, j, 20), 0);
    }
}
