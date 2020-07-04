package com.facebook.react.modules.blob;

import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.network.NetworkingModule.RequestBodyHandler;
import com.facebook.react.modules.network.NetworkingModule.ResponseHandler;
import com.facebook.react.modules.network.NetworkingModule.UriHandler;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.modules.websocket.WebSocketModule.ContentHandler;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.ByteString;

@ReactModule(name = "BlobModule")
public class BlobModule extends ReactContextBaseJavaModule {
    private final Map<String, byte[]> mBlobs = new HashMap();
    private final RequestBodyHandler mNetworkingRequestBodyHandler = new RequestBodyHandler() {
        public boolean supports(ReadableMap readableMap) {
            return readableMap.hasKey("blob");
        }

        public RequestBody toRequestBody(ReadableMap readableMap, String str) {
            if (readableMap.hasKey("type") && !readableMap.getString("type").isEmpty()) {
                str = readableMap.getString("type");
            }
            if (str == null) {
                str = "application/octet-stream";
            }
            ReadableMap map = readableMap.getMap("blob");
            return RequestBody.create(MediaType.parse(str), BlobModule.this.resolve(map.getString("blobId"), map.getInt("offset"), map.getInt("size")));
        }
    };
    private final ResponseHandler mNetworkingResponseHandler = new ResponseHandler() {
        public boolean supports(String str) {
            return str.equals("blob");
        }

        public WritableMap toResponseData(ResponseBody responseBody) throws IOException {
            byte[] bytes = responseBody.bytes();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("blobId", BlobModule.this.store(bytes));
            createMap.putInt("offset", 0);
            createMap.putInt("size", bytes.length);
            return createMap;
        }
    };
    private final UriHandler mNetworkingUriHandler = new UriHandler() {
        public WritableMap fetch(Uri uri) throws IOException {
            byte[] bytesFromUri = BlobModule.this.getBytesFromUri(uri);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("blobId", BlobModule.this.store(bytesFromUri));
            createMap.putInt("offset", 0);
            createMap.putInt("size", bytesFromUri.length);
            createMap.putString("type", BlobModule.this.getMimeTypeFromUri(uri));
            createMap.putString("name", BlobModule.this.getNameFromUri(uri));
            createMap.putDouble("lastModified", (double) BlobModule.this.getLastModifiedFromUri(uri));
            return createMap;
        }

        public boolean supports(Uri uri, String str) {
            boolean z;
            String scheme = uri.getScheme();
            if (WebKitApi.SCHEME_HTTP.equals(scheme) || WebKitApi.SCHEME_HTTPS.equals(scheme)) {
                z = true;
            } else {
                z = false;
            }
            if (z || !str.equals("blob")) {
                return false;
            }
            return true;
        }
    };
    private final ContentHandler mWebSocketContentHandler = new ContentHandler() {
        public void onMessage(String str, WritableMap writableMap) {
            writableMap.putString("data", str);
        }

        public void onMessage(ByteString byteString, WritableMap writableMap) {
            byte[] byteArray = byteString.toByteArray();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("blobId", BlobModule.this.store(byteArray));
            createMap.putInt("offset", 0);
            createMap.putInt("size", byteArray.length);
            writableMap.putMap("data", createMap);
            writableMap.putString("type", "blob");
        }
    };

    public String getName() {
        return "BlobModule";
    }

    private WebSocketModule getWebSocketModule() {
        return (WebSocketModule) getReactApplicationContext().getNativeModule(WebSocketModule.class);
    }

    @ReactMethod
    public void addNetworkingHandler() {
        NetworkingModule networkingModule = (NetworkingModule) getReactApplicationContext().getNativeModule(NetworkingModule.class);
        networkingModule.addUriHandler(this.mNetworkingUriHandler);
        networkingModule.addRequestBodyHandler(this.mNetworkingRequestBodyHandler);
        networkingModule.addResponseHandler(this.mNetworkingResponseHandler);
    }

    public Map<String, Object> getConstants() {
        Resources resources = getReactApplicationContext().getResources();
        int identifier = resources.getIdentifier("blob_provider_authority", "string", getReactApplicationContext().getPackageName());
        if (identifier == 0) {
            return null;
        }
        return MapBuilder.m41789of("BLOB_URI_SCHEME", C38347c.f99553h, "BLOB_URI_HOST", resources.getString(identifier));
    }

    @ReactMethod
    public void release(String str) {
        remove(str);
    }

    public void remove(String str) {
        this.mBlobs.remove(str);
    }

    @ReactMethod
    public void addWebSocketHandler(int i) {
        getWebSocketModule().setContentHandler(i, this.mWebSocketContentHandler);
    }

    @ReactMethod
    public void removeWebSocketHandler(int i) {
        getWebSocketModule().setContentHandler(i, null);
    }

    public String store(byte[] bArr) {
        String uuid = UUID.randomUUID().toString();
        store(bArr, uuid);
        return uuid;
    }

