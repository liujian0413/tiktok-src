package com.p280ss.sys.ces.out;

import android.content.Context;
import com.p280ss.sys.ces.utils.NetInterface;
import java.util.HashMap;

/* renamed from: com.ss.sys.ces.out.ISdk */
public interface ISdk {
    void InitSelas();

    void SetRegionType(int i);

    String debugEntry(Context context, int i);

    byte[] decodeMillion(byte[] bArr, byte[] bArr2);

    byte[] encode(byte[] bArr);

    byte[] encodeMillion(byte[] bArr, byte[] bArr2);

    int isUseTTNet(boolean z);

    String onEvent();

    String pullSg();

    String pullVer(String str);

    void reportNow(String str);

    void reportNow(String str, boolean z);

    void setCustomInfo(HashMap<String, Object> hashMap);

    void setEfficientDebug(boolean z);

    void setInterface(NetInterface netInterface);

    void setNMSdkExpandInstance(ISdkNM iSdkNM);

    void setNetwork(boolean z);

    void setParams(String str, String str2);

    void setSession(String str);

    void setUrlInterface(int i, String str);
}
