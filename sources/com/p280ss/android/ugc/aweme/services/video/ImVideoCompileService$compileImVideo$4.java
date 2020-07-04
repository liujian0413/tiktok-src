package com.p280ss.android.ugc.aweme.services.video;

import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService.CompileResult;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.LongRef;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.C7496w;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$compileImVideo$4 */
final class ImVideoCompileService$compileImVideo$4<T, R> implements C7327h<T, C7496w<? extends R>> {
    final /* synthetic */ LongRef $costTime;
    final /* synthetic */ LongRef $currentTime;
    final /* synthetic */ CompileResult $result;
    final /* synthetic */ LongRef $startTime;
    final /* synthetic */ ImVideoCompileService this$0;

    ImVideoCompileService$compileImVideo$4(ImVideoCompileService imVideoCompileService, CompileResult compileResult, LongRef longRef, LongRef longRef2, LongRef longRef3) {
        this.this$0 = imVideoCompileService;
        this.$result = compileResult;
        this.$currentTime = longRef;
        this.$costTime = longRef2;
        this.$startTime = longRef3;
    }

    public final C7492s<CompileResult> apply(String str) {
        C7573i.m23587b(str, "it");
        this.$result.setThumbnailPath(str);
        this.$currentTime.element = System.currentTimeMillis();
        this.$costTime.element = this.$currentTime.element - this.$startTime.element;
        this.$startTime.element = this.$currentTime.element;
        StringBuilder sb = new StringBuilder("ImVideoCompileService compileImVideo step 4: result=");
        sb.append(this.$result);
        sb.append(", costTime=");
        sb.append(this.$costTime.element);
        C6921a.m21555a(sb.toString());
        return C7492s.m23282a((C7495v<T>) new C7495v<T>(this) {
            final /* synthetic */ ImVideoCompileService$compileImVideo$4 this$0;

            {
                this.this$0 = r1;
            }

            public final void subscribe(C47870u<CompileResult> uVar) {
                C7573i.m23587b(uVar, "emitter");
                this.this$0.this$0.safeOnSingleNext(uVar, this.this$0.$result);
            }
        });
    }
}
