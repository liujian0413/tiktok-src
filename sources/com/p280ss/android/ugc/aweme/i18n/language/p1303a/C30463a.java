package com.p280ss.android.ugc.aweme.i18n.language.p1303a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.google.android.play.core.splitinstall.C17133c;
import com.google.android.play.core.splitinstall.C17135e;
import com.google.android.play.core.splitinstall.C17137g;
import com.google.android.play.core.splitinstall.C6563f;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.p1168df.base.C26220a;
import com.p280ss.android.ugc.aweme.p1168df.base.C26227d;
import com.p280ss.android.ugc.aweme.p1168df.base.p1169a.C26223b;
import com.p280ss.android.ugc.aweme.p1168df.base.p1170ui.C26235a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.a.a */
public final class C30463a extends C26220a {

    /* renamed from: e */
    public Locale f80040e;

    /* renamed from: f */
    private C26235a f80041f;

    /* renamed from: g */
    private C17133c f80042g;

    /* renamed from: h */
    private C17137g f80043h = new C17137g() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo15871a(C6563f fVar) {
            if (fVar.mo15927b().size() > 0 && C30463a.this.f80040e != null) {
                boolean z = false;
                Iterator it = fVar.mo15927b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (TextUtils.equals(new Locale((String) it.next()).getLanguage(), C30463a.this.f80040e.getLanguage())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    C30472f.m99530a().put(C30463a.this.f80040e.getLanguage(), fVar);
                    C26223b.m86218a("dynamic_language_resources", C30463a.this.f80040e, fVar);
                    switch (fVar.f18875b) {
                        case 0:
                            C30463a.this.mo59954b();
                            if (C30463a.this.f69117b != null) {
                                C30463a.this.mo59955b((Context) C30463a.this.f69117b.get());
                            }
                            if (C30463a.this.f69118c != null) {
                                C30463a.this.f69118c.mo16974b();
                            }
                            C30463a.this.f69119d = -1;
                            break;
                        case 1:
                            if (C30463a.this.f69119d != 1) {
                                C30463a.this.mo59951a();
                            }
                            C30463a.this.f69119d = 1;
                            return;
                        case 2:
                            C30463a.this.mo59952a(fVar.f18877d, fVar.f18878e);
                            C30463a.this.f69119d = 2;
                            return;
                        case 3:
                            if (C30463a.this.f69119d != 3) {
                                C30463a.this.mo59952a(fVar.f18877d, fVar.f18878e);
                                C30463a.this.f69119d = 3;
                                return;
                            }
                            break;
                        case 4:
                            if (C30463a.this.f69119d != 4) {
                                C30463a.this.f69119d = 4;
                                return;
                            }
                            break;
                        case 5:
                            if (C30463a.this.f69119d != 5) {
                                C30463a.this.mo59954b();
                                if (C30463a.this.f69118c != null) {
                                    C30463a.this.f69118c.mo16973a();
                                }
                            }
                            C30463a.this.f69119d = -1;
                            return;
                        case 6:
                            if (C30463a.this.f69119d != 6) {
                                C30463a.this.mo59954b();
                                if (C30463a.this.f69117b != null) {
                                    C30463a.this.mo59955b((Context) C30463a.this.f69117b.get());
                                }
                                if (C30463a.this.f69118c != null) {
                                    C30463a.this.f69118c.mo16974b();
                                }
                            }
                            C30463a.this.f69119d = -1;
                            return;
                        case 7:
                            C30463a.this.f69119d = -1;
                            return;
                        case 8:
                            C30463a.this.f69119d = 8;
                            C30463a.this.mo80137a(fVar);
                            return;
                        case 9:
                            C30463a.this.f69119d = -1;
                            return;
                    }
                }
            }
        }
    };

    /* renamed from: a */
    public final void mo59953a(Context context) {
    }

    /* renamed from: c */
    public final void mo59956c(Context context) {
    }

    /* renamed from: d */
    public final void mo67782d() {
        C26227d.m86225a(this.f80043h);
    }

    /* renamed from: e */
    public final void mo67783e() {
        C26227d.m86228b(this.f80043h);
    }

    /* renamed from: g */
    private static boolean m99487g() {
        try {
            if (AwemeApplication.m21341a().getPackageManager().getPackageInfo("com.android.vending", 0).versionCode < 81510000) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo59951a() {
        if (this.f69117b != null) {
            Activity activity = (Activity) this.f69117b.get();
            if (!(this.f80041f == null || activity == null || activity.isFinishing())) {
                this.f80041f.show();
            }
        }
    }

    /* renamed from: b */
    public final void mo59954b() {
        if (this.f69117b != null) {
            Activity activity = (Activity) this.f69117b.get();
            if (!(this.f80041f == null || activity == null || activity.isFinishing())) {
                this.f80041f.dismiss();
                this.f80041f = null;
            }
        }
    }

    public C30463a(Context context) {
        super(context, "dynamic_language_resources");
    }

    /* renamed from: b */
    public final void mo59955b(Context context) {
        if (context != null) {
            C10761a.m31399c(context, (int) R.string.by_).mo25750a();
        }
    }

    /* renamed from: d */
    public final void mo59957d(Context context) {
        if (this.f80041f == null && context != null) {
            this.f80041f = new C26235a(context, 3);
            this.f80041f.setCancelable(false);
            this.f80041f.setCanceledOnTouchOutside(false);
            this.f80041f.setIndeterminate(true);
            this.f80041f.setMax(100);
            this.f80041f.setMessage(context.getString(R.string.bya));
        }
    }

    /* renamed from: a */
    public final void mo80137a(C6563f fVar) {
        if (this.f69117b != null) {
            Activity activity = (Activity) this.f69117b.get();
            if (fVar != null && (activity instanceof AmeSSActivity) && this.f80042g != null) {
                try {
                    ((AmeSSActivity) activity).setOnActivityResultListener(1001, new C30465b(this));
                    this.f80042g.mo44405a(fVar, activity, 8);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo80138a(Locale locale) {
        this.f80040e = locale;
        this.f80042g = C26227d.m86227b();
        if (this.f80042g == null || !this.f80042g.mo44403a().contains(this.f80040e.getLanguage())) {
            C6563f fVar = (C6563f) C30472f.m99530a().get(this.f80040e.getLanguage());
            if (fVar != null) {
                C26223b.m86217a("dynamic_language_resources", this.f80040e, fVar.f18875b);
                if (fVar.f18875b == 3 || fVar.f18875b == 2 || fVar.f18875b == 4) {
                    return false;
                }
            } else {
                C26223b.m86217a("dynamic_language_resources", this.f80040e, 0);
            }
            if (!C30466c.m99503a(AwemeApplication.m21341a())) {
                if (!(this.f69117b == null || this.f69117b.get() == null)) {
                    C10761a.m31399c((Context) this.f69117b.get(), (int) R.string.cjs).mo25750a();
                }
            } else if (!TextUtils.equals("ceb", this.f80040e.getLanguage()) || !m99487g()) {
                if (this.f80042g != null) {
                    this.f80042g.mo44401a(C17135e.m56792a().mo44411a(this.f80040e).mo44412a());
                    if (this.f69117b != null) {
                        mo59957d((Context) this.f69117b.get());
                    }
                    return false;
                }
            } else if (!(this.f69117b == null || this.f69117b.get() == null)) {
                new C10741a((Context) this.f69117b.get()).mo25657b((int) R.string.cun).mo25650a((int) R.string.ap5, (OnClickListener) null).mo25656a().mo25637a();
            }
            if (this.f69118c != null) {
                this.f69118c.mo16974b();
            }
            return false;
        }
        if (this.f69118c != null) {
            this.f69118c.mo16973a();
        }
        C26223b.m86217a("dynamic_language_resources", this.f80040e, 5);
        return true;
    }

    /* renamed from: a */
    public final void mo59952a(long j, long j2) {
        if (this.f80041f != null) {
            this.f80041f.setProgress(m86192b(j, j2));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo80136a(int i, int i2, Intent intent) {
        if (i == 8) {
            if (i2 == 0) {
                this.f69119d = -1;
                if (this.f69118c != null) {
                    this.f69118c.mo16974b();
                }
            }
            C26223b.m86220c("dynamic_language_resources", i2);
        }
    }
}
