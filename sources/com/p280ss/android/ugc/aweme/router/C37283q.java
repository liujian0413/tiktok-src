package com.p280ss.android.ugc.aweme.router;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.router.q */
public final class C37283q {

    /* renamed from: a */
    public ArrayList<String> f97400a;

    /* renamed from: b */
    public ArrayList<String> f97401b;

    /* renamed from: c */
    public ArrayList<String> f97402c;

    /* renamed from: d */
    public ArrayList<String> f97403d;

    /* renamed from: e */
    public ArrayList<String> f97404e;

    /* renamed from: f */
    public ArrayList<String> f97405f;

    /* renamed from: g */
    public ArrayList<String> f97406g;

    /* renamed from: h */
    public ArrayList<String> f97407h;

    /* renamed from: i */
    public ArrayList<String> f97408i;

    /* renamed from: a */
    public final void mo93884a() {
        m119743a(this.f97402c);
        m119743a(this.f97406g);
        m119743a(this.f97407h);
        m119743a(this.f97405f);
        m119743a(this.f97404e);
        m119743a(this.f97400a);
        m119743a(this.f97401b);
        m119743a(this.f97403d);
        m119743a(this.f97402c);
    }

    /* renamed from: a */
    private static void m119743a(ArrayList<String> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList.clear();
        }
    }

    /* renamed from: b */
    public final void mo93886b(String str) {
        if (this.f97400a == null) {
            this.f97400a = new ArrayList<>();
        }
        this.f97400a.add(str);
    }

    /* renamed from: c */
    public final void mo93887c(String str) {
        if (this.f97402c == null) {
            this.f97402c = new ArrayList<>();
        }
        this.f97402c.add(str);
    }

    /* renamed from: a */
    public final void mo93885a(String str) {
        if (this.f97408i == null) {
            this.f97408i = new ArrayList<>();
        }
        this.f97408i.add(str);
    }

    /* renamed from: d */
    public final int mo93888d(String str) {
        if (m119744a(this.f97400a, str)) {
            return 1;
        }
        if (m119744a(this.f97401b, str)) {
            return 2;
        }
        if (m119744a(this.f97402c, str)) {
            return 3;
        }
        if (m119744a(this.f97403d, str)) {
            return 4;
        }
        if (m119744a(this.f97404e, str)) {
            return 5;
        }
        if (m119744a(this.f97405f, str)) {
            return 6;
        }
        if (m119744a(this.f97406g, str)) {
            return 7;
        }
        if (m119744a(this.f97407h, str)) {
            return 8;
        }
        if (m119744a(this.f97408i, str)) {
            return 0;
        }
        return -1;
    }

    /* renamed from: a */
    private static boolean m119744a(ArrayList<String> arrayList, String str) {
        if (arrayList == null) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }
}
