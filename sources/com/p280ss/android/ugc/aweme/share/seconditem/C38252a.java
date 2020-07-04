package com.p280ss.android.ugc.aweme.share.seconditem;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.share.seconditem.a */
public final class C38252a {
    /* renamed from: a */
    private static boolean m122198a(ClipData clipData) {
        if (clipData == null || clipData.getItemAt(0) == null || clipData.getItemAt(0).getText() == null || TextUtils.isEmpty(clipData.getItemAt(0).getText().toString())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m122197a(List<Aweme> list) {
        try {
            if (C7163a.m22363a()) {
                Activity g = C6405d.m19984g();
                ClipboardManager clipboardManager = (ClipboardManager) g.getSystemService("clipboard");
                if (clipboardManager != null) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (m122198a(primaryClip)) {
                        Aweme aweme = (Aweme) new C6600e().mo15974a(primaryClip.getItemAt(0).getText().toString(), Aweme.class);
                        if (aweme != null && C25329c.m83221d(aweme) && !C6307b.m19566a((Collection<T>) list) && C28482e.m93604a(list, aweme) != 0) {
                            list.add(0, aweme);
                            C10761a.m31383a((Context) g, (int) R.string.ahf).mo25750a();
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
