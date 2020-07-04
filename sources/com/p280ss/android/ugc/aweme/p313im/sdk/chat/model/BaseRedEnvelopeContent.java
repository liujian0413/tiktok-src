package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.BaseRedEnvelopeContent */
public class BaseRedEnvelopeContent extends BaseContent {
    private String redEnvelopeTitle = "";

    public final String getRedEnvelopeTitle() {
        return this.redEnvelopeTitle;
    }

    public final void setRedEnvelopeTitle(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.redEnvelopeTitle = str;
    }
}
