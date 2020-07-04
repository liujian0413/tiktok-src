package com.p280ss.android.ugc.aweme.promote;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.promote.c */
public final class C36924c {

    /* renamed from: a */
    static PromoteProgramDialog f96759a;

    /* renamed from: b */
    private static SharedPreferences f96760b;

    /* renamed from: a */
    public static void m118806a() {
        Editor edit = m118807b().edit();
        edit.putBoolean("joined", true);
        edit.apply();
    }

    /* renamed from: b */
    private static SharedPreferences m118807b() {
        if (f96760b == null) {
            f96760b = C7285c.m22838a(AwemeApplication.m21341a(), "aweme-promote-dialog", 0);
        }
        return f96760b;
    }

    /* renamed from: c */
    private static boolean m118808c() {
        Boolean bool = (Boolean) SharePrefCache.inst().getPromoteDialogShouldShow().mo59877d();
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        String string = m118807b().getString("uid", "");
        String curUserId = C21115b.m71197a().getCurUserId();
        if (TextUtils.isEmpty(string)) {
            Editor edit = m118807b().edit();
            edit.putString("uid", curUserId);
            edit.apply();
            string = curUserId;
        }
        if (!string.equals(curUserId)) {
            Editor edit2 = m118807b().edit();
            edit2.putBoolean("joined", false);
            edit2.putString("uid", curUserId);
            edit2.putInt("popup_times", 0);
            edit2.putLong("popup_last_time", 0);
            edit2.apply();
        }
        if (m118807b().getBoolean("joined", false)) {
            return false;
        }
        int i = m118807b().getInt("popup_times", 0);
        long j = m118807b().getLong("popup_last_time", 0);
        Integer num = (Integer) SharePrefCache.inst().getPromoteDialogPopupPopupInterval().mo59877d();
        if (i >= ((Integer) SharePrefCache.inst().getPromoteDialogPopupTimesLimit().mo59877d()).intValue() || System.currentTimeMillis() - j <= ((long) (num.intValue() * 1000 * 3600 * 24))) {
            return false;
        }
        Editor edit3 = m118807b().edit();
        edit3.putInt("popup_times", i + 1);
        edit3.putLong("popup_last_time", System.currentTimeMillis());
        edit3.apply();
        return true;
    }

    /* renamed from: a */
    public static PromoteProgramDialog m118805a(Activity activity) {
        if (activity == null || activity.isFinishing() || !C21115b.m71197a().isLogin()) {
            return null;
        }
        if (f96759a != null) {
            f96759a.dismiss();
            f96759a = null;
        }
        if (!m118808c()) {
            return null;
        }
        if (C6399b.m19946v()) {
            f96759a = new PromoteProgramDialog(activity, "");
        } else {
            f96759a = new PromoteProgramDialog(activity, "", (int) C9738o.m28708b(C6399b.m19921a(), 52.0f));
        }
        f96759a.setOnDismissListener(new OnDismissListener() {
            public final void onDismiss(DialogInterface dialogInterface) {
                SharePrefCache.inst().getShowPromoteLicense().mo59871a(Integer.valueOf(0));
                C36924c.f96759a = null;
            }
        });
        C6907h.m21524a("creative_permission_show", (Map) C22984d.m75611a().f60753a);
        f96759a.show();
        return f96759a;
    }
}
