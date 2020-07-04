package com.p280ss.android.message;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.p254b.C6304f;
import com.p280ss.android.message.log.C19851c;
import com.p280ss.android.message.p885a.C19813b;
import com.p280ss.android.push.daemon.C20013c;
import com.p280ss.android.pushmanager.setting.C20090b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.text.DateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/* renamed from: com.ss.android.message.MessageReceiver */
public class MessageReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private Handler f53710a = new Handler();

    /* renamed from: a */
    private static long m65377a(Context context) {
        int i;
        Context applicationContext = context.getApplicationContext();
        String str = "push_multi_process_config";
        if (VERSION.SDK_INT >= 11) {
            i = 4;
        } else {
            i = 0;
        }
        return C7285c.m22838a(applicationContext, str, i).getLong("date_change_delay_interval", 0);
    }

    public void onReceive(final Context context, Intent intent) {
        if (context != null && intent != null) {
            final String action = intent.getAction();
            final Uri data = intent.getData();
            if (!"android.intent.action.DATE_CHANGED".equals(action)) {
                mo53109a(context.getApplicationContext(), action, data);
                return;
            }
            long a = m65377a(context);
            if (a > 0) {
                long nextFloat = (long) (new Random((long) UUID.randomUUID().hashCode()).nextFloat() * ((float) a));
                this.f53710a.postDelayed(new Runnable() {
                    public final void run() {
                        MessageReceiver.this.mo53109a(context.getApplicationContext(), action, data);
                    }
                }, nextFloat);
                m65378a(action, a, nextFloat);
            } else if (a == 0) {
                mo53109a(context.getApplicationContext(), action, data);
                m65378a(action, 0, 0);
            } else {
                m65378a(action, -1, -1);
            }
        }
    }

    /* renamed from: a */
    public final void mo53109a(final Context context, final String str, final Uri uri) {
        C6304f.submitRunnable(new Runnable() {
            public final void run() {
                MessageReceiver.m65379b(context, str, uri);
            }
        });
    }

    /* renamed from: a */
    private static void m65378a(String str, long j, long j2) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("time", DateFormat.getDateTimeInstance().format(new Date()));
            bundle.putString("way", str);
            bundle.putLong("max_delay", j);
            bundle.putLong("real_delay", j2);
            C19851c.m65556a("push_alive", bundle);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static void m65379b(Context context, String str, Uri uri) {
        String str2;
        C20013c.m65938a(context).mo53594a();
        if (!TextUtils.isEmpty(str)) {
            if ("android.intent.action.BOOT_COMPLETED".equals(str) && C20090b.m66187a().mo53787m()) {
                return;
            }
            if (C20090b.m66187a().mo53764b()) {
                try {
                    C19813b.m65416a(context);
                } catch (Throwable unused) {
                }
            } else if ("android.intent.action.BOOT_COMPLETED".equals(str)) {
                try {
                    if (!C20090b.m66187a().mo53787m()) {
                        C19841i.m65523e(context);
                    }
                } catch (Exception unused2) {
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(str)) {
                try {
                    C19841i.m65523e(context);
                } catch (Exception unused3) {
                }
            } else if ("android.intent.action.DATE_CHANGED".equals(str)) {
                try {
                    C19841i.m65523e(context);
                } catch (Exception unused4) {
                }
            } else if ("android.intent.action.MEDIA_MOUNTED".equals(str)) {
                try {
                    C19841i.m65523e(context);
                } catch (Exception unused5) {
                }
            } else if ("android.intent.action.MEDIA_UNMOUNTED".equals(str)) {
                try {
                    C19841i.m65523e(context);
                } catch (Exception unused6) {
                }
            } else if ("android.intent.action.USER_PRESENT".equals(str)) {
                try {
                    C19841i.m65523e(context);
                } catch (Exception unused7) {
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(str)) {
                try {
                    C19841i.m65523e(context);
                } catch (Exception unused8) {
                }
            } else if ("android.intent.action.SCREEN_ON".equals(str)) {
                try {
                    C19841i.m65523e(context);
                } catch (Exception unused9) {
                }
            } else if ("android.intent.action.PACKAGE_ADDED".equals(str)) {
                try {
                    C19841i.m65523e(context);
                } catch (Exception unused10) {
                }
            } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(str)) {
                try {
                    C19841i.m65523e(context);
                } catch (Exception unused11) {
                }
            } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(str)) {
                try {
                    C19841i.m65523e(context);
                } catch (Exception unused12) {
                }
            } else {
                if ("android.intent.action.PACKAGE_REMOVED".equals(str)) {
                    if (uri != null) {
                        try {
                            str2 = uri.getSchemeSpecificPart();
                        } catch (Exception unused13) {
                        }
                    } else {
                        str2 = null;
                    }
                    if (!C6319n.m19593a(str2)) {
                        Intent b = C19841i.m65519b(context);
                        b.putExtra("remove_app", true);
                        b.putExtra("remove_app_package", str2);
                        context.startService(b);
                    }
                }
            }
        }
    }
}
