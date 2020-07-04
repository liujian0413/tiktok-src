package com.bytedance.ies.p555c.p558c;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.ies.p555c.C10702a;
import com.google.gson.p276a.C6593c;
import java.util.List;
import java.util.Locale;

/* renamed from: com.bytedance.ies.c.c.a */
public final class C10717a {
    @C6593c(mo15949a = "common")

    /* renamed from: a */
    public C10718a f28638a;
    @C6593c(mo15949a = "offline")

    /* renamed from: b */
    public List<C10719b> f28639b;

    /* renamed from: com.bytedance.ies.c.c.a$a */
    public static class C10718a {
        @C6593c(mo15949a = "app_version")

        /* renamed from: a */
        public String f28640a;
        @C6593c(mo15949a = "sdk_version")

        /* renamed from: b */
        public String f28641b = "1.0.0.alpha";
        @C6593c(mo15949a = "device_id")

        /* renamed from: c */
        public String f28642c;
        @C6593c(mo15949a = "device_model")

        /* renamed from: d */
        public String f28643d = Build.MODEL;
        @C6593c(mo15949a = "os")

        /* renamed from: e */
        public int f28644e;
        @C6593c(mo15949a = "region")

        /* renamed from: f */
        public String f28645f = Locale.getDefault().getCountry();
    }

    /* renamed from: com.bytedance.ies.c.c.a$b */
    public static class C10719b {
        @C6593c(mo15949a = "resource_url")

        /* renamed from: a */
        public String f28646a;
        @C6593c(mo15949a = "access_key")

        /* renamed from: b */
        public String f28647b;
        @C6593c(mo15949a = "channel")

        /* renamed from: c */
        public String f28648c;
        @C6593c(mo15949a = "mime_type")

        /* renamed from: d */
        public String f28649d;
        @C6593c(mo15949a = "offline_status")

        /* renamed from: e */
        public Integer f28650e;
        @C6593c(mo15949a = "offline_duration")

        /* renamed from: f */
        public Long f28651f;
        @C6593c(mo15949a = "ac")

        /* renamed from: g */
        public String f28652g;
        @C6593c(mo15949a = "offline_rule")

        /* renamed from: h */
        public String f28653h;
        @C6593c(mo15949a = "err_code")

        /* renamed from: i */
        public String f28654i;
        @C6593c(mo15949a = "err_msg")

        /* renamed from: j */
        public String f28655j;
        @C6593c(mo15949a = "pkg_version")

        /* renamed from: k */
        public Long f28656k;
        @C6593c(mo15949a = "online_duration")

        /* renamed from: l */
        public Long f28657l;
        @C6593c(mo15949a = "res_root_dir")

        /* renamed from: m */
        public String f28658m;
        @C6593c(mo15949a = "log_id")

        /* renamed from: n */
        public String f28659n;

        /* renamed from: o */
        public Long f28660o = Long.valueOf(SystemClock.uptimeMillis());
        @C6593c(mo15949a = "page_url")

        /* renamed from: p */
        public String f28661p;

        /* renamed from: a */
        public final void mo25610a(String str) {
            if (str != null) {
                if (str.contains("??")) {
                    this.f28646a = str;
                    return;
                }
                try {
                    Uri parse = Uri.parse(str);
                    StringBuilder sb = new StringBuilder();
                    sb.append(parse.getScheme());
                    sb.append("://");
                    sb.append(parse.getHost());
                    sb.append(parse.getPath());
                    this.f28646a = sb.toString();
                } catch (Exception unused) {
                    this.f28646a = str;
                }
            }
        }

        /* renamed from: a */
        public final void mo25612a(boolean z) {
            if (z) {
                this.f28651f = Long.valueOf(SystemClock.uptimeMillis() - this.f28660o.longValue());
                this.f28650e = Integer.valueOf(1);
                return;
            }
            this.f28650e = Integer.valueOf(0);
        }

        /* renamed from: a */
        public final void mo25611a(String str, String str2) {
            if (str != null && str2 != null) {
                if (str.endsWith("/")) {
                    str = str.substring(0, str.length() - 1);
                }
                this.f28649d = C10702a.m31263a(str2);
                int lastIndexOf = str.lastIndexOf("/");
                if (lastIndexOf != -1) {
                    this.f28647b = str.substring(lastIndexOf + 1);
                }
                int indexOf = str2.indexOf("/");
                if (indexOf != -1) {
                    this.f28648c = str2.substring(0, indexOf);
                }
            }
        }
    }
}
