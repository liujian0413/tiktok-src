package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.setting.C3332f;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.common.C5857c;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8431c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.user.C8976b.C8977a;
import com.bytedance.android.livesdk.user.C8980d.C8983b;
import com.bytedance.android.livesdk.user.C8985f;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9074l;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p437d.C9295a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dt */
public class C5288dt extends C5857c implements OnClickListener {

    /* renamed from: a */
    public static final String f15455a = "dt";

    /* renamed from: b */
    public TextView f15456b;

    /* renamed from: c */
    public boolean f15457c;

    /* renamed from: d */
    public boolean f15458d;

    /* renamed from: e */
    public DataCenter f15459e;

    /* renamed from: g */
    private Room f15460g;

    /* renamed from: h */
    private User f15461h;

    /* renamed from: i */
    private Activity f15462i;

    /* renamed from: j */
    private String f15463j;

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15458d = true;
    }

    public void onDetachedFromWindow() {
        this.f15458d = false;
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    private void m16943a() {
        if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", "live_detail");
            bundle.putString("action_type", "follow");
            bundle.putString("source", "live");
            bundle.putString("v1_source", "follow");
            TTLiveSDKContext.getHostService().mo22367h().mo22167a(getContext(), C8987h.m26865a().mo22189a(C3332f.m12427a()).mo22191b(C3332f.m12428b()).mo22193d("live_detail").mo22194e("follow").mo22192c("live").mo22188a(-1).mo22190a()).mo19189a((C7498y<? super T>) new C8986g<Object>());
        } else if (!this.f15457c) {
            if (C9074l.m27086b(this.f15459e)) {
                C3596c.m13172a(C9295a.class);
                C9074l.m27087c(this.f15459e);
            }
            TTLiveSDKContext.getHostService().mo22367h().mo22169a(((C8983b) ((C8983b) ((C8983b) ((C8983b) ((C8983b) ((C8983b) ((C8983b) ((C8983b) ((C8977a) C8985f.m26862b().mo22153a(this.f15461h.getId())).mo22154a(this.f15460g.getRequestId())).mo22157b("live_detail")).mo22158c("live_follow_popup")).mo22156b(this.f15460g.getId())).mo22159d(this.f15460g.getLabels())).mo22161a(this.f15462i)).mo22162e("live_detail")).mo22163f("follow")).mo22164c()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C7498y<FollowPair>() {
                public final void onComplete() {
                }

                public final void onSubscribe(C7321c cVar) {
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onNext(FollowPair followPair) {
                    if (C5288dt.this.f15458d) {
                        C5288dt.this.f15457c = false;
                        C5288dt.this.f15456b.setText(R.string.cw1);
                        C5288dt.this.dismiss();
                        C9049ap.m27022a((int) R.string.cw1);
                    }
                }

                public final void onError(Throwable th) {
                    if (C5288dt.this.f15458d) {
                        C5288dt.this.f15457c = false;
                        C9076n.m27095a(C5288dt.this.getContext(), th);
                    }
                }
            });
            this.f15457c = true;
            long intValue = (long) ((Integer) C5864b.f17248C.mo10240a()).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put("follow_notice_duration", String.valueOf(intValue));
            hashMap.put("growth_deepevent", "1");
            C8443c.m25663a().mo21606a("follow", hashMap, new C8431c("live_follow_popup", this.f15461h.getId()), new C8438j().mo21599b("live_interact").mo21598a("live_detail"), Room.class);
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.anj) {
            m16943a();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.aov);
        ImageView imageView = (ImageView) findViewById(R.id.ic);
        TextView textView = (TextView) findViewById(R.id.c33);
        ((HSImageView) findViewById(R.id.g0)).setVisibility(8);
        TextView textView2 = (TextView) findViewById(R.id.a7m);
        this.f15456b = (TextView) findViewById(R.id.anj);
        this.f15456b.setOnClickListener(this);
        C5343e.m17031a(imageView, this.f15461h.getAvatarThumb(), (int) R.drawable.cdk);
        textView.setText(this.f15461h.displayId);
        textView2.setText(R.string.cw3);
    }

    public C5288dt(Activity activity, boolean z, Room room, String str) {
        super(activity, z);
        this.f15462i = activity;
        this.f15460g = room;
        this.f15461h = room.getOwner();
        this.f15463j = str;
    }
}
