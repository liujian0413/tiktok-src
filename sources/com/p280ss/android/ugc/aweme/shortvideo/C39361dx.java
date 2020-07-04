package com.p280ss.android.ugc.aweme.shortvideo;

import android.content.Intent;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.port.p1479in.C35554aq.C35555a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dx */
public final class C39361dx {

    /* renamed from: a */
    public C35555a f102257a;

    /* renamed from: b */
    public final int mo97946b() {
        return this.f102257a.mo83252c();
    }

    /* renamed from: c */
    public final void mo97947c() {
        this.f102257a.mo83244a();
    }

    /* renamed from: a */
    public final String mo97941a() {
        return this.f102257a.mo83251b();
    }

    /* renamed from: a */
    public final void mo97942a(int i) {
        if (C30538p.m99745a()) {
            this.f102257a.mo83245a(i);
        }
    }

    /* renamed from: a */
    public final void mo97944a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("creation_id", videoPublishEditModel.creationId);
            hashMap.put("enter_from", "video_post_page");
            hashMap.put("content_type", "video");
            hashMap.put("shoot_way", videoPublishEditModel.mShootWay);
            this.f102257a.mo83253d().setTag(hashMap);
        }
    }

    /* renamed from: a */
    public final void mo97945a(String str) {
        if (this.f102257a.mo83253d().getVisibility() == 0 && !C30538p.m99745a() && this.f102257a.mo83253d().getVisibility() == 0) {
            C6907h.onEvent(MobClick.obtain().setEventName("fans_power_show").setLabelName("edit_page").setJsonObject(new C6869c().mo16887a("shoot_way", str).mo16888b()));
        }
    }

    /* renamed from: a */
    public static void m125745a(String str, int i) {
        if (!C30538p.m99745a() && !TextUtils.isEmpty(str)) {
            JSONArray jSONArray = new JSONArray();
            String[] split = str.split(";");
            if (split.length > 0) {
                try {
                    for (String parseInt : split) {
                        int parseInt2 = Integer.parseInt(parseInt);
                        if (parseInt2 == 0) {
                            jSONArray.put("hotsoon");
                        }
                        if (parseInt2 == 1) {
                            jSONArray.put("toutiao");
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (jSONArray.length() > 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("to_app", jSONArray);
                    jSONObject.put("is_photo", String.valueOf(i));
                    C6907h.onEvent(MobClick.obtain().setEventName("sync_content").setLabelName("edit_page").setJsonObject(jSONObject));
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* renamed from: a */
    public static C39361dx m125744a(Fragment fragment, View view, int i) {
        return new C39361dx(fragment, view, i);
    }

    private C39361dx(Fragment fragment, View view, int i) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.df9);
        this.f102257a = C35574k.m114859a().mo70067A().mo83243a(fragment.getActivity(), i);
        this.f102257a.mo83249a(fragment);
        linearLayout.addView(this.f102257a.mo83253d());
    }

    /* renamed from: a */
    public final void mo97943a(int i, int i2, Intent intent) {
        this.f102257a.mo83246a(i, i2, intent);
        if (i == 2 && i2 == -1 && intent != null) {
            int intExtra = intent.getIntExtra("extra.PERMISSION", 0);
            if (C30538p.m99745a()) {
                this.f102257a.mo83245a(intExtra);
            }
        }
    }
}
