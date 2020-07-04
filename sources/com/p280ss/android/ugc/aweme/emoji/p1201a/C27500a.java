package com.p280ss.android.ugc.aweme.emoji.p1201a;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.emoji.p1202b.C27503a;
import com.p280ss.android.ugc.aweme.emoji.p1206d.C27536b;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.online.C27621d.C27622a;
import com.p280ss.android.ugc.aweme.emoji.utils.C27630a;
import com.p280ss.android.ugc.aweme.emoji.utils.C27633d;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.emoji.a.a */
public final class C27500a {

    /* renamed from: a */
    public static C27500a f72532a = C27501a.m90144a();

    /* renamed from: b */
    public static final C27502b f72533b = new C27502b(null);

    /* renamed from: c */
    private boolean f72534c;

    /* renamed from: com.ss.android.ugc.aweme.emoji.a.a$a */
    static final class C27501a {

        /* renamed from: a */
        public static final C27501a f72535a = new C27501a();

        /* renamed from: b */
        private static C27500a f72536b = new C27500a(null);

        private C27501a() {
        }

        /* renamed from: a */
        public static C27500a m90144a() {
            return f72536b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.a.a$b */
    public static final class C27502b {
        private C27502b() {
        }

        public /* synthetic */ C27502b(C7571f fVar) {
            this();
        }
    }

    private C27500a() {
        this.f72534c = true;
    }

    /* renamed from: a */
    public final void mo70702a() {
        C27633d a = C27633d.m90594a();
        C7573i.m23582a((Object) a, "EmojiSPUtils.get()");
        if (!TextUtils.equals(a.mo71035f(), C27630a.m90584b()) || this.f72534c) {
            C27536b.m90251a().mo70760a(true);
            C27503a.m90145a().mo70705a(true);
            C27622a.m90577a().mo70960e();
            C27633d.m90594a().mo71034e();
            this.f72534c = false;
        }
    }

    public /* synthetic */ C27500a(C7571f fVar) {
        this();
    }
}
