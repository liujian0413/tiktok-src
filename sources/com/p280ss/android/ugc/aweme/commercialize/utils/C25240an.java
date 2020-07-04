package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p280ss.android.ugc.aweme.router.C7195s;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.an */
public final class C25240an {

    /* renamed from: a */
    public static final C25240an f66577a = new C25240an();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.an$a */
    public static final class C25241a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ BlueVBrandInfo f66578a;

        C25241a(BlueVBrandInfo blueVBrandInfo) {
            this.f66578a = blueVBrandInfo;
        }

        public final void onClick(View view) {
            C7573i.m23587b(view, "widget");
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl brandScheme = inst.getBrandScheme();
            C7573i.m23582a((Object) brandScheme, "SharePrefCache.inst().brandScheme");
            Object d = brandScheme.mo59877d();
            C7573i.m23582a(d, "SharePrefCache.inst().brandScheme.cache");
            String uri = C33786f.m108941a((String) d).mo86195a("brand_category_id", String.valueOf(this.f66578a.getCategoryId())).mo86194a().toString();
            C7573i.m23582a((Object) uri, "RnSchemeHelper.parseRnSc…      .build().toString()");
            if (!TextUtils.isEmpty(uri)) {
                C7195s.m22438a().mo18682a(uri);
            }
        }
    }

    private C25240an() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r10 == null) goto L_0x0026;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m82970a(android.widget.TextView r8, com.p280ss.android.ugc.aweme.profile.model.BlueVBrandInfo r9, int r10) {
        /*
            java.lang.String r10 = "textView"
            kotlin.jvm.internal.C7573i.m23587b(r8, r10)
            java.lang.String r10 = "brandInfo"
            kotlin.jvm.internal.C7573i.m23587b(r9, r10)
            int r10 = r9.getRank()
            if (r10 <= 0) goto L_0x00c2
            int r10 = r9.getRank()
            r0 = 30
            if (r10 <= r0) goto L_0x001a
            goto L_0x00c2
        L_0x001a:
            java.lang.CharSequence r10 = r8.getText()
            if (r10 == 0) goto L_0x0026
            java.lang.String r10 = r10.toString()
            if (r10 != 0) goto L_0x0028
        L_0x0026:
            java.lang.String r10 = ""
        L_0x0028:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r2 = " T"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.<init>(r1)
            com.ss.android.ugc.aweme.hotsearch.d.a r2 = new com.ss.android.ugc.aweme.hotsearch.d.a
            int r1 = r9.getRank()
            java.lang.String r3 = r9.getTagName()
            r4 = 4
            r2.<init>(r1, r3, r4)
            int r1 = r10.length()
            int r1 = r1 + 1
            int r10 = r10.length()
            int r10 = r10 + 2
            r3 = 33
            r0.setSpan(r2, r1, r10, r3)
            com.ss.android.ugc.aweme.commercialize.utils.an$a r4 = new com.ss.android.ugc.aweme.commercialize.utils.an$a
            r4.<init>(r9)
            r0.setSpan(r4, r1, r10, r3)
            android.text.method.MovementMethod r9 = android.text.method.LinkMovementMethod.getInstance()
            r8.setMovementMethod(r9)
            float r9 = r8.getTextSize()
            android.text.TextPaint r10 = r8.getPaint()
            r3 = r10
            android.graphics.Paint r3 = (android.graphics.Paint) r3
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r10 = r0.length()
            int r5 = r10 + -1
            int r6 = r0.length()
            android.text.TextPaint r10 = r8.getPaint()
            java.lang.String r1 = "textView.paint"
            kotlin.jvm.internal.C7573i.m23582a(r10, r1)
            android.graphics.Paint$FontMetricsInt r7 = r10.getFontMetricsInt()
            int r5 = r2.getSize(r3, r4, r5, r6, r7)
            android.text.TextPaint r10 = r8.getPaint()
            java.lang.String r1 = "textView.paint"
            kotlin.jvm.internal.C7573i.m23582a(r10, r1)
            r10.setTextSize(r9)
            android.text.TextPaint r1 = r8.getPaint()
            int r2 = r8.getMaxWidth()
            int r3 = r8.getMaxLines()
            r4 = 1
            android.text.SpannableStringBuilder r9 = com.p280ss.android.ugc.aweme.hotsearch.p1295c.C30357c.m99184a(r0, r1, r2, r3, r4, r5)
            java.lang.String r10 = "TagUtil.ellipsizeText2Ex….maxLines, 1, imageWidth)"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r8.setText(r9)
            r8.requestLayout()
            return
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25240an.m82970a(android.widget.TextView, com.ss.android.ugc.aweme.profile.model.BlueVBrandInfo, int):void");
    }
}
