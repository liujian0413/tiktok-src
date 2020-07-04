package com.bytedance.android.livesdk.banner.p189ad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p210c.C4299b;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.utils.C9043ak;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.model.live.C9357a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.banner.ad.BannerAdView */
public class BannerAdView extends RelativeLayout implements OnClickListener {

    /* renamed from: a */
    private View f11759a;

    /* renamed from: b */
    private HSImageView f11760b;

    /* renamed from: c */
    private boolean f11761c;

    /* renamed from: d */
    private C9357a f11762d;

    /* renamed from: e */
    private boolean f11763e;

    public BannerAdView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m13833a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.alf, this, true);
        setOnClickListener(this);
        this.f11759a = findViewById(R.id.aly);
        this.f11759a.setOnClickListener(this);
        this.f11760b = (HSImageView) findViewById(R.id.b6e);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.aly) {
            m13834a(view);
        } else if (C9043ak.m27009a()) {
            if (!C3933c.m13841a(getContext())) {
                C9049ap.m27022a((int) R.string.eyf);
                return;
            }
            Object tag = view.getTag();
            if (tag instanceof C9357a) {
                C4299b.m14478a(getContext(), (C9357a) tag);
                m13836a("livesdk_game_ad_banner_click");
            }
        }
    }

    /* renamed from: a */
    private void m13834a(View view) {
        if (getParent() instanceof View) {
            C9738o.m28712b((View) getParent(), 8);
        }
        this.f11761c = true;
        C9097a.m27146a().mo22267a((Object) new C3931a(false));
        m13836a("livesdk_game_ad_banner_close");
    }

    /* renamed from: a */
    private void m13836a(String str) {
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        String str4 = "banner_name";
        if (this.f11762d != null) {
            str2 = this.f11762d.f25624b;
        } else {
            str2 = "";
        }
        hashMap.put(str4, str2);
        String str5 = "banner_id";
        if (this.f11762d != null) {
            str3 = String.valueOf(this.f11762d.f25623a);
        } else {
            str3 = "";
        }
        hashMap.put(str5, str3);
        C8443c.m25663a().mo21606a(str, hashMap, new C8438j().mo21598a("live_detail"), Room.class);
    }

    /* renamed from: a */
    public final void mo11483a(C9357a aVar) {
        this.f11762d = aVar;
        if (!this.f11761c && aVar.f25625c != null) {
            setTag(aVar);
            this.f11759a.setTag(aVar);
            m13835a(this.f11760b, aVar.f25625c);
            if (!this.f11763e) {
                m13836a("livesdk_game_ad_banner_show");
                this.f11763e = true;
            }
        }
    }

    public BannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11482a(HSImageView hSImageView, Bitmap bitmap) throws Exception {
        if (bitmap != null) {
            hSImageView.setImageDrawable(new BitmapDrawable(bitmap));
            C9738o.m28712b((View) this, 0);
            C9097a.m27146a().mo22267a((Object) new C3931a(true));
        }
    }

    /* renamed from: a */
    private void m13835a(HSImageView hSImageView, ImageModel imageModel) {
        if (hSImageView != null && imageModel != null) {
            C5343e.m17028a(imageModel).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C3932b<Object>(this, hSImageView));
        }
    }

    public BannerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13833a(context);
    }
}
