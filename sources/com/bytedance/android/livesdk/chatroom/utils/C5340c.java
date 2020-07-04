package com.bytedance.android.livesdk.chatroom.utils;

import android.app.Dialog;
import android.content.Context;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.widget.C9245h;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.p524g.p525a.C10249a;
import com.bytedance.p524g.p525a.C10249a.C10251a;
import com.bytedance.p524g.p525a.C10249a.C10253c;
import com.bytedance.p524g.p525a.C10268c;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdk.chatroom.utils.c */
public final class C5340c {

    /* renamed from: a */
    public static WeakReference<C9245h> f15615a;

    /* renamed from: b */
    private static final String[] f15616b = {"df_live_zego_link", "df_live_byte_link"};

    /* renamed from: c */
    private static final String[] f15617c = {"bytertc", "zegoliveroom"};

    /* renamed from: b */
    public static void m17019b(Context context) {
        C10268c.m30420a(m17022e(context));
    }

    /* renamed from: c */
    public static boolean m17020c(Context context) {
        if (m17018a(context)) {
            return m17023f(context);
        }
        m17019b(context);
        return false;
    }

    /* renamed from: a */
    public static boolean m17018a(Context context) {
        Boolean bool = (Boolean) LiveConfigSettingKeys.LIVE_TEST_SKIP_LINK_MIC_BUNDLE_CHECK.mo10240a();
        if (bool == null || !bool.booleanValue()) {
            return C10268c.m30422b(m17022e(context));
        }
        return true;
    }

    /* renamed from: d */
    private static C10253c m17021d(Context context) {
        f15615a = new WeakReference<>(new C9249a(context, 2).mo22720b());
        return new C10253c() {
            /* renamed from: a */
            public final void mo13634a() {
                Dialog dialog = (Dialog) C5340c.f15615a.get();
                if (dialog != null) {
                    dialog.show();
                }
            }

            /* renamed from: b */
            public final void mo13635b() {
                Dialog dialog = (Dialog) C5340c.f15615a.get();
                if (dialog != null) {
                    C5342d.m17027a(dialog);
                }
            }

            /* renamed from: c */
            public final boolean mo13636c() {
                Dialog dialog = (Dialog) C5340c.f15615a.get();
                if (dialog != null) {
                    return dialog.isShowing();
                }
                return false;
            }
        };
    }

    /* renamed from: f */
    private static boolean m17023f(Context context) {
        String[] strArr = f15617c;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                C10268c.m30419a(context, strArr[i], 2);
                i++;
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private static C10249a m17022e(Context context) {
        C10251a aVar = new C10251a();
        for (String a : f15616b) {
            aVar.mo24980a(a);
        }
        aVar.mo24978a(context);
        aVar.mo24977a(2);
        aVar.mo24979a(m17021d(context));
        return aVar.mo24981a();
    }
}
