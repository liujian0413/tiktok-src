package com.p280ss.android.ugc.aweme.shortvideo.model;

import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.AVETParameter */
public final class AVETParameter implements Serializable {
    private String contentSource = "shoot";
    private String contentType = "video";
    private String creationId = "";
    private int draftId;
    private int shootMode;
    private String shootWay = "";
    private String storySceneId = "";
    private String storyShootEntrance = "";

    public final String getContentSource() {
        return this.contentSource;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final int getDraftId() {
        return this.draftId;
    }

    public final int getShootMode() {
        return this.shootMode;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final String getStorySceneId() {
        return this.storySceneId;
    }

    public final String getStoryShootEntrance() {
        return this.storyShootEntrance;
    }

    public final void setDraftId(int i) {
        this.draftId = i;
    }

    public final void setShootMode(int i) {
        this.shootMode = i;
    }

    public final void setContentSource(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.contentSource = str;
    }

    public final void setContentType(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.contentType = str;
    }

    public final void setCreationId(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.creationId = str;
    }

    public final void setShootWay(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.shootWay = str;
    }

    public final void setStorySceneId(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.storySceneId = str;
    }

    public final void setStoryShootEntrance(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.storyShootEntrance = str;
    }
}
