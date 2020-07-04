package com.p280ss.android.ugc.aweme.share;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.share.p1536f.C38038b;
import com.p280ss.android.ugc.aweme.share.p1536f.C38039c;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.utils.C43101el;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7490k;

/* renamed from: com.ss.android.ugc.aweme.share.i */
public abstract class C38062i implements ShareExtService {
    public C7490k<String> shortUrl(String str) {
        boolean z;
        String str2;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str2 = str;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            C7490k<String> a = C7490k.m23239a("");
            C7573i.m23582a((Object) a, "Maybe.just(\"\")");
            return a;
        }
        C38039c cVar = C38039c.f99025a;
        if (str == null) {
            C7573i.m23580a();
        }
        return cVar.mo95676a(str);
    }

    public void markLocalCommand(Context context, String str) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "command");
        C38038b.m121405a(context, str);
    }

    public void copyContentToClipBoard(Context context, String str, String str2) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, C38347c.f99553h);
        Object systemService = context.getSystemService("clipboard");
        if (systemService != null) {
            CharSequence charSequence = str;
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(charSequence, charSequence));
            if (C43101el.m136718a(str2)) {
                C10761a.m31387a(context, str2).mo25750a();
            } else {
                C10761a.m31383a(context, (int) R.string.ahh).mo25750a();
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
        }
    }
}
