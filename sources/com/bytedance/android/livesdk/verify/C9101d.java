package com.bytedance.android.livesdk.verify;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.p121b.C2336a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p220ui.C5290du.C5295a;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9053at;
import com.bytedance.android.livesdk.utils.C9076n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.verify.d */
public final class C9101d {
    /* renamed from: a */
    public static boolean m27159a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("alipays://"));
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m27158a(final Activity activity, final int i, String str) {
        final ProgressDialog a = C9053at.m27042a(activity);
        a.setCancelable(false);
        a.setCanceledOnTouchOutside(false);
        ((HotsoonVerifyApi) C9178j.m27302j().mo22373b().mo10440a(HotsoonVerifyApi.class)).unbindOldWithdrawAccount(str).mo19280a((C7326g<? super T>) new C7326g<C3479d<Void>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C3479d<Void> dVar) throws Exception {
                if (a.isShowing()) {
                    a.dismiss();
                }
                TTLiveSDKContext.getHostService().mo22370k();
            }
        }, (C7326g<? super Throwable>) new C7326g<Throwable>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                if (a.isShowing()) {
                    a.dismiss();
                }
                C9076n.m27095a(activity, th);
            }
        });
    }

    /* renamed from: a */
    public static void m27156a(final Activity activity, final int i, C2336a aVar) {
        String str = "";
        if (aVar != null) {
            str = aVar.f7660d;
        }
        SpannableString spannableString = new SpannableString(C3358ac.m12515a((int) R.string.fg3));
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ff4e33")), 0, spannableString.length(), 33);
        new C5295a(activity, 2).mo13570a((CharSequence) C3358ac.m12517a((int) R.string.fg5, str)).mo13575b((CharSequence) C3358ac.m12517a((int) R.string.fg4, str)).mo13571a(spannableString, new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                TTLiveSDKContext.getHostService().mo22370k();
            }
        }).mo13576b(C3358ac.m12515a((int) R.string.fg2), new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                C9101d.m27158a(activity, i, "use_withdraw");
            }
        }).mo13577b();
    }

    /* renamed from: a */
    public static void m27157a(final Activity activity, final int i, final C2336a aVar, final Bundle bundle) {
        if (activity != null) {
            SpannableString spannableString = new SpannableString(C3358ac.m12515a((int) R.string.few));
            spannableString.setSpan(new ForegroundColorSpan(C3358ac.m12521b((int) R.color.ag4)), 0, spannableString.length(), 33);
            new C5295a(activity, 2).mo13572a(false).mo13574b((int) R.string.fez).mo13578c(R.string.fex).mo13571a(C3358ac.m12515a((int) R.string.ecm), new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C8448g.m25682a((Context) activity);
                    dialogInterface.dismiss();
                }
            }).mo13576b(spannableString, new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    if (aVar != null && aVar.f7661e == 5) {
                        TTLiveSDKContext.getHostService().mo22370k();
                    } else if (aVar == null || aVar.f7661e != 2) {
                        TTLiveSDKContext.getHostService().mo22370k();
                    } else {
                        C9101d.m27156a(activity, i, aVar);
                    }
                }
            }).mo13569a((OnCancelListener) new OnCancelListener() {
                public final void onCancel(DialogInterface dialogInterface) {
                    C8448g.m25682a((Context) activity);
                }
            }).mo13577b();
            C8448g.m25682a((Context) activity);
        }
    }
}
