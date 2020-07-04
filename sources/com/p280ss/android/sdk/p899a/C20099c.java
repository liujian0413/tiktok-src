package com.p280ss.android.sdk.p899a;

import android.text.TextUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.sdk.a.c */
public final class C20099c {

    /* renamed from: a */
    public static final C20099c[] f54364a = {f54367d, f54368e, f54369f, f54370g, f54371h, f54372i, f54373j, f54366c};

    /* renamed from: b */
    public static final C20099c[] f54365b = {f54367d, f54368e, f54369f, f54370g, f54371h, f54372i, f54373j};

    /* renamed from: c */
    public static final C20099c f54366c = new C20099c("mobile", R.drawable.bt, R.string.dyb);

    /* renamed from: d */
    public static final C20099c f54367d = new C20099c("facebook", R.drawable.wb, R.string.dy6);

    /* renamed from: e */
    public static final C20099c f54368e = new C20099c("twitter", R.drawable.wg, R.string.dyg, new String[]{"twitter", "m_twitter"});

    /* renamed from: f */
    public static final C20099c f54369f = new C20099c("google", R.drawable.wc, R.string.dy7);

    /* renamed from: g */
    public static final C20099c f54370g = new C20099c("line", R.drawable.wf, R.string.dya);

    /* renamed from: h */
    public static final C20099c f54371h = new C20099c("kakaotalk", R.drawable.we, R.string.dy_);

    /* renamed from: i */
    public static final C20099c f54372i = new C20099c("instagram", R.drawable.wd, R.string.dy_);

    /* renamed from: j */
    public static final C20099c f54373j = new C20099c("vk", R.drawable.wh, R.string.dyh);

    /* renamed from: k */
    public static final C20099c f54374k = new C20099c("flipchat", -1, -1);

    /* renamed from: l */
    public int f54375l;

    /* renamed from: m */
    public String f54376m;

    /* renamed from: n */
    public String[] f54377n;

    /* renamed from: o */
    public final int f54378o;

    /* renamed from: p */
    public boolean f54379p;

    /* renamed from: q */
    public String f54380q;

    /* renamed from: r */
    public String f54381r;

    /* renamed from: s */
    public String f54382s;

    /* renamed from: t */
    public long f54383t;

    /* renamed from: u */
    public long f54384u;

    /* renamed from: v */
    public long f54385v;

    /* renamed from: a */
    public static C20099c m66277a(String str) {
        C20099c[] cVarArr;
        for (C20099c cVar : f54364a) {
            if (TextUtils.equals(cVar.f54376m, str)) {
                return cVar;
            }
        }
        return null;
    }

    public C20099c(String str, int i, int i2) {
        this(str, i, i2, null);
    }

    private C20099c(String str, int i, int i2, String[] strArr) {
        this.f54385v = -1;
        this.f54375l = i;
        this.f54376m = str;
        this.f54378o = i2;
        this.f54380q = "";
        this.f54382s = "";
        this.f54377n = strArr;
    }
}
