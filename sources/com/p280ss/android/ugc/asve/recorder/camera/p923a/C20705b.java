package com.p280ss.android.ugc.asve.recorder.camera.p923a;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.p280ss.android.medialib.camera.C19662d;
import com.p280ss.android.ugc.asve.p756d.C15448c;
import com.p280ss.android.ugc.asve.recorder.camera.C20703a;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.a.b */
public final class C20705b {

    /* renamed from: b */
    public static boolean f55925b;

    /* renamed from: e */
    private static boolean f55926e;

    /* renamed from: a */
    public boolean f55927a;

    /* renamed from: c */
    public C20707b f55928c;

    /* renamed from: d */
    private int f55929d = -1;

    /* renamed from: f */
    private Context f55930f;

    /* renamed from: g */
    private int f55931g;

    /* renamed from: a */
    private boolean m68748a() {
        if (this.f55931g == 1 || this.f55931g == 2 || this.f55931g == 3 || this.f55931g == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m68747a(int i) {
        if (i == -1) {
            return C20704a.m68743a(Build.MODEL);
        }
        return i;
    }

    /* renamed from: b */
    public final void mo55995b(Context context) {
        this.f55927a = true;
        if (f55925b != f55926e) {
            m68752d(f55926e);
        }
    }

    /* renamed from: b */
    private static boolean m68750b(int i) {
        switch (m68747a(i)) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return false;
            default:
                return false;
        }
    }

    /* renamed from: c */
    private void m68751c(boolean z) {
        int i;
        f55926e = z;
        C15448c a = C15448c.m45237a(this.f55930f);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        a.mo39004b(i);
    }

    /* renamed from: d */
    private void m68752d(final boolean z) {
        if (this.f55927a && m68748a() && VERSION.SDK_INT >= 23) {
            this.f55928c.mo55953c(z);
            this.f55928c.mo55931a(this.f55928c.mo55955d(), (C19662d) new C19662d() {
                /* renamed from: a */
                public final void mo52271a(int i) {
                    String str;
                    StringBuilder sb = new StringBuilder("Antishake ");
                    if (z) {
                        str = "on ";
                    } else {
                        str = "off";
                    }
                    sb.append(str);
                    sb.append(", camera open success: Camera id:");
                    sb.append(C20705b.this.f55928c.mo55955d());
                    sb.append(", camera type");
                    sb.append(i);
                    C20705b.f55925b = z;
                }

                /* renamed from: a */
                public final void mo52272a(int i, int i2, String str) {
                    String str2;
                    StringBuilder sb = new StringBuilder("Antishake ");
                    if (z) {
                        str2 = "on ";
                    } else {
                        str2 = "off";
                    }
                    sb.append(str2);
                    sb.append(", camera open fail: Camera id:");
                    sb.append(C20705b.this.f55928c.mo55955d());
                    sb.append(", camera type");
                    sb.append(i);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo55996b(boolean z) {
        if (m68748a() && VERSION.SDK_INT >= 23) {
            if (z) {
                this.f55928c.mo55953c(false);
                return;
            }
            this.f55928c.mo55953c(m68749a(this.f55930f, this.f55929d));
        }
    }

    /* renamed from: a */
    public final void mo55991a(Context context) {
        this.f55927a = false;
        if (f55925b) {
            m68752d(false);
        }
    }

    /* renamed from: a */
    public final void mo55993a(boolean z) {
        boolean z2 = false;
        if (!m68748a() || VERSION.SDK_INT < 23) {
            C15448c.m45237a(this.f55930f).mo39004b(2);
            f55925b = false;
            f55926e = false;
            return;
        }
        boolean a = m68749a(this.f55930f, this.f55929d);
        f55925b = a;
        f55926e = a;
        C20707b bVar = this.f55928c;
        if (a && z) {
            z2 = true;
        }
        bVar.mo55953c(z2);
    }

    /* renamed from: a */
    public final void mo55992a(Context context, boolean z) {
        m68751c(z);
        m68752d(z);
    }

    /* renamed from: a */
    public static boolean m68749a(Context context, int i) {
        if (C15448c.m45237a(context).mo39003b() != 0) {
            return f55926e;
        }
        m68750b(i);
        C15448c.m45237a(context).mo39004b(2);
        f55925b = false;
        f55926e = false;
        return false;
    }

    /* renamed from: a */
    public final boolean mo55994a(boolean z, boolean z2) {
        if (this.f55931g == 1) {
            if (z || z2) {
                return false;
            }
            return true;
        } else if (this.f55931g == 2) {
            if (z || !C20703a.m68741a(this.f55930f, 5, 0, this.f55928c.mo55949b())) {
                return false;
            }
            return true;
        } else if (this.f55931g == 3) {
            if (!z) {
                return true;
            }
            return false;
        } else if (this.f55931g != 4 || z || z2) {
            return false;
        } else {
            return true;
        }
    }

    public C20705b(Context context, C20707b bVar, int i) {
        this.f55929d = i;
        this.f55931g = m68747a(this.f55929d);
        this.f55930f = context;
        this.f55927a = true;
        this.f55928c = bVar;
    }
}
