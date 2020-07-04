package com.p280ss.android.ugc.aweme.requesttask.p1504a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.p280ss.android.ugc.aweme.app.C22977g;
import com.p280ss.android.ugc.aweme.lego.C7152c;
import com.p280ss.android.ugc.aweme.lego.RequestType;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requesttask.a.b */
public final class C37226b implements C7152c {

    /* renamed from: a */
    public static boolean f97351a = true;

    /* renamed from: b */
    public static final C37227a f97352b = new C37227a(null);

    /* renamed from: com.ss.android.ugc.aweme.requesttask.a.b$a */
    public static final class C37227a {
        private C37227a() {
        }

        public /* synthetic */ C37227a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.requesttask.a.b$b */
    static final class C37228b implements Runnable {

        /* renamed from: a */
        public static final C37228b f97353a = new C37228b();

        C37228b() {
        }

        public final void run() {
            int i;
            if (C37226b.f97351a) {
                i = 1;
            } else {
                i = 5;
            }
            C34315c.m110980a(false, i);
            C37226b.f97351a = false;
        }
    }

    /* renamed from: a */
    public final RequestType mo18606a() {
        return RequestType.NORMAL;
    }

    /* renamed from: a */
    public final void mo18607a(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        new Handler(Looper.getMainLooper()).postDelayed(C37228b.f97353a, C22977g.m75589a("fetch_notice_count"));
    }
}
