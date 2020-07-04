package com.bytedance.ies.bullet.core.params;

import android.net.Uri;
import android.net.Uri.Builder;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.ies.bullet.core.params.o */
public final class C10472o {

    /* renamed from: com.bytedance.ies.bullet.core.params.o$a */
    static final class C10473a extends Lambda implements C7563m<Uri, String, String> {

        /* renamed from: a */
        public static final C10473a f28196a = new C10473a();

        C10473a() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m30853a((Uri) obj, (String) obj2);
        }

        /* renamed from: a */
        private static String m30853a(Uri uri, String str) {
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "<anonymous parameter 1>");
            return uri.getAuthority();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.params.o$b */
    static final class C10474b extends Lambda implements C48006q<Builder, String, String, Builder> {

        /* renamed from: a */
        public static final C10474b f28197a = new C10474b();

        C10474b() {
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m30854a((Builder) obj, (String) obj2, (String) obj3);
        }

        /* renamed from: a */
        private static Builder m30854a(Builder builder, String str, String str2) {
            C7573i.m23587b(builder, "builder");
            C7573i.m23587b(str, "<anonymous parameter 1>");
            C7573i.m23587b(str2, "value");
            builder.authority(str2);
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.params.o$c */
    static final class C10475c extends Lambda implements C7563m<Uri, String, List<String>> {

        /* renamed from: a */
        public static final C10475c f28198a = new C10475c();

        C10475c() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m30855a((Uri) obj, (String) obj2);
        }

        /* renamed from: a */
        private static List<String> m30855a(Uri uri, String str) {
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "<anonymous parameter 1>");
            return uri.getPathSegments();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.params.o$d */
    static final class C10476d extends Lambda implements C48006q<Builder, String, List<? extends String>, Builder> {

        /* renamed from: a */
        public static final C10476d f28199a = new C10476d();

        C10476d() {
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m30856a((Builder) obj, (String) obj2, (List) obj3);
        }

        /* renamed from: a */
        private static Builder m30856a(Builder builder, String str, List<String> list) {
            C7573i.m23587b(builder, "builder");
            C7573i.m23587b(str, "<anonymous parameter 1>");
            C7573i.m23587b(list, "value");
            for (String appendPath : list) {
                builder.appendPath(appendPath);
            }
            return builder;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.params.o$e */
    static final class C10477e extends Lambda implements C7563m<Uri, String, String> {

        /* renamed from: a */
        public static final C10477e f28200a = new C10477e();

        C10477e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m30857a((Uri) obj, (String) obj2);
        }

        /* renamed from: a */
        private static String m30857a(Uri uri, String str) {
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "<anonymous parameter 1>");
            List pathSegments = uri.getPathSegments();
            if (pathSegments != null) {
                return (String) C7525m.m23513g(pathSegments);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.params.o$f */
    static final class C10478f extends Lambda implements C48006q<Builder, String, String, Builder> {

        /* renamed from: a */
        public static final C10478f f28201a = new C10478f();

        C10478f() {
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m30858a((Builder) obj, (String) obj2, (String) obj3);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
            if (r6 != null) goto L_0x004d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.net.Uri.Builder m30858a(android.net.Uri.Builder r5, java.lang.String r6, java.lang.String r7) {
            /*
                java.lang.String r0 = "builder"
                kotlin.jvm.internal.C7573i.m23587b(r5, r0)
                java.lang.String r0 = "<anonymous parameter 1>"
                kotlin.jvm.internal.C7573i.m23587b(r6, r0)
                java.lang.String r6 = "value"
                kotlin.jvm.internal.C7573i.m23587b(r7, r6)
                android.net.Uri r6 = r5.build()
                r0 = 0
                r1 = 1
                r2 = 0
                if (r6 == 0) goto L_0x004c
                java.lang.String r6 = r6.getPath()
                if (r6 == 0) goto L_0x004c
                r3 = r6
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                int r3 = r3.length()
                if (r3 != 0) goto L_0x0029
                r3 = 1
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 != 0) goto L_0x002d
                goto L_0x002e
            L_0x002d:
                r6 = r2
            L_0x002e:
                if (r6 == 0) goto L_0x004c
                java.lang.String r3 = "/"
                r4 = 2
                boolean r3 = kotlin.text.C7634n.m23721b(r6, r3, false)
                if (r3 == 0) goto L_0x003a
                goto L_0x003b
            L_0x003a:
                r6 = r2
            L_0x003b:
                if (r6 == 0) goto L_0x004c
                int r3 = r6.length()
                kotlin.e.c r3 = kotlin.p356e.C7551d.m23565b(r1, r3)
                java.lang.String r6 = kotlin.text.C7634n.m23741a(r6, r3)
                if (r6 == 0) goto L_0x004c
                goto L_0x004d
            L_0x004c:
                r6 = r2
            L_0x004d:
                r5.path(r7)
                if (r6 == 0) goto L_0x0065
                r7 = r6
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                int r7 = r7.length()
                if (r7 != 0) goto L_0x005c
                r0 = 1
            L_0x005c:
                if (r0 != 0) goto L_0x005f
                goto L_0x0060
            L_0x005f:
                r6 = r2
            L_0x0060:
                if (r6 == 0) goto L_0x0065
                r5.appendPath(r6)
            L_0x0065:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.core.params.C10472o.C10478f.m30858a(android.net.Uri$Builder, java.lang.String, java.lang.String):android.net.Uri$Builder");
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.params.o$g */
    static final class C10479g extends Lambda implements C7563m<Uri, String, String> {

        /* renamed from: a */
        public static final C10479g f28202a = new C10479g();

        C10479g() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m30859a((Uri) obj, (String) obj2);
        }

        /* renamed from: a */
        private static String m30859a(Uri uri, String str) {
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "<anonymous parameter 1>");
            List pathSegments = uri.getPathSegments();
            if (pathSegments != null) {
                return (String) C7525m.m23517i(pathSegments);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.params.o$h */
    static final class C10480h extends Lambda implements C48006q<Builder, String, String, Builder> {

        /* renamed from: a */
        public static final C10480h f28203a = new C10480h();

        C10480h() {
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m30860a((Builder) obj, (String) obj2, (String) obj3);
        }

        /* renamed from: a */
        private static Builder m30860a(Builder builder, String str, String str2) {
            C7573i.m23587b(builder, "builder");
            C7573i.m23587b(str, "<anonymous parameter 1>");
            C7573i.m23587b(str2, "value");
            builder.appendPath(str2);
            return builder;
        }
    }

    /* renamed from: a */
    public static final void m30852a() {
        C10465h a = C10469l.m30840a();
        a.mo25256a(Uri.class, (C7563m<? super R, ? super String, ? extends T>) new C10442xd8df42b9<Object,Object,Object>());
        a.mo25257a(Builder.class, (C48006q<? super R, ? super String, ? super T, ? extends R>) new C10450xd8df42ba<Object,Object,Object,Object>());
        C10465h b = C10469l.m30841b();
        b.mo25256a(Uri.class, (C7563m<? super R, ? super String, ? extends T>) new C10451xd8df42bb<Object,Object,Object>());
        b.mo25257a(Builder.class, (C48006q<? super R, ? super String, ? super T, ? extends R>) new C10452xd8df42bc<Object,Object,Object,Object>());
        C10465h c = C10469l.m30842c();
        c.mo25256a(Uri.class, (C7563m<? super R, ? super String, ? extends T>) new C10453xd8df42bd<Object,Object,Object>());
        c.mo25257a(Builder.class, (C48006q<? super R, ? super String, ? super T, ? extends R>) new C10454xd8df42be<Object,Object,Object,Object>());
        C10465h d = C10469l.m30843d();
        d.mo25256a(Uri.class, (C7563m<? super R, ? super String, ? extends T>) new C10455xd8df42bf<Object,Object,Object>());
        d.mo25257a(Builder.class, (C48006q<? super R, ? super String, ? super T, ? extends R>) new C10456xd8df42c0<Object,Object,Object,Object>());
        C10465h e = C10469l.m30844e();
        e.mo25256a(Uri.class, (C7563m<? super R, ? super String, ? extends T>) new C10457xd8df42c1<Object,Object,Object>());
        e.mo25257a(Builder.class, (C48006q<? super R, ? super String, ? super T, ? extends R>) new C10443x43091497<Object,Object,Object,Object>());
        C10465h f = C10469l.m30845f();
        f.mo25256a(Uri.class, (C7563m<? super R, ? super String, ? extends T>) new C10444x43091498<Object,Object,Object>());
        f.mo25257a(Builder.class, (C48006q<? super R, ? super String, ? super T, ? extends R>) new C10445x43091499<Object,Object,Object,Object>());
        C10465h g = C10469l.m30846g();
        g.mo25256a(Uri.class, (C7563m<? super R, ? super String, ? extends T>) new C10446x4309149a<Object,Object,Object>());
        g.mo25257a(Builder.class, (C48006q<? super R, ? super String, ? super T, ? extends R>) new C10447x4309149b<Object,Object,Object,Object>());
        C10465h a2 = C10481p.m30861a();
        a2.mo25256a(Uri.class, (C7563m<? super R, ? super String, ? extends T>) new C10448x4309149c<Object,Object,Object>());
        a2.mo25257a(Builder.class, (C48006q<? super R, ? super String, ? super T, ? extends R>) new C10449x4309149d<Object,Object,Object,Object>());
        C10481p.m30862b().mo25256a(Uri.class, (C7563m<? super R, ? super String, ? extends T>) C10473a.f28196a);
        C10481p.m30862b().mo25257a(Builder.class, (C48006q<? super R, ? super String, ? super T, ? extends R>) C10474b.f28197a);
        C10481p.m30863c().mo25256a(Uri.class, (C7563m<? super R, ? super String, ? extends T>) C10475c.f28198a);
        C10481p.m30863c().mo25257a(Builder.class, (C48006q<? super R, ? super String, ? super T, ? extends R>) C10476d.f28199a);
        C10481p.m30864d().mo25256a(Uri.class, (C7563m<? super R, ? super String, ? extends T>) C10477e.f28200a);
        C10481p.m30864d().mo25257a(Builder.class, (C48006q<? super R, ? super String, ? super T, ? extends R>) C10478f.f28201a);
        C10481p.m30865e().mo25256a(Uri.class, (C7563m<? super R, ? super String, ? extends T>) C10479g.f28202a);
        C10481p.m30865e().mo25257a(Builder.class, (C48006q<? super R, ? super String, ? super T, ? extends R>) C10480h.f28203a);
    }
}
