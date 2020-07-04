package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.constraint.ConstraintLayout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.NobleLevelInfo;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.livesdk.chatroom.p212e.C4374z;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.chatroom.utils.C5358p;
import com.bytedance.android.livesdk.gift.effect.entry.p383e.C8028c;
import com.bytedance.android.livesdk.i18n.C8317b;
import com.bytedance.android.livesdk.p409n.C8703a;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

public class PortraitNobleEnterTrayView extends ConstraintLayout {

    /* renamed from: g */
    private static final String f21830g = "PortraitNobleEnterTrayView";

    /* renamed from: k */
    private static final int f21831k = C3358ac.m12510a(14.0f);

    /* renamed from: h */
    private HSImageView f21832h;

    /* renamed from: i */
    private HSImageView f21833i;

    /* renamed from: j */
    private TextView f21834j;

    /* renamed from: b */
    private void m24629b() {
        inflate(getContext(), R.layout.av2, this);
        this.f21832h = (HSImageView) findViewById(R.id.k9);
        this.f21834j = (TextView) findViewById(R.id.a7p);
        this.f21833i = (HSImageView) findViewById(R.id.k7);
    }

    public PortraitNobleEnterTrayView(Context context) {
        this(context, null);
    }

    public void setBackgroundImageModel(ImageModel imageModel) {
        C5343e.m17038a(this.f21833i, imageModel);
    }

    /* renamed from: b */
    private static Spannable m24628b(C8028c cVar) {
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
    public final void mo20963a(C8028c cVar) {
        NobleLevelInfo nobleLevelInfo = cVar.f21797s;
        if (nobleLevelInfo != null) {
            this.f21834j.setText(m24628b(cVar));
            C5343e.m17028a(nobleLevelInfo.getNobleIconWithBack()).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C8045f<Object>(this, cVar), C8046g.f21892a);
            C5358p.m17090a(cVar.f21798t, this, C3519c.m12965a(getContext()), null);
        }
    }

    public PortraitNobleEnterTrayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20964a(C8028c cVar, Bitmap bitmap) throws Exception {
        Bitmap copy = bitmap.copy(Config.ARGB_8888, true);
        C8703a.m26017a(this.f21834j.getContext(), -1, copy, String.valueOf(cVar.f21801w));
        this.f21832h.setImageBitmap(copy);
    }

    public PortraitNobleEnterTrayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24629b();
    }
}
