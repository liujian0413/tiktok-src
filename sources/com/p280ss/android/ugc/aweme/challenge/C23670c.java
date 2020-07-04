package com.p280ss.android.ugc.aweme.challenge;

import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.C21647ag;
import com.p280ss.android.ugc.aweme.discover.mob.C26807z;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.festival.christmas.C29135b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.HeaderDetailActivity;
import com.p280ss.android.ugc.aweme.share.C37982an;
import com.p280ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage;
import com.p280ss.android.ugc.aweme.utils.C42920ah;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.c */
public final class C23670c implements C21647ag {
    /* renamed from: a */
    public final void mo57877a(ImageView imageView) {
        C37982an.m121299a(imageView);
    }

    /* renamed from: a */
    public final void mo57873a(Activity activity, Bundle bundle) {
        HeaderDetailActivity.m116635a(activity, bundle);
    }

    /* renamed from: a */
    public final void mo57875a(Context context, String str) {
        C29135b.m95580a(context, str);
    }

    /* renamed from: a */
    public final void mo57878a(String str, String str2, String str3, boolean z) {
        C26807z.f70733a.mo68594b(str, str2, str3, z);
    }

    /* renamed from: a */
    public final void mo57874a(Activity activity, Challenge challenge, List<Aweme> list, String str, boolean z, String str2, String str3) {
        ChallengeSharePackage.f99319f.mo95769a(activity, challenge, list, str, z, str2, str3);
    }

    /* renamed from: a */
    public final void mo57876a(ViewGroup viewGroup, ImageView imageView, TextView textView, int i, int i2, boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
        C42920ah.m136265a(viewGroup, imageView, textView, i, i2, z, z2, animatorListenerAdapter);
    }
}
