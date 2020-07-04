package com.p280ss.android.ugc.aweme.anchor;

import com.p280ss.android.ugc.aweme.anchor.api.AnchorApi;
import com.p280ss.android.ugc.aweme.anchor.api.p1008a.C22526a;
import com.p280ss.android.ugc.aweme.anchor.api.p1009b.C22529a;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.anchor.b */
public final class C22532b extends C25673a<C22526a, C22529a> {

    /* renamed from: a */
    private List<C22526a> f60018a = new ArrayList();

    /* renamed from: b */
    private int f60019b;

    /* renamed from: c */
    private boolean f60020c;

    /* renamed from: com.ss.android.ugc.aweme.anchor.b$a */
    static final class C22533a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ Object[] f60021a;

        C22533a(Object[] objArr) {
            this.f60021a = objArr;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C22529a call() {
            Object obj = this.f60021a[1];
            if (obj != null) {
                return AnchorApi.m74493a(10, (String) obj);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
    }

    public final List<C22526a> getItems() {
        return this.f60018a;
    }

    public final boolean isHasMore() {
        return this.f60020c;
    }

    public final void loadMoreList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    public final void refreshList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        C23397p.m76735a().mo60807a(this.mHandler, new C22533a(objArr), 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C22529a aVar) {
        boolean z;
        if (aVar != null) {
            this.f60018a.clear();
            Collection collection = aVar.f60013a;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f60020c = false;
                List<C22526a> list = this.f60018a;
                List a = aVar.mo59141a();
                if (a == null) {
                    C7573i.m23580a();
                }
                list.addAll(a);
            } else {
                this.f60020c = false;
                this.f60019b = 0;
                this.f60018a.clear();
            }
        }
    }
}
