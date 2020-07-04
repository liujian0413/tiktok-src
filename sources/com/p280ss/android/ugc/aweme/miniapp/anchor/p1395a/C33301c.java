package com.p280ss.android.ugc.aweme.miniapp.anchor.p1395a;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.C33348b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.c */
public abstract class C33301c<E, R extends C33348b<E>> extends C25673a<E, R> {

    /* renamed from: a */
    private int f86984a;

    /* renamed from: b */
    private List<E> f86985b = new ArrayList();

    /* renamed from: c */
    private boolean f86986c = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo85440a(int i, Object... objArr);

    public List<E> getItems() {
        return this.f86985b;
    }

    public boolean isHasMore() {
        return this.f86986c;
    }

    /* renamed from: a */
    private void m107729a() {
        this.f86986c = false;
        this.f86984a = 0;
        this.f86985b.clear();
    }

    public void loadMoreList(Object... objArr) {
        mo85440a(this.f86984a, objArr);
    }

    public void refreshList(Object... objArr) {
        mo85440a(0, objArr);
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(R r) {
        if (r == null || C6307b.m19566a((Collection<T>) r.mo85511a())) {
            m107729a();
            return;
        }
        this.f86986c = r.mo85512b();
        this.f86984a = r.mo85513c();
        if (this.mListQueryType == 1) {
            this.f86985b.clear();
        }
        this.f86985b.addAll(r.mo85511a());
    }
}
