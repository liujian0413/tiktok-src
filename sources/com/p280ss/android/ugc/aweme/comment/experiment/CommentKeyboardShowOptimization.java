package com.p280ss.android.ugc.aweme.comment.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "comment_keyboard_show_optimization")
/* renamed from: com.ss.android.ugc.aweme.comment.experiment.CommentKeyboardShowOptimization */
public final class CommentKeyboardShowOptimization {
    @C6382b(mo15285a = true)
    private static final int DISABLED = 0;
    public static final CommentKeyboardShowOptimization INSTANCE = new CommentKeyboardShowOptimization();
    @C6382b
    private static final int SHOW_IF_FROM_NOTIFICATION = 1;
    @C6382b
    private static final int SHOW_IF_WITHOUT_COMMENT = 2;

    private CommentKeyboardShowOptimization() {
    }

    public static final boolean showIfFromNotification() {
        if (C6384b.m19835a().mo15287a(CommentKeyboardShowOptimization.class, true, "comment_keyboard_show_optimization", C6384b.m19835a().mo15295d().comment_keyboard_show_optimization, 0) == 1) {
            return true;
        }
        return false;
    }

    public static final boolean showIfWithoutComment() {
        if (C6384b.m19835a().mo15287a(CommentKeyboardShowOptimization.class, true, "comment_keyboard_show_optimization", C6384b.m19835a().mo15295d().comment_keyboard_show_optimization, 0) == 2) {
            return true;
        }
        return false;
    }
}
