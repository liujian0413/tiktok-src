package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p029v7.app.AlertDialog.C1081a;
import com.C1642a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31904d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31910j;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.n */
public final class C30797n {
    /* renamed from: b */
    public static boolean m100311b(Context context) {
        if (context.getPackageManager().checkPermission("android.permission.RECORD_AUDIO", C31904d.m103635c(context)) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m100310a(final Context context) {
        new C1081a(context, R.style.m2).mo4225a((int) R.string.bhi).mo4240b((CharSequence) C1642a.m8034a(C6399b.m19921a().getString(R.string.bgs), new Object[]{C31904d.m103633a(context)})).mo4226a((int) R.string.bnp, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C31910j.m103657a(context);
            }
        }).mo4238b((int) R.string.w_, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }).mo4242b().show();
    }

    /* renamed from: a */
    public static void m100309a(final Activity activity, final C6892b<Boolean> bVar) {
        C22477b.m74364a(activity, new String[]{"android.permission.RECORD_AUDIO"}, new C22480b() {
            /* renamed from: a */
            public final void mo53549a(String[] strArr, int[] iArr) {
                if (iArr[0] != 0) {
                    C30797n.m100310a(activity);
                    if (bVar != null) {
                        bVar.run(Boolean.valueOf(false));
                    }
                } else if (bVar != null) {
                    bVar.run(Boolean.valueOf(true));
                }
            }
        });
    }
}
