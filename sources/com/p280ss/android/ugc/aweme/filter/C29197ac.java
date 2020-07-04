package com.p280ss.android.ugc.aweme.filter;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.ac */
public final class C29197ac implements C29230az {

    /* renamed from: a */
    public static final C29198a f77097a = new C29198a(null);

    /* renamed from: b */
    private final String f77098b;

    /* renamed from: c */
    private final C29243be f77099c;

    /* renamed from: com.ss.android.ugc.aweme.filter.ac$a */
    public static final class C29198a {
        private C29198a() {
        }

        public /* synthetic */ C29198a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C29197ac m95831a(String str) {
            C7573i.m23587b(str, "tag");
            return new C29197ac(str, new C29245bg());
        }
    }

    /* renamed from: a */
    public static final C29197ac m95828a(String str) {
        return C29198a.m95831a(str);
    }

    public C29197ac(String str, C29243be beVar) {
        C7573i.m23587b(str, "storeName");
        C7573i.m23587b(beVar, "kvFloatStore");
        this.f77098b = str;
        this.f77099c = beVar;
    }

    /* renamed from: a */
    public final int mo74794a(C29296g gVar, C29238ba baVar) {
        C7573i.m23587b(gVar, "filterBean");
        C7573i.m23587b(baVar, "getter");
        C29297h.m96118a(gVar, baVar);
        C29243be beVar = this.f77099c;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f77098b);
        sb.append('-');
        sb.append(gVar.f77266a);
        int b = beVar.mo74879b(sb.toString(), -1);
        if (b == -1) {
            return C29297h.m96117a(gVar, gVar.f77275j, baVar);
        }
        return b;
    }

    /* renamed from: a */
    public final void mo74795a(C29296g gVar, int i) {
        C7573i.m23587b(gVar, "filterBean");
        C29243be beVar = this.f77099c;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f77098b);
        sb.append('-');
        sb.append(gVar.f77266a);
        beVar.mo74878a(sb.toString(), i);
    }
}
