package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.model.C2440e;
import com.bytedance.android.live.broadcast.api.p126b.C2424d;
import com.bytedance.android.live.broadcast.api.p126b.C2424d.C2425a;
import com.bytedance.android.live.broadcast.api.p126b.C2424d.C2426b;
import com.bytedance.android.live.broadcast.api.p128d.C2432b;
import com.bytedance.android.live.core.rxutils.autodispose.C3247af;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.app.dataholder.C3913e;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4517a.C4518a;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4517a.C4519b;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.utils.C9092w;
import com.bytedance.android.livesdk.widget.C9245h;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.facebook.imagepipeline.request.C13842b;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import p346io.reactivex.C47555ab;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ah */
public class C5182ah extends Dialog implements OnClickListener, OnSeekBarChangeListener, C2426b, C4519b {

    /* renamed from: a */
    public static final String f15212a = "ah";

    /* renamed from: A */
    private final C47562b f15213A = new C47562b();

    /* renamed from: b */
    public TextView f15214b;

    /* renamed from: c */
    public C2424d f15215c;

    /* renamed from: d */
    public LinkStickerAdapter f15216d;

    /* renamed from: e */
    protected boolean f15217e;

    /* renamed from: f */
    public C2425a f15218f = new C2425a() {
        /* renamed from: a */
        public final void mo8907a(String str, C9355c cVar) {
        }

        /* renamed from: b */
        public final void mo8908b(String str, C9355c cVar) {
            C5182ah.this.mo13431a(str, cVar, 3);
        }

        /* renamed from: c */
        public final void mo8909c(String str, C9355c cVar) {
            C5182ah.this.mo13431a(str, cVar, 2);
        }
    };

    /* renamed from: g */
    private Activity f15219g;

    /* renamed from: h */
    private HSImageView f15220h;

    /* renamed from: i */
    private C2432b f15221i;

    /* renamed from: j */
    private View f15222j;

    /* renamed from: k */
    private LottieAnimationView f15223k;

    /* renamed from: l */
    private ImageView f15224l;

    /* renamed from: m */
    private View f15225m;

    /* renamed from: n */
    private View f15226n;

    /* renamed from: o */
    private TextView f15227o;

    /* renamed from: p */
    private TextView f15228p;

    /* renamed from: q */
    private TextView f15229q;

    /* renamed from: r */
    private View f15230r;

    /* renamed from: s */
    private SeekBar f15231s;

    /* renamed from: t */
    private RecyclerView f15232t;

    /* renamed from: u */
    private View f15233u;

    /* renamed from: v */
    private C9245h f15234v;

    /* renamed from: w */
    private C4518a f15235w;

    /* renamed from: x */
    private int f15236x;

    /* renamed from: y */
    private boolean f15237y;

