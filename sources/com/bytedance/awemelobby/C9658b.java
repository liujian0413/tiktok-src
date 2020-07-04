package com.bytedance.awemelobby;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import com.google.android.gms.common.GoogleApiAvailability;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.utils.C42951au;

/* renamed from: com.bytedance.awemelobby.b */
public final class C9658b {

    /* renamed from: a */
    public static final C9658b f26374a = new C9658b();

    /* renamed from: com.bytedance.awemelobby.b$a */
    static final class C9659a implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ Activity f26375a;

        C9659a(Activity activity) {
            this.f26375a = activity;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            Activity activity = this.f26375a;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.bytedance.awemelobby.b$b */
    static final class C9660b implements OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ Activity f26376a;

        C9660b(Activity activity) {
            this.f26376a = activity;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            Activity activity = this.f26376a;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    private C9658b() {
    }

    /* renamed from: a */
    public static final boolean m28557a(Activity activity) {
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(activity);
        if (isGooglePlayServicesAvailable == 0) {
            return true;
        }
        Dialog errorDialog = instance.getErrorDialog(activity, isGooglePlayServicesAvailable, 9000, new C9660b(activity));
        errorDialog.setOnDismissListener(new C9659a(activity));
        C42951au.m136342a(errorDialog);
        C6921a.m21559a((Throwable) new IllegalStateException(instance.getErrorString(isGooglePlayServicesAvailable)));
        return false;
    }
}
