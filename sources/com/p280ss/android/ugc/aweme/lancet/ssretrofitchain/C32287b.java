package com.p280ss.android.ugc.aweme.lancet.ssretrofitchain;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.facebook.react.bridge.UiThreadUtil;
import com.p280ss.android.ugc.aweme.IAccountService.C21080d;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.secapi.C37420a;
import com.p280ss.android.ugc.aweme.secapi.ISecApi;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.b */
public final class C32287b extends C32296d {

    /* renamed from: a */
    public final AtomicBoolean f84353a = new AtomicBoolean(false);

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.b$a */
    static final class C32288a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C32287b f84354a;

        /* renamed from: b */
        final /* synthetic */ int f84355b;

        /* renamed from: c */
        final /* synthetic */ String f84356c;

        C32288a(C32287b bVar, int i, String str) {
            this.f84354a = bVar;
            this.f84355b = i;
            this.f84356c = str;
        }

        public final void run() {
            Activity g = C6405d.m19984g();
            if (g != null) {
                this.f84354a.mo83495a(g, this.f84355b, this.f84356c);
            } else {
                new Handler().postDelayed(new Runnable(this) {

                    /* renamed from: a */
                    final /* synthetic */ C32288a f84357a;

                    {
                        this.f84357a = r1;
                    }

                    public final void run() {
                        Activity g = C6405d.m19984g();
                        if (g != null) {
                            this.f84357a.f84354a.mo83495a(g, this.f84357a.f84355b, this.f84357a.f84356c);
                        } else {
                            this.f84357a.f84354a.f84353a.set(false);
                        }
                    }
                }, 1000);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.b$b */
    public static final class C32290b extends C37420a {

        /* renamed from: a */
        final /* synthetic */ C32287b f84358a;

        /* renamed from: b */
        final /* synthetic */ String f84359b;

        /* renamed from: a */
        public final void mo80301a(int i) {
            this.f84358a.f84353a.set(false);
        }

        C32290b(C32287b bVar, String str) {
            this.f84358a = bVar;
            this.f84359b = str;
        }

        /* renamed from: a */
        public final void mo80302a(boolean z, String str) {
            C7573i.m23587b(str, "msg");
            if (z) {
                C42961az.m136380a(new C23281a(this.f84359b));
            }
            this.f84358a.f84353a.set(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.b$c */
    static final class C32291c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32287b f84360a;

        C32291c(C32287b bVar) {
            this.f84360a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C6861a.m21333b().logout("expired_logout", "sdk_expired_logout");
            this.f84360a.f84353a.set(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.b$d */
    static final class C32292d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32287b f84361a;

        C32292d(C32287b bVar) {
            this.f84361a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f84361a.f84353a.set(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.b$e */
    static final class C32293e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32287b f84362a;

        /* renamed from: b */
        final /* synthetic */ Activity f84363b;

        /* renamed from: c */
        final /* synthetic */ String f84364c;

        C32293e(C32287b bVar, Activity activity, String str) {
            this.f84362a = bVar;
            this.f84363b = activity;
            this.f84364c = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C6861a.m21333b().showLoginAndRegisterView(new C21080d().mo56860a(this.f84363b).mo56863a((C21083g) new C21083g(this) {

                /* renamed from: a */
                final /* synthetic */ C32293e f84365a;

                {
                    this.f84365a = r1;
                }

                /* renamed from: a */
                public final void mo56868a(int i, int i2, Object obj) {
                    C32287b bVar = this.f84365a.f84362a;
                    if (i == 1 && i2 == 1) {
                        C42961az.m136380a(new C23281a(this.f84365a.f84364c));
                    }
                    bVar.f84353a.set(false);
                }
            }).mo56859a());
        }
    }

    public C32287b(C32296d dVar) {
        C7573i.m23587b(dVar, "next");
        super(dVar);
    }

    /* renamed from: a */
    private final void m104828a(int i, String str) {
        UiThreadUtil.runOnUiThread(new C32288a(this, i, str));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r5.f84382a == 3072) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r2.f84353a.compareAndSet(false, true) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        r3 = r3.f84380a.f84382a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r4 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r4 = r4.f33098b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        m104828a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return new com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.C32296d.C32297a(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r5.f84382a == 3070) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r5.f84382a == 3071) goto L_0x0024;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.C32296d.C32297a mo83494a(com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.C32303g r3, com.bytedance.retrofit2.p637a.C12462c r4, com.bytedance.retrofit2.C12534t<?> r5) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x000c
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.g$a r5 = r3.f84380a
            if (r5 == 0) goto L_0x000c
            int r5 = r5.f84382a
            r0 = 3070(0xbfe, float:4.302E-42)
            if (r5 == r0) goto L_0x0024
        L_0x000c:
            if (r3 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.g$a r5 = r3.f84380a
            if (r5 == 0) goto L_0x0018
            int r5 = r5.f84382a
            r0 = 3071(0xbff, float:4.303E-42)
            if (r5 == r0) goto L_0x0024
        L_0x0018:
            if (r3 == 0) goto L_0x0041
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.g$a r5 = r3.f84380a
            if (r5 == 0) goto L_0x0041
            int r5 = r5.f84382a
            r0 = 3072(0xc00, float:4.305E-42)
            if (r5 != r0) goto L_0x0041
        L_0x0024:
            java.util.concurrent.atomic.AtomicBoolean r5 = r2.f84353a
            r0 = 1
            r1 = 0
            boolean r5 = r5.compareAndSet(r1, r0)
            if (r5 == 0) goto L_0x0041
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.g$a r3 = r3.f84380a
            int r3 = r3.f84382a
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = r4.f33098b
            goto L_0x0038
        L_0x0037:
            r4 = 0
        L_0x0038:
            r2.m104828a(r3, r4)
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.d$a r3 = new com.ss.android.ugc.aweme.lancet.ssretrofitchain.d$a
            r3.<init>(r0, r1)
            return r3
        L_0x0041:
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.d$a r3 = com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.C32295c.f84366a
            java.lang.String r4 = "ChainManager.IGNORE_RESULT"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.C32287b.mo83494a(com.ss.android.ugc.aweme.lancet.ssretrofitchain.g, com.bytedance.retrofit2.a.c, com.bytedance.retrofit2.t):com.ss.android.ugc.aweme.lancet.ssretrofitchain.d$a");
    }

    /* renamed from: a */
    public final void mo83495a(Activity activity, int i, String str) {
        C7573i.m23587b(activity, "activity");
        if (i == 3070 || i == 3072) {
            ((ISecApi) ServiceManager.get().getService(ISecApi.class)).popCaptcha(activity, i, new C32290b(this, str));
            return;
        }
        if (i == 3071) {
            C10741a aVar = new C10741a(activity);
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            if (f.isLogin()) {
                aVar.mo25649a((int) R.string.c5n).mo25657b((int) R.string.c5m).mo25650a((int) R.string.ap5, (OnClickListener) new C32291c(this));
            } else {
                aVar.mo25657b((int) R.string.aeb).mo25658b((int) R.string.ve, (OnClickListener) new C32292d(this)).mo25650a((int) R.string.aab, (OnClickListener) new C32293e(this, activity, str));
            }
            aVar.mo25656a().mo25637a().setCancelable(false);
        }
    }
}
