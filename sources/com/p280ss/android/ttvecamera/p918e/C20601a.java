package com.p280ss.android.ttvecamera.p918e;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Size;
import com.oppo.p804a.C18616b;
import com.p280ss.android.ttvecamera.C20604f.C20605a;
import com.p280ss.android.ttvecamera.C20604f.C20606b;
import com.p280ss.android.ttvecamera.C20652m;
import com.p280ss.android.ttvecamera.p914a.C20551a;
import com.p280ss.android.ttvecamera.p916c.C20581b;
import com.p280ss.android.ttvecamera.p917d.C20592e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttvecamera.e.a */
public final class C20601a extends C20551a {

    /* renamed from: z */
    boolean f55645z;

    /* renamed from: a */
    public final void mo55613a(Bundle bundle) {
    }

    /* renamed from: l */
    public final Bundle mo55615l() {
        Bundle l = super.mo55615l();
        this.f55645z = this.f55638a.mo55728a(this.f55648h.f55726e);
        l.putBoolean("support_anti_shake", this.f55645z);
        return l;
    }

    /* renamed from: m */
    public final int mo55616m() throws Exception {
        int i;
        if (this.f55537v == null) {
            this.f55537v = (CameraManager) this.f55652l.getSystemService("camera");
            if (this.f55537v == null) {
                return -1;
            }
        }
        if (this.f55648h.f55737p == 0) {
            this.f55643f = new C20603c(this, this.f55652l, this.f55537v, this.f55651k);
        } else {
            this.f55643f = new C20602b(this, this.f55652l, this.f55537v, this.f55651k);
        }
        this.f55648h.f55743v = this.f55643f.mo55625a(this.f55648h.f55726e);
        if (this.f55648h.f55743v == null) {
            return -401;
        }
        C20581b bVar = this.f55643f;
        String str = this.f55648h.f55743v;
        if (this.f55642e) {
            i = this.f55648h.f55739r;
        } else {
            i = 0;
        }
        int a = bVar.mo55702a(str, i);
        if (a != 0) {
            return a;
        }
        mo55615l();
        this.f55650j.mo55582b(1, 0, "TEOppoCamera2 features is ready");
        this.f55537v.openCamera(this.f55648h.f55743v, this.f55540y, this.f55651k);
        return 0;
    }

    /* renamed from: d */
    public final void mo55614d(int i) {
        if (this.f55643f != null) {
            mo55618o();
            if (i == 0) {
                this.f55643f = new C20603c(this, this.f55652l, this.f55537v, this.f55651k);
                C20652m.m68436c("TEOppoCamera", "switch video mode");
            } else {
                this.f55643f = new C20602b(this, this.f55652l, this.f55537v, this.f55651k);
                C20652m.m68436c("TEOppoCamera", "switch image mode");
            }
            try {
                this.f55648h.f55743v = this.f55643f.mo55625a(this.f55648h.f55726e);
                if (this.f55648h.f55743v == null || this.f55643f.mo55702a(this.f55648h.f55743v, this.f55648h.f55739r) != 0) {
                    return;
                }
            } catch (CameraAccessException unused) {
            }
            this.f55643f.mo55626a((Object) this.f55538w);
            mo55617n();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo55735f(int i) {
        StringBuilder sb = new StringBuilder("updateAntiShake: ");
        sb.append(i);
        C20652m.m68435b("TEOppoCamera", sb.toString());
        int i2 = this.f55648h.f55731j.f55535a;
        int i3 = this.f55648h.f55731j.f55536b;
        String packageName = this.f55652l.getPackageName();
        Size size = new Size(i2, i3);
        String id = this.f55538w.getId();
        C18616b a = C18616b.m61064a();
        try {
            String b = a.mo48807b((String) C20592e.f55633c.get(packageName));
            if (b == null || b.isEmpty()) {
                C20652m.m68436c("TEOppoCamera", "oMediaVersion is null");
            } else {
                String b2 = a.mo48806b();
                if (b2 == null || !b2.contains(id)) {
                    C20652m.m68436c("TEOppoCamera", "omedia camList is null");
                    return;
                }
                String c = a.mo48808c(id);
                if (c == null || c.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder("omedia camera:");
                    sb2.append(id);
                    sb2.append("capability is null");
                    C20652m.m68436c("TEOppoCamera", sb2.toString());
                } else {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject(c);
                    String str = null;
                    if (1 == jSONObject2.optInt("EIS")) {
                        str = "EIS";
                        jSONObject.put(str, 1);
                    } else if (1 == jSONObject2.optInt("OIS-Movie")) {
                        str = "OIS-Movie";
                        jSONObject.put(str, 1);
                    }
                    boolean z = false;
                    if (!(c == null || str == null || str.isEmpty())) {
                        boolean a2 = C18616b.m61067a(c, str, new Size(size.getWidth(), size.getHeight()));
                        boolean a3 = C18616b.m61066a(c, str, i);
                        StringBuilder sb3 = new StringBuilder("w:");
                        sb3.append(size.getWidth());
                        sb3.append(" h:");
                        sb3.append(size.getHeight());
                        sb3.append("sizeCheck:");
                        sb3.append(a2);
                        sb3.append(" countCheck:");
                        sb3.append(a3);
                        C20652m.m68435b("TEOppoCamera", sb3.toString());
                        z = a2 & a3;
                    }
                    if (jSONObject.length() <= 0 || !z) {
                        StringBuilder sb4 = new StringBuilder("omedia update parm str is null ");
                        sb4.append(jSONObject);
                        sb4.append(" ");
                        sb4.append(z);
                        C20652m.m68436c("TEOppoCamera", sb4.toString());
                        return;
                    }
                    boolean a4 = a.mo48805a(jSONObject.toString());
                    StringBuilder sb5 = new StringBuilder("omedia set capability: ");
                    sb5.append(jSONObject.toString());
                    sb5.append(" setFeatureSuccess:");
                    sb5.append(a4);
                    C20652m.m68435b("TEOppoCamera", sb5.toString());
                }
            }
        } catch (RuntimeException unused) {
            C20652m.m68437d("TEOppoCamera", "omedia got a RuntimeException");
        } catch (JSONException unused2) {
            C20652m.m68436c("TEOppoCamera", "omedia got a json Exception");
        }
    }

    public C20601a(int i, Context context, C20605a aVar, Handler handler, C20606b bVar) {
        super(i, context, aVar, handler, bVar);
    }
}
