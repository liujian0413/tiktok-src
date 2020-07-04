package com.p280ss.android.ugc.aweme.commercialize.utils;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b */
public final class C25256b {

    /* renamed from: a */
    public final Aweme f66593a;

    /* renamed from: b */
    public final String f66594b;

    /* renamed from: c */
    public final String f66595c;

    /* renamed from: d */
    public final String f66596d;

    /* renamed from: e */
    public final String f66597e;

    /* renamed from: f */
    public final String f66598f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b$a */
    public static final class C25257a {

        /* renamed from: a */
        private Aweme f66599a;

        /* renamed from: b */
        private String f66600b = "";

        /* renamed from: c */
        private String f66601c = "";

        /* renamed from: d */
        private String f66602d = "";

        /* renamed from: e */
        private String f66603e = "";

        /* renamed from: f */
        private String f66604f = "";

        /* renamed from: a */
        public final C25256b mo65857a() {
            C25256b bVar = new C25256b(this.f66599a, this.f66600b, this.f66601c, this.f66602d, this.f66603e, this.f66604f, null);
            return bVar;
        }

        /* renamed from: a */
        public final C25257a mo65855a(Aweme aweme) {
            C7573i.m23587b(aweme, "aweme");
            C25257a aVar = this;
            aVar.f66599a = aweme;
            return aVar;
        }

        /* renamed from: b */
        public final C25257a mo65858b(String str) {
            C7573i.m23587b(str, "refer");
            C25257a aVar = this;
            aVar.f66601c = str;
            return aVar;
        }

        /* renamed from: c */
        public final C25257a mo65859c(String str) {
            C7573i.m23587b(str, "showFailReason");
            C25257a aVar = this;
            aVar.f66602d = str;
            return aVar;
        }

        /* renamed from: d */
        public final C25257a mo65860d(String str) {
            C7573i.m23587b(str, "cardType");
            C25257a aVar = this;
            aVar.f66603e = str;
            return aVar;
        }

        /* renamed from: e */
        public final C25257a mo65861e(String str) {
            C7573i.m23587b(str, "status");
            C25257a aVar = this;
            aVar.f66604f = str;
            return aVar;
        }

        /* renamed from: a */
        public final C25257a mo65856a(String str) {
            C7573i.m23587b(str, "label");
            C25257a aVar = this;
            aVar.f66600b = str;
            return aVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f66598f, (java.lang.Object) r3.f66598f) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.commercialize.utils.C25256b
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.commercialize.utils.b r3 = (com.p280ss.android.ugc.aweme.commercialize.utils.C25256b) r3
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.f66593a
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r3.f66593a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f66594b
            java.lang.String r1 = r3.f66594b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f66595c
            java.lang.String r1 = r3.f66595c
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f66596d
            java.lang.String r1 = r3.f66596d
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f66597e
            java.lang.String r1 = r3.f66597e
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f66598f
            java.lang.String r3 = r3.f66598f
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r3 = 0
            return r3
        L_0x0047:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25256b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Aweme aweme = this.f66593a;
        int i = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        String str = this.f66594b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f66595c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f66596d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f66597e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f66598f;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        boolean z;
        boolean z2;
        StringBuilder sb = new StringBuilder("label=");
        sb.append(this.f66594b);
        sb.append(", refer=");
        sb.append(this.f66595c);
        StringBuilder sb2 = new StringBuilder(sb.toString());
        boolean z3 = false;
        if (this.f66596d.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sb3 = new StringBuilder(", showFailReason=");
            sb3.append(this.f66596d);
            sb2.append(sb3.toString());
        }
        if (this.f66597e.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            StringBuilder sb4 = new StringBuilder(", cardType=");
            sb4.append(this.f66597e);
            sb2.append(sb4.toString());
        }
        if (this.f66598f.length() > 0) {
            z3 = true;
        }
        if (z3) {
            StringBuilder sb5 = new StringBuilder(", status=");
            sb5.append(this.f66598f);
            sb2.append(sb5.toString());
        }
        if (this.f66593a != null) {
            StringBuilder sb6 = new StringBuilder(", aweme_id=");
            sb6.append(this.f66593a.getAid());
            sb2.append(sb6.toString());
        }
        String sb7 = sb2.toString();
        C7573i.m23582a((Object) sb7, "builder.toString()");
        return sb7;
    }

    private C25256b(Aweme aweme, String str, String str2, String str3, String str4, String str5) {
        this.f66593a = aweme;
        this.f66594b = str;
        this.f66595c = str2;
        this.f66596d = str3;
        this.f66597e = str4;
        this.f66598f = str5;
    }

    public /* synthetic */ C25256b(Aweme aweme, String str, String str2, String str3, String str4, String str5, C7571f fVar) {
        this(aweme, str, str2, str3, str4, str5);
    }
}
