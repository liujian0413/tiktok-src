package com.p280ss.android.ugc.aweme.comment.abtest;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "direct_show_comment_mention_list")
/* renamed from: com.ss.android.ugc.aweme.comment.abtest.DouyinDirectShowCommentMentionList */
public final class DouyinDirectShowCommentMentionList {
    @C6382b(mo15285a = true)
    private static final int DISABLED = 0;
    @C6382b
    private static final int ENABLED_WITHOUT_IM_TAG = 1;
    @C6382b
    private static final int ENABLED_WITH_IM_TAG = 2;
    public static final DouyinDirectShowCommentMentionList INSTANCE = new DouyinDirectShowCommentMentionList();

    private DouyinDirectShowCommentMentionList() {
    }

    public static final boolean isEnabled() {
        int value = INSTANCE.getValue();
        if (value == 1 || value == 2) {
            return true;
        }
        return false;
    }

    public static final boolean withImTag() {
        if (INSTANCE.getValue() == 2) {
            return true;
        }
        return false;
    }

    private final int getValue() {
        return C6384b.m19835a().mo15287a(DouyinDirectShowCommentMentionList.class, true, "direct_show_comment_mention_list", C6384b.m19835a().mo15295d().direct_show_comment_mention_list, 0);
    }
}
