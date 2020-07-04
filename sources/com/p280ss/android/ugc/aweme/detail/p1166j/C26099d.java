package com.p280ss.android.ugc.aweme.detail.p1166j;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.common.p1144e.C25676d;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26098c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28467s;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.detail.j.d */
public abstract class C26099d<T extends C26098c, DATA> extends C25674b<T> {

    /* renamed from: a */
    public C28467s f68933a;

    /* renamed from: d */
    public boolean f68934d;

    /* renamed from: e */
    private boolean f68935e;

    /* renamed from: f */
    private C25676d f68936f;

    C26099d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo67676b(DATA data);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract List<DATA> mo67677e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract List<Aweme> mo67678f();

    /* renamed from: U_ */
    public final void mo59134U_() {
        super.mo59134U_();
        this.f68936f = null;
    }

    /* renamed from: b */
    public final void mo56977b() {
        boolean z;
        boolean z2 = true;
        if (this.f68933a != null) {
            C28467s sVar = this.f68933a;
            if (!this.f68935e || this.f68934d) {
                z = true;
            } else {
                z = false;
            }
            sVar.mo67623d(z);
        }
        this.f68935e = false;
        this.f68934d = false;
        if (this.f67571b != null) {
            int i = ((C26098c) this.f67571b).mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        if (((C26098c) this.f67571b).isDataEmpty()) {
                            if (this.f67572c != null) {
                                ((C25675c) this.f67572c).ae_();
                                return;
                            }
                        } else if (this.f67572c != null) {
                            ((C25675c) this.f67572c).mo59099a(mo67678f(), ((C26098c) this.f67571b).isHasMore());
                            return;
                        }
                        break;
                    case 2:
                        if (this.f67572c != null) {
                            ((C25675c) this.f67572c).mo59110c(mo67678f(), true ^ ((C26098c) this.f67571b).isNewDataEmpty());
                            break;
                        }
                        break;
                }
            } else if (this.f67572c != null) {
                C25675c cVar = (C25675c) this.f67572c;
                List f = mo67678f();
                if (!((C26098c) this.f67571b).isHasMore() || ((C26098c) this.f67571b).isNewDataEmpty()) {
                    z2 = false;
                }
                cVar.mo59108b(f, z2);
            }
        }
    }

    /* renamed from: a */
    public final void mo66568a(C25676d dVar) {
        this.f68936f = dVar;
    }

    /* renamed from: a */
    public final void mo59135a(int i) {
        if (this.f68936f != null) {
            this.f68936f.mo61747c_(i);
        }
    }

    /* renamed from: a */
    public void mo57296a(Exception exc) {
        boolean z;
        if (this.f68933a != null) {
            C28467s sVar = this.f68933a;
            if (!this.f68935e || this.f68934d) {
                z = true;
            } else {
                z = false;
            }
            sVar.mo67623d(z);
        }
        this.f68935e = false;
        this.f68934d = false;
        super.mo57296a(exc);
    }

    /* renamed from: a */
    private void m85730a(String str) {
        int i;
        if (this.f67571b != null) {
            List e = mo67677e();
            int i2 = 0;
            if (e == null) {
                i = 0;
            } else {
                i = e.size();
            }
            while (i2 < i) {
                Object obj = e.get(i2);
                String b = mo67676b(obj);
                if (TextUtils.isEmpty(b) || !TextUtils.equals(str, b)) {
                    i2++;
                } else {
                    C26115s sVar = ((C26098c) this.f67571b).f68932a;
                    if (sVar != null) {
                        sVar.mo67680c(b);
                    }
                    e.remove(obj);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo66569a(Object obj) {
        if (obj instanceof Aweme) {
            List f = mo67678f();
            if (!C6307b.m19566a((Collection<T>) f)) {
                int size = f.size();
                for (int i = 0; i < size; i++) {
                    Aweme aweme = (Aweme) obj;
                    if (TextUtils.equals(aweme.getAid(), C28482e.m93613f((Aweme) f.get(i)))) {
                        m85730a(aweme.getAid());
                        mo59135a(i);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo56976a(Object... objArr) {
        if (this.f68933a != null) {
            this.f68933a.mo67623d(this.f68934d);
        }
        return super.mo56976a(objArr);
    }

    /* renamed from: a */
    public final void mo59136a(List list, int i) {
        if (this.f68936f != null) {
            this.f68936f.mo61742a(list, i);
        }
    }
}
