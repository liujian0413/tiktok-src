package com.bytedance.android.live.broadcast.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3381c;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.widget.C9239c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.broadcast.dialog.g */
public final class C2532g extends C9239c implements OnClickListener {

    /* renamed from: c */
    private static final String f8162c = ((String) LiveConfigSettingKeys.LIVE_OBS_HELPER_URL.mo10240a());

    /* renamed from: a */
    public Room f8163a;

    /* renamed from: d */
    private String f8164d;

    /* renamed from: a */
    public final int mo9100a() {
        return R.layout.an5;
    }

    /* renamed from: a */
    private static void m10456a(String str) {
        try {
            C3381c.m12568a(str);
            C9049ap.m27022a((int) R.string.ept);
        } catch (Exception unused) {
            C9049ap.m27022a((int) R.string.epr);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TextView textView = (TextView) findViewById(R.id.e8d);
        TextView textView2 = (TextView) findViewById(R.id.dvj);
        findViewById(R.id.a2w).setOnClickListener(this);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        textView.setText(this.f8164d);
        View findViewById = findViewById(R.id.ab3);
        View findViewById2 = findViewById(R.id.aan);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.dvj) {
            ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(getContext(), C3979c.m13952b(f8162c).mo11550a(C3358ac.m12515a((int) R.string.eyl)));
            C8443c.m25663a().mo21607a("thirdparty_take_guide", new C8438j().mo21599b("live").mo21603f("click").mo21598a("live_take_page"));
        } else if (id == R.id.a2w || id == R.id.e8d) {
            m10456a(this.f8164d);
        } else {
            if (id == R.id.ab3 || id == R.id.aan) {
                m10456a(C3358ac.m12515a((int) R.string.f8h));
            }
        }
    }

    public C2532g(Context context, String str, Room room) {
        super(context);
        this.f8164d = str;
        this.f8163a = room;
        int indexOf = this.f8164d.indexOf("signature");
        if (indexOf != -1) {
            int indexOf2 = this.f8164d.indexOf(61, indexOf) + 1;
            int indexOf3 = this.f8164d.indexOf(38, indexOf2);
            if (indexOf3 == -1) {
                indexOf3 = this.f8164d.length();
            }
            String substring = this.f8164d.substring(indexOf2, indexOf3);
            StringBuilder sb = new StringBuilder(this.f8164d);
            sb.replace(indexOf2, indexOf3, substring.replace("%", "%25"));
            this.f8164d = sb.toString();
        }
    }
}
