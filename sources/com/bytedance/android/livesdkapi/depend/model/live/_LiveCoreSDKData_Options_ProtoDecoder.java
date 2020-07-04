package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData.Options;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

public final class _LiveCoreSDKData_Options_ProtoDecoder implements C2265b<Options> {
    public final Options decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static Options decodeStatic(C2272g gVar) throws Exception {
        Options options = new Options();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        options.defaultQuality = _LiveCoreSDKData_Quality_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        if (options.qualityList == null) {
                            options.qualityList = new ArrayList();
                        }
                        options.qualityList.add(_LiveCoreSDKData_Quality_ProtoDecoder.decodeStatic(gVar));
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return options;
            }
        }
    }
}
