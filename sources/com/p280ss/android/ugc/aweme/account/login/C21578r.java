package com.p280ss.android.ugc.aweme.account.login;

import android.support.p022v4.util.C0888a;
import com.p280ss.android.p284b.C6729a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: com.ss.android.ugc.aweme.account.login.r */
public final class C21578r {

    /* renamed from: a */
    public static final String f57913a;

    /* renamed from: b */
    public static final String f57914b;

    /* renamed from: c */
    public static final String f57915c;

    /* renamed from: d */
    public static final C0888a<Integer> f57916d = new C0888a<>();

    /* renamed from: e */
    public static final C0888a<Integer> f57917e = new C0888a<>();

    /* renamed from: f */
    public static final C0888a<Integer> f57918f = new C0888a<>();

    /* renamed from: g */
    public static String f57919g = "setting";

    /* renamed from: h */
    public static String f57920h = "personal_home";

    /* renamed from: i */
    public static String f57921i = "enter_from_after_login";

    /* renamed from: j */
    public static String f57922j = "ENTER_REASON";

    /* renamed from: k */
    public static String f57923k = "ENTER_TYPE";

    /* renamed from: l */
    public static String f57924l = "pro_account_type";

    /* renamed from: m */
    public static String f57925m = "pro_account_category";

    /* renamed from: n */
    public static String f57926n = "current_use_mobile";

    /* renamed from: o */
    public static String f57927o = "url_path";

    /* renamed from: p */
    public static final int f57928p = BaseNotice.HASHTAG;

    /* renamed from: q */
    public static final int f57929q;

    /* renamed from: r */
    public static final int f57930r;

    /* renamed from: s */
    public static final int f57931s;

    /* renamed from: t */
    public static final int f57932t;

    /* renamed from: u */
    public static final int f57933u;

    /* renamed from: v */
    private static int f57934v;

    static {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C6729a.f19216e);
        sb.append("/passport/auth/unbind/");
        f57913a = sb.toString();
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(C6729a.f19216e);
        sb2.append("/2/user/info/");
        f57914b = sb2.toString();
        StringBuilder sb3 = new StringBuilder("https://");
        sb3.append(C6729a.f19216e);
        sb3.append("/aweme/v1/multiple/login/unbind/");
        f57915c = sb3.toString();
        f57916d.add(Integer.valueOf(2020));
        f57916d.add(Integer.valueOf(2032));
        f57916d.add(Integer.valueOf(2033));
        f57916d.add(Integer.valueOf(2025));
        f57916d.add(Integer.valueOf(2031));
        f57917e.add(Integer.valueOf(2020));
        f57917e.add(Integer.valueOf(2022));
        f57917e.add(Integer.valueOf(2025));
        f57918f.add(Integer.valueOf(1101));
        f57918f.add(Integer.valueOf(1102));
        f57918f.add(Integer.valueOf(1103));
        f57918f.add(Integer.valueOf(1104));
        f57918f.add(Integer.valueOf(1105));
        f57934v = 100;
        f57934v = BaseNotice.HASHTAG;
        int i = f57934v + 1;
        f57934v = i;
        f57929q = i;
        int i2 = f57934v + 1;
        f57934v = i2;
        f57930r = i2;
        int i3 = f57934v + 1;
        f57934v = i3;
        f57931s = i3;
        int i4 = f57934v + 1;
        f57934v = i4;
        f57932t = i4;
        int i5 = f57934v + 1;
        f57934v = i5;
        f57933u = i5;
    }
}
