package com.bytedance.android.livesdk.chatroom.end;

import android.app.Activity;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.C1642a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.C2412a;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.room.C3489f;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.browser.p193c.C3972b;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3978e;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p438a.C9297a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class NewLiveBroadcastEndFragment extends LiveEndFragment implements C3489f {

    /* renamed from: a */
    private FrameLayout f12770a;

    /* renamed from: b */
    private Room f12771b;

    /* renamed from: c */
    private C3978e f12772c;

    /* renamed from: d */
    private long f12773d;

    /* renamed from: e */
    private long f12774e;

    /* renamed from: a */
    public final void mo10495a(C2412a aVar) {
    }

    public void onPause() {
        super.onPause();
        this.f12774e += SystemClock.elapsedRealtime() - this.f12773d;
    }

    public void onResume() {
        super.onResume();
        this.f12773d = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    private void m14804a() {
        this.f12770a = (FrameLayout) mo12105a(R.id.dv);
        mo12105a(R.id.k2).setOnClickListener(new C4403i(this));
        m14805b();
    }

    public void onDestroy() {
        super.onDestroy();
        ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11539a(this.f12772c);
        m14807f();
    }

    /* renamed from: f */
    private void m14807f() {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", String.valueOf(this.f12774e));
        C8443c.m25663a().mo21606a("live_end_duration", hashMap, C8438j.class, Room.class);
    }

    /* renamed from: b */
    private void m14805b() {
        C3972b webViewManager = ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager();
        if (this.f12772c == null) {
            this.f12772c = webViewManager.mo11534a((Activity) getActivity(), C4404j.f12810a);
            if (VERSION.SDK_INT <= 19) {
                this.f12772c.f11853a.setLayerType(1, null);
            }
            this.f12772c.f11853a.setBackgroundColor(0);
            this.f12772c.f11853a.setLayoutParams(this.f12770a.getLayoutParams());
            this.f12770a.addView(this.f12772c.f11853a);
        }
        webViewManager.mo11540a(this.f12772c, Uri.parse(m14806e()).buildUpon().toString());
    }

    /* renamed from: e */
    private String m14806e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12771b.finish_url);
        sb.append("?anchor_avatar=%s");
        String sb2 = sb.toString();
        String str = "";
        if (this.f12771b.getOwner() != null) {
            ImageModel avatarLarge = this.f12771b.getOwner().getAvatarLarge();
            if (avatarLarge != null) {
                List urls = avatarLarge.getUrls();
                if (urls != null && urls.size() > 0) {
                    str = (String) urls.get(0);
                }
            }
            try {
                str = URLEncoder.encode(str, "utf-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return C1642a.m8035a(Locale.US, sb2, new Object[]{str});
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12116a(View view) {
        mo12107d();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f12771b != null && !TextUtils.isEmpty(this.f12771b.finish_url)) {
            m14804a();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(getContext()).inflate(R.layout.aqi, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo10494a(Activity activity, Room room, C9297a aVar, String str) {
        this.f12771b = room;
    }
}
