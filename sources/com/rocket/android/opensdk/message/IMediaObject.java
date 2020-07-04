package com.rocket.android.opensdk.message;

import android.os.Bundle;

public interface IMediaObject {
    boolean checkArgs();

    void serialize(Bundle bundle);

    int type();

    void unserialize(Bundle bundle);
}
