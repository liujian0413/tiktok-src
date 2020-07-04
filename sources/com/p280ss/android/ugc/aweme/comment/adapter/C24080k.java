package com.p280ss.android.ugc.aweme.comment.adapter;

import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import kotlin.jvm.internal.C7573i;
import kotlin.p1878b.C47891a;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.k */
public final class C24080k {
    /* renamed from: a */
    public static final int[] m79003a(UrlModel urlModel) {
        C7573i.m23587b(urlModel, "$this$thumbnailDisplaySize");
        int b = (int) C9738o.m28708b(C6399b.m19921a(), 60.0f);
        if (urlModel.getWidth() == 0 || urlModel.getHeight() == 0) {
            return new int[]{b, b};
        }
        return new int[]{Math.min(C47891a.m148821a((((float) urlModel.getWidth()) / ((float) urlModel.getHeight())) * ((float) b)), (int) C9738o.m28708b(C6399b.m19921a(), 107.0f)), b};
    }

    /* renamed from: a */
    public static final int[] m79004a(Emoji emoji) {
        C7573i.m23587b(emoji, "$this$thumbnailDisplaySize");
        int b = (int) C9738o.m28708b(C6399b.m19921a(), 60.0f);
        if (emoji.getWidth() == 0 || emoji.getHeight() == 0) {
            return new int[]{b, b};
        }
        return new int[]{Math.min((emoji.getWidth() / emoji.getHeight()) * b, (int) C9738o.m28708b(C6399b.m19921a(), 107.0f)), b};
    }
}
