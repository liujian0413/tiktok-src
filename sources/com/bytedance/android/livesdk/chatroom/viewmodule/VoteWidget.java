package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0053p;
import android.net.Uri;
import android.support.p022v4.app.DialogFragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.utils.C3384d;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.fragment.WebDialogFragment;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.model.C4889av;
import com.bytedance.android.livesdk.chatroom.presenter.C5009cc;
import com.bytedance.android.livesdk.chatroom.presenter.C5009cc.C5010a;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.chatroom.widget.AnimationLayer;
import com.bytedance.android.livesdk.chatroom.widget.C5792ak;
import com.bytedance.android.livesdk.config.C5865c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8492ar;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9046am;
import com.bytedance.android.livesdk.utils.C9048ao;
import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p458j.C9496c;
import com.bytedance.android.livesdkapi.p458j.p459a.C9494e;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

public class VoteWidget extends LiveRecyclableWidget implements C0053p<KVData>, OnClickListener, C5010a {

    /* renamed from: A */
    private View f16570A;

    /* renamed from: B */
    private AnimatorListener f16571B;

    /* renamed from: C */
    private boolean f16572C = false;

    /* renamed from: D */
    private boolean f16573D;

    /* renamed from: E */
    private int f16574E = 0;

    /* renamed from: a */
    public C5009cc f16575a;

    /* renamed from: b */
    private final int f16576b = 386;

    /* renamed from: c */
    private final int f16577c = 280;

    /* renamed from: d */
    private final int f16578d = 4;

    /* renamed from: e */
    private final int f16579e = ((int) C9738o.m28708b(C9469i.m27991c(), 32.0f));

    /* renamed from: f */
    private final float f16580f = 0.1f;

    /* renamed from: g */
    private final int f16581g = ((int) C9738o.m28708b(C9469i.m27991c(), 110.0f));

    /* renamed from: h */
    private final String f16582h = "asset://com.ss.android.ies.live.sdk/vote_time.webp";

    /* renamed from: i */
    private final String f16583i = "asset://com.ss.android.ies.live.sdk/vote_shine.webp";

    /* renamed from: j */
    private WebDialogFragment f16584j;

    /* renamed from: k */
    private View f16585k;

    /* renamed from: l */
    private View f16586l;

    /* renamed from: m */
    private HSImageView f16587m;

    /* renamed from: n */
    private HSImageView f16588n;

    /* renamed from: o */
    private TextView f16589o;

    /* renamed from: p */
    private TextView f16590p;

    /* renamed from: q */
    private HSImageView f16591q;

    /* renamed from: r */
    private ViewGroup f16592r;

    /* renamed from: s */
    private ImageModel f16593s;

    /* renamed from: t */
    private ImageModel f16594t;

    /* renamed from: u */
    private HSImageView f16595u;

    /* renamed from: v */
    private HSImageView f16596v;

    /* renamed from: w */
    private View f16597w;

    /* renamed from: x */
    private View f16598x;

    /* renamed from: y */
    private AnimationLayer f16599y;

