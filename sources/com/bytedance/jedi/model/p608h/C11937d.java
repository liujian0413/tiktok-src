package com.bytedance.jedi.model.p608h;

import android.os.Handler;
import android.os.Looper;
import com.C1642a;
import com.p049a.p050a.C1645c;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* renamed from: com.bytedance.jedi.model.h.d */
public final class C11937d implements C1645c {

    /* renamed from: a */
    private final Handler f31815a;

    /* renamed from: com.bytedance.jedi.model.h.d$a */
    static class C11938a extends Handler {

        /* renamed from: a */
        private final String f31816a;

        /* renamed from: b */
        private final int f31817b;

        /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[SYNTHETIC, Splitter:B:10:0x001f] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r4) {
            /*
                r3 = this;
                java.lang.Object r4 = r4.obj
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r0 = r3.f31816a
                java.lang.String r1 = "logs"
                java.io.File r0 = r3.m34981a(r0, r1)
                java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x001c }
                r2 = 1
                r1.<init>(r0, r2)     // Catch:{ IOException -> 0x001c }
                m34982a(r1, r4)     // Catch:{ IOException -> 0x001d }
                r1.flush()     // Catch:{ IOException -> 0x001d }
                r1.close()     // Catch:{ IOException -> 0x001d }
                return
            L_0x001c:
                r1 = 0
            L_0x001d:
                if (r1 == 0) goto L_0x0026
                r1.flush()     // Catch:{ IOException -> 0x0026 }
                r1.close()     // Catch:{ IOException -> 0x0026 }
                return
            L_0x0026:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.model.p608h.C11937d.C11938a.handleMessage(android.os.Message):void");
        }

        /* renamed from: a */
        private static void m34982a(FileWriter fileWriter, String str) throws IOException {
            fileWriter.append(str);
        }

        /* renamed from: a */
        private File m34981a(String str, String str2) {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = null;
            File file3 = new File(file, C1642a.m8034a("%s_%s.log", new Object[]{str2, Integer.valueOf(0)}));
            int i = 0;
            while (file3.exists()) {
                i++;
                File file4 = new File(file, C1642a.m8034a("%s_%s.log", new Object[]{str2, Integer.valueOf(i)}));
                file2 = file3;
                file3 = file4;
            }
            if (file2 == null || file2.length() >= ((long) this.f31817b)) {
                return file3;
            }
            return file2;
        }

        C11938a(Looper looper, String str, int i) {
            super(looper);
            this.f31816a = str;
            this.f31817b = i;
        }
    }

    public C11937d(Handler handler) {
        this.f31815a = handler;
    }

    /* renamed from: a */
    public final void mo7035a(int i, String str, String str2) {
        this.f31815a.sendMessage(this.f31815a.obtainMessage(i, str2));
    }
}
