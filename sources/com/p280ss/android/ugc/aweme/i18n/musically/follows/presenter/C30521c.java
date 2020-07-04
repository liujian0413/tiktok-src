package com.p280ss.android.ugc.aweme.i18n.musically.follows.presenter;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.follows.presenter.c */
abstract class C30521c extends C25673a<User, C30520b> {

    /* renamed from: a */
    public String f80207a;

    /* renamed from: b */
    public long f80208b = System.currentTimeMillis();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C30520b mo80229a(String str, long j, int i, int i2) throws Exception;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract List<User> mo80230a(C30520b bVar);

    /* renamed from: a */
    private void m99665a() {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return C30521c.this.mo80229a(C30521c.this.f80207a, C30521c.this.f80208b, C43161e.m136882a(), C43161e.m136884b());
            }
        }, 0);
    }

    public List<User> getItems() {
        if (this.mData == null) {
            return null;
        }
        return mo80230a((C30520b) this.mData);
    }

    public boolean isHasMore() {
        if (this.mData == null || !((C30520b) this.mData).f80203c) {
            return false;
        }
        return true;
    }

    public void loadMoreList(Object... objArr) {
        m99665a();
    }

    C30521c(String str) {
        this.f80207a = str;
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public void refreshList(Object... objArr) {
        this.f80208b = System.currentTimeMillis();
        m99665a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void handleData(C30520b bVar) {
        boolean z;
        if (bVar == null || C6307b.m19566a((Collection<T>) mo80230a(bVar))) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        int i = this.mListQueryType;
        if (i == 1) {
            this.mData = bVar;
            if (!this.mIsNewDataEmpty) {
                this.f80208b = bVar.f80205e;
            }
        } else if (i == 4) {
            if (!this.mIsNewDataEmpty) {
                mo80230a((C30520b) this.mData).addAll(mo80230a(bVar));
                ((C30520b) this.mData).f80203c = bVar.f80203c;
                this.f80208b = bVar.f80205e;
                return;
            }
            ((C30520b) this.mData).f80203c = false;
        }
    }
}
