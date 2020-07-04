package com.p280ss.android.vesdk.runtime;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vesdk.runtime.d */
public abstract class C45362d {

    /* renamed from: a */
    private String f116873a;

    /* renamed from: b */
    private String f116874b;

    /* renamed from: c */
    protected String f116875c;

    /* renamed from: d */
    public List<String> f116876d = new ArrayList();

    /* renamed from: e */
    public List<String> f116877e = new ArrayList();

    /* renamed from: a */
    public abstract String mo56149a();

    /* renamed from: a */
    public abstract String mo56150a(int i);

    /* renamed from: b */
    public String mo56151b() {
        return this.f116873a;
    }

    /* renamed from: b */
    public abstract String mo56152b(int i);

    /* renamed from: c */
    public String mo56153c() {
        return this.f116874b;
    }

    /* renamed from: d */
    public final void mo108578d() {
        if (this.f116876d != null) {
            this.f116876d.clear();
            this.f116876d = null;
        }
        if (this.f116877e != null) {
            this.f116877e.clear();
            this.f116877e = null;
        }
    }

    /* renamed from: e */
    public final void mo108579e() {
        StringBuilder sb = new StringBuilder();
        sb.append(C45363e.m143380a(this.f116875c, "concat"));
        sb.append(File.separator);
        sb.append("concat.mp4");
        this.f116873a = sb.toString();
    }

    /* renamed from: f */
    public final void mo108580f() {
        StringBuilder sb = new StringBuilder();
        sb.append(C45363e.m143380a(this.f116875c, "concat"));
        sb.append(File.separator);
        sb.append("concat.wav");
        this.f116874b = sb.toString();
    }

    public C45362d(String str) {
        this.f116875c = str;
    }
}
