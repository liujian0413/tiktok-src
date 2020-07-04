package com.p280ss.avframework.livestreamv2.interact.controller;

import android.text.TextUtils;
import android.widget.FrameLayout.LayoutParams;
import com.p280ss.avframework.livestreamv2.interact.model.Region;
import com.p280ss.avframework.livestreamv2.interact.model.SEI;
import com.p280ss.avframework.livestreamv2.interact.utils.LogUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.interact.controller.SEIHelper */
public class SEIHelper {
    private Callback mCallback;
    private long mSeiTimestamp;

    /* renamed from: com.ss.avframework.livestreamv2.interact.controller.SEIHelper$Callback */
    public interface Callback {
        boolean isVersionSupported(int i);

        void onSeiUpdated(SEI sei);

        void onTalkStateUpdated(String[] strArr, boolean[] zArr);
    }

    public SEIHelper(Callback callback) {
        this.mCallback = callback;
    }

    public void updateSei(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("info") && jSONObject.has("source") && TextUtils.equals(jSONObject.optString("source"), "zego")) {
                    jSONObject = (JSONObject) jSONObject.get("info");
                }
                if (jSONObject.has("app_data")) {
                    SEI createSeiFromCommon = createSeiFromCommon(new JSONObject(jSONObject.getString("app_data").replaceAll("\\\\", "")));
                    if (createSeiFromCommon != null) {
                        this.mCallback.onSeiUpdated(createSeiFromCommon);
                    }
                }
            } catch (JSONException e) {
                LogUtil.m143692e(e.toString());
            }
        }
    }

    private SEI createSeiFromCommon(JSONObject jSONObject) throws JSONException {
        long optLong = jSONObject.optLong("timestamp");
        if (optLong == this.mSeiTimestamp || !jSONObject.has("ver")) {
            return null;
        }
        int optInt = jSONObject.optInt("ver");
        if (!this.mCallback.isVersionSupported(optInt)) {
            return null;
        }
        this.mSeiTimestamp = optLong;
        SEI sei = new SEI();
        sei.setTimestamp(optLong);
        sei.setVersion(optInt);
        sei.setVendor(jSONObject.optString("vendor"));
        sei.setChannelName(jSONObject.optString("channel_id"));
        JSONArray jSONArray = new JSONArray(jSONObject.optString("grids"));
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = (JSONObject) jSONArray.opt(i);
            Region size = new Region().mediaType(jSONObject2.optInt("type")).position(jSONObject2.optDouble("x"), jSONObject2.optDouble("y")).size(jSONObject2.optDouble("w"), jSONObject2.optDouble("h"));
            try {
                size.userId(jSONObject2.optLong("account"));
            } catch (Exception unused) {
                size.userId(0);
            }
            if (jSONObject2.has("uid")) {
                size.interactId(jSONObject2.optInt("uid"));
            }
            if (jSONObject2.has("talk")) {
                boolean z = true;
                if (jSONObject2.optInt("talk") != 1) {
                    z = false;
                }
                size.talking(z);
            }
            try {
                size.status(jSONObject2.optInt("stat"));
            } catch (Exception unused2) {
                size.status(0);
            }
            sei.addGrid(size);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("canvas");
        if (optJSONObject != null) {
            sei.setWidth(optJSONObject.optInt("width"));
            sei.setHeight(optJSONObject.optInt("height"));
            sei.setBackground(optJSONObject.optString("background"));
        }
        return sei;
    }

    public static LayoutParams getSeiLayoutParams(int i, int i2, int i3, int i4, Region region) {
        LayoutParams layoutParams = new LayoutParams(0, 0);
        float f = (float) i;
        float f2 = (float) i3;
        float f3 = f / f2;
        float f4 = (float) i2;
        float f5 = (float) i4;
        float f6 = f4 / f5;
        if (f3 <= f6) {
            f3 = f6;
        }
        float f7 = f2 * f3;
        float f8 = f5 * f3;
        float f9 = (f7 - f) / 2.0f;
        float f10 = (f8 - f4) / 2.0f;
        double d = (double) f7;
        double x = region.getX();
        Double.isNaN(d);
        double d2 = (x * d) + 0.5d;
        double d3 = (double) f9;
        Double.isNaN(d3);
        int i5 = (int) (d2 - d3);
        double d4 = (double) f8;
        double y = region.getY();
        Double.isNaN(d4);
        double d5 = (y * d4) + 0.5d;
        double d6 = (double) f10;
        Double.isNaN(d6);
        int i6 = (int) (d5 - d6);
        double width = region.getWidth();
        Double.isNaN(d);
        int i7 = (int) ((d * width) + 0.5d);
        double height = region.getHeight();
        Double.isNaN(d4);
        int i8 = (int) ((d4 * height) + 0.5d);
        layoutParams.width = i7;
        layoutParams.height = i8;
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = i6;
        return layoutParams;
    }
}
