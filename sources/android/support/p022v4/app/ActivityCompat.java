package android.support.p022v4.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p022v4.app.C0591ae.C0592a;
import android.support.p022v4.content.C0683b;
import android.view.View;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.app.ActivityCompat */
public class ActivityCompat extends C0683b {

    /* renamed from: a */
    private static C0540b f2110a;

    /* renamed from: android.support.v4.app.ActivityCompat$a */
    public interface C0539a {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: android.support.v4.app.ActivityCompat$b */
    public interface C0540b {
        /* renamed from: a */
        boolean mo2175a(Activity activity, int i, int i2, Intent intent);

        /* renamed from: a */
        boolean mo2176a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: android.support.v4.app.ActivityCompat$c */
    public interface C0541c {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* renamed from: android.support.v4.app.ActivityCompat$d */
    static class C0542d extends SharedElementCallback {

        /* renamed from: a */
        private final C0591ae f2114a;

        public final void onMapSharedElements(List<String> list, Map<String, View> map) {
        }

        public final void onRejectSharedElements(List<View> list) {
        }

        public final void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
        }

        public final void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
        }

        C0542d(C0591ae aeVar) {
            this.f2114a = aeVar;
        }

        public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return C0591ae.m2470a(context, parcelable);
        }

        public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f2114a.mo2575a(view, matrix, rectF);
        }

        public final void onSharedElementsArrived(List<String> list, List<View> list2, final OnSharedElementsReadyListener onSharedElementsReadyListener) {
            C0591ae.m2471a(list, list2, (C0592a) new C0592a() {
                /* renamed from: a */
                public final void mo2185a() {
                    onSharedElementsReadyListener.onSharedElementsReady();
                }
            });
        }
    }

    protected ActivityCompat() {
    }

    /* renamed from: a */
    public static C0540b m2236a() {
        return f2110a;
    }

    /* renamed from: a */
    public static void m2237a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: b */
    public static void m2243b(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    /* renamed from: d */
    public static void m2246d(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    /* renamed from: e */
    public static void m2247e(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: c */
    public static Uri m2245c(Activity activity) {
        if (VERSION.SDK_INT >= 22) {
            return activity.getReferrer();
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }

    /* renamed from: b */
    public static void m2244b(Activity activity, C0591ae aeVar) {
        C0542d dVar;
        if (VERSION.SDK_INT >= 21) {
            if (aeVar != null) {
                dVar = new C0542d(aeVar);
            } else {
                dVar = null;
            }
            activity.setExitSharedElementCallback(dVar);
        }
    }

    /* renamed from: a */
    public static void m2240a(Activity activity, C0591ae aeVar) {
        C0542d dVar;
        if (VERSION.SDK_INT >= 21) {
            if (aeVar != null) {
                dVar = new C0542d(aeVar);
            } else {
                dVar = null;
            }
            activity.setEnterSharedElementCallback(dVar);
        }
    }

    /* renamed from: a */
    public static boolean m2242a(Activity activity, String str) {
        if (VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    /* renamed from: a */
    public static void m2241a(final Activity activity, final String[] strArr, final int i) {
        if (f2110a != null && f2110a.mo2176a(activity, strArr, i)) {
            return;
        }
        if (VERSION.SDK_INT >= 23) {
            if (activity instanceof C0541c) {
                ((C0541c) activity).validateRequestPermissionsRequestCode(i);
            }
            activity.requestPermissions(strArr, i);
            return;
        }
        if (activity instanceof C0539a) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    int[] iArr = new int[strArr.length];
                    PackageManager packageManager = activity.getPackageManager();
                    String packageName = activity.getPackageName();
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                    }
                    ((C0539a) activity).onRequestPermissionsResult(i, strArr, iArr);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m2238a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: a */
    public static void m2239a(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }
}
