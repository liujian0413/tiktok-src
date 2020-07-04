package com.bytedance.android.livesdk.gift.dialog.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3393m.C3397b;
import com.bytedance.android.live.core.utils.C3404s.C3405a;
import com.bytedance.android.live.core.utils.p158a.C3342a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7939b;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.p457i.C9475c;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.facebook.drawee.controller.C13401d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

public class LiveGiftFirstChargeWidget extends LiveRecyclableWidget {

    /* renamed from: a */
    public HSImageView f21363a;

    /* renamed from: b */
    public AnimatorSet f21364b;

    /* renamed from: c */
    public final C47562b f21365c = new C47562b();

    /* renamed from: d */
    private final GiftViewModel f21366d;

    public int getLayoutId() {
        return R.layout.ali;
    }

    /* renamed from: a */
    public final void mo20736a() {
        this.f21363a.setVisibility(8);
    }

    public void onUnload() {
        if (!this.f21365c.isDisposed()) {
            this.f21365c.dispose();
        }
        this.f21366d.mo20783a((C0043i) this);
    }

    /* renamed from: b */
    private void m24242b() {
        User user = (User) this.dataCenter.get("data_user_in_room");
        if (user != null && user.isNeverRecharge()) {
            String str = (String) C8946b.f24401aZ.mo22117a();
            String format = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date());
            if (!TextUtils.equals(str, format)) {
                C9475c cVar = (C9475c) LiveSettingKeys.LIVE_FIRST_CHARGE_TIP_INFO.mo10240a();
                if (cVar != null && !TextUtils.isEmpty(cVar.f25938d) && cVar.f25940f == 1) {
                    m24241a(cVar);
                    C8946b.f24401aZ.mo22118a(format);
                }
            }
        }
    }

    public LiveGiftFirstChargeWidget(GiftViewModel giftViewModel) {
        this.f21366d = giftViewModel;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo20737a(C7939b bVar) {
        if (bVar != null && bVar.f21504l) {
            mo20736a();
        }
    }

    public void onInit(Object[] objArr) {
        this.f21363a = (HSImageView) findViewById(R.id.al9);
    }

    public void onLoad(Object[] objArr) {
        m24242b();
        this.f21366d.mo20784a((C0043i) this, (C0053p<C7939b>) new C7918f<C7939b>(this));
    }

    /* renamed from: a */
    private void m24241a(final C9475c cVar) {
        C3342a.m12468a(this.containerView.getContext()).mo10259a(cVar.f25938d).mo10256a(ScaleType.CENTER_INSIDE).mo10258a((C13401d) new C3397b(null, new C3405a() {
            /* renamed from: a */
            public final void mo10308a(ImageModel imageModel) {
            }

            /* renamed from: a */
            public final void mo10310a(ImageModel imageModel, Exception exc) {
                LiveGiftFirstChargeWidget.this.mo20736a();
            }

            /* renamed from: a */
            public final void mo10309a(ImageModel imageModel, int i, int i2, boolean z) {
                LiveGiftFirstChargeWidget.this.f21364b = new AnimatorSet();
                LiveGiftFirstChargeWidget.this.f21363a.clearAnimation();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(LiveGiftFirstChargeWidget.this.f21363a, "scaleX", new float[]{0.8f, 1.0f, 1.0f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(LiveGiftFirstChargeWidget.this.f21363a, "scaleY", new float[]{0.8f, 1.0f, 1.0f});
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(LiveGiftFirstChargeWidget.this.f21363a, "alpha", new float[]{0.0f, 1.0f, 1.0f});
                LiveGiftFirstChargeWidget.this.f21363a.setPivotX((float) (C3358ac.m12523c() - C3358ac.m12510a(72.0f)));
                LiveGiftFirstChargeWidget.this.f21363a.setPivotY((float) (i2 / 2));
                LiveGiftFirstChargeWidget.this.f21364b.setDuration(300);
                LiveGiftFirstChargeWidget.this.f21364b.play(ofFloat).with(ofFloat2).with(ofFloat3);
                LiveGiftFirstChargeWidget.this.f21364b.start();
                LiveGiftFirstChargeWidget.this.f21364b.addListener(new AnimatorListener() {
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationCancel(Animator animator) {
                        LiveGiftFirstChargeWidget.this.mo20736a();
                    }

                    public final void onAnimationEnd(Animator animator) {
                        LiveGiftFirstChargeWidget.this.f21365c.mo119661a(C7492s.m23295b(cVar.f25939e, TimeUnit.MILLISECONDS).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19325f((C7326g<? super T>) new C7326g<Long>() {
                            /* access modifiers changed from: private */
                            /* renamed from: a */
                            public void accept(Long l) throws Exception {
                                LiveGiftFirstChargeWidget.this.mo20736a();
                            }
                        }));
                    }
                });
            }
        })).mo10261a((ImageView) this.f21363a);
    }
}
