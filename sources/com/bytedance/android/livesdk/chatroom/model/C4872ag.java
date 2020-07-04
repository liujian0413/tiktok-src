package com.bytedance.android.livesdk.chatroom.model;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.ag */
public class C4872ag {
    @C6593c(mo15949a = "high_light_color")

    /* renamed from: a */
    public String f13939a;
    @C6593c(mo15949a = "contents")

    /* renamed from: b */
    public List<C4871af> f13940b;

    /* renamed from: a */
    public final CharSequence mo12881a() {
        if (this.f13940b == null || this.f13940b.size() <= 0) {
            return "";
        }
        int i = -1;
        boolean z = false;
        if (this.f13939a != null) {
            try {
                z = true;
                i = Color.parseColor(this.f13939a);
            } catch (IllegalArgumentException unused) {
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        for (C4871af afVar : this.f13940b) {
            if (afVar != null && !TextUtils.isEmpty(afVar.f13937a)) {
                spannableStringBuilder.append(afVar.f13937a);
                if (z && afVar.f13938b) {
                    spannableStringBuilder.setSpan(foregroundColorSpan, spannableStringBuilder.length() - afVar.f13937a.length(), spannableStringBuilder.length(), 33);
                }
            }
        }
        return spannableStringBuilder;
    }
}
