package com.p280ss.android.ugc.aweme.account.log;

import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.log.b */
public abstract class C21250b {

    /* renamed from: b */
    public static final C21251a f57079b = new C21251a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.log.b$a */
    public static final class C21251a {
        private C21251a() {
        }

        public /* synthetic */ C21251a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public abstract String mo57172a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo57173c(String str) {
        C7573i.m23587b(str, "msg");
        StringBuilder sb = new StringBuilder("AccountAlogHelper-");
        sb.append(mo57172a());
        C6921a.m21552a(4, sb.toString(), str);
    }
}
