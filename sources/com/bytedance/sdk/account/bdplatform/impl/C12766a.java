package com.bytedance.sdk.account.bdplatform.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.bytedance.sdk.account.bdplatform.impl.p658a.C12779b;
import com.bytedance.sdk.account.bdplatform.p655a.C12751a.C12752a;
import com.bytedance.sdk.account.bdplatform.p655a.C12751a.C12753b;
import com.bytedance.sdk.account.bdplatform.p655a.C12751a.C12754c;
import com.bytedance.sdk.account.bdplatform.p655a.C12755b;
import com.bytedance.sdk.account.bdplatform.p656b.C12758a;
import com.bytedance.sdk.account.bdplatform.p656b.C12759b;
import com.bytedance.sdk.account.bdplatform.p656b.C12764e;
import com.bytedance.sdk.account.p650b.p653c.C12745c.C12746a;
import com.bytedance.sdk.account.p650b.p653c.C12745c.C12747b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.sdk.account.bdplatform.impl.a */
public final class C12766a implements C12753b {

    /* renamed from: a */
    public final C12754c f33789a;

    /* renamed from: b */
    private final C12755b f33790b;

    /* renamed from: c */
    private final C12752a f33791c;

    /* renamed from: d */
    private final Handler f33792d;

    /* renamed from: e */
    private final Context f33793e;

    /* renamed from: f */
    private C12764e f33794f;

    /* renamed from: g */
    private volatile boolean f33795g;

    /* renamed from: a */
    public final boolean mo31257a(final C12746a aVar) {
        this.f33795g = false;
        if (!this.f33790b.mo31273a()) {
            if (this.f33789a != null) {
                this.f33789a.onNeedLogin();
            }
            return false;
        } else if (!this.f33790b.mo31274b()) {
            m37078a(2);
            return false;
        } else {
            this.f33792d.post(new Runnable() {
                public final void run() {
                    if (C12766a.this.f33789a != null) {
                        C12766a.this.f33789a.showLoadingDialog(C12766a.this.f33789a.getInitLoadingText());
                    }
                }
            });
            this.f33790b.mo31272a((Runnable) new Runnable() {
                public final void run() {
                    C12766a.this.mo31302c(aVar);
                }
            });
            return true;
        }
    }

    /* renamed from: a */
    private void m37086a(C12764e eVar, C12746a aVar) {
        this.f33794f = eVar;
        if (this.f33789a != null) {
            this.f33789a.onLogEvent("platform_auth_ticket", "success", 0, "");
        }
        if (eVar.f33788b) {
            m37091f(aVar);
        } else {
            m37092g(aVar);
        }
    }

