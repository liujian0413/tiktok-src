package com.p280ss.android.download.p856a;

import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.download.a.d */
public final class C19362d<K, T, E, V, R> extends C19358a<K, T, E, V, R, V, C19370i<K, T, E, V, R>> {

    /* renamed from: g */
    private final WeakReference<C19363a<K, T, E, V, R>> f52404g;

    /* renamed from: com.ss.android.download.a.d$a */
    public interface C19363a<K, T, E, V, R> {
        /* renamed from: a */
        R mo51335a(K k, T t, E e);

        /* renamed from: a */
        void mo51336a(K k, T t, E e, V v, R r);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo51329c() {
        super.mo51329c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo51330d() {
        super.mo51330d();
    }

    /* renamed from: e */
    private static C19370i<K, T, E, V, R> m63560e() {
        return new C19370i<>();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ C19361c mo51324a() {
        return m63560e();
    }

    /* renamed from: b */
    public final void mo51328b() {
        super.mo51328b();
        this.f52404g.clear();
    }

    public final /* bridge */ /* synthetic */ void handleMsg(Message message) {
        super.handleMsg(message);
    }

    public C19362d(int i, int i2, C19363a<K, T, E, V, R> aVar) {
        this(i, i2, aVar, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final R mo51325a(K k, T t, E e) {
        C19363a aVar = (C19363a) this.f52404g.get();
        if (aVar != null) {
            return aVar.mo51335a(k, t, e);
        }
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo51326a(Object obj, Object obj2, Object obj3, Object obj4) {
        super.mo51326a(obj, obj2, obj3, obj4);
    }

    private C19362d(int i, int i2, C19363a<K, T, E, V, R> aVar, boolean z) {
        super(i, i2, aVar.getClass().getName(), false);
        this.f52404g = new WeakReference<>(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51327a(K k, T t, E e, V v, R r) {
        C19363a aVar = (C19363a) this.f52404g.get();
        if (aVar != null) {
            aVar.mo51336a(k, t, e, v, r);
        }
    }
}
