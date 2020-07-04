package com.p280ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.SparseArray;
import com.p280ss.android.socialbase.downloader.impls.C20295a;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.socialbase.downloader.p904b.C20190a;
import com.p280ss.android.socialbase.downloader.utils.C20356b;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.socialbase.downloader.downloader.a */
public abstract class C20267a implements C20290o {

    /* renamed from: a */
    public static final String f54724a = "a";

    /* renamed from: b */
    protected final SparseArray<DownloadTask> f54725b = new SparseArray<>();

    /* renamed from: c */
    protected volatile boolean f54726c = false;

    /* renamed from: d */
    protected volatile boolean f54727d;

    /* renamed from: e */
    protected volatile boolean f54728e = false;

    /* renamed from: f */
    private WeakReference<Service> f54729f;

    /* renamed from: g */
    private Handler f54730g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private Runnable f54731h = new Runnable() {
        public final void run() {
            if (!C20267a.this.f54726c) {
                C20267a.this.mo54269a(C20269b.m66765x(), (ServiceConnection) null);
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54269a(Context context, ServiceConnection serviceConnection) {
    }

    /* renamed from: a */
    public void mo54270a(Intent intent, int i, int i2) {
    }

    /* renamed from: a */
    public void mo54271a(C20289n nVar) {
    }

    /* renamed from: b */
    public void mo54276b() {
    }

    /* renamed from: c */
    public final void mo54278c() {
        this.f54726c = false;
    }

    /* renamed from: c */
    public void mo54279c(DownloadTask downloadTask) {
    }

    /* renamed from: e */
    public void mo54281e() {
        if (!this.f54726c) {
            mo54269a(C20269b.m66765x(), (ServiceConnection) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo54280d() {
        SparseArray clone;
        new StringBuilder("resumePendingTask pendingTasks.size:").append(this.f54725b.size());
        synchronized (this.f54725b) {
            clone = this.f54725b.clone();
            this.f54725b.clear();
        }
        C20295a q = C20269b.m66758q();
        if (q != null) {
            for (int i = 0; i < clone.size(); i++) {
                DownloadTask downloadTask = (DownloadTask) clone.get(clone.keyAt(i));
                if (downloadTask != null) {
                    q.mo54489a(downloadTask);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo54275a() {
        String str = f54724a;
        StringBuilder sb = new StringBuilder("isServiceForeground = ");
        sb.append(this.f54727d);
        C20190a.m66500a(str, sb.toString());
        return this.f54727d;
    }

    /* renamed from: a */
    public void mo54267a(int i) {
        C20190a.m66499a(i);
    }

    /* renamed from: a */
    public IBinder mo54266a(Intent intent) {
        return new Binder();
    }

    /* renamed from: b */
    public void mo54277b(DownloadTask downloadTask) {
        if (downloadTask != null) {
            if (this.f54726c) {
                if (this.f54725b.get(downloadTask.getDownloadId()) != null) {
                    synchronized (this.f54725b) {
                        if (this.f54725b.get(downloadTask.getDownloadId()) != null) {
                            this.f54725b.remove(downloadTask.getDownloadId());
                        }
                    }
                }
                C20295a q = C20269b.m66758q();
                if (q != null) {
                    q.mo54489a(downloadTask);
                }
                mo54280d();
            } else if (C20356b.m67535a(262144)) {
                synchronized (this.f54725b) {
                    mo54272a(downloadTask);
                    if (!this.f54728e) {
                        mo54269a(C20269b.m66765x(), (ServiceConnection) null);
                        this.f54728e = true;
                    } else {
                        this.f54730g.removeCallbacks(this.f54731h);
                        this.f54730g.postDelayed(this.f54731h, 10);
                    }
                }
            } else {
                mo54272a(downloadTask);
                mo54269a(C20269b.m66765x(), (ServiceConnection) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo54272a(DownloadTask downloadTask) {
        if (downloadTask != null) {
            StringBuilder sb = new StringBuilder("pendDownloadTask pendingTasks.size:");
            sb.append(this.f54725b.size());
            sb.append(" downloadTask.getDownloadId():");
            sb.append(downloadTask.getDownloadId());
            if (this.f54725b.get(downloadTask.getDownloadId()) == null) {
                synchronized (this.f54725b) {
                    if (this.f54725b.get(downloadTask.getDownloadId()) == null) {
                        this.f54725b.put(downloadTask.getDownloadId(), downloadTask);
                    }
                }
            }
            new StringBuilder("after pendDownloadTask pendingTasks.size:").append(this.f54725b.size());
        }
    }

    /* renamed from: a */
    public final void mo54273a(WeakReference weakReference) {
        this.f54729f = weakReference;
    }

    /* renamed from: a */
    public final void mo54274a(boolean z) {
        if (!(this.f54729f == null || this.f54729f.get() == null)) {
            String str = f54724a;
            StringBuilder sb = new StringBuilder("stopForeground  service = ");
            sb.append(this.f54729f.get());
            sb.append(",  isServiceAlive = ");
            sb.append(this.f54726c);
            C20190a.m66500a(str, sb.toString());
            try {
                this.f54727d = false;
                ((Service) this.f54729f.get()).stopForeground(z);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo54268a(int i, Notification notification) {
        if (!(this.f54729f == null || this.f54729f.get() == null)) {
            String str = f54724a;
            StringBuilder sb = new StringBuilder("startForeground  id = ");
            sb.append(i);
            sb.append(", service = ");
            sb.append(this.f54729f.get());
            sb.append(",  isServiceAlive = ");
            sb.append(this.f54726c);
            C20190a.m66500a(str, sb.toString());
            try {
                ((Service) this.f54729f.get()).startForeground(i, notification);
                this.f54727d = true;
            } catch (Exception unused) {
            }
        }
    }
}
