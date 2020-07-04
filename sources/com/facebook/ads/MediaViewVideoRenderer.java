package com.facebook.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.facebook.ads.internal.api.AdComponentView;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

public abstract class MediaViewVideoRenderer extends AdComponentView {
    private MediaViewVideoRendererApi mMediaViewVideoRendererApi;
    protected NativeAd nativeAd;
    protected VideoAutoplayBehavior videoAutoplayBehavior;

    public void addView(View view) {
    }

    public void addView(View view, int i) {
    }

    public void addView(View view, int i, int i2) {
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
    }

    public void addView(View view, LayoutParams layoutParams) {
    }

    public void destroy() {
    }

    public MediaViewVideoRendererApi getMediaViewVideoRendererApi() {
        return this.mMediaViewVideoRendererApi;
    }

    public void onCompleted() {
    }

    public void onError() {
    }

    public void onPaused() {
    }

    public void onPlayed() {
    }

    public void onPrepared() {
    }

    public void onSeek() {
    }

    public void onSeekDisengaged() {
    }

    public void onSeekEngaged() {
    }

    public void onVolumeChanged() {
    }

    /* access modifiers changed from: 0000 */
    public final void setListener(Object obj) {
    }

    public boolean shouldAllowBackgroundPlayback() {
        return false;
    }

    public final void engageSeek() {
        this.mMediaViewVideoRendererApi.engageSeek();
    }

    public final int getCurrentTimeMs() {
        return this.mMediaViewVideoRendererApi.getCurrentTimeMs();
    }

    public final int getDuration() {
        return this.mMediaViewVideoRendererApi.getDuration();
    }

    /* access modifiers changed from: 0000 */
    public final View getVideoView() {
        return this.mMediaViewVideoRendererApi.getVideoView();
    }

    public final float getVolume() {
        return this.mMediaViewVideoRendererApi.getVolume();
    }

    public final boolean shouldAutoplay() {
        return this.mMediaViewVideoRendererApi.shouldAutoplay();
    }

    public void unsetNativeAd() {
        this.nativeAd = null;
        this.videoAutoplayBehavior = VideoAutoplayBehavior.DEFAULT;
    }

    public final void disengageSeek(VideoStartReason videoStartReason) {
        this.mMediaViewVideoRendererApi.disengageSeek(videoStartReason);
    }

    public final void pause(boolean z) {
        this.mMediaViewVideoRendererApi.pause(z);
    }

    public final void play(VideoStartReason videoStartReason) {
        this.mMediaViewVideoRendererApi.play(videoStartReason);
    }

    public final void seekTo(int i) {
        this.mMediaViewVideoRendererApi.seekTo(i);
    }

    public final void setVolume(float f) {
        this.mMediaViewVideoRendererApi.setVolume(f);
    }

    public MediaViewVideoRenderer(Context context) {
        super(context);
        initialize(new AdViewConstructorParams(context));
    }

    public void setNativeAd(NativeAd nativeAd2) {
        this.nativeAd = nativeAd2;
        this.videoAutoplayBehavior = nativeAd2.getVideoAutoplayBehavior();
    }

    private void initialize(AdViewConstructorParams adViewConstructorParams) {
        this.mMediaViewVideoRendererApi = DynamicLoaderFactory.makeLoader(adViewConstructorParams.getContext()).createMediaViewVideoRendererApi();
        attachAdComponentViewApi(this.mMediaViewVideoRendererApi);
        this.mMediaViewVideoRendererApi.initialize(adViewConstructorParams, this);
    }

    public MediaViewVideoRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(new AdViewConstructorParams(context, attributeSet));
    }

    public MediaViewVideoRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(new AdViewConstructorParams(context, attributeSet, i));
    }

    public MediaViewVideoRenderer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initialize(new AdViewConstructorParams(context, attributeSet, i, i2));
    }
}
