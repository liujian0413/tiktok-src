package com.p280ss.android.ugc.aweme.awemeservice;

import com.bytedance.jedi.model.p599a.C11750c;
import com.bytedance.jedi.model.p601c.C11786e;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.p1047b.C23134a;
import com.p280ss.android.ugc.aweme.awemeservice.p1047b.C23135b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Pair;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.d */
public final class C23137d implements IAwemeService {
    public final C11750c<String, Aweme> getAwemeCache() {
        return C23134a.f61064a;
    }

    public final void clearCache() {
        C23133b.m76028a().mo60277b();
    }

    public final C7492s<List<Pair<String, Aweme>>> observeAwemes() {
        return C23135b.m76054b();
    }

    public final void increaseCommentCount(String str) {
        C23133b.m76028a().mo60280c(str);
    }

    public final C7492s<C11786e<Aweme>> observeAwemeById(String str) {
        return C23135b.m76052a(str);
    }

    public final void setFeedCount(long j) {
        C23133b.m76028a().mo60274a(j);
    }

    public final Aweme getAwemeById(String str) {
        return C23133b.m76028a().mo60276b(str);
    }

    public final Aweme getProfileSelfSeeAweme(String str) {
        return C23133b.m76028a().mo60272a(str);
    }

    public final Aweme getRawAdAwemeByAdId(String str) {
        return C23114a.m75956a().mo60229b(str);
    }

    public final Aweme getRawAdAwemeById(String str) {
        return C23114a.m75956a().mo60227a(str);
    }

    public final Aweme updateAweme(Aweme aweme) {
        return C23133b.m76028a().mo60270a(aweme);
    }

    public final Aweme updateRawAdAweme(Aweme aweme) {
        return C23114a.m75956a().mo60226a(aweme);
    }

    public final void updateCollectStatus(String str, int i) {
        C23133b.m76028a().mo60282d(str, i);
    }

    public final void updateCommentCount(String str, int i) {
        C23133b.m76028a().mo60278b(str, i);
    }

    public final void updateCommentSetting(Aweme aweme, int i) {
        C23133b.m76028a();
        C23133b.m76030b(aweme, i);
    }

    public final void updatePreventDownloadType(Aweme aweme, int i) {
        C23133b.m76028a();
        C23133b.m76032c(aweme, i);
    }

    public final void updatePublishAwemePromotions(String str, String str2) {
        C23133b.m76028a().mo60275a(str, str2);
    }

    public final void updateUserDigg(String str, int i) {
        C23133b.m76028a().mo60281c(str, i);
    }

    public final Aweme updateProfileSelfSeeAweme(Aweme aweme, int i) {
        return C23133b.m76028a().mo60271a(aweme, i);
    }

    public final Aweme getProfileSelfSeeAweme(String str, int i) {
        return C23133b.m76028a().mo60273a(str, i);
    }
}
