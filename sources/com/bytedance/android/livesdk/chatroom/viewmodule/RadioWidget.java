package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.room.C3484c.C3485a;
import com.bytedance.android.livesdk.chatroom.event.C4451u;
import com.bytedance.android.livesdk.chatroom.interact.C4490ao;
import com.bytedance.android.livesdk.chatroom.p220ui.C5286ds;
import com.bytedance.android.livesdk.chatroom.p220ui.C5286ds.C5287a;
import com.bytedance.android.livesdk.chatroom.presenter.RadioViewPresenter;
import com.bytedance.android.livesdk.chatroom.presenter.RadioViewPresenter.C4933a;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.chatroom.viewmodule.p221a.p222a.C5572e;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9080r;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;

public class RadioWidget extends LiveRecyclableWidget implements OnClickListener, C4490ao, C4933a, C5287a {

    /* renamed from: c */
    private static final String f16433c = "RadioWidget";

    /* renamed from: a */
    public RadioViewPresenter f16434a;

    /* renamed from: b */
    public C9080r f16435b;

    /* renamed from: d */
    private Room f16436d;

    /* renamed from: e */
    private boolean f16437e;

    /* renamed from: f */
    private boolean f16438f;

    /* renamed from: g */
    private boolean f16439g;

    /* renamed from: h */
    private ImageView f16440h;

    /* renamed from: i */
    private LottieAnimationView f16441i;

    /* renamed from: j */
    private View f16442j;

    /* renamed from: k */
    private ImageView f16443k;

    /* renamed from: l */
    private ImageView f16444l;

    /* renamed from: m */
    private TextView f16445m;

    /* renamed from: n */
    private HSImageView f16446n;

    /* renamed from: o */
    private LayoutParams f16447o;

    /* renamed from: p */
    private LayoutParams f16448p;

