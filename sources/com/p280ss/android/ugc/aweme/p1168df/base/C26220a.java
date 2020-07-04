package com.p280ss.android.ugc.aweme.p1168df.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.morpheus.C12235a;
import com.bytedance.morpheus.C12249c;
import com.bytedance.morpheus.core.C12250a;
import com.bytedance.morpheus.core.C12251b;
import com.bytedance.morpheus.p617a.C12236a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.p1168df.base.p1169a.C26223b;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.df.base.a */
public abstract class C26220a {

    /* renamed from: a */
    public static final String f69116a = "a";

    /* renamed from: b */
    public WeakReference<Activity> f69117b;

    /* renamed from: c */
    public C26221a f69118c;

    /* renamed from: d */
    public int f69119d = -1;

    /* renamed from: e */
    private C12251b f69120e;

    /* renamed from: f */
    private String f69121f;

    /* renamed from: g */
    private long f69122g = -1;

    /* renamed from: com.ss.android.ugc.aweme.df.base.a$a */
    public interface C26221a {
        /* renamed from: a */
        void mo16973a();

        /* renamed from: b */
        void mo16974b();
    }

    /* renamed from: a */
    public abstract void mo59951a();

    /* renamed from: a */
    public abstract void mo59952a(long j, long j2);

    /* renamed from: a */
    public abstract void mo59953a(Context context);

    /* renamed from: b */
    public abstract void mo59954b();

    /* renamed from: b */
    public abstract void mo59955b(Context context);

    /* renamed from: c */
    public abstract void mo59956c(Context context);

    /* renamed from: d */
    public abstract void mo59957d(Context context);

    /* renamed from: d */
    public void mo67782d() {
        C12249c.m35632a(this.f69120e);
    }

    /* renamed from: e */
    public void mo67783e() {
        C12249c.m35636b(this.f69120e);
    }

    static {
        C12249c.m35631a((C12235a) new C26228e());
    }

    /* renamed from: f */
    public static boolean m86193f() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo67781c() {
        C12250a b = C12249c.m35635b(this.f69121f);
        if (b == null) {
            if (this.f69118c != null) {
                this.f69118c.mo16974b();
            }
            return false;
        }
        C26223b.m86219b(this.f69121f, b.f32568c);
        if (b.f32568c == 5) {
            if (this.f69118c != null) {
                this.f69118c.mo16973a();
            }
            return true;
        }
        if (b.f32568c != 3 && b.f32568c != 2 && b.f32568c != 4) {
            C12249c.m35633a(this.f69121f);
            if (this.f69117b != null) {
                mo59957d((Context) this.f69117b.get());
            }
        } else if (this.f69117b != null) {
            mo59953a((Context) this.f69117b.get());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo67778a(C12250a aVar) {
        if (this.f69117b != null) {
            Activity activity = (Activity) this.f69117b.get();
            if (aVar != null && (activity instanceof AmeSSActivity)) {
                try {
                    ((AmeSSActivity) activity).setOnActivityResultListener(1001, new C26226c(this, aVar));
                    C12236a.m35599a(aVar, activity, 8);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo67780b(C12250a aVar) {
        if (TextUtils.equals(this.f69121f, aVar.f32566a)) {
            C26223b.m86215a(aVar.f32566a);
            switch (aVar.f32568c) {
                case 0:
                    mo59954b();
                    if (this.f69118c != null) {
                        this.f69118c.mo16974b();
                    }
                    this.f69119d = -1;
                    break;
                case 1:
                    if (this.f69119d != 1) {
                        mo59951a();
                    }
                    this.f69119d = 1;
                    return;
                case 2:
                    if (this.f69122g == -1) {
                        this.f69122g = System.currentTimeMillis();
                    } else {
                        aVar.f32571f = System.currentTimeMillis() - this.f69122g;
                    }
                    mo59952a(aVar.f32570e, aVar.f32569d);
                    this.f69119d = 2;
                    return;
                case 3:
                    if (this.f69119d != 3) {
                        mo59952a(aVar.f32570e, aVar.f32569d);
                        this.f69119d = 3;
                        return;
                    }
                    break;
                case 4:
                    if (this.f69119d != 4) {
                        this.f69119d = 4;
                        if (this.f69122g != -1) {
                            this.f69122g = -1;
                            return;
                        }
                    }
                    break;
                case 5:
                    if (this.f69119d != 5) {
                        mo59954b();
                        if (this.f69117b != null) {
                            mo59956c((Context) this.f69117b.get());
                        }
                        if (this.f69118c != null) {
                            this.f69118c.mo16973a();
                        }
                    }
                    this.f69119d = -1;
                    return;
                case 6:
                    if (this.f69119d != 6) {
                        mo59954b();
                        if (this.f69117b != null) {
                            mo59955b((Context) this.f69117b.get());
                        }
                        if (this.f69118c != null) {
                            this.f69118c.mo16974b();
                        }
                    }
                    this.f69119d = -1;
                    return;
                case 7:
                    this.f69119d = -1;
                    return;
                case 8:
                    this.f69119d = 8;
                    mo67778a(aVar);
                    return;
                case 9:
                    this.f69119d = -1;
                    return;
            }
        }
    }

    public C26220a(Context context, String str) {
        if (context instanceof Activity) {
            this.f69117b = new WeakReference<>((Activity) context);
        }
        this.f69121f = str;
        this.f69120e = new C26225b(this);
    }

    /* renamed from: b */
    protected static int m86192b(long j, long j2) {
        int i;
        if (j <= 0 || j2 <= 0) {
            i = 0;
        } else {
            i = (int) Math.ceil((double) ((((float) j) * 100.0f) / ((float) j2)));
        }
        return Math.max(0, Math.min(i, 100));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67779a(C12250a aVar, int i, int i2, Intent intent) {
        if (i == 8) {
            if (i2 == 0) {
                this.f69119d = -1;
                if (this.f69118c != null) {
                    this.f69118c.mo16974b();
                }
            }
            C26223b.m86220c(aVar.f32566a, i2);
        }
    }
}
