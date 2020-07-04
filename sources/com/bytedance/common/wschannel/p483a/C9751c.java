package com.bytedance.common.wschannel.p483a;

import com.bytedance.common.wschannel.model.Frame;
import com.bytedance.common.wschannel.model.Frame.Builder;
import com.bytedance.common.wschannel.model.Frame.ExtendedEntry;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.model.WsChannelMsg.MsgHeader;
import com.squareup.wire.Wire;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okio.ByteString;

/* renamed from: com.bytedance.common.wschannel.a.c */
final class C9751c implements C9749a {
    C9751c() {
    }

    /* renamed from: a */
    public final WsChannelMsg mo24139a(byte[] bArr) throws IOException {
        Frame frame = (Frame) Frame.ADAPTER.decode(bArr);
        long longValue = ((Long) Wire.get(frame.seqid, Frame.DEFAULT_SEQID)).longValue();
        long longValue2 = ((Long) Wire.get(frame.logid, Frame.DEFAULT_LOGID)).longValue();
        int intValue = ((Integer) Wire.get(frame.service, Frame.DEFAULT_SERVICE)).intValue();
        int intValue2 = ((Integer) Wire.get(frame.method, Frame.DEFAULT_METHOD)).intValue();
        List<ExtendedEntry> list = (List) Wire.get(frame.headers, Collections.emptyList());
        String str = (String) Wire.get(frame.payload_encoding, "");
        String str2 = (String) Wire.get(frame.payload_type, "");
        byte[] byteArray = ((ByteString) Wire.get(frame.payload, Frame.DEFAULT_PAYLOAD)).toByteArray();
        WsChannelMsg wsChannelMsg = new WsChannelMsg();
        wsChannelMsg.f26768c = longValue2;
        wsChannelMsg.f26767b = longValue;
        wsChannelMsg.f26769d = intValue;
        wsChannelMsg.f26770e = intValue2;
        if (list != null && list.size() >= 0) {
            ArrayList arrayList = new ArrayList();
            for (ExtendedEntry extendedEntry : list) {
                MsgHeader msgHeader = new MsgHeader();
                msgHeader.f26777a = (String) Wire.get(extendedEntry.key, "");
                msgHeader.f26778b = (String) Wire.get(extendedEntry.value, "");
                arrayList.add(msgHeader);
            }
            wsChannelMsg.f26771f = arrayList;
        }
        wsChannelMsg.f26772g = str;
        wsChannelMsg.f26773h = str2;
        wsChannelMsg.f26774i = byteArray;
        return wsChannelMsg;
    }

    /* renamed from: a */
    public final byte[] mo24140a(WsChannelMsg wsChannelMsg) {
        ByteString byteString;
        if (wsChannelMsg == null) {
            return null;
        }
        if (wsChannelMsg.mo24357a() != null) {
            byteString = ByteString.m23795of(wsChannelMsg.mo24357a());
        } else {
            byteString = ByteString.EMPTY;
        }
        Builder method = new Builder().logid(Long.valueOf(wsChannelMsg.f26768c)).seqid(Long.valueOf(wsChannelMsg.f26767b)).service(Integer.valueOf(wsChannelMsg.f26769d)).payload_encoding(wsChannelMsg.f26772g).payload_type(wsChannelMsg.f26773h).payload(byteString).method(Integer.valueOf(wsChannelMsg.f26770e));
        List<MsgHeader> list = wsChannelMsg.f26771f;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (MsgHeader msgHeader : list) {
                arrayList.add(new ExtendedEntry.Builder().key(msgHeader.f26777a).value(msgHeader.f26778b).build());
            }
        }
        if (!arrayList.isEmpty()) {
            method.headers(arrayList);
        }
        return Frame.ADAPTER.encode(method.build());
    }
}
