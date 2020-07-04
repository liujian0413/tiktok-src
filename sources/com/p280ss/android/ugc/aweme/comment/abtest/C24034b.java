package com.p280ss.android.ugc.aweme.comment.abtest;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.comment.experiment.CommentLikedByCreatorExperiment;
import com.p280ss.android.ugc.aweme.comment.model.Comment;

/* renamed from: com.ss.android.ugc.aweme.comment.abtest.b */
public final class C24034b {
    /* renamed from: a */
    public static void m78869a(Comment comment, String str) {
        boolean z = false;
        if (comment.getUserDigged() == 1) {
            comment.setUserDigged(0);
            comment.setDiggCount(comment.getDiggCount() - 1);
        } else {
            comment.setUserDigged(1);
            comment.setDiggCount(comment.getDiggCount() + 1);
        }
        if (C6384b.m19835a().mo15292a(CommentLikedByCreatorExperiment.class, true, "enable_like_by_author", C6384b.m19835a().mo15295d().enable_like_by_author, false) && TextUtils.equals(str, C6861a.m21337f().getCurUserId()) && comment.getLabelType() != 1) {
            if (comment.getUserDigged() == 1) {
                z = true;
            }
            comment.setAuthorDigged(z);
        }
    }
}
