package com.p280ss.android.ugc.aweme.notification.p1433b;

import android.text.TextUtils;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.notification.b.a */
public final class C34407a {

    /* renamed from: a */
    private Map<String, String> f89819a = new HashMap();

    /* renamed from: b */
    private String f89820b;

    /* renamed from: c */
    private String f89821c;

    /* renamed from: d */
    private int f89822d;

    /* renamed from: e */
    private String f89823e;

    /* renamed from: f */
    private String f89824f;

    /* renamed from: g */
    private String f89825g;

    /* renamed from: h */
    private long f89826h;

    /* renamed from: i */
    private String f89827i;

    /* renamed from: j */
    private String f89828j;

    /* renamed from: k */
    private String f89829k;

    /* renamed from: l */
    private int f89830l;

    /* renamed from: m */
    private LogPbBean f89831m;

    /* renamed from: n */
    private String f89832n;

    /* renamed from: o */
    private String f89833o;

    /* renamed from: p */
    private String f89834p;

    /* renamed from: q */
    private String f89835q;

    /* renamed from: r */
    private String f89836r;

    /* renamed from: b */
    private void m111270b() {
        m111269a("action_type", this.f89820b);
        m111269a("account_type", this.f89821c);
        m111269a("client_order", String.valueOf(this.f89822d));
        m111269a("notice_type", this.f89823e);
        m111269a("notification_type", this.f89824f);
        m111269a("message_time", String.valueOf(this.f89826h));
        m111269a("from_user_id", this.f89827i);
        m111269a("from_item", this.f89828j);
        m111269a("from_item_id", this.f89829k);
        m111269a("is_together", String.valueOf(this.f89830l));
        m111269a("enter_from", this.f89834p);
        if (!TextUtils.isEmpty(this.f89833o)) {
            m111269a("scene_id", this.f89833o);
        }
        if (!TextUtils.isEmpty(this.f89835q)) {
            m111269a("tab_name", this.f89835q);
        }
        if (!TextUtils.isEmpty(this.f89832n)) {
            m111269a("timeline", this.f89832n);
        }
        if (!TextUtils.isEmpty(this.f89825g)) {
            m111269a("follow_button", this.f89825g);
        }
        if (!TextUtils.isEmpty(this.f89836r)) {
            m111269a("explain_relation", this.f89836r);
        }
        if (this.f89831m != null) {
            m111269a("log_pb", new C6600e().mo15979b((Object) this.f89831m));
        }
    }

    /* renamed from: a */
    public final void mo87705a() {
        m111270b();
        C6907h.m21524a("notification_message_inner_message", (Map) this.f89819a);
    }

    /* renamed from: a */
    public final C34407a mo87700a(int i) {
        this.f89822d = i;
        return this;
    }

    /* renamed from: b */
    public final C34407a mo87706b(int i) {
        this.f89830l = i;
        return this;
    }

    /* renamed from: c */
    public final C34407a mo87708c(String str) {
        this.f89824f = str;
        return this;
    }

    /* renamed from: d */
    public final C34407a mo87709d(String str) {
        this.f89825g = str;
        return this;
    }

    /* renamed from: e */
    public final C34407a mo87710e(String str) {
        this.f89827i = str;
        return this;
    }

    /* renamed from: f */
    public final C34407a mo87711f(String str) {
        this.f89828j = str;
        return this;
    }

    /* renamed from: g */
    public final C34407a mo87712g(String str) {
        this.f89829k = str;
        return this;
    }

    /* renamed from: h */
    public final C34407a mo87713h(String str) {
        this.f89832n = str;
        return this;
    }

    /* renamed from: i */
    public final C34407a mo87714i(String str) {
        this.f89833o = str;
        return this;
    }

    /* renamed from: j */
    public final C34407a mo87715j(String str) {
        this.f89834p = str;
        return this;
    }

    /* renamed from: k */
    public final C34407a mo87716k(String str) {
        this.f89835q = str;
        return this;
    }

    /* renamed from: l */
    public final C34407a mo87717l(String str) {
        this.f89836r = str;
        return this;
    }

    /* renamed from: b */
    public final C34407a mo87707b(String str) {
        this.f89821c = str;
        return this;
    }

    /* renamed from: a */
    public final C34407a mo87701a(long j) {
        this.f89826h = j;
        return this;
    }

    /* renamed from: a */
    public final C34407a mo87702a(LogPbBean logPbBean) {
        this.f89831m = logPbBean;
        return this;
    }

    /* renamed from: a */
    public final C34407a mo87703a(String str) {
        this.f89820b = str;
        return this;
    }

    /* renamed from: a */
    public final C34407a mo87704a(boolean z) {
        String str;
        if (z) {
            str = "yellow_dot";
        } else {
            str = "";
        }
        this.f89823e = str;
        return this;
    }

    /* renamed from: a */
    private void m111269a(String str, String str2) {
        this.f89819a.put(str, str2);
    }
}
