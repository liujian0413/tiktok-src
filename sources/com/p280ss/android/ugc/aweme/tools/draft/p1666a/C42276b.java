package com.p280ss.android.ugc.aweme.tools.draft.p1666a;

import com.C1642a;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.a.b */
public final class C42276b {

    /* renamed from: a */
    public static final C42276b f110026a = new C42276b();

    private C42276b() {
    }

    /* renamed from: e */
    public static final String m134494e(C27311c cVar) {
        return m134487a(cVar, true);
    }

    /* renamed from: a */
    public static final boolean m134489a() {
        return C35563c.f93224F.mo70110y().mo83122g();
    }

    /* renamed from: b */
    public static boolean m134491b(C27311c cVar) {
        C7573i.m23587b(cVar, "draft");
        Calendar instance = Calendar.getInstance();
        C7573i.m23582a((Object) instance, "current");
        instance.setTimeInMillis(System.currentTimeMillis());
        Calendar instance2 = Calendar.getInstance();
        C7573i.m23582a((Object) instance2, "draftCalendar");
        instance2.setTimeInMillis(cVar.f72018F);
        int i = instance.get(6) - instance2.get(6);
        if (instance.get(1) != instance2.get(1) || i <= 0 || i >= 7) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m134490a(C27311c cVar) {
        C7573i.m23587b(cVar, "draft");
        Calendar instance = Calendar.getInstance();
        C7573i.m23582a((Object) instance, "current");
        instance.setTimeInMillis(System.currentTimeMillis());
        if (instance.getTimeInMillis() < cVar.f72018F) {
            return true;
        }
        Calendar instance2 = Calendar.getInstance();
        C7573i.m23582a((Object) instance2, "draftCalendar");
        instance2.setTimeInMillis(cVar.f72018F);
        if (instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m134492c(C27311c cVar) {
        C7573i.m23587b(cVar, "draft");
        Calendar instance = Calendar.getInstance();
        C7573i.m23582a((Object) instance, "current");
        instance.setTimeInMillis(System.currentTimeMillis());
        Calendar instance2 = Calendar.getInstance();
        C7573i.m23582a((Object) instance2, "draftCalendar");
        instance2.setTimeInMillis(cVar.f72018F);
        int i = instance.get(6) - instance2.get(6);
        if (instance.get(1) != instance2.get(1) || i < 7 || i >= 30) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m134493d(C27311c cVar) {
        C7573i.m23587b(cVar, "draft");
        Calendar instance = Calendar.getInstance();
        C7573i.m23582a((Object) instance, "current");
        instance.setTimeInMillis(System.currentTimeMillis());
        Calendar instance2 = Calendar.getInstance();
        C7573i.m23582a((Object) instance2, "draftCalendar");
        instance2.setTimeInMillis(cVar.f72018F);
        int i = instance.get(6) - instance2.get(6);
        if ((instance.get(1) != instance2.get(1) || i < 30) && instance2.get(1) >= instance.get(1)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m134487a(C27311c cVar, boolean z) {
        C7573i.m23587b(cVar, "draft");
        return m134486a(cVar.f72057z, z);
    }

    /* renamed from: a */
    public static final String m134486a(long j, boolean z) {
        if (z) {
            double d = (double) j;
            Double.isNaN(d);
            String a = C1642a.m8034a("%.1fMB", Arrays.copyOf(new Object[]{Double.valueOf(d / 1048576.0d)}, 1));
            C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
            return a;
        }
        double d2 = (double) j;
        Double.isNaN(d2);
        String a2 = C1642a.m8034a("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2 / 1048576.0d)}, 1));
        C7573i.m23582a((Object) a2, "java.lang.String.format(format, *args)");
        return a2;
    }
}
