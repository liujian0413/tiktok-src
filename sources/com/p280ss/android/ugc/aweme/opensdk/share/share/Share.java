package com.p280ss.android.ugc.aweme.opensdk.share.share;

import android.os.Bundle;
import com.p280ss.android.ugc.aweme.opensdk.share.base.DYBaseRequest;
import com.p280ss.android.ugc.aweme.opensdk.share.base.DYBaseResp;
import com.p280ss.android.ugc.aweme.opensdk.share.base.DYMediaContent;
import com.p280ss.android.ugc.aweme.opensdk.share.base.DYMediaContent.C34681a;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.share.Share */
public final class Share {

    /* renamed from: com.ss.android.ugc.aweme.opensdk.share.share.Share$Request */
    public static class Request extends DYBaseRequest {
        public String mHashTag;
        public DYMediaContent mMediaContent;
        public int mTargetSceneType;

        public Request() {
        }

        public int getType() {
            return 3;
        }

        public boolean checkArgs() {
            if (this.mMediaContent == null) {
                return false;
            }
            return this.mMediaContent.checkArgs();
        }

        public Request(Bundle bundle) {
            fromBundle(bundle);
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.mTargetSceneType = bundle.getInt("_aweme_open_sdk_params_target_landpage_scene", 0);
            this.mHashTag = bundle.getString(" ", "");
            this.mMediaContent = C34681a.m111979a(bundle);
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putAll(C34681a.m111978a(this.mMediaContent));
            bundle.putInt("_aweme_open_sdk_params_target_landpage_scene", this.mTargetSceneType);
            bundle.putString(" ", this.mHashTag);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.opensdk.share.share.Share$Response */
    public static class Response extends DYBaseResp {
        public String state;
        public int subErrorCode;

        public Response() {
        }

        public int getType() {
            return 4;
        }

        public Response(Bundle bundle) {
            fromBundle(bundle);
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.state = bundle.getString("_aweme_open_sdk_params_state");
            this.subErrorCode = bundle.getInt("_aweme_open_sdk_params_sub_error_code");
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_aweme_open_sdk_params_state", this.state);
            bundle.putInt("_aweme_open_sdk_params_sub_error_code", this.subErrorCode);
        }
    }
}
