package com.p280ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.al */
public interface C24718al {
    /* renamed from: a */
    long mo64654a(AwemeRawAd awemeRawAd);

    /* renamed from: a */
    JSONObject mo64655a(Context context, JSONObject jSONObject, String str) throws JSONException;

    /* renamed from: a */
    void mo64656a(Context context, Aweme aweme);

    /* renamed from: a */
    void mo64657a(Context context, Aweme aweme, int i);

    /* renamed from: a */
    void mo64658a(Context context, Aweme aweme, FollowStatus followStatus);

    /* renamed from: a */
    void mo64659a(Context context, Aweme aweme, String str);

    /* renamed from: a */
    void mo64660a(Context context, Aweme aweme, JSONObject jSONObject);

    /* renamed from: a */
    void mo64661a(Context context, AwemeRawAd awemeRawAd, String str);

    /* renamed from: a */
    void mo64662a(Context context, String str, Aweme aweme);

    /* renamed from: a */
    void mo64663a(Context context, String str, String str2, String str3);

    /* renamed from: a */
    void mo64664a(Context context, String str, String str2, String str3, String str4, String str5);

    /* renamed from: a */
    void mo64665a(Context context, String str, String str2, JSONObject jSONObject, String str3, long j);

    /* renamed from: a */
    void mo64666a(C24939aj ajVar, Collection<String> collection, boolean z);

    /* renamed from: a */
    void mo64667a(Aweme aweme);

    /* renamed from: b */
    void mo64668b(Context context, Aweme aweme);

    /* renamed from: b */
    void mo64669b(Context context, Aweme aweme, FollowStatus followStatus);

    /* renamed from: b */
    void mo64670b(Context context, Aweme aweme, String str);

    /* renamed from: c */
    void mo64671c(Context context, Aweme aweme);

    /* renamed from: c */
    void mo64672c(Context context, Aweme aweme, String str);

    /* renamed from: d */
    void mo64673d(Context context, Aweme aweme);

    /* renamed from: e */
    void mo64674e(Context context, Aweme aweme);

    /* renamed from: f */
    void mo64675f(Context context, Aweme aweme);

    /* renamed from: g */
    void mo64676g(Context context, Aweme aweme);

    /* renamed from: h */
    void mo64677h(Context context, Aweme aweme);

    /* renamed from: i */
    void mo64678i(Context context, Aweme aweme);

    /* renamed from: j */
    void mo64679j(Context context, Aweme aweme);

    /* renamed from: k */
    void mo64680k(Context context, Aweme aweme);

    /* renamed from: l */
    void mo64681l(Context context, Aweme aweme);
}