    public long getLastModifiedFromUri(Uri uri) {
        if (uri.getScheme().equals("file")) {
            return new File(uri.toString()).lastModified();
        }
        return 0;
    }

    public byte[] resolve(ReadableMap readableMap) {
        return resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
    }

    public BlobModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public byte[] getBytesFromUri(Uri uri) throws IOException {
        InputStream openInputStream = getReactApplicationContext().getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } else {
            StringBuilder sb = new StringBuilder("File not found for ");
            sb.append(uri);
            throw new FileNotFoundException(sb.toString());
        }
    }

    public String getMimeTypeFromUri(Uri uri) {
        String type = getReactApplicationContext().getContentResolver().getType(uri);
        if (type == null) {
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.getPath());
            if (fileExtensionFromUrl != null) {
                type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
            }
        }
        if (type == null) {
            return "";
        }
        return type;
    }

    public byte[] resolve(Uri uri) {
        int i;
        int i2;
        String lastPathSegment = uri.getLastPathSegment();
        String queryParameter = uri.getQueryParameter("offset");
        if (queryParameter != null) {
            i = Integer.parseInt(queryParameter, 10);
        } else {
            i = 0;
        }
        String queryParameter2 = uri.getQueryParameter("size");
        if (queryParameter2 != null) {
            i2 = Integer.parseInt(queryParameter2, 10);
        } else {
            i2 = -1;
        }
        return resolve(lastPathSegment, i, i2);
    }

    public String getNameFromUri(Uri uri) {
        if (uri.getScheme().equals("file")) {
            return uri.getLastPathSegment();
        }
        Cursor query = getReactApplicationContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    return query.getString(0);
                }
                query.close();
            } finally {
                query.close();
            }
        }
        return uri.getLastPathSegment();
    }

    public void store(byte[] bArr, String str) {
        this.mBlobs.put(str, bArr);
    }

    @ReactMethod
    public void sendOverSocket(ReadableMap readableMap, int i) {
        byte[] resolve = resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
        if (resolve != null) {
            getWebSocketModule().sendBinary(ByteString.m23795of(resolve), i);
        } else {
            getWebSocketModule().sendBinary((ByteString) null, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0044 A[SYNTHETIC] */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void createFromParts(com.facebook.react.bridge.ReadableArray r10, java.lang.String r11) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.size()
            r0.<init>(r1)
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x000c:
            int r4 = r10.size()
            if (r2 >= r4) goto L_0x008b
            com.facebook.react.bridge.ReadableMap r4 = r10.getMap(r2)
            java.lang.String r5 = "type"
            java.lang.String r5 = r4.getString(r5)
            r6 = -1
            int r7 = r5.hashCode()
            r8 = -891985903(0xffffffffcad56011, float:-6991880.5)
            if (r7 == r8) goto L_0x0036
            r8 = 3026845(0x2e2f9d, float:4.241513E-39)
            if (r7 == r8) goto L_0x002c
            goto L_0x0040
        L_0x002c:
            java.lang.String r7 = "blob"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0040
            r5 = 0
            goto L_0x0041
        L_0x0036:
            java.lang.String r7 = "string"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0040
            r5 = 1
            goto L_0x0041
        L_0x0040:
            r5 = -1
        L_0x0041:
            switch(r5) {
                case 0: goto L_0x0074;
                case 1: goto L_0x005e;
                default: goto L_0x0044;
            }
        L_0x0044:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid type for blob: "
            r11.<init>(r0)
            java.lang.String r0 = "type"
            java.lang.String r0 = r4.getString(r0)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x005e:
            java.lang.String r5 = "data"
            java.lang.String r4 = r4.getString(r5)
            java.lang.String r5 = "UTF-8"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)
            byte[] r4 = r4.getBytes(r5)
            int r5 = r4.length
            int r3 = r3 + r5
            r0.add(r2, r4)
            goto L_0x0088
        L_0x0074:
            java.lang.String r5 = "data"
            com.facebook.react.bridge.ReadableMap r4 = r4.getMap(r5)
            java.lang.String r5 = "size"
            int r5 = r4.getInt(r5)
            int r3 = r3 + r5
            byte[] r4 = r9.resolve(r4)
            r0.add(r2, r4)
        L_0x0088:
            int r2 = r2 + 1
            goto L_0x000c
        L_0x008b:
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0093:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a3
            java.lang.Object r1 = r0.next()
            byte[] r1 = (byte[]) r1
            r10.put(r1)
            goto L_0x0093
        L_0x00a3:
            byte[] r10 = r10.array()
            r9.store(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.blob.BlobModule.createFromParts(com.facebook.react.bridge.ReadableArray, java.lang.String):void");
    }

    public byte[] resolve(String str, int i, int i2) {
        byte[] bArr = (byte[]) this.mBlobs.get(str);
        if (bArr == null) {
            return null;
        }
        if (i2 == -1) {
            i2 = bArr.length - i;
        }
        if (i > 0 || i2 != bArr.length) {
            bArr = Arrays.copyOfRange(bArr, i, i2 + i);
        }
        return bArr;
    }
}
