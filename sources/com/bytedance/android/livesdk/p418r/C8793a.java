package com.bytedance.android.livesdk.p418r;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.kickout.C8363a;
import com.bytedance.android.livesdk.kickout.C8370b;
import com.bytedance.android.livesdk.kickout.p398a.C8369b;
import com.bytedance.android.livesdk.kickout.p399b.C8371a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.utils.C9076n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.r.a */
public final class C8793a extends Dialog implements OnClickListener, C8370b {

    /* renamed from: a */
    private TextView f23886a;

    /* renamed from: b */
    private TextView f23887b;

    /* renamed from: c */
    private C8363a f23888c;

    /* renamed from: d */
    private long f23889d;

    /* renamed from: e */
    private long f23890e;

    /* renamed from: f */
    private long f23891f;

    /* renamed from: g */
    private Context f23892g;

    /* renamed from: a */
    public final void mo21517a() {
    }

    /* renamed from: a */
    public final void mo21518a(C8371a aVar, Exception exc) {
    }

    /* renamed from: b */
    public final void mo21520b() {
    }

    /* renamed from: d */
    private void m26353d() {
        if (!C8794b.m26360a(this.f23892g)) {
            C3517a.m12960a(this.f23892g, (int) R.string.efp);
        } else {
            this.f23888c.mo21512a(true, this.f23889d, this.f23891f);
        }
    }

    /* renamed from: c */
    private void m26352c() {
        this.f23886a = (TextView) findViewById(R.id.dr7);
        this.f23887b = (TextView) findViewById(R.id.dwf);
        this.f23886a.setOnClickListener(this);
        this.f23887b.setOnClickListener(this);
        this.f23888c = new C8363a();
        this.f23888c.f22924a = this;
    }

    /* renamed from: e */
    private Map<String, String> m26354e() {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(this.f23890e));
        hashMap.put("room_id", String.valueOf(this.f23889d));
        hashMap.put("user_id", String.valueOf(this.f23891f));
        return hashMap;
    }

    /* renamed from: b */
    public final void mo21521b(boolean z) {
        if (isShowing()) {
            dismiss();
            C9097a.m27146a().mo22267a((Object) new C8795c(0));
        }
        C9097a.m27146a().mo22267a((Object) new C8369b(true, this.f23891f));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.ao2, null));
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
            window.setLayout(-2, -2);
        }
        m26352c();
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.dwf) {
            m26353d();
            C8443c.m25663a().mo21606a("blacklist_toast_click", m26354e(), new C8438j().mo21599b("relation").mo21603f("click").mo21602e("live_detail").mo21604g("yes"));
            return;
        }
        if (id == R.id.dr7) {
            C8443c.m25663a().mo21606a("blacklist_toast_click", m26354e(), new C8438j().mo21599b("relation").mo21603f("click").mo21602e("live_detail").mo21604g("no"));
            if (isShowing()) {
                dismiss();
            }
            C9097a.m27146a().mo22267a((Object) new C8795c(1));
        }
    }

    /* renamed from: a */
    public final void mo21519a(boolean z, Exception exc) {
        C9076n.m27095a(getContext(), exc);
        if (isShowing()) {
            dismiss();
            C9097a.m27146a().mo22267a((Object) new C8795c(0));
        }
    }

    public C8793a(Context context, long j, long j2, long j3) {
        super(context, R.style.yv);
        this.f23892g = context;
        this.f23889d = j;
        this.f23890e = j2;
        this.f23891f = j3;
    }
}
