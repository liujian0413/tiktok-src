package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.C13967z;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio;
import com.facebook.share.model.ShareMessengerGenericTemplateElement;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.i */
public final class C14529i {

    /* renamed from: a */
    public static final Pattern f37551a = Pattern.compile("^(.+)\\.(facebook\\.com)$");

    /* renamed from: com.facebook.share.internal.i$1 */
    static /* synthetic */ class C145301 {

        /* renamed from: b */
        static final /* synthetic */ int[] f37553b = new int[ImageAspectRatio.values().length];

        /* renamed from: c */
        static final /* synthetic */ int[] f37554c = new int[MediaType.values().length];

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003a */
        static {
            /*
                com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType[] r0 = com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37554c = r0
                r0 = 1
                int[] r1 = f37554c     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType r2 = com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType.VIDEO     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio[] r1 = com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f37553b = r1
                int[] r1 = f37553b     // Catch:{ NoSuchFieldError -> 0x0027 }
                com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio r2 = com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio.SQUARE     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio[] r1 = com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f37552a = r1
                int[] r1 = f37552a     // Catch:{ NoSuchFieldError -> 0x003a }
                com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio r2 = com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio.WebviewHeightRatioCompact     // Catch:{ NoSuchFieldError -> 0x003a }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003a }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x003a }
            L_0x003a:
                int[] r0 = f37552a     // Catch:{ NoSuchFieldError -> 0x0045 }
                com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio r1 = com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio.WebviewHeightRatioTall     // Catch:{ NoSuchFieldError -> 0x0045 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0045 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0045 }
            L_0x0045:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C14529i.C145301.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m41937a(Bundle bundle, ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) throws JSONException {
        m41938a(bundle, shareMessengerGenericTemplateContent.f37622c);
        C13967z.m41246a(bundle, "MESSENGER_PLATFORM_CONTENT", (Object) m41931a(shareMessengerGenericTemplateContent));
    }

    /* renamed from: a */
    public static void m41940a(Bundle bundle, ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        m41945b(bundle, shareMessengerOpenGraphMusicTemplateContent);
        C13967z.m41246a(bundle, "MESSENGER_PLATFORM_CONTENT", (Object) m41934a(shareMessengerOpenGraphMusicTemplateContent));
    }

    /* renamed from: a */
    public static void m41939a(Bundle bundle, ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        m41944b(bundle, shareMessengerMediaTemplateContent);
        C13967z.m41246a(bundle, "MESSENGER_PLATFORM_CONTENT", (Object) m41933a(shareMessengerMediaTemplateContent));
    }

    /* renamed from: a */
    private static void m41938a(Bundle bundle, ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement) throws JSONException {
        if (shareMessengerGenericTemplateElement.f37627e != null) {
            m41936a(bundle, shareMessengerGenericTemplateElement.f37627e, false);
        } else if (shareMessengerGenericTemplateElement.f37626d != null) {
            m41936a(bundle, shareMessengerGenericTemplateElement.f37626d, true);
        }
        C13967z.m41236a(bundle, "IMAGE", shareMessengerGenericTemplateElement.f37625c);
        C13967z.m41237a(bundle, "PREVIEW_TYPE", "DEFAULT");
        C13967z.m41237a(bundle, "TITLE", shareMessengerGenericTemplateElement.f37623a);
        C13967z.m41237a(bundle, "SUBTITLE", shareMessengerGenericTemplateElement.f37624b);
    }

    /* renamed from: a */
    private static void m41936a(Bundle bundle, ShareMessengerActionButton shareMessengerActionButton, boolean z) throws JSONException {
        if (shareMessengerActionButton != null && (shareMessengerActionButton instanceof ShareMessengerURLActionButton)) {
            m41941a(bundle, (ShareMessengerURLActionButton) shareMessengerActionButton, z);
        }
    }

    /* renamed from: a */
    private static void m41941a(Bundle bundle, ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) throws JSONException {
        String str;
        if (z) {
            str = C13967z.m41220a(shareMessengerURLActionButton.f37634b);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(shareMessengerURLActionButton.f37619a);
            sb.append(" - ");
            sb.append(C13967z.m41220a(shareMessengerURLActionButton.f37634b));
            str = sb.toString();
        }
        C13967z.m41237a(bundle, "TARGET_DISPLAY", str);
        C13967z.m41236a(bundle, "ITEM_URL", shareMessengerURLActionButton.f37634b);
    }

    /* renamed from: a */
    private static JSONObject m41934a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", "open_graph").put("elements", new JSONArray().put(m41943b(shareMessengerOpenGraphMusicTemplateContent)))));
    }

    /* renamed from: a */
    private static JSONObject m41933a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", "media").put("elements", new JSONArray().put(m41942b(shareMessengerMediaTemplateContent)))));
    }

    /* renamed from: a */
    private static JSONObject m41935a(ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) throws JSONException {
        String str;
        JSONObject put = new JSONObject().put("type", "web_url");
        String str2 = "title";
        if (z) {
            str = null;
        } else {
            str = shareMessengerURLActionButton.f37619a;
        }
        return put.put(str2, str).put("url", C13967z.m41220a(shareMessengerURLActionButton.f37634b)).put("webview_height_ratio", m41927a(shareMessengerURLActionButton.f37638f)).put("messenger_extensions", shareMessengerURLActionButton.f37636d).put("fallback_url", C13967z.m41220a(shareMessengerURLActionButton.f37635c)).put("webview_share_button", m41928a(shareMessengerURLActionButton));
    }

