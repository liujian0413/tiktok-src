package com.p280ss.android.socialbase.appdownloader;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.text.TextUtils;
import android.widget.Toast;
import com.p280ss.android.medialib.camera.ImageFrame;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadEventHandler;
import com.p280ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity;
import com.p280ss.android.socialbase.downloader.constants.C20195c;
import com.p280ss.android.socialbase.downloader.depend.C20254v;
import com.p280ss.android.socialbase.downloader.depend.C20259y;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.C20271c;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.notification.C20354b;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.ss.android.socialbase.appdownloader.DownloadHandlerService */
public class DownloadHandlerService extends Service {

    /* renamed from: a */
    private static final String f54545a = "DownloadHandlerService";

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C20269b.m66725a((Context) this);
    }

    /* renamed from: a */
    private boolean m66415a(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return false;
        }
        IAppDownloadEventHandler iAppDownloadEventHandler = AppDownloader.getInstance().appDownloadEventHandler;
        int intExtra = intent.getIntExtra("extra_click_download_ids", 0);
        int intExtra2 = intent.getIntExtra("extra_click_download_type", 0);
        C20254v downloadNotificationEventListener = Downloader.getInstance(this).getDownloadNotificationEventListener(intExtra);
        if (action.equals("android.ss.intent.action.DOWNLOAD_OPEN") || action.equals("android.ss.intent.action.DOWNLOAD_DELETE") || action.equals("android.ss.intent.action.DOWNLOAD_HIDE")) {
            m66412a((Context) this, intent);
            if (action.equals("android.ss.intent.action.DOWNLOAD_DELETE")) {
                DownloadInfo downloadInfo = Downloader.getInstance(this).getDownloadInfo(intExtra);
                if (downloadInfo != null) {
                    downloadInfo.updateDownloadTime();
                    if (iAppDownloadEventHandler != null) {
                        iAppDownloadEventHandler.handleDownloadEvent(intExtra, 7, "", downloadInfo.getStatus(), downloadInfo.getDownloadTime());
                    }
                    if (downloadNotificationEventListener != null) {
                        downloadNotificationEventListener.mo53943a(7, downloadInfo, "", "");
                    }
                }
            }
        } else if (action.equals("android.ss.intent.action.DOWNLOAD_CLICK")) {
            DownloadInfo downloadInfo2 = Downloader.getInstance(this).getDownloadInfo(intExtra);
            if (downloadInfo2 == null) {
                return false;
            }
            int status = downloadInfo2.getStatus();
            if (status == 0) {
                return false;
            }
            if (intExtra2 == 1 || intExtra2 == 4) {
                if (C20195c.m66506b(status)) {
                    Downloader.getInstance(this).pause(intExtra);
                    if (iAppDownloadEventHandler != null) {
                        iAppDownloadEventHandler.handleDownloadEvent(intExtra, 5, "", downloadInfo2.getStatus(), downloadInfo2.getDownloadTime());
                    }
                    if (downloadNotificationEventListener != null) {
                        downloadNotificationEventListener.mo53943a(5, downloadInfo2, "", "");
                    }
                } else if (status == -3) {
                    AppDownloadUtils.startViewIntent(this, intExtra, true);
                    m66413a(iAppDownloadEventHandler, downloadInfo2);
                }
            } else if (intExtra2 == 2) {
                if (status == -3) {
                    AppDownloadUtils.startViewIntent(this, intExtra, true);
                    m66413a(iAppDownloadEventHandler, downloadInfo2);
                } else {
                    Downloader.getInstance(this).resume(intExtra);
                    if (iAppDownloadEventHandler != null) {
                        iAppDownloadEventHandler.handleDownloadEvent(intExtra, 6, "", downloadInfo2.getStatus(), downloadInfo2.getDownloadTime());
                    }
                    if (downloadNotificationEventListener != null) {
                        downloadNotificationEventListener.mo53943a(6, downloadInfo2, "", "");
                    }
                }
            } else if (intExtra2 != 3) {
                m66414a(downloadInfo2, iAppDownloadEventHandler, downloadNotificationEventListener);
            } else if (status == -1 || status == -4) {
                Downloader.getInstance(this).restart(intExtra);
            } else if (status == -3) {
                AppDownloadUtils.startViewIntent(this, intExtra, true);
                m66413a(iAppDownloadEventHandler, downloadInfo2);
            }
            if (downloadInfo2.isDownloadOverStatus()) {
                C20354b.m67519a().mo54918a(intExtra);
                C20354b.m67519a().mo54922c(intExtra);
            }
        } else if (action.equals("android.intent.action.BOOT_COMPLETED") || action.equals("android.intent.action.MEDIA_MOUNTED")) {
            C20269b.m66749h().execute(new Runnable() {
                public final void run() {
                    try {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("application/vnd.android.package-archive");
                        arrayList.add("mime_type_plugin");
                        Downloader.getInstance(C20269b.m66765x()).restartAllFailedDownloadTasks(arrayList);
                    } catch (Exception unused) {
                    }
                }
            });
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m66413a(final IAppDownloadEventHandler iAppDownloadEventHandler, final DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            final C20254v downloadNotificationEventListener = Downloader.getInstance(this).getDownloadNotificationEventListener(downloadInfo.getId());
            if (iAppDownloadEventHandler != null || downloadNotificationEventListener != null) {
                C20269b.m66749h().execute(new Runnable() {
                    public final void run() {
                        try {
                            File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
                            if (file.exists()) {
                                String str = "";
                                try {
                                    Context x = C20269b.m66765x();
                                    if (x != null) {
                                        PackageInfo packageArchiveInfo = x.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), AppDownloadUtils.getPackageInfoFlag());
                                        if (packageArchiveInfo != null) {
                                            str = packageArchiveInfo.packageName;
                                        }
                                    }
                                    if (iAppDownloadEventHandler != null) {
                                        iAppDownloadEventHandler.handleDownloadEvent(downloadInfo.getId(), 3, str, -3, downloadInfo.getDownloadTime());
                                    }
                                    if (downloadNotificationEventListener != null) {
                                        downloadNotificationEventListener.mo53943a(3, downloadInfo, str, "");
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        } catch (Exception unused2) {
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private void m66412a(Context context, Intent intent) {
        String action = intent.getAction();
        boolean z = false;
        try {
            int intExtra = intent.getIntExtra("extra_click_download_ids", 0);
            boolean booleanExtra = intent.getBooleanExtra("extra_from_notification", false);
            if ("android.ss.intent.action.DOWNLOAD_DELETE".equals(action)) {
                if (booleanExtra) {
                    C20259y n = C20271c.m66769a().mo54312n(intExtra);
                    if (n == null) {
                        n = C20269b.m66762u();
                    }
                    if (n != null) {
                        try {
                            DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(intExtra);
                            if (downloadInfo != null) {
                                z = n.mo51644a(downloadInfo);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (!z) {
                    Intent intent2 = new Intent(context, DownloadTaskDeleteActivity.class);
                    intent2.putExtra("extra_click_download_ids", intExtra);
                    intent2.addFlags(268435456);
                    context.startActivity(intent2);
                    C20354b.m67519a().mo54918a(intExtra);
                }
            } else if ("android.ss.intent.action.DOWNLOAD_OPEN".equals(action)) {
                m66411a(context, intExtra, booleanExtra);
                IAppDownloadEventHandler iAppDownloadEventHandler = AppDownloader.getInstance().appDownloadEventHandler;
                C20254v downloadNotificationEventListener = Downloader.getInstance(this).getDownloadNotificationEventListener(intExtra);
                if (!(iAppDownloadEventHandler == null && downloadNotificationEventListener == null)) {
                    DownloadInfo downloadInfo2 = Downloader.getInstance(this).getDownloadInfo(intExtra);
                    if (downloadInfo2 != null) {
                        m66413a(iAppDownloadEventHandler, downloadInfo2);
                    }
                }
                C20354b.m67519a().mo54918a(intExtra);
            } else {
                if ("android.ss.intent.action.DOWNLOAD_HIDE".equals(action)) {
                    C20354b.m67519a().mo54918a(intExtra);
                }
            }
        } catch (Exception unused2) {
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        m66415a(intent);
        stopSelf();
        return 2;
    }

    /* renamed from: a */
    private static void m66411a(Context context, int i, boolean z) {
        boolean z2;
        if (z) {
            C20259y n = C20271c.m66769a().mo54312n(i);
            if (n != null) {
                try {
                    DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i);
                    if (downloadInfo != null) {
                        z2 = n.mo51645b(downloadInfo);
                        if (!z2 && AppDownloadUtils.startViewIntent(context, i, true) == 0) {
                            C20165b.m66425a(Toast.makeText(context, "Open Fail!", 0));
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        z2 = false;
        C20165b.m66425a(Toast.makeText(context, "Open Fail!", 0));
    }

    /* renamed from: a */
    private void m66414a(DownloadInfo downloadInfo, IAppDownloadEventHandler iAppDownloadEventHandler, C20254v vVar) {
        int id = downloadInfo.getId();
        switch (downloadInfo.getStatus()) {
            case -4:
            case -1:
                Downloader.getInstance(this).restart(id);
                return;
            case ImageFrame.NV21 /*-3*/:
                AppDownloadUtils.startViewIntent(this, id, true);
                m66413a(iAppDownloadEventHandler, downloadInfo);
                break;
            case -2:
                Downloader.getInstance(this).resume(id);
                if (iAppDownloadEventHandler != null) {
                    iAppDownloadEventHandler.handleDownloadEvent(id, 6, "", downloadInfo.getStatus(), downloadInfo.getDownloadTime());
                }
                if (vVar != null) {
                    vVar.mo53943a(6, downloadInfo, "", "");
                    return;
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                Downloader.getInstance(this).pause(id);
                if (iAppDownloadEventHandler != null) {
                    iAppDownloadEventHandler.handleDownloadEvent(id, 5, "", downloadInfo.getStatus(), downloadInfo.getDownloadTime());
                }
                if (vVar != null) {
                    vVar.mo53943a(5, downloadInfo, "", "");
                    return;
                }
                break;
        }
    }
}
