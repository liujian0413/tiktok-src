package com.bytedance.jedi.ext.adapter.decorator.internal;

import android.util.SparseArray;
import android.view.View;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.ext.adapter.decorator.internal.b */
public abstract class C11687b {

    /* renamed from: a */
    private final SparseArray<View> f31408a = new SparseArray<>();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29242b() {
        int size = this.f31408a.size();
        for (int i = 0; i < size; i++) {
            Object valueAt = this.f31408a.valueAt(i);
            C7573i.m23582a(valueAt, "itemViewMap.valueAt(i)");
            ((View) valueAt).setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29243b(int i) {
        int i2;
        int size = this.f31408a.size();
        for (int i3 = 0; i3 < size; i3++) {
            int keyAt = this.f31408a.keyAt(i3);
            View view = (View) this.f31408a.valueAt(i3);
            C7573i.m23582a((Object) view, "child");
            if (keyAt == i) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29241a(View view, int... iArr) {
        C7573i.m23587b(view, C38347c.f99553h);
        C7573i.m23587b(iArr, "id");
        for (int i = 0; i < 3; i++) {
            mo29240a(iArr[i], view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T extends View> T mo29240a(int i, View view) {
        C7573i.m23587b(view, C38347c.f99553h);
        T t = this.f31408a.get(i);
        if (!(t instanceof View)) {
            t = null;
        }
        T t2 = (View) t;
        if (t2 != null) {
            return t2;
        }
        T findViewById = view.findViewById(i);
        this.f31408a.put(i, findViewById);
        C7573i.m23582a((Object) findViewById, "content.findViewById<T>(…itemViewMap.put(id, it) }");
        return findViewById;
    }
}
