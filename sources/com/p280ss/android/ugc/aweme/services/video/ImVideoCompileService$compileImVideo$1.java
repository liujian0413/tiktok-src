package com.p280ss.android.ugc.aweme.services.video;

import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService.CompileParam;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService.CompileResult;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.LongRef;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$compileImVideo$1 */
final class ImVideoCompileService$compileImVideo$1<T, R> implements C7327h<T, C7496w<? extends R>> {
    final /* synthetic */ CompileParam $compileParam;
    final /* synthetic */ LongRef $costTime;
    final /* synthetic */ LongRef $currentTime;
    final /* synthetic */ CompileResult $result;
    final /* synthetic */ LongRef $startTime;
    final /* synthetic */ ImVideoCompileService this$0;

    ImVideoCompileService$compileImVideo$1(ImVideoCompileService imVideoCompileService, CompileResult compileResult, LongRef longRef, LongRef longRef2, LongRef longRef3, CompileParam compileParam) {
        this.this$0 = imVideoCompileService;
        this.$result = compileResult;
        this.$currentTime = longRef;
        this.$costTime = longRef2;
        this.$startTime = longRef3;
        this.$compileParam = compileParam;
    }

    public final C7492s<Boolean> apply(String str) {
        C7573i.m23587b(str, "it");
        this.$result.setCheckPic(str);
        this.$currentTime.element = System.currentTimeMillis();
        this.$costTime.element = this.$currentTime.element - this.$startTime.element;
        this.$startTime.element = this.$currentTime.element;
        StringBuilder sb = new StringBuilder("ImVideoCompileService compileImVideo step 1: result=");
        sb.append(this.$result);
        sb.append(", costTime=");
        sb.append(this.$costTime.element);
        C6921a.m21555a(sb.toString());
        return this.this$0.getVideoWidthHeight(this.$compileParam);
    }
}
