package com.facebook.ads;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

public class AudienceNetworkActivity extends Activity {
    private AudienceNetworkActivityApi mAudienceNetworkActivityApi;
    private final AudienceNetworkActivityApi mAudienceNetworkActivityParentApi = new AudienceNetworkActivityApi() {
        public final void finish() {
            AudienceNetworkActivity.super.finish();
        }

        public final void onBackPressed() {
            AudienceNetworkActivity.super.onBackPressed();
        }

        public final void onDestroy() {
            AudienceNetworkActivity.super.onDestroy();
        }

        public final void onPause() {
            AudienceNetworkActivity.super.onPause();
        }

        public final void onResume() {
            AudienceNetworkActivity.super.onResume();
        }

        public final void onStart() {
            AudienceNetworkActivity.super.onStart();
        }

        public final void onConfigurationChanged(Configuration configuration) {
            AudienceNetworkActivity.super.onConfigurationChanged(configuration);
        }

        public final void onCreate(Bundle bundle) {
            AudienceNetworkActivity.super.onCreate(bundle);
        }

        public final void onSaveInstanceState(Bundle bundle) {
            AudienceNetworkActivity.super.onSaveInstanceState(bundle);
        }

        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return AudienceNetworkActivity.super.onTouchEvent(motionEvent);
        }
    };

    public void finish() {
        this.mAudienceNetworkActivityApi.finish();
    }

    public void onBackPressed() {
        this.mAudienceNetworkActivityApi.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.mAudienceNetworkActivityApi.onDestroy();
    }

    public void onPause() {
        this.mAudienceNetworkActivityApi.onPause();
    }

    public void onResume() {
        this.mAudienceNetworkActivityApi.onResume();
    }

    public void onStart() {
        this.mAudienceNetworkActivityApi.onStart();
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mAudienceNetworkActivityApi.onConfigurationChanged(configuration);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.mAudienceNetworkActivityApi.onSaveInstanceState(bundle);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mAudienceNetworkActivityApi.onTouchEvent(motionEvent);
    }

    public void onCreate(Bundle bundle) {
        this.mAudienceNetworkActivityApi = DynamicLoaderFactory.makeLoader(this).createAudienceNetworkActivity(this, this.mAudienceNetworkActivityParentApi);
        this.mAudienceNetworkActivityApi.onCreate(bundle);
    }
}
