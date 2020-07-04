package com.p280ss.android.ugc.aweme.share.improve.p1540c;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.c.d */
public final class C38162d {

    /* renamed from: a */
    private static final ArrayList<String> f99284a = C7525m.m23468d("qr_code", "copy");

    /* renamed from: com.ss.android.ugc.aweme.share.improve.c.d$a */
    static final class C38163a implements OnClickListener {

        /* renamed from: a */
        public static final C38163a f99285a = new C38163a();

        C38163a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public static final boolean m121918a(C38389f fVar) {
        C7573i.m23587b(fVar, "$this$isChannelAction");
        return f99284a.contains(fVar.mo95715b());
    }

    /* renamed from: a */
    public static final void m121917a(C38389f fVar, Context context, String str, String str2, String str3, boolean z, OnClickListener onClickListener) {
        C7573i.m23587b(fVar, "$this$showDialog");
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "title");
        C7573i.m23587b(str2, "message");
        C7573i.m23587b(str3, "positiveText");
        C7573i.m23587b(onClickListener, "onClickListener");
        C11030a aVar = new C11030a(context);
        aVar.mo26640a((CharSequence) str).mo26647b((CharSequence) str2).mo26641a((CharSequence) str3, onClickListener);
        aVar.mo26646b((int) R.string.w_, (OnClickListener) C38163a.f99285a);
        aVar.mo26644a().show();
    }
}
