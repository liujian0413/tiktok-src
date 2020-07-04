package com.p280ss.android.deviceregister.p290b.p291a.p292a;

import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.deviceregister.C6793k;
import com.p280ss.android.deviceregister.p855c.C19318b;

/* renamed from: com.ss.android.deviceregister.b.a.a.b */
public abstract class C19301b {

    /* renamed from: c */
    public C19301b f52206c = this.f19362c;

    /* renamed from: com.ss.android.deviceregister.b.a.a.b$a */
    interface C19308a<L> {
        /* renamed from: a */
        L mo51210a();

        /* renamed from: a */
        L mo51211a(L l, L l2, C19301b bVar);

        /* renamed from: a */
        void mo51212a(L l);

        /* renamed from: a */
        boolean mo51213a(L l, L l2);

        /* renamed from: b */
        boolean mo51214b(L l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo51197a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo51199a(String str, String str2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo51200a(String str, String[] strArr);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String[] mo51201b(String str);

    /* renamed from: c */
    public void mo51202c(String str) {
        C19301b bVar = this.f52206c;
        if (bVar != null) {
            bVar.mo51202c(str);
        }
    }

    /* renamed from: b */
    public final String mo51205b(String str, String str2) {
        return (String) m63237a(str, str2, new C19308a<String>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public String mo51210a() {
                return C19301b.this.mo51197a("openudid");
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public void mo51212a(String str) {
                C19301b.this.mo51199a("openudid", str);
            }

            /* renamed from: a */
            private static boolean m63250a(String str) {
                return C19318b.m63341a(str);
            }

            /* renamed from: b */
            public final /* synthetic */ boolean mo51214b(Object obj) {
                return m63250a((String) obj);
            }

            /* renamed from: a */
            private static boolean m63251a(String str, String str2) {
                return C6319n.m19594a(str, str2);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo51213a(Object obj, Object obj2) {
                return m63251a((String) obj, (String) obj2);
            }

            /* renamed from: a */
            private static String m63249a(String str, String str2, C19301b bVar) {
                if (bVar == null) {
                    return str;
                }
                return bVar.mo51205b(str, str2);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo51211a(Object obj, Object obj2, C19301b bVar) {
                return m63249a((String) obj, (String) obj2, bVar);
            }
        });
    }

    /* renamed from: c */
    public final String mo51206c(String str, String str2) {
        return (String) m63237a(str, str2, new C19308a<String>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public String mo51210a() {
                return C19301b.this.mo51197a("clientudid");
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public void mo51212a(String str) {
                C19301b.this.mo51199a("clientudid", str);
            }

            /* renamed from: a */
            private static boolean m63260a(String str) {
                return C19318b.m63341a(str);
            }

            /* renamed from: b */
            public final /* synthetic */ boolean mo51214b(Object obj) {
                return m63260a((String) obj);
            }

            /* renamed from: a */
            private static boolean m63261a(String str, String str2) {
                return C6319n.m19594a(str, str2);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo51213a(Object obj, Object obj2) {
                return m63261a((String) obj, (String) obj2);
            }

            /* renamed from: a */
            private static String m63259a(String str, String str2, C19301b bVar) {
                if (bVar == null) {
                    return str;
                }
                return bVar.mo51206c(str, str2);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo51211a(Object obj, Object obj2, C19301b bVar) {
                return m63259a((String) obj, (String) obj2, bVar);
            }
        });
    }

    /* renamed from: d */
    public final String mo51207d(String str, String str2) {
        return (String) m63237a(str, str2, new C19308a<String>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public String mo51210a() {
                return C19301b.this.mo51197a("serial_number");
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public void mo51212a(String str) {
                C19301b.this.mo51199a("serial_number", str);
            }

            /* renamed from: a */
            private static boolean m63270a(String str) {
                if (!TextUtils.isEmpty(str)) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            public final /* synthetic */ boolean mo51214b(Object obj) {
                return m63270a((String) obj);
            }

            /* renamed from: a */
            private static boolean m63271a(String str, String str2) {
                return C6319n.m19594a(str, str2);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo51213a(Object obj, Object obj2) {
                return m63271a((String) obj, (String) obj2);
            }

            /* renamed from: a */
            private static String m63269a(String str, String str2, C19301b bVar) {
                if (bVar == null) {
                    return str;
                }
                return bVar.mo51207d(str, str2);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo51211a(Object obj, Object obj2, C19301b bVar) {
                return m63269a((String) obj, (String) obj2, bVar);
            }
        });
    }

    /* renamed from: e */
    public final String mo51208e(String str, String str2) {
        return (String) m63237a(str, str2, new C19308a<String>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public String mo51210a() {
                return C19301b.this.mo51197a("udid");
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public void mo51212a(String str) {
                C19301b.this.mo51199a("udid", str);
            }

            /* renamed from: a */
            private static boolean m63290a(String str) {
                return C19318b.m63341a(str);
            }

            /* renamed from: b */
            public final /* synthetic */ boolean mo51214b(Object obj) {
                return m63290a((String) obj);
            }

            /* renamed from: a */
            private static boolean m63291a(String str, String str2) {
                return C6319n.m19594a(str, str2);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo51213a(Object obj, Object obj2) {
                return m63291a((String) obj, (String) obj2);
            }

            /* renamed from: a */
            private static String m63289a(String str, String str2, C19301b bVar) {
                if (bVar == null) {
                    return str;
                }
                return bVar.mo51208e(str, str2);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo51211a(Object obj, Object obj2, C19301b bVar) {
                return m63289a((String) obj, (String) obj2, bVar);
            }
        });
    }

    /* renamed from: a */
    public final String[] mo51204a(String[] strArr, String[] strArr2) {
        return (String[]) m63237a(strArr, strArr2, new C19308a<String[]>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public String[] mo51210a() {
                return C19301b.this.mo51201b("sim_serial_number");
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public void mo51212a(String[] strArr) {
                C19301b.this.mo51200a("sim_serial_number", strArr);
            }

            /* renamed from: a */
            private static boolean m63279a(String[] strArr) {
                if (strArr == null || strArr.length <= 0) {
                    return false;
                }
                return true;
            }

            /* renamed from: b */
            public final /* synthetic */ boolean mo51214b(Object obj) {
                return m63279a((String[]) obj);
            }

            /* renamed from: a */
            private static boolean m63280a(String[] strArr, String[] strArr2) {
                if (strArr == strArr2) {
                    return true;
                }
                if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
                    return false;
                }
                for (String str : strArr) {
                    boolean z = false;
                    for (String a : strArr2) {
                        if (C6319n.m19594a(a, str) || z) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (!z) {
                        return false;
                    }
                }
                return true;
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo51213a(Object obj, Object obj2) {
                return m63280a((String[]) obj, (String[]) obj2);
            }

            /* renamed from: a */
            private static String[] m63281a(String[] strArr, String[] strArr2, C19301b bVar) {
                if (bVar == null) {
                    return strArr;
                }
                return bVar.mo51204a(strArr, strArr2);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo51211a(Object obj, Object obj2, C19301b bVar) {
                return m63281a((String[]) obj, (String[]) obj2, bVar);
            }
        });
    }

    /* renamed from: f */
    public final String mo51209f(String str, String str2) {
        C6793k.m21104a().mo16609c();
        String str3 = (String) m63237a(str, str2, new C19308a<String>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public String mo51210a() {
                return C19301b.this.mo51197a("device_id");
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public void mo51212a(String str) {
                C19301b.this.mo51199a("device_id", str);
            }

            /* renamed from: a */
            private static boolean m63300a(String str) {
                if (!TextUtils.isEmpty(str)) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            public final /* synthetic */ boolean mo51214b(Object obj) {
                return m63300a((String) obj);
            }

            /* renamed from: a */
            private static boolean m63301a(String str, String str2) {
                return C6319n.m19594a(str, str2);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo51213a(Object obj, Object obj2) {
                return m63301a((String) obj, (String) obj2);
            }

            /* renamed from: a */
            private static String m63299a(String str, String str2, C19301b bVar) {
                if (bVar == null) {
                    return str;
                }
                return bVar.mo51209f(str, str2);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo51211a(Object obj, Object obj2, C19301b bVar) {
                return m63299a((String) obj, (String) obj2, bVar);
            }
        });
        C6793k.m21104a().mo16601a(str3);
        return str3;
    }

    /* renamed from: a */
    private <T> T m63237a(T t, T t2, C19308a<T> aVar) {
        C19301b bVar = this.f52206c;
        T a = aVar.mo51210a();
        boolean b = aVar.mo51214b(t);
        boolean b2 = aVar.mo51214b(a);
        if (!b && b2) {
            t = a;
        }
        if (bVar != null) {
            T a2 = aVar.mo51211a(t, t2, bVar);
            if (!aVar.mo51213a(a2, a)) {
                aVar.mo51212a(a2);
            }
            return a2;
        }
        boolean z = false;
        if (!b && !b2) {
            z = true;
            t = t2;
        }
        if ((z && aVar.mo51214b(t)) || (b && !aVar.mo51213a(t, a))) {
            aVar.mo51212a(t);
        }
        return t;
    }
}
