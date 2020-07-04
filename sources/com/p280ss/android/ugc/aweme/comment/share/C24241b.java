package com.p280ss.android.ugc.aweme.comment.share;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.comment.share.b */
public final class C24241b {
    /* renamed from: b */
    public static boolean m79618b(Context context) {
        return context instanceof I18nCommentShareActivity;
    }

    /* renamed from: a */
    public static File m79616a(Context context) {
        if (context instanceof I18nCommentShareActivity) {
            return ((I18nCommentShareActivity) context).mo63128t();
        }
        return null;
    }

    /* renamed from: a */
    public static void m79617a(Activity activity, Aweme aweme, Comment comment, int i, String str) {
        I18nCommentShareActivity.m79606a(activity, aweme, comment, i, str);
    }
}
