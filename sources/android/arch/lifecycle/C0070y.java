package android.arch.lifecycle;

import java.util.HashMap;

/* renamed from: android.arch.lifecycle.y */
public final class C0070y {

    /* renamed from: a */
    private final HashMap<String, C0063u> f117a = new HashMap<>();

    /* renamed from: a */
    public final void mo151a() {
        for (C0063u onCleared : this.f117a.values()) {
            onCleared.onCleared();
        }
        this.f117a.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0063u mo150a(String str) {
        return (C0063u) this.f117a.get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo152a(String str, C0063u uVar) {
        C0063u uVar2 = (C0063u) this.f117a.put(str, uVar);
        if (uVar2 != null) {
            uVar2.onCleared();
        }
    }
}
