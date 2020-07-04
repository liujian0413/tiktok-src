package com.p280ss.android.socialbase.downloader.notification;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.C20285j;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.socialbase.downloader.notification.b */
public class C20354b {

    /* renamed from: a */
    private static volatile C20354b f55024a;

    /* renamed from: c */
    private static final Object f55025c = new Object();

    /* renamed from: b */
    private final Set<String> f55026b = new HashSet();

    /* renamed from: d */
    private final SparseArray<C20353a> f55027d = new SparseArray<>();

    /* renamed from: d */
    private static boolean m67524d(int i) {
        return i == 1 || i == 3;
    }

    private C20354b() {
    }

    /* renamed from: a */
    public static C20354b m67519a() {
        if (f55024a == null) {
            synchronized (C20354b.class) {
                if (f55024a == null) {
                    f55024a = new C20354b();
                }
            }
        }
        return f55024a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final SparseArray<C20353a> mo54920b() {
        SparseArray<C20353a> sparseArray;
        synchronized (this.f55027d) {
            sparseArray = this.f55027d;
        }
        return sparseArray;
    }

    /* renamed from: b */
    private void m67522b(DownloadInfo downloadInfo) {
        if (m67523c(downloadInfo)) {
            mo54922c(downloadInfo.getId());
        }
    }

    /* renamed from: c */
    public final void mo54922c(int i) {
        m67526f(i);
        if (i != 0) {
            m67519a();
            m67525e(i);
        }
    }

    /* renamed from: c */
    private static boolean m67523c(DownloadInfo downloadInfo) {
        if (!downloadInfo.isDownloadOverStatus() || !m67524d(downloadInfo.getNotificationVisibility())) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static void m67525e(int i) {
        Context x = C20269b.m66765x();
        if (x != null && i != 0) {
            try {
                Intent intent = new Intent(x, DownloadNotificationService.class);
                intent.setAction("android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL");
                intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", i);
                x.startService(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: f */
    private C20353a m67526f(int i) {
        C20353a aVar;
        if (i == 0) {
            return null;
        }
        synchronized (this.f55027d) {
            aVar = (C20353a) this.f55027d.get(i);
            if (aVar != null) {
                this.f55027d.remove(i);
                new StringBuilder("removeNotificationId ").append(i);
            }
        }
        return aVar;
    }

    /* renamed from: b */
    public final C20353a mo54921b(int i) {
        C20353a aVar;
        if (i == 0) {
            return null;
        }
        synchronized (this.f55027d) {
            aVar = (C20353a) this.f55027d.get(i);
        }
        return aVar;
    }

    /* renamed from: a */
    private static void m67521a(DownloadInfo downloadInfo) {
        C20285j m = C20269b.m66754m();
        if (m != null && downloadInfo.isDownloadOverStatus()) {
            downloadInfo.setNotificationVisibility(3);
            try {
                m.mo54051a(downloadInfo);
            } catch (SQLiteException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo54918a(int i) {
        DownloadInfo downloadInfo = Downloader.getInstance(C20269b.m66765x()).getDownloadInfo(i);
        if (downloadInfo != null) {
            m67521a(downloadInfo);
            m67522b(downloadInfo);
        }
    }

    /* renamed from: a */
    public final void mo54919a(C20353a aVar) {
        if (aVar != null) {
            synchronized (this.f55027d) {
                this.f55027d.put(aVar.f55018a, aVar);
            }
        }
    }

    /* renamed from: a */
    public static void m67520a(int i, int i2, Notification notification) {
        Context x = C20269b.m66765x();
        if (x != null && i != 0 && notification != null) {
            try {
                Intent intent = new Intent(x, DownloadNotificationService.class);
                intent.setAction("android.ss.intent.action.DOWNLOAD_NOTIFICATION_NOTIFY");
                intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA", notification);
                intent.putExtra("DOWNLOAD_NOTIFICATION_EXTRA_STATUS", i2);
                intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", i);
                x.startService(intent);
            } catch (Throwable unused) {
            }
        }
    }
}
