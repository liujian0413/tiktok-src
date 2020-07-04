package com.p280ss.android.deviceregister;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.deviceregister.i */
final class C19326i {

    /* renamed from: a */
    final Long f52235a;

    /* renamed from: b */
    final Long f52236b;

    /* renamed from: c */
    final Long f52237c;

    /* renamed from: d */
    final Long f52238d;

    /* renamed from: e */
    final Long f52239e;

    /* renamed from: f */
    final Long f52240f;

    /* renamed from: g */
    final Integer f52241g;

    /* renamed from: h */
    final List<C19328a> f52242h;

    /* renamed from: i */
    final String f52243i;

    /* renamed from: j */
    final Long f52244j;

    /* renamed from: k */
    final Integer f52245k;

    /* renamed from: com.ss.android.deviceregister.i$a */
    static final class C19328a {

        /* renamed from: a */
        final Long f52246a;

        /* renamed from: b */
        final Long f52247b;

        /* renamed from: c */
        final String f52248c;

        /* renamed from: d */
        final String f52249d;

        /* renamed from: e */
        final String f52250e;

        /* renamed from: f */
        final String f52251f;

        /* renamed from: g */
        final Integer f52252g;

        /* renamed from: com.ss.android.deviceregister.i$a$a */
        static class C19329a {

            /* renamed from: a */
            private Long f52253a;

            /* renamed from: b */
            private Long f52254b;

            /* renamed from: c */
            private String f52255c;

            /* renamed from: d */
            private String f52256d;

            /* renamed from: e */
            private String f52257e;

            /* renamed from: f */
            private String f52258f;

            /* renamed from: g */
            private Integer f52259g;

            C19329a() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final C19328a mo51226a() {
                C19328a aVar = new C19328a(this.f52253a, this.f52254b, this.f52255c, this.f52256d, this.f52257e, this.f52258f, this.f52259g);
                return aVar;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final C19329a mo51223a(Integer num) {
                this.f52259g = num;
                return this;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final C19329a mo51227b(Long l) {
                this.f52254b = l;
                return this;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public final C19329a mo51229c(String str) {
                this.f52257e = str;
                return this;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public final C19329a mo51230d(String str) {
                this.f52258f = str;
                return this;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final C19329a mo51224a(Long l) {
                this.f52253a = l;
                return this;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final C19329a mo51228b(String str) {
                this.f52256d = str;
                return this;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final C19329a mo51225a(String str) {
                this.f52255c = str;
                return this;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Call{netRequestStart=");
            sb.append(this.f52246a);
            sb.append(", netRequestEnd=");
            sb.append(this.f52247b);
            sb.append(", url='");
            sb.append(this.f52248c);
            sb.append('\'');
            sb.append(", data='");
            sb.append(this.f52249d);
            sb.append('\'');
            sb.append(", exception='");
            sb.append(this.f52250e);
            sb.append('\'');
            sb.append(", errorMessage='");
            sb.append(this.f52251f);
            sb.append('\'');
            sb.append(", nTry=");
            sb.append(this.f52252g);
            sb.append('}');
            return sb.toString();
        }

        C19328a(Long l, Long l2, String str, String str2, String str3, String str4, Integer num) {
            this.f52246a = l;
            this.f52247b = l2;
            this.f52248c = str;
            this.f52249d = str2;
            this.f52250e = str3;
            this.f52251f = str4;
            this.f52252g = num;
        }
    }

    /* renamed from: com.ss.android.deviceregister.i$b */
    static class C19330b {

        /* renamed from: a */
        public String f52260a;

        /* renamed from: b */
        private Long f52261b;

        /* renamed from: c */
        private Long f52262c;

        /* renamed from: d */
        private Long f52263d;

        /* renamed from: e */
        private Long f52264e;

        /* renamed from: f */
        private Long f52265f;

        /* renamed from: g */
        private Long f52266g;

        /* renamed from: h */
        private Integer f52267h;

        /* renamed from: i */
        private List<C19328a> f52268i = new ArrayList();

        /* renamed from: j */
        private Long f52269j;

        /* renamed from: k */
        private Integer f52270k;

        C19330b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C19326i mo51235a() {
            C19326i iVar = new C19326i(this.f52261b, this.f52262c, this.f52263d, this.f52264e, this.f52265f, this.f52266g, this.f52267h, this.f52268i, this.f52260a, this.f52269j, this.f52270k);
            return iVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C19330b mo51232a(Integer num) {
            this.f52267h = num;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C19330b mo51236b(Integer num) {
            this.f52270k = num;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final C19330b mo51238c(Long l) {
            this.f52263d = l;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final C19330b mo51239d(Long l) {
            this.f52264e = l;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final C19330b mo51240e(Long l) {
            this.f52265f = l;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public final C19330b mo51241f(Long l) {
            this.f52266g = l;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public final C19330b mo51242g(Long l) {
            this.f52269j = l;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C19330b mo51231a(C19328a aVar) {
            this.f52268i.add(aVar);
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C19330b mo51237b(Long l) {
            this.f52262c = l;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C19330b mo51233a(Long l) {
            this.f52261b = l;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C19330b mo51234a(String str) {
            this.f52260a = str;
            return this;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timestamp{timestampPrimaryId=");
        sb.append(this.f52245k);
        sb.append('}');
        return sb.toString();
    }

    private C19326i(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Integer num, List<C19328a> list, String str, Long l7, Integer num2) {
        this.f52235a = l;
        this.f52236b = l2;
        this.f52237c = l3;
        this.f52238d = l4;
        this.f52239e = l5;
        this.f52240f = l6;
        this.f52241g = num;
        this.f52242h = list;
        this.f52243i = str;
        this.f52244j = l7;
        this.f52245k = num2;
    }
}
