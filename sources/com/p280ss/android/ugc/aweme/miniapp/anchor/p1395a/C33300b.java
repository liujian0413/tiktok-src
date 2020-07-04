package com.p280ss.android.ugc.aweme.miniapp.anchor.p1395a;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.C33348b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.b */
public abstract class C33300b<E, R extends C33348b<E>> extends C25673a<E, R> {

    /* renamed from: a */
    private int f86981a;

    /* renamed from: b */
    private List<E> f86982b = new ArrayList();

    /* renamed from: c */
    private boolean f86983c = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo85439a(int i);

    public List<E> getItems() {
        return this.f86982b;
    }

    public boolean isHasMore() {
        return this.f86983c;
    }

    /* renamed from: a */
    private void m107726a() {
        this.f86983c = false;
        this.f86981a = 0;
        this.f86982b.clear();
    }

    public void loadMoreList(Object... objArr) {
        mo85439a(this.f86981a);
    }

    public void refreshList(Object... objArr) {
        mo85439a(0);
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(R r) {
        if (r == null || C6307b.m19566a((Collection<T>) r.mo85511a())) {
            m107726a();
            return;
        }
        this.f86983c = r.mo85512b();
        this.f86981a = r.mo85513c();
        if (this.mListQueryType == 1) {
            this.f86982b.clear();
        }
        this.f86982b.addAll(r.mo85511a());
    }
}
