package com.p280ss.android.ugc.aweme.opensdk.share.base;

import android.os.Bundle;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.base.DYMediaContent */
public class DYMediaContent {
    private static final String TAG = "AWEME.SDK.DYMediaContent";
    public C34682a mMediaObject;

    /* renamed from: com.ss.android.ugc.aweme.opensdk.share.base.DYMediaContent$a */
    public static class C34681a {
        /* renamed from: a */
        public static Bundle m111978a(DYMediaContent dYMediaContent) {
            Bundle bundle = new Bundle();
            if (dYMediaContent.mMediaObject != null) {
                bundle.putString("_dyobject_identifier_", dYMediaContent.mMediaObject.getClass().getName());
                dYMediaContent.mMediaObject.serialize(bundle);
            }
            return bundle;
        }

        /* renamed from: a */
        public static DYMediaContent m111979a(Bundle bundle) {
            DYMediaContent dYMediaContent = new DYMediaContent();
            String string = bundle.getString("_dyobject_identifier_");
            if (string == null || string.length() <= 0) {
                return dYMediaContent;
            }
            try {
                dYMediaContent.mMediaObject = (C34682a) Class.forName(string).newInstance();
                dYMediaContent.mMediaObject.unserialize(bundle);
                return dYMediaContent;
            } catch (Exception unused) {
                return dYMediaContent;
            }
        }
    }

    public DYMediaContent() {
    }

    public final boolean checkArgs() {
        return this.mMediaObject.checkArgs();
    }

    public final int getType() {
        if (this.mMediaObject == null) {
            return 0;
        }
        return this.mMediaObject.type();
    }

    public DYMediaContent(C34682a aVar) {
        this.mMediaObject = aVar;
    }
}
