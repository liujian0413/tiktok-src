package com.p280ss.android.ugc.aweme.flowfeed.p968a;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.feed.experiment.ShareButtonStyleExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.story.C41983b;
import com.p280ss.android.ugc.aweme.utils.C43013ch;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.a.a */
public final class C21740a {
    /* renamed from: i */
    public static void m72693i(Aweme aweme) {
        aweme.convertChallengeToHashTag();
    }

    /* renamed from: b */
    public static boolean m72685b(Aweme aweme) {
        if (C28482e.m93606a(aweme) || !C43168s.m136912d(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m72684a(User user) {
        if (user == null || !user.isLive() || !C41983b.m133444a() || user.isBlock()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m72686b(User user) {
        if (user == null || !TextUtils.equals(user.getUid(), C6861a.m21337f().getCurUser().getUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m72687c(Aweme aweme) {
        User author = aweme.getAuthor();
        if (author == null || !TextUtils.equals(author.getUid(), C6861a.m21337f().getCurUser().getUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m72683a(Aweme aweme) {
        if (aweme.getAuthor() == null || !aweme.getAuthor().isLive() || !C41983b.m133444a() || aweme.getAuthor().isBlock()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static String m72688d(Aweme aweme) {
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null && aweme.getAuthor() != null && statistics.getCommentCount() > 0) {
            return C30537o.m99738a((long) statistics.getCommentCount());
        }
        if (!C43013ch.m136514a()) {
            return "0";
        }
        return C6399b.m19921a().getString(R.string.a7h);
    }

    /* renamed from: e */
    public static String m72689e(Aweme aweme) {
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null && aweme.getAuthor() != null && statistics.getDiggCount() > 0) {
            return C30537o.m99738a((long) statistics.getDiggCount());
        }
        if (!C43013ch.m136514a()) {
            return "0";
        }
        return C6399b.m19921a().getString(R.string.apc);
    }

    /* renamed from: f */
    public static String m72690f(Aweme aweme) {
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null && aweme.getAuthor() != null && statistics.getShareCount() > 0) {
            return C30537o.m99738a((long) statistics.getShareCount());
        }
        if (!C43013ch.m136514a()) {
            return "0";
        }
        return C6399b.m19921a().getString(R.string.drz);
    }

    /* renamed from: g */
    public static String m72691g(Aweme aweme) {
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null && aweme.getAuthor() != null && statistics.getForwardCount() > 0) {
            return C30537o.m99738a((long) statistics.getForwardCount());
        }
        if (!C43013ch.m136514a()) {
            return "0";
        }
        return C6399b.m19921a().getString(R.string.b9u);
    }

    /* renamed from: h */
    public static int m72692h(Aweme aweme) {
        if (aweme.getStatistics() == null || aweme.getAuthor() == null || m72687c(aweme)) {
            return 1;
        }
        return C6384b.m19835a().mo15287a(ShareButtonStyleExperiment.class, true, "share_button_style", C6384b.m19835a().mo15295d().share_button_style, 0);
    }

    /* renamed from: j */
    public static boolean m72694j(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (aweme.getAwemeType() == 13 || aweme.getAwemeType() == 0 || aweme.getAwemeType() == 2 || aweme.getAwemeType() == 51 || aweme.getAwemeType() == 52 || aweme.getAwemeType() == 54 || aweme.getAwemeType() == 53 || aweme.getAwemeType() == 55 || aweme.getAwemeType() == 56) {
            return true;
        }
        return false;
    }
}
