package com.p280ss.android.ugc.aweme.poi.utils;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.f */
public final class C35446f {
    /* renamed from: a */
    public static void m114498a() {
        Keva repo = Keva.getRepo("poi_repo");
        if (repo != null) {
            repo.storeBoolean("has_show_location_permission_tip_dialog", true);
        }
    }

    /* renamed from: b */
    public static boolean m114500b() {
        if (C6399b.m19946v()) {
            return true;
        }
        Keva repo = Keva.getRepo("poi_repo");
        if (repo != null) {
            return repo.getBoolean("has_show_location_permission_tip_dialog", false);
        }
        return true;
    }

    /* renamed from: a */
    public static void m114499a(Context context, OnClickListener onClickListener, OnClickListener onClickListener2) {
        Builder builder = new Builder(context, R.style.rk);
        builder.setTitle(R.string.c4w);
        builder.setMessage(R.string.c4u);
        builder.setPositiveButton(R.string.c4o, onClickListener);
        builder.setNegativeButton(R.string.c4v, onClickListener2);
        builder.show();
    }
}
