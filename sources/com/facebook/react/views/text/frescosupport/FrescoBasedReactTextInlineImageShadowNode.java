package com.facebook.react.views.text.frescosupport;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.ReactTextInlineImageShadowNode;
import com.facebook.react.views.text.TextInlineImageSpan;
import java.util.Locale;

public class FrescoBasedReactTextInlineImageShadowNode extends ReactTextInlineImageShadowNode {
    private final Object mCallerContext;
    private final AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    private ReadableMap mHeaders;
    private float mHeight = 1.0E21f;
    private Uri mUri;
    private float mWidth = 1.0E21f;

    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public AbstractDraweeControllerBuilder getDraweeControllerBuilder() {
        return this.mDraweeControllerBuilder;
    }

    public ReadableMap getHeaders() {
        return this.mHeaders;
    }

    public Uri getUri() {
        return this.mUri;
    }

    public boolean isVirtual() {
        return true;
    }

    public TextInlineImageSpan buildInlineImageSpan() {
        FrescoBasedReactTextInlineImageSpan frescoBasedReactTextInlineImageSpan = new FrescoBasedReactTextInlineImageSpan(getThemedContext().getResources(), (int) Math.ceil((double) this.mHeight), (int) Math.ceil((double) this.mWidth), getUri(), getHeaders(), getDraweeControllerBuilder(), getCallerContext());
        return frescoBasedReactTextInlineImageSpan;
    }

    public FrescoBasedReactTextInlineImageShadowNode mutableCopy() {
        return new FrescoBasedReactTextInlineImageShadowNode(this);
    }

    @ReactProp(name = "headers")
    public void setHeaders(ReadableMap readableMap) {
        this.mHeaders = readableMap;
    }

    public void setHeight(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.mHeight = (float) dynamic.asDouble();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based height");
    }

    public void setWidth(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.mWidth = (float) dynamic.asDouble();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based width");
    }

    private FrescoBasedReactTextInlineImageShadowNode(FrescoBasedReactTextInlineImageShadowNode frescoBasedReactTextInlineImageShadowNode) {
        super(frescoBasedReactTextInlineImageShadowNode);
        this.mHeaders = frescoBasedReactTextInlineImageShadowNode.mHeaders;
        this.mWidth = frescoBasedReactTextInlineImageShadowNode.mWidth;
        this.mHeight = frescoBasedReactTextInlineImageShadowNode.mHeight;
        this.mDraweeControllerBuilder = frescoBasedReactTextInlineImageShadowNode.mDraweeControllerBuilder;
        this.mCallerContext = frescoBasedReactTextInlineImageShadowNode.mCallerContext;
        this.mUri = frescoBasedReactTextInlineImageShadowNode.mUri;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r1.getScheme() == null) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "src")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSource(com.facebook.react.bridge.ReadableArray r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0016
            int r1 = r4.size()
            if (r1 != 0) goto L_0x000a
            goto L_0x0016
        L_0x000a:
            r1 = 0
            com.facebook.react.bridge.ReadableMap r4 = r4.getMap(r1)
            java.lang.String r1 = "uri"
            java.lang.String r4 = r4.getString(r1)
            goto L_0x0017
        L_0x0016:
            r4 = r0
        L_0x0017:
            if (r4 == 0) goto L_0x002f
            android.net.Uri r1 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x0025 }
            java.lang.String r2 = r1.getScheme()     // Catch:{ Exception -> 0x0024 }
            if (r2 != 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = r1
        L_0x0025:
            if (r0 != 0) goto L_0x002f
            com.facebook.react.uimanager.ThemedReactContext r0 = r3.getThemedContext()
            android.net.Uri r0 = getResourceDrawableUri(r0, r4)
        L_0x002f:
            android.net.Uri r4 = r3.mUri
            if (r0 == r4) goto L_0x0036
            r3.markUpdated()
        L_0x0036:
            r3.mUri = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageShadowNode.setSource(com.facebook.react.bridge.ReadableArray):void");
    }

    public FrescoBasedReactTextInlineImageShadowNode(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mCallerContext = obj;
    }

    private static Uri getResourceDrawableUri(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(str.toLowerCase(Locale.getDefault()).replace("-", "_"), "drawable", context.getPackageName()))).build();
    }
}
