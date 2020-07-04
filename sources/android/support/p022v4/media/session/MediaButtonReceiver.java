package android.support.p022v4.media.session;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.support.p022v4.media.MediaBrowserCompat;
import android.support.p022v4.media.MediaBrowserCompat.C0749b;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaButtonReceiver */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: android.support.v4.media.session.MediaButtonReceiver$a */
    static class C0823a extends C0749b {

        /* renamed from: c */
        public MediaBrowserCompat f2958c;

        /* renamed from: d */
        private final Context f2959d;

        /* renamed from: e */
        private final Intent f2960e;

        /* renamed from: f */
        private final PendingResult f2961f;

        /* renamed from: b */
        public final void mo2992b() {
            m3490d();
        }

        /* renamed from: c */
        public final void mo2993c() {
            m3490d();
        }

        /* renamed from: d */
        private void m3490d() {
            this.f2958c.mo2981b();
            this.f2961f.finish();
        }

        /* renamed from: a */
        public final void mo2991a() {
            try {
                new MediaControllerCompat(this.f2959d, this.f2958c.mo2982c()).mo3173a((KeyEvent) this.f2960e.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException unused) {
            }
            m3490d();
        }

        C0823a(Context context, Intent intent, PendingResult pendingResult) {
            this.f2959d = context;
            this.f2960e = intent;
            this.f2961f = pendingResult;
        }
    }

    /* renamed from: a */
    public static ComponentName m3487a(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ResolveInfo resolveInfo = (ResolveInfo) queryBroadcastReceivers.get(0);
            return new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }
        queryBroadcastReceivers.size();
        return null;
    }

    /* renamed from: a */
    private static void m3489a(Context context, Intent intent) {
        if (VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    /* renamed from: a */
    private static ComponentName m3488a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
            return new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder("Expected 1 service that handles ");
            sb.append(str);
            sb.append(", found ");
            sb.append(queryIntentServices.size());
            throw new IllegalStateException(sb.toString());
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            ComponentName a = m3488a(context, "android.intent.action.MEDIA_BUTTON");
            if (a != null) {
                intent.setComponent(a);
                m3489a(context, intent);
                return;
            }
            ComponentName a2 = m3488a(context, "android.media.browse.MediaBrowserService");
            if (a2 != null) {
                PendingResult goAsync = goAsync();
                Context applicationContext = context.getApplicationContext();
                C0823a aVar = new C0823a(applicationContext, intent, goAsync);
                MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, a2, aVar, null);
                aVar.f2958c = mediaBrowserCompat;
                mediaBrowserCompat.mo2980a();
                return;
            }
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
    }
}
