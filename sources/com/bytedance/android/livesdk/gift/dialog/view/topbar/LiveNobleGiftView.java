package com.bytedance.android.livesdk.gift.dialog.view.topbar;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3361af;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.gift.dialog.C7897b;
import com.bytedance.android.livesdk.gift.model.GiftOperation;
import com.bytedance.android.livesdk.schema.interfaces.C8931a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class LiveNobleGiftView extends FrameLayout {

    /* renamed from: a */
    private HSImageView f21450a;

    /* renamed from: b */
    private TextView f21451b;

    /* renamed from: c */
    private HSImageView f21452c;

    /* renamed from: d */
    private TextView f21453d;

    /* renamed from: a */
    private void m24305a() {
        LayoutInflater.from(getContext()).inflate(R.layout.avp, this);
        this.f21453d = (TextView) findViewById(R.id.c4w);
        this.f21450a = (HSImageView) findViewById(R.id.c90);
        this.f21451b = (TextView) findViewById(R.id.c94);
        this.f21452c = (HSImageView) findViewById(R.id.c93);
    }

    public LiveNobleGiftView(Context context) {
        this(context, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20773a(com.bytedance.android.livesdk.gift.dialog.viewmodel.C7939b r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.bytedance.android.livesdk.gift.model.GiftPage r10 = r10.mo20807c()
            if (r10 == 0) goto L_0x00bc
            int r1 = r10.pageType
            r2 = 4
            if (r1 == r2) goto L_0x0011
            goto L_0x00bc
        L_0x0011:
            com.bytedance.android.livesdk.gift.model.GiftOperation r1 = r10.operation
            r2 = 8
            if (r1 != 0) goto L_0x0026
            com.bytedance.android.live.core.widget.HSImageView r1 = r9.f21450a
            r1.setVisibility(r2)
            com.bytedance.android.live.core.widget.HSImageView r1 = r9.f21452c
            r1.setVisibility(r2)
            android.widget.TextView r1 = r9.f21451b
            r1.setVisibility(r2)
        L_0x0026:
            java.lang.Class<com.bytedance.android.live.user.a> r1 = com.bytedance.android.live.user.C3592a.class
            com.bytedance.android.live.base.b r1 = com.bytedance.android.live.utility.C3596c.m13172a(r1)
            com.bytedance.android.live.user.a r1 = (com.bytedance.android.live.user.C3592a) r1
            com.bytedance.android.livesdk.user.e r1 = r1.user()
            boolean r1 = r1.mo22182c()
            r3 = 1
            if (r1 == 0) goto L_0x0065
            java.lang.Class<com.bytedance.android.live.user.a> r1 = com.bytedance.android.live.user.C3592a.class
            com.bytedance.android.live.base.b r1 = com.bytedance.android.live.utility.C3596c.m13172a(r1)
            com.bytedance.android.live.user.a r1 = (com.bytedance.android.live.user.C3592a) r1
            com.bytedance.android.livesdk.user.e r1 = r1.user()
            com.bytedance.android.live.base.model.user.IUser r1 = r1.mo22165a()
            com.bytedance.android.live.base.model.user.User r1 = com.bytedance.android.live.base.model.user.User.from(r1)
            if (r1 == 0) goto L_0x0065
            com.bytedance.android.live.base.model.user.NobleLevelInfo r4 = r1.getNobleLevelInfo()
            if (r4 == 0) goto L_0x0065
            com.bytedance.android.live.base.model.user.NobleLevelInfo r1 = r1.getNobleLevelInfo()
            long r4 = r1.getNobleLevel()
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0065
            r1 = 1
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            android.widget.TextView r4 = r9.f21453d
            if (r1 == 0) goto L_0x006e
            r1 = 2131827907(0x7f111cc3, float:1.928874E38)
            goto L_0x0071
        L_0x006e:
            r1 = 2131827906(0x7f111cc2, float:1.9288738E38)
        L_0x0071:
            r4.setText(r1)
            com.bytedance.android.livesdk.gift.model.GiftOperation r10 = r10.operation
            com.bytedance.android.live.base.model.ImageModel r1 = r10.leftImage
            java.lang.String r4 = r10.title
            java.lang.String r5 = r10.titleColor
            int r6 = r10.titleSize
            java.lang.String r7 = r10.schemeUrl
            com.bytedance.android.live.core.widget.HSImageView r8 = r9.f21450a
            com.bytedance.android.livesdk.chatroom.utils.C5343e.m17038a(r8, r1)
            android.widget.TextView r8 = r9.f21451b
            r8.setText(r4)
            android.widget.TextView r8 = r9.f21451b     // Catch:{ IllegalArgumentException -> 0x0093 }
            int r5 = android.graphics.Color.parseColor(r5)     // Catch:{ IllegalArgumentException -> 0x0093 }
            r8.setTextColor(r5)     // Catch:{ IllegalArgumentException -> 0x0093 }
        L_0x0093:
            android.widget.TextView r5 = r9.f21451b
            float r6 = (float) r6
            r5.setTextSize(r6)
            android.widget.TextView r5 = r9.f21451b
            com.bytedance.android.livesdk.gift.dialog.view.topbar.f r6 = new com.bytedance.android.livesdk.gift.dialog.view.topbar.f
            r6.<init>(r9, r7, r10)
            r5.setOnClickListener(r6)
            com.bytedance.android.live.core.widget.HSImageView r10 = r9.f21450a
            if (r1 == 0) goto L_0x00a9
            r1 = 0
            goto L_0x00ab
        L_0x00a9:
            r1 = 8
        L_0x00ab:
            r10.setVisibility(r1)
            android.widget.TextView r10 = r9.f21451b
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L_0x00b8
            r0 = 8
        L_0x00b8:
            r10.setVisibility(r0)
            return r3
        L_0x00bc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.dialog.view.topbar.LiveNobleGiftView.mo20773a(com.bytedance.android.livesdk.gift.dialog.viewmodel.b):boolean");
    }

    public LiveNobleGiftView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m24306a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            ((C8931a) C3596c.m13172a(C8931a.class)).handle(getContext(), Uri.parse(str).buildUpon().appendQueryParameter("status_bar_height", String.valueOf((int) C3358ac.m12527e(C3361af.m12532a(getContext())))).build());
            if (!TextUtils.isEmpty(str2)) {
                C7897b.m24202a(str2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20772a(String str, GiftOperation giftOperation, View view) {
        m24306a(str, giftOperation.eventName);
    }

    public LiveNobleGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24305a();
    }
}
