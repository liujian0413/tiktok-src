package com.p280ss.android.ugc.aweme.shortvideo.sticker.reuse;

import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.reuse.pinsticker.C40909a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.reuse.pinsticker.PinStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.reuse.pinsticker.PinType;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.reuse.a */
public final class C40908a {

    /* renamed from: a */
    public static final C40908a f106388a = new C40908a();

    private C40908a() {
    }

    /* renamed from: a */
    public static final boolean m130714a(FragmentActivity fragmentActivity, int i, String str) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(str, "panel");
        if (i == m130715b(fragmentActivity, i, str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static int m130715b(FragmentActivity fragmentActivity, int i, String str) {
        if (C40909a.m130725a(C40909a.m130720a((List) ((PinStickerViewModel) C0069x.m159a(fragmentActivity).mo147a(PinStickerViewModel.class)).mo101189a(str).getValue(), i))) {
            return C40909a.m130717a(PinType.TRENDING);
        }
        return C40909a.m130717a(PinType.CHRISTMAS);
    }
}
