package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C2380l;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p220ui.C5260cv;
import com.bytedance.android.livesdk.chatroom.p220ui.C5275dh;
import com.bytedance.android.livesdk.chatroom.presenter.C4973bd;
import com.bytedance.android.livesdk.chatroom.presenter.C4973bd.C4976b;
import com.bytedance.android.livesdk.chatroom.presenter.C4973bd.C4977c;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C8512bh;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.p431y.p433b.C9281a;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.utils.C9048ao;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Set;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C7321c;

public class LuckyBoxWidget extends LiveRecyclableWidget implements OnDismissListener, OnClickListener, C4976b {

    /* renamed from: a */
    public int f16270a;

    /* renamed from: b */
    protected ViewGroup f16271b;

    /* renamed from: c */
    public FrameLayout f16272c;

    /* renamed from: d */
    public Animator f16273d;

    /* renamed from: e */
    public ObjectAnimator f16274e;

    /* renamed from: f */
    public AnimatorSet f16275f;

    /* renamed from: g */
    private boolean f16276g;

    /* renamed from: h */
    private C4973bd f16277h;

    /* renamed from: i */
    private C7321c f16278i;

    /* renamed from: j */
    private boolean f16279j;

    /* renamed from: k */
    private TextView f16280k;

    /* renamed from: l */
    private HSImageView f16281l;

    /* renamed from: m */
    private HSImageView f16282m;

    /* renamed from: n */
    private TextView f16283n;

    /* renamed from: o */
    private View f16284o;

    /* renamed from: p */
    private AnimatorSet f16285p;

    /* renamed from: q */
    private C5275dh f16286q;

    /* renamed from: r */
    private C5260cv f16287r;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LuckyBoxWidget$a */
    class C5488a implements C5739a {
        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
        }

        private C5488a() {
        }

