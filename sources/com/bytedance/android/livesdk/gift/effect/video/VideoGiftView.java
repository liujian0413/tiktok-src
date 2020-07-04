package com.bytedance.android.livesdk.gift.effect.video;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.p158a.C3342a;
import com.bytedance.android.live.gift.C3436f;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.gift.effect.p376b.C7963a;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.message.model.C8551cm;
import com.bytedance.android.livesdk.message.model.C8551cm.C8552a;
import com.bytedance.android.livesdk.widget.GiftUserInfoView;
import com.bytedance.android.livesdkapi.depend.live.p444a.C9322a;
import com.bytedance.android.livesdkapi.depend.live.p444a.C9324c;
import com.bytedance.android.livesdkapi.depend.live.p444a.C9325d;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;

public class VideoGiftView extends FrameLayout implements OnClickListener {

    /* renamed from: a */
    private GiftUserInfoView f21977a;

    /* renamed from: b */
    private FrameLayout f21978b;

    /* renamed from: c */
    private View f21979c;

    /* renamed from: d */
    private TextView f21980d;

    /* renamed from: e */
    private ImageView f21981e;

    /* renamed from: f */
    private C7963a f21982f;

    /* renamed from: g */
    private C3436f f21983g;

    /* renamed from: h */
    private float f21984h;

    /* renamed from: i */
    private float f21985i;

    /* renamed from: j */
    private boolean f21986j;

    /* renamed from: k */
    private C8552a f21987k;

    /* renamed from: l */
    private C9322a f21988l;

    /* renamed from: m */
    private Map<String, Object> f21989m = new HashMap();

    private int getResourceLayout() {
        return R.layout.azl;
    }

    /* renamed from: a */
    public final void mo21058a(boolean z) {
        if (z) {
            LayoutParams layoutParams = (LayoutParams) this.f21977a.getLayoutParams();
            layoutParams.topMargin = (int) this.f21985i;
            this.f21977a.setLayoutParams(layoutParams);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) this.f21977a.getLayoutParams();
        layoutParams2.topMargin = (int) this.f21984h;
        this.f21977a.setLayoutParams(layoutParams2);
    }

    /* renamed from: c */
    public final void mo21061c() {
        this.f21977a.mo20986c();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m24726d();
    }

    /* renamed from: d */
    private void m24726d() {
        if (this.f21988l != null) {
            this.f21988l.mo21090b();
            this.f21988l.mo21093d();
            this.f21988l.mo21094e();
            this.f21988l.mo21091b(this.f21978b);
        }
    }

    /* renamed from: b */
    public final void mo21059b() {
        if (this.f21982f != null && this.f21982f.f21563m) {
            this.f21977a.mo20984b();
            this.f21977a.mo22442a(0);
        }
    }

