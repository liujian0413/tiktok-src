package com.bytedance.p263im.core.internal.queue;

import android.util.Pair;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p584a.C11205e;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.Request;
import com.bytedance.p263im.core.proto.Response;
import net.jpountz.lz4.LZ4Factory;

/* renamed from: com.bytedance.im.core.internal.queue.f */
public final class C11392f {
    /* renamed from: a */
    public static Pair<String, byte[]> m33536a(Request request) throws CoderException {
        if (request == null || request.cmd.intValue() <= IMCMD.IMCMD_NOT_USED.getValue()) {
            throw new CoderException(-2002);
        }
        C11205e b = C11198c.m32777a().mo27248b();
        byte[] encode = request.encode();
        float length = (float) encode.length;
        if (b == null) {
            throw new CoderException(-2001);
        } else if (encode.length <= b.f30408h) {
            return new Pair<>("pb", encode);
        } else {
            byte[] compress = LZ4Factory.fastestInstance().fastCompressor().compress(encode);
            StringBuilder sb = new StringBuilder("compress rate = ");
            sb.append(((float) compress.length) / length);
            C11404d.m33582a(sb.toString());
            if (compress.length <= b.f30407g) {
                return new Pair<>("__lz4", compress);
            }
            throw new CoderException(-2004);
        }
    }

    /* renamed from: a */
    public static Response m33537a(String str, byte[] bArr) throws CoderException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            if ("__lz4".equals(str)) {
                bArr = LZ4Factory.fastestInstance().safeDecompressor().decompress(bArr, bArr.length * 3);
            }
            return (Response) Response.ADAPTER.decode(bArr);
        } catch (Exception unused) {
            throw new CoderException(-2003);
        }
    }
}
