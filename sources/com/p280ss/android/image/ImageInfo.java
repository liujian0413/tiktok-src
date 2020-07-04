package com.p280ss.android.image;

import android.text.TextUtils;
import com.bytedance.common.utility.C6306c;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.ugc.aweme.app.C22912d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.image.ImageInfo */
public class ImageInfo implements Serializable {
    private static final long serialVersionUID = -6027923654002990158L;
    public volatile boolean mDownloaded;
    protected String mExtraKey;
    private transient boolean mFixedDisplaySize;
    public int mHeight;
    public boolean mIsGif;
    public boolean mIsVideo;
    public String mKey;
    public boolean mNeedAlpha;
    public String mOpenUrl;
    public String mUri;
    public String mUrlList;
    public int mWidth;

    public String getExtraKey() {
        return this.mExtraKey;
    }

    public boolean isFixedDisplaySize() {
        return this.mFixedDisplaySize;
    }

    public boolean isValid() {
        if (this.mWidth <= 0 || this.mHeight <= 0 || TextUtils.isEmpty(this.mUri) || TextUtils.isEmpty(this.mUrlList)) {
            return false;
        }
        return true;
    }

    public JSONObject toJsonObj() {
        if (TextUtils.isEmpty(this.mUri)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uri", this.mUri);
            jSONObject.put("width", this.mWidth);
            jSONObject.put("height", this.mHeight);
            if (this.mOpenUrl != null) {
                jSONObject.put(C22912d.f60642b, this.mOpenUrl);
            }
            if (!TextUtils.isEmpty(this.mUrlList)) {
                try {
                    jSONObject.put("url_list", new JSONArray(this.mUrlList));
                } catch (Exception unused) {
                }
            }
            return jSONObject;
        } catch (Exception unused2) {
            return null;
        }
    }

    public void setExtraKey(String str) {
        this.mExtraKey = str;
    }

    public static ImageInfo fromJsonStr(String str) {
        return fromJsonStr(str, true);
    }

    public static boolean isHttpUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    public static JSONArray toJsonArray(List<ImageInfo> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (ImageInfo jsonObj : list) {
            JSONObject jsonObj2 = jsonObj.toJsonObj();
            if (jsonObj2 != null) {
                jSONArray.put(jsonObj2);
            }
        }
        return jSONArray;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageInfo imageInfo = (ImageInfo) obj;
        if (this.mWidth != imageInfo.mWidth || this.mHeight != imageInfo.mHeight || this.mIsGif != imageInfo.mIsGif || this.mDownloaded != imageInfo.mDownloaded || this.mIsVideo != imageInfo.mIsVideo || this.mFixedDisplaySize != imageInfo.mFixedDisplaySize) {
            return false;
        }
        if (this.mUri == null ? imageInfo.mUri != null : !this.mUri.equals(imageInfo.mUri)) {
            return false;
        }
        if (this.mOpenUrl == null ? imageInfo.mOpenUrl != null : !this.mOpenUrl.equals(imageInfo.mOpenUrl)) {
            return false;
        }
        if (this.mUrlList == null ? imageInfo.mUrlList != null : !this.mUrlList.equals(imageInfo.mUrlList)) {
            return false;
        }
        if (this.mExtraKey == null ? imageInfo.mExtraKey != null : !this.mExtraKey.equals(imageInfo.mExtraKey)) {
            return false;
        }
        if (this.mKey == null ? imageInfo.mKey != null : !this.mKey.equals(imageInfo.mKey)) {
            return false;
        }
        return true;
    }

    public ImageInfo(String str, String str2) {
        this(str, str2, 0, 0, false);
    }

    public static ImageInfo fromJsonStr(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return fromJson(new JSONObject(str), z);
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<ImageInfo> parseImageList(JSONArray jSONArray, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            ImageInfo fromJson = fromJson(jSONArray.getJSONObject(i), z);
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        return arrayList;
    }

    public static String getUrlFromImageInfo(ImageInfo imageInfo, boolean z) {
        String str;
        String str2 = null;
        if (imageInfo == null) {
            return null;
        }
        if (z) {
            str = imageInfo.mUri;
        } else {
            str = null;
        }
        List extractImageUrlList = extractImageUrlList(str, imageInfo.mUrlList);
        if (extractImageUrlList != null && extractImageUrlList.size() > 0) {
            str2 = ((C19601j) extractImageUrlList.get(0)).f53035a;
        }
        return str2;
    }

    public static ArrayList<ImageInfo> optImageList(JSONArray jSONArray, boolean z) {
        ArrayList<ImageInfo> arrayList = null;
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                ImageInfo fromJson = fromJson(optJSONObject, z);
                if (fromJson != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fromJson);
                }
            }
        }
        return arrayList;
    }

    public static ImageInfo fromJson(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("uri");
        String optString2 = jSONObject.optString("url_list");
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        int optInt3 = jSONObject.optInt("r_width", -1);
        int optInt4 = jSONObject.optInt("r_height", -1);
        if (optInt3 != -1) {
            optInt = optInt3;
        }
        if (optInt4 != -1) {
            optInt2 = optInt4;
        }
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        if (z && (optInt <= 0 || optInt2 <= 0)) {
            return null;
        }
        ImageInfo imageInfo = new ImageInfo(optString, optString2, optInt, optInt2);
        imageInfo.mOpenUrl = jSONObject.optString(C22912d.f60642b, null);
        return imageInfo;
    }

    public static List<C19601j> extractImageUrlList(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                int length = jSONArray.length();
                if (length > 3) {
                    length = 3;
                }
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("url");
                    if (!TextUtils.isEmpty(string)) {
                        C19601j jVar = new C19601j(string);
                        arrayList.add(jVar);
                        JSONObject optJSONObject = jSONObject.optJSONObject("header");
                        if (optJSONObject != null) {
                            Iterator keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                String str3 = (String) keys.next();
                                String string2 = optJSONObject.getString(str3);
                                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(string2)) {
                                    jVar.f53036b.add(new C19565e(str3, string2));
                                }
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        if (arrayList.isEmpty() && !TextUtils.isEmpty(str) && isHttpUrl(str.toLowerCase())) {
            arrayList.add(new C19601j(str));
        }
        return arrayList;
    }

    public static ArrayList<ImageInfo> optImageList(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null || str == null || str.length() == 0 || !jSONObject.has(str)) {
            return null;
        }
        return optImageList(jSONObject.optJSONArray(str), z);
    }

    public ImageInfo(String str, String str2, int i, int i2) {
        this(str, str2, i, i2, false);
    }

    public ImageInfo(String str, String str2, int i, int i2, boolean z) {
        this.mUri = str;
        this.mUrlList = str2;
        this.mKey = C6306c.m19561a(this.mUri);
        this.mWidth = i;
        this.mHeight = i2;
        if (this.mWidth > 0 && this.mHeight > 0) {
            this.mFixedDisplaySize = z;
        }
    }
}
