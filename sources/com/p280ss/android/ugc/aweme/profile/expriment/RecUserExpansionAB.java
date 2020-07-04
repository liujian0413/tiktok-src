package com.p280ss.android.ugc.aweme.profile.expriment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.ugc.appcontext.C6399b;

@C6381a(mo15284a = "rec_user_expansion")
/* renamed from: com.ss.android.ugc.aweme.profile.expriment.RecUserExpansionAB */
public final class RecUserExpansionAB {
    @C6382b
    public static final int ENABLE_ALL = 1;
    @C6382b
    public static final int ENABLE_FOLLOW_RELATION_REC = 2;
    @C6382b
    public static final int ENABLE_NOTICE_TAG = 3;
    @C6382b
    public static final int ENABLE_REC_USER_MOVE = 4;
    public static final RecUserExpansionAB INSTANCE = new RecUserExpansionAB();
    @C6382b(mo15285a = true)
    public static final int UNENBALE = 0;

    private RecUserExpansionAB() {
    }

    public final boolean enableRecUserMove() {
        if (!C6399b.m19944t()) {
            return true;
        }
        return false;
    }

    public final boolean enableFollowRelationRec() {
        if (C6399b.m19944t() || (C6384b.m19835a().mo15287a(RecUserExpansionAB.class, true, "rec_user_expansion", C6384b.m19835a().mo15295d().rec_user_expansion, 0) != 1 && C6384b.m19835a().mo15287a(RecUserExpansionAB.class, true, "rec_user_expansion", C6384b.m19835a().mo15295d().rec_user_expansion, 0) != 2)) {
            return false;
        }
        return true;
    }
}
