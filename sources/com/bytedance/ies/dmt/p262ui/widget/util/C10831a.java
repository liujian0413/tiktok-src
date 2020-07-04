package com.bytedance.ies.dmt.p262ui.widget.util;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ies.dmt.ui.widget.util.a */
public class C10831a {

    /* renamed from: a */
    private static volatile C10831a f29315a;

    /* renamed from: b */
    private static volatile SparseArray<String> f29316b;

    /* renamed from: c */
    private static volatile Map<String, Integer> f29317c;

    /* renamed from: d */
    private SparseArray<Typeface> f29318d = new SparseArray<>();

    /* renamed from: e */
    private Map<String, String> f29319e = new HashMap();

    /* renamed from: f */
    private Context f29320f;

    private C10831a() {
    }

    /* renamed from: a */
    public static C10831a m31777a() {
        if (f29315a == null) {
            synchronized (C10831a.class) {
                if (f29315a == null) {
                    f29315a = new C10831a();
                }
            }
        }
        return f29315a;
    }

    /* renamed from: c */
    private void m31780c() {
        if (this.f29319e != null && this.f29319e.size() >= 0) {
            for (String str : this.f29319e.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    mo26158a(((Integer) f29317c.get(str)).intValue());
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public static void m31779b() {
        if (f29315a != null) {
            f29315a.f29320f = null;
            if (f29315a.f29319e != null) {
                f29315a.f29319e.clear();
                f29315a.f29319e = null;
            }
            if (f29315a.f29318d != null) {
                f29315a.f29318d.clear();
                f29315a.f29318d = null;
            }
            f29315a = null;
        }
    }

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f29316b = sparseArray;
        sparseArray.put(1, C10834d.f29331a);
        f29316b.put(2, C10834d.f29332b);
        f29316b.put(3, C10834d.f29333c);
        f29316b.put(4, C10834d.f29334d);
        f29316b.put(5, C10834d.f29335e);
        f29316b.put(6, C10834d.f29336f);
        f29316b.put(7, C10834d.f29337g);
        f29316b.put(8, C10834d.f29338h);
        HashMap hashMap = new HashMap();
        f29317c = hashMap;
        hashMap.put(C10834d.f29331a, Integer.valueOf(1));
        f29317c.put(C10834d.f29332b, Integer.valueOf(2));
        f29317c.put(C10834d.f29333c, Integer.valueOf(3));
        f29317c.put(C10834d.f29334d, Integer.valueOf(4));
        f29317c.put(C10834d.f29335e, Integer.valueOf(5));
        f29317c.put(C10834d.f29336f, Integer.valueOf(6));
        f29317c.put(C10834d.f29337g, Integer.valueOf(7));
        f29317c.put(C10834d.f29338h, Integer.valueOf(8));
    }

    /* renamed from: b */
    private Typeface m31778b(int i) {
        String str = (String) this.f29319e.get((String) f29316b.get(i));
        if (this.f29320f != null) {
            try {
                return Typeface.createFromAsset(this.f29320f.getAssets(), str);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Typeface mo26158a(int i) {
        Typeface typeface = (Typeface) this.f29318d.get(i, null);
        if (typeface != null) {
            return typeface;
        }
        Typeface b = m31778b(i);
        this.f29318d.put(i, b);
        return b;
    }

    /* renamed from: a */
    public final Typeface mo26159a(String str) {
        if (this.f29319e.containsKey(str)) {
            return mo26158a(((Integer) f29317c.get(str)).intValue());
        }
        return null;
    }

    /* renamed from: a */
    public final void mo26160a(Context context, Map<String, String> map) {
        if (context != null && map != null) {
            this.f29320f = context.getApplicationContext();
            this.f29319e = map;
            m31780c();
        }
    }
}
