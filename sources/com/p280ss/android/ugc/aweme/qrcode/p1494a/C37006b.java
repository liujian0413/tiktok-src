package com.p280ss.android.ugc.aweme.qrcode.p1494a;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.qrcode.p1494a.C37004a.C37005a;
import com.p280ss.android.ugc.aweme.router.C37286v;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.qrcode.a.b */
public final class C37006b extends C37004a {
    public C37006b(C37005a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final boolean mo59069a(String str, int i) {
        List a = C37286v.m119757a(str);
        if (a.size() != 2 || !TextUtils.equals((CharSequence) a.get(0), "share") || !TextUtils.equals((CharSequence) a.get(1), "billboard")) {
            return false;
        }
        String b = C37286v.m119759b(str, "id");
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        switch (Integer.parseInt(b)) {
            case 0:
                this.f96938a = "hot_search_board";
                break;
            case 1:
                this.f96938a = "hot_search_video_board";
                break;
            case 2:
                this.f96938a = "hot_search_music_board";
                break;
        }
        return this.f96939b.mo93444a(10, null, str, i, null);
    }
}