    /* renamed from: a */
    private static JSONObject m41929a(ShareMessengerActionButton shareMessengerActionButton) throws JSONException {
        return m41930a(shareMessengerActionButton, false);
    }

    /* renamed from: a */
    private static String m41928a(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (shareMessengerURLActionButton.f37637e) {
            return "hide";
        }
        return null;
    }

    /* renamed from: a */
    private static String m41924a(Uri uri) {
        String host = uri.getHost();
        if (C13967z.m41249a(host) || !f37551a.matcher(host).matches()) {
            return "IMAGE";
        }
        return "uri";
    }

    /* renamed from: a */
    private static String m41925a(ImageAspectRatio imageAspectRatio) {
        if (imageAspectRatio == null) {
            return "horizontal";
        }
        if (C145301.f37553b[imageAspectRatio.ordinal()] != 1) {
            return "horizontal";
        }
        return "square";
    }

    /* renamed from: b */
    private static JSONObject m41942b(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        JSONObject put = new JSONObject().put("attachment_id", shareMessengerMediaTemplateContent.f37629b).put("url", C13967z.m41220a(shareMessengerMediaTemplateContent.f37630c)).put("media_type", m41926a(shareMessengerMediaTemplateContent.f37628a));
        if (shareMessengerMediaTemplateContent.f37631d != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(m41929a(shareMessengerMediaTemplateContent.f37631d));
            put.put("buttons", jSONArray);
        }
        return put;
    }

    /* renamed from: a */
    private static String m41926a(MediaType mediaType) {
        if (mediaType == null) {
            return "image";
        }
        if (C145301.f37554c[mediaType.ordinal()] != 1) {
            return "image";
        }
        return "video";
    }

    /* renamed from: b */
    private static JSONObject m41943b(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        JSONObject put = new JSONObject().put("url", C13967z.m41220a(shareMessengerOpenGraphMusicTemplateContent.f37632a));
        if (shareMessengerOpenGraphMusicTemplateContent.f37633b != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(m41929a(shareMessengerOpenGraphMusicTemplateContent.f37633b));
            put.put("buttons", jSONArray);
        }
        return put;
    }

    /* renamed from: a */
    private static String m41927a(WebviewHeightRatio webviewHeightRatio) {
        if (webviewHeightRatio == null) {
            return "full";
        }
        switch (webviewHeightRatio) {
            case WebviewHeightRatioCompact:
                return "compact";
            case WebviewHeightRatioTall:
                return "tall";
            default:
                return "full";
        }
    }

    /* renamed from: a */
    private static JSONObject m41931a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) throws JSONException {
        return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", "generic").put("sharable", shareMessengerGenericTemplateContent.f37620a).put("image_aspect_ratio", m41925a(shareMessengerGenericTemplateContent.f37621b)).put("elements", new JSONArray().put(m41932a(shareMessengerGenericTemplateContent.f37622c)))));
    }

    /* renamed from: a */
    private static JSONObject m41932a(ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement) throws JSONException {
        JSONObject put = new JSONObject().put("title", shareMessengerGenericTemplateElement.f37623a).put("subtitle", shareMessengerGenericTemplateElement.f37624b).put("image_url", C13967z.m41220a(shareMessengerGenericTemplateElement.f37625c));
        if (shareMessengerGenericTemplateElement.f37627e != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(m41929a(shareMessengerGenericTemplateElement.f37627e));
            put.put("buttons", jSONArray);
        }
        if (shareMessengerGenericTemplateElement.f37626d != null) {
            put.put("default_action", m41930a(shareMessengerGenericTemplateElement.f37626d, true));
        }
        return put;
    }

    /* renamed from: b */
    private static void m41945b(Bundle bundle, ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        m41936a(bundle, shareMessengerOpenGraphMusicTemplateContent.f37633b, false);
        C13967z.m41237a(bundle, "PREVIEW_TYPE", "OPEN_GRAPH");
        C13967z.m41236a(bundle, "OPEN_GRAPH_URL", shareMessengerOpenGraphMusicTemplateContent.f37632a);
    }

    /* renamed from: b */
    private static void m41944b(Bundle bundle, ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        m41936a(bundle, shareMessengerMediaTemplateContent.f37631d, false);
        C13967z.m41237a(bundle, "PREVIEW_TYPE", "DEFAULT");
        C13967z.m41237a(bundle, "ATTACHMENT_ID", shareMessengerMediaTemplateContent.f37629b);
        if (shareMessengerMediaTemplateContent.f37630c != null) {
            C13967z.m41236a(bundle, m41924a(shareMessengerMediaTemplateContent.f37630c), shareMessengerMediaTemplateContent.f37630c);
        }
        C13967z.m41237a(bundle, "type", m41926a(shareMessengerMediaTemplateContent.f37628a));
    }

    /* renamed from: a */
    private static JSONObject m41930a(ShareMessengerActionButton shareMessengerActionButton, boolean z) throws JSONException {
        if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
            return m41935a((ShareMessengerURLActionButton) shareMessengerActionButton, z);
        }
        return null;
    }
}
