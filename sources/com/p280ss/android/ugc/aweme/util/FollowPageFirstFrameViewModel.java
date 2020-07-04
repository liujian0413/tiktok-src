package com.p280ss.android.ugc.aweme.util;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel */
public class FollowPageFirstFrameViewModel extends C0063u {

    /* renamed from: a */
    public String f111361a = "click";

    /* renamed from: b */
    public long f111362b;

    /* renamed from: c */
    private HashMap<String, Boolean> f111363c = new HashMap<>();

    /* renamed from: d */
    private int f111364d = 0;

    /* renamed from: e */
    private boolean m136069e() {
        if (this.f111364d == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m136068d() {
        if (C6399b.m19944t() || !m136069e()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo104572b() {
        if (m136068d()) {
            m136067a("request_to_response");
        }
    }

    /* renamed from: a */
    public final void mo104571a() {
        if (m136068d()) {
            m136067a("click_to_request");
        }
    }

    /* renamed from: c */
    public final void mo104573c() {
        if (m136068d()) {
            m136067a("response_to_play");
            this.f111362b = 0;
        }
    }

    /* renamed from: a */
    public static FollowPageFirstFrameViewModel m136066a(FragmentActivity fragmentActivity) {
        return (FollowPageFirstFrameViewModel) C0069x.m159a(fragmentActivity).mo147a(FollowPageFirstFrameViewModel.class);
    }

    /* renamed from: a */
    private void m136067a(String str) {
        if (!this.f111363c.containsKey(str)) {
            this.f111363c.put(str, Boolean.valueOf(true));
            if (this.f111362b != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - this.f111362b;
                this.f111362b = currentTimeMillis;
                C6907h.m21524a("video_load_duration", (Map) C22984d.m75611a().mo59973a("enter_method", this.f111361a).mo59971a("duration", j).mo59973a("duration_type", str).f60753a);
            }
        }
    }
}
