package com.p280ss.android.ugc.aweme.emoji.p1202b;

import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1202b.p1204b.C27507a;
import com.p280ss.android.ugc.aweme.emoji.p1207e.C27563g;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.b.h */
public final class C27515h extends C27563g {

    /* renamed from: b */
    public List<Emoji> f72555b;

    /* renamed from: c */
    public static boolean m90173c(int i) {
        return i <= 0;
    }

    /* renamed from: a */
    public final int mo70715a() {
        return R.drawable.a05;
    }

    /* renamed from: h */
    public final boolean mo70720h() {
        return true;
    }

    /* renamed from: i */
    public final int mo70721i() {
        return 4;
    }

    public C27515h() {
        this.f72560a = 1;
    }

    /* renamed from: d */
    public final String mo70717d() {
        return C6399b.m19921a().getString(R.string.azw);
    }

    /* renamed from: k */
    public final String mo70722k() {
        return String.valueOf(mo70721i());
    }

    /* renamed from: f */
    public final int mo70719f() {
        if (this.f72640c == null || this.f72640c.size() == 0) {
            return 2;
        }
        int size = ((this.f72640c.size() - 1) / 8) + 1;
        if (size < 2) {
            return 2;
        }
        return size;
    }

    /* renamed from: b */
    public final List<C27517a> mo70716b(int i) {
        ArrayList arrayList = new ArrayList(8);
        m90170a(arrayList, i);
        m90172b((List<C27517a>) arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m90171a(List<C27517a> list) {
        if (C6307b.m19566a((Collection<T>) list) || !((C27517a) list.get(0)).mo70726a()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static void m90172b(List<C27517a> list) {
        while (list.size() < 8) {
            list.add(new C27517a());
        }
    }

    /* renamed from: d */
    public final boolean mo70718d(int i) {
        if (!m90173c(i)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m90170a(List<C27517a> list, int i) {
        if (this.f72640c != null) {
            int min = Math.min(this.f72640c.size(), (i + 1) * 8);
            for (int i2 = i * 8; i2 < min; i2++) {
                Emoji emoji = (Emoji) this.f72640c.get(i2);
                if (emoji != null) {
                    C27517a aVar = new C27517a();
                    aVar.f72558c = C27507a.m90162b(emoji);
                    aVar.f72559d = emoji;
                    list.add(aVar);
                } else if (i2 == 8) {
                    C27517a aVar2 = new C27517a();
                    aVar2.f72556a = R.drawable.a04;
                    Emoji emoji2 = new Emoji();
                    emoji2.setStickerType(10);
                    emoji2.setDisplayName(C6399b.m19921a().getString(R.string.b0h));
                    aVar2.f72559d = emoji2;
                    list.add(aVar2);
                } else {
                    list.add(new C27517a());
                }
            }
        }
    }
}
