package com.p280ss.android.ugc.aweme.video;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.ac */
public final class C43184ac {

    /* renamed from: a */
    private List<C43222g> f111818a = new LinkedList();

    /* renamed from: com.ss.android.ugc.aweme.video.ac$a */
    static class C43185a {

        /* renamed from: a */
        public static C43184ac f111819a = new C43184ac();
    }

    /* renamed from: a */
    public static C43184ac m136934a() {
        return C43185a.f111819a;
    }

    /* renamed from: c */
    public final synchronized C43222g mo104819c() {
        if (!C43268o.f112004a) {
            return C43316v.m137450K();
        }
        C43316v vVar = new C43316v();
        this.f111818a.add(vVar);
        return vVar;
    }

    /* renamed from: b */
    public final synchronized C43222g mo104818b() {
        if (!C43268o.f112004a) {
            return C43316v.m137450K();
        }
        for (C43222g gVar : this.f111818a) {
            if (gVar.mo104925E()) {
                return gVar;
            }
        }
        return mo104819c();
    }

    /* renamed from: d */
    public final synchronized void mo104820d() {
        if (C43268o.f112004a) {
            for (C43222g gVar : this.f111818a) {
                if (gVar != null) {
                    gVar.mo104949y();
                }
            }
            this.f111818a.clear();
        }
    }

    /* renamed from: a */
    public final synchronized void mo104817a(C43222g gVar) {
        if (C43268o.f112004a) {
            if (gVar != null) {
                gVar.mo104949y();
                this.f111818a.remove(gVar);
            }
        }
    }

    /* renamed from: a */
    public final synchronized C43222g mo104816a(String str) {
        if (!C43268o.f112004a) {
            return C43316v.m137450K();
        }
        ArrayList<C43222g> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            for (C43222g gVar : this.f111818a) {
                if (gVar.mo104919r() != null && str.equals(gVar.mo104919r().getUri())) {
                    return gVar;
                }
                if (!gVar.mo104925E()) {
                    arrayList.add(gVar);
                }
            }
        }
        for (C43222g a : arrayList) {
            mo104817a(a);
        }
        return mo104819c();
    }
}
