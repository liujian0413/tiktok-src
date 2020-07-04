package com.bytedance.android.live.broadcast.effect.sticker.p138ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.broadcast.api.p126b.C2424d.C2426b;
import com.bytedance.android.live.broadcast.effect.sticker.p137a.C2653a;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C3555a;
import com.bytedance.android.livesdk.chatroom.viewmodule.p221a.p222a.C5570c;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.c */
public class C2686c extends Dialog implements OnCheckedChangeListener, C2684a {

    /* renamed from: a */
    public SwitchCompat f8547a;

    /* renamed from: b */
    public LoadingStatusView f8548b;

    /* renamed from: c */
    public RecyclerView f8549c;

    /* renamed from: d */
    public LiveGestureMagicPageAdapter f8550d;

    /* renamed from: e */
    public List<EffectCategoryResponse> f8551e;

    /* renamed from: f */
    private final C2653a f8552f;

    /* renamed from: g */
    private final DataCenter f8553g;

    /* renamed from: h */
    private View f8554h;

    /* renamed from: i */
    private boolean f8555i;

    /* renamed from: j */
    private View f8556j;

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo9368a(4);
        m10917a();
    }

    /* renamed from: a */
    private void m10917a() {
        this.f8548b.mo10830c();
        this.f8552f.mo8904a(C2418b.f7950a, new C2426b() {
            /* renamed from: a */
            public final void mo8910a() {
                C2686c.this.f8548b.mo10832e();
            }

            /* renamed from: a */
            public final void mo8911a(EffectChannelResponse effectChannelResponse) {
                C2686c.this.mo9368a(0);
                if (effectChannelResponse != null) {
                    List<EffectCategoryResponse> list = effectChannelResponse.categoryResponseList;
                    if (C6311g.m19573a(list)) {
                        C2686c.this.f8548b.mo10831d();
                        return;
                    }
                    if (list.size() > 3) {
                        LayoutParams layoutParams = C2686c.this.f8549c.getLayoutParams();
                        layoutParams.height = (int) C9738o.m28708b(C2686c.this.getContext(), 216.0f);
                        C2686c.this.f8549c.setLayoutParams(layoutParams);
                    }
                    C2686c.this.f8551e = list;
                    C2686c.this.f8548b.mo10828a();
                    C2686c.this.f8548b.setVisibility(8);
                    C2686c.this.f8550d.mo9354a(C2686c.this.f8551e);
                    C2686c.this.mo9371a(((Boolean) C8946b.f24417ap.mo22117a()).booleanValue());
                    if (((Boolean) C8946b.f24417ap.mo22117a()).booleanValue()) {
                        C2686c.this.f8550d.mo9352a();
                    }
                    C2686c.this.f8547a.setOnCheckedChangeListener(null);
                    C2686c.this.f8547a.setChecked(((Boolean) C8946b.f24417ap.mo22117a()).booleanValue());
                    C2686c.this.f8547a.setOnCheckedChangeListener(C2686c.this);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo9368a(int i) {
        this.f8556j.setVisibility(i);
        this.f8549c.setVisibility(i);
        this.f8547a.setVisibility(i);
    }

    /* renamed from: b */
    private void m10918b(boolean z) {
        this.f8555i = z;
        if (z) {
            this.f8553g.lambda$put$1$DataCenter("cmd_sticker_tip", getContext().getString(R.string.esl));
            this.f8550d.mo9352a();
            return;
        }
        this.f8553g.lambda$put$1$DataCenter("cmd_sticker_tip", "");
        this.f8550d.mo9355b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9369a(View view) {
        this.f8548b.mo10830c();
        m10917a();
    }

    /* renamed from: a */
    public final void mo9371a(boolean z) {
        int i;
        View view = this.f8554h;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5747j.m18104b().mo14164a(ToolbarButton.GESTURE_MAGIC, (C5735a) new C5570c(false));
        C5747j.m18103a().mo14164a(ToolbarButton.MORE, (C5735a) new C5570c(false));
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.ao8, null));
        getWindow().setLayout(-1, -2);
        getWindow().setGravity(80);
        setCanceledOnTouchOutside(true);
        this.f8556j = findViewById(R.id.dv3);
        this.f8547a = (SwitchCompat) findViewById(R.id.aq9);
        this.f8547a.setThumbResource(R.drawable.cht);
        this.f8547a.setTrackResource(R.drawable.chw);
        this.f8548b = (LoadingStatusView) findViewById(R.id.dav);
        this.f8549c = (RecyclerView) findViewById(R.id.cqp);
        this.f8549c.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f8549c.mo5525a((C1272h) new LiveGesturePageItemDecoration());
        this.f8550d = new LiveGestureMagicPageAdapter(this.f8552f);
        this.f8550d.f8519a = new C2688d(this);
        this.f8549c.setAdapter(this.f8550d);
        this.f8554h = findViewById(R.id.bzr);
        this.f8548b.setOnClickListener(C2689e.f8559a);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ay3, null, false);
        inflate.setOnClickListener(new C2690f(this));
        this.f8548b.setBuilder(C3555a.m13075a(getContext()).mo10834a((int) C9738o.m28708b(getContext(), 56.0f)).mo10839c(inflate));
    }

    public void show(C0608j jVar, String str) {
        show();
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C8946b.f24417ap.mo22118a(Boolean.valueOf(z));
        m10918b(z);
        mo9371a(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9370a(Boolean bool, C9355c cVar) {
        if (!bool.booleanValue()) {
            C2515f.m10417f().mo9074a().mo8898b(C2418b.f7950a, cVar);
        } else if (this.f8552f.mo8906a(cVar)) {
            C2515f.m10417f().mo9074a().mo8892a(C2418b.f7950a, cVar);
        }
    }

    public C2686c(Context context, C2653a aVar, DataCenter dataCenter) {
        super(context, R.style.z4);
        this.f8552f = aVar;
        this.f8553g = dataCenter;
        C8946b.f24414am.mo22118a(Boolean.valueOf(false));
    }
}
