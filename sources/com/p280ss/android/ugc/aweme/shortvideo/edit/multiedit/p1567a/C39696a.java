package com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a */
public final class C39696a {

    /* renamed from: a */
    public static final C39696a f103196a = new C39696a();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a$a */
    static final class C39697a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f103197a;

        /* renamed from: b */
        final /* synthetic */ C7561a f103198b;

        C39697a(String str, C7561a aVar) {
            this.f103197a = str;
            this.f103198b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f103198b.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a$b */
    static final class C39698b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7561a f103199a;

        C39698b(C7561a aVar) {
            this.f103199a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f103199a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a$c */
    static final class C39699c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7561a f103200a;

        C39699c(C7561a aVar) {
            this.f103200a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f103200a.invoke();
        }
    }

    private C39696a() {
    }

    /* renamed from: b */
    public static void m127030b(Activity activity, C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "cancel");
        if (activity == null || activity.isFinishing()) {
            aVar.invoke();
        } else {
            new C10741a(activity).mo25657b((int) R.string.axu).mo25658b((int) R.string.axn, (OnClickListener) null).mo25650a((int) R.string.axt, (OnClickListener) new C39698b(aVar)).mo25656a().mo25637a().show();
        }
    }

    /* renamed from: a */
    public static void m127029a(Activity activity, C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "cancel");
        if (activity == null || activity.isFinishing()) {
            aVar.invoke();
        } else {
            new C10741a(activity).mo25657b((int) R.string.axu).mo25658b((int) R.string.axn, (OnClickListener) null).mo25650a((int) R.string.axt, (OnClickListener) new C39699c(aVar)).mo25656a().mo25637a().show();
        }
    }

    /* renamed from: a */
    public static void m127028a(Activity activity, String str, C7561a<C7581n> aVar) {
        C7573i.m23587b(str, "duration");
        C7573i.m23587b(aVar, "confirm2Delete");
        if (activity == null || activity.isFinishing()) {
            aVar.invoke();
        } else {
            new C10741a(activity).mo25660b(str).mo25658b((int) R.string.cas, (OnClickListener) null).mo25650a((int) R.string.axi, (OnClickListener) new C39697a(str, aVar)).mo25656a().mo25637a().show();
        }
    }
}
