package com.bytedance.jirafast.utils;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.jirafast.C11999a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.bytedance.jirafast.utils.a */
public class C12068a {

    /* renamed from: a */
    public static String f32126a = "jira_shared_preferences";

    /* renamed from: b */
    public static String f32127b = "JIRA_DEFAULT_COMPONENT";

    /* renamed from: c */
    public static String f32128c = "JIRA_DEFAULT_EPIC";

    /* renamed from: d */
    public static String f32129d = "JIRA_DEFAULT_VERSION";

    /* renamed from: e */
    public static String f32130e = "JIRA_DEFAULT_FIX_VERSION";

    /* renamed from: f */
    public static String f32131f = "jira_default_assignee";

    /* renamed from: g */
    public static String f32132g = "jira_default_reporter";

    /* renamed from: h */
    public static String f32133h = "jira_default_project";

    /* renamed from: i */
    public static String f32134i = "jira_rest_api2_url";

    /* renamed from: j */
    public static String f32135j = "jira_projects";

    /* renamed from: k */
    public static String f32136k = "jira_auth_username";

    /* renamed from: l */
    public static String f32137l = "jira_auth_password";

    /* renamed from: m */
    public static String f32138m = "jira_title";

    /* renamed from: n */
    public static String f32139n = "jira_des";

    /* renamed from: o */
    public static String f32140o = "jira_aid";

    /* renamed from: p */
    public static String f32141p = "jira_disbale_shot_observer";

    /* renamed from: q */
    public static String f32142q = "jira_reporter";

    /* renamed from: r */
    public static String f32143r = "jira_default_qa_page";

    /* renamed from: s */
    public static String f32144s = "jira_appname";

    /* renamed from: t */
    public static String f32145t = "jira_version";

    /* renamed from: u */
    public static String f32146u = "jira_channel";

    /* renamed from: v */
    public static String f32147v = "jira_email";

    /* renamed from: w */
    public static String f32148w = "jira_is_i18n";

    /* renamed from: x */
    public static String f32149x = "jira_url_host";

    /* renamed from: z */
    private static C12068a f32150z;

    /* renamed from: y */
    SharedPreferences f32151y = C7285c.m22838a(C11999a.m35070a(), f32126a, 0);

    private C12068a() {
    }

    /* renamed from: a */
    public static C12068a m35194a() {
        if (f32150z == null) {
            synchronized (C12068a.class) {
                if (f32150z == null) {
                    f32150z = new C12068a();
                }
            }
        }
        return f32150z;
    }

    /* renamed from: c */
    public final String mo29746c() {
        String a = mo29742a(f32130e);
        StringBuilder sb = new StringBuilder();
        sb.append(mo29742a(f32144s));
        sb.append(" ");
        sb.append(mo29742a(f32145t));
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(a) && sb2.compareToIgnoreCase(a) <= 0) {
            return a;
        }
        return sb2;
    }

    /* renamed from: b */
    public final String mo29745b() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo29742a(f32129d));
        String trim = sb.toString().trim();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo29742a(f32144s));
        sb2.append(" ");
        sb2.append(mo29742a(f32145t));
        String trim2 = sb2.toString().trim();
        if (!TextUtils.isEmpty(trim) && trim2.compareToIgnoreCase(trim) <= 0) {
            return trim;
        }
        return trim2;
    }

    /* renamed from: d */
    public final int mo29747d(String str) {
        return this.f32151y.getInt(str, 0);
    }

    /* renamed from: e */
    public final boolean mo29748e(String str) {
        return this.f32151y.getBoolean(str, false);
    }

    /* renamed from: a */
    public final String mo29742a(String str) {
        return this.f32151y.getString(str, "");
    }

    /* renamed from: b */
    public static List<String> m35196b(String str) {
        StringBuilder sb = new StringBuilder("jiracaceh_str_");
        sb.append(str);
        return C12074e.m35222a(sb.toString());
    }

    /* renamed from: c */
    public static <T extends Serializable> List<T> m35198c(String str) {
        StringBuilder sb = new StringBuilder("jiracaceh_obj_");
        sb.append(str);
        return C12074e.m35224b(sb.toString());
    }

    /* renamed from: a */
    public static void m35195a(String str, List<String> list) {
        StringBuilder sb = new StringBuilder("jiracaceh_str_");
        sb.append(str);
        C12074e.m35225b(sb.toString(), list);
    }

    /* renamed from: b */
    public static <T extends Serializable> void m35197b(String str, List<T> list) {
        StringBuilder sb = new StringBuilder("jiracaceh_obj_");
        sb.append(str);
        C12074e.m35223a(sb.toString(), list);
    }

    /* renamed from: a */
    public final void mo29743a(String str, String str2) {
        this.f32151y.edit().putString(str, str2).commit();
    }

    /* renamed from: a */
    public final void mo29744a(String str, boolean z) {
        this.f32151y.edit().putBoolean(str, z).commit();
    }
}
