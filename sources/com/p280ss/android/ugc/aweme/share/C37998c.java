package com.p280ss.android.ugc.aweme.share;

import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.trill.share.api.C45079a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.share.c */
public final class C37998c implements C38242l {

    /* renamed from: a */
    private C45079a f98922a = new C45079a();

    public C37998c() {
        this.f98922a.mo66537a(this);
    }

    /* renamed from: b */
    public final void mo95580b() {
        C10761a.m31399c(C6399b.m19921a(), (int) R.string.dyo).mo25750a();
    }

    /* renamed from: a */
    public final void mo95578a() {
        SharePrefCache.inst().getTwitterSecret().mo59873b();
        SharePrefCache.inst().getFacebookAccessToken().mo59873b();
        SharePrefCache.inst().getTwitterAccessToken().mo59873b();
        C10761a.m31383a(C6399b.m19921a(), (int) R.string.dt2).mo25750a();
    }

    /* renamed from: a */
    public final void mo95579a(Aweme aweme) {
        if (!((Boolean) SharePrefCache.inst().getIsAwemePrivate().mo59877d()).booleanValue()) {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                if (((Boolean) SharePrefCache.inst().getAutoSendTwitter().mo59877d()).booleanValue()) {
                    arrayList.add(Integer.valueOf(2));
                    jSONArray.put("twitter");
                }
                jSONObject.put("platform", jSONArray);
            } catch (JSONException unused) {
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append((Integer) it.next());
                sb.append(",");
            }
            if (arrayList.size() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            C6907h.onEvent(MobClick.obtain().setJsonObject(jSONObject).setEventName("sync_video").setLabelName("edit_page"));
            if (!TextUtils.isEmpty(sb)) {
                this.f98922a.mo56976a(sb.toString(), aweme.getShareInfo().getShareUrl(), aweme.getShareInfo().getShareTitle(), SharePrefCache.inst().getFacebookAccessToken().mo59877d(), SharePrefCache.inst().getTwitterAccessToken().mo59877d(), SharePrefCache.inst().getTwitterSecret().mo59877d(), SharePrefCache.inst().getGoogleServerAuthCode().mo59877d(), aweme.getAid(), aweme.getShareInfo().getShareTitle(), "");
            }
            SharePrefCache.inst().getIsAwemePrivate().mo59871a(Boolean.valueOf(false));
        }
    }
}
