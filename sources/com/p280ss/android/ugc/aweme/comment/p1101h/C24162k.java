package com.p280ss.android.ugc.aweme.comment.p1101h;

import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.h.k */
public final class C24162k implements NoticeCommentHelperService {
    public final String getDisplayText(Comment comment, boolean z) {
        C7573i.m23587b(comment, "comment");
        return C24148e.m79338a(comment, z, false, 2, null);
    }
}
