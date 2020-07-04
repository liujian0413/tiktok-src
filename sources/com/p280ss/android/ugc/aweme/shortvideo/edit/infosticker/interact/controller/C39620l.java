package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.l */
public final class C39620l extends C39614f {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo98725a(String str, int i) {
        if (!str.endsWith(File.separator)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("text_sticker_");
        sb2.append(i);
        sb2.append(".png");
        return sb2.toString();
    }
}