    /* renamed from: z */
    private DataCenter f15238z;

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo13434d() {
        C5191an.m16814a(this);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    /* renamed from: b */
    public final void mo12347b() {
        m16794b(false);
        dismiss();
        C9049ap.m27022a((int) R.string.cw7);
    }

    /* renamed from: a */
    public final void mo8910a() {
        mo13432a((List<C9355c>) new ArrayList<C9355c>());
    }

    /* renamed from: c */
    public final void mo13433c() {
        this.f15214b.setText(String.valueOf(this.f15231s.getProgress()));
        m16798i();
    }

    public void dismiss() {
        ((View) this.f15221i).setVisibility(4);
        this.f15222j.setVisibility(0);
        this.f15222j.post(new C5190am(this));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15235w.mo12659a(this);
        this.f15231s.setProgress(this.f15235w.mo12337a());
        this.f15217e = true;
    }

    public void onDetachedFromWindow() {
        this.f15235w.mo12661f();
        this.f15223k.mo7085f();
        this.f15215c.mo8903a();
        this.f15217e = false;
        this.f15213A.mo119660a();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo13436e() {
        if (this.f15217e) {
            this.f15236x = C9738o.m28691a(getContext());
            View findViewById = this.f15226n.findViewById(R.id.c9v);
            LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = this.f15236x;
            findViewById.setLayoutParams(layoutParams);
            this.f15215c.mo8904a(C2418b.f7952c, this);
            m16795f();
        }
    }

    /* renamed from: f */
    private void m16795f() {
        m16791a(true);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f15230r.getLayoutParams();
        layoutParams.f476k = R.id.l3;
        layoutParams.f472g = R.id.l3;
        layoutParams.f469d = R.id.l3;
        this.f15230r.setLayoutParams(layoutParams);
        this.f15231s.setVisibility(0);
        this.f15214b.setVisibility(0);
        this.f15232t.setVisibility(8);
        this.f15233u.setVisibility(8);
        this.f15227o.setTextColor(-1);
        this.f15228p.setTextColor(-2130706433);
        this.f15229q.setTextColor(-2130706433);
    }

    /* renamed from: g */
    private void m16796g() {
        m16791a(true);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f15230r.getLayoutParams();
        layoutParams.f476k = R.id.dbi;
        layoutParams.f472g = R.id.dbi;
        layoutParams.f469d = R.id.dbi;
        this.f15230r.setLayoutParams(layoutParams);
        this.f15231s.setVisibility(8);
        this.f15214b.setVisibility(8);
        this.f15232t.setVisibility(0);
        this.f15233u.setVisibility(8);
        this.f15227o.setTextColor(-2130706433);
        this.f15228p.setTextColor(-1);
        this.f15229q.setTextColor(-2130706433);
    }

    /* renamed from: h */
    private void m16797h() {
        m16791a(false);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f15230r.getLayoutParams();
        layoutParams.f476k = R.id.hr;
        layoutParams.f472g = R.id.hr;
        layoutParams.f469d = R.id.hr;
        this.f15230r.setLayoutParams(layoutParams);
        this.f15231s.setVisibility(8);
        this.f15214b.setVisibility(8);
        this.f15232t.setVisibility(8);
        this.f15233u.setVisibility(0);
        this.f15227o.setTextColor(-2130706433);
        this.f15228p.setTextColor(-2130706433);
        this.f15229q.setTextColor(-1);
    }

    /* renamed from: i */
    private void m16798i() {
        int i;
        if (this.f15231s.getWidth() == 0 || this.f15214b.getWidth() == 0) {
            this.f15214b.invalidate();
        }
        Rect bounds = this.f15231s.getThumb().getBounds();
        if (C3519c.m12965a(getContext())) {
            i = -((this.f15231s.getWidth() - bounds.centerX()) - (this.f15214b.getWidth() / 2));
        } else {
            i = bounds.centerX() - (this.f15214b.getWidth() / 2);
        }
        this.f15214b.setTranslationX((float) i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo13432a(List<C9355c> list) {
        if (list.isEmpty()) {
            list.add(new C9355c());
            return;
        }
        list.add(0, new C9355c());
        this.f15216d = new LinkStickerAdapter(getContext(), list, new C5094a() {
            /* renamed from: b */
            public final void mo13236b(C9355c cVar) {
                C5182ah.this.mo13430a(cVar);
            }

            /* renamed from: a */
            public final void mo13235a(C9355c cVar) {
                if (C5182ah.this.f15215c.mo8906a(cVar)) {
                    C5182ah.this.f15216d.mo13233a(C2418b.f7952c, cVar, 2);
                } else {
                    C5182ah.this.f15215c.mo8905a(C2418b.f7952c, cVar, C5182ah.this.f15218f);
                }
            }
        });
        this.f15232t.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f15232t.setAdapter(this.f15216d);
    }

    /* renamed from: a */
    public final void mo8911a(EffectChannelResponse effectChannelResponse) {
        ((C3247af) C7492s.m23300b((Iterable<? extends T>) effectChannelResponse.allCategoryEffects).mo19317d(C5187aj.f15243a).mo19334m().mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a()).mo19131a((C47555ab<T, ? extends R>) C3255e.m12296a((View) this.f15232t))).mo10187a(new C5188ak(this), C5189al.f15245a);
    }

    /* renamed from: a */
    private void m16791a(boolean z) {
        if (z) {
            ((View) this.f15221i).setVisibility(0);
            this.f15225m.setVisibility(0);
            this.f15220h.setVisibility(4);
            this.f15223k.setVisibility(4);
            this.f15223k.mo7085f();
            this.f15224l.setVisibility(4);
            this.f15235w.mo12338a(1);
            return;
        }
        ((View) this.f15221i).setVisibility(4);
        this.f15225m.setVisibility(4);
        this.f15220h.setVisibility(0);
        this.f15223k.setVisibility(0);
        this.f15223k.mo7078b();
        if (!this.f15237y) {
            ImageModel c = this.f15235w.mo12343c();
            C5343e.m17039a(this.f15220h, c, (C13842b) new C9092w(5, 0.0f, null));
            C5343e.m17045b(this.f15224l, c, this.f15224l.getWidth(), this.f15224l.getHeight(), R.drawable.c4_);
            this.f15237y = true;
        }
        this.f15224l.setVisibility(0);
        this.f15235w.mo12338a(2);
    }

    /* renamed from: b */
    private void m16794b(boolean z) {
        if (z) {
            if (this.f15234v == null) {
                this.f15234v = new C9249a(getContext(), 2).mo22718b((int) R.string.eu0).mo22720b();
            }
            if (!this.f15234v.isShowing()) {
                this.f15234v.show();
            }
        } else if (this.f15234v != null && this.f15234v.isShowing()) {
            this.f15234v.dismiss();
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.so) {
            C3913e.m13800a().f11720f = !C3913e.m13800a().f11720f;
            this.f15221i.mo8937e_();
        } else if (id == R.id.x_) {
            dismiss();
        } else if (id == R.id.l3) {
            m16795f();
        } else if (id == R.id.dbi) {
            m16796g();
        } else if (id == R.id.hr) {
            m16797h();
        } else {
            if (id == R.id.h2) {
                if (!this.f15235w.mo12344d()) {
                    m16794b(true);
                    this.f15235w.mo12345e();
                } else if (!C9290a.f25466a || !C3519c.m12965a(getContext())) {
                    this.f15226n.scrollTo(this.f15236x, 0);
                } else {
                    this.f15226n.scrollTo(-this.f15236x, 0);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13430a(C9355c cVar) {
        if (!TextUtils.equals(cVar.f25577p, this.f15235w.mo12341b())) {
            this.f15235w.mo12340a(cVar.f25577p);
            ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).composerManager().mo8897b(C2418b.f7952c);
            if (TextUtils.equals(cVar.f25577p, "")) {
                this.f15235w.mo12339a((C9355c) null);
            } else {
                ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).composerManager().mo8892a(C2418b.f7952c, cVar);
                this.f15235w.mo12339a(cVar);
            }
            C2440e eVar = new C2440e("liveinteract", cVar);
            if (this.f15238z != null) {
                this.f15238z.lambda$put$1$DataCenter("cmd_sticker_is_selected", eVar);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.anv);
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setGravity(80);
        }
        this.f15221i = (C2432b) findViewById(R.id.cj9);
        this.f15222j = findViewById(R.id.cj2);
        this.f15220h = (HSImageView) findViewById(R.id.ii);
        this.f15223k = (LottieAnimationView) findViewById(R.id.hm);
        this.f15224l = (ImageView) findViewById(R.id.ic);
        this.f15225m = findViewById(R.id.so);
        this.f15226n = findViewById(R.id.c9x);
        this.f15227o = (TextView) findViewById(R.id.l3);
        this.f15228p = (TextView) findViewById(R.id.dbi);
        this.f15229q = (TextView) findViewById(R.id.hr);
        this.f15230r = findViewById(R.id.b0p);
        this.f15231s = (SeekBar) findViewById(R.id.l1);
        this.f15214b = (TextView) findViewById(R.id.l2);
        this.f15232t = (RecyclerView) findViewById(R.id.dbc);
        this.f15233u = findViewById(R.id.hn);
        this.f15225m.setOnClickListener(this);
        findViewById(R.id.x_).setOnClickListener(this);
        this.f15227o.setOnClickListener(this);
        this.f15228p.setOnClickListener(this);
        this.f15229q.setOnClickListener(this);
        this.f15231s.setOnSeekBarChangeListener(this);
        findViewById(R.id.h2).setOnClickListener(this);
        this.f15214b.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                C5182ah.this.mo13433c();
                C5182ah.this.f15214b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        this.f15223k.setAnimation("audio_interact_effect.json");
        this.f15223k.mo7082c(true);
        this.f15226n.post(new C5186ai(this));
    }

    /* renamed from: a */
    public final void mo12346a(Throwable th) {
        m16794b(false);
        C9076n.m27096a(getContext(), th, (int) R.string.ety);
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (i >= 0 && i <= seekBar.getMax() && z) {
            mo13433c();
            this.f15235w.mo12342b(i);
            this.f15221i.mo8936a(i);
        }
    }

    public C5182ah(Activity activity, C4518a aVar, DataCenter dataCenter) {
        super(activity, R.style.xy);
        this.f15219g = activity;
        this.f15235w = aVar;
        this.f15238z = dataCenter;
        this.f15215c = ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).stickerPresenter();
    }

    /* renamed from: a */
    public final void mo13431a(String str, C9355c cVar, int i) {
        if (C2418b.f7952c.equals(str)) {
            this.f15216d.mo13233a(str, cVar, i);
        }
    }
}
