package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1596b;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.a */
public final class C40441a {

    /* renamed from: a */
    public String f105149a;

    /* renamed from: b */
    public String f105150b;

    /* renamed from: c */
    private String f105151c;

    /* renamed from: d */
    private List<String> f105152d;

    /* renamed from: b */
    public final boolean mo100478b() {
        if (!TextUtils.isEmpty(mo100479c()) && !TextUtils.isEmpty(mo100475a())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String mo100475a() {
        List<String> list = this.f105152d;
        if (list == null) {
            C7573i.m23580a();
        }
        if (list.isEmpty()) {
            return "";
        }
        if (TextUtils.isEmpty(this.f105149a)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<String> list2 = this.f105152d;
        if (list2 == null) {
            C7573i.m23580a();
        }
        sb.append((String) list2.get(0));
        String str = this.f105149a;
        if (str == null) {
            C7573i.m23580a();
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    public final String mo100479c() {
        if (this.f105152d != null) {
            List<String> list = this.f105152d;
            if (list == null) {
                C7573i.m23580a();
            }
            if (list.isEmpty() || TextUtils.isEmpty(this.f105151c)) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            List<String> list2 = this.f105152d;
            if (list2 == null) {
                C7573i.m23580a();
            }
            sb.append((String) list2.get(0));
            String str = this.f105151c;
            if (str == null) {
                C7573i.m23580a();
            }
            sb.append(str);
            return sb.toString();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo100477a(List<String> list) {
        C7573i.m23587b(list, "urlPrefixList");
        this.f105152d = list;
    }

    /* renamed from: a */
    public final void mo100476a(FaceStickerBean faceStickerBean) {
        C7573i.m23587b(faceStickerBean, "bean");
        try {
            JSONObject jSONObject = new JSONObject(faceStickerBean.getExtra());
            this.f105150b = jSONObject.optString("pixaloop_text");
            this.f105151c = jSONObject.optString("pixaloop_picture_cover");
            this.f105149a = jSONObject.optString("pixaloop_video_cover");
        } catch (Exception unused) {
        }
    }
}
