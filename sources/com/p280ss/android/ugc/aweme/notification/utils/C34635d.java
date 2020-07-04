package com.p280ss.android.ugc.aweme.notification.utils;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.d */
public final class C34635d {
    /* renamed from: a */
    public static final String m111891a(Comment comment) {
        boolean z;
        C7573i.m23587b(comment, "$this$getForwardText");
        if (TextUtils.isEmpty(comment.getForwardId())) {
            String text = comment.getText();
            C7573i.m23582a((Object) text, "text");
            return text;
        }
        String string = C6399b.m19921a().getString(R.string.b9u);
        CharSequence text2 = comment.getText();
        if (text2 == null || text2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(" • ");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(comment.getText());
        return sb2.toString();
    }
}
