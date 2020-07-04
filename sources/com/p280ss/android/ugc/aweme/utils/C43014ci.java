package com.p280ss.android.ugc.aweme.utils;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.location.C32630h;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.utils.ci */
public final class C43014ci {
    /* renamed from: a */
    public static void m136517a() {
        m136521a(false);
    }

    /* renamed from: b */
    public static void m136522b() {
        Keva repo = Keva.getRepo("poi_repo");
        if (repo != null) {
            repo.storeBoolean("has_show_location_permission_tip_dialog", true);
        }
    }

    /* renamed from: c */
    public static boolean m136523c() {
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
    private static void m136521a(boolean z) {
        if (!C6399b.m19944t()) {
            try {
                C32630h.m105696b(AwemeApplication.m21341a()).mo83997a(false);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m136518a(Context context, OnClickListener onClickListener) {
        Builder builder = new Builder(context, R.style.rk);
        builder.setTitle(R.string.c4t);
        builder.setMessage(R.string.c4q);
        builder.setPositiveButton(R.string.c4s, onClickListener);
        builder.setNegativeButton(R.string.c4p, C43015cj.f111603a);
        builder.show();
    }

    /* renamed from: a */
    public static void m136519a(Context context, OnClickListener onClickListener, OnClickListener onClickListener2) {
        Builder builder = new Builder(context, R.style.rk);
        builder.setTitle(R.string.c4w);
        builder.setMessage(R.string.c4u);
        builder.setPositiveButton(R.string.c4o, onClickListener);
        builder.setNegativeButton(R.string.c4v, onClickListener2);
        builder.show();
    }
}
