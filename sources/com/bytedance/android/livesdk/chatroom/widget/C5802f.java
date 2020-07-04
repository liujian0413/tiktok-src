package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.p128d.C2432b;
import com.bytedance.android.live.core.utils.C3385e;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.livesdk.chatroom.event.C4450t;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4523c.C4524a;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4523c.C4525b;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.utils.C9036ae;
import com.bytedance.android.livesdk.utils.C9092w;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.f */
public final class C5802f extends FrameLayout implements OnClickListener, C4525b, C6310a {

    /* renamed from: a */
    public TextView f17112a;

    /* renamed from: b */
    public DataCenter f17113b;

    /* renamed from: c */
    public C4524a f17114c;

    /* renamed from: d */
    public boolean f17115d;

    /* renamed from: e */
    public int f17116e = 5;

    /* renamed from: f */
    private HSImageView f17117f;

    /* renamed from: g */
    private ImageView f17118g;

    /* renamed from: h */
    private SurfaceView f17119h;

    /* renamed from: i */
    private TextView f17120i;

    /* renamed from: j */
    private TextView f17121j;

    /* renamed from: k */
    private TextView f17122k;

    /* renamed from: l */
    private View f17123l;

    /* renamed from: m */
    private View f17124m;

    /* renamed from: n */
    private View f17125n;

    /* renamed from: o */
    private View f17126o;

    /* renamed from: p */
    private TextView f17127p;

    /* renamed from: q */
    private TextView f17128q;

    /* renamed from: r */
    private View f17129r;

    /* renamed from: s */
    private ProgressBar f17130s;

    /* renamed from: t */
    private View f17131t;

    /* renamed from: u */
    private Animator f17132u;

    /* renamed from: v */
    private boolean f17133v;

    /* renamed from: w */
    private Handler f17134w;

    /* renamed from: x */
    private C5807a f17135x;

    /* renamed from: y */
    private int f17136y = 5;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.f$a */
    public interface C5807a {
        /* renamed from: a */
        void mo12726a(C5802f fVar);
    }

    /* renamed from: a */
    public final void mo14307a() {
        this.f17133v = true;
    }

    public final C4524a getPresenter() {
        return this.f17114c;
    }

    /* renamed from: b */
    public final void mo14310b() {
        mo14308a(2);
    }

