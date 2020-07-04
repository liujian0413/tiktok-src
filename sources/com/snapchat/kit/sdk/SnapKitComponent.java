package com.snapchat.kit.sdk;

import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;

@SnapConnectScope
public interface SnapKitComponent extends SnapKitProvidingComponent {
    void inject(SnapKitActivity snapKitActivity);
}
