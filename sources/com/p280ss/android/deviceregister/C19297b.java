package com.p280ss.android.deviceregister;

import com.bytedance.common.utility.C6319n;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.ss.android.deviceregister.b */
final class C19297b {

    /* renamed from: a */
    public final ArrayList<String> f52199a = new ArrayList<>();

    C19297b() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo51194a() {
        new Thread(new Runnable() {
            public final void run() {
                int i = 0;
                while (i < C19297b.this.f52199a.size()) {
                    try {
                        String[] strArr = {"openudid", "clientudid", "serial_number", "sim_serial_number", "udid", "device_id"};
                        for (int i2 = 0; i2 < 6; i2++) {
                            try {
                                C19297b.m63228a((String) C19297b.this.f52199a.get(i), strArr[i2]);
                            } catch (Exception unused) {
                            }
                        }
                        i++;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        }).start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo51195a(String str) {
        this.f52199a.add(str);
    }

    /* renamed from: a */
    public static void m63228a(String str, String str2) {
        if (!C6319n.m19593a(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            sb.append(str2);
            sb.append(".dat");
            File file = new File(sb.toString());
            if (file.exists()) {
                file.delete();
            }
        }
    }
}
