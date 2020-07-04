package com.facebook.react.views.imagehelper;

import android.content.Context;
import android.net.Uri;
import com.facebook.infer.p728a.C13854a;

public class ImageSource {
    private boolean isResource;
    private double mSize;
    private String mSource;
    private Uri mUri;

    public double getSize() {
        return this.mSize;
    }

    public String getSource() {
        return this.mSource;
    }

    public boolean isResource() {
        return this.isResource;
    }

    public Uri getUri() {
        return (Uri) C13854a.m40916b(this.mUri);
    }

    private Uri computeLocalUri(Context context) {
        this.isResource = true;
        return ResourceDrawableIdHelper.getInstance().getResourceDrawableUri(context, this.mSource);
    }

    private Uri computeUri(Context context) {
        try {
            Uri parse = Uri.parse(this.mSource);
            if (parse.getScheme() == null) {
                parse = computeLocalUri(context);
            }
            return parse;
        } catch (Exception unused) {
            return computeLocalUri(context);
        }
    }

    public ImageSource(Context context, String str) {
        this(context, str, 0.0d, 0.0d);
    }

    public ImageSource(Context context, String str, double d, double d2) {
        this.mSource = str;
        this.mSize = d * d2;
        this.mUri = computeUri(context);
    }
}
