package com.p280ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout */
public final class OpenURLHintLayout extends HeaderFrameLayout implements OnClickListener {

    /* renamed from: f */
    private Aweme f67107f;

    /* renamed from: g */
    private boolean f67108g;

    /* access modifiers changed from: protected */
    public final boolean getCanScaleContent() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean getCanScroll() {
        return this.f67108g;
    }

    public OpenURLHintLayout(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
        setHeaderId(R.id.cq);
    }

    /* renamed from: a */
    public final void mo66183a(Aweme aweme) {
        setScrollOffset(0);
        setAweme(aweme);
        if (this.f67108g) {
            C24976t.m82128ao(getContext(), aweme);
            mo66156a();
        }
    }

    /* renamed from: a */
    private final String m83812a(AwemeRawAd awemeRawAd) {
        boolean z;
        String str;
        CharSequence schemaName = awemeRawAd.getSchemaName();
        if (schemaName == null || schemaName.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = getResources().getString(R.string.e6);
        } else {
            str = awemeRawAd.getSchemaName();
        }
        String string = getResources().getString(R.string.e_, new Object[]{str});
        C7573i.m23582a((Object) string, "resources.getString(R.st…en_url_title, schemaName)");
        return string;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C7573i.m23587b(view, "v");
        int id = view.getId();
        if (id == R.id.cp) {
            C25371n.m83468b(getContext(), this.f67107f);
            C24976t.m82130aq(getContext(), this.f67107f);
            return;
        }
        if (id == R.id.cn) {
            mo66157b();
            C24976t.m82129ap(getContext(), this.f67107f);
            setAweme(null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setAweme(com.p280ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r6.getAwemeRawAd()
            if (r0 == 0) goto L_0x000d
            int r0 = r0.getTipsType()
            goto L_0x000e
        L_0x000d:
            r0 = -1
        L_0x000e:
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L_0x007f
            if (r6 != 0) goto L_0x0017
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0017:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r6.getAwemeRawAd()
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = r0.getOpenUrl()
            goto L_0x0023
        L_0x0022:
            r0 = r2
        L_0x0023:
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83473b(r0)
            if (r0 == 0) goto L_0x007f
            android.view.View r0 = r5.getHeader()
            if (r0 != 0) goto L_0x0041
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r3 = 2131494221(0x7f0c054d, float:1.8611944E38)
            r4 = r5
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r0 = r0.inflate(r3, r4)
        L_0x0041:
            r3 = 2131296384(0x7f090080, float:1.8210683E38)
            android.view.View r3 = r0.findViewById(r3)
            java.lang.String r4 = "header.findViewById<Text…>(R.id.ad_open_url_title)"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r6.getAwemeRawAd()
            if (r4 == 0) goto L_0x005e
            java.lang.String r2 = "it"
            kotlin.jvm.internal.C7573i.m23582a(r4, r2)
            java.lang.String r2 = r5.m83812a(r4)
        L_0x005e:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3.setText(r2)
            r2 = 2131296382(0x7f09007e, float:1.821068E38)
            android.view.View r2 = r0.findViewById(r2)
            r3 = r5
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
            r2 = 2131296380(0x7f09007c, float:1.8210675E38)
            android.view.View r0 = r0.findViewById(r2)
            r0.setOnClickListener(r3)
            r5.f67108g = r1
            r5.f67107f = r6
            return
        L_0x007f:
            r6 = 0
            r5.f67108g = r6
            r5.f67107f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout.setAweme(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public OpenURLHintLayout(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet);
        setHeaderId(R.id.cq);
    }

    public OpenURLHintLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet, i);
        setHeaderId(R.id.cq);
    }
}
