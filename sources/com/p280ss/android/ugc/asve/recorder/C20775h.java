package com.p280ss.android.ugc.asve.recorder;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import com.p280ss.android.ugc.asve.C6855a;
import com.p280ss.android.ugc.asve.context.C15432h;
import com.p280ss.android.ugc.asve.p756d.C15447b;
import com.p280ss.android.ugc.asve.sandbox.C20896b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.h */
final /* synthetic */ class C20775h {
    /* renamed from: a */
    public static final C20689c m69339a(Context context, C0043i iVar, C15432h hVar) {
        boolean z;
        C7573i.m23587b(context, "context");
        C7573i.m23587b(hVar, "recorderContext");
        Boolean a = hVar.mo38918a();
        if (a != null) {
            z = a.booleanValue();
        } else {
            z = C15447b.m45236a(C6855a.f19498b);
        }
        if (!z) {
            C20764f fVar = new C20764f(context, null, hVar, 2, null);
            return fVar;
        } else if (!hVar.mo38931n()) {
            return new VERecorderImpl(context, hVar, iVar);
        } else {
            if (hVar.mo38932o() != null) {
                C20689c a2 = C20896b.m69933a(hVar, iVar);
                Map linkedHashMap = new LinkedHashMap();
                if (a2 != null) {
                    linkedHashMap.put("createResult", "0");
                    C20675b d = C6855a.m21306a().mo38947d();
                    if (d != null) {
                        d.mo55881a("create_sandbox_recoder", linkedHashMap);
                    }
                    return a2;
                }
                linkedHashMap.put("createResult", "-1");
                C20675b d2 = C6855a.m21306a().mo38947d();
                if (d2 != null) {
                    d2.mo55881a("create_sandbox_recoder", linkedHashMap);
                }
                return new VERecorderImpl(context, hVar, iVar);
            }
            throw new IllegalStateException("while in sandbox mode,you must setup sandBoxProcessDiedCallBack in recoderContext,pls fix it ".toString());
        }
    }
}
