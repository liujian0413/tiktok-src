package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.app.NotificationCompat.BigTextStyle;
import android.support.p022v4.app.NotificationCompat.C0575b;
import android.support.p022v4.app.NotificationCompat.C0576c;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C15085bh;
import com.google.android.gms.common.api.internal.C15139g;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.C15247f;
import com.google.android.gms.common.internal.C15248g;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15326i;
import com.google.android.gms.common.util.C15333p;
import com.google.android.gms.internal.base.C16355d;
import com.p280ss.android.socialbase.downloader.impls.C20318n;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class GoogleApiAvailability extends C15167c {
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C15167c.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final Object mLock = new Object();
    private static final GoogleApiAvailability zaao = new GoogleApiAvailability();
    private String zaap;

    /* renamed from: com.google.android.gms.common.GoogleApiAvailability$a */
    class C15008a extends C16355d {

        /* renamed from: a */
        private final Context f38853a;

        public C15008a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f38853a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                int isGooglePlayServicesAvailable = GoogleApiAvailability.this.isGooglePlayServicesAvailable(this.f38853a);
                if (GoogleApiAvailability.this.isUserResolvableError(isGooglePlayServicesAvailable)) {
                    GoogleApiAvailability.this.showErrorNotification(this.f38853a, isGooglePlayServicesAvailable);
                }
            }
        }
    }

    public static GoogleApiAvailability getInstance() {
        return zaao;
    }

    GoogleApiAvailability() {
    }

    public Dialog getErrorDialog(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        return zaa((Context) activity, i, C15248g.m44343a(activity, getErrorResolutionIntent(activity, i, "d"), i2), onCancelListener);
    }

    public final boolean zaa(Activity activity, C15139g gVar, int i, int i2, OnCancelListener onCancelListener) {
        Dialog zaa = zaa((Context) activity, i, C15248g.m44344a(gVar, getErrorResolutionIntent(activity, i, "d"), 2), onCancelListener);
        if (zaa == null) {
            return false;
        }
        zaa(activity, zaa, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public boolean showErrorDialogFragment(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zaa(activity, errorDialog, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void showErrorNotification(Context context, int i) {
        zaa(context, i, (String) null, getErrorResolutionPendingIntent(context, i, 0, C20318n.f54884f));
    }

    public final boolean zaa(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult);
        if (errorResolutionPendingIntent == null) {
            return false;
        }
        zaa(context, connectionResult.f38846b, (String) null, GoogleApiActivity.m43545a(context, errorResolutionPendingIntent, i));
        return true;
    }

    public static Dialog zaa(Activity activity, OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        Builder builder = new Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C15247f.m44340c(activity, 18));
        builder.setPositiveButton("", null);
        AlertDialog create = builder.create();
        zaa(activity, (Dialog) create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final zabq zaa(Context context, C15085bh bhVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabq zabq = new zabq(bhVar);
        context.registerReceiver(zabq, intentFilter);
        zabq.f39234a = context;
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabq;
        }
        bhVar.mo38309a();
        zabq.mo38443a();
        return null;
    }

    private final String zag() {
        String str;
        synchronized (mLock) {
            str = this.zaap;
        }
        return str;
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    public int isGooglePlayServicesAvailable(Context context, int i) {
        return super.isGooglePlayServicesAvailable(context, i);
    }

    public final boolean isUserResolvableError(int i) {
        return super.isUserResolvableError(i);
    }

    public Intent getErrorResolutionIntent(Context context, int i, String str) {
        return super.getErrorResolutionIntent(context, i, str);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2) {
        return super.getErrorResolutionPendingIntent(context, i, i2);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        if (connectionResult.mo38153a()) {
            return connectionResult.f38847c;
        }
        return getErrorResolutionPendingIntent(context, connectionResult.f38846b, 0);
    }

    public final String getErrorString(int i) {
        return super.getErrorString(i);
    }

    static Dialog zaa(Context context, int i, C15248g gVar, OnCancelListener onCancelListener) {
        Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new Builder(context, 5);
        }
        if (builder == null) {
            builder = new Builder(context);
        }
        builder.setMessage(C15247f.m44340c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String e = C15247f.m44342e(context, i);
        if (e != null) {
            builder.setPositiveButton(e, gVar);
        }
        String a = C15247f.m44335a(context, i);
        if (a != null) {
            builder.setTitle(a);
        }
        return builder.create();
    }

    static void zaa(Activity activity, Dialog dialog, String str, OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            SupportErrorDialogFragment.m43538a(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
            return;
        }
        C15165b.m44140a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    private final void zaa(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            zaa(context);
        } else if (pendingIntent != null) {
            String b = C15247f.m44339b(context, i);
            String d = C15247f.m44341d(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            C0575b a = new C0575b(context).mo2543c(true).mo2539b(true).mo2530a((CharSequence) b).mo2528a((C0576c) new BigTextStyle().mo2508c(d));
            if (C15326i.m44579a(context)) {
                C15267r.m44390a(C15333p.m44599f());
                a.mo2519a(context.getApplicationInfo().icon).mo2541c(2);
                if (C15326i.m44580b(context)) {
                    a.mo2522a((int) R.drawable.xu, (CharSequence) resources.getString(R.string.acj), pendingIntent);
                } else {
                    a.mo2524a(pendingIntent);
                }
            } else {
                a.mo2519a(17301642).mo2545d((CharSequence) resources.getString(R.string.aa4)).mo2523a(System.currentTimeMillis()).mo2524a(pendingIntent).mo2537b((CharSequence) d);
            }
            if (C15333p.m44603j()) {
                C15267r.m44390a(C15333p.m44603j());
                String zag = zag();
                if (zag == null) {
                    zag = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(zag);
                    String a2 = C15247f.m44334a(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(zag, a2, 4));
                    } else if (!a2.equals(notificationChannel.getName())) {
                        notificationChannel.setName(a2);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                a.mo2538b(zag);
            }
            Notification b2 = a.mo2534b();
            switch (i) {
                case 1:
                case 2:
                case 3:
                    i2 = 10436;
                    C15181e.f39277c.set(false);
                    break;
                default:
                    i2 = 39789;
                    break;
            }
            notificationManager.notify(i2, b2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void zaa(Context context) {
        new C15008a(context).sendEmptyMessageDelayed(1, 120000);
    }
}
