package com.facebook.imagepipeline.p726m;

import com.facebook.imageformat.C13509c;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.common.C13597e;
import com.facebook.imagepipeline.p720g.C13647e;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.facebook.imagepipeline.m.b */
public interface C13789b {
    boolean canResize(C13647e eVar, C13597e eVar2, C13596d dVar);

    boolean canTranscode(C13509c cVar);

    String getIdentifier();

    C13788a transcode(C13647e eVar, OutputStream outputStream, C13597e eVar2, C13596d dVar, C13509c cVar, Integer num) throws IOException;
}
