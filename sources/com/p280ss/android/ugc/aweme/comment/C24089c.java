package com.p280ss.android.ugc.aweme.comment;

import com.p280ss.android.ugc.aweme.feed.model.CommentEggDataManager;

/* renamed from: com.ss.android.ugc.aweme.comment.c */
public final class C24089c implements C24216s {
    /* renamed from: a */
    public final void mo62441a(String str) {
        CommentEggDataManager.deleteCommentEggGroup(str);
    }

    /* renamed from: a */
    public final String mo62440a(String str, String str2) {
        return CommentEggDataManager.getHint(str, str2);
    }
}
