package com.p280ss.android.ugc.aweme.account.login;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.I18nLoginViewV2$getBottomText$1 */
public final class I18nLoginViewV2$getBottomText$1 extends ForegroundColorSpan {

    /* renamed from: a */
    final /* synthetic */ int f57094a;

    public final void updateDrawState(TextPaint textPaint) {
        C7573i.m23587b(textPaint, "textPaint");
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    I18nLoginViewV2$getBottomText$1(int i, int i2) {
        this.f57094a = i;
        super(i2);
    }
}
