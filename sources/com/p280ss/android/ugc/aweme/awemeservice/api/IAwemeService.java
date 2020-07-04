package com.p280ss.android.ugc.aweme.awemeservice.api;

import com.bytedance.jedi.model.p599a.C11750c;
import com.bytedance.jedi.model.p601c.C11786e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Pair;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.api.IAwemeService */
public interface IAwemeService {
    void clearCache();

    Aweme getAwemeById(String str);

    C11750c<String, Aweme> getAwemeCache();

    Aweme getProfileSelfSeeAweme(String str);

    Aweme getProfileSelfSeeAweme(String str, int i);

    Aweme getRawAdAwemeByAdId(String str);

    Aweme getRawAdAwemeById(String str);

    void increaseCommentCount(String str);

    C7492s<C11786e<Aweme>> observeAwemeById(String str);

    C7492s<List<Pair<String, Aweme>>> observeAwemes();

    void setFeedCount(long j);

    Aweme updateAweme(Aweme aweme);

    void updateCollectStatus(String str, int i);

    void updateCommentCount(String str, int i);

    void updateCommentSetting(Aweme aweme, int i);

    void updatePreventDownloadType(Aweme aweme, int i);

    Aweme updateProfileSelfSeeAweme(Aweme aweme, int i);

    void updatePublishAwemePromotions(String str, String str2);

    Aweme updateRawAdAweme(Aweme aweme);

    void updateUserDigg(String str, int i);
}
