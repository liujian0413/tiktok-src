package com.p280ss.android.ugc.aweme.property;

import android.arch.lifecycle.C0052o;
import com.p280ss.android.ugc.aweme.utils.C42909a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.property.r */
public final class C36983r implements C36979n {

    /* renamed from: a */
    private final C0052o<C36969j> f96894a = this.f96898e.mo93384b();

    /* renamed from: b */
    private final C0052o<Integer> f96895b = this.f96898e.mo93386d();

    /* renamed from: c */
    private final C0052o<String> f96896c = this.f96898e.mo93387e();

    /* renamed from: d */
    private final C0052o<Language> f96897d = this.f96898e.mo93383a();

    /* renamed from: e */
    private final C36980o f96898e;

    /* renamed from: com.ss.android.ugc.aweme.property.r$a */
    static final class C36984a extends Lambda implements C7562b<C36957c, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f96899a;

        C36984a(String str) {
            this.f96899a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m118983a((C36957c) obj));
        }

        /* renamed from: a */
        private boolean m118983a(C36957c cVar) {
            C7573i.m23587b(cVar, "it");
            return C7634n.m23776c((CharSequence) cVar.f96849c, (CharSequence) this.f96899a, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.r$b */
    static final class C36985b extends Lambda implements C7562b<C36957c, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f96900a;

        C36985b(String str) {
            this.f96900a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m118984a((C36957c) obj));
        }

        /* renamed from: a */
        private boolean m118984a(C36957c cVar) {
            C7573i.m23587b(cVar, "it");
            if (C7634n.m23776c((CharSequence) cVar.f96850d, (CharSequence) this.f96900a, true) || C7634n.m23776c((CharSequence) cVar.f96848b, (CharSequence) this.f96900a, true)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.r$c */
    static final class C36986c extends Lambda implements C7562b<C36957c, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f96901a;

        C36986c(String str) {
            this.f96901a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m118985a((C36957c) obj));
        }

        /* renamed from: a */
        private boolean m118985a(C36957c cVar) {
            C7573i.m23587b(cVar, "it");
            if (C7573i.m23585a((Object) this.f96901a, (Object) "#")) {
                return C42909a.m136235a(cVar.f96849c.charAt(0));
            }
            if (C42909a.m136237b(cVar.f96849c.charAt(0))) {
                String a = C42909a.m136234a(String.valueOf(cVar.f96849c.charAt(0)));
                C7573i.m23582a((Object) a, "AVCharacterUtil.hanziToP…chineseKey[0].toString())");
                if (a != null) {
                    String lowerCase = a.toLowerCase();
                    C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                    String str = this.f96901a;
                    if (str != null) {
                        String lowerCase2 = str.toLowerCase();
                        C7573i.m23582a((Object) lowerCase2, "(this as java.lang.String).toLowerCase()");
                        if (C7573i.m23585a((Object) lowerCase, (Object) lowerCase2)) {
                            return true;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.r$d */
    static final class C36987d extends Lambda implements C7562b<C36957c, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f96902a;

        C36987d(String str) {
            this.f96902a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m118986a((C36957c) obj));
        }

        /* renamed from: a */
        private boolean m118986a(C36957c cVar) {
            C7573i.m23587b(cVar, "it");
            if (!C7573i.m23585a((Object) this.f96902a, (Object) "#")) {
                if (C42909a.m136235a(cVar.f96850d.charAt(0))) {
                    String valueOf = String.valueOf(cVar.f96850d.charAt(0));
                    if (valueOf != null) {
                        String lowerCase = valueOf.toLowerCase();
                        C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                        String str = this.f96902a;
                        if (str != null) {
                            String lowerCase2 = str.toLowerCase();
                            C7573i.m23582a((Object) lowerCase2, "(this as java.lang.String).toLowerCase()");
                            if (C7573i.m23585a((Object) lowerCase, (Object) lowerCase2)) {
                                return true;
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                return false;
            } else if (!C42909a.m136235a(cVar.f96850d.charAt(0))) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: a */
    public final C0052o<C36969j> mo93403a() {
        return this.f96894a;
    }

    /* renamed from: b */
    public final C0052o<Integer> mo93405b() {
        return this.f96895b;
    }

    /* renamed from: c */
    public final C0052o<String> mo93407c() {
        return this.f96896c;
    }

    /* renamed from: d */
    public final C0052o<Language> mo93408d() {
        return this.f96897d;
    }

    public C36983r(C36980o oVar) {
        C7573i.m23587b(oVar, "viewModel");
        this.f96898e = oVar;
    }

    /* renamed from: a */
    public final void mo93404a(String str) {
        C7573i.m23587b(str, "searchStr");
        if (((Language) this.f96898e.mo93383a().getValue()) == Language.Chinese) {
            C0052o b = this.f96898e.mo93384b();
            C36969j a = this.f96898e.mo93385c().mo93389a((C7562b<? super C36957c, Boolean>) new C36984a<Object,Boolean>(str));
            a.mo93390a();
            b.setValue(a);
            return;
        }
        C0052o b2 = this.f96898e.mo93384b();
        C36969j a2 = this.f96898e.mo93385c().mo93389a((C7562b<? super C36957c, Boolean>) new C36985b<Object,Boolean>(str));
        a2.mo93392b();
        b2.setValue(a2);
    }

    /* renamed from: b */
    public final void mo93406b(String str) {
        C7573i.m23587b(str, "searchStr");
        if (((Language) this.f96898e.mo93383a().getValue()) == Language.Chinese) {
            C0052o d = this.f96898e.mo93386d();
            Object value = this.f96898e.mo93384b().getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            d.setValue(Integer.valueOf(((C36969j) value).mo93391b(new C36986c(str))));
            return;
        }
        C0052o d2 = this.f96898e.mo93386d();
        Object value2 = this.f96898e.mo93384b().getValue();
        if (value2 == null) {
            C7573i.m23580a();
        }
        d2.setValue(Integer.valueOf(((C36969j) value2).mo93391b(new C36987d(str))));
    }
}