    /* renamed from: c */
    private void m18263c() {
        if (this.f17113b != null) {
            this.f17113b.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(5));
        }
        C9036ae.m26994a(this.f17114c.mo12355b(), "shutdown_connection", "guest_connection", false);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        if (this.f17132u != null && this.f17132u.isRunning()) {
            this.f17132u.cancel();
        }
        this.f17134w.removeCallbacksAndMessages(null);
        this.f17114c.mo12661f();
        this.f17135x = null;
        super.onDetachedFromWindow();
    }

    /* renamed from: d */
    private void m18264d() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17112a, "scaleX", new float[]{1.0f, 2.0f, 1.0f});
        ofFloat.setRepeatCount(5);
        ofFloat.setDuration(1000);
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (C5802f.this.f17114c.mo12358e()) {
                    C5802f.this.mo14308a(2);
                }
            }

            public final void onAnimationRepeat(Animator animator) {
                C5802f.this.f17116e--;
                C5802f.this.f17112a.setText(String.valueOf(C5802f.this.f17116e));
            }

            public final void onAnimationStart(Animator animator) {
                C5802f.this.f17112a.setText(String.valueOf(C5802f.this.f17116e));
                C5802f.this.f17112a.setVisibility(0);
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f17112a, "scaleY", new float[]{1.0f, 2.0f, 1.0f});
        ofFloat2.setRepeatCount(5);
        ofFloat2.setDuration(1000);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.start();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        inflate(getContext(), R.layout.awz, this);
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (C5802f.this.f17114c.mo12351a() != null) {
                    C5802f.this.f17113b.lambda$put$1$DataCenter("cmd_send_gift", C5802f.this.f17114c.mo12351a());
                }
            }
        });
        this.f17117f = (HSImageView) findViewById(R.id.ciu);
        this.f17118g = (ImageView) findViewById(R.id.cit);
        this.f17120i = (TextView) findViewById(R.id.ciy);
        this.f17121j = (TextView) findViewById(R.id.ciw);
        this.f17122k = (TextView) findViewById(R.id.cix);
        this.f17123l = findViewById(R.id.civ);
        this.f17124m = findViewById(R.id.c8o);
        this.f17124m.setOnClickListener(this);
        this.f17125n = findViewById(R.id.c8g);
        this.f17125n.setOnClickListener(this);
        this.f17126o = findViewById(R.id.c8a);
        this.f17127p = (TextView) findViewById(R.id.c8m);
        this.f17128q = (TextView) findViewById(R.id.c8p);
        this.f17129r = findViewById(R.id.c8q);
        this.f17130s = (ProgressBar) findViewById(R.id.c8n);
        this.f17112a = (TextView) findViewById(R.id.c8i);
        this.f17131t = findViewById(R.id.c8h);
        this.f17114c.mo12659a(this);
        mo14308a(this.f17133v ^ true ? 1 : 0);
        if (C9290a.f25466a && C3519c.m12965a(getContext()) && VERSION.SDK_INT >= 17) {
            this.f17127p.setLayoutDirection(1);
            this.f17127p.setTextDirection(4);
        }
    }

    /* renamed from: a */
    public final void mo12364a(boolean z) {
        int i;
        View view = this.f17126o;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    public final void setVisibility(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        setVisibility(i);
    }

    /* renamed from: a */
    public final void mo12362a(long j) {
        if (!String.valueOf(j).equals(this.f17128q.getText().toString())) {
            this.f17128q.setText(C3385e.m12591a(j));
        }
    }

    /* renamed from: a */
    public final void mo14309a(SurfaceView surfaceView) {
        if (surfaceView != null) {
            removeView(this.f17119h);
            this.f17119h = surfaceView;
            this.f17119h.setLayoutParams(new LayoutParams(-1, -1));
            addView(this.f17119h, 0);
        }
    }

    /* renamed from: b */
    public final void mo12365b(boolean z) {
        int i;
        if (!z || this.f17115d) {
            this.f17124m.setVisibility(8);
            this.f17125n.setVisibility(8);
            return;
        }
        View view = this.f17124m;
        if (this.f17114c.mo12360h_()) {
            i = 4;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        this.f17125n.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo14308a(int i) {
        switch (i) {
            case 0:
                this.f17123l.setVisibility(0);
                this.f17131t.setVisibility(8);
                this.f17121j.setVisibility(0);
                this.f17122k.setText(R.string.cvo);
                this.f17121j.setText(String.valueOf(this.f17136y));
                this.f17134w.sendEmptyMessageDelayed(0, 1000);
                return;
            case 1:
                this.f17123l.setVisibility(8);
                this.f17131t.setVisibility(0);
                return;
            case 2:
                this.f17123l.setVisibility(0);
                this.f17131t.setVisibility(8);
                this.f17121j.setVisibility(4);
                this.f17122k.setText(R.string.cvy);
                this.f17134w.sendEmptyMessageDelayed(1, 1500);
                break;
        }
    }

    public final void handleMsg(Message message) {
        switch (message.what) {
            case 0:
                this.f17136y--;
                if (this.f17136y < 0) {
                    mo14308a(1);
                    return;
                }
                this.f17121j.setText(String.valueOf(this.f17136y));
                this.f17134w.sendEmptyMessageDelayed(0, 1000);
                return;
            case 1:
                if (this.f17114c.mo12358e()) {
                    m18263c();
                    return;
                } else {
                    this.f17135x.mo12726a(this);
                    return;
                }
            case 2:
                m18264d();
                break;
        }
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.c8o) {
            if (this.f17119h != null && (this.f17119h instanceof C2432b)) {
                ((C2432b) this.f17119h).mo8937e_();
            }
        } else if (id == R.id.c8g) {
            C9249a aVar = new C9249a(getContext(), 0);
            aVar.mo22710a((int) R.string.cvv).mo22718b((int) R.string.cwp);
            aVar.mo22722b(0, (int) R.string.cvu, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C5802f.this.mo14308a(2);
                    dialogInterface.dismiss();
                }
            }).mo22722b(1, (int) R.string.ecm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).mo22729d();
        }
    }

    /* renamed from: a */
    public final void mo12363a(User user) {
        ImageModel avatarThumb = user.getAvatarThumb();
        C5343e.m17045b(this.f17118g, avatarThumb, this.f17118g.getWidth(), this.f17118g.getHeight(), R.drawable.c4_);
        if (avatarThumb == null || avatarThumb.getUrls() == null || avatarThumb.getUrls().size() == 0) {
            this.f17117f.setController(((C13382e) ((C13382e) C13380c.m39166a().mo32748b(ImageRequestBuilder.m40864a((int) R.drawable.c4_).mo33473a((C13842b) new C9092w(5, 0.0f, null)).mo33476b())).mo32729b(this.f17117f.getController())).mo32730f());
        } else {
            C5343e.m17039a(this.f17117f, avatarThumb, (C13842b) new C9092w(5, 0.0f, null));
        }
        this.f17120i.setText(user.getNickName());
        this.f17127p.setText(user.getNickName());
    }

    /* renamed from: a */
    public final void mo12361a(int i, boolean z) {
        if (!this.f17115d && this.f17133v && (this.f17132u == null || !this.f17132u.isRunning())) {
            this.f17132u = ObjectAnimator.ofInt(this.f17130s, "progress", new int[]{100, 0});
            this.f17132u.setDuration((long) (i * 1000));
            this.f17132u.setInterpolator(new LinearInterpolator());
            this.f17130s.setVisibility(0);
            this.f17132u.start();
            if (z) {
                this.f17134w.sendEmptyMessageDelayed(2, (long) ((i - 5) * 1000));
            }
        }
    }

    public C5802f(Context context, C4524a aVar, C5807a aVar2, DataCenter dataCenter) {
        super(context);
        this.f17114c = aVar;
        this.f17135x = aVar2;
        this.f17134w = new C6309f(this);
        this.f17113b = dataCenter;
    }
}
