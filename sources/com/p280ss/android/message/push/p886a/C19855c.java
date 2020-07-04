package com.p280ss.android.message.push.p886a;

import android.content.Context;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.message.C19837f;
import com.p280ss.android.pushmanager.app.C20051g;
import com.p280ss.android.ugc.aweme.app.C22912d;
import java.io.IOException;
import java.util.zip.DataFormatException;
import org.json.JSONObject;

/* renamed from: com.ss.android.message.push.a.c */
public final class C19855c implements C19853a {

    /* renamed from: a */
    public String f53837a;

    /* renamed from: b */
    public String f53838b;

    /* renamed from: c */
    public String f53839c;

    /* renamed from: d */
    public long f53840d;

    /* renamed from: e */
    public boolean f53841e;

    /* renamed from: f */
    public int f53842f;

    /* renamed from: g */
    public String f53843g;

    /* renamed from: a */
    public final String mo53215a() {
        return this.f53837a;
    }

    /* renamed from: b */
    public final String mo53217b() {
        return this.f53838b;
    }

    /* renamed from: d */
    public final long mo53219d() {
        return this.f53840d;
    }

    /* renamed from: e */
    public final boolean mo53220e() {
        return this.f53841e;
    }

    /* renamed from: f */
    public final String mo53221f() {
        return this.f53843g;
    }

    /* renamed from: c */
    public final long mo53218c() {
        String str = this.f53839c;
        if (C6319n.m19593a(str)) {
            str = "0";
        }
        return Long.parseLong(str);
    }

    /* renamed from: g */
    private static JSONObject m65565g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("title", "今日头条");
            jSONObject.put("text", "新消息");
            jSONObject.put("id", (int) ((Math.random() * 1000.0d) + 1012.0d));
            String str = C22912d.f60642b;
            StringBuilder sb = new StringBuilder("snssdk143://detail?groupid=34265446");
            sb.append(String.valueOf((int) (Math.random() * 100.0d)));
            jSONObject.put(str, sb.toString());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f53837a);
        sb.append("|");
        sb.append(String.valueOf(this.f53838b));
        sb.append("|");
        sb.append(this.f53839c);
        sb.append("|");
        sb.append(String.valueOf(this.f53840d));
        sb.append("|");
        sb.append(String.valueOf(this.f53841e));
        sb.append("|");
        sb.append(String.valueOf(this.f53842f));
        sb.append("|");
        sb.append(this.f53843g);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo53223a(String str) {
        if (str != null) {
            String[] split = str.split("\\|");
            if (split != null && split.length == 7) {
                this.f53837a = split[0];
                this.f53838b = split[1];
                this.f53839c = split[2];
                this.f53840d = Long.parseLong(split[3]);
                this.f53841e = Boolean.parseBoolean(split[4]);
                this.f53842f = Integer.parseInt(split[5]);
                this.f53843g = split[6];
            }
        }
    }

    /* renamed from: a */
    public final void mo53216a(Context context, byte[] bArr) {
        if (bArr != null) {
            try {
                JSONObject a = C20051g.m66036a(bArr, false);
                if (a != null) {
                    StringBuilder sb = new StringBuilder("PushUtils.getMessage = ");
                    sb.append(a.toString());
                    C19854b.m65564a(context, sb.toString());
                    C19837f.m65508a(context, a, 1, mo53221f());
                } else {
                    if (C6312h.m19578b()) {
                        C19837f.m65508a(context, m65565g(), 1, mo53221f());
                    }
                }
            } catch (IOException | DataFormatException unused) {
            } catch (Exception unused2) {
            }
        }
    }
}
