package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.i */
public final class C30898i {
    /* renamed from: a */
    public static C30898i m100632a() {
        return new C30898i();
    }

    /* renamed from: a */
    public final void mo80819a(Context context) {
        new C10741a(context).mo25657b((int) R.string.bgr).mo25658b((int) R.string.bhe, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).mo25650a((int) R.string.bi9, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }).mo25656a().mo25637a();
    }

    /* renamed from: a */
    public final void mo80818a(final Activity activity, final C6892b<Boolean> bVar) {
        C22477b.m74364a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C22480b() {
            /* renamed from: a */
            public final void mo53549a(String[] strArr, int[] iArr) {
                if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                    if (bVar != null) {
                        bVar.run(Boolean.valueOf(false));
                    }
                    C30898i.this.mo80819a(activity);
                } else if (bVar != null) {
                    bVar.run(Boolean.valueOf(true));
                }
            }
        });
    }
}
