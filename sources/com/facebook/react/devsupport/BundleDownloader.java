package com.facebook.react.devsupport;

import com.facebook.common.p686c.C13286a;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.common.DebugServerException;
import com.facebook.react.devsupport.MultipartStreamReader.ChunkListener;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import org.json.JSONException;
import org.json.JSONObject;

public class BundleDownloader {
    private final BundleDeltaClient mBundleDeltaClient = new BundleDeltaClient();
    private final OkHttpClient mClient;
    public Call mDownloadBundleFromURLCall;

    public static class BundleInfo {
        public int mFilesChangedCount;
        public String mUrl;

        public int getFilesChangedCount() {
            return this.mFilesChangedCount;
        }

        public String getUrl() {
            if (this.mUrl != null) {
                return this.mUrl;
            }
            return "unknown";
        }

        public String toJSONString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", this.mUrl);
                jSONObject.put("filesChangedCount", this.mFilesChangedCount);
                return jSONObject.toString();
            } catch (JSONException unused) {
                return null;
            }
        }

        public static BundleInfo fromJSONString(String str) {
            if (str == null) {
                return null;
            }
            BundleInfo bundleInfo = new BundleInfo();
            try {
                JSONObject jSONObject = new JSONObject(str);
                bundleInfo.mUrl = jSONObject.getString("url");
                bundleInfo.mFilesChangedCount = jSONObject.getInt("filesChangedCount");
                return bundleInfo;
            } catch (JSONException unused) {
                return null;
            }
        }
    }

    public BundleDownloader(OkHttpClient okHttpClient) {
        this.mClient = okHttpClient;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean storePlainJSInFile(okio.BufferedSource r0, java.io.File r1) throws java.io.IOException {
        /*
            okio.Sink r1 = okio.Okio.sink(r1)     // Catch:{ all -> 0x0010 }
            r0.readAll(r1)     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x000c
            r1.close()
        L_0x000c:
            r0 = 1
            return r0
        L_0x000e:
            r0 = move-exception
            goto L_0x0012
        L_0x0010:
            r0 = move-exception
            r1 = 0
        L_0x0012:
            if (r1 == 0) goto L_0x0017
            r1.close()
        L_0x0017:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.BundleDownloader.storePlainJSInFile(okio.BufferedSource, java.io.File):boolean");
    }

    private static void populateBundleInfo(String str, Headers headers, BundleInfo bundleInfo) {
        bundleInfo.mUrl = str;
        String str2 = headers.get("X-Metro-Files-Changed-Count");
        if (str2 != null) {
            try {
                bundleInfo.mFilesChangedCount = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                bundleInfo.mFilesChangedCount = -2;
            }
        }
    }

    public void downloadBundleFromURL(final DevBundleDownloadListener devBundleDownloadListener, final File file, String str, final BundleInfo bundleInfo) {
        this.mDownloadBundleFromURLCall = (Call) C13854a.m40916b(this.mClient.newCall(new Builder().url(this.mBundleDeltaClient.toDeltaUrl(str)).build()));
        this.mDownloadBundleFromURLCall.enqueue(new Callback() {
            public void onFailure(Call call, IOException iOException) {
                if (BundleDownloader.this.mDownloadBundleFromURLCall == null || BundleDownloader.this.mDownloadBundleFromURLCall.isCanceled()) {
                    BundleDownloader.this.mDownloadBundleFromURLCall = null;
                    return;
                }
                BundleDownloader.this.mDownloadBundleFromURLCall = null;
                DevBundleDownloadListener devBundleDownloadListener = devBundleDownloadListener;
                StringBuilder sb = new StringBuilder("URL: ");
                sb.append(call.request().url.toString());
                devBundleDownloadListener.onFailure(DebugServerException.makeGeneric("Could not connect to development server.", sb.toString(), iOException));
            }

            public void onResponse(Call call, Response response) throws IOException {
                Throwable th;
                if (BundleDownloader.this.mDownloadBundleFromURLCall == null || BundleDownloader.this.mDownloadBundleFromURLCall.isCanceled()) {
                    BundleDownloader.this.mDownloadBundleFromURLCall = null;
                    return;
                }
                BundleDownloader.this.mDownloadBundleFromURLCall = null;
                String httpUrl = response.request.url.toString();
                Matcher matcher = Pattern.compile("multipart/mixed;.*boundary=\"([^\"]+)\"").matcher(response.header("content-type"));
                try {
                    if (matcher.find()) {
                        BundleDownloader.this.processMultipartResponse(httpUrl, response, matcher.group(1), file, bundleInfo, devBundleDownloadListener);
                    } else {
                        BundleDownloader.this.processBundleResult(httpUrl, response.code, response.headers, Okio.buffer((Source) response.body.source()), file, bundleInfo, devBundleDownloadListener);
                    }
                    if (response != null) {
                        response.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    C6497a.m20181a(th, th2);
                }
                throw th;
            }
        });
    }

    public void processMultipartResponse(String str, Response response, String str2, File file, BundleInfo bundleInfo, DevBundleDownloadListener devBundleDownloadListener) throws IOException {
        MultipartStreamReader multipartStreamReader = new MultipartStreamReader(response.body.source(), str2);
        final Response response2 = response;
        final String str3 = str;
        final File file2 = file;
        final BundleInfo bundleInfo2 = bundleInfo;
        final DevBundleDownloadListener devBundleDownloadListener2 = devBundleDownloadListener;
        C142552 r2 = new ChunkListener() {
            public void onChunkProgress(Map<String, String> map, long j, long j2) throws IOException {
                if ("application/javascript".equals(map.get("Content-Type"))) {
                    devBundleDownloadListener2.onProgress("Downloading JavaScript bundle", Integer.valueOf((int) (j / 1024)), Integer.valueOf((int) (j2 / 1024)));
                }
            }

            public void onChunkComplete(Map<String, String> map, Buffer buffer, boolean z) throws IOException {
                String str;
                Integer num;
                if (z) {
                    int i = response2.code;
                    if (map.containsKey("X-Http-Status")) {
                        i = Integer.parseInt((String) map.get("X-Http-Status"));
                    }
                    BundleDownloader.this.processBundleResult(str3, i, Headers.m23791of(map), buffer, file2, bundleInfo2, devBundleDownloadListener2);
                } else if (map.containsKey("Content-Type") && ((String) map.get("Content-Type")).equals("application/json")) {
                    try {
                        JSONObject jSONObject = new JSONObject(buffer.readUtf8());
                        Integer num2 = null;
                        if (jSONObject.has("status")) {
                            str = jSONObject.getString("status");
                        } else {
                            str = null;
                        }
                        if (jSONObject.has("done")) {
                            num = Integer.valueOf(jSONObject.getInt("done"));
                        } else {
                            num = null;
                        }
                        if (jSONObject.has("total")) {
                            num2 = Integer.valueOf(jSONObject.getInt("total"));
                        }
                        devBundleDownloadListener2.onProgress(str, num, num2);
                    } catch (JSONException e) {
                        StringBuilder sb = new StringBuilder("Error parsing progress JSON. ");
                        sb.append(e.toString());
                        C13286a.m38863d("ReactNative", sb.toString());
                    }
                }
            }
        };
        if (!multipartStreamReader.readAllParts(r2)) {
            StringBuilder sb = new StringBuilder("Error while reading multipart response.\n\nResponse code: ");
            sb.append(response.code);
            sb.append("\n\nURL: ");
            sb.append(str.toString());
            sb.append("\n\n");
            devBundleDownloadListener.onFailure(new DebugServerException(sb.toString()));
        }
    }

    public void processBundleResult(String str, int i, Headers headers, BufferedSource bufferedSource, File file, BundleInfo bundleInfo, DevBundleDownloadListener devBundleDownloadListener) throws IOException {
        boolean z;
        if (i != 200) {
            String readUtf8 = bufferedSource.readUtf8();
            DebugServerException parse = DebugServerException.parse(readUtf8);
            if (parse != null) {
                devBundleDownloadListener.onFailure(parse);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The development server returned response error code: ");
            sb.append(i);
            sb.append("\n\nURL: ");
            sb.append(str);
            sb.append("\n\nBody:\n");
            sb.append(readUtf8);
            devBundleDownloadListener.onFailure(new DebugServerException(sb.toString()));
            return;
        }
        if (bundleInfo != null) {
            populateBundleInfo(str, headers, bundleInfo);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getPath());
        sb2.append(".tmp");
        File file2 = new File(sb2.toString());
        if (BundleDeltaClient.isDeltaUrl(str)) {
            z = this.mBundleDeltaClient.storeDeltaInFile(bufferedSource, file2);
        } else {
            this.mBundleDeltaClient.reset();
            z = storePlainJSInFile(bufferedSource, file2);
        }
        if (!z || file2.renameTo(file)) {
            devBundleDownloadListener.onSuccess();
            return;
        }
        StringBuilder sb3 = new StringBuilder("Couldn't rename ");
        sb3.append(file2);
        sb3.append(" to ");
        sb3.append(file);
        throw new IOException(sb3.toString());
    }
}
