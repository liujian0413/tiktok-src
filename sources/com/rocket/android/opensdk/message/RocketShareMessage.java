package com.rocket.android.opensdk.message;

import android.os.Bundle;

public class RocketShareMessage {

    public static class Req extends BaseReq {
        public RocketMediaContent mMediaContent;
        public int mScene;

        public Req() {
        }

        public int getType() {
            return 1;
        }

        public final boolean checkArgs() {
            if (this.mMediaContent == null) {
                return false;
            }
            return this.mMediaContent.checkArgs();
        }

        public Req(Bundle bundle) {
            fromBundle(bundle);
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.mMediaContent = MediaContentBuilder.fromBundle(bundle);
            this.mScene = bundle.getInt("ROCKET_EXTRA_REQ_SCENE");
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putAll(MediaContentBuilder.toBundle(this.mMediaContent));
            bundle.putInt("ROCKET_EXTRA_REQ_SCENE", this.mScene);
        }
    }

    public static class Resp extends BaseResp {
        public Resp() {
        }

        /* access modifiers changed from: 0000 */
        public final boolean checkArgs() {
            return true;
        }

        public int getType() {
            return 1;
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
        }

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }
    }
}
