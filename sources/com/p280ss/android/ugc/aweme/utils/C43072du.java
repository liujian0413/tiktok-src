package com.p280ss.android.ugc.aweme.utils;

import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29092a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.du */
public final class C43072du {

    /* renamed from: a */
    public static final C43072du f111674a = new C43072du();

    /* renamed from: b */
    private static boolean f111675b = true;

    /* renamed from: c */
    private static boolean f111676c = true;

    /* renamed from: d */
    private static boolean f111677d = true;

    private C43072du() {
    }

    /* renamed from: a */
    public static final void m136631a(String str, String str2) {
        m136634a(str, str2, null, null, 12, null);
    }

    /* renamed from: a */
    public static final void m136632a(String str, String str2, String str3) {
        m136634a(str, str2, str3, null, 8, null);
    }

    /* renamed from: a */
    public static boolean m136636a() {
        return f111675b;
    }

    /* renamed from: b */
    public static boolean m136640b() {
        return f111676c;
    }

    /* renamed from: c */
    public static boolean m136643c() {
        return f111677d;
    }

    /* renamed from: d */
    public static final void m136644d() {
        f111675b = true;
        f111676c = true;
        f111677d = true;
    }

    /* renamed from: e */
    public static final void m136646e() {
        f111675b = false;
        f111676c = false;
        f111677d = false;
    }

    /* renamed from: a */
    public static void m136635a(boolean z) {
        f111675b = false;
    }

    /* renamed from: b */
    public static void m136639b(boolean z) {
        f111676c = false;
    }

    /* renamed from: c */
    public static void m136642c(boolean z) {
        f111677d = false;
    }

    /* renamed from: a */
    public static final void m136630a(String str) {
        C7573i.m23587b(str, "type");
        m136645d(str);
    }

    /* renamed from: b */
    public static final void m136637b(String str) {
        C7573i.m23587b(str, "type");
        m136645d(str);
    }

    /* renamed from: c */
    public static final void m136641c(String str) {
        C7573i.m23587b(str, "type");
        m136645d(str);
    }

    /* renamed from: d */
    private static void m136645d(String str) {
        try {
            ((C29092a) ServiceManager.get().getService(C29092a.class)).mo74527a(str);
            StringBuilder sb = new StringBuilder("RuntimeBehaviorManager---> EventType : ");
            sb.append(str);
            C41530am.m132280a(sb.toString());
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static void m136638b(String str, String str2, String str3) {
        try {
            ((C29092a) ServiceManager.get().getService(C29092a.class)).mo74528a(str, str2);
            StringBuilder sb = new StringBuilder("RuntimeBehaviorManager---> EventType : ");
            sb.append(str);
            sb.append(" , code : ");
            sb.append(str2);
            sb.append(" , msg : ");
            sb.append(str3);
            C41530am.m132280a(sb.toString());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final void m136633a(String str, String str2, String str3, String str4) {
        boolean z;
        C7573i.m23587b(str, "type");
        C7573i.m23587b(str2, "code");
        C7573i.m23587b(str3, "msg");
        CharSequence charSequence = str4;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m136638b(str, str2, str3);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append('-');
        sb.append(str4);
        m136638b(str, sb.toString(), str3);
    }

    /* renamed from: a */
    public static /* synthetic */ void m136634a(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "-1";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        m136633a(str, str2, str3, str4);
    }
}
