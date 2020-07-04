package com.p280ss.avframework.livestreamv2.interact.controller;

import com.p280ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.p280ss.avframework.livestreamv2.interact.model.Config;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClientFactory;

/* renamed from: com.ss.avframework.livestreamv2.interact.controller.GuestController */
public class GuestController extends BaseController {
    public GuestController(Config config, VideoClientFactory videoClientFactory) {
        this(config, videoClientFactory, null);
    }

    public GuestController(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory) {
        super(config, videoClientFactory, audioClientFactory);
    }
}
