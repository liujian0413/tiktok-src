package com.p280ss.android.ugc.aweme.profile;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.a */
public class C35662a {

    /* renamed from: j */
    private static C35662a f93492j;

    /* renamed from: a */
    public int f93493a = 11;

    /* renamed from: b */
    private final String f93494b = "ug_coupon_repo";

    /* renamed from: c */
    private final String f93495c = "show_bubble";

    /* renamed from: d */
    private final String f93496d = "show_bar";

    /* renamed from: e */
    private final String f93497e = "show_star";

    /* renamed from: f */
    private final String f93498f = "show_bar_time";

    /* renamed from: g */
    private DateFormat f93499g = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: h */
    private String f93500h = C35662a.class.getSimpleName();

    /* renamed from: i */
    private int f93501i = 24;

    /* renamed from: k */
    private Keva f93502k = Keva.getRepo("ug_coupon_repo");

    /* renamed from: g */
    private int m115266g() {
        return this.f93502k.getInt("show_bar_time", 0);
    }

    /* renamed from: b */
    public final boolean mo90508b() {
        if (!this.f93502k.getBoolean("show_bubble", true)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo90511d() {
        if (m115266g() >= this.f93493a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C35662a m115265a() {
        if (f93492j == null) {
            synchronized (C35662a.class) {
                if (f93492j == null) {
                    f93492j = new C35662a();
                }
            }
        }
        return f93492j;
    }

    /* renamed from: c */
    public final void mo90509c() {
        this.f93502k.storeInt("show_bar_time", this.f93502k.getInt("show_bar_time", 0) + 1);
    }

    /* renamed from: e */
    public final boolean mo90512e() {
        if (!this.f93502k.contains("show_bubble")) {
            return false;
        }
        if (!this.f93502k.contains("show_bar") || !this.f93502k.getBoolean("show_bar", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo90513f() {
        if (!this.f93502k.contains("show_bubble")) {
            return false;
        }
        if (!this.f93502k.contains("show_star") || !this.f93502k.getBoolean("show_star", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo90507b(boolean z) {
        if (z || !this.f93502k.getBoolean("show_bar", false)) {
            this.f93502k.storeBoolean("show_bar", z);
        }
    }

    /* renamed from: a */
    public final void mo90504a(JSONObject jSONObject) {
        new StringBuilder("updateFirstTime:").append(jSONObject.toString());
        try {
            String string = jSONObject.getString("activity_id");
            Date date = new Date();
            StringBuilder sb = new StringBuilder("setFirstTime:");
            sb.append(date.toString());
            sb.append("activityId:");
            sb.append(string);
            this.f93502k.storeString(string, this.f93499g.format(date));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: c */
    public final void mo90510c(boolean z) {
        if (!this.f93502k.getBoolean("show_star", false)) {
            this.f93502k.storeBoolean("show_star", false);
        }
    }

    /* renamed from: a */
    public final void mo90505a(boolean z) {
        if (z || !this.f93502k.getBoolean("show_bubble", false)) {
            this.f93502k.storeBoolean("show_bubble", z);
        }
    }

    /* renamed from: a */
    public final boolean mo90506a(String str, int i) {
        String string = this.f93502k.getString(str, "");
        new StringBuilder("showCouponIcon,activityId:").append(str);
        if (TextUtils.equals(string, "")) {
            return false;
        }
        try {
            if ((new Date().getTime() - this.f93499g.parse(string).getTime()) / TimeUnit.DAYS.toMillis(1) < ((long) i)) {
                return true;
            }
            return false;
        } catch (ParseException unused) {
            this.f93502k.storeString(str, "");
            return false;
        }
    }
}
