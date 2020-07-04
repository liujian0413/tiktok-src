package com.p280ss.android.ugc.aweme.user;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.gson.C6600e;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.C21683bp;
import com.p280ss.android.ugc.aweme.account.p950k.C21225a.C21226a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.user.C42800a.C42801a;
import com.p280ss.android.ugc.aweme.user.p1689d.C42832d;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.C7577n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.user.d */
public final class C42813d {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f111271a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42813d.class), "gson", "getGson()Lcom/google/gson/Gson;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42813d.class), "sharedPreferences", "getSharedPreferences()Landroid/content/SharedPreferences;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42813d.class), "defaultNullUser", "getDefaultNullUser()Lcom/ss/android/ugc/aweme/profile/model/User;"))};

    /* renamed from: b */
    public static final C42813d f111272b = new C42813d();

    /* renamed from: c */
    private static final Object f111273c = new Object();

    /* renamed from: d */
    private static final C7541d f111274d = C7546e.m23569a(C42825e.f111303a);

    /* renamed from: e */
    private static final C7541d f111275e = C7546e.m23569a(C42826f.f111304a);

    /* renamed from: f */
    private static final C7541d f111276f = C7546e.m23569a(C42824d.f111302a);

    /* renamed from: g */
    private static final List<C42817c> f111277g = new ArrayList();

    /* renamed from: h */
    private static String f111278h = "";

    /* renamed from: i */
    private static String f111279i = "";

    /* renamed from: com.ss.android.ugc.aweme.user.d$a */
    public static final class C42814a {

        /* renamed from: f */
        public static final C42815a f111280f = new C42815a(null);
        @C6593c(mo15949a = "uid")

        /* renamed from: a */
        public final String f111281a;
        @C6593c(mo15949a = "session_key")

        /* renamed from: b */
        public final String f111282b;
        @C6593c(mo15949a = "name")

        /* renamed from: c */
        public final String f111283c;
        @C6593c(mo15949a = "user_verified")

        /* renamed from: d */
        public final boolean f111284d;
        @C6593c(mo15949a = "country_code")

        /* renamed from: e */
        public String f111285e;

        /* renamed from: com.ss.android.ugc.aweme.user.d$a$a */
        public static final class C42815a {
            private C42815a() {
            }

            public /* synthetic */ C42815a(C7571f fVar) {
                this();
            }

            /* renamed from: a */
            public static C42814a m135958a(long j, String str, String str2, boolean z, String str3) {
                String valueOf;
                C7573i.m23587b(str, "session");
                C7573i.m23587b(str2, "name");
                C7573i.m23587b(str3, "countryCode");
                if (j == 0) {
                    valueOf = "";
                } else {
                    valueOf = String.valueOf(j);
                }
                C42814a aVar = new C42814a(valueOf, str, str2, z, str3);
                return aVar;
            }
        }

        /* renamed from: a */
        public static final C42814a m135957a(long j, String str, String str2, boolean z, String str3) {
            return C42815a.m135958a(j, str, str2, z, str3);
        }

        public C42814a(String str, String str2, String str3, boolean z, String str4) {
            C7573i.m23587b(str, "uid");
            C7573i.m23587b(str2, "session");
            C7573i.m23587b(str3, "name");
            C7573i.m23587b(str4, "countryCode");
            this.f111281a = str;
            this.f111282b = str2;
            this.f111283c = str3;
            this.f111284d = z;
            this.f111285e = str4;
        }

        public /* synthetic */ C42814a(String str, String str2, String str3, boolean z, String str4, int i, C7571f fVar) {
            this(str, "", "", false, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.d$b */
    public static final class C42816b<T> {

        /* renamed from: a */
        public boolean f111286a;

        /* renamed from: b */
        public final String f111287b;

        /* renamed from: c */
        public final String f111288c;

        /* renamed from: d */
        private final Class<? extends T> f111289d;

        /* renamed from: e */
        private final String f111290e;

        /* renamed from: f */
        private ArrayList<T> f111291f = new ArrayList<>(1);

        /* renamed from: g */
        private T f111292g;

        /* renamed from: h */
        private final C7561a<T> f111293h;

        /* renamed from: d */
        private final T m135960d() {
            boolean z;
            T t;
            String string = C42813d.f111272b.mo104508b().getString(this.f111290e, "");
            CharSequence charSequence = string;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            try {
                t = C42813d.f111272b.mo104503a().mo15975a(string, (Type) this.f111289d);
            } catch (JsonSyntaxException unused) {
                t = null;
            }
            return t;
        }

        /* renamed from: a */
        public final T mo104517a() {
            if (this.f111286a) {
                return this.f111292g;
            }
            this.f111292g = m135960d();
            if (this.f111292g == null) {
                mo104518a(this.f111293h.invoke());
                mo104519b();
            }
            this.f111286a = true;
            return this.f111292g;
        }

        /* renamed from: b */
        public final void mo104519b() {
            for (Object next : this.f111291f) {
                Editor edit = C42813d.f111272b.mo104508b().edit();
                if (next == null) {
                    edit.remove(this.f111290e);
                } else {
                    edit.putString(this.f111290e, C42813d.f111272b.mo104503a().mo15979b(next));
                }
                edit.commit();
            }
            this.f111291f.clear();
        }

        /* renamed from: c */
        public final void mo104520c() {
            for (Object next : this.f111291f) {
                Editor edit = C42813d.f111272b.mo104508b().edit();
                if (next == null) {
                    edit.remove(this.f111290e);
                } else {
                    edit.putString(this.f111290e, C42813d.f111272b.mo104503a().mo15979b(next));
                }
                edit.apply();
            }
            this.f111291f.clear();
        }

        /* renamed from: b */
        private final void m135959b(T t) {
            this.f111291f.clear();
            this.f111291f.add(t);
        }

        /* renamed from: a */
        public final void mo104518a(T t) {
            if (this.f111292g != t) {
                this.f111292g = t;
                m135959b(t);
                this.f111286a = true;
            }
        }

        public C42816b(String str, String str2, T t, C7561a<? extends T> aVar) {
            C7573i.m23587b(str, "uid");
            C7573i.m23587b(str2, "name");
            C7573i.m23587b(t, "dataInitValue");
            C7573i.m23587b(aVar, "upgrade");
            this.f111287b = str;
            this.f111288c = str2;
            this.f111293h = aVar;
            this.f111289d = t.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f111287b);
            sb.append('_');
            sb.append(this.f111288c);
            this.f111290e = sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.d$c */
    public static final class C42817c {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f111294a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42817c.class), "awemeUser", "getAwemeUser()Lcom/ss/android/ugc/aweme/user/UserStore$PartialUserSyncTask;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42817c.class), "accountUser", "getAccountUser()Lcom/ss/android/ugc/aweme/user/UserStore$PartialUserSyncTask;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42817c.class), "significantUser", "getSignificantUser()Lcom/ss/android/ugc/aweme/user/UserStore$PartialUserSyncTask;"))};

        /* renamed from: b */
        public final String f111295b;

        /* renamed from: c */
        private final C7541d f111296c = C7546e.m23569a(new C42820b(this));

        /* renamed from: d */
        private final C7541d f111297d = C7546e.m23569a(new C42818a(this));

        /* renamed from: e */
        private final C7541d f111298e = C7546e.m23569a(new C42822c(this));

        /* renamed from: com.ss.android.ugc.aweme.user.d$c$a */
        static final class C42818a extends Lambda implements C7561a<C42816b<C42814a>> {

            /* renamed from: a */
            final /* synthetic */ C42817c f111299a;

            C42818a(C42817c cVar) {
                this.f111299a = cVar;
                super(0);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C42816b<C42814a> invoke() {
                C42814a aVar = new C42814a(this.f111299a.f111295b, null, null, false, null, 30, null);
                return new C42816b<>(this.f111299a.f111295b, "account_user_info", aVar, new C7561a<C42814a>(this.f111299a) {
                    public final String getName() {
                        return "accountUserUpgrade";
                    }

                    public final C7585d getOwner() {
                        return C7575l.m23595a(C42817c.class);
                    }

                    public final String getSignature() {
                        return "accountUserUpgrade()Lcom/ss/android/ugc/aweme/user/UserStore$AccountUser;";
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public C42814a invoke() {
                        return ((C42817c) this.receiver).mo104527g();
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.user.d$c$b */
        static final class C42820b extends Lambda implements C7561a<C42816b<User>> {

            /* renamed from: a */
            final /* synthetic */ C42817c f111300a;

            C42820b(C42817c cVar) {
                this.f111300a = cVar;
                super(0);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C42816b<User> invoke() {
                return new C42816b<>(this.f111300a.f111295b, "aweme_user_info", C42817c.m135965a(this.f111300a.f111295b), new C7561a<User>(this.f111300a) {
                    public final String getName() {
                        return "awemeUserUpgrade";
                    }

                    public final C7585d getOwner() {
                        return C7575l.m23595a(C42817c.class);
                    }

                    public final String getSignature() {
                        return "awemeUserUpgrade()Lcom/ss/android/ugc/aweme/profile/model/User;";
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public User invoke() {
                        return ((C42817c) this.receiver).mo104526f();
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.user.d$c$c */
        static final class C42822c extends Lambda implements C7561a<C42816b<C42800a>> {

            /* renamed from: a */
            final /* synthetic */ C42817c f111301a;

            C42822c(C42817c cVar) {
                this.f111301a = cVar;
                super(0);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C42816b<C42800a> invoke() {
                C42800a aVar = new C42800a(this.f111301a.f111295b, null, null, null, null, 30, null);
                return new C42816b<>(this.f111301a.f111295b, "significant_user_info", aVar, new C7561a<C42800a>(this.f111301a) {
                    public final String getName() {
                        return "significantUserInfoUpgrade";
                    }

                    public final C7585d getOwner() {
                        return C7575l.m23595a(C42817c.class);
                    }

                    public final String getSignature() {
                        return "significantUserInfoUpgrade()Lcom/ss/android/ugc/aweme/user/SignificantUserInfo;";
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public C42800a invoke() {
                        return ((C42817c) this.receiver).mo104528h();
                    }
                });
            }
        }

        /* renamed from: a */
        public final C42816b<User> mo104521a() {
            return (C42816b) this.f111296c.getValue();
        }

        /* renamed from: b */
        public final C42816b<C42814a> mo104522b() {
            return (C42816b) this.f111297d.getValue();
        }

        /* renamed from: c */
        public final C42816b<C42800a> mo104523c() {
            return (C42816b) this.f111298e.getValue();
        }

        /* renamed from: g */
        public final C42814a mo104527g() {
            return C42832d.m135994b(this.f111295b);
        }

        /* renamed from: h */
        public final C42800a mo104528h() {
            User f = mo104526f();
            if (f != null) {
                return C42801a.m135830a(f);
            }
            return null;
        }

        /* renamed from: d */
        public final void mo104524d() {
            mo104521a().mo104520c();
            mo104522b().mo104520c();
            mo104523c().mo104520c();
        }

        /* renamed from: f */
        public final User mo104526f() {
            Object obj;
            User i = C42813d.f111272b.mo104516i();
            if (i != null) {
                obj = i.getUid();
            } else {
                obj = null;
            }
            if (C7573i.m23585a(obj, (Object) this.f111295b)) {
                return i;
            }
            return null;
        }

        /* renamed from: e */
        public final void mo104525e() {
            mo104521a().mo104518a(null);
            mo104521a().mo104519b();
            mo104522b().mo104518a(null);
            mo104522b().mo104519b();
            mo104523c().mo104518a(null);
            mo104523c().mo104519b();
        }

        /* renamed from: a */
        public static User m135965a(String str) {
            User user = new User();
            user.setUid(str);
            user.setAllowStatus(1);
            return user;
        }

        public C42817c(String str) {
            C7573i.m23587b(str, "uid");
            this.f111295b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.d$d */
    static final class C42824d extends Lambda implements C7561a<User> {

        /* renamed from: a */
        public static final C42824d f111302a = new C42824d();

        C42824d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m135980a();
        }

        /* renamed from: a */
        private static User m135980a() {
            User user = new User();
            user.setAllowStatus(1);
            return user;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.d$e */
    static final class C42825e extends Lambda implements C7561a<C6600e> {

        /* renamed from: a */
        public static final C42825e f111303a = new C42825e();

        C42825e() {
            super(0);
        }

        /* renamed from: a */
        private static C6600e m135981a() {
            return new C6600e();
        }

        public final /* synthetic */ Object invoke() {
            return m135981a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.d$f */
    static final class C42826f extends Lambda implements C7561a<SharedPreferences> {

        /* renamed from: a */
        public static final C42826f f111304a = new C42826f();

        C42826f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m135982a();
        }

        /* renamed from: a */
        private static SharedPreferences m135982a() {
            return C7285c.m22838a(C21683bp.m72587b(), "aweme_user", 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.d$g */
    static final class C42827g extends Lambda implements C7562b<C42817c, Boolean> {

        /* renamed from: a */
        final /* synthetic */ List f111305a;

        C42827g(List list) {
            this.f111305a = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m135983a((C42817c) obj));
        }

        /* renamed from: a */
        private boolean m135983a(C42817c cVar) {
            C7573i.m23587b(cVar, "it");
            if (!this.f111305a.contains(cVar.f111295b)) {
                return true;
            }
            return false;
        }
    }

    private C42813d() {
    }

    /* renamed from: j */
    private static Object m135939j() {
        return f111273c;
    }

    /* renamed from: k */
    private final User m135940k() {
        return (User) f111276f.getValue();
    }

    /* renamed from: a */
    public final C6600e mo104503a() {
        return (C6600e) f111274d.getValue();
    }

    /* renamed from: b */
    public final SharedPreferences mo104508b() {
        return (SharedPreferences) f111275e.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0156  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104507a(com.p280ss.android.ugc.aweme.user.C42813d.C42814a r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "u"
            kotlin.jvm.internal.C7573i.m23587b(r0, r1)
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r1 = com.p280ss.android.ugc.aweme.user.C42813d.C42814a.class
            kotlin.reflect.c r1 = kotlin.jvm.internal.C7575l.m23595a(r1)
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r2 = com.p280ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.c r2 = kotlin.jvm.internal.C7575l.m23595a(r2)
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r1, r2)
            if (r2 == 0) goto L_0x0021
            r1 = r0
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.p280ss.android.ugc.aweme.profile.model.User) r1
            java.lang.String r1 = r1.getUid()
            goto L_0x0044
        L_0x0021:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r2 = com.p280ss.android.ugc.aweme.user.C42813d.C42814a.class
            kotlin.reflect.c r2 = kotlin.jvm.internal.C7575l.m23595a(r2)
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r1, r2)
            if (r2 == 0) goto L_0x0030
            java.lang.String r1 = r0.f111281a
            goto L_0x0044
        L_0x0030:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r2 = com.p280ss.android.ugc.aweme.user.C42800a.class
            kotlin.reflect.c r2 = kotlin.jvm.internal.C7575l.m23595a(r2)
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r2)
            if (r1 == 0) goto L_0x0042
            r1 = r0
            com.ss.android.ugc.aweme.user.a r1 = (com.p280ss.android.ugc.aweme.user.C42800a) r1
            java.lang.String r1 = r1.f111244a
            goto L_0x0044
        L_0x0042:
            java.lang.String r1 = "0"
        L_0x0044:
            if (r1 != 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.Object r2 = m135939j()
            monitor-enter(r2)
            com.ss.android.ugc.aweme.user.d r3 = f111272b     // Catch:{ all -> 0x021c }
            java.util.List r3 = r3.m135941l()     // Catch:{ all -> 0x021c }
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ all -> 0x021c }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x021c }
        L_0x0058:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x021c }
            r5 = 0
            if (r4 == 0) goto L_0x006f
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x021c }
            r6 = r4
            com.ss.android.ugc.aweme.user.d$c r6 = (com.p280ss.android.ugc.aweme.user.C42813d.C42817c) r6     // Catch:{ all -> 0x021c }
            java.lang.String r6 = r6.f111295b     // Catch:{ all -> 0x021c }
            boolean r6 = kotlin.jvm.internal.C7573i.m23585a(r6, r1)     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x0058
            goto L_0x0070
        L_0x006f:
            r4 = r5
        L_0x0070:
            com.ss.android.ugc.aweme.user.d$c r4 = (com.p280ss.android.ugc.aweme.user.C42813d.C42817c) r4     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x00dd
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r1 = com.p280ss.android.ugc.aweme.user.C42813d.C42814a.class
            kotlin.reflect.c r1 = kotlin.jvm.internal.C7575l.m23595a(r1)     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.p280ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x00b0
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104521a()     // Catch:{ all -> 0x021c }
            r3 = r0
            com.ss.android.ugc.aweme.profile.model.User r3 = (com.p280ss.android.ugc.aweme.profile.model.User) r3     // Catch:{ all -> 0x021c }
            r1.mo104518a(r3)     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104523c()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r3 = r4.mo104521a()     // Catch:{ all -> 0x021c }
            java.lang.Object r3 = r3.mo104517a()     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x00a8
            com.ss.android.ugc.aweme.profile.model.User r3 = (com.p280ss.android.ugc.aweme.profile.model.User) r3     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.a r3 = com.p280ss.android.ugc.aweme.user.C42800a.C42801a.m135830a(r3)     // Catch:{ all -> 0x021c }
            r1.mo104518a(r3)     // Catch:{ all -> 0x021c }
            goto L_0x00da
        L_0x00a8:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x021c }
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User"
            r0.<init>(r1)     // Catch:{ all -> 0x021c }
            throw r0     // Catch:{ all -> 0x021c }
        L_0x00b0:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r3 = com.p280ss.android.ugc.aweme.user.C42813d.C42814a.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x00c4
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104522b()     // Catch:{ all -> 0x021c }
            r1.mo104518a(r0)     // Catch:{ all -> 0x021c }
            goto L_0x00da
        L_0x00c4:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r3 = com.p280ss.android.ugc.aweme.user.C42800a.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r1 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104523c()     // Catch:{ all -> 0x021c }
            r3 = r0
            com.ss.android.ugc.aweme.user.a r3 = (com.p280ss.android.ugc.aweme.user.C42800a) r3     // Catch:{ all -> 0x021c }
            r1.mo104518a(r3)     // Catch:{ all -> 0x021c }
        L_0x00da:
            r4.mo104524d()     // Catch:{ all -> 0x021c }
        L_0x00dd:
            if (r4 != 0) goto L_0x021a
            com.ss.android.ugc.aweme.user.d r1 = f111272b     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r3 = com.p280ss.android.ugc.aweme.user.C42813d.C42814a.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r4 = com.p280ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.c r4 = kotlin.jvm.internal.C7575l.m23595a(r4)     // Catch:{ all -> 0x021c }
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r3, r4)     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x00fb
            r3 = r0
            com.ss.android.ugc.aweme.profile.model.User r3 = (com.p280ss.android.ugc.aweme.profile.model.User) r3     // Catch:{ all -> 0x021c }
            java.lang.String r3 = r3.getUid()     // Catch:{ all -> 0x021c }
            goto L_0x011e
        L_0x00fb:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r4 = com.p280ss.android.ugc.aweme.user.C42813d.C42814a.class
            kotlin.reflect.c r4 = kotlin.jvm.internal.C7575l.m23595a(r4)     // Catch:{ all -> 0x021c }
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r3, r4)     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x010a
            java.lang.String r3 = r0.f111281a     // Catch:{ all -> 0x021c }
            goto L_0x011e
        L_0x010a:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r4 = com.p280ss.android.ugc.aweme.user.C42800a.class
            kotlin.reflect.c r4 = kotlin.jvm.internal.C7575l.m23595a(r4)     // Catch:{ all -> 0x021c }
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r3, r4)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x011c
            r3 = r0
            com.ss.android.ugc.aweme.user.a r3 = (com.p280ss.android.ugc.aweme.user.C42800a) r3     // Catch:{ all -> 0x021c }
            java.lang.String r3 = r3.f111244a     // Catch:{ all -> 0x021c }
            goto L_0x011e
        L_0x011c:
            java.lang.String r3 = "0"
        L_0x011e:
            if (r3 != 0) goto L_0x0122
            goto L_0x021a
        L_0x0122:
            boolean r4 = m135936f(r3)     // Catch:{ all -> 0x021c }
            if (r4 != 0) goto L_0x021a
            java.util.List r4 = m135937g()     // Catch:{ all -> 0x021c }
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ all -> 0x021c }
            boolean r6 = r4 instanceof java.util.Collection     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x013b
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ all -> 0x021c }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x021c }
            if (r6 != 0) goto L_0x0153
        L_0x013b:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x021c }
        L_0x013f:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x0153
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x021c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x021c }
            boolean r6 = kotlin.jvm.internal.C7573i.m23585a(r6, r3)     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x013f
            r4 = 1
            goto L_0x0154
        L_0x0153:
            r4 = 0
        L_0x0154:
            if (r4 != 0) goto L_0x021a
            android.content.SharedPreferences r4 = r1.mo104508b()     // Catch:{ all -> 0x021c }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x021c }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x021c }
            r6.<init>()     // Catch:{ all -> 0x021c }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x021c }
            java.util.List r7 = m135937g()     // Catch:{ all -> 0x021c }
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ all -> 0x021c }
            r6.addAll(r7)     // Catch:{ all -> 0x021c }
            r6.add(r3)     // Catch:{ all -> 0x021c }
            java.lang.String r7 = "logged_in_uid_list"
            r8 = r6
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch:{ all -> 0x021c }
            java.lang.String r6 = ","
            r9 = r6
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x021c }
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 62
            r16 = 0
            java.lang.String r6 = kotlin.collections.C7525m.m23492a(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x021c }
            r4.putString(r7, r6)     // Catch:{ all -> 0x021c }
            r4.apply()     // Catch:{ all -> 0x021c }
            java.util.List r1 = r1.m135941l()     // Catch:{ all -> 0x021c }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x021c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x021c }
        L_0x0198:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x01ae
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x021c }
            r6 = r4
            com.ss.android.ugc.aweme.user.d$c r6 = (com.p280ss.android.ugc.aweme.user.C42813d.C42817c) r6     // Catch:{ all -> 0x021c }
            java.lang.String r6 = r6.f111295b     // Catch:{ all -> 0x021c }
            boolean r6 = kotlin.jvm.internal.C7573i.m23585a(r6, r3)     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x0198
            goto L_0x01af
        L_0x01ae:
            r4 = r5
        L_0x01af:
            com.ss.android.ugc.aweme.user.d$c r4 = (com.p280ss.android.ugc.aweme.user.C42813d.C42817c) r4     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x021a
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r1 = com.p280ss.android.ugc.aweme.user.C42813d.C42814a.class
            kotlin.reflect.c r1 = kotlin.jvm.internal.C7575l.m23595a(r1)     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.p280ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x01ee
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104521a()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.p280ss.android.ugc.aweme.profile.model.User) r0     // Catch:{ all -> 0x021c }
            r1.mo104518a(r0)     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r0 = r4.mo104523c()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104521a()     // Catch:{ all -> 0x021c }
            java.lang.Object r1 = r1.mo104517a()     // Catch:{ all -> 0x021c }
            if (r1 == 0) goto L_0x01e6
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.p280ss.android.ugc.aweme.profile.model.User) r1     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.a r1 = com.p280ss.android.ugc.aweme.user.C42800a.C42801a.m135830a(r1)     // Catch:{ all -> 0x021c }
            r0.mo104518a(r1)     // Catch:{ all -> 0x021c }
            goto L_0x0217
        L_0x01e6:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x021c }
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User"
            r0.<init>(r1)     // Catch:{ all -> 0x021c }
            throw r0     // Catch:{ all -> 0x021c }
        L_0x01ee:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r3 = com.p280ss.android.ugc.aweme.user.C42813d.C42814a.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x0202
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104522b()     // Catch:{ all -> 0x021c }
            r1.mo104518a(r0)     // Catch:{ all -> 0x021c }
            goto L_0x0217
        L_0x0202:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r3 = com.p280ss.android.ugc.aweme.user.C42800a.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r1 == 0) goto L_0x0217
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104523c()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.a r0 = (com.p280ss.android.ugc.aweme.user.C42800a) r0     // Catch:{ all -> 0x021c }
            r1.mo104518a(r0)     // Catch:{ all -> 0x021c }
        L_0x0217:
            r4.mo104524d()     // Catch:{ all -> 0x021c }
        L_0x021a:
            monitor-exit(r2)
            return
        L_0x021c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.user.C42813d.mo104507a(com.ss.android.ugc.aweme.user.d$a):void");
    }

    /* renamed from: d */
    public final boolean mo104513d() {
        if (!m135936f(m135935e())) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static void m135938h() {
        synchronized (f111273c) {
            for (C42817c d : f111272b.m135941l()) {
                d.mo104524d();
            }
            f111272b.mo104508b().edit().putString("current_foreground_uid", m135935e()).apply();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m135942m() {
        /*
            r5 = this;
            android.app.Application r0 = com.p280ss.android.ugc.aweme.C21683bp.m72587b()
            java.lang.String r1 = "com.ss.spipe_setting"
            r2 = 0
            android.content.SharedPreferences r0 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r0, r1, r2)
            java.lang.String r1 = "user_id"
            r2 = 0
            long r0 = r0.getLong(r1, r2)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x001c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x001c:
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.mo104516i()
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = r0.getUid()
            if (r0 != 0) goto L_0x002a
        L_0x0028:
            java.lang.String r0 = "0"
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.user.C42813d.m135942m():java.lang.String");
    }

    /* renamed from: i */
    public final User mo104516i() {
        String string = mo104508b().getString("user_info", "");
        try {
            if (!TextUtils.isEmpty(string)) {
                return (User) mo104503a().mo15974a(string, User.class);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: g */
    public static List<String> m135937g() {
        boolean z;
        List<String> list;
        synchronized (f111273c) {
            String string = f111272b.mo104508b().getString("logged_in_uid_list", "");
            if (string == null) {
                string = "";
            }
            if (string.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                list = C7525m.m23461a();
            } else {
                list = C7634n.m23768b((CharSequence) string, new String[]{","}, false, 0);
            }
        }
        return list;
    }

    /* renamed from: l */
    private List<C42817c> m135941l() {
        Object obj;
        List<String> g = m135937g();
        for (String str : g) {
            Iterator it = f111277g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C7573i.m23585a((Object) ((C42817c) obj).f111295b, (Object) str)) {
                    break;
                }
            }
            if (obj == null) {
                f111277g.add(new C42817c(str));
            }
        }
        m135934a(f111277g, new C42827g(g));
        return f111277g;
    }

    /* renamed from: f */
    public final synchronized String mo104515f() {
        boolean z;
        String str;
        boolean z2 = false;
        if (f111279i.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = f111279i;
        } else {
            String string = mo104508b().getString("latest_logged_in_uid_list", "");
            if (string == null) {
                C7573i.m23580a();
            }
            if (string.length() > 0) {
                z2 = true;
            }
            if (z2) {
                str = mo104508b().getString("latest_logged_in_uid_list", "0");
                if (str == null) {
                    C7573i.m23580a();
                }
            } else {
                str = mo104508b().getString("last_uid", "");
                if (str == null) {
                    C7573i.m23580a();
                }
            }
        }
        f111279i = str;
        return str;
    }

    /* renamed from: e */
    public static String m135935e() {
        boolean z;
        String str;
        boolean z2;
        String str2;
        synchronized (f111273c) {
            boolean z3 = false;
            if (f111278h.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = f111278h;
            } else {
                String string = f111272b.mo104508b().getString("current_foreground_uid", "");
                if (string == null) {
                    C7573i.m23580a();
                }
                if (string.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    str = f111272b.mo104508b().getString("current_foreground_uid", "0");
                    if (str == null) {
                        C7573i.m23580a();
                    }
                } else if (!m135936f(f111272b.m135942m())) {
                    str = f111272b.m135942m();
                } else {
                    User i = f111272b.mo104516i();
                    if (i != null) {
                        str2 = i.getUid();
                    } else {
                        str2 = null;
                    }
                    CharSequence charSequence = str2;
                    if (charSequence == null || charSequence.length() == 0) {
                        z3 = true;
                    }
                    if (z3) {
                        str = "0";
                    } else {
                        if (i == null) {
                            C7573i.m23580a();
                        }
                        str = i.getUid();
                    }
                    C7573i.m23582a((Object) str, "if (user?.uid.isNullOrEm… NULL_UID else user!!.uid");
                }
            }
            f111278h = str;
        }
        return str;
    }

    /* renamed from: c */
    public final void mo104511c() {
        Object obj;
        String e = m135935e();
        synchronized (m135939j()) {
            Iterator it = f111272b.m135941l().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C7573i.m23585a((Object) ((C42817c) obj).f111295b, (Object) e)) {
                    break;
                }
            }
            C42817c cVar = (C42817c) obj;
            if (cVar != null) {
                C7584c a = C7575l.m23595a(User.class);
                if (C7573i.m23585a((Object) a, (Object) C7575l.m23595a(User.class))) {
                    if (cVar.mo104521a().f111286a) {
                        cVar.mo104521a().mo104517a();
                    } else {
                        cVar.mo104521a().mo104517a();
                    }
                } else if (C7573i.m23585a((Object) a, (Object) C7575l.m23595a(C42814a.class))) {
                    cVar.mo104522b().mo104517a();
                } else if (C7573i.m23585a((Object) a, (Object) C7575l.m23595a(C42800a.class))) {
                    cVar.mo104523c().mo104517a();
                }
            }
        }
        C21226a.m71444a(m135935e());
    }

    /* renamed from: f */
    public static boolean m135936f(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || C7573i.m23585a((Object) str, (Object) "0")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final synchronized void mo104509b(String str) {
        C7573i.m23587b(str, "value");
        if (!C7573i.m23585a((Object) f111279i, (Object) str)) {
            f111279i = str;
            mo104508b().edit().putString("latest_logged_in_uid_list", str).apply();
        }
    }

    /* renamed from: a */
    public static void m135933a(String str) {
        boolean z;
        String str2;
        C7573i.m23587b(str, "value");
        synchronized (f111273c) {
            if (!C7573i.m23585a((Object) f111278h, (Object) str)) {
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str2 = "0";
                } else {
                    str2 = str;
                }
                f111278h = str2;
                C21226a.m71444a(str);
                f111272b.mo104508b().edit().putString("current_foreground_uid", f111278h).commit();
            }
        }
    }

    /* renamed from: a */
    public final User mo104504a(boolean z) {
        User user;
        Object obj;
        User user2;
        String e = m135935e();
        synchronized (m135939j()) {
            Iterator it = f111272b.m135941l().iterator();
            while (true) {
                user = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C7573i.m23585a((Object) ((C42817c) obj).f111295b, (Object) e)) {
                    break;
                }
            }
            C42817c cVar = (C42817c) obj;
            if (cVar != null) {
                C7584c a = C7575l.m23595a(User.class);
                if (C7573i.m23585a((Object) a, (Object) C7575l.m23595a(User.class))) {
                    if (cVar.mo104521a().f111286a) {
                        user2 = (User) cVar.mo104521a().mo104517a();
                    } else {
                        user2 = (User) cVar.mo104521a().mo104517a();
                    }
                } else if (C7573i.m23585a((Object) a, (Object) C7575l.m23595a(C42814a.class))) {
                    user2 = (User) cVar.mo104522b().mo104517a();
                } else if (C7573i.m23585a((Object) a, (Object) C7575l.m23595a(C42800a.class))) {
                    user2 = (User) cVar.mo104523c().mo104517a();
                }
                user = user2;
            }
        }
        if (user == null) {
            return m135940k();
        }
        return user;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        return r3;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.aweme.user.C42813d.C42814a mo104510c(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "uid"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            java.lang.Object r0 = m135939j()
            monitor-enter(r0)
            com.ss.android.ugc.aweme.user.d r1 = f111272b     // Catch:{ all -> 0x0097 }
            java.util.List r1 = r1.m135941l()     // Catch:{ all -> 0x0097 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0097 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0097 }
        L_0x0016:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0097 }
            r3 = 0
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0097 }
            r4 = r2
            com.ss.android.ugc.aweme.user.d$c r4 = (com.p280ss.android.ugc.aweme.user.C42813d.C42817c) r4     // Catch:{ all -> 0x0097 }
            java.lang.String r4 = r4.f111295b     // Catch:{ all -> 0x0097 }
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r4, r6)     // Catch:{ all -> 0x0097 }
            if (r4 == 0) goto L_0x0016
            goto L_0x002e
        L_0x002d:
            r2 = r3
        L_0x002e:
            com.ss.android.ugc.aweme.user.d$c r2 = (com.p280ss.android.ugc.aweme.user.C42813d.C42817c) r2     // Catch:{ all -> 0x0097 }
            if (r2 != 0) goto L_0x0034
            monitor-exit(r0)
            return r3
        L_0x0034:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r6 = com.p280ss.android.ugc.aweme.user.C42813d.C42814a.class
            kotlin.reflect.c r6 = kotlin.jvm.internal.C7575l.m23595a(r6)     // Catch:{ all -> 0x0097 }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.p280ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.c r1 = kotlin.jvm.internal.C7575l.m23595a(r1)     // Catch:{ all -> 0x0097 }
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r6, r1)     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo104521a()     // Catch:{ all -> 0x0097 }
            boolean r6 = r6.f111286a     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x005a
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo104521a()     // Catch:{ all -> 0x0097 }
            java.lang.Object r6 = r6.mo104517a()     // Catch:{ all -> 0x0097 }
            r3 = r6
            com.ss.android.ugc.aweme.user.d$a r3 = (com.p280ss.android.ugc.aweme.user.C42813d.C42814a) r3     // Catch:{ all -> 0x0097 }
            goto L_0x0095
        L_0x005a:
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo104521a()     // Catch:{ all -> 0x0097 }
            java.lang.Object r6 = r6.mo104517a()     // Catch:{ all -> 0x0097 }
            r3 = r6
            com.ss.android.ugc.aweme.user.d$a r3 = (com.p280ss.android.ugc.aweme.user.C42813d.C42814a) r3     // Catch:{ all -> 0x0097 }
            goto L_0x0095
        L_0x0066:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r1 = com.p280ss.android.ugc.aweme.user.C42813d.C42814a.class
            kotlin.reflect.c r1 = kotlin.jvm.internal.C7575l.m23595a(r1)     // Catch:{ all -> 0x0097 }
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r6, r1)     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x007e
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo104522b()     // Catch:{ all -> 0x0097 }
            java.lang.Object r6 = r6.mo104517a()     // Catch:{ all -> 0x0097 }
            r3 = r6
            com.ss.android.ugc.aweme.user.d$a r3 = (com.p280ss.android.ugc.aweme.user.C42813d.C42814a) r3     // Catch:{ all -> 0x0097 }
            goto L_0x0095
        L_0x007e:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r1 = com.p280ss.android.ugc.aweme.user.C42800a.class
            kotlin.reflect.c r1 = kotlin.jvm.internal.C7575l.m23595a(r1)     // Catch:{ all -> 0x0097 }
            boolean r6 = kotlin.jvm.internal.C7573i.m23585a(r6, r1)     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x0095
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo104523c()     // Catch:{ all -> 0x0097 }
            java.lang.Object r6 = r6.mo104517a()     // Catch:{ all -> 0x0097 }
            r3 = r6
            com.ss.android.ugc.aweme.user.d$a r3 = (com.p280ss.android.ugc.aweme.user.C42813d.C42814a) r3     // Catch:{ all -> 0x0097 }
        L_0x0095:
            monitor-exit(r0)
            return r3
        L_0x0097:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.user.C42813d.mo104510c(java.lang.String):com.ss.android.ugc.aweme.user.d$a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        return r3;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.aweme.user.C42800a mo104512d(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "uid"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            java.lang.Object r0 = m135939j()
            monitor-enter(r0)
            com.ss.android.ugc.aweme.user.d r1 = f111272b     // Catch:{ all -> 0x0097 }
            java.util.List r1 = r1.m135941l()     // Catch:{ all -> 0x0097 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0097 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0097 }
        L_0x0016:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0097 }
            r3 = 0
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0097 }
            r4 = r2
            com.ss.android.ugc.aweme.user.d$c r4 = (com.p280ss.android.ugc.aweme.user.C42813d.C42817c) r4     // Catch:{ all -> 0x0097 }
            java.lang.String r4 = r4.f111295b     // Catch:{ all -> 0x0097 }
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r4, r6)     // Catch:{ all -> 0x0097 }
            if (r4 == 0) goto L_0x0016
            goto L_0x002e
        L_0x002d:
            r2 = r3
        L_0x002e:
            com.ss.android.ugc.aweme.user.d$c r2 = (com.p280ss.android.ugc.aweme.user.C42813d.C42817c) r2     // Catch:{ all -> 0x0097 }
            if (r2 != 0) goto L_0x0034
            monitor-exit(r0)
            return r3
        L_0x0034:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r6 = com.p280ss.android.ugc.aweme.user.C42800a.class
            kotlin.reflect.c r6 = kotlin.jvm.internal.C7575l.m23595a(r6)     // Catch:{ all -> 0x0097 }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.p280ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.c r1 = kotlin.jvm.internal.C7575l.m23595a(r1)     // Catch:{ all -> 0x0097 }
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r6, r1)     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo104521a()     // Catch:{ all -> 0x0097 }
            boolean r6 = r6.f111286a     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x005a
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo104521a()     // Catch:{ all -> 0x0097 }
            java.lang.Object r6 = r6.mo104517a()     // Catch:{ all -> 0x0097 }
            r3 = r6
            com.ss.android.ugc.aweme.user.a r3 = (com.p280ss.android.ugc.aweme.user.C42800a) r3     // Catch:{ all -> 0x0097 }
            goto L_0x0095
        L_0x005a:
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo104521a()     // Catch:{ all -> 0x0097 }
            java.lang.Object r6 = r6.mo104517a()     // Catch:{ all -> 0x0097 }
            r3 = r6
            com.ss.android.ugc.aweme.user.a r3 = (com.p280ss.android.ugc.aweme.user.C42800a) r3     // Catch:{ all -> 0x0097 }
            goto L_0x0095
        L_0x0066:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r1 = com.p280ss.android.ugc.aweme.user.C42813d.C42814a.class
            kotlin.reflect.c r1 = kotlin.jvm.internal.C7575l.m23595a(r1)     // Catch:{ all -> 0x0097 }
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r6, r1)     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x007e
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo104522b()     // Catch:{ all -> 0x0097 }
            java.lang.Object r6 = r6.mo104517a()     // Catch:{ all -> 0x0097 }
            r3 = r6
            com.ss.android.ugc.aweme.user.a r3 = (com.p280ss.android.ugc.aweme.user.C42800a) r3     // Catch:{ all -> 0x0097 }
            goto L_0x0095
        L_0x007e:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r1 = com.p280ss.android.ugc.aweme.user.C42800a.class
            kotlin.reflect.c r1 = kotlin.jvm.internal.C7575l.m23595a(r1)     // Catch:{ all -> 0x0097 }
            boolean r6 = kotlin.jvm.internal.C7573i.m23585a(r6, r1)     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x0095
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo104523c()     // Catch:{ all -> 0x0097 }
            java.lang.Object r6 = r6.mo104517a()     // Catch:{ all -> 0x0097 }
            r3 = r6
            com.ss.android.ugc.aweme.user.a r3 = (com.p280ss.android.ugc.aweme.user.C42800a) r3     // Catch:{ all -> 0x0097 }
        L_0x0095:
            monitor-exit(r0)
            return r3
        L_0x0097:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.user.C42813d.mo104512d(java.lang.String):com.ss.android.ugc.aweme.user.a");
    }

    /* renamed from: e */
    public final void mo104514e(String str) {
        Object obj;
        C7573i.m23587b(str, "uid");
        if (C7573i.m23585a((Object) str, (Object) m135935e())) {
            m135933a("0");
        }
        synchronized (f111273c) {
            Iterator it = f111272b.m135941l().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C7573i.m23585a((Object) ((C42817c) obj).f111295b, (Object) str)) {
                    break;
                }
            }
            C42817c cVar = (C42817c) obj;
            if (cVar != null) {
                cVar.mo104525e();
            }
            Collection l = f111272b.m135941l();
            if (l != null) {
                C7577n.m23621b(l).remove(cVar);
                Editor edit = f111272b.mo104508b().edit();
                String str2 = "logged_in_uid_list";
                Iterable g = m135937g();
                Collection arrayList = new ArrayList();
                for (Object next : g) {
                    if (!C7573i.m23585a((Object) (String) next, (Object) str)) {
                        arrayList.add(next);
                    }
                }
                edit.putString(str2, C7525m.m23492a((List) arrayList, ",", null, null, 0, null, null, 62, null)).apply();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0156  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104505a(com.p280ss.android.ugc.aweme.profile.model.User r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "u"
            kotlin.jvm.internal.C7573i.m23587b(r0, r1)
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.p280ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.c r1 = kotlin.jvm.internal.C7575l.m23595a(r1)
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r2 = com.p280ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.c r2 = kotlin.jvm.internal.C7575l.m23595a(r2)
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r1, r2)
            if (r2 == 0) goto L_0x001e
            java.lang.String r1 = r18.getUid()
            goto L_0x0044
        L_0x001e:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r2 = com.p280ss.android.ugc.aweme.user.C42813d.C42814a.class
            kotlin.reflect.c r2 = kotlin.jvm.internal.C7575l.m23595a(r2)
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r1, r2)
            if (r2 == 0) goto L_0x0030
            r1 = r0
            com.ss.android.ugc.aweme.user.d$a r1 = (com.p280ss.android.ugc.aweme.user.C42813d.C42814a) r1
            java.lang.String r1 = r1.f111281a
            goto L_0x0044
        L_0x0030:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r2 = com.p280ss.android.ugc.aweme.user.C42800a.class
            kotlin.reflect.c r2 = kotlin.jvm.internal.C7575l.m23595a(r2)
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r2)
            if (r1 == 0) goto L_0x0042
            r1 = r0
            com.ss.android.ugc.aweme.user.a r1 = (com.p280ss.android.ugc.aweme.user.C42800a) r1
            java.lang.String r1 = r1.f111244a
            goto L_0x0044
        L_0x0042:
            java.lang.String r1 = "0"
        L_0x0044:
            if (r1 != 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.Object r2 = m135939j()
            monitor-enter(r2)
            com.ss.android.ugc.aweme.user.d r3 = f111272b     // Catch:{ all -> 0x021c }
            java.util.List r3 = r3.m135941l()     // Catch:{ all -> 0x021c }
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ all -> 0x021c }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x021c }
        L_0x0058:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x021c }
            r5 = 0
            if (r4 == 0) goto L_0x006f
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x021c }
            r6 = r4
            com.ss.android.ugc.aweme.user.d$c r6 = (com.p280ss.android.ugc.aweme.user.C42813d.C42817c) r6     // Catch:{ all -> 0x021c }
            java.lang.String r6 = r6.f111295b     // Catch:{ all -> 0x021c }
            boolean r6 = kotlin.jvm.internal.C7573i.m23585a(r6, r1)     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x0058
            goto L_0x0070
        L_0x006f:
            r4 = r5
        L_0x0070:
            com.ss.android.ugc.aweme.user.d$c r4 = (com.p280ss.android.ugc.aweme.user.C42813d.C42817c) r4     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x00dd
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.p280ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.c r1 = kotlin.jvm.internal.C7575l.m23595a(r1)     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.p280ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x00ad
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104521a()     // Catch:{ all -> 0x021c }
            r1.mo104518a(r0)     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104523c()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r3 = r4.mo104521a()     // Catch:{ all -> 0x021c }
            java.lang.Object r3 = r3.mo104517a()     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x00a5
            com.ss.android.ugc.aweme.profile.model.User r3 = (com.p280ss.android.ugc.aweme.profile.model.User) r3     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.a r3 = com.p280ss.android.ugc.aweme.user.C42800a.C42801a.m135830a(r3)     // Catch:{ all -> 0x021c }
            r1.mo104518a(r3)     // Catch:{ all -> 0x021c }
            goto L_0x00da
        L_0x00a5:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x021c }
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User"
            r0.<init>(r1)     // Catch:{ all -> 0x021c }
            throw r0     // Catch:{ all -> 0x021c }
        L_0x00ad:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r3 = com.p280ss.android.ugc.aweme.user.C42813d.C42814a.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x00c4
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104522b()     // Catch:{ all -> 0x021c }
            r3 = r0
            com.ss.android.ugc.aweme.user.d$a r3 = (com.p280ss.android.ugc.aweme.user.C42813d.C42814a) r3     // Catch:{ all -> 0x021c }
            r1.mo104518a(r3)     // Catch:{ all -> 0x021c }
            goto L_0x00da
        L_0x00c4:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r3 = com.p280ss.android.ugc.aweme.user.C42800a.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r1 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104523c()     // Catch:{ all -> 0x021c }
            r3 = r0
            com.ss.android.ugc.aweme.user.a r3 = (com.p280ss.android.ugc.aweme.user.C42800a) r3     // Catch:{ all -> 0x021c }
            r1.mo104518a(r3)     // Catch:{ all -> 0x021c }
        L_0x00da:
            r4.mo104524d()     // Catch:{ all -> 0x021c }
        L_0x00dd:
            if (r4 != 0) goto L_0x021a
            com.ss.android.ugc.aweme.user.d r1 = f111272b     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.p280ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r4 = com.p280ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.c r4 = kotlin.jvm.internal.C7575l.m23595a(r4)     // Catch:{ all -> 0x021c }
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r3, r4)     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x00f8
            java.lang.String r3 = r18.getUid()     // Catch:{ all -> 0x021c }
            goto L_0x011e
        L_0x00f8:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r4 = com.p280ss.android.ugc.aweme.user.C42813d.C42814a.class
            kotlin.reflect.c r4 = kotlin.jvm.internal.C7575l.m23595a(r4)     // Catch:{ all -> 0x021c }
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r3, r4)     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x010a
            r3 = r0
            com.ss.android.ugc.aweme.user.d$a r3 = (com.p280ss.android.ugc.aweme.user.C42813d.C42814a) r3     // Catch:{ all -> 0x021c }
            java.lang.String r3 = r3.f111281a     // Catch:{ all -> 0x021c }
            goto L_0x011e
        L_0x010a:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r4 = com.p280ss.android.ugc.aweme.user.C42800a.class
            kotlin.reflect.c r4 = kotlin.jvm.internal.C7575l.m23595a(r4)     // Catch:{ all -> 0x021c }
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r3, r4)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x011c
            r3 = r0
            com.ss.android.ugc.aweme.user.a r3 = (com.p280ss.android.ugc.aweme.user.C42800a) r3     // Catch:{ all -> 0x021c }
            java.lang.String r3 = r3.f111244a     // Catch:{ all -> 0x021c }
            goto L_0x011e
        L_0x011c:
            java.lang.String r3 = "0"
        L_0x011e:
            if (r3 != 0) goto L_0x0122
            goto L_0x021a
        L_0x0122:
            boolean r4 = m135936f(r3)     // Catch:{ all -> 0x021c }
            if (r4 != 0) goto L_0x021a
            java.util.List r4 = m135937g()     // Catch:{ all -> 0x021c }
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ all -> 0x021c }
            boolean r6 = r4 instanceof java.util.Collection     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x013b
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ all -> 0x021c }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x021c }
            if (r6 != 0) goto L_0x0153
        L_0x013b:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x021c }
        L_0x013f:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x0153
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x021c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x021c }
            boolean r6 = kotlin.jvm.internal.C7573i.m23585a(r6, r3)     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x013f
            r4 = 1
            goto L_0x0154
        L_0x0153:
            r4 = 0
        L_0x0154:
            if (r4 != 0) goto L_0x021a
            android.content.SharedPreferences r4 = r1.mo104508b()     // Catch:{ all -> 0x021c }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x021c }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x021c }
            r6.<init>()     // Catch:{ all -> 0x021c }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x021c }
            java.util.List r7 = m135937g()     // Catch:{ all -> 0x021c }
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ all -> 0x021c }
            r6.addAll(r7)     // Catch:{ all -> 0x021c }
            r6.add(r3)     // Catch:{ all -> 0x021c }
            java.lang.String r7 = "logged_in_uid_list"
            r8 = r6
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch:{ all -> 0x021c }
            java.lang.String r6 = ","
            r9 = r6
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x021c }
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 62
            r16 = 0
            java.lang.String r6 = kotlin.collections.C7525m.m23492a(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x021c }
            r4.putString(r7, r6)     // Catch:{ all -> 0x021c }
            r4.apply()     // Catch:{ all -> 0x021c }
            java.util.List r1 = r1.m135941l()     // Catch:{ all -> 0x021c }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x021c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x021c }
        L_0x0198:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x01ae
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x021c }
            r6 = r4
            com.ss.android.ugc.aweme.user.d$c r6 = (com.p280ss.android.ugc.aweme.user.C42813d.C42817c) r6     // Catch:{ all -> 0x021c }
            java.lang.String r6 = r6.f111295b     // Catch:{ all -> 0x021c }
            boolean r6 = kotlin.jvm.internal.C7573i.m23585a(r6, r3)     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x0198
            goto L_0x01af
        L_0x01ae:
            r4 = r5
        L_0x01af:
            com.ss.android.ugc.aweme.user.d$c r4 = (com.p280ss.android.ugc.aweme.user.C42813d.C42817c) r4     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x021a
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.p280ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.c r1 = kotlin.jvm.internal.C7575l.m23595a(r1)     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.p280ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x01ec
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104521a()     // Catch:{ all -> 0x021c }
            r1.mo104518a(r0)     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r0 = r4.mo104523c()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104521a()     // Catch:{ all -> 0x021c }
            java.lang.Object r1 = r1.mo104517a()     // Catch:{ all -> 0x021c }
            if (r1 == 0) goto L_0x01e4
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.p280ss.android.ugc.aweme.profile.model.User) r1     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.a r1 = com.p280ss.android.ugc.aweme.user.C42800a.C42801a.m135830a(r1)     // Catch:{ all -> 0x021c }
            r0.mo104518a(r1)     // Catch:{ all -> 0x021c }
            goto L_0x0217
        L_0x01e4:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x021c }
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User"
            r0.<init>(r1)     // Catch:{ all -> 0x021c }
            throw r0     // Catch:{ all -> 0x021c }
        L_0x01ec:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r3 = com.p280ss.android.ugc.aweme.user.C42813d.C42814a.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x0202
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104522b()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$a r0 = (com.p280ss.android.ugc.aweme.user.C42813d.C42814a) r0     // Catch:{ all -> 0x021c }
            r1.mo104518a(r0)     // Catch:{ all -> 0x021c }
            goto L_0x0217
        L_0x0202:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r3 = com.p280ss.android.ugc.aweme.user.C42800a.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r1 == 0) goto L_0x0217
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104523c()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.a r0 = (com.p280ss.android.ugc.aweme.user.C42800a) r0     // Catch:{ all -> 0x021c }
            r1.mo104518a(r0)     // Catch:{ all -> 0x021c }
        L_0x0217:
            r4.mo104524d()     // Catch:{ all -> 0x021c }
        L_0x021a:
            monitor-exit(r2)
            return
        L_0x021c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.user.C42813d.mo104505a(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0156  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104506a(com.p280ss.android.ugc.aweme.user.C42800a r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "u"
            kotlin.jvm.internal.C7573i.m23587b(r0, r1)
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r1 = com.p280ss.android.ugc.aweme.user.C42800a.class
            kotlin.reflect.c r1 = kotlin.jvm.internal.C7575l.m23595a(r1)
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r2 = com.p280ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.c r2 = kotlin.jvm.internal.C7575l.m23595a(r2)
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r1, r2)
            if (r2 == 0) goto L_0x0021
            r1 = r0
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.p280ss.android.ugc.aweme.profile.model.User) r1
            java.lang.String r1 = r1.getUid()
            goto L_0x0044
        L_0x0021:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r2 = com.p280ss.android.ugc.aweme.user.C42813d.C42814a.class
            kotlin.reflect.c r2 = kotlin.jvm.internal.C7575l.m23595a(r2)
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r1, r2)
            if (r2 == 0) goto L_0x0033
            r1 = r0
            com.ss.android.ugc.aweme.user.d$a r1 = (com.p280ss.android.ugc.aweme.user.C42813d.C42814a) r1
            java.lang.String r1 = r1.f111281a
            goto L_0x0044
        L_0x0033:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r2 = com.p280ss.android.ugc.aweme.user.C42800a.class
            kotlin.reflect.c r2 = kotlin.jvm.internal.C7575l.m23595a(r2)
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r2)
            if (r1 == 0) goto L_0x0042
            java.lang.String r1 = r0.f111244a
            goto L_0x0044
        L_0x0042:
            java.lang.String r1 = "0"
        L_0x0044:
            if (r1 != 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.Object r2 = m135939j()
            monitor-enter(r2)
            com.ss.android.ugc.aweme.user.d r3 = f111272b     // Catch:{ all -> 0x021c }
            java.util.List r3 = r3.m135941l()     // Catch:{ all -> 0x021c }
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ all -> 0x021c }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x021c }
        L_0x0058:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x021c }
            r5 = 0
            if (r4 == 0) goto L_0x006f
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x021c }
            r6 = r4
            com.ss.android.ugc.aweme.user.d$c r6 = (com.p280ss.android.ugc.aweme.user.C42813d.C42817c) r6     // Catch:{ all -> 0x021c }
            java.lang.String r6 = r6.f111295b     // Catch:{ all -> 0x021c }
            boolean r6 = kotlin.jvm.internal.C7573i.m23585a(r6, r1)     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x0058
            goto L_0x0070
        L_0x006f:
            r4 = r5
        L_0x0070:
            com.ss.android.ugc.aweme.user.d$c r4 = (com.p280ss.android.ugc.aweme.user.C42813d.C42817c) r4     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x00dd
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r1 = com.p280ss.android.ugc.aweme.user.C42800a.class
            kotlin.reflect.c r1 = kotlin.jvm.internal.C7575l.m23595a(r1)     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.p280ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x00b0
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104521a()     // Catch:{ all -> 0x021c }
            r3 = r0
            com.ss.android.ugc.aweme.profile.model.User r3 = (com.p280ss.android.ugc.aweme.profile.model.User) r3     // Catch:{ all -> 0x021c }
            r1.mo104518a(r3)     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104523c()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r3 = r4.mo104521a()     // Catch:{ all -> 0x021c }
            java.lang.Object r3 = r3.mo104517a()     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x00a8
            com.ss.android.ugc.aweme.profile.model.User r3 = (com.p280ss.android.ugc.aweme.profile.model.User) r3     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.a r3 = com.p280ss.android.ugc.aweme.user.C42800a.C42801a.m135830a(r3)     // Catch:{ all -> 0x021c }
            r1.mo104518a(r3)     // Catch:{ all -> 0x021c }
            goto L_0x00da
        L_0x00a8:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x021c }
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User"
            r0.<init>(r1)     // Catch:{ all -> 0x021c }
            throw r0     // Catch:{ all -> 0x021c }
        L_0x00b0:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r3 = com.p280ss.android.ugc.aweme.user.C42813d.C42814a.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x00c7
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104522b()     // Catch:{ all -> 0x021c }
            r3 = r0
            com.ss.android.ugc.aweme.user.d$a r3 = (com.p280ss.android.ugc.aweme.user.C42813d.C42814a) r3     // Catch:{ all -> 0x021c }
            r1.mo104518a(r3)     // Catch:{ all -> 0x021c }
            goto L_0x00da
        L_0x00c7:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r3 = com.p280ss.android.ugc.aweme.user.C42800a.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r1 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104523c()     // Catch:{ all -> 0x021c }
            r1.mo104518a(r0)     // Catch:{ all -> 0x021c }
        L_0x00da:
            r4.mo104524d()     // Catch:{ all -> 0x021c }
        L_0x00dd:
            if (r4 != 0) goto L_0x021a
            com.ss.android.ugc.aweme.user.d r1 = f111272b     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r3 = com.p280ss.android.ugc.aweme.user.C42800a.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r4 = com.p280ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.c r4 = kotlin.jvm.internal.C7575l.m23595a(r4)     // Catch:{ all -> 0x021c }
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r3, r4)     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x00fb
            r3 = r0
            com.ss.android.ugc.aweme.profile.model.User r3 = (com.p280ss.android.ugc.aweme.profile.model.User) r3     // Catch:{ all -> 0x021c }
            java.lang.String r3 = r3.getUid()     // Catch:{ all -> 0x021c }
            goto L_0x011e
        L_0x00fb:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r4 = com.p280ss.android.ugc.aweme.user.C42813d.C42814a.class
            kotlin.reflect.c r4 = kotlin.jvm.internal.C7575l.m23595a(r4)     // Catch:{ all -> 0x021c }
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r3, r4)     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x010d
            r3 = r0
            com.ss.android.ugc.aweme.user.d$a r3 = (com.p280ss.android.ugc.aweme.user.C42813d.C42814a) r3     // Catch:{ all -> 0x021c }
            java.lang.String r3 = r3.f111281a     // Catch:{ all -> 0x021c }
            goto L_0x011e
        L_0x010d:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r4 = com.p280ss.android.ugc.aweme.user.C42800a.class
            kotlin.reflect.c r4 = kotlin.jvm.internal.C7575l.m23595a(r4)     // Catch:{ all -> 0x021c }
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r3, r4)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x011c
            java.lang.String r3 = r0.f111244a     // Catch:{ all -> 0x021c }
            goto L_0x011e
        L_0x011c:
            java.lang.String r3 = "0"
        L_0x011e:
            if (r3 != 0) goto L_0x0122
            goto L_0x021a
        L_0x0122:
            boolean r4 = m135936f(r3)     // Catch:{ all -> 0x021c }
            if (r4 != 0) goto L_0x021a
            java.util.List r4 = m135937g()     // Catch:{ all -> 0x021c }
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ all -> 0x021c }
            boolean r6 = r4 instanceof java.util.Collection     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x013b
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ all -> 0x021c }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x021c }
            if (r6 != 0) goto L_0x0153
        L_0x013b:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x021c }
        L_0x013f:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x0153
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x021c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x021c }
            boolean r6 = kotlin.jvm.internal.C7573i.m23585a(r6, r3)     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x013f
            r4 = 1
            goto L_0x0154
        L_0x0153:
            r4 = 0
        L_0x0154:
            if (r4 != 0) goto L_0x021a
            android.content.SharedPreferences r4 = r1.mo104508b()     // Catch:{ all -> 0x021c }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x021c }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x021c }
            r6.<init>()     // Catch:{ all -> 0x021c }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x021c }
            java.util.List r7 = m135937g()     // Catch:{ all -> 0x021c }
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ all -> 0x021c }
            r6.addAll(r7)     // Catch:{ all -> 0x021c }
            r6.add(r3)     // Catch:{ all -> 0x021c }
            java.lang.String r7 = "logged_in_uid_list"
            r8 = r6
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch:{ all -> 0x021c }
            java.lang.String r6 = ","
            r9 = r6
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x021c }
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 62
            r16 = 0
            java.lang.String r6 = kotlin.collections.C7525m.m23492a(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x021c }
            r4.putString(r7, r6)     // Catch:{ all -> 0x021c }
            r4.apply()     // Catch:{ all -> 0x021c }
            java.util.List r1 = r1.m135941l()     // Catch:{ all -> 0x021c }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x021c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x021c }
        L_0x0198:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x01ae
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x021c }
            r6 = r4
            com.ss.android.ugc.aweme.user.d$c r6 = (com.p280ss.android.ugc.aweme.user.C42813d.C42817c) r6     // Catch:{ all -> 0x021c }
            java.lang.String r6 = r6.f111295b     // Catch:{ all -> 0x021c }
            boolean r6 = kotlin.jvm.internal.C7573i.m23585a(r6, r3)     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x0198
            goto L_0x01af
        L_0x01ae:
            r4 = r5
        L_0x01af:
            com.ss.android.ugc.aweme.user.d$c r4 = (com.p280ss.android.ugc.aweme.user.C42813d.C42817c) r4     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x021a
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r1 = com.p280ss.android.ugc.aweme.user.C42800a.class
            kotlin.reflect.c r1 = kotlin.jvm.internal.C7575l.m23595a(r1)     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.p280ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x01ee
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104521a()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.p280ss.android.ugc.aweme.profile.model.User) r0     // Catch:{ all -> 0x021c }
            r1.mo104518a(r0)     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r0 = r4.mo104523c()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104521a()     // Catch:{ all -> 0x021c }
            java.lang.Object r1 = r1.mo104517a()     // Catch:{ all -> 0x021c }
            if (r1 == 0) goto L_0x01e6
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.p280ss.android.ugc.aweme.profile.model.User) r1     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.a r1 = com.p280ss.android.ugc.aweme.user.C42800a.C42801a.m135830a(r1)     // Catch:{ all -> 0x021c }
            r0.mo104518a(r1)     // Catch:{ all -> 0x021c }
            goto L_0x0217
        L_0x01e6:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x021c }
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User"
            r0.<init>(r1)     // Catch:{ all -> 0x021c }
            throw r0     // Catch:{ all -> 0x021c }
        L_0x01ee:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r3 = com.p280ss.android.ugc.aweme.user.C42813d.C42814a.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x0204
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104522b()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$a r0 = (com.p280ss.android.ugc.aweme.user.C42813d.C42814a) r0     // Catch:{ all -> 0x021c }
            r1.mo104518a(r0)     // Catch:{ all -> 0x021c }
            goto L_0x0217
        L_0x0204:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r3 = com.p280ss.android.ugc.aweme.user.C42800a.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)     // Catch:{ all -> 0x021c }
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r1 == 0) goto L_0x0217
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo104523c()     // Catch:{ all -> 0x021c }
            r1.mo104518a(r0)     // Catch:{ all -> 0x021c }
        L_0x0217:
            r4.mo104524d()     // Catch:{ all -> 0x021c }
        L_0x021a:
            monitor-exit(r2)
            return
        L_0x021c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.user.C42813d.mo104506a(com.ss.android.ugc.aweme.user.a):void");
    }

    /* renamed from: a */
    private static <E> boolean m135934a(List<E> list, C7562b<? super E, Boolean> bVar) {
        if (VERSION.SDK_INT >= 24) {
            return list.removeIf(new C42833e(bVar));
        }
        boolean z = false;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Boolean) bVar.invoke(it.next())).booleanValue()) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
