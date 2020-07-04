package com.p280ss.android.ugc.effectmanager.effect.model;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectQRCode */
public final class EffectQRCode {
    public final String qrCodeText;

    private EffectQRCode(String str) {
        this.qrCodeText = str;
    }

    public static EffectQRCode create(String str) {
        return new EffectQRCode(str);
    }
}