    /* renamed from: q */
    private C0053p<KVData> f16449q = new C5698el(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.RadioWidget$a */
    class C5537a implements C5739a {

        /* renamed from: b */
        private View f16452b;

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
        }

        private C5537a() {
        }

        public final void onClick(View view) {
            RadioWidget.this.f16434a.mo12906d();
        }

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
            if (this.f16452b != null && (aVar instanceof C5572e)) {
                this.f16452b.setVisibility(((C5572e) aVar).f16625a);
            }
        }

        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
            this.f16452b = view;
        }
    }

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.axe;
    }

    /* renamed from: h */
    public final void mo13549h() {
        mo12910b();
    }

    /* renamed from: j */
    private void m17831j() {
        this.f16434a.mo12906d();
    }

    /* renamed from: a */
    public final Room mo12908a() {
        return this.f16436d;
    }

    /* renamed from: c */
    public final void mo12911c() {
        C5286ds dsVar = new C5286ds(this.context);
        dsVar.f15454a = this;
        dsVar.show();
    }

    /* renamed from: g */
    public final void mo12914g() {
        if (this.f16437e) {
            C9049ap.m27022a((int) R.string.f0v);
        }
    }

    public void onUnload() {
        this.f16434a.mo8963a();
        this.f16441i.mo7085f();
        this.dataCenter.removeObserver("cmd_interact_audio", this.f16449q);
    }

    /* renamed from: b */
    public final void mo12910b() {
        C9080r rVar = new C9080r((Activity) this.context, null, "radio_cover", 12, 7, 12, 7, new C3485a() {
            /* renamed from: f_ */
            public final void mo9628f_() {
                RadioWidget.this.f16435b.mo10472b();
            }

            /* renamed from: a */
            public final void mo9627a(String str, String str2) {
                RadioWidget.this.f16435b.mo10470a();
                RadioWidget.this.f16434a.mo12902a(str);
                C8443c.m25663a().mo21607a("background_pic_confirm", new C8438j().mo21598a("live_take_detail").mo21599b("live_take"), Room.class);
            }
        });
        this.f16435b = rVar;
        this.f16435b.mo10473c();
    }

    /* renamed from: d */
    public final void mo12912d() {
        this.f16435b.mo10472b();
        C9049ap.m27022a((int) R.string.f0x);
        HashMap hashMap = new HashMap();
        hashMap.put("is_success", "1");
        C8443c.m25663a().mo21606a("background_pic_upload", hashMap, new C8438j().mo21598a("live_take_detail").mo21599b("live_take"), Room.class);
    }

    /* renamed from: f */
    public final void mo12913f() {
        this.f16435b.mo10472b();
        C9049ap.m27022a((int) R.string.f0w);
        HashMap hashMap = new HashMap();
        hashMap.put("is_success", "0");
        C8443c.m25663a().mo21606a("background_pic_upload", hashMap, new C8438j().mo21598a("live_take_detail").mo21599b("live_take"), Room.class);
    }

    /* renamed from: i */
    public final void mo13550i() {
        new C9249a(this.context).mo22716a(true).mo22718b((int) R.string.f0u).mo22722b(0, (int) R.string.f0t, (DialogInterface.OnClickListener) new C5700en(this)).mo22722b(1, (int) R.string.f0q, C5701eo.f16794a).mo22729d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13998a(Long l) throws Exception {
        this.f16440h.setVisibility(0);
        this.f16440h.setOnClickListener(this);
        this.f16446n.setOnClickListener(this);
        this.f16441i.setVisibility(0);
        this.f16441i.mo7078b();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.cms || id == R.id.cmt) {
            if (this.f16437e && !this.f16439g && !C9290a.f25466a) {
                m17831j();
            } else if (!this.f16437e && this.f16439g && this.dataCenter != null) {
                this.dataCenter.lambda$put$1$DataCenter("cmd_send_gift", this.f16436d.getOwner());
            }
        }
    }

    /* renamed from: a */
    public final void mo12909a(String str) {
        this.f16436d.getOwner().setBackgroundImgUrl(str);
        if (TextUtils.isEmpty(str)) {
            this.f16446n.setVisibility(4);
            C5343e.m17043b(this.f16440h, this.f16436d.getOwner().getAvatarLarge());
            return;
        }
        if (!this.f16439g) {
            this.f16446n.setVisibility(0);
        } else {
            this.f16446n.setVisibility(4);
        }
        C5343e.m17040a(this.f16446n, str);
    }

    public void onInit(Object... objArr) {
        this.f16434a = new RadioViewPresenter(this.context);
        this.f16440h = (ImageView) this.contentView.findViewById(R.id.cms);
        this.f16442j = this.contentView.findViewById(R.id.j3);
        this.f16445m = (TextView) this.contentView.findViewById(R.id.fp);
        this.f16443k = (ImageView) this.contentView.findViewById(R.id.d6t);
        this.f16444l = (ImageView) this.contentView.findViewById(R.id.d6u);
        this.f16441i = (LottieAnimationView) this.contentView.findViewById(R.id.cmw);
        this.f16441i.setAnimation("audio_interact_effect.json");
        this.f16441i.mo7082c(true);
        this.f16446n = (HSImageView) this.contentView.findViewById(R.id.cmt);
    }

    public void onLoad(Object... objArr) {
        long j;
        this.f16441i.setVisibility(4);
        this.f16442j.setVisibility(0);
        this.f16440h.setVisibility(4);
        this.f16443k.setVisibility(8);
        this.f16444l.setVisibility(8);
        this.f16445m.setVisibility(8);
        this.f16446n.setVisibility(8);
        this.f16436d = (Room) this.dataCenter.get("data_room");
        this.f16437e = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        C5343e.m17043b(this.f16440h, this.f16436d.getOwner().getAvatarLarge());
        if (TextUtils.isEmpty(this.f16436d.getOwner().getBackgroundImgUrl())) {
            C5343e.m17043b(this.f16440h, this.f16436d.getOwner().getAvatarLarge());
        } else {
            C5343e.m17040a(this.f16446n, this.f16436d.getOwner().getBackgroundImgUrl());
            this.f16446n.setVisibility(0);
        }
        if (this.f16437e) {
            j = 3500;
        } else {
            j = 500;
        }
        C7492s.m23295b(j, TimeUnit.MILLISECONDS).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C5699em<Object>(this));
        this.dataCenter.observeForever("cmd_interact_audio", this.f16449q);
        this.dataCenter.lambda$put$1$DataCenter("cmd_live_radio", new C4451u(true));
        C5747j.m18103a().mo14165a(ToolbarButton.RADIO_COVER, (C5739a) new C5537a());
        this.f16434a.mo9142a((C4933a) this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13997a(KVData kVData) {
        if (isViewValid() && kVData != null) {
            C4451u uVar = (C4451u) kVData.getData();
            if (this.f16447o == null) {
                this.f16447o = (LayoutParams) this.f16442j.getLayoutParams();
                this.f16448p = (LayoutParams) this.f16441i.getLayoutParams();
            }
            if (uVar.f12911a) {
                this.f16439g = true;
                LayoutParams layoutParams = new LayoutParams(this.f16447o.width, this.f16447o.height, this.f16447o.gravity);
                layoutParams.topMargin = C3358ac.m12526d(R.dimen.sg);
                layoutParams.height = (int) this.context.getResources().getDimension(R.dimen.sh);
                layoutParams.width = (int) this.context.getResources().getDimension(R.dimen.sh);
                this.f16442j.setLayoutParams(layoutParams);
                LayoutParams layoutParams2 = new LayoutParams(this.f16448p.width, this.f16448p.height, this.f16448p.gravity);
                layoutParams2.topMargin = C3358ac.m12526d(R.dimen.se);
                layoutParams2.height = (int) this.context.getResources().getDimension(R.dimen.sf);
                layoutParams2.width = (int) this.context.getResources().getDimension(R.dimen.sf);
                this.f16441i.setLayoutParams(layoutParams2);
                this.f16441i.setVisibility(4);
                this.f16441i.mo7085f();
                this.f16445m.setVisibility(0);
                this.f16446n.setVisibility(8);
                return;
            }
            this.f16439g = false;
            this.f16442j.setLayoutParams(this.f16447o);
            this.f16441i.setLayoutParams(this.f16448p);
            this.f16441i.setVisibility(0);
            this.f16441i.mo7078b();
            this.f16445m.setVisibility(8);
            if (this.f16443k.getVisibility() == 0) {
                this.f16443k.setVisibility(8);
                this.f16444l.setVisibility(8);
            }
            if (TextUtils.isEmpty(this.f16436d.getOwner().getBackgroundImgUrl())) {
                this.f16446n.setVisibility(4);
            } else {
                this.f16446n.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13999b(DialogInterface dialogInterface, int i) {
        try {
            this.f16434a.mo12904b();
        } catch (Exception unused) {
            C9049ap.m27022a((int) R.string.f0s);
        }
        dialogInterface.dismiss();
    }

    /* renamed from: a */
    public final void mo12255a(long j, boolean z) {
        if (this.f16438f != z) {
            this.f16438f = z;
            if (!this.f16438f || this.f16444l.getVisibility() != 8) {
                this.f16441i.setVisibility(4);
                this.f16441i.mo7085f();
            } else {
                this.f16441i.setVisibility(0);
                this.f16441i.mo7078b();
            }
        }
    }

    /* renamed from: b */
    public final void mo12256b(long j, boolean z) {
        if (j == this.f16436d.getOwner().getId()) {
            if (!z || this.f16443k.getVisibility() != 8) {
                if (!z && this.f16443k.getVisibility() == 0) {
                    this.f16443k.setVisibility(8);
                    this.f16444l.setVisibility(8);
                }
                return;
            }
            this.f16443k.setVisibility(0);
            this.f16444l.setVisibility(0);
            this.f16441i.mo7085f();
            this.f16441i.setVisibility(4);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f16435b != null) {
            this.f16435b.mo10471a(i, i2, intent);
        }
    }
}
