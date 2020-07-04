package com.p280ss.android.download;

import android.app.Service;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.text.TextUtils;
import android.widget.Toast;
import com.p280ss.android.download.p861b.C19405c.C19406a;

/* renamed from: com.ss.android.download.DownloadHandlerService */
public class DownloadHandlerService extends Service {

    /* renamed from: a */
    C19439q f52313a;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
    }

    /* renamed from: a */
    private static void m63499a(Context context, long j) {
        if (!C19434m.m63902a(context, j, 268435456, true)) {
            C19402b.m63749a(Toast.makeText(context, "Open Fail!", 0));
        }
    }

    /* renamed from: b */
    private void m63501b(Context context, Intent intent) {
        String action = intent.getAction();
        try {
            if ("android.ss.intent.action.DOWNLOAD_DELETE".equals(action)) {
                Uri data = intent.getData();
                Intent intent2 = new Intent(context, DownloadDeleteActivity.class);
                intent2.setData(data);
                intent2.addFlags(268435456);
                context.startActivity(intent2);
                C19414d.m63796a(context).mo51439a(context, ContentUris.parseId(intent.getData()));
            } else if ("android.ss.intent.action.DOWNLOAD_OPEN".equals(action)) {
                long parseId = ContentUris.parseId(intent.getData());
                m63499a(context, parseId);
                C19414d.m63796a(context).mo51439a(context, parseId);
            } else {
                if ("android.ss.intent.action.DOWNLOAD_HIDE".equals(action)) {
                    C19414d.m63796a(context).mo51439a(context, ContentUris.parseId(intent.getData()));
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m63500a(Context context, Intent intent) {
        if (this.f52313a == null) {
            this.f52313a = C19435n.m63904a(context);
        }
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            if (action.equals("android.ss.intent.action.DOWNLOAD_WAKEUP")) {
                DownloadService.m63529a(context);
            } else if (action.equals("android.ss.intent.action.DOWNLOAD_OPEN") || action.equals("android.ss.intent.action.DOWNLOAD_DELETE") || action.equals("android.ss.intent.action.DOWNLOAD_HIDE")) {
                m63501b(context, intent);
            } else if (action.equals("android.ss.intent.action.DOWNLOAD_CLICK")) {
                long parseId = ContentUris.parseId(intent.getData());
                String stringExtra = intent.getStringExtra("extra_notification_tag");
                int a = C19410c.m63772a(context).mo51428a(parseId);
                if (a >= 0) {
                    C19410c.m63775a(context, C19410c.m63771a(a), parseId);
                    if (C19406a.m63755c(a)) {
                        C19414d.m63796a(context).mo51439a(context, parseId);
                        C19414d.m63796a(context).mo51441a(stringExtra);
                    }
                }
            } else {
                if (action.equals("android.ss.intent.action.DOWNLOAD_COMPLETE")) {
                    long longExtra = intent.getLongExtra("extra_download_id", -1);
                    if (!C19414d.m63796a(context).mo51443a(longExtra)) {
                        int intExtra = intent.getIntExtra("extra_download_visibility", 1);
                        if (longExtra > -1 && intExtra != 2) {
                            C19434m.m63902a(context, longExtra, 268435456, false);
                        }
                    }
                }
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        m63500a((Context) this, intent);
        stopSelf();
        return 2;
    }
}
