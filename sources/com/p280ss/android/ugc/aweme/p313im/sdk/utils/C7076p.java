package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.C31476g;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.XPlanAwemeBannerConfig;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p319c.C31678b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.p */
public final class C7076p {

    /* renamed from: a */
    private static C7076p f19909a;

    /* renamed from: b */
    private static volatile long f19910b;

    /* renamed from: c */
    private SharedPreferences f19911c;

    /* renamed from: d */
    private SharedPreferences f19912d = C7285c.m22838a(C6399b.m19921a(), "imbase_bydid", 0);

    /* renamed from: e */
    private SharedPreferences f19913e = C7285c.m22838a(C6399b.m19921a(), "iuserstate", 0);

    /* renamed from: A */
    public final int mo18285A() {
        return this.f19911c.getInt("associative_emoji_avoid_times", 0);
    }

    /* renamed from: B */
    public final boolean mo18286B() {
        return this.f19911c.getBoolean("has_show_new_member_can_see_old_msg_tips", false);
    }

    /* renamed from: C */
    public final boolean mo18287C() {
        if (!this.f19911c.getBoolean("invite_fans_enter_group_tip", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final Set<String> mo18289E() {
        return this.f19911c.getStringSet("share_video_message_has_watched", null);
    }

    /* renamed from: b */
    public final int mo18298b() {
        return this.f19911c.getInt("last_msghelper_unread_count", 0);
    }

    /* renamed from: c */
    public final int mo18304c() {
        return this.f19911c.getInt("last_xcard_unread_dot", 0);
    }

    /* renamed from: e */
    public final String mo18313e() {
        return this.f19911c.getString("upload_image_auth_key", null);
    }

    /* renamed from: g */
    public final long mo18320g() {
        return this.f19911c.getLong("flip_chat_last_msg_time", 0);
    }

    /* renamed from: h */
    public final long mo18322h() {
        return this.f19911c.getLong("flip_chat_last_unread_msg_time", 0);
    }

    /* renamed from: i */
    public final long mo18324i() {
        return this.f19911c.getLong("flip_chat_last_unread_dot_msg_time", 0);
    }

    /* renamed from: j */
    public final boolean mo18326j() {
        return this.f19911c.getBoolean("flip_chat_push_click_show_state", false);
    }

    /* renamed from: k */
    public final String mo18327k() {
        return this.f19911c.getString("flip_chat_push_click_show_desc", "");
    }

    /* renamed from: l */
    public final long mo18328l() {
        return this.f19911c.getLong("flip_chat_push_click_show_time", 0);
    }

    /* renamed from: m */
    public final long mo18329m() {
        return this.f19913e.getLong("userid", -1);
    }

    /* renamed from: n */
    public final String mo18330n() {
        return this.f19913e.getString("token", "");
    }

    /* renamed from: x */
    public final int mo18340x() {
        return this.f19911c.getInt("notification_tips_show_times", 0);
    }

    /* renamed from: y */
    public final Set<String> mo18341y() {
        return this.f19911c.getStringSet("notification_shown_conversation", new HashSet());
    }

    /* renamed from: z */
    public final boolean mo18342z() {
        return this.f19911c.getBoolean("enable_associative_emoji", true);
    }

    /* renamed from: G */
    private void m22076G() {
        this.f19911c.edit().putLong("token_fetch_time", System.currentTimeMillis()).commit();
    }

    /* renamed from: D */
    public final void mo18288D() {
        this.f19911c.edit().putBoolean("invite_fans_enter_group_tip", true).commit();
    }

    /* renamed from: F */
    public final C31678b mo18290F() {
        String string = this.f19911c.getString("spotlight_relation_load_monitor", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (C31678b) C31913m.m103667a(string, C31678b.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public final boolean mo18318f() {
        return this.f19911c.getBoolean("flip_chat_deleted_state", false);
    }

    /* renamed from: o */
    public final void mo18331o() {
        this.f19913e.edit().remove("userid").remove("token").commit();
    }

    /* renamed from: p */
    public final C31476g mo18332p() {
        String string = this.f19911c.getString("banner_config_v2", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (C31476g) C31913m.m103667a(string, C31476g.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: q */
    public final XPlanAwemeBannerConfig mo18333q() {
        String string = this.f19911c.getString("banner_config", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (XPlanAwemeBannerConfig) C31913m.m103667a(string, XPlanAwemeBannerConfig.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: r */
    public final boolean mo18334r() {
        if (System.currentTimeMillis() - this.f19911c.getLong("token_fetch_time", 0) > 14400000) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final boolean mo18335s() {
        if (this.f19911c.getLong("follow_list_fetch_time", 0) > 0) {
            return true;
        }
        return false;
    }

    private C7076p() {
        f19910b = C7074e.m22072d();
        Context a = C6399b.m19921a();
        StringBuilder sb = new StringBuilder("imbase_");
        sb.append(f19910b);
        this.f19911c = C7285c.m22838a(a, sb.toString(), 0);
    }

    /* renamed from: a */
    public static synchronized C7076p m22077a() {
        C7076p pVar;
        synchronized (C7076p.class) {
            long d = C7074e.m22072d();
            if (f19909a == null || d != f19910b) {
                synchronized (C7076p.class) {
                    if (f19909a == null || d != f19910b) {
                        f19909a = new C7076p();
                    }
                }
            }
            pVar = f19909a;
        }
        return pVar;
    }

    /* renamed from: d */
    public final boolean mo18311d() {
        return this.f19911c.getBoolean("user_x_active", false);
    }

    /* renamed from: t */
    public final boolean mo18336t() {
        int i;
        long j = this.f19911c.getLong("follow_list_fetch_time", 0);
        if (C31915n.m103671a()) {
            i = 1;
        } else {
            i = 3;
        }
        if (System.currentTimeMillis() - j > ((long) (i * 24 * 3600 * 1000))) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final void mo18337u() {
        this.f19911c.edit().putLong("show_privacy_hint_time", System.currentTimeMillis()).commit();
        this.f19911c.edit().putInt("show_privacy_hint_count", this.f19911c.getInt("show_privacy_hint_count", 0) + 1).commit();
    }

    /* renamed from: v */
    public final boolean mo18338v() {
        if (this.f19911c.getInt("show_privacy_hint_count", 0) >= 2) {
            return false;
        }
        if (System.currentTimeMillis() - this.f19911c.getLong("show_privacy_hint_time", 0) > 432000000) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final List<Emoji> mo18339w() {
        ArrayList arrayList = new ArrayList();
        try {
            for (String a : this.f19911c.getStringSet("group_greet_msg", new HashSet())) {
                arrayList.add(C31913m.m103667a(a, Emoji.class));
            }
            return arrayList;
        } catch (Exception unused) {
            return arrayList;
        }
    }

    /* renamed from: a */
    public final void mo18291a(int i) {
        this.f19911c.edit().putInt("last_msghelper_unread_count", i).commit();
    }

    /* renamed from: d */
    public final void mo18309d(long j) {
        this.f19911c.edit().putLong("flip_chat_push_click_show_time", j).commit();
    }

    /* renamed from: f */
    public final void mo18317f(long j) {
        this.f19911c.edit().putLong("follow_list_fetch_time", j).commit();
    }

    /* renamed from: a */
    public final void mo18292a(long j) {
        this.f19911c.edit().putLong("flip_chat_last_msg_time", j).commit();
    }

    /* renamed from: b */
    public final void mo18299b(int i) {
        this.f19911c.edit().putInt("last_xcard_unread_dot", i).commit();
    }

    /* renamed from: c */
    public final void mo18306c(long j) {
        this.f19911c.edit().putLong("flip_chat_last_unread_dot_msg_time", j).commit();
    }

    /* renamed from: d */
    public final void mo18310d(boolean z) {
        this.f19911c.edit().putBoolean("enable_associative_emoji", z).commit();
    }

    /* renamed from: e */
    public final void mo18315e(long j) {
        this.f19913e.edit().putLong("userid", j).commit();
    }

    /* renamed from: h */
    public final void mo18323h(int i) {
        this.f19911c.edit().putInt("notification_tips_show_times", i).commit();
    }

    /* renamed from: i */
    public final void mo18325i(int i) {
        this.f19911c.edit().putInt("associative_emoji_avoid_times", i).commit();
    }

    /* renamed from: b */
    public final void mo18300b(long j) {
        this.f19911c.edit().putLong("flip_chat_last_unread_msg_time", j).commit();
    }

    /* renamed from: c */
    public final void mo18305c(int i) {
        switch (i) {
            case 1:
                this.f19911c.edit().putBoolean("sync_alert_del_msg", true).commit();
                return;
            case 2:
                this.f19911c.edit().putBoolean("sync_alert_unfollow", true).commit();
                return;
            case 3:
                this.f19911c.edit().putBoolean("sync_alert_block", true).commit();
                break;
        }
    }

    /* renamed from: e */
    public final void mo18316e(boolean z) {
        this.f19911c.edit().putBoolean("has_show_new_member_can_see_old_msg_tips", true).commit();
    }

    /* renamed from: a */
    public final void mo18293a(C31678b bVar) {
        try {
            this.f19911c.edit().putString("spotlight_relation_load_monitor", C31913m.m103668a(bVar)).commit();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo18301b(String str) {
        this.f19911c.edit().putString("flip_chat_push_click_show_desc", str).commit();
    }

    /* renamed from: c */
    public final void mo18307c(String str) {
        this.f19913e.edit().putString("token", str).commit();
        if (!TextUtils.isEmpty(str)) {
            m22076G();
        }
    }

    /* renamed from: d */
    public final boolean mo18312d(int i) {
        switch (i) {
            case 1:
                if (!this.f19911c.getBoolean("sync_alert_del_msg", false)) {
                    return true;
                }
                return false;
            case 2:
                if (!this.f19911c.getBoolean("sync_alert_unfollow", false)) {
                    return true;
                }
                return false;
            case 3:
                if (!this.f19911c.getBoolean("sync_alert_block", false)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: e */
    public final void mo18314e(int i) {
        switch (i) {
            case 2:
                this.f19911c.edit().putBoolean("goto_x_1st_from_profile", true).commit();
                break;
            case 3:
                this.f19911c.edit().putBoolean("goto_x_1st_from_profile_more", true).commit();
                break;
            case 4:
                this.f19911c.edit().putBoolean("goto_x_1st_from_contacts", true).commit();
                break;
        }
        this.f19912d.edit().putLong("goto_x_1st_alert_time", System.currentTimeMillis()).commit();
    }

    /* renamed from: f */
    public final boolean mo18319f(int i) {
        if (System.currentTimeMillis() - this.f19912d.getLong("goto_x_1st_alert_time", 0) <= 86400000) {
            return false;
        }
        switch (i) {
            case 2:
                if (!this.f19911c.getBoolean("goto_x_1st_from_profile", false)) {
                    return true;
                }
                return false;
            case 3:
                if (!this.f19911c.getBoolean("goto_x_1st_from_profile_more", false)) {
                    return true;
                }
                return false;
            case 4:
                if (!this.f19911c.getBoolean("goto_x_1st_from_contacts", false)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: g */
    public final boolean mo18321g(int i) {
        long j = this.f19911c.getLong("last_group_guide_show_time", 0);
        int i2 = this.f19911c.getInt("group_guide_show_times", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j <= ((long) (i * 1000)) || i2 >= 2) {
            return false;
        }
        this.f19911c.edit().putInt("group_guide_show_times", i2 + 1).commit();
        this.f19911c.edit().putLong("last_group_guide_show_time", currentTimeMillis).commit();
        return true;
    }

    /* renamed from: a */
    public final void mo18294a(String str) {
        this.f19911c.edit().putString("upload_image_auth_key", str).commit();
    }

    /* renamed from: b */
    public final void mo18302b(Set<String> set) {
        this.f19911c.edit().putStringSet("share_video_message_has_watched", set).commit();
    }

    /* renamed from: c */
    public final void mo18308c(boolean z) {
        this.f19911c.edit().putBoolean("flip_chat_push_click_show_state", z).commit();
    }

    /* renamed from: a */
    public final void mo18295a(List<Emoji> list) {
        if (list != null && list.size() != 0) {
            try {
                HashSet hashSet = new HashSet();
                for (int i = 0; i < list.size(); i++) {
                    hashSet.add(C31913m.m103668a(list.get(i)));
                }
                this.f19911c.edit().putStringSet("group_greet_msg", hashSet).commit();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo18303b(boolean z) {
        this.f19911c.edit().putBoolean("flip_chat_deleted_state", z).commit();
    }

    /* renamed from: a */
    public final void mo18296a(Set<String> set) {
        this.f19911c.edit().putStringSet("notification_shown_conversation", set).commit();
    }

    /* renamed from: a */
    public final void mo18297a(boolean z) {
        this.f19911c.edit().putBoolean("user_x_active", true).commit();
    }
}
