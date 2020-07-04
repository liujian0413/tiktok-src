package com.bytedance.android.live.broadcast.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.broadcast.api.model.C2436a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.room.C3492i;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.gift.assets.C7877j;
import com.bytedance.android.livesdk.p397k.C8362l;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.utils.C9034ad;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

public class TaskFinishAnimationWidget extends LiveRecyclableWidget implements C6310a {

    /* renamed from: a */
    public TextView f9482a;

    /* renamed from: b */
    public AlphaAnimation f9483b;

    /* renamed from: c */
    public Runnable f9484c;

    /* renamed from: d */
    public AlphaAnimation f9485d;

    /* renamed from: e */
    public final C6309f f9486e = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: f */
    private LottieAnimationView f9487f;

    /* renamed from: g */
    private C47562b f9488g = new C47562b();

    public int getLayoutId() {
        return R.layout.alb;
    }

    /* renamed from: a */
    public final void mo9869a() {
        this.f9485d = new AlphaAnimation(0.0f, 1.0f);
        this.f9483b = new AlphaAnimation(1.0f, 0.0f);
        this.f9485d.setDuration(200);
        this.f9483b.setDuration(200);
        this.f9484c = new Runnable() {
            public final void run() {
                if (TaskFinishAnimationWidget.this.isViewValid()) {
                    TaskFinishAnimationWidget.this.f9482a.startAnimation(TaskFinishAnimationWidget.this.f9483b);
                }
            }
        };
    }

    public void onUnload() {
        if (this.f9488g != null) {
            this.f9488g.mo119660a();
        }
        if (this.f9485d != null) {
            this.f9485d.cancel();
            this.f9485d = null;
        }
        if (this.f9483b != null) {
            this.f9483b.cancel();
            this.f9483b = null;
        }
        if (this.f9484c != null) {
            this.f9484c = null;
        }
    }

    public void onInit(Object[] objArr) {
        this.f9482a = (TextView) findViewById(R.id.dnr);
        this.f9487f = (LottieAnimationView) findViewById(R.id.dnq);
    }

    public void handleMsg(Message message) {
        if (message != null && message.what == 100 && (message.obj instanceof C8362l)) {
            C3492i lottiePlayService = ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).getLottiePlayService();
            if (lottiePlayService != null) {
                lottiePlayService.startLotteryFullAnimation((C8362l) message.obj, this.f9487f, true);
            }
        }
    }

    public void onLoad(Object[] objArr) {
        this.f9488g.mo119661a(C9097a.m27146a().mo22266a(C2436a.class).mo19325f((C7326g<? super T>) new C7326g<C2436a>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C2436a aVar) throws Exception {
                TaskFinishAnimationWidget.this.mo9870a(aVar);
            }
        }));
        this.f9487f.mo7076a((AnimatorListener) new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                C9738o.m28712b((View) TaskFinishAnimationWidget.this.f9482a, 8);
            }

            public final void onAnimationStart(Animator animator) {
                C9738o.m28712b((View) TaskFinishAnimationWidget.this.f9482a, 0);
                TaskFinishAnimationWidget.this.mo9869a();
                TaskFinishAnimationWidget.this.f9482a.startAnimation(TaskFinishAnimationWidget.this.f9485d);
                TaskFinishAnimationWidget.this.f9482a.postDelayed(TaskFinishAnimationWidget.this.f9484c, 1700);
            }
        });
    }

    /* renamed from: a */
    public final void mo9870a(C2436a aVar) {
        if (aVar != null && !TextUtils.isEmpty(aVar.f7969b)) {
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.f7968a);
            sb.append("\n");
            sb.append(aVar.f7969b);
            SpannableString spannableString = new SpannableString(sb.toString());
            if (!TextUtils.isEmpty(aVar.f7968a)) {
                spannableString.setSpan(new AbsoluteSizeSpan(C3358ac.m12510a(11.0f)), 0, aVar.f7968a.length(), 18);
            }
            this.f9482a.setText(spannableString);
            ((IGiftService) C3596c.m13172a(IGiftService.class)).getAssetsManager().mo20656a((long) ((Integer) LiveConfigSettingKeys.BROADCAST_TASK_RESOURCE_ID.mo10240a()).intValue(), new C7877j() {
                /* renamed from: a */
                public final void mo9346a(Throwable th) {
                }

                /* renamed from: a */
                public final void mo9345a(long j, String str) {
                    C9034ad.m26992a(TaskFinishAnimationWidget.this.f9486e, str, 7, 100);
                }
            }, 4);
        }
    }
}
