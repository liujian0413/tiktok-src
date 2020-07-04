package com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.unlock.j */
public final class C40966j {

    /* renamed from: a */
    Context f106490a;

    /* renamed from: b */
    public String f106491b;

    /* renamed from: c */
    SharedPreferences f106492c;

    /* renamed from: d */
    Editor f106493d = this.f106492c.edit();

    /* renamed from: e */
    Set<String> f106494e = this.f106492c.getStringSet("remindedIds", new HashSet());

    /* renamed from: a */
    public final List<String> mo101266a() {
        return new ArrayList(this.f106494e);
    }

    /* renamed from: a */
    public final void mo101267a(String str) {
        if (this.f106494e.add(str)) {
            this.f106493d.putStringSet("remindedIds", this.f106494e);
            this.f106493d.apply();
        }
    }

    public C40966j(Context context, String str) {
        this.f106490a = context;
        this.f106491b = str;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("STICKER_RELATED");
        this.f106492c = C7285c.m22838a(context, sb.toString(), 0);
    }
}
