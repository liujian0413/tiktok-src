package com.p280ss.android.ugc.aweme.shortvideo.p1579j;

import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.j.a */
public final class C40017a {

    /* renamed from: a */
    public static final C40018a f103919a = new C40018a(null);

    /* renamed from: c */
    private static boolean f103920c;

    /* renamed from: b */
    private String f103921b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.j.a$a */
    public static final class C40018a {
        private C40018a() {
        }

        public /* synthetic */ C40018a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo99456a() {
        if (C7573i.m23585a((Object) this.f103921b, (Object) "click_tag_button")) {
            f103920c = true;
        } else if (f103920c) {
            f103920c = false;
            return;
        }
        C6907h.m21525a("show_tag", new C6909j().mo16966a("enter_method", this.f103921b).mo16967a());
    }

    /* renamed from: a */
    public final C40017a mo99455a(String str) {
        this.f103921b = str;
        return this;
    }
}
