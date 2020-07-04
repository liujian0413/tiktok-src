package android.support.p022v4.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: android.support.v4.app.JobIntentService */
public abstract class JobIntentService extends Service {
    static final HashMap<ComponentName, C0568h> sClassWorkEnqueuer = new HashMap<>();
    static final Object sLock = new Object();
    final ArrayList<C0563d> mCompatQueue;
    C0568h mCompatWorkEnqueuer;
    C0560a mCurProcessor;
    boolean mDestroyed;
    public boolean mInterruptIfStopped;
    C0561b mJobImpl;
    public boolean mStopped;

    /* renamed from: android.support.v4.app.JobIntentService$a */
    final class C0560a extends AsyncTask<Void, Void, Void> {
        C0560a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onCancelled(Void voidR) {
            JobIntentService.this.processorFinished();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            JobIntentService.this.processorFinished();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                C0564e dequeueWork = JobIntentService.this.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                JobIntentService.this.onHandleWork(dequeueWork.mo2473a());
                dequeueWork.mo2474b();
            }
        }
    }

    /* renamed from: android.support.v4.app.JobIntentService$b */
    interface C0561b {
        /* renamed from: a */
        IBinder mo2467a();

        /* renamed from: b */
        C0564e mo2468b();
    }

    /* renamed from: android.support.v4.app.JobIntentService$c */
    static final class C0562c extends C0568h {

        /* renamed from: a */
        boolean f2196a;

        /* renamed from: b */
        boolean f2197b;

        /* renamed from: f */
        private final Context f2198f;

        /* renamed from: g */
        private final WakeLock f2199g;

        /* renamed from: h */
        private final WakeLock f2200h;

        /* renamed from: a */
        public final void mo2469a() {
            synchronized (this) {
                this.f2196a = false;
            }
        }

        /* renamed from: b */
        public final void mo2471b() {
            synchronized (this) {
                if (!this.f2197b) {
                    this.f2197b = true;
                    this.f2200h.acquire(600000);
                    this.f2199g.release();
                }
            }
        }

        /* renamed from: c */
        public final void mo2472c() {
            synchronized (this) {
                if (this.f2197b) {
                    if (this.f2196a) {
                        this.f2199g.acquire(60000);
                    }
                    this.f2197b = false;
                    this.f2200h.release();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2470a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f2211c);
            if (this.f2198f.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f2196a) {
                        this.f2196a = true;
                        if (!this.f2197b) {
                            this.f2199g.acquire(60000);
                        }
                    }
                }
            }
        }

        C0562c(Context context, ComponentName componentName) {
            super(context, componentName);
            this.f2198f = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder sb = new StringBuilder();
            sb.append(componentName.getClassName());
            sb.append(":launch");
            this.f2199g = powerManager.newWakeLock(1, sb.toString());
            this.f2199g.setReferenceCounted(false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(componentName.getClassName());
            sb2.append(":run");
            this.f2200h = powerManager.newWakeLock(1, sb2.toString());
            this.f2200h.setReferenceCounted(false);
        }
    }

    /* renamed from: android.support.v4.app.JobIntentService$d */
    final class C0563d implements C0564e {

        /* renamed from: a */
        final Intent f2201a;

        /* renamed from: b */
        final int f2202b;

        /* renamed from: a */
        public final Intent mo2473a() {
            return this.f2201a;
        }

        /* renamed from: b */
        public final void mo2474b() {
            JobIntentService.this.stopSelf(this.f2202b);
        }

        C0563d(Intent intent, int i) {
            this.f2201a = intent;
            this.f2202b = i;
        }
    }

    /* renamed from: android.support.v4.app.JobIntentService$e */
    interface C0564e {
        /* renamed from: a */
        Intent mo2473a();

        /* renamed from: b */
        void mo2474b();
    }

    /* renamed from: android.support.v4.app.JobIntentService$f */
    static final class C0565f extends JobServiceEngine implements C0561b {

        /* renamed from: a */
        final JobIntentService f2204a;

        /* renamed from: b */
        final Object f2205b = new Object();

        /* renamed from: c */
        JobParameters f2206c;

        /* renamed from: android.support.v4.app.JobIntentService$f$a */
        final class C0566a implements C0564e {

            /* renamed from: a */
            final JobWorkItem f2207a;

            /* renamed from: a */
            public final Intent mo2473a() {
                return this.f2207a.getIntent();
            }

            /* renamed from: b */
            public final void mo2474b() {
                synchronized (C0565f.this.f2205b) {
                    if (C0565f.this.f2206c != null) {
                        C0565f.this.f2206c.completeWork(this.f2207a);
                    }
                }
            }

            C0566a(JobWorkItem jobWorkItem) {
                this.f2207a = jobWorkItem;
            }
        }

        /* renamed from: a */
        public final IBinder mo2467a() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f2204a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
            return new android.support.p022v4.app.JobIntentService.C0565f.C0566a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r1 == null) goto L_0x0026;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.support.p022v4.app.JobIntentService.C0564e mo2468b() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f2205b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f2206c     // Catch:{ all -> 0x0027 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                return r2
            L_0x000a:
                android.app.job.JobParameters r1 = r3.f2206c     // Catch:{ all -> 0x0027 }
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0027 }
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                if (r1 == 0) goto L_0x0026
                android.content.Intent r0 = r1.getIntent()
                android.support.v4.app.JobIntentService r2 = r3.f2204a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                android.support.v4.app.JobIntentService$f$a r0 = new android.support.v4.app.JobIntentService$f$a
                r0.<init>(r1)
                return r0
            L_0x0026:
                return r2
            L_0x0027:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.app.JobIntentService.C0565f.mo2468b():android.support.v4.app.JobIntentService$e");
        }

        C0565f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f2204a = jobIntentService;
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            this.f2206c = jobParameters;
            this.f2204a.ensureProcessorRunningLocked(false);
            return true;
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            boolean doStopCurrentWork = this.f2204a.doStopCurrentWork();
            synchronized (this.f2205b) {
                this.f2206c = null;
            }
            return doStopCurrentWork;
        }
    }

    /* renamed from: android.support.v4.app.JobIntentService$g */
    static final class C0567g extends C0568h {

        /* renamed from: a */
        private final JobInfo f2209a;

        /* renamed from: b */
        private final JobScheduler f2210b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2470a(Intent intent) {
            this.f2210b.enqueue(this.f2209a, new JobWorkItem(intent));
        }

        C0567g(Context context, ComponentName componentName, int i) {
            super(context, componentName);
            mo2477a(i);
            this.f2209a = new Builder(i, this.f2211c).setOverrideDeadline(0).build();
            this.f2210b = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }
    }

    /* renamed from: android.support.v4.app.JobIntentService$h */
    static abstract class C0568h {

        /* renamed from: c */
        final ComponentName f2211c;

        /* renamed from: d */
        boolean f2212d;

        /* renamed from: e */
        int f2213e;

        /* renamed from: a */
        public void mo2469a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo2470a(Intent intent);

        /* renamed from: b */
        public void mo2471b() {
        }

        /* renamed from: c */
        public void mo2472c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2477a(int i) {
            if (!this.f2212d) {
                this.f2212d = true;
                this.f2213e = i;
            } else if (this.f2213e != i) {
                StringBuilder sb = new StringBuilder("Given job ID ");
                sb.append(i);
                sb.append(" is different than previous ");
                sb.append(this.f2213e);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        C0568h(Context context, ComponentName componentName) {
            this.f2211c = componentName;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void onHandleWork(Intent intent);

    public boolean onStopCurrentWork() {
        return true;
    }

    public JobIntentService() {
        if (VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        } else {
            this.mCompatQueue = new ArrayList<>();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean doStopCurrentWork() {
        if (this.mCurProcessor != null) {
            this.mCurProcessor.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.mCompatQueue != null) {
            synchronized (this.mCompatQueue) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.mo2472c();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public C0564e dequeueWork() {
        if (this.mJobImpl != null) {
            return this.mJobImpl.mo2468b();
        }
        synchronized (this.mCompatQueue) {
            if (this.mCompatQueue.size() <= 0) {
                return null;
            }
            C0564e eVar = (C0564e) this.mCompatQueue.remove(0);
            return eVar;
        }
    }

    public void onCreate() {
        super.onCreate();
        if (VERSION.SDK_INT >= 26) {
            this.mJobImpl = new C0565f(this);
            this.mCompatWorkEnqueuer = null;
            return;
        }
        this.mJobImpl = null;
        this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
    }

    /* access modifiers changed from: 0000 */
    public void processorFinished() {
        if (this.mCompatQueue != null) {
            synchronized (this.mCompatQueue) {
                this.mCurProcessor = null;
                if (this.mCompatQueue != null && this.mCompatQueue.size() > 0) {
                    ensureProcessorRunningLocked(false);
                } else if (!this.mDestroyed) {
                    this.mCompatWorkEnqueuer.mo2472c();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        if (this.mJobImpl != null) {
            return this.mJobImpl.mo2467a();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new C0560a();
            if (this.mCompatWorkEnqueuer != null && z) {
                this.mCompatWorkEnqueuer.mo2471b();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.mo2469a();
        synchronized (this.mCompatQueue) {
            ArrayList<C0563d> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0563d(intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public static void enqueueWork(Context context, Class cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent != null) {
            synchronized (sLock) {
                C0568h workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
                workEnqueuer.mo2477a(i);
                workEnqueuer.mo2470a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    static C0568h getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        C0568h hVar;
        C0568h hVar2 = (C0568h) sClassWorkEnqueuer.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (VERSION.SDK_INT < 26) {
            hVar = new C0562c(context, componentName);
        } else if (z) {
            hVar = new C0567g(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        C0568h hVar3 = hVar;
        sClassWorkEnqueuer.put(componentName, hVar3);
        return hVar3;
    }
}
