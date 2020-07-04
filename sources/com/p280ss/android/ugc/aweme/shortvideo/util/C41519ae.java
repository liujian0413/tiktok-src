package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ae */
public final class C41519ae {

    /* renamed from: a */
    public static final C41519ae f107980a = new C41519ae();

    private C41519ae() {
    }

    /* renamed from: a */
    public static void m132255a(MentionEditText mentionEditText) {
        if (mentionEditText != null) {
            mentionEditText.mo105254d();
        }
    }

    /* renamed from: a */
    public static void m132254a(Context context, MentionEditText mentionEditText, String str) {
        ArrayList arrayList;
        if (!TextUtils.isEmpty(str)) {
            if (mentionEditText != null) {
                arrayList = mentionEditText.getStarAtlasExtraList();
            } else {
                arrayList = null;
            }
            if (C6307b.m19566a((Collection<T>) arrayList)) {
                if (context != null) {
                    Resources resources = context.getResources();
                    if (resources != null) {
                        int color = resources.getColor(R.color.a3i);
                        if (mentionEditText != null) {
                            mentionEditText.setStarAtlasMentionTextColor(color);
                        }
                    }
                }
                if (mentionEditText != null) {
                    if (str == null) {
                        C7573i.m23580a();
                    }
                    mentionEditText.mo105249a(1, C7634n.m23711a(str, "#", "", false), "", true);
                }
            }
        }
    }
}
