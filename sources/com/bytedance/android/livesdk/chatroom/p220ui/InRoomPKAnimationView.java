package com.bytedance.android.livesdk.chatroom.p220ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.C7874h;
import com.bytedance.android.livesdk.gift.assets.C7877j;
import com.bytedance.android.livesdk.log.C8409a;
import com.bytedance.android.livesdk.p181a.C3848a;
import com.bytedance.android.livesdk.utils.C9066h;
import com.bytedance.android.livesdk.utils.C9066h.C9068b;
import com.bytedance.common.utility.C9738o;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.InRoomPKAnimationView */
public class InRoomPKAnimationView extends FrameLayout {

    /* renamed from: a */
    private View f14581a;

    /* renamed from: b */
    private HSImageView f14582b;

    /* renamed from: c */
    private TextView f14583c;

    /* renamed from: d */
    private View f14584d;

    /* renamed from: e */
    private HSImageView f14585e;

    /* renamed from: f */
    private TextView f14586f;

    /* renamed from: g */
    private C7321c f14587g;

    /* renamed from: h */
    private HSImageView f14588h;

    /* renamed from: i */
    private int f14589i;

    /* renamed from: a */
    public final void mo13205a() {
        long j;
        C50811 r0 = new C7877j() {
            /* renamed from: a */
            public final void mo9346a(Throwable th) {
            }

            /* renamed from: a */
            public final void mo9345a(long j, String str) {
                String str2;
                C9068b a = C9066h.m27071a(str);
                if (a != null) {
                    str2 = a.mo22256a(InRoomPKAnimationView.this.getContext());
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    InRoomPKAnimationView.this.mo13207a(new Builder().scheme("file").path(str2).build());
                }
            }
        };
        if (LiveSettingKeys.ASSET_ANIM_ID_MAP.mo10240a() == null) {
            j = 0;
        } else {
            j = ((C3848a) LiveSettingKeys.ASSET_ANIM_ID_MAP.mo10240a()).f11540b;
        }
        C7874h assetsManager = ((IGiftService) C3596c.m13172a(IGiftService.class)).getAssetsManager();
        if (assetsManager != null) {
            AssetsModel c = assetsManager.mo20662c(j);
            if (c == null) {
                C8409a.m25578a("资源列表中找不到这个PK特效", String.valueOf(j));
            } else if (c.getResourceType() != 6) {
                C8409a.m25578a("获取到的特效资源不是PK特效", String.valueOf(j));
            } else {
                assetsManager.mo20656a(j, r0, 4);
            }
        }
    }

    /* renamed from: b */
    private void m16386b() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.awt, this, true);
        this.f14581a = inflate.findViewById(R.id.at0);
        this.f14582b = (HSImageView) inflate.findViewById(R.id.auf);
        this.f14583c = (TextView) inflate.findViewById(R.id.e3k);
        this.f14584d = inflate.findViewById(R.id.at3);
        this.f14585e = (HSImageView) inflate.findViewById(R.id.auh);
        this.f14586f = (TextView) inflate.findViewById(R.id.e3m);
        this.f14588h = (HSImageView) inflate.findViewById(R.id.b5z);
        this.f14589i = (int) (((float) (C9738o.m28691a(getContext()) / 2)) + C9738o.m28708b(getContext(), 30.0f));
        C9738o.m28701a(this.f14581a, this.f14589i, -3);
        C9738o.m28702a(this.f14581a, -this.f14589i, -3, -3, -3);
        C9738o.m28701a(this.f14584d, this.f14589i, -3);
        C9738o.m28702a(this.f14584d, -3, -3, -this.f14589i, -3);
    }

    public InRoomPKAnimationView(Context context) {
        super(context);
        m16386b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13209a(Long l) throws Exception {
        setVisibility(8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13206a(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C9738o.m28702a(this.f14584d, -3, -3, intValue, -3);
        C9738o.m28702a(this.f14581a, intValue, -3, -3, -3);
    }

    /* renamed from: a */
    public final void mo13207a(Uri uri) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{-this.f14589i, 0});
        ofInt.setDuration(375);
        ofInt.setInterpolator(new AccelerateInterpolator(2.0f));
        ofInt.addUpdateListener(new C5178ad(this));
        ofInt.start();
        C7492s.m23295b(300, TimeUnit.MILLISECONDS).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C5179ae<Object>(this, uri));
        this.f14587g = C7492s.m23295b(1525, TimeUnit.MILLISECONDS).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C5180af<Object>(this), C5181ag.f15211a);
    }

    public InRoomPKAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m16386b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13208a(Uri uri, Long l) throws Exception {
        this.f14588h.setController(((C13382e) C13380c.m39166a().mo32713b(uri).mo32751c(true)).mo32730f());
        this.f14588h.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo13211b(String str, ImageModel imageModel) {
        if (this.f14586f != null) {
            this.f14586f.setText(str);
        }
        C5343e.m17033a(this.f14585e, imageModel, R.drawable.c4_, -340459, C9738o.m28708b(getContext(), 1.0f), null);
    }

    /* renamed from: a */
    public final void mo13210a(String str, ImageModel imageModel) {
        if (this.f14583c != null) {
            this.f14583c.setText(str);
        }
        C5343e.m17033a(this.f14582b, imageModel, R.drawable.c4_, -340459, C9738o.m28708b(getContext(), 1.0f), null);
    }

    public InRoomPKAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m16386b();
    }
}
