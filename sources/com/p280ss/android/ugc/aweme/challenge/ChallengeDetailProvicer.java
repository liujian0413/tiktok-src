package com.p280ss.android.ugc.aweme.challenge;

import android.view.View;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.C23800o;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.ChallengeDetailFragment;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23773g;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23784i;
import com.p280ss.android.ugc.aweme.challenge.service.C23701a;
import com.p280ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider;

/* renamed from: com.ss.android.ugc.aweme.challenge.ChallengeDetailProvicer */
public class ChallengeDetailProvicer implements IChallengeDetailProvider {
    public C23784i createCommerceHeaderDelegate() {
        return new C23773g();
    }

    public C23701a createCommerceDelegate(View view, ChallengeDetailFragment challengeDetailFragment) {
        return new C23800o(view, challengeDetailFragment);
    }
}
