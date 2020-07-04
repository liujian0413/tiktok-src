package com.p280ss.android.ugc.aweme.services.video;

import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.vesdk.C45329l;
import com.p280ss.android.vesdk.VEEditor;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C47870u;

/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$compileVideo$1$onCompileErrorCallback$1 */
final class ImVideoCompileService$compileVideo$1$onCompileErrorCallback$1 implements C45329l {
    final /* synthetic */ VEEditor $editor;
    final /* synthetic */ C47870u $it;
    final /* synthetic */ ImVideoCompileService$compileVideo$1 this$0;

    ImVideoCompileService$compileVideo$1$onCompileErrorCallback$1(ImVideoCompileService$compileVideo$1 imVideoCompileService$compileVideo$1, VEEditor vEEditor, C47870u uVar) {
        this.this$0 = imVideoCompileService$compileVideo$1;
        this.$editor = vEEditor;
        this.$it = uVar;
    }

    public final void onCallback(int i, int i2, float f, String str) {
        StringBuilder sb = new StringBuilder("ImVideoCompileService compile error: type=");
        sb.append(i);
        sb.append(", ext=");
        sb.append(i2);
        sb.append(", msg=");
        sb.append(str);
        C6921a.m21555a(sb.toString());
        if (i2 == -214) {
            C6921a.m21555a("ImVideoCompileService compile error fallback to soft encode");
            this.this$0.this$0.isHardCodeFallback = true;
        }
        this.$editor.mo107976n();
        ImVideoCompileService imVideoCompileService = this.this$0.this$0;
        C47870u uVar = this.$it;
        C7573i.m23582a((Object) uVar, "it");
        StringBuilder sb2 = new StringBuilder("compile error: ");
        sb2.append(str);
        imVideoCompileService.safeOnError(uVar, new IllegalStateException(sb2.toString()));
    }
}
