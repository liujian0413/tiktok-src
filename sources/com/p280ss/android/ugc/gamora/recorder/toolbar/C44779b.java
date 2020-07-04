package com.p280ss.android.ugc.gamora.recorder.toolbar;

import android.view.View;

/* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.b */
public final class C44779b implements Comparable<C44779b> {

    /* renamed from: a */
    public final int f115192a;

    /* renamed from: b */
    public int f115193b;

    /* renamed from: c */
    public boolean f115194c = true;

    /* renamed from: d */
    public C44778a f115195d;

    /* renamed from: e */
    public boolean f115196e;

    /* renamed from: f */
    public boolean f115197f;

    /* renamed from: g */
    public int f115198g;

    /* renamed from: h */
    public C44780a f115199h;

    /* renamed from: i */
    public boolean f115200i = true;

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.b$a */
    public interface C44780a {
        /* renamed from: a */
        void mo60330a(View view);
    }

    /* renamed from: a */
    public final C44779b mo107227a() {
        this.f115197f = true;
        return this;
    }

    /* renamed from: b */
    public final void mo107228b() {
        this.f115197f = false;
    }

    public final int hashCode() {
        return this.f115192a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int compareTo(C44779b bVar) {
        return Integer.compare(this.f115192a, bVar.f115192a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C44779b)) {
            return false;
        }
        if (this.f115192a == ((C44779b) obj).f115192a) {
            return true;
        }
        return false;
    }

    public C44779b(int i, int i2, C44778a aVar, int i3) {
        this.f115192a = i;
        this.f115193b = i2;
        this.f115195d = aVar;
        this.f115198g = i3;
    }
}
