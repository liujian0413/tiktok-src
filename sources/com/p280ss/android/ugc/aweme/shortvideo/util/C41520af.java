package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.af */
public final class C41520af {

    /* renamed from: a */
    public static final C41520af f107981a = new C41520af();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static Dialog f107982b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.af$a */
    static final class C41521a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7561a f107983a;

        C41521a(C7561a aVar) {
            this.f107983a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f107983a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.af$b */
    static final class C41522b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f107984a;

        /* renamed from: b */
        final /* synthetic */ C7561a f107985b;

        C41522b(Context context, C7561a aVar) {
            this.f107984a = context;
            this.f107985b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C35563c.f93224F.mo70088c().mo90361d(this.f107984a);
            this.f107985b.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.af$c */
    static final class C41523c implements OnDismissListener {

        /* renamed from: a */
        public static final C41523c f107986a = new C41523c();

        C41523c() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C41520af.f107982b = null;
        }
    }

    private C41520af() {
    }

    /* renamed from: a */
    public static void m132256a(Context context, C7561a<C7581n> aVar, C7561a<C7581n> aVar2) {
        boolean z;
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aVar, "onCancel");
        C7573i.m23587b(aVar2, "onConfirm");
        if (f107982b == null) {
            Dialog a = new C10741a(context).mo25657b((int) R.string.l_).mo25658b((int) R.string.w_, (OnClickListener) new C41521a(aVar)).mo25650a((int) R.string.afp, (OnClickListener) new C41522b(context, aVar2)).mo25656a().mo25637a();
            a.setOnDismissListener(C41523c.f107986a);
            f107982b = a;
        }
        Dialog dialog = f107982b;
        if (dialog != null) {
            if (!(context instanceof Activity) || ((Activity) context).isFinishing() || dialog.isShowing()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                dialog = null;
            }
            if (dialog != null) {
                try {
                    dialog.show();
                    C23487o.m77138a(dialog);
                } catch (Exception e) {
                    C42880h.m136156a(e.toString());
                }
            }
        }
    }
}
