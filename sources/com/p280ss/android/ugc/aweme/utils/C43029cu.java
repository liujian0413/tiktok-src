package com.p280ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.p1571f.C39828c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.utils.cu */
public final class C43029cu {
    /* renamed from: a */
    public static boolean m136548a(Activity activity, boolean z, boolean z2, String str) {
        if (activity == null) {
            return false;
        }
        if (z) {
            Intent intent = new Intent();
            intent.putExtra("sticker_pannel_show", true);
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity(activity, intent);
            return true;
        } else if (!z2 || TextUtils.isEmpty(str)) {
            return false;
        } else {
            new C39828c().mo99245a(str, activity, "notification");
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m136549a(final Activity activity, boolean z, final boolean z2, final boolean z3, final String str) {
        if (activity == null) {
            return false;
        }
        if (!z) {
            return m136548a(activity, z2, z3, str);
        }
        new C10741a(activity).mo25649a((int) R.string.cr2).mo25657b((int) R.string.cr0).mo25658b((int) R.string.bce, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).mo25650a((int) R.string.i0, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C43029cu.m136548a(activity, z2, z3, str);
                dialogInterface.dismiss();
            }
        }).mo25656a().mo25637a();
        return true;
    }
}
