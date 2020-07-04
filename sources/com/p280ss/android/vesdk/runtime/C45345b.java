package com.p280ss.android.vesdk.runtime;

import java.io.File;

/* renamed from: com.ss.android.vesdk.runtime.b */
public final class C45345b {

    /* renamed from: a */
    public String f116796a;

    /* renamed from: b */
    public String[] f116797b;

    /* renamed from: c */
    public String[] f116798c;

    /* renamed from: d */
    public String[] f116799d;

    /* renamed from: e */
    public String[] f116800e;

    /* renamed from: f */
    public String[] f116801f;

    /* renamed from: g */
    public boolean f116802g;

    /* renamed from: h */
    public int f116803h;

    /* renamed from: i */
    public int f116804i;

    public C45345b(String str) {
        this.f116796a = str;
    }

    /* renamed from: a */
    public final String mo108562a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(C45363e.m143380a(this.f116796a, "concat"));
        sb.append(File.separator);
        sb.append(i);
        sb.append("_reverse");
        sb.append(".mp4");
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo108563b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(C45363e.m143380a(this.f116796a, "concat"));
        sb.append(File.separator);
        sb.append(0);
        sb.append("_reverse");
        sb.append(".wav");
        return sb.toString();
    }
}
