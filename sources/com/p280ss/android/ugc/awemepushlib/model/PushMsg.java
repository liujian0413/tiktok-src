package com.p280ss.android.ugc.awemepushlib.model;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C6306c;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.awemepushlib.p1713b.C43590a;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.model.PushMsg */
public class PushMsg implements Serializable {
    public int alertType;
    public transient JSONObject appData;
    public String callback;
    public Extra extra;
    public int filter = 1;
    public boolean functionalPush;

    /* renamed from: id */
    public int f112935id;
    public int imageType;
    public String imageUrl;
    public int isPing;
    public boolean led;
    public String openUrl;
    public transient JSONObject originData;
    public int pass_through = 1;
    public String postBack;
    public boolean preloadArticle;
    public String rawJson;
    public boolean sound;
    public String soundUrl;
    public String text;
    public String title;
    public boolean useSound;
    public boolean vibrator;

    /* renamed from: com.ss.android.ugc.awemepushlib.model.PushMsg$Extra */
    public static final class Extra implements Serializable {
        public boolean allowBannerDelete = true;
        public String authorId;
        public int badgeCount = -1;
        public String bg_color = "";
        public String challengeId;
        public String extra_text;
        public int floatWindow = -1;
        public long float_window_show_time = 12000;
        public boolean isBannerDeteled;
        public boolean isGroupSummary = true;
        public boolean isZeroVibrate = true;
        public boolean is_notification_top;
        public String largeModeIconUrl;
        public String musicId;
        public int notificaitonPriority = 1;
        public String notificationChannelId = "";
        public int oppoFloatWindow = -2;
        public int oppo_push_style = 11;
        public String poiId;
        public ArrayList<String> pre_o_urls = new ArrayList<>();
        public String push_user_id;
        public String rawExtra;
        public int redBadgeOnly = -1;
        public String roomId;
        public String soundId;
        public String soundUrl;
        public long stickTopOffset;
        public int stick_top;
        public int style = -1;
        public String tagId;
        public boolean turn_screen_on;
        public boolean useAssetSound;
        public String userId;
        public boolean user_system_style = true;
        public int visibility;
        public float volumeFactor = 1.0f;

        public final String toJsonString() {
            return this.rawExtra;
        }

        public final int getPriority() {
            if (this.notificaitonPriority > 2) {
                return 2;
            }
            if (this.notificaitonPriority < -2) {
                return -2;
            }
            return this.notificaitonPriority;
        }

