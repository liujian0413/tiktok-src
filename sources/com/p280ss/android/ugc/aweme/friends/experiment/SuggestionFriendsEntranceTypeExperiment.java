package com.p280ss.android.ugc.aweme.friends.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "suggestion_friends_entrance_type")
/* renamed from: com.ss.android.ugc.aweme.friends.experiment.SuggestionFriendsEntranceTypeExperiment */
public final class SuggestionFriendsEntranceTypeExperiment {
    @C6382b(mo15285a = true)
    private static final int DEFAULT = 0;
    public static final SuggestionFriendsEntranceTypeExperiment INSTANCE = new SuggestionFriendsEntranceTypeExperiment();
    @C6382b
    private static final int TYPE_A = 1;
    @C6382b
    private static final int TYPE_B = 2;
    @C6382b
    private static final int TYPE_C = 3;

    private SuggestionFriendsEntranceTypeExperiment() {
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getTYPE_A() {
        return TYPE_A;
    }

    public final int getTYPE_B() {
        return TYPE_B;
    }

    public final int getTYPE_C() {
        return TYPE_C;
    }

    public static final boolean shouldShowInFeeds() {
        int a = C6384b.m19835a().mo15287a(SuggestionFriendsEntranceTypeExperiment.class, true, "suggestion_friends_entrance_type", C6384b.m19835a().mo15295d().suggestion_friends_entrance_type, 0);
        if (a == TYPE_B || a == TYPE_C) {
            return true;
        }
        return false;
    }

    public static final boolean shouldShowInSuggestion() {
        int a = C6384b.m19835a().mo15287a(SuggestionFriendsEntranceTypeExperiment.class, true, "suggestion_friends_entrance_type", C6384b.m19835a().mo15295d().suggestion_friends_entrance_type, 0);
        if (a == TYPE_A || a == TYPE_C) {
            return true;
        }
        return false;
    }
}
