package com.bytedance.crash.nativecrash;

import com.bytedance.crash.C9875d;
import com.bytedance.crash.p504l.C9984i;
import com.bytedance.crash.p504l.C9992m;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

/* renamed from: com.bytedance.crash.nativecrash.b */
public final class C10007b {

    /* renamed from: a */
    public HashMap<String, String> f27246a;

    public C10007b(File file) {
        File b = C9992m.m29596b(file);
        if (b.exists() && b.length() != 0) {
            this.f27246a = new HashMap<>();
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(b));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            C9984i.m29565a((Closeable) bufferedReader2);
                            return;
                        } else if (readLine.length() > 25 && readLine.substring(25).startsWith("[FUNNEL]:")) {
                            String[] split = readLine.substring(34).split(" ");
                            if (split.length >= 2) {
                                this.f27246a.put(split[0], split[1]);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        C9984i.m29565a((Closeable) bufferedReader2);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                C9875d.m29130a().mo24453a("NPTH_CATCH", th);
                C9984i.m29565a((Closeable) bufferedReader);
            }
        }
    }
}
