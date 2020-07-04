package com.p280ss.android.ugc.aweme.emoji.p1206d;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1202b.p1204b.C27507a;
import com.p280ss.android.ugc.aweme.emoji.p1207e.C27563g;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.d.p */
public final class C27553p extends C27563g {
    /* renamed from: a */
    public final int mo70715a() {
        return R.drawable.a06;
    }

    /* renamed from: h */
    public final boolean mo70720h() {
        return true;
    }

    /* renamed from: i */
    public final int mo70721i() {
        return 3;
    }

    /* renamed from: d */
    public final String mo70717d() {
        return C6399b.m19921a().getString(R.string.azy);
    }

    /* renamed from: k */
    public final String mo70722k() {
        return String.valueOf(mo70721i());
    }

    /* renamed from: f */
    public final int mo70719f() {
        if (this.f72640c == null || this.f72640c.size() == 0) {
            return 1;
        }
        return ((this.f72640c.size() - 1) / 8) + 1;
    }

    /* renamed from: b */
    public final List<C27517a> mo70716b(int i) {
        ArrayList arrayList = new ArrayList(8);
        m90288a(arrayList, i);
        m90287a(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private static void m90287a(List<C27517a> list) {
        while (list.size() < 8) {
            list.add(new C27517a());
        }
    }

    /* renamed from: a */
    private void m90288a(List<C27517a> list, int i) {
        if (this.f72640c != null) {
            int min = Math.min(this.f72640c.size(), (i + 1) * 8);
            for (int i2 = i * 8; i2 < min; i2++) {
                Emoji emoji = (Emoji) this.f72640c.get(i2);
                C27517a aVar = new C27517a();
                if (emoji == null) {
                    Emoji emoji2 = new Emoji();
                    emoji2.setStickerType(2);
                    aVar.f72559d = emoji2;
                    aVar.f72556a = R.drawable.zw;
                    aVar.f72558c = C6399b.m19921a().getString(R.string.azy);
                } else {
                    aVar.f72558c = C27507a.m90162b(emoji);
                    aVar.f72559d = emoji;
                }
                list.add(aVar);
            }
        }
    }
}
