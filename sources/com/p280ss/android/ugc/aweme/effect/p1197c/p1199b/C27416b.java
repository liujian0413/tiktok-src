package com.p280ss.android.ugc.aweme.effect.p1197c.p1199b;

import com.p280ss.android.ugc.aweme.effect.p1197c.p1198a.C27414b;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effect.c.b.b */
public abstract class C27416b<Param, Target> {

    /* renamed from: a */
    public int f72329a;

    /* renamed from: b */
    public boolean f72330b;

    /* renamed from: c */
    public Target f72331c;

    /* renamed from: d */
    public C27419e f72332d;

    /* renamed from: e */
    public Param f72333e;

    /* renamed from: f */
    private AtomicInteger f72334f = new AtomicInteger(-1);

    /* renamed from: g */
    private String f72335g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo70525a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo70527b(C27414b<Param, Target> bVar);

    /* renamed from: b */
    public final int mo70526b() {
        return this.f72334f.get();
    }

    /* renamed from: a */
    public final void mo70523a(int i) {
        this.f72334f.set(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo70528c(C27414b<Param, Target> bVar) {
        C7573i.m23587b(bVar, "callback");
        bVar.mo70508b(this);
    }

    /* renamed from: a */
    public final void mo70524a(C27414b<Param, Target> bVar) {
        C7573i.m23587b(bVar, "callback");
        bVar.mo70502a(this);
        if (mo70525a()) {
            mo70523a(3);
            mo70528c(bVar);
            bVar.mo70508b(this);
            return;
        }
        mo70523a(2);
        mo70527b(bVar);
    }

    public C27416b(String str, Param param) {
        C7573i.m23587b(str, "mTaskId");
        this.f72335g = str;
        this.f72333e = param;
        mo70523a(0);
    }
}
