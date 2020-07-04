package com.p280ss.android.ugc.aweme.follow.presenter;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.e */
public final class C29457e {

    /* renamed from: a */
    public static final C29458a f77700a = new C29458a(null);

    /* renamed from: b */
    private String f77701b = "";

    /* renamed from: c */
    private Integer f77702c = Integer.valueOf(0);

    /* renamed from: d */
    private String f77703d = "";

    /* renamed from: e */
    private String f77704e = "";

    /* renamed from: f */
    private String f77705f = "";

    /* renamed from: g */
    private final int f77706g;

    /* renamed from: h */
    private final int f77707h;

    /* renamed from: i */
    private final int f77708i;

    /* renamed from: j */
    private final String f77709j;

    /* renamed from: com.ss.android.ugc.aweme.follow.presenter.e$a */
    public static final class C29458a {
        private C29458a() {
        }

        public /* synthetic */ C29458a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C29457e m96955a(int i, int i2, int i3, String str) {
            C7573i.m23587b(str, "impressionIds");
            return new C29457e(i, i2, i3, str);
        }
    }

    /* renamed from: a */
    public static final C29457e m96948a(int i, int i2, int i3, String str) {
        return C29458a.m96955a(i, i2, i3, str);
    }

    /* renamed from: a */
    public final C29456d mo75459a() {
        C29456d dVar = new C29456d(this.f77706g, this.f77707h, this.f77708i, this.f77709j, this.f77701b, this.f77702c, this.f77703d, this.f77704e, this.f77705f);
        return dVar;
    }

    /* renamed from: a */
    public final C29457e mo75460a(Integer num) {
        this.f77702c = num;
        return this;
    }

    /* renamed from: b */
    public final C29457e mo75462b(String str) {
        this.f77703d = str;
        return this;
    }

    /* renamed from: c */
    public final C29457e mo75463c(String str) {
        this.f77704e = str;
        return this;
    }

    /* renamed from: d */
    public final C29457e mo75464d(String str) {
        this.f77705f = str;
        return this;
    }

    /* renamed from: a */
    public final C29457e mo75461a(String str) {
        this.f77701b = str;
        return this;
    }

    public C29457e(int i, int i2, int i3, String str) {
        C7573i.m23587b(str, "impressionIds");
        this.f77706g = i;
        this.f77707h = i2;
        this.f77708i = i3;
        this.f77709j = str;
    }
}
