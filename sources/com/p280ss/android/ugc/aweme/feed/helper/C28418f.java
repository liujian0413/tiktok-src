package com.p280ss.android.ugc.aweme.feed.helper;

import com.p280ss.android.ugc.aweme.video.C43222g;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.f */
public class C28418f {

    /* renamed from: i */
    private static volatile C28418f f74930i;

    /* renamed from: a */
    public C43222g f74931a;

    /* renamed from: b */
    public String f74932b;

    /* renamed from: c */
    public long f74933c = -1;

    /* renamed from: d */
    public boolean f74934d;

    /* renamed from: e */
    public boolean f74935e;

    /* renamed from: f */
    public int f74936f;

    /* renamed from: g */
    public boolean f74937g;

    /* renamed from: h */
    public boolean f74938h;

    private C28418f() {
    }

    /* renamed from: a */
    public static C28418f m93413a() {
        if (f74930i == null) {
            synchronized (C28418f.class) {
                if (f74930i == null) {
                    f74930i = new C28418f();
                }
            }
        }
        return f74930i;
    }
}
