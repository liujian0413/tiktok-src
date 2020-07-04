package com.p280ss.android.ugc.aweme.filter;

import android.support.p022v4.p023a.C0534a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.ab */
public final class C29196ab {

    /* renamed from: a */
    private static C29296g f77096a;

    /* renamed from: a */
    public static C29296g m95825a() {
        if (f77096a == null) {
            C29296g gVar = new C29296g();
            f77096a = gVar;
            gVar.mo74977a("");
            C29296g gVar2 = f77096a;
            StringBuilder sb = new StringBuilder();
            sb.append(C39811er.f103482r);
            sb.append("filter_00");
            gVar2.f77273h = sb.toString();
            f77096a.f77268c = "normal";
            f77096a.f77267b = "";
            f77096a.f77270e = 0;
        }
        return f77096a;
    }

    /* renamed from: b */
    public static List<C29296g> m95827b() {
        List<C29296g> list = (List) C35574k.m114859a().mo70097l().mo74951d().mo74818a().getValue();
        if (list == null) {
            C41530am.m132283b("[filter intensity] getFilterListData return emptyList");
            return Collections.emptyList();
        }
        if (list.size() == 0) {
            C41530am.m132280a("[filter intensity] getFilterListData return activeFilterBeans.size is 0");
        }
        return list;
    }

    /* renamed from: a */
    public static C29296g m95826a(int i) {
        try {
            List list = (List) C35574k.m114859a().mo70097l().mo74951d().mo74818a().getValue();
            return (C29296g) list.get(C0534a.m2233a(i, 0, list.size()));
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            C6921a.m21559a(e);
            return m95825a();
        }
    }
}
