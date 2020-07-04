package com.p280ss.android.ugc.aweme.services.video;

import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.vesdk.C45329l;
import com.p280ss.android.vesdk.VEEditor;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C47870u;

/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$compileVideo$1$onCompileInfoCallback$1 */
final class ImVideoCompileService$compileVideo$1$onCompileInfoCallback$1 implements C45329l {
    final /* synthetic */ VEEditor $editor;
    final /* synthetic */ C47870u $it;
    final /* synthetic */ ImVideoCompileService$compileVideo$1 this$0;

    ImVideoCompileService$compileVideo$1$onCompileInfoCallback$1(ImVideoCompileService$compileVideo$1 imVideoCompileService$compileVideo$1, VEEditor vEEditor, C47870u uVar) {
        this.this$0 = imVideoCompileService$compileVideo$1;
        this.$editor = vEEditor;
        this.$it = uVar;
    }

    public final void onCallback(int i, int i2, float f, String str) {
        if (i == 4103) {
            this.$editor.mo107976n();
            StringBuilder sb = new StringBuilder("ImVideoCompileService compile success: ");
            C47870u uVar = this.$it;
            C7573i.m23582a((Object) uVar, "it");
            sb.append(uVar.isDisposed());
            C6921a.m21555a(sb.toString());
            ImVideoCompileService imVideoCompileService = this.this$0.this$0;
            C47870u uVar2 = this.$it;
            C7573i.m23582a((Object) uVar2, "it");
            imVideoCompileService.safeOnSingleNext(uVar2, Boolean.valueOf(true));
        }
    }
}
