package com.p280ss.android.ugc.aweme.p1685ug.referral;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.p480a.C9700a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.p1685ug.referral.getreferer.C42748a;
import com.p280ss.android.ugc.aweme.p1685ug.referral.getreferer.C42750c;
import com.p280ss.android.ugc.aweme.p1685ug.referral.getreferer.C42751d;
import com.p280ss.android.ugc.aweme.p1685ug.referral.getreferer.C42752e;
import java.lang.ref.WeakReference;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.ug.referral.a */
public final class C42740a {

    /* renamed from: a */
    public static final C42740a f111055a = new C42740a();

    /* renamed from: com.ss.android.ugc.aweme.ug.referral.a$a */
    static final class C42741a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WeakReference f111056a;

        /* renamed from: b */
        final /* synthetic */ String f111057b;

        C42741a(WeakReference weakReference, String str) {
            this.f111056a = weakReference;
            this.f111057b = str;
        }

        public final void run() {
            new C42750c(new C42748a(), new C42752e(this) {

                /* renamed from: a */
                final /* synthetic */ C42741a f111058a;

                {
                    this.f111058a = r1;
                }

                /* renamed from: a */
                public final void mo104352a(C42751d dVar) {
                    if (dVar != null && dVar.f111076a == 0) {
                        C42740a.m135672a(C6399b.m19921a());
                        Activity activity = (Activity) this.f111058a.f111056a.get();
                        if (activity != null && !activity.isFinishing()) {
                            C42743b bVar = new C42743b(activity, activity, dVar.f111079d, dVar.f111078c, dVar.f111080e, this.f111058a.f111057b);
                            bVar.show();
                        }
                    }
                }
            }).mo104361a(this.f111057b);
        }
    }

    private C42740a() {
    }

    /* renamed from: a */
    public static void m135672a(Context context) {
        C7573i.m23587b(context, "context");
        C9700a.m28636a(context, "", "");
    }

    /* renamed from: a */
    public static String m135670a(ClipboardManager clipboardManager) {
        ClipData clipData;
        C7573i.m23587b(clipboardManager, "cm");
        Item item = null;
        try {
            clipData = clipboardManager.getPrimaryClip();
        } catch (Exception unused) {
            clipData = null;
        }
        if (clipData != null) {
            item = clipData.getItemAt(0);
        }
        if (item != null) {
            Item itemAt = clipData.getItemAt(0);
            C7573i.m23582a((Object) itemAt, "clipData.getItemAt(0)");
            if (itemAt.getText() != null) {
                Item itemAt2 = clipData.getItemAt(0);
                C7573i.m23582a((Object) itemAt2, "clipData.getItemAt(0)");
                return itemAt2.getText().toString();
            }
        }
        return "";
    }

    /* renamed from: a */
    public static void m135671a(Activity activity) {
        C7573i.m23587b(activity, "activity");
        Object systemService = C6399b.m19921a().getSystemService("clipboard");
        if (systemService != null) {
            C7121a.m22248b().mo18559a(new ReferralCodeDetector$detectReferralCode$1((ClipboardManager) systemService, new WeakReference(activity))).mo18560a();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
    }

    /* renamed from: a */
    public static void m135673a(WeakReference<Activity> weakReference, String str) {
        C7573i.m23587b(weakReference, "weakRef");
        C7573i.m23587b(str, "clipString");
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new C42741a(weakReference, str));
    }
}
