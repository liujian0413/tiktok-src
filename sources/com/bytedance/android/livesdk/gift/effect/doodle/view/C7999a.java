package com.bytedance.android.livesdk.gift.effect.doodle.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.gift.C3436f;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.effect.doodle.adapter.C7981a;
import com.bytedance.android.livesdk.gift.effect.doodle.p377a.C7980a;
import com.bytedance.android.livesdk.gift.effect.doodle.p378b.C7984b;
import com.bytedance.android.livesdk.gift.effect.doodle.view.DoodleGiftView.DoodleType;
import com.bytedance.android.livesdk.message.C8455b;
import com.bytedance.android.livesdk.message.C8468c;
import com.bytedance.android.livesdk.message.C8470e;
import com.bytedance.android.livesdk.message.model.C8696z;
import com.bytedance.android.livesdk.widget.GiftUserInfoView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.view.a */
public final class C7999a extends FrameLayout implements OnClickListener, C8468c {

    /* renamed from: a */
    public DoodleGiftView f21715a;

    /* renamed from: b */
    public GiftUserInfoView f21716b;

    /* renamed from: c */
    public boolean f21717c;

    /* renamed from: d */
    public boolean f21718d;

    /* renamed from: e */
    private C7981a f21719e;

    /* renamed from: f */
    private Queue<C7984b> f21720f;

    /* renamed from: g */
    private int f21721g;

    /* renamed from: h */
    private C3436f f21722h;

    /* renamed from: i */
    private long f21723i;

    /* renamed from: j */
    private int f21724j = ((Integer) LiveSettingKeys.LIVE_MESSAGE_QUEUE_MAX_LENGTH.mo10240a()).intValue();

    /* renamed from: k */
    private AnimatorSet f21725k;

    /* renamed from: l */
    private ObjectAnimator f21726l;

    private int getLayoutResource() {
        return R.layout.awb;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        m24527d();
        super.onDetachedFromWindow();
    }

    /* renamed from: c */
    private void m24526c() {
        if (this.f21720f.size() > this.f21724j) {
            this.f21720f.remove();
        }
    }

    /* renamed from: b */
    public final void mo20909b() {
        if (this.f21720f != null) {
            this.f21720f.clear();
        }
    }

    /* renamed from: a */
    public final void mo20905a() {
        if (!this.f21720f.isEmpty() && !this.f21717c) {
            C7984b bVar = (C7984b) this.f21720f.poll();
            setUserInfo(bVar);
            this.f21715a.mo20896a(bVar).mo20898a();
            this.f21717c = true;
            StringBuilder sb = new StringBuilder("播放涂鸦礼物动画， giftMessageId=");
            sb.append(bVar.f21923i);
            C3166a.m11964c("DoodleAnimationView", sb.toString());
        }
    }

    /* renamed from: d */
    private void m24527d() {
        this.f21720f.clear();
        this.f21717c = false;
        if (this.f21715a != null) {
            this.f21715a.mo20902d();
            this.f21715a.setVisibility(4);
        }
        if (this.f21716b != null) {
            this.f21716b.setVisibility(4);
        }
        if (this.f21725k != null && this.f21725k.isRunning()) {
            this.f21725k.cancel();
        }
        if (this.f21726l != null && this.f21726l.isRunning()) {
            this.f21726l.cancel();
        }
        if (this.f21718d) {
            C8470e.m25735a().mo21645b(this);
        }
    }

    public final void setUserEventListener(C3436f fVar) {
        this.f21722h = fVar;
    }

    /* renamed from: b */
    public final void mo20910b(long j) {
        this.f21716b.mo20986c();
    }

    /* renamed from: a */
    public final void mo20907a(final long j) {
        this.f21716b.mo20984b();
        this.f21716b.post(new Runnable() {
            public final void run() {
                C7999a.this.f21716b.mo22442a(j);
            }
        });
    }

    public final void onClick(View view) {
        if (this.f21722h != null && this.f21717c) {
            this.f21722h.mo10403a(this.f21723i);
        }
    }

    public C7999a(Context context) {
        super(context);
        m24525a(context);
    }

