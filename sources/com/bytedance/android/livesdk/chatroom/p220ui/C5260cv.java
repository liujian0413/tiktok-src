package com.bytedance.android.livesdk.chatroom.p220ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C4430av;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.model.C4865aa;
import com.bytedance.android.livesdk.chatroom.model.C4930z;
import com.bytedance.android.livesdk.chatroom.presenter.C4973bd;
import com.bytedance.android.livesdk.chatroom.presenter.C4973bd.C4975a;
import com.bytedance.android.livesdk.chatroom.presenter.C4973bd.C4977c;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.gift.panel.widget.PanelType;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8431c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8512bh;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.widget.RedEnvelopeProgressBar;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cv */
public final class C5260cv extends Dialog implements OnClickListener, C4975a {

    /* renamed from: A */
    private HSImageView f15377A;

    /* renamed from: B */
    private View f15378B;

    /* renamed from: C */
    private RecyclerView f15379C;

    /* renamed from: D */
    private View f15380D;

    /* renamed from: E */
    private View f15381E;

    /* renamed from: F */
    private ImageView f15382F;

    /* renamed from: G */
    private TextView f15383G;

    /* renamed from: a */
    public final C47562b f15384a = new C47562b();

    /* renamed from: b */
    public boolean f15385b;

    /* renamed from: c */
    private C4977c f15386c;

    /* renamed from: d */
    private C4973bd f15387d;

    /* renamed from: e */
    private Activity f15388e;

    /* renamed from: f */
    private boolean f15389f = true;

    /* renamed from: g */
    private int f15390g = 0;

    /* renamed from: h */
    private boolean f15391h;

    /* renamed from: i */
    private ViewGroup f15392i;

    /* renamed from: j */
    private ViewGroup f15393j;

    /* renamed from: k */
    private ViewGroup f15394k;

    /* renamed from: l */
    private ViewGroup f15395l;

    /* renamed from: m */
    private RecyclerView f15396m;

    /* renamed from: n */
    private HSImageView f15397n;

    /* renamed from: o */
    private View f15398o;

    /* renamed from: p */
    private TextView f15399p;

    /* renamed from: q */
    private TextView f15400q;

    /* renamed from: r */
    private TextView f15401r;

    /* renamed from: s */
    private RedEnvelopeProgressBar f15402s;

    /* renamed from: t */
    private TextView f15403t;

    /* renamed from: u */
    private View f15404u;

    /* renamed from: v */
    private View f15405v;

    /* renamed from: w */
    private ObjectAnimator f15406w;

    /* renamed from: x */
    private ObjectAnimator f15407x;

    /* renamed from: y */
    private TextView f15408y;

    /* renamed from: z */
    private TextView f15409z;

    /* renamed from: a */
    public final void mo12988a(Throwable th) {
        C3166a.m11963b("RushRedEnvelopeDialog", th);
        C9076n.m27095a(getContext(), th);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15385b = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13527b() {
        this.f15392i.setScaleX(0.64f);
        this.f15392i.setScaleY(0.64f);
    }

    /* renamed from: f */
    private void m16914f() {
        this.f15384a.mo119661a(this.f15387d.mo12971a(this.f15386c).mo19280a((C7326g<? super T>) new C5272de<Object>(this), (C7326g<? super Throwable>) new C5273df<Object>(this)));
    }

    /* renamed from: j */
    private void m16918j() {
        if (this.f15407x != null && this.f15407x.isRunning()) {
            this.f15407x.cancel();
        }
    }

    /* renamed from: e */
    private void m16912e() {
        int b = this.f15387d.mo12980b(this.f15386c.f14200a.f23363b);
        if (b > 0) {
            this.f15400q.setText(C3358ac.m12517a((int) R.string.fbi, Integer.valueOf(b)));
            return;
        }
        this.f15400q.setVisibility(8);
    }

    /* renamed from: h */
    private void m16916h() {
        if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            m16917i();
            return;
        }
        User user = this.f15386c.f14200a.f23362a;
        if (user != null) {
            this.f15387d.mo12972a(user.getId());
            m16908b(user);
        }
    }

    public final void onDetachedFromWindow() {
        this.f15385b = false;
        m16918j();
        if (this.f15406w != null && this.f15406w.isRunning()) {
            this.f15406w.cancel();
        }
        this.f15387d.mo12982b();
        this.f15384a.mo119660a();
        super.onDetachedFromWindow();
    }

