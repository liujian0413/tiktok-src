package com.p280ss.android.pushmanager.setting;

import android.content.Context;
import android.util.Pair;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.message.C19809a;
import com.p280ss.android.pushmanager.setting.PushMultiProcessSharedProvider.C20087a;
import com.p280ss.android.pushmanager.setting.PushMultiProcessSharedProvider.C20088b;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.setting.b */
public class C20090b {

    /* renamed from: a */
    public static final String f54332a = "b";

    /* renamed from: b */
    private static C20090b f54333b;

    /* renamed from: c */
    private C20088b f54334c = PushMultiProcessSharedProvider.m66155a((Context) C19809a.m65408a());

    /* renamed from: a */
    public final void mo53759a(boolean z) {
        this.f54334c.mo53736a().mo53731a("shut_push_on_stop_service", z).mo53732a();
    }

    private C20090b() {
    }

    /* renamed from: H */
    private boolean m66186H() {
        return this.f54334c.mo53738a("key_is_miui_close_daemon", true);
    }

    /* renamed from: r */
    public static String m66190r() {
        return C20089a.m66179a().mo53742b();
    }

    /* renamed from: A */
    public final boolean mo53745A() {
        return this.f54334c.mo53738a("is_send_mz_message_receiver_data", false);
    }

    /* renamed from: B */
    public final boolean mo53746B() {
        return this.f54334c.mo53738a("is_receiver_message_wakeup_screen", false);
    }

    /* renamed from: C */
    public final int mo53747C() {
        return this.f54334c.mo53734a("receiver_message_wakeup_screen_time", 5000);
    }

    /* renamed from: D */
    public final boolean mo53748D() {
        return this.f54334c.mo53738a("is_use_start_foreground_notification", true);
    }

    /* renamed from: E */
    public final int mo53749E() {
        return this.f54334c.mo53734a("job_schedule_wake_up_interval_second", 3600);
    }

    /* renamed from: F */
    public final boolean mo53750F() {
        return this.f54334c.mo53738a("is_use_c_native_process_keep_alive", true);
    }

    /* renamed from: G */
    public final String mo53751G() {
        return this.f54334c.mo53737a("notification_channel_status", "");
    }

    /* renamed from: d */
    public final String mo53769d() {
        return this.f54334c.mo53737a("loc", "");
    }

    /* renamed from: f */
    public final String mo53775f() {
        return this.f54334c.mo53737a("uninstall_question_url", "");
    }

    /* renamed from: i */
    public final String mo53783i() {
        return this.f54334c.mo53737a("push_daemon_monitor", "");
    }

    /* renamed from: j */
    public final String mo53784j() {
        return this.f54334c.mo53737a("push_daemon_monitor_result", "");
    }

    /* renamed from: k */
    public final String mo53785k() {
        return this.f54334c.mo53737a("self_push_message_ids", "");
    }

    /* renamed from: l */
    public final String mo53786l() {
        return this.f54334c.mo53737a("push_apps", "");
    }

    /* renamed from: m */
    public final boolean mo53787m() {
        return this.f54334c.mo53738a("allow_close_boot_receiver", true);
    }

