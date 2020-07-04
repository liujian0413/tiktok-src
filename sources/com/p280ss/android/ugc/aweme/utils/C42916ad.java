package com.p280ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.support.p022v4.app.Fragment;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.ugc.aweme.p313im.C30561h.C30562a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.ad */
public final class C42916ad {
    /* renamed from: a */
    public static final void m136251a(Activity activity, Fragment fragment, int i, String str, String str2) {
        C7573i.m23587b(activity, "context");
        C7573i.m23587b(str, "path");
        C7573i.m23587b(str2, "name");
        if (!C7573i.m23585a((Object) "mounted", (Object) Environment.getExternalStorageState())) {
            C9738o.m28694a((Context) activity, (int) R.drawable.wt, (int) R.string.ctz);
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str2);
        intent.addFlags(1);
        Context context = activity;
        intent.putExtra("output", C19929d.m65754a(context, file2));
        if (fragment != null) {
            try {
                fragment.startActivityForResult(intent, i);
            } catch (Exception unused) {
                C9738o.m28694a(context, (int) R.drawable.wt, (int) R.string.ctw);
                return;
            }
        } else {
            activity.startActivityForResult(intent, i);
        }
        C30562a.m99834a().mo80304a(true);
    }
}
