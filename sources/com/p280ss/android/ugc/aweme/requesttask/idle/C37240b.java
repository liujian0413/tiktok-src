package com.p280ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.p280ss.android.ugc.aweme.app.C22977g;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p280ss.android.ugc.aweme.lego.C7152c;
import com.p280ss.android.ugc.aweme.lego.RequestType;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.b */
public final class C37240b implements C7152c {

    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.b$a */
    static final class C37241a implements Runnable {

        /* renamed from: a */
        public static final C37241a f97360a = new C37241a();

        C37241a() {
        }

        public final void run() {
            AnchorListManager.m80516a();
        }
    }

    /* renamed from: a */
    public final RequestType mo18606a() {
        return RequestType.SPARSE;
    }

    /* renamed from: a */
    public final void mo18607a(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        long b = C22977g.f60742b.mo59966b("anchor_list");
        Handler handler = new Handler(Looper.getMainLooper());
        Runnable runnable = C37241a.f97360a;
        if (!AnchorListManager.f64708a.mo64315e()) {
            b = 0;
        }
        handler.postDelayed(runnable, b);
    }
}
