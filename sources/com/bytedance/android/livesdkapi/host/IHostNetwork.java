package com.bytedance.android.livesdkapi.host;

import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.base.model.NameValuePair;
import com.bytedance.android.livesdkapi.host.p453a.C9447h;
import com.bytedance.android.livesdkapi.p457i.C9477e;
import com.bytedance.android.livesdkapi.p457i.C9479g;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface IHostNetwork extends C2324b, C9447h {
    C9479g<C9477e> downloadFile(boolean z, int i, String str, List<NameValuePair> list, Object obj) throws IOException;

    C9479g<C9477e> get(String str, List<NameValuePair> list) throws IOException;

    Map<String, String> getCommonParams();

    String getHostDomain();

    C9479g<C9477e> post(String str, List<NameValuePair> list, String str2, byte[] bArr) throws IOException;

    C9479g<C9477e> uploadFile(int i, String str, List<NameValuePair> list, String str2, byte[] bArr, long j, String str3) throws IOException;
}
