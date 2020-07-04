package com.p280ss.android.message;

import android.app.Service;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.reflect.C6322b;
import com.p280ss.android.pushmanager.app.C20042b;
import com.p280ss.android.pushmanager.setting.C20090b;

/* renamed from: com.ss.android.message.PushJobService */
public class PushJobService extends Service {

    /* renamed from: a */
    private IBinder f53759a;

    /* renamed from: com.ss.android.message.PushJobService$a */
    static class C19808a extends JobService implements C6310a {

        /* renamed from: a */
        public IBinder f53760a = onBind(null);

        /* renamed from: b */
        private C6309f f53761b;

        public final boolean onStopJob(JobParameters jobParameters) {
            return false;
        }

        public final void handleMsg(Message message) {
            try {
                if (message.what == 1) {
                    jobFinished((JobParameters) message.obj, false);
                }
            } catch (Throwable unused) {
            }
        }

        public C19808a(Service service) {
            C6322b.m19610a((Object) this).mo15158a("attachBaseContext", (Class<?>[]) new Class[]{Context.class}, service);
            C20042b.m66003a(this);
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            try {
                Intent intent = new Intent(this, NotifyService.class);
                intent.setAction("com.ss.android.message.action.PUSH_SERVICE");
                intent.setPackage(getPackageName());
                startService(intent);
                Intent intent2 = new Intent();
                intent2.setPackage(getPackageName());
                intent2.setClassName(getPackageName(), "com.taobao.accs.ChannelService");
                startService(intent2);
            } catch (Throwable unused) {
            }
            if (this.f53761b == null) {
                this.f53761b = new C6309f(this);
            }
            this.f53761b.sendMessage(Message.obtain(this.f53761b, 1, jobParameters));
            return true;
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        if (VERSION.SDK_INT >= 21) {
            try {
                this.f53759a = new C19808a(this).f53760a;
            } catch (Throwable unused) {
            }
        }
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    /* renamed from: b */
    static void m65407b(Context context) {
        try {
            ((JobScheduler) context.getSystemService("jobscheduler")).cancel(1);
        } catch (Throwable unused) {
        }
    }

    public IBinder onBind(Intent intent) {
        if (this.f53759a != null) {
            return this.f53759a;
        }
        return new Binder();
    }

    /* renamed from: a */
    static void m65406a(Context context) {
        try {
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            jobScheduler.cancel(1);
            Builder builder = new Builder(1, new ComponentName(context.getPackageName(), PushJobService.class.getName()));
            builder.setPeriodic((long) (C20090b.m66187a().mo53749E() * 1000));
            builder.setPersisted(true);
            builder.setRequiredNetworkType(0);
            jobScheduler.schedule(builder.build());
        } catch (Throwable unused) {
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
