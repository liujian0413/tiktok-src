package com.bytedance.crash.nativecrash;

import android.text.TextUtils;
import com.bytedance.crash.p504l.C9992m;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.crash.nativecrash.a */
public final class C10006a {

    /* renamed from: a */
    public Map<String, String> f27245a;

    /* renamed from: b */
    public final String mo24615b() {
        return (String) this.f27245a.get("signal_line");
    }

    /* renamed from: a */
    public final boolean mo24614a() {
        if (this.f27245a == null || this.f27245a.isEmpty() || TextUtils.isEmpty((CharSequence) this.f27245a.get("process_name")) || TextUtils.isEmpty((CharSequence) this.f27245a.get("crash_thread_name")) || TextUtils.isEmpty((CharSequence) this.f27245a.get("pid")) || TextUtils.isEmpty((CharSequence) this.f27245a.get("tid")) || TextUtils.isEmpty((CharSequence) this.f27245a.get("start_time")) || TextUtils.isEmpty((CharSequence) this.f27245a.get("crash_time")) || TextUtils.isEmpty((CharSequence) this.f27245a.get("signal_line"))) {
            return false;
        }
        return true;
    }

    public C10006a(File file) {
        File e = C9992m.m29606e(file);
        if (e.exists() && e.length() != 0) {
            String a = NativeImpl.m29678a(e.getAbsolutePath());
            if (a != null) {
                String[] split = a.split("\n");
                this.f27245a = new HashMap();
                for (String split2 : split) {
                    String[] split3 = split2.split("=");
                    if (split3.length == 2) {
                        this.f27245a.put(split3[0], split3[1]);
                    }
                }
            }
        }
    }
}
