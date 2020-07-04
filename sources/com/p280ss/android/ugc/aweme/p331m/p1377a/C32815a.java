package com.p280ss.android.ugc.aweme.p331m.p1377a;

import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import java.util.HashMap;
import java.util.List;
import kotlin.text.C7634n;
import kotlin.text.Regex;

/* renamed from: com.ss.android.ugc.aweme.m.a.a */
public final class C32815a {

    /* renamed from: a */
    public static final C32815a f85629a = new C32815a();

    /* renamed from: b */
    private static HashMap<String, C32816b> f85630b = new HashMap<>();

    private C32815a() {
    }

    /* renamed from: a */
    public static boolean m106204a(String str) {
        boolean z = false;
        if (str != null) {
            CharSequence charSequence = str;
            if (C7634n.m23776c(charSequence, (CharSequence) " ", false)) {
                List split = new Regex(" ").split(charSequence, 0);
                if (split.size() >= 2) {
                    String str2 = (String) split.get(0);
                    List subList = split.subList(1, split.size());
                    if (f85630b.containsKey(str2)) {
                        C32816b bVar = (C32816b) f85630b.get(str2);
                        if (bVar != null) {
                            z = bVar.mo84346a(subList);
                        }
                    }
                }
            }
        }
        if (z) {
            C10761a.m31387a(C6399b.m19921a(), "command executed ok").mo25750a();
        } else {
            C10761a.m31403c(C6399b.m19921a(), "command executed fail").mo25750a();
        }
        return z;
    }
}
