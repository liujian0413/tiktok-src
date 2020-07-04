package com.p280ss.android.ugc.asve.p754b;

import android.view.TextureView;
import com.p280ss.android.vesdk.C45255af;
import com.p280ss.android.vesdk.VEEditor;
import com.p280ss.android.vesdk.VEListener.C45216l;
import com.p280ss.android.vesdk.VERecordData;
import com.p280ss.android.vesdk.runtime.C45345b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.b.b */
public final class C15387b {

    /* renamed from: a */
    public static final C15387b f39681a = new C15387b();

    private C15387b() {
    }

    /* renamed from: a */
    public static C15389d m44887a(String str, TextureView textureView) {
        C7573i.m23587b(str, "workSpace");
        C7573i.m23587b(textureView, "textureView");
        return new C15383a(str, textureView);
    }

    /* renamed from: a */
    public static C15389d m44885a(C45345b bVar, VERecordData vERecordData, C45216l lVar) {
        C7573i.m23587b(bVar, "resManager");
        C7573i.m23587b(vERecordData, "recordData");
        C7573i.m23587b(lVar, "listener");
        VEEditor a = VEEditor.m142477a(bVar, vERecordData, lVar);
        C7573i.m23582a((Object) a, "VEEditor.genReverseVideo…er, recordData, listener)");
        return new C15383a(a);
    }

    /* renamed from: a */
    public static C15389d m44886a(C45345b bVar, C45255af afVar, int i, int i2, C45216l lVar) {
        C7573i.m23587b(bVar, "resManager");
        C7573i.m23587b(afVar, "sceneTime");
        VEEditor a = VEEditor.m142478a(bVar, afVar, i, i2, lVar);
        C7573i.m23582a((Object) a, "VEEditor.genReverseVideo…tTime, endTime, listener)");
        return new C15383a(a);
    }
}
