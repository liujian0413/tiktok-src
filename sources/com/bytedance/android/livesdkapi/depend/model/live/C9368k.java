package com.bytedance.android.livesdkapi.depend.model.live;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.C2343f;
import com.google.gson.p276a.C6593c;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.k */
public class C9368k implements C2343f {
    @C6593c(mo15949a = "title")

    /* renamed from: A */
    public String f25667A;
    @C6593c(mo15949a = "label")

    /* renamed from: B */
    public String f25668B;
    @C6593c(mo15949a = "display_type")

    /* renamed from: C */
    public int f25669C;
    @C6593c(mo15949a = "play_track_url_list")

    /* renamed from: D */
    public List<String> f25670D;
    @C6593c(mo15949a = "playover_track_url_list")

    /* renamed from: E */
    public List<String> f25671E;
    @C6593c(mo15949a = "effective_play_track_url_list")

    /* renamed from: F */
    public List<String> f25672F;
    @C6593c(mo15949a = "effective_play_time")

    /* renamed from: G */
    public int f25673G;
    @C6593c(mo15949a = "use_compound_land_page")

    /* renamed from: H */
    public boolean f25674H;

    /* renamed from: I */
    public String f25675I;

    /* renamed from: J */
    public String f25676J;

    /* renamed from: K */
    public long f25677K;
    @C6593c(mo15949a = "id")

    /* renamed from: a */
    public long f25678a;
    @C6593c(mo15949a = "type")

    /* renamed from: b */
    public String f25679b;
    @C6593c(mo15949a = "log_extra")

    /* renamed from: c */
    public String f25680c;
    @C6593c(mo15949a = "image_list")

    /* renamed from: d */
    public List<C9370b> f25681d;
    @C6593c(mo15949a = "author")

    /* renamed from: e */
    public C9369a f25682e;
    @C6593c(mo15949a = "open_url")

    /* renamed from: f */
    public String f25683f;
    @C6593c(mo15949a = "web_url")

    /* renamed from: g */
    public String f25684g;
    @C6593c(mo15949a = "web_title")

    /* renamed from: h */
    public String f25685h;
    @C6593c(mo15949a = "appleid")

    /* renamed from: i */
    public String f25686i;
    @C6593c(mo15949a = "package")

    /* renamed from: j */
    public String f25687j;
    @C6593c(mo15949a = "app_name")

    /* renamed from: k */
    public String f25688k;
    @C6593c(mo15949a = "download_url")

    /* renamed from: l */
    public String f25689l;
    @C6593c(mo15949a = "hide_if_exists")

    /* renamed from: m */
    public int f25690m;
    @C6593c(mo15949a = "auto_open")

    /* renamed from: n */
    public int f25691n;
    @C6593c(mo15949a = "button_text")

    /* renamed from: o */
    public String f25692o;
    @C6593c(mo15949a = "track_url_list")

    /* renamed from: p */
    public List<String> f25693p;
    @C6593c(mo15949a = "click_track_url_list")

    /* renamed from: q */
    public List<String> f25694q;
    @C6593c(mo15949a = "allow_comment")

    /* renamed from: r */
    public boolean f25695r;
    @C6593c(mo15949a = "allow_dislike")

    /* renamed from: s */
    public boolean f25696s;
    @C6593c(mo15949a = "allow_share")

    /* renamed from: t */
    public boolean f25697t;
    @C6593c(mo15949a = "digg_count")

    /* renamed from: u */
    public long f25698u;
    @C6593c(mo15949a = "video_info")

    /* renamed from: v */
    public C9371c f25699v;
    @C6593c(mo15949a = "filter_words")

    /* renamed from: w */
    public List<Object> f25700w;
    @C6593c(mo15949a = "show_button_seconds")

    /* renamed from: x */
    public int f25701x;
    @C6593c(mo15949a = "learn_more_bg_color")

    /* renamed from: y */
    public String f25702y;
    @C6593c(mo15949a = "show_mask_times")

    /* renamed from: z */
    public int f25703z;

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.live.k$a */
    public static class C9369a {
        @C6593c(mo15949a = "nickname")

        /* renamed from: a */
        public String f25704a;
        @C6593c(mo15949a = "avatar")

        /* renamed from: b */
        public C9370b f25705b;
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.live.k$b */
    public static class C9370b {
        @C6593c(mo15949a = "width")

        /* renamed from: a */
        public int f25706a;
        @C6593c(mo15949a = "height")

        /* renamed from: b */
        public int f25707b;
        @C6593c(mo15949a = "url_list")

        /* renamed from: c */
        public List<String> f25708c;
        @C6593c(mo15949a = "uri")

        /* renamed from: d */
        public String f25709d;
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.live.k$c */
    public static class C9371c {
        @C6593c(mo15949a = "video_duration")

        /* renamed from: a */
        public int f25710a;
        @C6593c(mo15949a = "video_transpose")

        /* renamed from: b */
        public int f25711b;
        @C6593c(mo15949a = "thumb_width")

        /* renamed from: c */
        public int f25712c;
        @C6593c(mo15949a = "thumb_height")

        /* renamed from: d */
        public int f25713d;
        @C6593c(mo15949a = "url_list")

        /* renamed from: e */
        public List<String> f25714e;
        @C6593c(mo15949a = "video_id")

        /* renamed from: f */
        public String f25715f;
    }

    public long getId() {
        return this.f25678a;
    }

    public String getMixId() {
        return String.valueOf(this.f25678a);
    }

    /* renamed from: a */
    public final JSONObject mo23059a() {
        return mo23060a("", 0);
    }

    /* renamed from: a */
    public final String mo23058a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.f25678a));
        sb.append("_");
        sb.append(String.valueOf(this.f25677K));
        sb.append("_");
        sb.append(String.valueOf(i));
        return sb.toString();
    }

    /* renamed from: a */
    public final JSONObject mo23060a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_ad_event", 1);
            jSONObject.put("log_extra", this.f25680c);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("refer", str);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
