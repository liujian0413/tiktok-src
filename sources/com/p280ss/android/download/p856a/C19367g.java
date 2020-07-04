package com.p280ss.android.download.p856a;

import com.bytedance.common.utility.collection.C9726c;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.download.a.g */
final class C19367g<K, T, E, V, R> extends C19361c<K, T, E, V, R, Set<V>, C19367g<K, T, E, V, R>> {

    /* renamed from: g */
    public Set<V> f52414g = new C9726c(new WeakHashMap());

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo51334b() {
        return this.f52414g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo51332a() {
        this.f52414g.clear();
    }

    C19367g() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo51333a(V v) {
        if (v != null) {
            this.f52414g.add(v);
        }
    }
}
