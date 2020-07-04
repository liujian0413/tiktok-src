package com.p280ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.main.C32981dh;
import com.p280ss.android.ugc.aweme.main.dialogmanager.HomeDialogManager.C32984a;
import com.p280ss.android.ugc.aweme.p1685ug.guide.C42704f;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.utils.cx */
public final class C43034cx extends C43033cw {

    /* renamed from: com.ss.android.ugc.aweme.utils.cx$a */
    public interface C43038a {
        /* renamed from: a */
        void mo84835a();
    }

    /* renamed from: a */
    public static void m136557a(final Context context, final C43038a aVar) {
        C6726a.m20842a(new Runnable() {
            public final void run() {
                C43034cx.m136558a(context, false, aVar);
            }
        });
    }

    /* renamed from: a */
    public static boolean m136561a(Context context, boolean z) {
        SharedPreferences a = C7285c.m22838a(context, "NotificationGuide", 0);
        if (C43033cw.m136550a(context)) {
            return false;
        }
        if (z) {
            return true;
        }
        if (a.getInt("guide_show_times", 0) >= C7213d.m22500a().mo18820t()) {
            return false;
        }
        if (System.currentTimeMillis() - a.getLong("guide_last_time", 0) < ((long) C7213d.m22500a().mo18821u()) * 60000) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m136558a(Context context, boolean z, C43038a aVar) {
        m136559a(context, false, null, aVar, false);
    }

    /* renamed from: a */
    public static void m136560a(Context context, boolean z, boolean z2) {
        m136559a(context, true, null, null, z2);
    }

    /* renamed from: a */
    private static void m136559a(Context context, boolean z, Runnable runnable, C43038a aVar, boolean z2) {
        C32981dh dhVar = (C32981dh) C23336d.m76560a(context, C32981dh.class);
        if (!m136561a(context, z) || VERSION.SDK_INT < 21) {
            if (aVar != null) {
                aVar.mo84835a();
            }
            return;
        }
        try {
            if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                final Context context2 = context;
                final boolean z3 = z;
                final boolean z4 = z2;
                final C43038a aVar2 = aVar;
                C430362 r1 = new Runnable(null) {
                    public final void run() {
                        String str;
                        AlertDialog alertDialog;
                        Dialog dialog;
                        Activity activity = (Activity) context2;
                        if (z3) {
                            str = context2.getString(R.string.aod);
                        } else {
                            str = (String) SharePrefCache.inst().getRequestNotificationText().mo59877d();
                            if (TextUtils.isEmpty(str)) {
                                str = context2.getString(R.string.aoc);
                            }
                        }
                        String str2 = (String) SharePrefCache.inst().getRequestNotificationTitle().mo59877d();
                        if (TextUtils.isEmpty(str2)) {
                            str2 = context2.getString(R.string.e_0);
                        }
                        C43039cy cyVar = new C43039cy(context2, z3, null);
                        C43040cz czVar = new C43040cz(z3, context2, null);
                        C10730a aVar = null;
                        if (z4) {
                            alertDialog = new Builder(context2).setTitle(R.string.drp).setMessage(R.string.drs).setPositiveButton(R.string.drr, cyVar).setNegativeButton(R.string.drq, czVar).create();
                        } else {
                            aVar = new C10741a(context2).mo25663c(R.drawable.b87).mo25653a(str2).mo25660b(str).mo25651a((int) R.string.up, (OnClickListener) cyVar, true).mo25659b((int) R.string.byk, (OnClickListener) czVar, true).mo25656a();
                            alertDialog = 0;
                        }
                        if (!activity.isFinishing()) {
                            if (alertDialog != 0) {
                                try {
                                    alertDialog.setOnShowListener(new OnShowListener() {
                                        public final void onShow(DialogInterface dialogInterface) {
                                            if (dialogInterface instanceof AlertDialog) {
                                                AlertDialog alertDialog = (AlertDialog) dialogInterface;
                                                alertDialog.getButton(-1).setTextColor(-16777216);
                                                alertDialog.getButton(-2).setTextColor(-16777216);
                                            }
                                        }
                                    });
                                    alertDialog.show();
                                    dialog = alertDialog;
                                } catch (Exception unused) {
                                }
                            } else {
                                dialog = aVar.mo25638b();
                            }
                            dialog.setCanceledOnTouchOutside(false);
                            dialog.setOnDismissListener(new C43047da(aVar2));
                            if (z3) {
                                C6907h.m21524a("notification_setting_alert_show", (Map) C22984d.m75611a().mo59973a("enter_from", "notification_setting_page").f60753a);
                            } else {
                                C6907h.m21524a("push_pre_permission_show", (Map) C22984d.m75611a().f60753a);
                            }
                        }
                    }

                    /* renamed from: a */
                    static final /* synthetic */ void m136563a(C43038a aVar, DialogInterface dialogInterface) {
                        if (aVar != null) {
                            aVar.mo84835a();
                        }
                        C32984a.m106624a(false);
                    }

                    /* renamed from: a */
                    static final /* synthetic */ void m136562a(Context context, boolean z, Runnable runnable, DialogInterface dialogInterface, int i) {
                        try {
                            C43033cw.m136552b(context);
                        } catch (Exception unused) {
                            context.startActivity(new Intent("android.settings.SETTINGS"));
                        }
                        if (z) {
                            C6907h.m21524a("notification_setting_alert_click", (Map) C22984d.m75611a().mo59973a("enter_from", "notification_setting_page").f60753a);
                        } else {
                            C6907h.m21524a("push_pre_permission_auth", (Map) C22984d.m75611a().f60753a);
                        }
                        if (dialogInterface != null) {
                            dialogInterface.dismiss();
                        }
                        SharedPreferences a = C7285c.m22838a(context, "NotificationGuide", 0);
                        Editor edit = a.edit();
                        edit.putInt("guide_show_times", a.getInt("guide_show_times", 0) + 1);
                        edit.putLong("guide_last_time", System.currentTimeMillis());
                        edit.apply();
                        if (runnable != null) {
                            runnable.run();
                        }
                    }

                    /* renamed from: a */
                    static final /* synthetic */ void m136564a(boolean z, Context context, Runnable runnable, DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        if (z) {
                            C6907h.m21524a("notification_setting_alert_close", (Map) C22984d.m75611a().mo59973a("enter_from", "notification_setting_page").f60753a);
                        } else {
                            C6907h.m21524a("push_pre_permission_deny", (Map) C22984d.m75611a().f60753a);
                        }
                        SharedPreferences a = C7285c.m22838a(context, "NotificationGuide", 0);
                        Editor edit = a.edit();
                        edit.putInt("guide_show_times", a.getInt("guide_show_times", 0) + 1);
                        edit.putLong("guide_last_time", System.currentTimeMillis());
                        edit.apply();
                        if (runnable != null) {
                            runnable.run();
                        }
                        C42961az.m136380a(new C42704f(false));
                    }
                };
                C6726a.m20844b(r1);
                dhVar.mo60486a(true);
            }
        } catch (Exception unused) {
        }
    }
}
