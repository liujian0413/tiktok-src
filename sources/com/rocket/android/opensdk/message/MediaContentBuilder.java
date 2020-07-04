package com.rocket.android.opensdk.message;

import android.os.Bundle;

public class MediaContentBuilder {
    public static RocketMediaContent fromBundle(Bundle bundle) {
        RocketMediaContent rocketMediaContent = new RocketMediaContent();
        rocketMediaContent.mTitle = bundle.getString("ROCKET_EXTRA_MESSAGE_TITLE");
        rocketMediaContent.mContent = bundle.getString("ROCKET_EXTRA_MESSAGE_CONTENT");
        rocketMediaContent.mSource = bundle.getString("ROCKET_EXTRA_MESSAGE_SOURCE_FROM");
        rocketMediaContent.mThumbUrl = bundle.getString("ROCKET_EXTRA_MESSAGE_THUMB_URL");
        rocketMediaContent.mThumbData = bundle.getByteArray("ROCKET_EXTRA_MESSAGE_THUMB_DATA");
        String string = bundle.getString("ROCKET_EXTRA_MESSAGE_MEDIA_OBJECT");
        if (string == null || string.length() <= 0) {
            return rocketMediaContent;
        }
        try {
            rocketMediaContent.mMediaObject = (IMediaObject) Class.forName(string).newInstance();
            rocketMediaContent.mMediaObject.unserialize(bundle);
            return rocketMediaContent;
        } catch (Exception unused) {
            return rocketMediaContent;
        }
    }

    public static Bundle toBundle(RocketMediaContent rocketMediaContent) {
        Bundle bundle = new Bundle();
        bundle.putString("ROCKET_EXTRA_MESSAGE_TITLE", rocketMediaContent.mTitle);
        bundle.putString("ROCKET_EXTRA_MESSAGE_CONTENT", rocketMediaContent.mContent);
        bundle.putString("ROCKET_EXTRA_MESSAGE_SOURCE_FROM", rocketMediaContent.mSource);
        bundle.putString("ROCKET_EXTRA_MESSAGE_THUMB_URL", rocketMediaContent.mThumbUrl);
        bundle.putByteArray("ROCKET_EXTRA_MESSAGE_THUMB_DATA", rocketMediaContent.mThumbData);
        if (rocketMediaContent.mMediaObject != null) {
            bundle.putString("ROCKET_EXTRA_MESSAGE_MEDIA_OBJECT", rocketMediaContent.mMediaObject.getClass().getName());
            rocketMediaContent.mMediaObject.serialize(bundle);
        }
        return bundle;
    }
}
