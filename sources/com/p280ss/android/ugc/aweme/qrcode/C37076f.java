package com.p280ss.android.ugc.aweme.qrcode;

import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.p482io.FileUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.qrcode.f */
public final class C37076f {
    /* renamed from: a */
    public static File m119210a() {
        return m119211a(0);
    }

    /* renamed from: b */
    public static boolean m119217b() {
        return m119219c(0);
    }

    /* renamed from: c */
    public static void m119218c() {
        m119221d(0);
        m119221d(1);
    }

    /* renamed from: d */
    private static String m119220d() {
        File externalFilesDir = C6399b.m19921a().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        C7276d.m22805a(externalFilesDir);
        return externalFilesDir.getAbsolutePath();
    }

    /* renamed from: a */
    static final /* synthetic */ Object m119212a(File file) throws Exception {
        try {
            file.delete();
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static File m119211a(int i) {
        String d = m119220d();
        if (!TextUtils.isEmpty(d)) {
            File file = new File(d, m119215b(i));
            if (file.exists()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static String m119215b(int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(C21115b.m71197a().getCurUserId());
        if (i == 1) {
            str = "_qrcode_image_cache_for_invite";
        } else {
            str = "_qrcode_image_cache";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    private static boolean m119219c(int i) {
        if (m119211a(i) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static void m119221d(int i) {
        if (m119219c(i)) {
            File a = m119211a(i);
            if (a != null && a.exists()) {
                C1592h.m7853a((Callable<TResult>) new C37078h<TResult>(a));
            }
        }
    }

    /* renamed from: a */
    public static void m119214a(String str) {
        m119216b(str, 0);
    }

    /* renamed from: b */
    private static void m119216b(String str, int i) {
        C1592h.m7853a((Callable<TResult>) new C37077g<TResult>(str, 0));
    }

    /* renamed from: a */
    static final /* synthetic */ Object m119213a(String str, int i) throws Exception {
        String a = C23323e.m76498a(C6399b.m19921a(), str);
        String d = m119220d();
        if (!TextUtils.isEmpty(d) && !TextUtils.isEmpty(a)) {
            FileUtils.m28675a(a, d, m119215b(i));
        }
        return null;
    }
}
