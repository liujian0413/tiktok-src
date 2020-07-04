package com.p280ss.android.ugc.aweme.feed.helper;

import android.support.p022v4.util.C0894f;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.deviceregister.C6789d;
import com.p280ss.android.ugc.aweme.app.p1029d.C22915b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.n */
public final class C28426n {

    /* renamed from: a */
    public static final C28426n f74958a = new C28426n();

    /* renamed from: b */
    private static C0894f<String, C28421i> f74959b = m93435d();

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.n$a */
    static final class C28427a extends Lambda implements C7562b<Pair<? extends Integer, ? extends C28421i>, String> {

        /* renamed from: a */
        public static final C28427a f74960a = new C28427a();

        C28427a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m93436a((Pair) obj);
        }

        /* renamed from: a */
        private static String m93436a(Pair<Integer, C28421i> pair) {
            C7573i.m23587b(pair, "it");
            try {
                C28421i iVar = (C28421i) pair.getSecond();
                StringBuilder sb = new StringBuilder();
                sb.append(iVar.f74945a);
                sb.append('|');
                sb.append(iVar.f74946b);
                sb.append('|');
                sb.append((int) (iVar.f74947c / 1000));
                sb.append('|');
                sb.append(((Number) pair.getFirst()).intValue());
                return sb.toString();
            } catch (Exception e) {
                C6921a.m21554a(e);
                return "";
            }
        }
    }

    private C28426n() {
    }

    /* renamed from: b */
    public static final boolean m93433b() {
        if (C6384b.m19835a().mo15287a(ReportNewUserBehaviorExperiment.class, false, "real_time_report_of_new_user", C6384b.m19835a().mo15295d().real_time_report_of_new_user, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static C0894f<String, C28421i> m93435d() {
        return new C0894f<>(C6384b.m19835a().mo15287a(RealTimeReportMaxNums.class, true, "real_time_report_max_nums", C6384b.m19835a().mo15295d().real_time_report_max_nums, 10));
    }

    /* renamed from: a */
    public static final boolean m93432a() {
        CharSequence d = C6789d.m21080d();
        if (TextUtils.isEmpty(d) || TextUtils.equals(d, "0") || C6384b.m19835a().mo15287a(ReportNewUserBehaviorExperiment.class, false, "real_time_report_of_new_user", C6384b.m19835a().mo15295d().real_time_report_of_new_user, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final String m93434c() {
        Object obj;
        if (f74959b.mo3345b() == 0) {
            return null;
        }
        Map c = f74959b.mo3348c();
        C7573i.m23582a((Object) c, "behaviorList.snapshot()");
        Collection arrayList = new ArrayList();
        for (Entry entry : c.entrySet()) {
            int a = C22915b.m75418a(((C28421i) entry.getValue()).f74948d);
            if (a == -1) {
                obj = null;
            } else {
                obj = C7579l.m23633a(Integer.valueOf(a), entry.getValue());
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        String a2 = C7525m.m23492a((List) arrayList, ",", null, null, 0, null, C28427a.f74960a, 30, null);
        f74959b = m93435d();
        return a2;
    }

    /* renamed from: a */
    public static final void m93431a(C28421i iVar) {
        C7573i.m23587b(iVar, "behavior");
        C0894f<String, C28421i> fVar = f74959b;
        StringBuilder sb = new StringBuilder();
        sb.append(iVar.f74945a);
        sb.append(iVar.f74946b);
        fVar.mo3342a(sb.toString(), iVar);
    }
}
