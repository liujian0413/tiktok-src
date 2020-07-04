package com.p280ss.android.ugc.aweme.share.improve.p1540c;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p022v4.content.C0683b;
import android.view.ContextThemeWrapper;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.http.util.C10190j;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import java.io.File;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.share.improve.c.b */
public final class C38157b {

    /* renamed from: com.ss.android.ugc.aweme.share.improve.c.b$a */
    static final class C38158a implements OnClickListener {

        /* renamed from: a */
        public static final C38158a f99280a = new C38158a();

        C38158a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public static final boolean m121907a(File file) {
        if (file.exists() && file.length() <= 15728640) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m121909b(Context context) {
        C7573i.m23587b(context, "context");
        if (C0683b.m2909b(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final Activity m121903a(Context context) {
        C7573i.m23587b(context, "$this$tryAsActivity");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) context;
            if (contextThemeWrapper.getBaseContext() instanceof Activity) {
                Context baseContext = contextThemeWrapper.getBaseContext();
                if (baseContext != null) {
                    return (Activity) baseContext;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
        }
        Activity g = C6405d.m19984g();
        if (g == null) {
            C7573i.m23580a();
        }
        return g;
    }

    /* renamed from: b */
    public static final String m121908b(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || C7634n.m23776c(charSequence, (CharSequence) "timestamp=", false)) {
            return str;
        }
        C10190j jVar = new C10190j(str);
        jVar.mo24889a("timestamp", C23486n.m77126b(System.currentTimeMillis()));
        return jVar.mo24886a();
    }

    /* renamed from: a */
    public static final ShareInfo m121904a(ShareInfo shareInfo) {
        if (shareInfo != null) {
            return shareInfo;
        }
        ShareInfo shareInfo2 = new ShareInfo();
        shareInfo2.setShareTitle("");
        shareInfo2.setBoolPersist(0);
        shareInfo2.setShareDesc("");
        shareInfo2.setShareSignatureDesc("");
        shareInfo2.setShareSignatureUrl("");
        shareInfo2.setShareUrl("");
        shareInfo2.setShareQuote("");
        return shareInfo2;
    }

    /* renamed from: a */
    public static final String m121905a(String str) {
        if (str == null || C7634n.m23721b(str, "http://", false) || C7634n.m23721b(str, "https://", false)) {
            return str;
        }
        StringBuilder sb = new StringBuilder("https://");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static final void m121906a(Context context, String str, String str2, String str3, OnClickListener onClickListener, String str4, OnClickListener onClickListener2) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "title");
        C7573i.m23587b(str2, "message");
        C7573i.m23587b(str3, "positiveText");
        C7573i.m23587b(onClickListener, "onPositiveClickListener");
        C10741a a = new C10741a(context).mo25653a(str).mo25660b(str2).mo25654a(str3, onClickListener);
        if (!C6319n.m19593a((String) null)) {
            a.mo25661b((String) null, (OnClickListener) C38158a.f99280a);
        }
        a.mo25656a().mo25637a();
    }
}