    /* renamed from: n */
    public final boolean mo53788n() {
        if (mo53768c() || !mo53764b()) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final boolean mo53790p() {
        return this.f54334c.mo53738a("is_close_alarm_wakeup", false);
    }

    /* renamed from: q */
    public final String mo53791q() {
        return this.f54334c.mo53737a("push_channels_json_array", "");
    }

    /* renamed from: s */
    public final boolean mo53792s() {
        return this.f54334c.mo53738a("allow_off_alive", true);
    }

    /* renamed from: t */
    public final int mo53793t() {
        return this.f54334c.mo53734a("ali_push_type", -1);
    }

    /* renamed from: u */
    public final boolean mo53794u() {
        return this.f54334c.mo53738a("allow_settings_notify_enable", true);
    }

    /* renamed from: v */
    public final boolean mo53795v() {
        return this.f54334c.mo53738a("last_send_notify_enable_is_succ", true);
    }

    /* renamed from: w */
    public final String mo53796w() {
        return this.f54334c.mo53737a("wakeup_black_list_package", "");
    }

    /* renamed from: x */
    public final int mo53797x() {
        return this.f54334c.mo53734a("system_push_enable", -2);
    }

    /* renamed from: y */
    public final long mo53798y() {
        return this.f54334c.mo53735a("last_get_update_sender_time_mil", 0);
    }

    /* renamed from: z */
    public final int mo53799z() {
        return this.f54334c.mo53734a("update_sender_interval_time_second", 10800) * 1000;
    }

    /* renamed from: a */
    public static C20090b m66187a() {
        if (f54333b == null) {
            synchronized (C20090b.class) {
                if (f54333b == null) {
                    f54333b = new C20090b();
                }
            }
        }
        return f54333b;
    }

    /* renamed from: h */
    public final boolean mo53782h() {
        if (!C6776h.m20950c() || !m66186H()) {
            return this.f54334c.mo53738a("allow_push_daemon_monitor", true);
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo53789o() {
        if (!this.f54334c.mo53738a("allow_self_push_enable", false) || !mo53768c()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo53768c() {
        if (!this.f54334c.mo53738a("push_notify_enable", true) || !mo53794u()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final Pair<Double, Double> mo53772e() {
        try {
            String d = mo53769d();
            if (C6319n.m19593a(d)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(d);
            Double.valueOf(0.0d);
            Double.valueOf(0.0d);
            return new Pair<>(Double.valueOf(jSONObject.optDouble("lon")), Double.valueOf(jSONObject.optDouble("lat")));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: g */
    public final boolean mo53780g() {
        return this.f54334c.mo53738a("allow_push_job_service", true);
    }

    /* renamed from: b */
    public final boolean mo53764b() {
        return this.f54334c.mo53738a("shut_push_on_stop_service", false);
    }

    /* renamed from: a */
    public static void m66188a(Map<String, String> map) {
        C20089a.m66179a().mo53740a(map);
    }

    /* renamed from: b */
    public static void m66189b(Map<String, String> map) {
        C20089a.m66179a().mo53743b(map);
    }

    /* renamed from: b */
    public final void mo53760b(int i) {
        this.f54334c.mo53736a().mo53728a("system_push_enable", i).mo53732a();
    }

    /* renamed from: c */
    public final void mo53765c(String str) {
        this.f54334c.mo53736a().mo53730a("push_daemon_monitor", str).mo53732a();
    }

    /* renamed from: e */
    public final void mo53773e(String str) {
        this.f54334c.mo53736a().mo53730a("self_push_message_ids", str).mo53732a();
    }

    /* renamed from: g */
    public final void mo53778g(String str) {
        this.f54334c.mo53736a().mo53730a("push_channels_json_array", str).mo53732a();
    }

    /* renamed from: h */
    public final void mo53781h(String str) {
        this.f54334c.mo53736a().mo53730a("notification_channel_status", str).mo53732a();
    }

    /* renamed from: b */
    public final void mo53761b(long j) {
        this.f54334c.mo53736a().mo53729a("last_get_update_sender_time_mil", j).mo53732a();
    }

    /* renamed from: c */
    public final void mo53767c(boolean z) {
        this.f54334c.mo53736a().mo53731a("allow_push_daemon_monitor", false).mo53732a();
    }

    /* renamed from: d */
    public final void mo53770d(String str) {
        this.f54334c.mo53736a().mo53730a("push_daemon_monitor_result", str).mo53732a();
    }

    /* renamed from: e */
    public final void mo53774e(boolean z) {
        this.f54334c.mo53736a().mo53731a("allow_off_alive", z).mo53732a();
    }

    /* renamed from: f */
    public final void mo53776f(String str) {
        this.f54334c.mo53736a().mo53730a("push_apps", str).mo53732a();
    }

    /* renamed from: g */
    public final void mo53779g(boolean z) {
        this.f54334c.mo53736a().mo53731a("last_send_notify_enable_is_succ", z).mo53732a();
    }

    /* renamed from: b */
    public final void mo53762b(String str) {
        this.f54334c.mo53736a().mo53730a("uninstall_question_url", str).mo53732a();
    }

    /* renamed from: d */
    public final void mo53771d(boolean z) {
        this.f54334c.mo53736a().mo53731a("allow_self_push_enable", z).mo53732a();
    }

    /* renamed from: f */
    public final void mo53777f(boolean z) {
        this.f54334c.mo53736a().mo53731a("allow_settings_notify_enable", z).mo53732a();
    }

    /* renamed from: b */
    public final void mo53763b(boolean z) {
        this.f54334c.mo53736a().mo53731a("allow_network", z).mo53732a();
    }

    /* renamed from: c */
    public final void mo53766c(Map<String, ?> map) {
        try {
            C20087a a = this.f54334c.mo53736a();
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        a.mo53728a((String) entry.getKey(), ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        a.mo53729a((String) entry.getKey(), ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        a.mo53727a((String) entry.getKey(), ((Float) value).floatValue());
                    } else if (value instanceof Boolean) {
                        a.mo53731a((String) entry.getKey(), ((Boolean) value).booleanValue());
                    } else if (value instanceof String) {
                        a.mo53730a((String) entry.getKey(), (String) value);
                    }
                }
                a.mo53733b();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo53756a(int i) {
        this.f54334c.mo53736a().mo53728a("ali_push_type", i).mo53732a();
    }

    /* renamed from: a */
    public final void mo53757a(long j) {
        this.f54334c.mo53736a().mo53729a("date_change_delay_interval", j).mo53732a();
    }

    /* renamed from: a */
    public final void mo53758a(String str) {
        this.f54334c.mo53736a().mo53730a("loc", str).mo53732a();
    }

    /* renamed from: a */
    public final int mo53752a(String str, int i) {
        return this.f54334c.mo53734a(str, i);
    }

    /* renamed from: a */
    public final long mo53753a(String str, long j) {
        return this.f54334c.mo53735a(str, j);
    }

    /* renamed from: a */
    public final Boolean mo53754a(String str, Boolean bool) {
        return Boolean.valueOf(this.f54334c.mo53738a(str, bool.booleanValue()));
    }

    /* renamed from: a */
    public final String mo53755a(String str, String str2) {
        return this.f54334c.mo53737a(str, str2);
    }
}
