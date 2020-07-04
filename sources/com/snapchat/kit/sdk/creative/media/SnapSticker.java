package com.snapchat.kit.sdk.creative.media;

import android.net.Uri;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public class SnapSticker {

    /* renamed from: a */
    private final File f50520a;

    /* renamed from: b */
    private float f50521b;

    /* renamed from: c */
    private float f50522c = 0.5f;

    /* renamed from: d */
    private float f50523d = 0.5f;

    /* renamed from: e */
    private float f50524e = 200.0f;

    /* renamed from: f */
    private float f50525f = 200.0f;

    /* renamed from: g */
    private boolean f50526g;

    public File getStickerFile() {
        return this.f50520a;
    }

    public void setHeight(float f) {
        this.f50525f = f;
    }

    public void setPosX(float f) {
        this.f50522c = f;
    }

    public void setPosY(float f) {
        this.f50523d = f;
    }

    public void setRotationDegreesClockwise(float f) {
        this.f50521b = f;
    }

    public void setWidth(float f) {
        this.f50524e = f;
    }

    SnapSticker(File file) {
        this.f50520a = file;
    }

    public JSONObject getJsonForm(Uri uri) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uri", uri);
            jSONObject.put("posX", (double) this.f50522c);
            jSONObject.put("posY", (double) this.f50523d);
            jSONObject.put("rotation", (double) this.f50521b);
            jSONObject.put("width", (double) this.f50524e);
            jSONObject.put("height", (double) this.f50525f);
            jSONObject.put("isAnimated", this.f50526g);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