    /* renamed from: a */
    private void m24525a(Context context) {
        LayoutInflater.from(context).inflate(getLayoutResource(), this, true);
        setLayoutParams(new LayoutParams(-1, -1));
        this.f21718d = ((Boolean) LiveSettingKeys.LIVE_SDK_NEW_EFFECT_PLAYER.mo10240a()).booleanValue();
        this.f21721g = (int) getResources().getDimension(R.dimen.uf);
        this.f21716b = (GiftUserInfoView) findViewById(R.id.asa);
        this.f21716b.setOnClickListener(this);
        this.f21715a = (DoodleGiftView) findViewById(R.id.a_f);
        this.f21715a.mo20897a(DoodleType.play).mo20895a((C7980a) new C7980a() {
            /* renamed from: a */
            public final void mo20873a() {
                C7999a.this.f21715a.setVisibility(4);
                C7999a.this.f21716b.setVisibility(4);
                C7999a.this.f21717c = false;
                if (C7999a.this.f21718d) {
                    C8470e.m25735a().mo21644b();
                } else {
                    C7999a.this.mo20905a();
                }
            }

            /* renamed from: a */
            public final void mo20874a(long j) {
                C7999a.this.mo20910b(300);
            }

            /* renamed from: a */
            public final void mo20875a(long j, float f) {
                C7999a.this.f21715a.setVisibility(0);
                C7999a.this.mo20906a(f);
                C7999a.this.mo20907a(300);
            }
        });
        this.f21719e = new C7981a();
        this.f21720f = new ArrayDeque();
        if (this.f21718d) {
            C8470e.m25735a().mo21643a((C8468c) this);
        }
    }

    private void setUserInfo(C7984b bVar) {
        ImageModel imageModel;
        if (bVar.f21926l != null) {
            this.f21723i = bVar.f21926l.getId();
            if (!(bVar.f21926l == null || bVar.f21926l.getAvatarThumb() == null)) {
                this.f21716b.setAvatarImage(bVar.f21926l.getAvatarThumb());
            }
            if (bVar.f21926l != null) {
                GiftUserInfoView giftUserInfoView = this.f21716b;
                if (bVar.f21926l.getBorder() != null) {
                    imageModel = bVar.f21926l.getBorder().f7818a;
                } else {
                    imageModel = null;
                }
                giftUserInfoView.setAvatarBorder(imageModel);
            }
            if (!(bVar.f21926l == null || bVar.f21926l.getUserHonor() == null || bVar.f21926l.getUserHonor().mo8708l() == null)) {
                this.f21716b.setHonorImage(bVar.f21926l.getUserHonor().mo8708l());
            }
            this.f21716b.setUserNameText(bVar.f21926l.getNickName());
            this.f21716b.setDescriptionText(bVar.f21925k);
            this.f21716b.setUserId(this.f21723i);
        }
    }

    /* renamed from: a */
    public final void mo20906a(float f) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f21716b.getLayoutParams();
        layoutParams.topMargin = (((int) f) - ((int) getResources().getDimension(R.dimen.pe))) - ((int) getResources().getDimension(R.dimen.om));
        if (layoutParams.topMargin <= this.f21721g) {
            layoutParams.topMargin = this.f21721g;
        }
        this.f21716b.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo20908a(C8696z zVar) {
        User user = zVar.f23700a;
        if (user != null && user.getId() == ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()) {
            zVar.f23708i = true;
        }
        if (this.f21718d) {
            C8470e.m25735a().mo21642a((C8455b) zVar);
            return;
        }
        C7984b a = C7981a.m24499a(zVar);
        if (a != null) {
            this.f21720f.add(a);
            m24526c();
        }
        mo20905a();
    }

    /* renamed from: a */
    public final boolean mo14038a(C8455b bVar) {
        if (bVar instanceof C8696z) {
            C7984b a = C7981a.m24499a(bVar);
            if (a != null) {
                setUserInfo(a);
                this.f21715a.mo20896a(a).mo20898a();
                this.f21717c = true;
                StringBuilder sb = new StringBuilder("播放涂鸦礼物动画， giftMessageId=");
                sb.append(a.f21923i);
                C3166a.m11964c("DoodleAnimationView", sb.toString());
                return true;
            }
        }
        return false;
    }
}
