package com.p280ss.android.socialbase.appdownloader.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.socialbase.appdownloader.AppDownloader;
import com.p280ss.android.socialbase.appdownloader.C20170d;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadDepend;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadEventHandler;
import com.p280ss.android.socialbase.appdownloader.depend.IDownloadAlertDialog;
import com.p280ss.android.socialbase.appdownloader.depend.IDownloadAlertDialogBuilder;
import com.p280ss.android.socialbase.appdownloader.p902a.C20159a;
import com.p280ss.android.socialbase.downloader.depend.C20254v;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity */
public class DownloadTaskDeleteActivity extends Activity {

    /* renamed from: a */
    private IDownloadAlertDialog f54578a;

    /* renamed from: b */
    private Intent f54579b;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    private void m66437a() {
        Window window = getWindow();
        LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity", "onResume", true);
        super.onResume();
        this.f54579b = getIntent();
        m66438b();
        if (this.f54578a != null && !this.f54578a.isShowing()) {
            this.f54578a.show();
        } else if (this.f54578a == null) {
            finish();
        }
        ActivityInstrumentation.onTrace("com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity", "onResume", false);
    }

    /* renamed from: b */
    private void m66438b() {
        if (this.f54578a == null && this.f54579b != null) {
            try {
                final int intExtra = this.f54579b.getIntExtra("extra_click_download_ids", 0);
                final DownloadInfo downloadInfo = Downloader.getInstance(getApplicationContext()).getDownloadInfo(intExtra);
                if (downloadInfo != null) {
                    String title = downloadInfo.getTitle();
                    if (!TextUtils.isEmpty(title)) {
                        int i = R.string.k1;
                        if (AppDownloader.getInstance().useReflectParseRes) {
                            i = C20170d.m66432b(this, "appdownloader_notification_download_delete");
                        }
                        String a = C1642a.m8034a(getString(i), new Object[]{title});
                        IAppDownloadDepend iAppDownloadDepend = AppDownloader.getInstance().appDownloadDepend;
                        IDownloadAlertDialogBuilder iDownloadAlertDialogBuilder = null;
                        if (iAppDownloadDepend != null) {
                            iDownloadAlertDialogBuilder = iAppDownloadDepend.getThemedAlertDlgBuilder(this);
                        }
                        if (iDownloadAlertDialogBuilder == null) {
                            iDownloadAlertDialogBuilder = new C20159a(this);
                        }
                        if (iDownloadAlertDialogBuilder != null) {
                            int i2 = R.string.kh;
                            if (AppDownloader.getInstance().useReflectParseRes) {
                                i2 = C20170d.m66432b(this, "appdownloader_tip");
                            }
                            int i3 = R.string.jw;
                            if (AppDownloader.getInstance().useReflectParseRes) {
                                i3 = C20170d.m66432b(this, "appdownloader_label_ok");
                            }
                            int i4 = R.string.jv;
                            if (AppDownloader.getInstance().useReflectParseRes) {
                                i4 = C20170d.m66432b(this, "appdownloader_label_cancel");
                            }
                            iDownloadAlertDialogBuilder.setTitle(i2).setMessage(a).setPositiveButton(i3, (OnClickListener) new OnClickListener() {
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    IAppDownloadEventHandler iAppDownloadEventHandler = AppDownloader.getInstance().appDownloadEventHandler;
                                    if (iAppDownloadEventHandler != null) {
                                        iAppDownloadEventHandler.handleDownloadCancel(downloadInfo);
                                    }
                                    C20254v downloadNotificationEventListener = Downloader.getInstance(C20269b.m66765x()).getDownloadNotificationEventListener(intExtra);
                                    if (downloadNotificationEventListener != null) {
                                        downloadNotificationEventListener.mo53943a(10, downloadInfo, "", "");
                                    }
                                    if (C20269b.m66765x() != null) {
                                        Downloader.getInstance(C20269b.m66765x()).cancel(intExtra);
                                    }
                                    DownloadTaskDeleteActivity.this.finish();
                                }
                            }).setNegativeButton(i4, (OnClickListener) new OnClickListener() {
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    DownloadTaskDeleteActivity.this.finish();
                                }
                            }).setOnCancelListener(new OnCancelListener() {
                                public final void onCancel(DialogInterface dialogInterface) {
                                    DownloadTaskDeleteActivity.this.finish();
                                }
                            });
                            this.f54578a = iDownloadAlertDialogBuilder.show();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity", "onCreate", true);
        super.onCreate(bundle);
        m66437a();
        ActivityInstrumentation.onTrace("com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity", "onCreate", false);
    }
}
