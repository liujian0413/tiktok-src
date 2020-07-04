package com.p280ss.android.ugc.aweme.emoji.p1207e;

import android.graphics.drawable.Drawable;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.base.C27518b;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1202b.p1204b.C27507a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.e.g */
public class C27563g extends C27518b {

    /* renamed from: c */
    public List<Emoji> f72640c;

    /* renamed from: d */
    public Resources f72641d;

    /* renamed from: a */
    public int mo70715a() {
        return R.drawable.a07;
    }

    /* renamed from: i */
    public int mo70721i() {
        return 2;
    }

    /* renamed from: b */
    public final String mo70730b() {
        return this.f72641d.getIconUrl();
    }

    /* renamed from: c */
    public final Drawable mo70731c() {
        return super.mo70731c();
    }

    /* renamed from: d */
    public String mo70717d() {
        return this.f72641d.getDisplayName();
    }

    /* renamed from: g */
    public final int mo70733g() {
        if (mo70720h()) {
            return 8;
        }
        return 1;
    }

    /* renamed from: h */
    public boolean mo70720h() {
        if (this.f72640c == null || this.f72640c.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final int mo70734j() {
        if (this.f72640c == null) {
            return 0;
        }
        return this.f72640c.size();
    }

    /* renamed from: f */
    public int mo70719f() {
        if (!mo70720h()) {
            return 1;
        }
        return ((this.f72640c.size() - 1) / 8) + 1;
    }

    /* renamed from: k */
    public String mo70722k() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo70721i());
        sb.append("-");
        sb.append(this.f72641d.getId());
        return sb.toString();
    }

    /* renamed from: b */
    public List<C27517a> mo70716b(int i) {
        Emoji emoji;
        ArrayList arrayList = new ArrayList(8);
        for (int i2 = i * 8; i2 < (i + 1) * 8; i2++) {
            C27517a aVar = new C27517a();
            if (i2 < 0 || i2 >= this.f72640c.size()) {
                emoji = null;
            } else {
                emoji = (Emoji) this.f72640c.get(i2);
            }
            if (emoji != null) {
                aVar.f72558c = C27507a.m90162b(emoji);
                aVar.f72559d = emoji;
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }
}
