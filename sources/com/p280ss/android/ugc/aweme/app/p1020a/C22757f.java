package com.p280ss.android.ugc.aweme.app.p1020a;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.IAccountService.C21082f;
import com.p280ss.android.ugc.aweme.login.p1371a.C32648d;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35666d;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.playerkit.videoview.C44933a;

/* renamed from: com.ss.android.ugc.aweme.app.a.f */
public class C22757f implements C21082f {

    /* renamed from: a */
    protected boolean f60443a = false;

    /* renamed from: b */
    protected boolean f60444b = false;

    /* renamed from: c */
    private Handler f60445c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private Activity f60446d = null;

    public C22757f() {
    }

    /* renamed from: c */
    static final /* synthetic */ void m75140c() {
        if (!C43316v.m137250H()) {
            C43316v.m137450K().mo104948x();
        } else {
            C44933a.m141791a().mo71672ad();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo59807b() {
        if (this.f60446d == null || C6405d.m19984g() == this.f60446d) {
            if (!C43316v.m137250H()) {
                C43316v.m137450K().mo104946v();
                return;
            }
            C44933a.m141791a().mo71671ac();
        }
    }

    public C22757f(Activity activity) {
        this.f60446d = activity;
    }

    /* renamed from: a */
    public final void mo56867a(int i, int i2, String str) {
        if (i == 8 && i2 == 4) {
            C42961az.m136380a(new C35666d(2));
        } else if (i == 9 && i2 == 1) {
            if (!C43316v.m137250H()) {
                C43316v.m137450K().mo104948x();
            } else {
                C44933a.m141791a().mo71672ad();
            }
        }
        if (i == 1) {
            if (i2 == 1) {
                if (C43316v.m137450K().mo104916o()) {
                    this.f60445c.postDelayed(C22758g.f60447a, 500);
                    this.f60443a = true;
                }
            } else if (i2 == 4 && (this.f60443a || this.f60444b)) {
                this.f60445c.postDelayed(new C22759h(this), 500);
            }
        }
        if ((i == 1 || i == 7 || i == 10) && i2 == 4) {
            new Handler().postDelayed(C22760i.f60449a, 200);
        }
        if (i2 == 1) {
            C42961az.m136380a(new C32648d(true));
        }
    }
}
