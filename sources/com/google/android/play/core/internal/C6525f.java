package com.google.android.play.core.internal;

import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.C1642a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: com.google.android.play.core.internal.f */
public final class C6525f {

    /* renamed from: a */
    private final String f18842a;

    public C6525f(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(str);
        this.f18842a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    private int m20283a(int i, String str, Object[] objArr) {
        if (Log.isLoggable("PlayCore", i)) {
            return Log.i("PlayCore", m20285a(this.f18842a, str, objArr));
        }
        return 0;
    }

    /* renamed from: a */
    public static C6526g m20284a() {
        if (VERSION.SDK_INT >= 23 && VERSION.PREVIEW_SDK_INT != 0) {
            switch (VERSION.SDK_INT) {
                case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                    return new C6544y();
                case 28:
                    return new C6543x();
            }
        }
        if (VERSION.SDK_INT >= 21) {
            switch (VERSION.SDK_INT) {
                case 21:
                    return new C6528i();
                case 22:
                    return new C6531l();
                case 23:
                    return new C6534o();
                case 24:
                    return new C6538s();
                case 25:
                    return new C6537r();
                case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                    return new C6540u();
                case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                    return new C6541v();
                case 28:
                    if (!VERSION.CODENAME.equalsIgnoreCase("Q")) {
                        return new C6544y();
                    }
                    break;
            }
            return new C6543x();
        }
        throw new AssertionError("Unsupported Android Version");
    }

    /* renamed from: a */
    private static String m20285a(String str, String str2, Object... objArr) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" : ");
        sb.append(str2);
        String sb2 = sb.toString();
        if (objArr == null || objArr.length <= 0) {
            return sb2;
        }
        try {
            return C1642a.m8035a(Locale.US, sb2, objArr);
        } catch (IllegalFormatException unused) {
            String str3 = "Unable to format ";
            String valueOf = String.valueOf(sb2);
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                new String(str3);
            }
            String valueOf2 = String.valueOf(sb2);
            String join = TextUtils.join(", ", objArr);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 3 + String.valueOf(join).length());
            sb3.append(valueOf2);
            sb3.append(" [");
            sb3.append(join);
            sb3.append("]");
            return sb3.toString();
        }
    }

    /* renamed from: a */
    public final int mo15889a(String str, Object... objArr) {
        return m20283a(4, str, objArr);
    }

    /* renamed from: a */
    public final int mo15890a(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m20285a(this.f18842a, str, objArr), th);
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo15891b(String str, Object... objArr) {
        return m20283a(3, str, objArr);
    }

    /* renamed from: c */
    public final int mo15892c(String str, Object... objArr) {
        return m20283a(5, str, objArr);
    }

    /* renamed from: d */
    public final int mo15893d(String str, Object... objArr) {
        return m20283a(6, str, objArr);
    }
}
