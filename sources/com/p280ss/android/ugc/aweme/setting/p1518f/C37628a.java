package com.p280ss.android.ugc.aweme.setting.p1518f;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.f.a */
public final class C37628a {

    /* renamed from: a */
    private static String f98097a = C6399b.m19921a().getString(R.string.dks);

    /* renamed from: b */
    private static String f98098b = C6399b.m19921a().getString(R.string.dkt);

    /* renamed from: c */
    private static C37630b f98099c = null;

    /* renamed from: com.ss.android.ugc.aweme.setting.f.a$a */
    public interface C37629a {
        /* renamed from: a */
        void mo60387a(String str);

        /* renamed from: b */
        void mo60388b(String str);
    }

    /* renamed from: a */
    public static void m120432a(C37630b bVar) {
        if (bVar != null) {
            f98099c = bVar;
            try {
                C37629a aVar = (C37629a) C23336d.m76560a(C6399b.m19921a(), C37629a.class);
                if (!TextUtils.isEmpty(bVar.f98100a)) {
                    if (!TextUtils.isEmpty(bVar.f98101b)) {
                        aVar.mo60387a(bVar.f98100a);
                        aVar.mo60388b(bVar.f98101b);
                    }
                }
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("HateFulPreferences getSP failed ");
                sb.append(th.getMessage());
                C42880h.m136156a(sb.toString());
            }
        }
    }
}
