package com.p280ss.android.p817ad.splash.p836g;

import android.text.TextUtils;
import com.p280ss.android.p817ad.splash.core.C19025f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.ss.android.ad.splash.g.l */
public final class C19134l {

    /* renamed from: a */
    private static volatile SimpleDateFormat f51728a;

    /* renamed from: a */
    public static String m62741a() {
        if (f51728a == null) {
            f51728a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        }
        return f51728a.format(new Date());
    }

    /* renamed from: a */
    public static void m62742a(final String str) {
        if (C19025f.m62158e()) {
            C19025f.m62089C().execute(new Runnable() {
                public final void run() {
                    String E = C19025f.m62091E();
                    if (!TextUtils.isEmpty(E)) {
                        File file = new File(E);
                        try {
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append(E);
                            sb.append("errorInfo.txt");
                            String sb2 = sb.toString();
                            File file2 = new File(sb2);
                            if (!file2.exists()) {
                                file2.createNewFile();
                            }
                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(sb2, true), "utf-8");
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(C19134l.m62741a());
                            sb3.append(" ");
                            sb3.append(str);
                            sb3.append("\r\n");
                            outputStreamWriter.write(sb3.toString());
                            outputStreamWriter.close();
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }
}
