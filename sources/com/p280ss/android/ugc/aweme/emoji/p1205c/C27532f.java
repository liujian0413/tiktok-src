package com.p280ss.android.ugc.aweme.emoji.p1205c;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C7519g;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.emoji.c.f */
public final class C27532f {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f72579a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27532f.class), "mDefaultEmojiList", "getMDefaultEmojiList()Ljava/util/List;"))};

    /* renamed from: b */
    public static final C27532f f72580b = new C27532f();

    /* renamed from: c */
    private static String f72581c;

    /* renamed from: d */
    private static final C6600e f72582d = new C6600e();

    /* renamed from: e */
    private static final Type f72583e = new C27533a().type;

    /* renamed from: f */
    private static final C7541d f72584f = C7546e.m23568a(LazyThreadSafetyMode.NONE, C27534b.f72587a);

    /* renamed from: g */
    private static final AtomicBoolean f72585g = new AtomicBoolean(false);

    /* renamed from: h */
    private static LinkedList<String> f72586h;

    /* renamed from: com.ss.android.ugc.aweme.emoji.c.f$a */
    public static final class C27533a extends C6597a<LinkedList<String>> {
        C27533a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.c.f$b */
    static final class C27534b extends Lambda implements C7561a<List<? extends String>> {

        /* renamed from: a */
        public static final C27534b f72587a = new C27534b();

        C27534b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m90246a();
        }

        /* renamed from: a */
        private static List<String> m90246a() {
            String[] stringArray = C6399b.m19921a().getResources().getStringArray(R.array.a0);
            C7573i.m23582a((Object) stringArray, "AppContextManager.getApp…ay.mini_emoji_panel_list)");
            return C7519g.m23447d((T[]) stringArray);
        }
    }

    private C27532f() {
    }

    /* renamed from: e */
    private final List<String> m90240e() {
        return (List) f72584f.getValue();
    }

    /* renamed from: d */
    private final C22903bl<String> m90239d() {
        return new C22903bl<>(m90238c(), "");
    }

    /* renamed from: c */
    private static String m90238c() {
        StringBuilder sb = new StringBuilder("mini_emoji_panel_list_string");
        String str = f72581c;
        if (str == null) {
            C7573i.m23583a("mUserId");
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b A[Catch:{ Exception -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021 A[Catch:{ Exception -> 0x0031 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m90242g() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.app.bl r0 = r3.m90239d()
            java.lang.Object r0 = r0.mo59877d()
            java.lang.String r0 = (java.lang.String) r0
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x0031 }
            if (r1 == 0) goto L_0x0018
            int r1 = r1.length()     // Catch:{ Exception -> 0x0031 }
            if (r1 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r1 = 0
            goto L_0x0019
        L_0x0018:
            r1 = 1
        L_0x0019:
            if (r1 == 0) goto L_0x0021
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ Exception -> 0x0031 }
            r0.<init>()     // Catch:{ Exception -> 0x0031 }
            goto L_0x0036
        L_0x0021:
            com.google.gson.e r1 = f72582d     // Catch:{ Exception -> 0x0031 }
            java.lang.reflect.Type r2 = f72583e     // Catch:{ Exception -> 0x0031 }
            java.lang.Object r0 = r1.mo15975a(r0, r2)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = "mGson.fromJson(string, mDataType)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)     // Catch:{ Exception -> 0x0031 }
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch:{ Exception -> 0x0031 }
            goto L_0x0036
        L_0x0031:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
        L_0x0036:
            f72586h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.emoji.p1205c.C27532f.m90242g():void");
    }

    /* renamed from: b */
    public final void mo70752b() {
        if (f72585g.get()) {
            m90239d().mo59871a(f72582d.mo15980b(m90241f(), f72583e));
            f72585g.set(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if ((!kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r0, (java.lang.Object) r1.getCurUserId())) != false) goto L_0x0026;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.LinkedList<java.lang.String> m90241f() {
        /*
            r3 = this;
            java.util.LinkedList<java.lang.String> r0 = f72586h
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = f72581c
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = f72581c
            if (r0 != 0) goto L_0x0011
            java.lang.String r1 = "mUserId"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0011:
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r2 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.lang.String r1 = r1.getCurUserId()
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x003d
        L_0x0026:
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r1 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.String r0 = r0.getCurUserId()
            java.lang.String r1 = "AccountProxyService.userService().curUserId"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            f72581c = r0
            r3.m90242g()
        L_0x003d:
            java.util.LinkedList<java.lang.String> r0 = f72586h
            if (r0 != 0) goto L_0x0046
            java.lang.String r1 = "mCurrentUserData"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.emoji.p1205c.C27532f.m90241f():java.util.LinkedList");
    }

    /* renamed from: a */
    public final List<String> mo70750a() {
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (!f.isLogin()) {
            return m90240e();
        }
        if (m90241f().size() >= 8) {
            return C7525m.m23505c((Iterable<? extends T>) m90241f(), 8);
        }
        ArrayList arrayList = new ArrayList(m90241f());
        int i = 0;
        while (arrayList.size() < 8 && i < 8) {
            String str = (String) m90240e().get(i);
            if (arrayList.contains(str)) {
                i++;
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo70751a(String str) {
        C7573i.m23587b(str, "emojiText");
        f72585g.set(true);
        if (m90241f().contains(str)) {
            m90241f().remove(str);
            m90241f().addFirst(str);
            return;
        }
        m90241f().addFirst(str);
        if (m90241f().size() > 8) {
            m90241f().removeLast();
        }
    }
}
