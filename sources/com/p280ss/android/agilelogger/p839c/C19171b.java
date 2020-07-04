package com.p280ss.android.agilelogger.p839c;

import com.p280ss.android.agilelogger.C19178e;
import com.p280ss.android.agilelogger.p838b.C19166a;
import com.p280ss.android.agilelogger.p838b.C19167b;
import com.p280ss.android.agilelogger.utils.C19199d;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ss.android.agilelogger.c.b */
public abstract class C19171b implements C19172c {

    /* renamed from: a */
    protected List<C19166a> f51833a = new LinkedList();

    /* renamed from: b */
    protected C19167b f51834b = new C19167b();

    /* renamed from: c */
    public int f51835c;

    /* renamed from: d */
    protected SimpleDateFormat f51836d = new SimpleDateFormat(mo50886c(), Locale.ENGLISH);

    /* renamed from: c */
    private static String mo50886c() {
        return "yyyy-MM-dd z HH:mm:ss.SSS";
    }

    /* renamed from: a */
    public void mo50882a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo50883a(C19178e eVar);

    /* renamed from: b */
    public void mo50885b() {
    }

    public C19171b() {
        this.f51836d.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        m62862a((C19166a) this.f51834b);
    }

    /* renamed from: a */
    private void m62862a(C19166a aVar) {
        this.f51833a.add(aVar);
    }

    /* renamed from: c */
    private void m62864c(C19178e eVar) {
        if (eVar != null && eVar.f51849d != null) {
            mo50883a(eVar);
        }
    }

    /* renamed from: a */
    public final void mo50899a(int i) {
        this.f51834b.f51819a = i;
    }

    /* renamed from: a */
    public final void mo50900a(List<C19166a> list) {
        if (!C19199d.m62924a(list)) {
            this.f51833a.addAll(list);
        }
    }

    /* renamed from: b */
    public final void mo50901b(C19178e eVar) {
        boolean z = false;
        for (C19166a a : this.f51833a) {
            if (!a.mo50880a(eVar)) {
                z = true;
            }
        }
        if (!z) {
            m62864c(eVar);
        }
    }
}