    /* renamed from: z */
    private C5792ak f16600z;

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.b0c;
    }

    /* renamed from: a */
    public final void mo13025a(IMessage iMessage) {
        if (this.f16584j != null && this.f16584j.mo10323a()) {
            ((C3245ad) C7492s.m23301b(iMessage).mo19304b(C7333a.m23042a()).mo19317d((C7327h<? super T, ? extends R>) new C5717fb<Object,Object>(iMessage)).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) autoDispose())).mo10183a(new C5718fc(this), C5719fd.f16817a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14050a(String str) throws Exception {
        this.f16584j.mo11573a("H5_commonMessage", new JSONObject(str));
    }

    /* renamed from: a */
    public final void mo13024a(C4889av avVar, long j, boolean z) {
        this.f16599y = (AnimationLayer) this.contentView.getRootView().findViewById(R.id.ge);
        this.f16595u.setVisibility(4);
        this.f16596v.setVisibility(4);
        this.f16590p.setVisibility(0);
        this.f16587m.setAlpha(0.0f);
        this.f16588n.setAlpha(0.0f);
        this.f16589o.setAlpha(0.0f);
        this.f16589o.setTextSize(1, 20.0f);
        this.f16597w.setVisibility(4);
        this.f16598x.setVisibility(4);
        this.f16600z = new C5792ak(getContext());
        LayoutParams layoutParams = new LayoutParams((int) C9738o.m28708b(getContext(), 110.0f), (int) C9738o.m28708b(getContext(), 96.0f));
        this.f16600z.setVisibility(4);
        this.f16599y.addView(this.f16600z, layoutParams);
        this.f16585k.setScaleX(1.0f);
        this.f16586l.setScaleX(1.0f);
        if (avVar != null && avVar.f14002b != null && avVar.f14002b.size() >= 2) {
            C8492ar arVar = (C8492ar) avVar.f14002b.get(0);
            C8492ar arVar2 = (C8492ar) avVar.f14002b.get(1);
            if (arVar != null && arVar2 != null) {
                if (arVar.f23273b > arVar2.f23273b) {
                    this.f16570A = this.f16587m;
                    m17951a(this.f16585k, 1.0f);
                    m17951a(this.f16586l, (((float) arVar2.f23273b) * 1.0f) / ((float) arVar.f23273b));
                } else if (arVar.f23273b < arVar2.f23273b) {
                    this.f16570A = this.f16588n;
                    m17951a(this.f16586l, 1.0f);
                    m17951a(this.f16585k, (((float) arVar.f23273b) * 1.0f) / ((float) arVar2.f23273b));
                } else {
                    this.f16570A = this.f16589o;
                    this.f16589o.setText(getContext().getResources().getString(R.string.ffb));
                    m17951a(this.f16586l, 1.0f);
                    m17951a(this.f16585k, 1.0f);
                }
                C9738o.m28712b(this.f16570A, 0);
                this.f16570A.setAlpha(1.0f);
                int x = (int) (this.containerView.getX() + ((float) this.f16581g));
                if (this.f16599y != null) {
                    C9738o.m28702a((View) this.f16600z, -this.f16581g, this.f16574E == 0 ? (int) this.containerView.getY() : this.f16574E, -3, -3);
                }
                this.f16600z.setVisibility(0);
                this.f16600z.mo14286a(x, (AnimatorListener) C9496c.m28034a(this.f16571B));
                this.f16600z.mo14289a(avVar, j);
                this.f16593s = arVar.f23274c;
                this.f16594t = arVar2.f23274c;
                C5343e.m17030a((ImageView) this.f16587m, this.f16593s);
                C5343e.m17030a((ImageView) this.f16588n, this.f16594t);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14049a(HSImageView hSImageView, ValueAnimator valueAnimator) {
        C9738o.m28702a((View) hSImageView, -3, -3, -3, (int) C9738o.m28708b(getContext(), (float) ((Integer) valueAnimator.getAnimatedValue()).intValue()));
    }

    public void onUnload() {
        this.f16575a.mo8963a();
        this.f16592r.setVisibility(4);
        if (this.f16600z != null) {
            this.f16600z.mo14285a();
        }
        this.f16572C = false;
        this.f16574E = 0;
    }

    /* renamed from: a */
    public final void mo13021a() {
        this.f16592r.setVisibility(4);
        if (this.f16584j != null && this.f16584j.mo10323a()) {
            this.f16584j.dismiss();
            this.f16584j = null;
        }
    }

    /* renamed from: b */
    private static void m17954b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(67);
        ofFloat.start();
    }

    /* renamed from: a */
    private static void m17950a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(67);
        ofFloat.setStartDelay(33);
        ofFloat.start();
    }

    /* renamed from: b */
    public final void mo13026b(long j) {
        if (this.f16592r != null && this.f16592r.getVisibility() == 0) {
            this.f16590p.setText(C9048ao.m27017a(j));
        }
        if (this.f16600z != null && this.f16600z.getVisibility() == 0) {
            this.f16600z.mo14287a(j);
        }
    }

    /* renamed from: c */
    public final void mo13028c(long j) {
        C9738o.m28712b((View) this.f16592r, 0);
        this.f16570A.setAlpha(0.0f);
        C9738o.m28712b((View) this.f16591q, 0);
        C9738o.m28712b((View) this.f16590p, 4);
        this.f16591q.setController(((C13382e) C13380c.m39166a().mo32713b(Uri.parse("asset://com.ss.android.ies.live.sdk/vote_time.webp")).mo32751c(true)).mo32730f());
    }

    public void onLoad(Object[] objArr) {
        if (this.dataCenter != null) {
            this.dataCenter.observe("cmd_vote_start_animation", this);
        }
        this.f16575a = new C5009cc();
        this.f16592r.setOnClickListener(this);
        this.f16571B = new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                if (VoteWidget.this.f16575a != null) {
                    VoteWidget.this.f16575a.mo13014a(2);
                }
            }
        };
        this.f16575a.mo9142a((C5010a) this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && kVData.getKey().equals("cmd_vote_start_animation")) {
            this.f16574E = (int) (((float) ((Integer) kVData.getData(Integer.valueOf(0))).intValue()) + C9738o.m28708b(getContext(), 4.0f));
            if (this.f16600z != null && !this.f16572C && this.f16575a.f14254a == 1) {
                this.f16572C = true;
                int x = (int) (this.containerView.getX() + ((float) this.f16581g));
                C9738o.m28702a((View) this.f16600z, -this.f16581g, this.f16574E, -3, -3);
                this.f16600z.setVisibility(0);
                this.f16600z.mo14286a(x, (AnimatorListener) C9496c.m28034a(this.f16571B));
            }
        }
    }

    /* renamed from: c */
    private static void m17955c(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.05f});
        ofFloat.setDuration(133);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.05f, 1.0f});
        ofFloat2.setDuration(67);
        ofFloat2.setStartDelay(133);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.start();
    }

    public void onClick(View view) {
        if (this.f16584j == null || !this.f16584j.mo10323a()) {
            if (this.f16573D) {
                C8443c.m25663a().mo21607a("livesdk_anchorcheck_click", Room.class, C8438j.class);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("user_id", String.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b()));
                C8443c.m25663a().mo21606a("livesdk_audiencecheck_click", hashMap, Room.class, C8438j.class);
            }
            C9494e eVar = new C9494e(((C5865c) LiveConfigSettingKeys.LIVE_VOTE_CONFIG.mo10240a()).f17309c);
            eVar.mo23524a("vote_id", this.f16575a.mo13019b());
            BaseDialogFragment a = C9178j.m27302j().mo22374c().mo11533a(C3979c.m13951a(eVar.mo23522a()).mo11555a(280).mo11560b(386).mo11564d(4).mo11566e(17));
            BaseDialogFragment.m12686a(C3384d.m12590b(getContext()), (DialogFragment) a);
            if (a instanceof WebDialogFragment) {
                this.f16584j = (WebDialogFragment) a;
            }
        }
    }

    public void onInit(Object[] objArr) {
        this.f16573D = ((Boolean) this.dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
        this.f16585k = this.contentView.findViewById(R.id.ee9);
        this.f16586l = this.contentView.findViewById(R.id.eed);
        this.f16587m = (HSImageView) this.contentView.findViewById(R.id.b_j);
        this.f16588n = (HSImageView) this.contentView.findViewById(R.id.bbl);
        this.f16590p = (TextView) this.containerView.findViewById(R.id.e3_);
        this.f16589o = (TextView) this.containerView.findViewById(R.id.dto);
        try {
            this.f16590p.setTypeface(C9046am.m27012a(getContext()));
        } catch (Throwable unused) {
        }
        this.f16591q = (HSImageView) this.contentView.findViewById(R.id.djg);
        this.f16592r = (ViewGroup) this.contentView.findViewById(R.id.eeg);
        this.f16595u = (HSImageView) this.contentView.findViewById(R.id.ee_);
        this.f16596v = (HSImageView) this.contentView.findViewById(R.id.eee);
        this.f16597w = this.contentView.findViewById(R.id.eea);
        this.f16598x = this.contentView.findViewById(R.id.eef);
    }

    /* renamed from: a */
    public final void mo13022a(long j) {
        C9738o.m28712b((View) this.f16600z, 4);
        if (this.f16599y != null) {
            this.f16599y.removeView(this.f16600z);
        }
        this.f16592r.setVisibility(0);
        this.f16590p.setText(C9048ao.m27017a(j));
    }

    /* renamed from: a */
    private void m17951a(View view, float f) {
        if (f < 0.1f) {
            f = 0.1f;
        }
        C9738o.m28701a(view, -3, (int) (f * ((float) this.f16579e)));
    }

    /* renamed from: b */
    public final void mo13027b(long j, long j2) {
        mo13023a(j, j2);
        C9738o.m28712b((View) this.f16592r, 0);
        C9738o.m28712b((View) this.f16590p, 0);
        this.f16591q.setController(null);
        C9738o.m28712b((View) this.f16591q, 4);
        this.f16590p.setText(getContext().getResources().getString(R.string.ffe));
        if (j > j2) {
            this.f16595u.setVisibility(0);
            this.f16596v.setVisibility(4);
            this.f16589o.setVisibility(4);
            this.f16597w.setVisibility(0);
            m17952a(this.f16585k, this.f16595u, (View) this.f16587m);
        } else if (j < j2) {
            this.f16595u.setVisibility(4);
            this.f16596v.setVisibility(0);
            this.f16589o.setVisibility(4);
            this.f16598x.setVisibility(0);
            m17952a(this.f16586l, this.f16596v, (View) this.f16588n);
        } else {
            this.f16595u.setVisibility(4);
            this.f16596v.setVisibility(4);
            this.f16589o.setTextSize(1, 15.0f);
            this.f16589o.setVisibility(0);
            this.f16590p.setVisibility(4);
            C9738o.m28704a(this.f16589o, (CharSequence) getContext().getResources().getString(R.string.ffc));
            m17955c((View) this.f16589o);
        }
        this.f16570A = null;
    }

    /* renamed from: a */
    public final void mo13023a(long j, long j2) {
        View view;
        C9738o.m28712b((View) this.f16592r, 0);
        if (j < j2) {
            m17951a(this.f16586l, 1.0f);
            m17951a(this.f16585k, (((float) j) * 1.0f) / ((float) j2));
            view = this.f16588n;
        } else if (j > j2) {
            m17951a(this.f16585k, 1.0f);
            m17951a(this.f16586l, (((float) j2) * 1.0f) / ((float) j));
            view = this.f16587m;
        } else {
            m17951a(this.f16585k, 1.0f);
            m17951a(this.f16586l, 1.0f);
            this.f16589o.setTextSize(1, 20.0f);
            C9738o.m28704a(this.f16589o, (CharSequence) getContext().getResources().getString(R.string.ffb));
            view = this.f16589o;
        }
        if (this.f16575a.f14254a != 3) {
            if (this.f16570A == view) {
                this.f16570A.setAlpha(1.0f);
                return;
            }
            if (this.f16575a.f14254a != 4) {
                if (this.f16570A != null) {
                    m17954b(this.f16570A);
                }
                if (view != null) {
                    m17950a(view);
                }
            }
            this.f16570A = view;
        }
    }

    /* renamed from: a */
    private void m17952a(View view, HSImageView hSImageView, View view2) {
        hSImageView.setController(((C13382e) C13380c.m39166a().mo32713b(Uri.parse("asset://com.ss.android.ies.live.sdk/vote_shine.webp")).mo32751c(true)).mo32730f());
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, 1.5f});
        if (view == this.f16585k) {
            view.setPivotX(0.0f);
        } else {
            view.setPivotX((float) view.getWidth());
        }
        ofFloat.setDuration(67);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hSImageView, "alpha", new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(66);
        ofFloat2.setStartDelay(67);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{20, 28});
        ofInt.addUpdateListener(new C5720fe(this, hSImageView));
        ofInt.setStartDelay(67);
        ofInt.setDuration(166);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofInt});
        animatorSet.start();
        m17955c(view2);
    }
}