    /* renamed from: a */
    public final void mo21054a() {
        if (this.f21987k != null) {
            this.f21979c.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f21979c, "alpha", new float[]{0.0f, 0.0f}).setDuration(this.f21987k.f23560d);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f21979c, "alpha", new float[]{0.0f, 1.0f}).setDuration(500);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.f21979c, "alpha", new float[]{1.0f, 1.0f}).setDuration(this.f21987k.f23561e - 500);
            ObjectAnimator duration4 = ObjectAnimator.ofFloat(this.f21979c, "alpha", new float[]{1.0f, 0.0f}).setDuration(500);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(new Animator[]{duration, duration2, duration3, duration4});
            animatorSet.start();
        }
    }

    public void setPortrait(boolean z) {
        this.f21986j = z;
    }

    public void setUserEventListener(C3436f fVar) {
        this.f21983g = fVar;
    }

    /* renamed from: a */
    private static String m24722a(User user) {
        if (user == null) {
            return null;
        }
        return user.displayId;
    }

    public VideoGiftView(Context context) {
        super(context);
        m24723a(context);
    }

    private void setTextEffect(C8551cm cmVar) {
        C8552a aVar;
        if (cmVar != null) {
            if (this.f21986j) {
                aVar = cmVar.f23555a;
            } else {
                aVar = cmVar.f23556b;
            }
            this.f21987k = aVar;
        }
    }

    public void onClick(View view) {
        if (this.f21983g != null) {
            this.f21983g.mo10403a(this.f21977a.getUserId());
        }
    }

    /* renamed from: a */
    private void m24725a(C9505f fVar) {
        if (fVar != null) {
            this.f21980d.setText(((C3495l) C3596c.m13172a(C3495l.class)).parsePatternAndGetSpannable(fVar.f26014b, fVar));
        }
    }

    /* renamed from: b */
    public final void mo21060b(boolean z) {
        if (this.f21988l != null) {
            if (z) {
                this.f21988l.mo21086a((ViewGroup) this.f21978b);
                return;
            }
            this.f21988l.mo21091b(this.f21978b);
        }
    }

    /* renamed from: a */
    private void m24723a(Context context) {
        this.f21984h = getResources().getDimension(R.dimen.uf);
        this.f21985i = getResources().getDimension(R.dimen.ue);
        LayoutInflater.from(context).inflate(getResourceLayout(), this, true);
        this.f21977a = (GiftUserInfoView) findViewById(R.id.e_8);
        this.f21978b = (FrameLayout) findViewById(R.id.ebx);
        this.f21979c = findViewById(R.id.dhl);
        this.f21981e = (ImageView) findViewById(R.id.dhm);
        this.f21980d = (TextView) findViewById(R.id.dhn);
        this.f21977a.setOnClickListener(this);
        this.f21989m.put("desc", "播放大礼物动画");
    }

    private void setUserInfo(C7963a aVar) {
        ImageModel imageModel;
        if (aVar != null && aVar.f21557g != null) {
            User user = aVar.f21557g;
            this.f21977a.setUserId(user.getId());
            if (user.getAvatarThumb() != null) {
                this.f21977a.setAvatarImage(user.getAvatarThumb());
            }
            GiftUserInfoView giftUserInfoView = this.f21977a;
            if (user.getBorder() != null) {
                imageModel = user.getBorder().f7818a;
            } else {
                imageModel = null;
            }
            giftUserInfoView.setAvatarBorder(imageModel);
            if (!(user.getUserHonor() == null || user.getUserHonor().mo8708l() == null)) {
                this.f21977a.setHonorImage(user.getUserHonor().mo8708l());
            }
            this.f21977a.setUserNameText(m24722a(user));
            if (aVar.f21564n != null) {
                this.f21977a.setSpannable(aVar.f21564n);
            } else {
                this.f21977a.setDescriptionText(aVar.f21558h);
            }
        }
    }

    /* renamed from: a */
    private void m24724a(C7963a aVar) {
        String str;
        this.f21989m.put("effect_id", Long.valueOf(aVar.f21552b));
        this.f21989m.put("gift_id", Long.valueOf(aVar.f21560j));
        this.f21989m.put("msg_id", Long.valueOf(aVar.f21551a));
        Map<String, Object> map = this.f21989m;
        String str2 = "from_user_id";
        if (aVar.f21557g != null) {
            str = String.valueOf(aVar.f21557g.getId());
        } else {
            str = "";
        }
        map.put(str2, str);
        C8444d.m25673b().mo9999a("ttlive_gift", this.f21989m);
    }

    public VideoGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m24723a(context);
    }

    /* renamed from: a */
    public final void mo21057a(C7963a aVar, User user) {
        if (this.f21988l != null && aVar != null) {
            this.f21982f = aVar;
            setUserInfo(aVar);
            setTextEffect(aVar.f21559i);
            m24724a(aVar);
            this.f21988l.mo21089a(aVar.f21554d, aVar.f21551a);
        }
    }

    public VideoGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24723a(context);
    }

    /* renamed from: a */
    public final void mo21056a(Context context, C0043i iVar, C9324c cVar, C9325d dVar) {
        this.f21988l = ((IGiftService) C3596c.m13172a(IGiftService.class)).giftPlayControllerManager().mo21099a(context.hashCode());
        if (this.f21988l != null) {
            this.f21988l.mo21087a(cVar);
            this.f21988l.mo21088a(dVar);
            View a = this.f21988l.mo21083a();
            if (a != null) {
                ViewGroup viewGroup = (ViewGroup) a.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(a);
                }
            }
            this.f21988l.mo21086a((ViewGroup) this.f21978b);
        }
    }

    /* renamed from: a */
    public final void mo21055a(float f, float f2, float f3, float f4) {
        if (this.f21987k != null) {
            LayoutParams layoutParams = (LayoutParams) this.f21979c.getLayoutParams();
            layoutParams.width = (int) (this.f21987k.mo21679d() * f);
            layoutParams.height = (int) (this.f21987k.mo21680e() * f2);
            this.f21979c.setLayoutParams(layoutParams);
            this.f21979c.setX((this.f21987k.mo21677b() * f) + f3);
            this.f21979c.setY((this.f21987k.mo21678c() * f2) + f4);
            this.f21980d.setTextSize(0, C9738o.m28708b(getContext(), (float) this.f21987k.mo21676a()));
            if (!C6319n.m19593a(this.f21987k.f23569m)) {
                try {
                    this.f21980d.setShadowLayer((float) C3358ac.m12510a(this.f21987k.mo21683h()), (float) C3358ac.m12510a(this.f21987k.mo21681f()), (float) C3358ac.m12510a(this.f21987k.mo21682g()), Color.parseColor(this.f21987k.f23569m));
                } catch (IllegalArgumentException unused) {
                }
            }
            m24725a(this.f21987k.f23557a);
            if (this.f21987k.f23559c == null) {
                this.f21981e.setVisibility(8);
                return;
            }
            C3342a.m12468a(getContext()).mo10257a(this.f21987k.f23559c).mo10256a(ScaleType.FIT_XY).mo10261a(this.f21981e);
            this.f21981e.setVisibility(0);
        }
    }
}
