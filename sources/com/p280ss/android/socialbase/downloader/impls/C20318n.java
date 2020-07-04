package com.p280ss.android.socialbase.downloader.impls;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import android.os.RemoteException;
import android.util.SparseArray;
import com.p280ss.android.socialbase.downloader.downloader.C20267a;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.C20271c;
import com.p280ss.android.socialbase.downloader.downloader.C20282i;
import com.p280ss.android.socialbase.downloader.downloader.C20282i.C20283a;
import com.p280ss.android.socialbase.downloader.downloader.C20287l;
import com.p280ss.android.socialbase.downloader.downloader.C20288m;
import com.p280ss.android.socialbase.downloader.downloader.C20289n;
import com.p280ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.socialbase.downloader.p904b.C20190a;
import com.p280ss.android.socialbase.downloader.utils.C20356b;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import com.p280ss.android.socialbase.downloader.utils.C20360f;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.impls.n */
public class C20318n extends C20267a implements ServiceConnection {

    /* renamed from: f */
    public static final String f54884f = "n";

    /* renamed from: g */
    public static int f54885g;

    /* renamed from: h */
    public static long f54886h;

    /* renamed from: i */
    public Handler f54887i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    public boolean f54888j;

    /* renamed from: k */
    public ServiceConnection f54889k;

    /* renamed from: l */
    private C20282i f54890l;

    /* renamed from: m */
    private C20289n f54891m;

    /* renamed from: n */
    private int f54892n = -1;

    /* renamed from: e */
    public final void mo54281e() {
        if (this.f54890l == null) {
            mo54269a(C20269b.m66765x(), this);
        }
    }

    /* renamed from: f */
    public static void m67250f() {
        if (C20269b.m66765x() != null) {
            C20287l l = C20269b.m66753l();
            if (l != null) {
                C20288m a = C20315l.m67199a(true);
                if (a != null) {
                    List<DownloadInfo> c = a.mo54430c("application/vnd.android.package-archive");
                    if (c != null && !c.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (DownloadInfo downloadInfo : c) {
                            if (downloadInfo != null && downloadInfo.isNeedIndependentProcess() && downloadInfo.getRealStatus() == -5) {
                                arrayList.add(downloadInfo);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            new StringBuilder("resumeDownloaderProcessTaskForDied: resume size =").append(arrayList.size());
                            l.mo54007a(arrayList);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo54271a(C20289n nVar) {
        this.f54891m = nVar;
    }

    /* renamed from: a */
    public final IBinder mo54266a(Intent intent) {
        return new C20317m();
    }

    public void onBindingDied(ComponentName componentName) {
        this.f54890l = null;
        if (this.f54891m != null) {
            this.f54891m.mo54458h();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f54890l = null;
        this.f54726c = false;
        if (this.f54891m != null) {
            this.f54891m.mo54458h();
        }
    }

    /* renamed from: a */
    public final void mo54267a(int i) {
        if (this.f54890l == null) {
            this.f54892n = i;
            mo54269a(C20269b.m66765x(), this);
            return;
        }
        try {
            this.f54890l.mo54391n(i);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: c */
    public final void mo54279c(DownloadTask downloadTask) {
        if (downloadTask != null) {
            C20271c.m66769a().mo54288a(downloadTask.getDownloadId(), true);
            C20295a q = C20269b.m66758q();
            if (q != null) {
                q.mo54489a(downloadTask);
            }
        }
    }

    /* renamed from: b */
    public final void mo54277b(DownloadTask downloadTask) {
        boolean z;
        if (downloadTask != null) {
            StringBuilder sb = new StringBuilder("tryDownload aidlService == null:");
            if (this.f54890l == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            if (this.f54890l == null) {
                mo54272a(downloadTask);
                mo54269a(C20269b.m66765x(), this);
                return;
            }
            if (this.f54725b.get(downloadTask.getDownloadId()) != null) {
                synchronized (this.f54725b) {
                    if (this.f54725b.get(downloadTask.getDownloadId()) != null) {
                        this.f54725b.remove(downloadTask.getDownloadId());
                    }
                }
            }
            try {
                this.f54890l.mo54364a(C20360f.m67635a(downloadTask));
            } catch (RemoteException unused) {
            }
            synchronized (this.f54725b) {
                SparseArray clone = this.f54725b.clone();
                this.f54725b.clear();
                if (C20269b.m66758q() != null) {
                    for (int i = 0; i < clone.size(); i++) {
                        if (((DownloadTask) clone.get(clone.keyAt(i))) != null) {
                            try {
                                this.f54890l.mo54364a(C20360f.m67635a(downloadTask));
                            } catch (RemoteException unused2) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo54269a(Context context, ServiceConnection serviceConnection) {
        try {
            Intent intent = new Intent(context, IndependentProcessDownloadService.class);
            if (serviceConnection != null) {
                context.bindService(intent, serviceConnection, 1);
            }
            this.f54889k = serviceConnection;
            context.startService(intent);
        } catch (Throwable unused) {
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        this.f54890l = C20283a.m66909a(iBinder);
        if (VERSION.SDK_INT < 26 && C20356b.m67535a(512) && C20359e.m67556a()) {
            try {
                iBinder.linkToDeath(new DeathRecipient() {
                    public final void binderDied() {
                        String str = C20318n.f54884f;
                        StringBuilder sb = new StringBuilder("binderDied: mServiceConnection = ");
                        sb.append(C20318n.this.f54889k);
                        C20190a.m66502b(str, sb.toString());
                        if (C20318n.f54885g < 5 && System.currentTimeMillis() - C20318n.f54886h > C40413c.f105051b) {
                            C20318n.this.f54887i.postDelayed(new Runnable() {
                                public final void run() {
                                    C20318n.this.f54888j = true;
                                    try {
                                        C20318n.this.mo54269a(C20269b.m66765x(), C20318n.this);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }, 1000);
                            C20318n.f54885g++;
                            C20318n.f54886h = System.currentTimeMillis();
                        }
                    }
                }, 0);
            } catch (RemoteException unused) {
            }
            if (this.f54888j) {
                this.f54887i.postDelayed(new Runnable() {
                    public final void run() {
                        C20269b.m66749h().execute(new Runnable() {
                            public final void run() {
                                try {
                                    C20318n.m67250f();
                                } catch (Exception unused) {
                                }
                            }
                        });
                    }
                }, 1000);
                this.f54888j = false;
            }
        }
        if (this.f54891m != null) {
            this.f54891m.mo54457a(iBinder);
        }
        StringBuilder sb = new StringBuilder("onServiceConnected aidlService!=null");
        if (this.f54890l != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(" pendingTasks.size:");
        sb.append(this.f54725b.size());
        if (this.f54890l != null) {
            C20271c.m66769a().mo54295b();
            this.f54726c = true;
            this.f54728e = false;
            if (this.f54892n != -1) {
                try {
                    this.f54890l.mo54391n(this.f54892n);
                } catch (RemoteException unused2) {
                }
            }
            synchronized (this.f54725b) {
                if (this.f54890l != null) {
                    SparseArray clone = this.f54725b.clone();
                    this.f54725b.clear();
                    for (int i = 0; i < clone.size(); i++) {
                        DownloadTask downloadTask = (DownloadTask) clone.get(clone.keyAt(i));
                        if (downloadTask != null) {
                            try {
                                this.f54890l.mo54364a(C20360f.m67635a(downloadTask));
                            } catch (RemoteException unused3) {
                            }
                        }
                    }
                }
            }
        }
    }
}