        static Extra from(String str) {
            boolean z;
            Extra extra = new Extra();
            try {
                extra.rawExtra = str;
                if (TextUtils.isEmpty(str)) {
                    return extra;
                }
                JSONObject jSONObject = new JSONObject(str);
                extra.notificationChannelId = jSONObject.optString("notification_channel", "");
                extra.soundUrl = jSONObject.optString("surl");
                extra.soundId = null;
                extra.badgeCount = jSONObject.optInt("badge", -1);
                extra.redBadgeOnly = jSONObject.optInt("red_badge_only", -1);
                if (!TextUtils.isEmpty(extra.soundUrl)) {
                    extra.soundId = C6306c.m19561a(extra.soundUrl);
                }
                extra.volumeFactor = (float) jSONObject.optDouble("vfac", 1.0d);
                extra.stickTopOffset = jSONObject.optLong("stof");
                if (jSONObject.optInt("sdef") == 1) {
                    z = true;
                } else {
                    z = false;
                }
                extra.useAssetSound = z;
                extra.redBadgeOnly = jSONObject.optInt("red_badge_only");
                extra.largeModeIconUrl = jSONObject.optString("large_mode_icon");
                extra.visibility = jSONObject.optInt("visibility", 0);
                extra.turn_screen_on = C43590a.m138129a(jSONObject, "turn_screen_on", false);
                extra.user_system_style = C43590a.m138129a(jSONObject, "use_system_style", true);
                extra.is_notification_top = C43590a.m138129a(jSONObject, "is_notification_top", false);
                extra.stick_top = jSONObject.optInt("stick_top", 0);
                extra.floatWindow = jSONObject.optInt("show_float_window", -1);
                extra.oppoFloatWindow = jSONObject.optInt("show_float_window", -2);
                extra.float_window_show_time = jSONObject.optLong("float_window_show_time", 12000);
                extra.oppo_push_style = jSONObject.optInt("oppo_push_style", 11);
                extra.isZeroVibrate = C43590a.m138129a(jSONObject, "is_zero_vibrate", true);
                extra.bg_color = jSONObject.optString("bg_color", "");
                extra.style = jSONObject.optInt("notification_style", -1);
                extra.isGroupSummary = C43590a.m138129a(jSONObject, "is_group_summary", true);
                extra.extra_text = jSONObject.optString("extra_text");
                extra.authorId = jSONObject.optString("author_id");
                extra.roomId = jSONObject.optString("room_id");
                extra.userId = jSONObject.optString("user_id");
                extra.musicId = jSONObject.optString("music_id");
                extra.tagId = jSONObject.optString("tag_id");
                extra.challengeId = jSONObject.optString("challenge_id");
                extra.poiId = jSONObject.optString("poi_id");
                JSONArray optJSONArray = jSONObject.optJSONArray("pre_o_urls");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    extra.pre_o_urls.clear();
                    for (int i = 0; i < length; i++) {
                        String optString = optJSONArray.optString(i);
                        if (!TextUtils.isEmpty(optString)) {
                            extra.pre_o_urls.add(0, optString);
                        }
                    }
                }
                extra.push_user_id = jSONObject.optString("push_user_id");
                extra.allowBannerDelete = C43590a.m138129a(jSONObject, "allow_banner_delete", true);
                extra.notificaitonPriority = jSONObject.optInt("push_priority", 1);
                return extra;
            } catch (Throwable unused) {
                return extra;
            }
        }
    }

    public JSONObject getOriginData() {
        return this.originData;
    }

    public static PushMsg from(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        PushMsg pushMsg = new PushMsg();
        pushMsg.rawJson = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            pushMsg.originData = jSONObject;
            pushMsg.f112935id = jSONObject.optInt("id", 0);
            pushMsg.title = jSONObject.optString("title");
            pushMsg.text = jSONObject.optString("text");
            pushMsg.pass_through = jSONObject.optInt("pass_through", 1);
            pushMsg.openUrl = jSONObject.optString(C22912d.f60642b);
            pushMsg.imageUrl = jSONObject.optString("image_url");
            pushMsg.callback = jSONObject.optString("callback");
            pushMsg.isPing = jSONObject.optInt("is_ping", 0);
            pushMsg.imageType = jSONObject.optInt("image_type");
            pushMsg.filter = jSONObject.optInt("filter", 1);
            pushMsg.alertType = jSONObject.optInt("alert_type", 0);
            String optString = jSONObject.optString("extra_str");
            pushMsg.postBack = jSONObject.optString("post_back");
            pushMsg.led = C43590a.m138129a(jSONObject, "use_led", false);
            pushMsg.sound = C43590a.m138129a(jSONObject, "sound", false);
            pushMsg.vibrator = C43590a.m138129a(jSONObject, "use_vibrator", false);
            pushMsg.preloadArticle = C43590a.m138129a(jSONObject, "preload_article", false);
            pushMsg.appData = jSONObject.optJSONObject("app_data");
            pushMsg.extra = Extra.from(optString);
            if (pushMsg.extra.style >= 0 && pushMsg.extra.style <= 8) {
                pushMsg.imageType = pushMsg.extra.style;
            }
            if (!TextUtils.isEmpty(pushMsg.openUrl)) {
                try {
                    pushMsg.functionalPush = "1".equals(Uri.parse(pushMsg.openUrl).getQueryParameter("functional_push"));
                } catch (Throwable unused) {
                }
            }
            return pushMsg;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