    /* renamed from: g */
    private void m16915g() {
        if (this.f15390g != 2 && this.f15390g != 1) {
            if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
                m16917i();
                return;
            }
            this.f15407x = ObjectAnimator.ofFloat(this.f15404u, "rotationY", new float[]{0.0f, 360.0f, 0.0f});
            this.f15407x.setDuration(2000);
            this.f15407x.setRepeatMode(1);
            this.f15407x.setRepeatCount(2);
            this.f15407x.start();
            this.f15404u.setOnClickListener(null);
            this.f15384a.mo119661a(this.f15387d.mo12981b(this.f15386c).mo19280a((C7326g<? super T>) new C5274dg<Object>(this), (C7326g<? super Throwable>) new C5265cy<Object>(this)));
        }
    }

    /* renamed from: i */
    private void m16917i() {
        ((C3245ad) TTLiveSDKContext.getHostService().mo22367h().mo22167a(this.f15388e, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.f6b)).mo22188a(5).mo22193d("live_detail").mo22194e("red_envelope").mo22192c("live").mo22190a()).mo19297a((C7494t<T, ? extends R>) C3255e.m12296a((View) this.f15392i))).mo10185a((C7498y<? super T>) new C8986g<IUser>() {
            public final void onSubscribe(C7321c cVar) {
                super.onSubscribe(cVar);
                C5260cv.this.f15384a.mo119661a(cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo13522a() {
        this.f15390g = 0;
        if (this.f15406w != null && this.f15406w.isRunning()) {
            this.f15406w.cancel();
        }
        this.f15403t.setVisibility(8);
        this.f15402s.setVisibility(8);
        this.f15404u.setVisibility(0);
        m16912e();
    }

    /* renamed from: c */
    private void m16909c() {
        C8512bh bhVar = this.f15386c.f14200a;
        C7492s<Integer> sVar = this.f15386c.f14201b;
        C4865aa aaVar = bhVar.f23385x;
        if (bhVar.f23372k != null) {
            C5343e.m17038a(this.f15397n, bhVar.f23372k);
        }
        if (bhVar.f23362a != null) {
            User user = bhVar.f23362a;
            C5343e.m17045b(this.f15382F, user.getAvatarThumb(), this.f15382F.getWidth(), this.f15382F.getHeight(), 0);
            if (user.getId() != TTLiveSDKContext.getHostService().mo22367h().mo22179b()) {
                this.f15384a.mo119661a(TTLiveSDKContext.getHostService().mo22367h().mo22180b(user.getId()).mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a()).mo19129a((C7326g<? super T>) new C5264cx<Object>(this), C5266cz.f15415a));
            }
            this.f15383G.setText(user.getNickName());
            this.f15382F.setOnClickListener(this);
        }
        int i = bhVar.f23368g;
        SpannableString spannableString = new SpannableString(C3358ac.m12517a((int) R.string.fb0, Integer.valueOf(i), bhVar.f23367f));
        int length = String.valueOf(i).length() + 4;
        spannableString.setSpan(new AbsoluteSizeSpan(C3358ac.m12510a(18.0f)), 4, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ffffff")), 4, length, 33);
        this.f15399p.setText(spannableString);
        m16912e();
        if (!C6311g.m19573a(bhVar.f23371j)) {
            LuckyBoxDescriptionAdapter luckyBoxDescriptionAdapter = new LuckyBoxDescriptionAdapter(LayoutInflater.from(getContext()), R.layout.axq);
            this.f15396m.setAdapter(luckyBoxDescriptionAdapter);
            this.f15396m.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            luckyBoxDescriptionAdapter.mo13381a(bhVar.f23371j);
            this.f15396m.setVisibility(0);
        }
        if (aaVar != null) {
            m16910d();
            return;
        }
        if (sVar == null) {
            mo13522a();
        } else {
            this.f15402s.setVisibility(0);
            this.f15403t.setVisibility(0);
            int a = (int) (C4973bd.m16000a(bhVar) / 1000);
            if (a < 0) {
                a = 0;
            }
            int i2 = ((bhVar.f23365d - a) * 100) / bhVar.f23365d;
            this.f15402s.setProgress(i2);
            this.f15406w = ObjectAnimator.ofInt(this.f15402s, "progress", new int[]{i2, 100});
            this.f15406w.setInterpolator(new LinearInterpolator());
            this.f15406w.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    if (C5260cv.this.f15385b) {
                        C5260cv.this.mo13522a();
                    }
                }
            });
            this.f15406w.setDuration((long) (a * 1000));
            this.f15406w.start();
            m16906a(a);
            this.f15384a.mo119661a(sVar.mo19280a((C7326g<? super T>) new C5268da<Object>(this), C5269db.f15418a));
        }
        if (bhVar.f23362a != null) {
            this.f15384a.mo119661a(TTLiveSDKContext.getHostService().mo22367h().mo22184d(bhVar.f23362a.getId()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C5270dc<Object>(this, bhVar), C5271dd.f15421a));
        }
    }

    /* renamed from: d */
    private void m16910d() {
        boolean z;
        C4865aa aaVar = this.f15386c.f14200a.f23385x;
        if (aaVar != null) {
            this.f15390g = 1;
            int i = 8;
            this.f15400q.setVisibility(8);
            this.f15401r.setVisibility(8);
            this.f15399p.setVisibility(8);
            this.f15395l.setVisibility(0);
            this.f15381E.setVisibility(8);
            this.f15396m.setVisibility(8);
            if (this.f15386c.f14200a.f23366e != 1 || !aaVar.f13913a) {
                z = false;
            } else {
                z = true;
            }
            View view = this.f15378B;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
            LayoutParams layoutParams = (LayoutParams) this.f15393j.getLayoutParams();
            layoutParams.topMargin = C3358ac.m12510a(20.0f);
            this.f15393j.setLayoutParams(layoutParams);
            if (z) {
                LayoutParams layoutParams2 = (LayoutParams) this.f15395l.getLayoutParams();
                layoutParams2.bottomMargin = C3358ac.m12510a(64.0f);
                this.f15395l.setLayoutParams(layoutParams2);
            } else {
                LayoutParams layoutParams3 = (LayoutParams) this.f15395l.getLayoutParams();
                layoutParams3.bottomMargin = C3358ac.m12510a(10.0f);
                this.f15395l.setLayoutParams(layoutParams3);
            }
            if (!aaVar.f13913a) {
                this.f15408y.setText(this.f15408y.getContext().getString(R.string.fb7));
            } else if (aaVar.f13915c == null) {
                String valueOf = String.valueOf(aaVar.f13917e);
                String string = getContext().getString(R.string.fea);
                SpannableString spannableString = new SpannableString(getContext().getString(R.string.fb8, new Object[]{valueOf}));
                StyleSpan styleSpan = new StyleSpan(1);
                AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan((int) C9738o.m28690a(getContext(), 24.0f));
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(valueOf)) {
                    int length = string.length();
                    int length2 = valueOf.length() + length;
                    spannableString.setSpan(styleSpan, length, length2, 33);
                    spannableString.setSpan(absoluteSizeSpan, length, length2, 33);
                }
                this.f15408y.setText(spannableString);
            } else {
                this.f15408y.setText(R.string.fb9);
                this.f15377A.setVisibility(0);
                C5343e.m17038a(this.f15377A, aaVar.f13915c);
            }
            this.f15379C.setLayoutManager(new SSLinearLayoutManager(getContext(), 1, false));
            this.f15380D.setVisibility(0);
            this.f15379C.setVisibility(4);
            this.f15387d.mo12971a(this.f15386c);
            m16914f();
            m16912e();
        }
    }

    /* renamed from: a */
    public final void mo12987a(FollowPair followPair) {
        this.f15389f = true;
        this.f15398o.setVisibility(8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13523a(User user) throws Exception {
        int i;
        this.f15389f = user.isFollowing();
        View view = this.f15398o;
        if (this.f15389f) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13529b(Throwable th) throws Exception {
        C3166a.m11963b("RushRedEnvelopeDialog", th);
        m16918j();
        this.f15404u.setOnClickListener(this);
        C9076n.m27095a(getContext(), th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo13530c(Throwable th) throws Exception {
        C3166a.m11963b("RushRedEnvelopeDialog", th);
        this.f15379C.setVisibility(4);
        this.f15380D.setVisibility(4);
        this.f15381E.setVisibility(0);
        this.f15381E.setOnClickListener(this);
    }

    /* renamed from: a */
    private void m16906a(int i) {
        if (i <= 60) {
            this.f15403t.setTextSize(32.0f);
            this.f15403t.setText(String.valueOf(i));
            return;
        }
        this.f15403t.setText(this.f15403t.getContext().getString(R.string.fb5, new Object[]{String.valueOf(i / 60)}));
    }

    /* renamed from: b */
    private static void m16908b(User user) {
        C8443c.m25663a().mo21607a("follow", new C8431c("live_audience_c_audience", user.getId(), "red_packetage"), new C8438j().mo21599b("live_interact").mo21598a("live_detail"), Room.class);
    }

    /* renamed from: a */
    private void m16907a(boolean z) {
        this.f15400q.setVisibility(8);
        this.f15390g = 2;
        this.f15394k.setVisibility(8);
        this.f15401r.setVisibility(0);
        this.f15396m.setVisibility(8);
        LayoutParams layoutParams = (LayoutParams) this.f15393j.getLayoutParams();
        layoutParams.topMargin = C3358ac.m12510a(48.0f);
        this.f15393j.setLayoutParams(layoutParams);
        if (z) {
            this.f15401r.setText(R.string.fb3);
        } else {
            this.f15405v.setVisibility(0);
        }
        m16912e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13528b(C3479d dVar) throws Exception {
        this.f15380D.setVisibility(4);
        this.f15381E.setVisibility(4);
        this.f15379C.setAdapter(new LuckyBoxRushListAdapter(getContext(), ((C4930z) dVar.data).f14130f));
        this.f15379C.setVisibility(0);
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (this.f15398o.getId() == id) {
            m16916h();
        } else if (this.f15404u.getId() == id) {
            m16915g();
        } else if (this.f15405v.getId() == id) {
            m16910d();
        } else if (this.f15381E.getId() == id) {
            this.f15387d.mo12971a(this.f15386c);
            m16914f();
        } else if (this.f15382F.getId() != id) {
            if (this.f15378B.getId() == id) {
                C9097a.m27146a().mo22267a((Object) new C4430av(PanelType.PROP));
                dismiss();
            }
        } else if (this.f15386c.f14200a.f23362a != null) {
            C9097a.m27146a().mo22267a((Object) new UserProfileEvent(this.f15386c.f14200a.f23362a));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13524a(C3479d dVar) throws Exception {
        m16918j();
        if (((C4865aa) dVar.data).f13914b) {
            m16907a(true);
        } else if (((C4865aa) dVar.data).f13913a) {
            m16910d();
        } else {
            m16907a(false);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window == null) {
            dismiss();
            return;
        }
        window.requestFeature(1);
        setContentView(R.layout.aog);
        this.f15392i = (ViewGroup) findViewById(R.id.cwn);
        if (!this.f15391h) {
            this.f15392i.post(new C5263cw(this));
        }
        window.getAttributes().gravity = 17;
        window.setLayout(-2, -2);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        this.f15397n = (HSImageView) findViewById(R.id.b88);
        this.f15393j = (ViewGroup) findViewById(R.id.an5);
        this.f15382F = (ImageView) this.f15393j.findViewById(R.id.ayt);
        this.f15383G = (TextView) this.f15393j.findViewById(R.id.dyg);
        this.f15398o = this.f15393j.findViewById(R.id.dus);
        this.f15396m = (RecyclerView) findViewById(R.id.bn7);
        this.f15394k = (ViewGroup) findViewById(R.id.amv);
        this.f15402s = (RedEnvelopeProgressBar) this.f15394k.findViewById(R.id.cl2);
        this.f15403t = (TextView) this.f15394k.findViewById(R.id.dsu);
        this.f15404u = this.f15394k.findViewById(R.id.cx1);
        this.f15395l = (ViewGroup) findViewById(R.id.bn6);
        this.f15408y = (TextView) this.f15395l.findViewById(R.id.e12);
        this.f15409z = (TextView) this.f15395l.findViewById(R.id.e11);
        this.f15377A = (HSImageView) this.f15395l.findViewById(R.id.bbs);
        this.f15379C = (RecyclerView) this.f15395l.findViewById(R.id.cx2);
        this.f15380D = this.f15395l.findViewById(R.id.bn9);
        this.f15381E = this.f15395l.findViewById(R.id.bn8);
        this.f15399p = (TextView) findViewById(R.id.dt7);
        this.f15401r = (TextView) findViewById(R.id.e0z);
        this.f15400q = (TextView) findViewById(R.id.dqy);
        this.f15378B = findViewById(R.id.e1o);
        this.f15405v = findViewById(R.id.e1k);
        this.f15387d.f14190a = this;
        this.f15405v.setOnClickListener(this);
        this.f15398o.setOnClickListener(this);
        this.f15404u.setOnClickListener(this);
        this.f15378B.setOnClickListener(this);
        m16909c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13526a(Integer num) throws Exception {
        m16906a(num.intValue());
        if (num.intValue() == 0) {
            mo13522a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13525a(C8512bh bhVar, FollowPair followPair) throws Exception {
        int i;
        bhVar.f23362a.setFollowStatus(followPair.mo22844a());
        View view = this.f15398o;
        if (followPair.mo22844a() == 0) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public C5260cv(Context context, C4977c cVar, C4973bd bdVar, DataCenter dataCenter) {
        super(context, R.style.y7);
        this.f15388e = (Activity) context;
        this.f15386c = cVar;
        this.f15387d = bdVar;
        this.f15391h = ((Boolean) dataCenter.get("data_is_portrait")).booleanValue();
    }
}
