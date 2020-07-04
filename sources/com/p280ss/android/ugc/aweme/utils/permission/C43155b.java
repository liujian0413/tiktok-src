package com.p280ss.android.ugc.aweme.utils.permission;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p029v7.app.AlertDialog;
import android.support.p029v7.app.AlertDialog.C1081a;
import com.p280ss.android.ugc.aweme.friends.p1285ui.ContactsActivity;
import com.p280ss.android.ugc.aweme.friends.p1285ui.InviteFriendsActivity;
import com.p280ss.android.ugc.aweme.utils.C42969bc;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.utils.permission.b */
public final class C43155b {

    /* renamed from: com.ss.android.ugc.aweme.utils.permission.b$a */
    public interface C43158a {
        /* renamed from: a */
        void mo76646a();
    }

    /* renamed from: a */
    public static void m136878a(int i, int i2, Activity activity) {
        m136879a(i, i2, activity, null);
    }

    /* renamed from: a */
    public static void m136879a(int i, int i2, final Activity activity, final C43158a aVar) {
        AlertDialog b = new C1081a(activity, R.style.m2).mo4225a(i).mo4237b(i2).mo4238b((int) R.string.w_, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if ((activity instanceof ContactsActivity) || (activity instanceof InviteFriendsActivity)) {
                    activity.finish();
                }
            }
        }).mo4226a((int) R.string.afn, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C42969bc.m136401a(activity);
                if (aVar != null) {
                    aVar.mo76646a();
                }
            }
        }).mo4242b();
        try {
            b.setCancelable(false);
            b.setCanceledOnTouchOutside(false);
            b.show();
        } catch (Exception unused) {
        }
    }
}
