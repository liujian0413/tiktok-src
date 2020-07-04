package com.p280ss.android.ugc.aweme.services.video;

import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService.CompileParam;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7495v;

/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$getVideoWidthHeight$1 */
final class ImVideoCompileService$getVideoWidthHeight$1<T> implements C7495v<T> {
    final /* synthetic */ CompileParam $compileParam;
    final /* synthetic */ ImVideoCompileService this$0;

    ImVideoCompileService$getVideoWidthHeight$1(ImVideoCompileService imVideoCompileService, CompileParam compileParam) {
        this.this$0 = imVideoCompileService;
        this.$compileParam = compileParam;
    }

    public final void subscribe(C47870u<Boolean> uVar) {
        C7573i.m23587b(uVar, "emitter");
        if (this.$compileParam.getVideoWidth() <= 0 || this.$compileParam.getVideoHeight() <= 0) {
            int[] iArr = new int[10];
            if (this.this$0.getVideoFileInfoWithRotation(this.$compileParam.getRawVideoPath(), iArr)) {
                this.$compileParam.setVideoWidth(iArr[0]);
                this.$compileParam.setVideoHeight(iArr[1]);
                StringBuilder sb = new StringBuilder("ImVideoCompileService resize compileParam success: ");
                sb.append(this.$compileParam.getVideoWidth());
                sb.append(", ");
                sb.append(this.$compileParam.getVideoHeight());
                C6921a.m21555a(sb.toString());
            } else {
                Pair outputVideoSize = this.this$0.outputVideoSize(this.$compileParam);
                this.$compileParam.setVideoWidth(((Number) outputVideoSize.getFirst()).intValue());
                this.$compileParam.setVideoHeight(((Number) outputVideoSize.getSecond()).intValue());
                StringBuilder sb2 = new StringBuilder("ImVideoCompileService resize compileParam failed: ");
                sb2.append(this.$compileParam.getVideoWidth());
                sb2.append(", ");
                sb2.append(this.$compileParam.getVideoHeight());
                C6921a.m21555a(sb2.toString());
                this.this$0.safeOnSingleNext(uVar, Boolean.valueOf(false));
                return;
            }
        }
        this.this$0.safeOnSingleNext(uVar, Boolean.valueOf(true));
    }
}
