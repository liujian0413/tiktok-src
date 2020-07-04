package com.p280ss.android.ugc.aweme.comment.abtest;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "mt_nested_comments_hide")
/* renamed from: com.ss.android.ugc.aweme.comment.abtest.MTNestedCommentsHideExperiment */
public final class MTNestedCommentsHideExperiment {
    @C6382b(mo15285a = true)
    private static final boolean DISABLE = false;
    @C6382b
    private static final boolean ENBALE = true;
    public static final MTNestedCommentsHideExperiment INSTANCE = new MTNestedCommentsHideExperiment();

    private MTNestedCommentsHideExperiment() {
    }

    public final boolean getDISABLE() {
        return DISABLE;
    }

    public final boolean getENBALE() {
        return ENBALE;
    }
}