    /* renamed from: a */
    public final boolean mo31256a(int i, String str) {
        if (this.f33795g) {
            return false;
        }
        this.f33795g = true;
        this.f33792d.post(new Runnable() {
            public final void run() {
                if (C12766a.this.f33789a != null) {
                    C12766a.this.f33789a.dismissLoadingDialog();
                }
            }
        });
        C12747b bVar = new C12747b();
        bVar.errorCode = -2;
        bVar.errorMsg = this.f33793e.getString(R.string.qv);
        if (this.f33789a != null) {
            this.f33789a.onCancel(bVar);
            this.f33789a.onLogEvent("platform_auth_result", "cancel", i, str);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo31255a() {
        this.f33795g = false;
        this.f33792d.post(new Runnable() {
            public final void run() {
                if (C12766a.this.f33789a != null) {
                    C12766a.this.f33789a.showLoadingDialog(C12766a.this.f33789a.getInitLoadingText());
                    C12766a.this.f33789a.updateLoginStatus();
                }
            }
        });
    }

    /* renamed from: a */
    private void m37087a(String str) {
        Toast makeText = Toast.makeText(this.f33793e, str, 0);
        makeText.setGravity(17, 0, 0);
        C12780b.m37109a(makeText);
    }

    /* renamed from: b */
    private C12747b m37088b() {
        C12747b bVar = new C12747b();
        bVar.errorCode = -1;
        bVar.errorMsg = this.f33793e.getString(R.string.qw);
        return bVar;
    }

    /* renamed from: a */
    private void m37079a(final C12747b bVar) {
        if (!this.f33795g) {
            this.f33792d.post(new Runnable() {
                public final void run() {
                    if (C12766a.this.f33789a != null) {
                        C12766a.this.f33789a.dismissLoadingDialog();
                        C12766a.this.f33789a.onSuccess(bVar);
                        C12766a.this.f33789a.onLogEvent("platform_auth_result", "success", 0, "");
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private void m37089b(final C12747b bVar) {
        if (!this.f33795g) {
            this.f33792d.post(new Runnable() {
                public final void run() {
                    if (C12766a.this.f33789a != null) {
                        C12766a.this.f33789a.dismissLoadingDialog();
                        C12766a.this.f33789a.onError(bVar);
                        C12766a.this.f33789a.onLogEvent("platform_auth_result", "fail", bVar.errorCode, bVar.errorMsg);
                    }
                }
            });
        }
    }

    /* renamed from: f */
    private void m37091f(final C12746a aVar) {
        if (!this.f33795g) {
            this.f33790b.mo31272a((Runnable) new Runnable() {
                public final void run() {
                    C12766a.this.mo31304e(aVar);
                }
            });
        }
    }

    /* renamed from: g */
    private void m37092g(final C12746a aVar) {
        if (!this.f33795g) {
            this.f33790b.mo31272a((Runnable) new Runnable() {
                public final void run() {
                    C12766a.this.mo31303d(aVar);
                }
            });
        }
    }

    /* renamed from: a */
    private void m37078a(int i) {
        C12747b bVar = new C12747b();
        bVar.errorCode = -12;
        bVar.errorMsg = this.f33793e.getString(R.string.r3);
        m37080a(bVar, 2);
        m37089b(bVar);
    }

    /* renamed from: c */
    public final void mo31302c(C12746a aVar) {
        if (!this.f33795g) {
            C12764e b = this.f33791c.mo31254b(aVar);
            if (b == null || !b.f33783e) {
                m37085a(b, 2);
            } else {
                m37086a(b, aVar);
            }
        }
    }

    /* renamed from: d */
    public final void mo31303d(C12746a aVar) {
        if (!this.f33795g) {
            C12759b a = this.f33791c.mo31253a(aVar);
            if (a == null || !a.f33783e) {
                m37084a(a, 1);
            } else {
                m37083a(a);
            }
        }
    }

    /* renamed from: b */
    private void m37090b(final C12759b bVar) {
        if (!this.f33795g) {
            this.f33792d.post(new Runnable() {
                public final void run() {
                    if (C12766a.this.f33789a != null) {
                        C12766a.this.f33789a.dismissLoadingDialog();
                        C12766a.this.f33789a.onAuthLogin(bVar);
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public final void mo31304e(C12746a aVar) {
        if (!this.f33795g) {
            C12764e eVar = this.f33794f;
            if (eVar == null || !eVar.f33783e) {
                m37085a(eVar, 2);
                return;
            }
            if (this.f33789a != null) {
                this.f33789a.onLogEvent("platform_auth_ticket", "success", 0, "");
            }
            C12758a a = this.f33791c.mo31252a(aVar, eVar.f33787a);
            if (a == null || !a.f33783e) {
                m37081a(a, 3);
            } else {
                m37082a(a, aVar);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo31258b(final C12746a aVar) {
        this.f33795g = false;
        if (!this.f33790b.mo31273a()) {
            if (this.f33789a != null) {
                this.f33789a.onNeedLogin();
            }
            return false;
        } else if (!this.f33790b.mo31274b()) {
            m37087a(this.f33793e.getString(R.string.r3));
            return false;
        } else {
            this.f33792d.post(new Runnable() {
                public final void run() {
                    if (C12766a.this.f33789a != null) {
                        C12766a.this.f33789a.showLoadingDialog(C12766a.this.f33789a.getAuthLoadingText());
                    }
                }
            });
            this.f33790b.mo31272a((Runnable) new Runnable() {
                public final void run() {
                    C12766a.this.mo31304e(aVar);
                }
            });
            return true;
        }
    }

    /* renamed from: a */
    private void m37083a(C12759b bVar) {
        if (this.f33789a != null) {
            this.f33789a.onLogEvent("platform_auth_info", "success", 0, "");
        }
        m37090b(bVar);
    }

    /* renamed from: a */
    private static void m37080a(C12747b bVar, int i) {
        if (bVar != null) {
            if (bVar.extras == null) {
                bVar.extras = new Bundle();
            }
            bVar.extras.putInt("response_type", i);
        }
    }

    /* renamed from: a */
    private void m37081a(C12758a aVar, int i) {
        C12747b b = m37088b();
        if (aVar != null) {
            b.errorCode = aVar.f33784f;
            b.errorMsg = aVar.f33785g;
        }
        m37080a(b, 3);
        if (this.f33789a != null) {
            this.f33789a.onLogEvent("platform_auth_code", "fail", b.errorCode, b.errorMsg);
        }
        m37089b(b);
    }

    /* renamed from: a */
    private void m37082a(C12758a aVar, C12746a aVar2) {
        C12747b bVar = new C12747b();
        bVar.f33744a = aVar.f33748a;
        if (aVar2 != null) {
            bVar.f33746c = aVar2.f33741f;
            bVar.f33745b = aVar2.f33736a;
        }
        if (this.f33789a != null) {
            this.f33789a.onLogEvent("platform_auth_code", "success", 0, "");
        }
        m37079a(bVar);
    }

    /* renamed from: a */
    private void m37084a(C12759b bVar, int i) {
        C12747b b = m37088b();
        if (bVar != null) {
            b.errorCode = bVar.f33784f;
            b.errorMsg = bVar.f33785g;
        }
        m37080a(b, 1);
        if (this.f33789a != null) {
            this.f33789a.onLogEvent("platform_auth_info", "fail", b.errorCode, b.errorMsg);
        }
        m37089b(b);
    }

    /* renamed from: a */
    private void m37085a(C12764e eVar, int i) {
        C12747b b = m37088b();
        if (eVar != null) {
            b.errorCode = eVar.f33784f;
            b.errorMsg = eVar.f33785g;
        }
        m37080a(b, 2);
        if (this.f33789a != null) {
            this.f33789a.onLogEvent("platform_auth_ticket", "fail", b.errorCode, b.errorMsg);
        }
        m37089b(b);
    }

    public C12766a(C12754c cVar, C12755b bVar, Context context) {
        this(cVar, null, bVar, context);
    }

    private C12766a(C12754c cVar, C12752a aVar, C12755b bVar, Context context) {
        this.f33789a = cVar;
        this.f33790b = bVar;
        this.f33793e = context;
        this.f33791c = new C12779b(context, bVar);
        this.f33792d = new Handler(Looper.getMainLooper());
    }
}
