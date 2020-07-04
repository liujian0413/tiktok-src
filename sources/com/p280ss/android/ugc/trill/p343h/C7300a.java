package com.p280ss.android.ugc.trill.p343h;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.WebView;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* renamed from: com.ss.android.ugc.trill.h.a */
public final class C7300a {
    /* renamed from: a */
    private static void m22872a(Context context) {
        String c = C6776h.m20949c(context);
        m22873a(c);
        try {
            WebView.setDataDirectorySuffix(c);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("setDataDirectorySuffix error:");
            sb.append(e.getMessage());
            C6877n.m21447a("web_view_set_directory_error", C6869c.m21381a().mo16885a("errorCode", Integer.valueOf(4001)).mo16887a("errorDesc", sb.toString()).mo16887a("processName", c).mo16888b());
        }
    }

    /* renamed from: a */
    private static void m22873a(String str) {
        if (str == null) {
            C6877n.m21447a("web_view_set_directory_error", C6869c.m21381a().mo16885a("errorCode", Integer.valueOf(4002)).mo16887a("errorDesc", "processName == null").mo16888b());
        }
        if (TextUtils.equals("", str)) {
            C6877n.m21447a("web_view_set_directory_error", C6869c.m21381a().mo16885a("errorCode", Integer.valueOf(4003)).mo16887a("errorDesc", "processName is empty").mo16888b());
        }
    }

    /* renamed from: b */
    private static void m22876b(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getDataDir().getAbsolutePath());
        sb.append("/app_webview/webview_data.lock");
        File file = new File(sb.toString());
        if (file.exists()) {
            try {
                FileLock tryLock = new RandomAccessFile(file, "rw").getChannel().tryLock();
                if (tryLock != null) {
                    tryLock.close();
                    return;
                }
                boolean delete = file.delete();
                boolean a = m22875a(file, delete);
                StringBuilder sb2 = new StringBuilder("web_view.lock locked, need delete:");
                sb2.append(delete);
                sb2.append(" isCreateNew:");
                sb2.append(a);
                C6877n.m21447a("web_view_set_directory_error", C6869c.m21381a().mo16885a("errorCode", Integer.valueOf(4005)).mo16887a("errorDesc", sb2.toString()).mo16888b());
            } catch (Exception e) {
                boolean z = false;
                if (file.exists()) {
                    z = file.delete();
                }
                boolean a2 = m22875a(file, z);
                StringBuilder sb3 = new StringBuilder("web_view.lock locked, need delete:");
                sb3.append(z);
                sb3.append(" isCreateNew:");
                sb3.append(a2);
                sb3.append(" e:");
                sb3.append(e.getMessage());
                C6877n.m21447a("web_view_set_directory_error", C6869c.m21381a().mo16885a("errorCode", Integer.valueOf(4004)).mo16887a("errorDesc", sb3.toString()).mo16888b());
            }
        }
    }

    /* renamed from: a */
    public static void m22874a(boolean z, Context context) {
        if (VERSION.SDK_INT >= 28) {
            if (z) {
                m22876b(context);
                return;
            }
            m22872a(context);
        }
    }

    /* renamed from: a */
    private static boolean m22875a(File file, boolean z) {
        if (z && !file.exists()) {
            try {
                return file.createNewFile();
            } catch (IOException unused) {
            }
        }
        return false;
    }
}
