package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.constraint.ConstraintLayout;
import android.support.p022v4.graphics.drawable.C0728b;
import android.support.p022v4.graphics.drawable.C0730d;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.NobleLevelInfo;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p212e.C4374z;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.gift.effect.entry.p383e.C8028c;
import com.bytedance.android.livesdk.i18n.C8317b;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

public class LandscapeNobleEnterTrayView extends ConstraintLayout {

    /* renamed from: g */
    private static final String f21824g = "LandscapeNobleEnterTrayView";

    /* renamed from: l */
    private static final int f21825l = C3358ac.m12510a(20.0f);

    /* renamed from: h */
    private HSImageView f21826h;

    /* renamed from: i */
    private HSImageView f21827i;

    /* renamed from: j */
    private HSImageView f21828j;

    /* renamed from: k */
    private TextView f21829k;

    /* renamed from: b */
    private void m24625b() {
        inflate(getContext(), R.layout.ath, this);
        this.f21826h = (HSImageView) findViewById(R.id.j2);
        this.f21827i = (HSImageView) findViewById(R.id.k9);
        this.f21829k = (TextView) findViewById(R.id.a7p);
        this.f21828j = (HSImageView) findViewById(R.id.k7);
    }

    public LandscapeNobleEnterTrayView(Context context) {
        this(context, null);
    }

    private void setBackgroundImageModel(ImageModel imageModel) {
        C5343e.m17028a(imageModel).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C8043d<Object>(this), C8044e.f21889a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20961a(Bitmap bitmap) throws Exception {
        C0728b a = C0730d.m3126a(getResources(), bitmap);
        a.mo2890a((float) f21825l);
        a.setAlpha(178);
        setBackgroundDrawable(a);
    }

    /* renamed from: b */
    private static Spannable m24624b(C8028c cVar) {
        String str;
        C9505f fVar = cVar.f21800v;
        String str2 = fVar.f26014b;
        if (fVar.f26013a != null) {
            str = C8317b.m25387a().mo21482a(fVar.f26013a);
        } else {
            str = null;
        }
        if (str == null && str2 == null) {
            return new SpannableString("");
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        }
        return C4374z.m14751a(str2, fVar);
    }

    /* renamed from: a */
    public final void mo20962a(C8028c cVar) {
        C5343e.m17033a(this.f21826h, cVar.f21781e, R.drawable.cdl, -1, (float) C3358ac.m12510a(1.0f), null);
        NobleLevelInfo nobleLevelInfo = cVar.f21797s;
        if (nobleLevelInfo != null) {
            C5343e.m17038a(this.f21827i, nobleLevelInfo.getNobleIcon());
            this.f21829k.setText(m24624b(cVar));
            setBackgroundImageModel(cVar.f21798t);
        }
    }

    public LandscapeNobleEnterTrayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LandscapeNobleEnterTrayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24625b();
    }
}
