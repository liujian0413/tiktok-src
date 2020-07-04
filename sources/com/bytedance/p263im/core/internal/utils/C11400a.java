package com.bytedance.p263im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.p263im.core.model.Attachment;
import com.bytedance.p263im.core.model.Message;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.internal.utils.a */
public final class C11400a {
    /* renamed from: a */
    public static Message m33562a(Message message) {
        JSONObject jSONObject;
        if (message == null || message.getAttachments() == null || message.getAttachments().isEmpty()) {
            return message;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Attachment attachment : message.getAttachments()) {
            if (!TextUtils.isEmpty(attachment.getDisplayType())) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("length", attachment.getLength());
                    jSONObject3.put("md5", attachment.getHash());
                    jSONObject3.put("mime", attachment.getMimeType());
                    jSONObject3.put("remoteURL", attachment.getRemoteUrl());
                    jSONObject3.put("displayType", attachment.getDisplayType());
                    jSONObject3.put("type", attachment.getType());
                    jSONObject3.put("ext", C11401b.m33580b(attachment.getExt()));
                    jSONObject2.put(attachment.getDisplayType(), jSONObject3);
                } catch (JSONException unused) {
                }
            }
        }
        try {
            if (TextUtils.isEmpty(message.getContent())) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(message.getContent());
            }
            jSONObject.put("__files", jSONObject2);
            message.setContent(jSONObject.toString());
        } catch (JSONException unused2) {
        }
        return message;
    }

    /* renamed from: b */
    public static Message m33563b(Message message) {
        if (TextUtils.isEmpty(message.getContent())) {
            return message;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject optJSONObject = new JSONObject(message.getContent()).optJSONObject("__files");
            if (optJSONObject == null) {
                return message;
            }
            Iterator keys = optJSONObject.keys();
            int i = 0;
            while (keys.hasNext()) {
                String str = (String) keys.next();
                JSONObject jSONObject = optJSONObject.getJSONObject(str);
                Attachment attachment = new Attachment();
                attachment.setMsgUuid(message.getUuid());
                attachment.setDisplayType(str);
                attachment.setLength(jSONObject.optLong("length"));
                attachment.setHash(jSONObject.optString("md5"));
                attachment.setMimeType(jSONObject.optString("mime"));
                attachment.setRemoteUrl(jSONObject.optString("remoteURL"));
                attachment.setType(jSONObject.optString("type"));
                attachment.setIndex(i);
                attachment.setStatus(1);
                attachment.setExt(C11401b.m33578a(optJSONObject.optJSONObject("ext")));
                arrayList.add(attachment);
                i++;
            }
            if (!arrayList.isEmpty()) {
                message.setAttachments(arrayList);
            }
            return message;
        } catch (JSONException unused) {
        }
    }
}
