package com.bytedance.android.livesdk.p410o;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p022v4.util.C0905l;
import android.text.TextUtils;
import com.bytedance.android.livesdk.p410o.p412b.C8719b;
import com.bytedance.android.livesdk.p410o.p412b.C8720c;
import com.bytedance.android.livesdk.p410o.p412b.C8721d;
import com.bytedance.android.livesdk.p410o.p413c.C8727e;

/* renamed from: com.bytedance.android.livesdk.o.b */
public final class C8714b extends Fragment {

    /* renamed from: a */
    C0905l<C8717a> f23722a = new C0905l<>();

    /* renamed from: b */
    C0905l<C8717a> f23723b = new C0905l<>();

    /* renamed from: com.bytedance.android.livesdk.o.b$a */
    static class C8717a {

        /* renamed from: a */
        public String[] f23728a;

        /* renamed from: b */
        public String[] f23729b = new String[0];

        /* renamed from: c */
        Runnable f23730c;

        /* renamed from: d */
        Runnable f23731d;

        /* renamed from: e */
        private C8721d f23732e;

        /* renamed from: f */
        private C8719b f23733f;

        /* renamed from: g */
        private C8719b f23734g;

        /* renamed from: a */
        public final int mo21720a() {
            return C8706a.m26021a(this.f23728a) & 65535;
        }

        /* renamed from: b */
        public final int mo21723b() {
            return (C8706a.m26021a(this.f23728a) & -65536) >>> 16;
        }

        /* renamed from: c */
        public final void mo21725c() {
            this.f23730c.run();
            C8733e.m26099a().mo21735c(this.f23728a, this.f23729b);
        }

        /* renamed from: d */
        public final void mo21726d() {
            this.f23732e.mo9568b(this.f23728a);
            C8733e.m26099a().mo21733a(this.f23728a, this.f23729b);
        }

        /* renamed from: a */
        public final void mo21722a(boolean z) {
            this.f23732e.mo9567a(this.f23728a);
            C8733e.m26099a().mo21732a(this.f23728a);
            if (z) {
                this.f23731d.run();
                C8733e.m26099a().mo21734b(this.f23728a, this.f23729b);
            }
        }

        /* renamed from: a */
        public final void mo21721a(Activity activity, C8720c cVar) {
            this.f23733f.mo21728a(activity, cVar, this.f23728a, this.f23729b);
        }

        /* renamed from: b */
        public final void mo21724b(Activity activity, C8720c cVar) {
            this.f23734g.mo21728a(activity, cVar, this.f23728a, this.f23729b);
        }

        C8717a(String[] strArr, Runnable runnable, C8721d dVar, C8719b bVar, Runnable runnable2, C8719b bVar2) {
            this.f23728a = strArr;
            this.f23730c = runnable;
            this.f23731d = runnable2;
            this.f23732e = dVar;
            this.f23733f = bVar;
            this.f23734g = bVar2;
        }
    }

    /* renamed from: c */
    private static Intent m26044c(Context context) {
        return new Intent("android.settings.APPLICATION_SETTINGS");
    }

    /* renamed from: b */
    public final void mo21715b(C8717a aVar) {
        m26039a(aVar, aVar.mo21723b());
    }

    /* renamed from: a */
    private static Intent m26038a(Context context) {
        return C8727e.m26082c().mo21729a(context);
    }

    /* renamed from: c */
    private void m26045c(final C8717a aVar) {
        aVar.mo21721a(getActivity(), new C8720c() {
            /* renamed from: a */
            public final void mo21718a() {
                C8714b.this.mo21713a(aVar);
            }

            /* renamed from: b */
            public final void mo21719b() {
                aVar.mo21726d();
            }
        });
    }

    /* renamed from: d */
    private void m26047d(final C8717a aVar) {
        aVar.mo21724b(getActivity(), new C8720c() {
            /* renamed from: a */
            public final void mo21718a() {
                C8714b.this.mo21715b(aVar);
            }

            /* renamed from: b */
            public final void mo21719b() {
                aVar.mo21726d();
            }
        });
    }

    /* renamed from: b */
    private static Intent m26042b(Context context) {
        StringBuilder sb = new StringBuilder("package:");
        sb.append(context.getPackageName());
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(sb.toString()));
    }

    /* renamed from: a */
    public final void mo21713a(C8717a aVar) {
        int a = aVar.mo21720a();
        this.f23722a.mo3437b(a, aVar);
        requestPermissions(aVar.f23729b, a);
    }

    /* renamed from: c */
    private void m26046c(C8717a aVar, int i) {
        try {
            startActivityForResult(m26044c((Context) getActivity()), i);
            this.f23723b.mo3437b(i, aVar);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m26039a(C8717a aVar, int i) {
        try {
            if (m26041a((Context) getActivity(), m26038a((Context) getActivity()))) {
                startActivityForResult(m26038a((Context) getActivity()), i);
                this.f23723b.mo3437b(i, aVar);
                return;
            }
            m26043b(aVar, i);
        } catch (Exception unused) {
            m26043b(aVar, i);
        }
    }

    /* renamed from: b */
    private void m26043b(C8717a aVar, int i) {
        try {
            if (m26041a((Context) getActivity(), m26042b((Context) getActivity()))) {
                startActivityForResult(m26042b((Context) getActivity()), i);
                this.f23723b.mo3437b(i, aVar);
                return;
            }
            m26046c(aVar, i);
        } catch (Exception unused) {
            m26046c(aVar, i);
        }
    }

    /* renamed from: a */
    private static boolean m26041a(Context context, Intent intent) {
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo == null || resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
            return false;
        }
        String str = resolveActivity.activityInfo.permission;
        if (TextUtils.isEmpty(str) || context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C8717a aVar = (C8717a) this.f23722a.mo3433a(i);
        this.f23722a.mo3436b(i);
        if (aVar != null) {
            m26040a(strArr, iArr, aVar);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C8717a aVar = (C8717a) this.f23723b.mo3433a(i);
        this.f23723b.mo3436b(i);
        if (aVar != null && C8732d.m26098b((Context) getActivity(), aVar.f23728a)) {
            aVar.mo21722a(true);
        }
    }

    /* renamed from: a */
    private void m26040a(String[] strArr, int[] iArr, C8717a aVar) {
        if (C8732d.m26095a(getActivity(), strArr, iArr)) {
            aVar.mo21722a(true);
        } else if (C8732d.m26097b(getActivity(), strArr)) {
            aVar.mo21726d();
        } else if (m26041a((Context) getActivity(), m26038a((Context) getActivity())) || m26041a((Context) getActivity(), m26042b((Context) getActivity())) || m26041a((Context) getActivity(), m26044c((Context) getActivity()))) {
            aVar.f23729b = C8732d.m26096a(getActivity(), aVar.f23728a);
            m26047d(aVar);
        } else {
            aVar.mo21726d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21714a(C8721d dVar, Runnable runnable, C8719b bVar, C8719b bVar2, Runnable runnable2, String... strArr) {
        C8717a aVar = new C8717a(strArr, runnable, dVar, bVar, runnable2, bVar2);
        String[] a = C8732d.m26096a(getActivity(), aVar.f23728a);
        if (a.length == 0) {
            aVar.mo21722a(false);
            return;
        }
        aVar.f23729b = a;
        aVar.mo21725c();
        if (VERSION.SDK_INT < 23 || C8727e.m26082c().mo21730a()) {
            m26047d(aVar);
        } else {
            m26045c(aVar);
        }
    }
}
