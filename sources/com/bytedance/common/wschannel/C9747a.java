package com.bytedance.common.wschannel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.common.wschannel.a */
public final class C9747a {

    /* renamed from: a */
    final int f26508a;

    /* renamed from: b */
    String f26509b;

    /* renamed from: c */
    String f26510c;

    /* renamed from: d */
    Map<String, String> f26511d = new HashMap();

    /* renamed from: e */
    List<String> f26512e = new ArrayList();

    /* renamed from: f */
    int f26513f;

    /* renamed from: g */
    int f26514g;

    /* renamed from: h */
    String f26515h;

    /* renamed from: i */
    int f26516i;

    /* renamed from: com.bytedance.common.wschannel.a$a */
    public static class C9748a {

        /* renamed from: a */
        Map<String, String> f26517a = new HashMap();

        /* renamed from: b */
        List<String> f26518b = new ArrayList();

        /* renamed from: c */
        private final int f26519c;

        /* renamed from: d */
        private int f26520d;

        /* renamed from: e */
        private int f26521e;

        /* renamed from: f */
        private int f26522f;

        /* renamed from: g */
        private String f26523g;

        /* renamed from: h */
        private String f26524h;

        /* renamed from: i */
        private String f26525i;

        /* renamed from: a */
        public final C9747a mo24133a() {
            C9747a aVar = new C9747a(this.f26521e, this.f26520d, this.f26522f, this.f26523g, this.f26519c, this.f26524h, this.f26525i, this.f26518b, this.f26517a);
            return aVar;
        }

        /* renamed from: a */
        public final C9748a mo24130a(String str) {
            this.f26523g = str;
            return this;
        }

        /* renamed from: b */
        public final C9748a mo24135b(String str) {
            this.f26524h = str;
            return this;
        }

        /* renamed from: c */
        public final C9748a mo24136c(int i) {
            this.f26520d = i;
            return this;
        }

        /* renamed from: d */
        public final C9748a mo24138d(int i) {
            this.f26522f = i;
            return this;
        }

        /* renamed from: a */
        public final C9748a mo24131a(List<String> list) {
            this.f26518b.addAll(list);
            return this;
        }

        /* renamed from: b */
        public final C9748a mo24134b(int i) {
            this.f26521e = 9;
            return this;
        }

        /* renamed from: c */
        public final C9748a mo24137c(String str) {
            this.f26525i = str;
            return this;
        }

        /* renamed from: a */
        public static C9748a m28742a(int i) {
            return new C9748a(1239108);
        }

        private C9748a(int i) {
            this.f26519c = i;
        }

        /* renamed from: a */
        public final C9748a mo24132a(Map<String, String> map) {
            this.f26517a.putAll(map);
            return this;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelInfo{channelId = ");
        sb.append(this.f26508a);
        sb.append(", deviceId = ");
        sb.append(this.f26510c);
        sb.append(", installId = ");
        sb.append(this.f26510c);
        sb.append(", fpid = ");
        sb.append(this.f26513f);
        sb.append(", aid = ");
        sb.append(this.f26514g);
        sb.append(", updateVersionCode = ");
        sb.append(this.f26516i);
        sb.append(", appKey = ");
        sb.append(this.f26515h);
        sb.append(", extra = ");
        sb.append(this.f26511d);
        sb.append(", urls = ");
        sb.append(this.f26512e);
        sb.append("}");
        return sb.toString();
    }

    public C9747a(int i, int i2, int i3, String str, int i4, String str2, String str3, List<String> list, Map<String, String> map) {
        this.f26508a = i4;
        this.f26509b = str2;
        this.f26510c = str3;
        this.f26516i = i3;
        if (list != null) {
            this.f26512e.addAll(list);
        }
        if (map != null) {
            this.f26511d.putAll(map);
        }
        this.f26513f = i;
        this.f26514g = i2;
        this.f26515h = str;
    }
}
