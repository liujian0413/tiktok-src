package com.p280ss.android.p298ml.process;

import com.p280ss.android.p298ml.process.p889a.C19895a;
import com.p280ss.android.p298ml.process.p889a.C19896b;
import com.p280ss.android.p298ml.process.p889a.C19897c;
import com.p280ss.android.p298ml.process.p889a.C19898d;
import com.p280ss.android.p298ml.process.p889a.C19899e;
import com.p280ss.android.p298ml.process.p889a.C19900f;
import com.p280ss.android.p298ml.process.p889a.C19901g;
import com.p280ss.android.p298ml.process.p889a.C19902h;
import com.p280ss.android.p298ml.process.p889a.C19903i;
import com.p280ss.android.p298ml.process.p889a.C19904j;
import com.p280ss.android.p298ml.process.p889a.C19905k;
import java.util.HashMap;

/* renamed from: com.ss.android.ml.process.f */
public final class C6836f {

    /* renamed from: a */
    private static C6836f f19462a = new C6836f();

    /* renamed from: b */
    private HashMap<String, C6835e> f19463b = new HashMap<>();

    /* renamed from: a */
    public static C6836f m21266a() {
        return f19462a;
    }

    public C6836f() {
        this.f19463b.put("log", new C19897c());
        this.f19463b.put("log1p", new C19896b());
        this.f19463b.put("sigmoid", new C19904j());
        this.f19463b.put("div", new C19895a());
        this.f19463b.put("max", new C19898d());
        this.f19463b.put("min", new C19899e());
        this.f19463b.put("normalize", new C19900f());
        this.f19463b.put("standardize", new C19905k());
        this.f19463b.put("predict_regression", new C19903i());
        this.f19463b.put("predict_bin", new C19902h());
        this.f19463b.put("onehotEncode", new C19901g());
    }

    /* renamed from: a */
    public final C6835e mo16696a(String str) {
        return (C6835e) this.f19463b.get(str);
    }
}
