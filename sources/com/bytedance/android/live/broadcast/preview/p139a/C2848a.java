package com.bytedance.android.live.broadcast.preview.p139a;

import com.bytedance.android.livesdkapi.C9402f;
import com.bytedance.android.livesdkapi.C9402f.C9403a;
import com.bytedance.android.livesdkapi.C9402f.C9404b;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.live.broadcast.preview.a.a */
public final class C2848a implements C9403a {

    /* renamed from: a */
    private int f9059a;

    /* renamed from: b */
    private ArrayList<C9402f> f9060b;

    /* renamed from: c */
    private C9404b f9061c;

    /* renamed from: b */
    public final C9404b mo9614b() {
        return this.f9061c;
    }

    /* renamed from: a */
    public final void mo9613a() {
        if (this.f9059a <= this.f9060b.size()) {
            ((C9402f) this.f9060b.get(this.f9059a)).mo9615a(new C2848a(this.f9059a + 1, this.f9060b, this.f9061c));
        }
    }

    public C2848a(int i, ArrayList<C9402f> arrayList, C9404b bVar) {
        this.f9059a = i;
        this.f9060b = arrayList;
        this.f9061c = bVar;
    }
}
