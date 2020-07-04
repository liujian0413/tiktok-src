package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.facebook.common.p686c.C13286a;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;

class RequestBodyUtil {
    RequestBodyUtil() {
    }

    public static boolean isGzipEncoding(String str) {
        return "gzip".equalsIgnoreCase(str);
    }

    public static RequestBody getEmptyBody(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH")) {
            return RequestBody.create((MediaType) null, ByteString.EMPTY);
        }
        return null;
    }

    public static RequestBody create(final MediaType mediaType, final InputStream inputStream) {
        return new RequestBody() {
            public final MediaType contentType() {
                return mediaType;
            }

            public final long contentLength() {
                try {
                    return (long) inputStream.available();
                } catch (IOException unused) {
                    return 0;
                }
            }

            public final void writeTo(BufferedSink bufferedSink) throws IOException {
                Source source = null;
                try {
                    Source source2 = Okio.source(inputStream);
                    try {
                        bufferedSink.writeAll(source2);
                        Util.closeQuietly((Closeable) source2);
                    } catch (Throwable th) {
                        th = th;
                        source = source2;
                        Util.closeQuietly((Closeable) source);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Util.closeQuietly((Closeable) source);
                    throw th;
                }
            }
        };
    }

    public static ProgressRequestBody createProgressRequest(RequestBody requestBody, ProgressListener progressListener) {
        return new ProgressRequestBody(requestBody, progressListener);
    }

    public static RequestBody createGzip(MediaType mediaType, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            return RequestBody.create(mediaType, byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    public static InputStream getFileInputStream(Context context, String str) {
        try {
            Uri parse = Uri.parse(str);
            if (parse.getScheme().startsWith(WebKitApi.SCHEME_HTTP)) {
                return getDownloadFileInputStream(context, parse);
            }
            return context.getContentResolver().openInputStream(parse);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Could not retrieve file for contentUri ");
            sb.append(str);
            C13286a.m38861c("ReactNative", sb.toString(), (Throwable) e);
            return null;
        }
    }

    private static InputStream getDownloadFileInputStream(Context context, Uri uri) throws IOException {
        FileOutputStream fileOutputStream;
        File createTempFile = File.createTempFile("RequestBodyUtil", "temp", context.getApplicationContext().getCacheDir());
        createTempFile.deleteOnExit();
        InputStream openStream = new URL(uri.toString()).openStream();
        try {
            ReadableByteChannel newChannel = Channels.newChannel(openStream);
            try {
                fileOutputStream = new FileOutputStream(createTempFile);
                fileOutputStream.getChannel().transferFrom(newChannel, 0, Long.MAX_VALUE);
                FileInputStream fileInputStream = new FileInputStream(createTempFile);
                fileOutputStream.close();
                newChannel.close();
                return fileInputStream;
            } catch (Throwable th) {
                newChannel.close();
                throw th;
            }
        } finally {
            openStream.close();
        }
    }
}
