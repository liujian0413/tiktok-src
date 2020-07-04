package com.bytedance.android.livesdk.rank;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.autodispose.C3233a;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3246ae;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.utils.C3393m;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.event.C4445o;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8445e.C8446a;
import com.bytedance.android.livesdk.log.C8447f;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.widget.CircleProgressView;
import com.bytedance.android.livesdkapi.p457i.C9478f;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;

/* renamed from: com.bytedance.android.livesdk.rank.i */
public final class C8845i {

    /* renamed from: a */
    public ViewGroup f24046a;

    /* renamed from: b */
    public ObjectAnimator f24047b;

    /* renamed from: c */
    public Bundle f24048c;

    /* renamed from: d */
    private final int f24049d;

    /* renamed from: e */
    private HSImageView f24050e;

    /* renamed from: f */
    private TextView f24051f;

    /* renamed from: g */
    private CircleProgressView f24052g;

    /* renamed from: h */
    private long f24053h;

    /* renamed from: i */
    private Context f24054i;

    /* renamed from: j */
    private Lifecycle f24055j;

    /* renamed from: b */
    private void m26459b() {
        this.f24052g.setBorderColor(-45517);
        this.f24052g.setBorderWidth(C9738o.m28708b(this.f24054i, 1.5f));
        this.f24052g.setClockWise(false);
    }

    /* renamed from: c */
    private static void m26460c() {
        C8443c.m25663a().mo21606a("livesdk_return_show", C8446a.m25675a().mo21609a("banner_type", C8447f.m25681a("enter_method", C8443c.m25663a().mo21605a(C8438j.class))).f23108a, new Object[0]);
    }

    /* renamed from: a */
    public final void mo21913a() {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f24051f, "width", new int[]{this.f24051f.getWidth(), 0});
        ofInt.setDuration(150);
        ofInt.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21914a(C8845i iVar) throws Exception {
        this.f24046a.setVisibility(8);
    }

    /* renamed from: a */
    private void m26455a(int i) {
        this.f24051f.setText(R.string.ebq);
    }

    /* renamed from: a */
    private void m26458a(Parcelable parcelable) {
        if (parcelable instanceof ImageModel) {
            C3393m.m12620a(this.f24050e, (ImageModel) parcelable, this.f24049d, this.f24049d);
        }
    }

    /* renamed from: a */
    private void m26457a(Context context) {
        if (context != null) {
            this.f24050e = (HSImageView) this.f24046a.findViewById(R.id.e8m);
            this.f24051f = (TextView) this.f24046a.findViewById(R.id.jz);
            this.f24052g = (CircleProgressView) this.f24046a.findViewById(R.id.w1);
            C9738o.m28701a((View) this.f24046a, -3, (int) C9738o.m28708b(context, 26.0f));
        }
    }

    /* renamed from: b */
    public final void mo21916b(DataCenter dataCenter) {
        long j;
        String str = "data_back_to_pre_room_fraction";
        if (this.f24047b == null) {
            j = ((long) ((C9478f) LiveConfigSettingKeys.BACK_TO_PRE_ROOM_SETTING.mo10240a()).f25949a) * 1000;
        } else {
            j = this.f24047b.getCurrentPlayTime();
        }
        dataCenter.lambda$put$1$DataCenter(str, Long.valueOf(j));
    }

    /* renamed from: a */
    private void m26456a(long j) {
        long j2 = (long) (((C9478f) LiveConfigSettingKeys.BACK_TO_PRE_ROOM_SETTING.mo10240a()).f25949a * 1000);
        float f = 360.0f;
        if (j > 0) {
            f = 360.0f - ((((float) j) * 360.0f) / ((float) j2));
            j2 -= j;
        }
        this.f24047b = ObjectAnimator.ofFloat(this.f24052g, "progress", new float[]{f, 0.0f});
        this.f24047b.setDuration(j2);
        this.f24047b.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C8845i.this.f24046a.setVisibility(8);
            }
        });
        this.f24047b.start();
    }

    /* renamed from: a */
    public final void mo21915a(DataCenter dataCenter) {
        if (dataCenter != null) {
            Bundle bundle = (Bundle) dataCenter.get("data_room_back");
            this.f24048c = bundle;
            if (bundle != null) {
                m26458a(this.f24048c.getParcelable("pre_room_user_avatar"));
                C9738o.m28712b((View) this.f24046a, 0);
                String str = (String) C8443c.m25663a().mo21605a(C8438j.class).mo21568a().get("source");
                this.f24046a.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        if (C8845i.this.f24048c != null) {
                            C9097a.m27146a().mo22267a((Object) new C4445o(C8845i.this.f24048c.getLong("live.intent.extra.ROOM_ID", 0), C8804a.m26397b(C8845i.this.f24048c), true));
                        }
                    }
                });
                long longValue = ((Long) dataCenter.get("data_room_id", Long.valueOf(0))).longValue();
                if (this.f24053h != longValue && !C8804a.m26394a()) {
                    C9049ap.m27024a(this.f24046a.getContext(), (int) R.string.ecz);
                }
                this.f24053h = longValue;
                if (C8804a.m26396a(str, dataCenter)) {
                    m26459b();
                    m26455a((int) R.string.ebq);
                    long longValue2 = ((Long) dataCenter.get("data_back_to_pre_room_fraction", Long.valueOf(0))).longValue();
                    m26456a(longValue2);
                    long j = (long) (((C9478f) LiveConfigSettingKeys.BACK_TO_PRE_ROOM_SETTING.mo10240a()).f25950b * 1000);
                    if (longValue2 < j) {
                        j -= longValue2;
                    }
                    ((C3245ad) C7492s.m23301b(this).mo19320e(j, TimeUnit.MILLISECONDS).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) C3255e.m12297a((C3246ae) C3233a.m12257a(this.f24055j, Event.ON_DESTROY)))).mo10183a(C8848j.f24058a, C3303k.m12377b());
                } else {
                    ((C3245ad) C7492s.m23301b(this).mo19320e(300000, TimeUnit.MILLISECONDS).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) C3255e.m12297a((C3246ae) C3233a.m12257a(this.f24055j, Event.ON_DESTROY)))).mo10183a(new C8849k(this), C3303k.m12377b());
                }
                m26460c();
                return;
            }
        }
        this.f24046a.setVisibility(8);
    }

    public C8845i(Context context, Lifecycle lifecycle, ViewGroup viewGroup) {
        this.f24054i = context;
        this.f24055j = lifecycle;
        this.f24046a = viewGroup;
        m26457a(context);
        this.f24049d = (int) C9738o.m28708b(context, 20.0f);
    }
}
