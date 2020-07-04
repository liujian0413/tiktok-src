package com.p280ss.android.ugc.aweme.newfollow.model;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.model.c */
public final class C34146c {

    /* renamed from: a */
    public List<C34145b> f88979a;

    /* renamed from: b */
    public long f88980b;

    /* renamed from: c */
    public long f88981c;

    /* renamed from: d */
    public int f88982d;

    /* renamed from: e */
    public int f88983e = 1;

    /* renamed from: f */
    public String f88984f;

    /* renamed from: g */
    public String f88985g;

    /* renamed from: h */
    public Exception f88986h;

    public C34146c() {
    }

    /* renamed from: a */
    public final boolean mo86838a() {
        if (this.f88982d == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C34146c clone() {
        try {
            C34146c cVar = (C34146c) super.clone();
            cVar.f88982d = this.f88982d;
            cVar.f88980b = this.f88980b;
            cVar.f88981c = this.f88981c;
            cVar.f88979a = (ArrayList) ((ArrayList) this.f88979a).clone();
            return cVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public C34146c(String str) {
        this.f88985g = str;
    }
}
