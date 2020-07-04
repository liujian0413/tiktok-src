package com.p280ss.android.ugc.aweme.music;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.music.api.MusicApi;
import java.io.File;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.MultipartBody.Builder;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.music.b */
public class C33762b {

    /* renamed from: a */
    public static final String f88114a = "b";

    /* renamed from: com.ss.android.ugc.aweme.music.b$a */
    public interface C33765a {
        /* renamed from: a */
        void mo86185a(int i);

        /* renamed from: a */
        void mo86186a(String str, long j);

        /* renamed from: a */
        void mo86187a(String str, Exception exc, long j);
    }

    /* renamed from: a */
    private static RequestBody m108898a(final MediaType mediaType, final File file, final C33765a aVar) {
        return new RequestBody() {
            public final MediaType contentType() {
                return mediaType;
            }

            public final long contentLength() {
                return file.length();
            }

            /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x004a  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void writeTo(okio.BufferedSink r14) throws java.io.IOException {
                /*
                    r13 = this;
                    r0 = 0
                    java.io.File r1 = r2     // Catch:{ Exception -> 0x0048, all -> 0x0040 }
                    okio.Source r1 = okio.Okio.source(r1)     // Catch:{ Exception -> 0x0048, all -> 0x0040 }
                    okio.Buffer r0 = new okio.Buffer     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                    r0.<init>()     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                    long r2 = r13.contentLength()     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                    r4 = 0
                    r6 = 2048(0x800, double:1.0118E-320)
                    long r8 = r1.read(r0, r6)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                L_0x0018:
                    r10 = -1
                    int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                    if (r12 == 0) goto L_0x0033
                    r14.write(r0, r8)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                    r10 = 0
                    long r4 = r4 + r8
                    com.ss.android.ugc.aweme.music.b$a r8 = r3     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                    r9 = 100
                    long r9 = r9 * r4
                    long r9 = r9 / r2
                    int r9 = (int) r9     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                    r8.mo86185a(r9)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                    long r8 = r1.read(r0, r6)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                    goto L_0x0018
                L_0x0033:
                    r14.flush()     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                    if (r1 == 0) goto L_0x004e
                    r1.close()
                    return
                L_0x003c:
                    r14 = move-exception
                    goto L_0x0042
                L_0x003e:
                    r0 = r1
                    goto L_0x0048
                L_0x0040:
                    r14 = move-exception
                    r1 = r0
                L_0x0042:
                    if (r1 == 0) goto L_0x0047
                    r1.close()
                L_0x0047:
                    throw r14
                L_0x0048:
                    if (r0 == 0) goto L_0x004e
                    r0.close()
                    return
                L_0x004e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.music.C33762b.C337642.writeTo(okio.BufferedSink):void");
            }
        };
    }

    /* renamed from: a */
    public static void m108899a(final String str, String str2, final C33765a aVar) {
        Builder type = new Builder().setType(MultipartBody.FORM);
        final File file = new File(str);
        if (!file.exists() || file.length() == 0) {
            aVar.mo86187a(str, new Exception(), file.length());
            return;
        }
        type.addFormDataPart("file", file.getName(), m108898a(MultipartBody.FORM, file, aVar));
        type.addFormDataPart("file_type", "mpeg");
        MusicApi.m108883a(type.build()).mo6875a((C1591g<TResult, TContinuationResult>) new C1591g<String, Object>() {
            public final Object then(C1592h<String> hVar) throws Exception {
                if (hVar.mo6889d() || hVar.mo6887c()) {
                    aVar.mo86187a(str, new Exception(hVar.mo6891f()), file.length());
                } else {
                    try {
                        JSONObject optJSONObject = new JSONObject((String) hVar.mo6890e()).optJSONObject("data");
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("uri");
                            if (optString != null) {
                                aVar.mo86186a(optString, file.length());
                                return null;
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
                return null;
            }
        });
    }
}
