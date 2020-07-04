package com.bytedance.android.livesdk.gift.download;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.NameValuePair;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.p457i.C9477e;
import com.bytedance.android.livesdkapi.p457i.C9479g;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p637a.C12464d;
import com.p280ss.android.socialbase.downloader.model.HttpHeader;
import com.p280ss.android.socialbase.downloader.network.C20346e;
import com.p280ss.android.socialbase.downloader.network.C20347f;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.download.b */
public final class C7954b implements C20347f {

    /* renamed from: a */
    C9479g<C9477e> f21532a;

    /* renamed from: b */
    C9477e f21533b;

    /* renamed from: a */
    protected static String m24379a(List<C12461b> list, String str) {
        if (list != null && !TextUtils.isEmpty(str)) {
            for (C12461b bVar : list) {
                if (str.equalsIgnoreCase(bVar.f33095a)) {
                    return bVar.f33096b;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C20346e mo20815a(int i, String str, List<HttpHeader> list) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (HttpHeader httpHeader : list) {
                arrayList.add(new NameValuePair(httpHeader.f54980a, httpHeader.f54981b));
            }
        }
        arrayList.add(new NameValuePair("Accept-Encoding", "identity"));
        this.f21532a = ((INetworkService) C3596c.m13172a(INetworkService.class)).downloadFile(false, i, str, arrayList, null);
        this.f21533b = (C9477e) this.f21532a.mo23512a();
        if (this.f21533b == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (this.f21533b.f25945c != null) {
            for (NameValuePair nameValuePair : this.f21533b.f25945c) {
                arrayList2.add(new C12461b(nameValuePair.getName(), nameValuePair.getValue()));
            }
        }
        final C12464d dVar = new C12464d(str, this.f21533b.f25944b, this.f21533b.f25948f, arrayList2, new TypedInput() {
            public final String mimeType() {
                return C7954b.this.f21533b.f25946d;
            }

            /* renamed from: in */
            public final InputStream mo10444in() throws IOException {
                return new ByteArrayInputStream(C7954b.this.f21533b.f25947e);
            }

            public final long length() throws IOException {
                return (long) C7954b.this.f21533b.f25947e.length;
            }
        });
        final InputStream in = new TypedInput() {
            public final String mimeType() {
                return C7954b.this.f21533b.f25946d;
            }

            /* renamed from: in */
            public final InputStream mo10444in() throws IOException {
                return new ByteArrayInputStream(C7954b.this.f21533b.f25947e);
            }

            public final long length() throws IOException {
                return (long) C7954b.this.f21533b.f25947e.length;
            }
        }.mo10444in();
        return new C20346e() {
            /* renamed from: a */
            public final InputStream mo20816a() throws IOException {
                return in;
            }

            /* renamed from: d */
            public final void mo20820d() {
            }

            /* renamed from: b */
            public final int mo20818b() throws IOException {
                return dVar.f33119b;
            }

            /* renamed from: c */
            public final void mo20819c() {
                if (C7954b.this.f21532a != null) {
                    try {
                        C7954b.this.f21532a.mo23513b();
                    } catch (IOException unused) {
                    }
                }
            }

            /* renamed from: a */
            public final String mo20817a(String str) {
                return C7954b.m24379a(dVar.f33121d, str);
            }
        };
    }
}
