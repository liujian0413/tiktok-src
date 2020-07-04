package com.snapchat.kit.sdk.creative;

import com.snapchat.kit.sdk.creative.api.SnapCreativeKitApi;
import com.snapchat.kit.sdk.creative.dagger.scope.CreativeScope;
import com.snapchat.kit.sdk.creative.media.SnapMediaFactory;

@CreativeScope
public interface CreativeComponent {
    SnapCreativeKitApi getApi();

    SnapMediaFactory getMediaFactory();
}
