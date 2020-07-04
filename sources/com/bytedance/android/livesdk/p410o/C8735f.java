package com.bytedance.android.livesdk.p410o;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.view.KeyEvent;
import com.bytedance.android.live.uikit.dialog.C3533b.C3534a;
import com.bytedance.android.livesdk.p410o.p412b.C8719b;
import com.bytedance.android.livesdk.p410o.p412b.C8720c;
import com.bytedance.android.livesdk.p410o.p412b.C8721d;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.o.f */
public final class C8735f {

    /* renamed from: a */
    private C8714b f23742a;

    /* renamed from: com.bytedance.android.livesdk.o.f$a */
    public static abstract class C8737a implements C8719b {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract String mo21738a(Activity activity, String... strArr);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract String mo21741b(Activity activity, String... strArr);

        /* renamed from: b */
        private static String m26110b(Activity activity) {
            return activity.getString(R.string.ecm);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo21737a(Activity activity) {
            return activity.getString(R.string.f96);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo21739a(C8720c cVar, DialogInterface dialogInterface) {
            cVar.mo21719b();
        }

        /* renamed from: a */
        static final /* synthetic */ boolean m26109a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            if (keyEvent.getAction() == 1) {
                dialogInterface.cancel();
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo21740a(C8720c cVar, DialogInterface dialogInterface, int i) {
            cVar.mo21718a();
        }

        /* renamed from: a */
        public final void mo21728a(Activity activity, C8720c cVar, String[] strArr, String[] strArr2) {
            new C3534a(activity).mo10654a((CharSequence) mo21741b(activity, strArr)).mo10660b((CharSequence) mo21738a(activity, strArr)).mo10655a((CharSequence) mo21737a(activity), (OnClickListener) new C8741g(this, cVar)).mo10661b((CharSequence) m26110b(activity), C8742h.f23750a).mo10652a(C8743i.f23751a).mo10656a(false).mo10650a((OnCancelListener) new C8744j(this, cVar)).mo10662b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.o.f$b */
    public static class C8738b {

        /* renamed from: a */
        Activity f23743a;

        /* renamed from: b */
        C8719b f23744b = new C8739c();

        /* renamed from: c */
        C8719b f23745c = new C8740d();

        /* renamed from: d */
        Runnable f23746d = C8745k.f23754a;

        /* renamed from: e */
        Runnable f23747e = C8746l.f23755a;

        /* renamed from: a */
        public final C8738b mo21742a(Runnable runnable) {
            this.f23746d = runnable;
            return this;
        }

        /* renamed from: b */
        public final C8738b mo21744b(Runnable runnable) {
            this.f23747e = runnable;
            return this;
        }

        public C8738b(Activity activity) {
            this.f23743a = activity;
        }

        /* renamed from: a */
        public final void mo21743a(C8721d dVar, String... strArr) {
            if (this.f23743a != null && !this.f23743a.isFinishing()) {
                try {
                    new C8735f(this.f23743a).mo21736a(dVar, this.f23746d, this.f23744b, this.f23745c, this.f23747e, strArr);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.o.f$c */
    public static class C8739c implements C8719b {
        /* renamed from: a */
        public final void mo21728a(Activity activity, C8720c cVar, String[] strArr, String[] strArr2) {
            cVar.mo21718a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.o.f$d */
    public static class C8740d extends C8737a {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final String mo21737a(Activity activity) {
            return activity.getString(R.string.fcf);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final String mo21741b(Activity activity, String... strArr) {
            return activity.getString(R.string.f_5);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final String mo21738a(Activity activity, String... strArr) {
            return activity.getString(R.string.f_4, new Object[]{C8732d.m26094a((Context) activity, strArr)});
        }
    }

    /* renamed from: a */
    public static C8738b m26105a(Activity activity) {
        return new C8738b(activity);
    }

    private C8735f(Activity activity) {
        this.f23742a = m26106b(activity);
    }

    /* renamed from: b */
    private static C8714b m26106b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        C8714b bVar = (C8714b) fragmentManager.findFragmentByTag("PermissionsRequest");
        if (bVar != null) {
            return bVar;
        }
        C8714b bVar2 = new C8714b();
        fragmentManager.beginTransaction().add(bVar2, "PermissionsRequest").commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
        return bVar2;
    }

    /* renamed from: a */
    public final void mo21736a(C8721d dVar, Runnable runnable, C8719b bVar, C8719b bVar2, Runnable runnable2, String... strArr) {
        this.f23742a.mo21714a(dVar, runnable, bVar, bVar2, runnable2, strArr);
    }
}
