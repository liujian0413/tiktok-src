package shark;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import shark.C48747i.C48752c;

/* renamed from: shark.b */
public final class C48713b {
    /* renamed from: a */
    public static final C48752c m150457a(C48752c cVar) {
        C7573i.m23587b(cVar, "$this$unwrapActivityContext");
        if (cVar.mo123493a("android.app.Activity")) {
            return cVar;
        }
        if (cVar.mo123493a("android.content.ContextWrapper")) {
            List arrayList = new ArrayList();
            C48752c cVar2 = cVar;
            loop0:
            while (true) {
                boolean z = true;
                while (z) {
                    arrayList.add(Long.valueOf(cVar2.mo123478b()));
                    z = false;
                    C48745g a = cVar2.mo123491a("android.content.ContextWrapper", "mBase");
                    if (a == null) {
                        C7573i.m23580a();
                    }
                    C48812k kVar = a.f123887c;
                    if (kVar.mo123582g()) {
                        C48747i h = kVar.mo123583h();
                        if (h == null) {
                            C7573i.m23580a();
                        }
                        C48752c d = h.mo123480d();
                        if (d == null) {
                            C7573i.m23580a();
                        }
                        if (d.mo123493a("android.app.Activity")) {
                            return d;
                        }
                        if (cVar2.mo123493a("com.android.internal.policy.DecorContext")) {
                            C48745g a2 = cVar2.mo123491a("com.android.internal.policy.DecorContext", "mPhoneWindow");
                            if (a2 != null) {
                                C48752c a3 = a2.mo123468a();
                                if (a3 == null) {
                                    C7573i.m23580a();
                                }
                                C48745g a4 = a3.mo123491a("android.view.Window", "mContext");
                                if (a4 == null) {
                                    C7573i.m23580a();
                                }
                                d = a4.mo123468a();
                                if (d == null) {
                                    C7573i.m23580a();
                                }
                                if (d.mo123493a("android.app.Activity")) {
                                    return d;
                                }
                            }
                        }
                        if (!d.mo123493a("android.content.ContextWrapper") || arrayList.contains(Long.valueOf(d.mo123478b()))) {
                            cVar2 = d;
                        } else {
                            cVar2 = d;
                        }
                    }
                }
                break loop0;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final String m150456a(C48745g gVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(gVar.f123885a.mo123483f());
        sb.append('#');
        sb.append(gVar.f123886b);
        sb.append(" is ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static final void m150458a(C48857t tVar, C48855s sVar, C48745g gVar) {
        if (gVar != null && !gVar.f123887c.mo123581f()) {
            C48747i h = gVar.f123887c.mo123583h();
            if (h == null) {
                C7573i.m23580a();
            }
            C48857t tVar2 = new C48857t(h);
            sVar.mo123342a(tVar2);
            StringBuilder sb = new StringBuilder();
            sb.append(gVar.f123885a.mo123483f());
            sb.append('#');
            sb.append(gVar.f123886b);
            sb.append(':');
            String sb2 = sb.toString();
            Collection collection = tVar.f124211a;
            Iterable<String> iterable = tVar2.f124211a;
            Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
            for (String str : iterable) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(' ');
                sb3.append(str);
                arrayList.add(sb3.toString());
            }
            C7525m.m23478a(collection, (Iterable<? extends T>) (List) arrayList);
            Collection collection2 = tVar.f124212b;
            Iterable<String> iterable2 = tVar2.f124212b;
            Collection arrayList2 = new ArrayList(C7525m.m23469a(iterable2, 10));
            for (String str2 : iterable2) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb2);
                sb4.append(' ');
                sb4.append(str2);
                arrayList2.add(sb4.toString());
            }
            C7525m.m23478a(collection2, (Iterable<? extends T>) (List) arrayList2);
            Collection collection3 = tVar.f124213c;
            Iterable<String> iterable3 = tVar2.f124213c;
            Collection arrayList3 = new ArrayList(C7525m.m23469a(iterable3, 10));
            for (String str3 : iterable3) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb2);
                sb5.append(' ');
                sb5.append(str3);
                arrayList3.add(sb5.toString());
            }
            C7525m.m23478a(collection3, (Iterable<? extends T>) (List) arrayList3);
            Collection collection4 = tVar.f124214d;
            Iterable<String> iterable4 = tVar2.f124214d;
            Collection arrayList4 = new ArrayList(C7525m.m23469a(iterable4, 10));
            for (String str4 : iterable4) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(sb2);
                sb6.append(' ');
                sb6.append(str4);
                arrayList4.add(sb6.toString());
            }
            C7525m.m23478a(collection4, (Iterable<? extends T>) (List) arrayList4);
        }
    }
}
