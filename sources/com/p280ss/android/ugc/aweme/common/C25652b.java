package com.p280ss.android.ugc.aweme.common;

import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25672e;

/* renamed from: com.ss.android.ugc.aweme.common.b */
public class C25652b<T extends C25640a, K extends C25672e> implements C25678f {

    /* renamed from: b */
    public T f67571b;

    /* renamed from: c */
    public K f67572c;

    /* access modifiers changed from: protected */
    /* renamed from: S_ */
    public void mo57293S_() {
    }

    /* renamed from: a */
    public void mo57296a(Exception exc) {
    }

    /* renamed from: b */
    public void mo56977b() {
    }

    /* renamed from: h */
    public T mo66539h() {
        return this.f67571b;
    }

    /* renamed from: U_ */
    public void mo59134U_() {
        this.f67572c = null;
        mo66535W_();
    }

    public final boolean ap_() {
        if (this.f67572c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: W_ */
    public void mo66535W_() {
        if (this.f67571b != null) {
            this.f67571b.clearNotifyListener(this);
            this.f67571b = null;
        }
    }

    /* renamed from: i */
    public final boolean mo66540i() {
        if (this.f67571b == null || !this.f67571b.mIsLoading) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo66537a(K k) {
        this.f67572c = k;
    }

    /* renamed from: a */
    public void mo66536a(T t) {
        this.f67571b = t;
        this.f67571b.addNotifyListener(this);
    }

    /* renamed from: a */
    public boolean mo56976a(Object... objArr) {
        if (this.f67571b == null || mo66540i() || !this.f67571b.sendRequest(objArr)) {
            return false;
        }
        mo57293S_();
        return true;
    }
}
