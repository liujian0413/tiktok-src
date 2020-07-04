package com.bytedance.lobby;

import android.os.Bundle;

/* renamed from: com.bytedance.lobby.b */
public final class C12203b {

    /* renamed from: a */
    public int f32465a;

    /* renamed from: b */
    public String f32466b;

    /* renamed from: c */
    public String f32467c;

    /* renamed from: d */
    public Bundle f32468d;

    /* renamed from: com.bytedance.lobby.b$a */
    public static class C12205a {

        /* renamed from: a */
        public int f32469a = 1;

        /* renamed from: b */
        public String f32470b;

        /* renamed from: c */
        public String f32471c;

        /* renamed from: d */
        public Bundle f32472d;

        /* renamed from: a */
        public final C12203b mo29943a() {
            return new C12203b(this);
        }

        /* renamed from: a */
        public final C12205a mo29941a(int i) {
            this.f32469a = 2;
            return this;
        }

        /* renamed from: a */
        public final C12205a mo29942a(Bundle bundle) {
            this.f32472d = bundle;
            return this;
        }

        C12205a(String str, String str2) {
            this.f32470b = str;
            this.f32471c = str2;
        }
    }

    /* renamed from: com.bytedance.lobby.b$b */
    public static final class C12206b extends C12205a {
        public C12206b(String str) {
            super("facebook", str);
        }
    }

    /* renamed from: com.bytedance.lobby.b$c */
    public static final class C12207c extends C12205a {
        public C12207c(String str) {
            super("google", str);
        }
    }

    /* renamed from: com.bytedance.lobby.b$d */
    public static final class C12208d extends C12205a {
        public C12208d(String str) {
            super("instagram", str);
        }
    }

    /* renamed from: com.bytedance.lobby.b$e */
    public static final class C12209e extends C12205a {
        public C12209e(String str) {
            super("kakaotalk", str);
        }
    }

    /* renamed from: com.bytedance.lobby.b$f */
    public static final class C12210f extends C12205a {
        public C12210f(String str) {
            super("line", str);
        }
    }

    /* renamed from: com.bytedance.lobby.b$g */
    public static final class C12211g extends C12205a {
        public C12211g(String str) {
            super("twitter", str);
        }
    }

    /* renamed from: com.bytedance.lobby.b$h */
    public static final class C12212h extends C12205a {
        public C12212h(String str) {
            super("vk", str);
        }
    }

    private C12203b(C12205a aVar) {
        Bundle bundle;
        this.f32465a = aVar.f32469a;
        this.f32466b = aVar.f32470b;
        this.f32467c = aVar.f32471c;
        if (aVar.f32472d == null) {
            bundle = new Bundle();
        } else {
            bundle = aVar.f32472d;
        }
        this.f32468d = bundle;
    }
}