        public final void onClick(View view) {
            LuckyBoxWidget.this.mo12989a();
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

    /* renamed from: c */
    private void m17713c() {
        this.f16284o.setVisibility(0);
        this.f16281l.setVisibility(8);
        this.f16282m.setVisibility(8);
        this.f16283n.setVisibility(8);
        m17711a(this.f16278i);
        m17714d();
    }

    public int getLayoutId() {
        LiveMode liveMode = (LiveMode) this.dataCenter.get("data_live_mode");
        if (liveMode == null || !liveMode.isUsingCamera) {
            return R.layout.axm;
        }
        return R.layout.axo;
    }

    public void onUnload() {
        this.f16277h.mo8963a();
        if (this.f16286q != null) {
            this.f16286q.dismiss();
        }
        if (this.f16287r != null) {
            this.f16287r.dismiss();
        }
        this.contentView.setVisibility(8);
        m17710a((Animator) this.f16285p);
        m17710a(this.f16273d);
        m17710a((Animator) this.f16274e);
        m17710a((Animator) this.f16275f);
        m17711a(this.f16278i);
        this.f16279j = false;
    }

    /* renamed from: d */
    private void m17714d() {
        View findViewById = this.contentView.findViewById(R.id.m3);
        m17710a((Animator) this.f16285p);
        if (this.f16285p == null) {
            this.f16285p = new AnimatorSet();
            Animator loadAnimator = AnimatorInflater.loadAnimator(this.context, R.animator.m);
            Animator clone = loadAnimator.clone();
            loadAnimator.setTarget(findViewById);
            clone.setTarget(findViewById);
            clone.setStartDelay(1000);
            this.f16285p.playSequentially(new Animator[]{loadAnimator, clone});
        }
        this.f16285p.start();
    }

    /* renamed from: a */
    public final void mo12989a() {
        if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            ((C3245ad) TTLiveSDKContext.getHostService().mo22367h().mo22167a(this.context, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.efb)).mo22192c("red_envelope").mo22188a(-1).mo22190a()).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) autoDispose())).mo10185a((C7498y<? super T>) new C8986g<IUser>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onNext(IUser iUser) {
                    super.onNext(iUser);
                    LuckyBoxWidget.this.mo12989a();
                }
            });
            return;
        }
        Builder buildUpon = Uri.parse("sslocal://webcast_webview").buildUpon();
        Builder buildUpon2 = Uri.parse((String) LiveConfigSettingKeys.SEND_RED_ENVELOPE_URL.mo10240a()).buildUpon();
        Room room = (Room) this.dataCenter.get("data_room");
        if (room != null) {
            if (room.getOwner() != null) {
                buildUpon2.appendQueryParameter("anchor_id", String.valueOf(room.getOwner().getId()));
            }
            buildUpon2.appendQueryParameter("room_id", String.valueOf(room.getId()));
        }
        buildUpon2.appendQueryParameter("is_first_consume", String.valueOf(C9281a.m27615a(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a())));
        Uri build = buildUpon2.build();
        Set<String> queryParameterNames = build.getQueryParameterNames();
        if (queryParameterNames != null) {
            for (String str : queryParameterNames) {
                buildUpon.appendQueryParameter(str, build.getQueryParameter(str));
            }
        }
        buildUpon.appendQueryParameter("url", build.toString());
        C9178j.m27302j().mo22380i().handle(this.context, buildUpon.build().toString());
    }

    /* renamed from: b */
    public final void mo12992b() {
        C8512bh bhVar;
        m17711a(this.f16278i);
        m17710a((Animator) this.f16285p);
        C4977c e = this.f16277h.mo12984e();
        if (e == null) {
            bhVar = null;
        } else {
            bhVar = e.f14200a;
        }
        if (bhVar == null) {
            this.contentView.setVisibility(8);
            return;
        }
        this.contentView.setVisibility(0);
        int d = this.f16277h.mo12983d();
        if (d > 1) {
            this.f16280k.setText(String.valueOf(d));
            this.f16280k.setVisibility(0);
        } else {
            this.f16280k.setVisibility(8);
        }
        if (bhVar.f23370i) {
            this.f16279j = true;
            if (!bhVar.f23384w) {
                mo12991a(bhVar);
            }
        } else {
            this.f16279j = false;
        }
        if (bhVar.f23362a != null) {
            User user = bhVar.f23362a;
            this.f16281l.setVisibility(0);
            C5343e.m17043b(this.f16281l, user.getAvatarThumb());
            C2380l userHonor = user.getUserHonor();
            if (userHonor == null || userHonor.mo8708l() == null) {
                this.f16282m.setVisibility(8);
            } else {
                this.f16282m.setVisibility(0);
                C5343e.m17038a(this.f16282m, userHonor.mo8708l());
            }
        } else {
            this.f16281l.setVisibility(8);
            this.f16282m.setVisibility(8);
        }
        if (e.f14201b == null) {
            m17713c();
            return;
        }
        this.f16284o.setVisibility(8);
        this.f16283n.setVisibility(0);
        this.f16283n.setText(mo13942a(C4973bd.m16000a(e.f14200a) / 1000));
        this.f16278i = ((C3245ad) e.f14201b.mo19297a((C7494t<T, ? extends R>) autoDispose())).mo10183a(new C5682dz(this), C5684ea.f16773a);
    }

    /* renamed from: a */
    private static void m17711a(C7321c cVar) {
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* renamed from: a */
    public static void m17710a(Animator animator) {
        if (animator != null) {
            animator.removeAllListeners();
            animator.end();
        }
    }

    public void onClick(View view) {
        if (this.f16287r == null) {
            mo12990a(this.f16277h.mo12984e());
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (dialogInterface instanceof C5260cv) {
            this.f16287r = null;
            return;
        }
        if (dialogInterface instanceof C5275dh) {
            this.f16286q = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo13942a(long j) {
        return C9048ao.m27017a(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13943a(View view) {
        mo12990a(this.f16277h.mo12984e());
    }

    public void onLoad(Object... objArr) {
        this.f16271b = (ViewGroup) this.contentView.getParent().getParent();
        this.f16276g = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        C5747j.m18103a().mo14165a(ToolbarButton.RED_ENVELOPE, (C5739a) new C5488a());
        this.f16277h.mo9142a((C4976b) this);
    }

    /* renamed from: a */
    public final void mo12990a(C4977c cVar) {
        if (cVar != null) {
            this.f16287r = new C5260cv(this.context, cVar, this.f16277h, this.dataCenter);
            this.f16287r.setOnDismissListener(this);
            this.f16287r.show();
        }
    }

    public void onInit(Object... objArr) {
        this.f16277h = new C4973bd();
        this.f16280k = (TextView) this.contentView.findViewById(R.id.e0f);
        this.f16281l = (HSImageView) this.contentView.findViewById(R.id.ic);
        this.f16282m = (HSImageView) this.contentView.findViewById(R.id.blh);
        this.f16283n = (TextView) this.contentView.findViewById(R.id.dsu);
        this.f16284o = this.contentView.findViewById(R.id.cx1);
        this.contentView.setOnClickListener(new C5681dy(this));
    }

    /* renamed from: a */
    public void mo12991a(C8512bh bhVar) {
        bhVar.f23384w = true;
        if (this.f16272c != null) {
            m17710a(this.f16273d);
            m17710a((Animator) this.f16274e);
            m17710a((Animator) this.f16275f);
            this.f16271b.removeView(this.f16272c);
            this.f16272c = null;
        }
        this.f16272c = (FrameLayout) LayoutInflater.from(this.context).inflate(R.layout.axp, this.f16271b, false);
        LayoutParams layoutParams = (LayoutParams) this.f16272c.getLayoutParams();
        layoutParams.addRule(13);
        layoutParams.bottomMargin = C3358ac.m12510a(30.0f);
        this.f16272c.setLayoutParams(layoutParams);
        final TextView textView = (TextView) this.f16272c.findViewById(R.id.dte);
        int length = String.valueOf(bhVar.f23368g).length();
        SpannableString spannableString = new SpannableString(this.context.getString(R.string.fay, new Object[]{Integer.valueOf(bhVar.f23368g)}));
        spannableString.setSpan(new RelativeSizeSpan(1.67f), 0, length, 33);
        textView.setText(spannableString);
        this.f16271b.addView(this.f16272c);
        final ImageView imageView = (ImageView) this.f16272c.findViewById(R.id.ic);
        final View findViewById = this.f16272c.findViewById(R.id.ii);
        final ImageView imageView2 = (ImageView) this.f16272c.findViewById(R.id.blh);
        if (bhVar.f23362a != null) {
            C5343e.m17043b(imageView, bhVar.f23362a.getAvatarThumb());
            C2380l userHonor = bhVar.f23362a.getUserHonor();
            if (userHonor == null || userHonor.mo8711o() == null) {
                imageView2.setImageDrawable(null);
            } else {
                imageView2.setVisibility(0);
                C5343e.m17045b(imageView2, bhVar.f23362a.getUserHonor().mo8711o(), imageView2.getWidth(), imageView2.getHeight(), 0);
            }
        }
        final View findViewById2 = this.f16272c.findViewById(R.id.di8);
        m17710a(this.f16273d);
        this.f16273d = AnimatorInflater.loadAnimator(this.context, R.animator.l);
        this.f16273d.setTarget(this.f16272c);
        Animator animator = this.f16273d;
        C54852 r6 = new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                findViewById2.setVisibility(0);
                LuckyBoxWidget.this.f16273d.removeAllListeners();
                LuckyBoxWidget.m17710a((Animator) LuckyBoxWidget.this.f16274e);
                LuckyBoxWidget.this.f16274e = ObjectAnimator.ofFloat(findViewById2, "translationX", new float[]{0.0f, (float) textView.getWidth()});
                LuckyBoxWidget.this.f16274e.setDuration(520);
                LuckyBoxWidget.this.f16274e.addListener(new AnimatorListener() {
                    public final void onAnimationCancel(Animator animator) {
                    }

                    public final void onAnimationRepeat(Animator animator) {
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationEnd(Animator animator) {
                        LuckyBoxWidget.this.f16274e.removeAllListeners();
                        findViewById2.setVisibility(8);
                        View findViewById = LuckyBoxWidget.this.contentView.findViewById(R.id.m3);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(LuckyBoxWidget.this.f16272c, "rotation", new float[]{0.0f, 720.0f});
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(LuckyBoxWidget.this.f16272c, "translationX", new float[]{0.0f, ((findViewById.getX() + ((View) LuckyBoxWidget.this.contentView.getParent()).getX()) - LuckyBoxWidget.this.f16272c.getX()) - (((float) LuckyBoxWidget.this.f16272c.getMeasuredWidth()) * 0.4f)});
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(LuckyBoxWidget.this.f16272c, "translationY", new float[]{0.0f, (((findViewById.getY() + ((View) LuckyBoxWidget.this.contentView.getParent()).getY()) - LuckyBoxWidget.this.f16272c.getY()) - (((float) LuckyBoxWidget.this.f16272c.getMeasuredHeight()) * 0.4f)) + ((float) LuckyBoxWidget.this.f16270a)});
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(LuckyBoxWidget.this.f16272c, "scaleX", new float[]{1.0f, 0.2f});
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(LuckyBoxWidget.this.f16272c, "scaleY", new float[]{1.0f, 0.2f});
                        ofFloat.setDuration(520);
                        ofFloat2.setDuration(520);
                        ofFloat2.setDuration(520);
                        ofFloat4.setDuration(520);
                        ofFloat5.setDuration(520);
                        LuckyBoxWidget.this.f16272c.postDelayed(new C5685eb(imageView, imageView2, findViewById, textView), 500);
                        LuckyBoxWidget.m17710a((Animator) LuckyBoxWidget.this.f16275f);
                        LuckyBoxWidget.this.f16275f = new AnimatorSet();
                        LuckyBoxWidget.this.f16275f.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5});
                        LuckyBoxWidget.this.f16275f.setStartDelay(500);
                        LuckyBoxWidget.this.f16275f.addListener(new AnimatorListener() {
                            public final void onAnimationCancel(Animator animator) {
                            }

                            public final void onAnimationRepeat(Animator animator) {
                            }

                            public final void onAnimationStart(Animator animator) {
                            }

                            public final void onAnimationEnd(Animator animator) {
                                LuckyBoxWidget.this.f16275f.removeAllListeners();
                                LuckyBoxWidget.this.f16271b.removeView(LuckyBoxWidget.this.f16272c);
                                LuckyBoxWidget.this.f16272c = null;
                            }
                        });
                        LuckyBoxWidget.this.f16275f.start();
                    }

                    /* renamed from: a */
                    static final /* synthetic */ void m17725a(ImageView imageView, ImageView imageView2, View view, TextView textView) {
                        imageView.setVisibility(8);
                        imageView2.setVisibility(8);
                        view.setVisibility(8);
                        textView.setVisibility(8);
                    }
                });
                LuckyBoxWidget.this.f16274e.start();
            }
        };
        animator.addListener(r6);
        this.f16273d.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13944a(Integer num) throws Exception {
        this.f16283n.setText(mo13942a((long) num.intValue()));
    }
}
