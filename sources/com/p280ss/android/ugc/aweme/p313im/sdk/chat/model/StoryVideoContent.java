package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.os.Bundle;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Attachment;
import com.bytedance.p263im.core.model.Message;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.EncryptUrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.video.VideoParam;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage.C31821b;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService.CompileResult;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.StoryVideoContent */
public final class StoryVideoContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @C6593c(mo15949a = "check_pics")
    private List<String> checkPics;
    @C6593c(mo15949a = "check_texts")
    private List<String> checkTexts;
    @C6593c(mo15949a = "from_gallery")
    private int fromGallery;
    @C6593c(mo15949a = "height")
    private int height;
    private transient String localCheckPic;
    private transient String localPoster;
    private transient String localVideo;
    @C6593c(mo15949a = "mass_msg")
    private int massMsg;
    @C6593c(mo15949a = "md5")
    private String md5;
    private transient boolean needVerify;
    @C6593c(mo15949a = "poster")
    private EncryptUrlModel poster;
    @C6593c(mo15949a = "video")
    private EncryptedVideoContent video;
    @C6593c(mo15949a = "width")
    private int width;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.StoryVideoContent$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }

        public final StoryVideoContent fromSharePackage(SharePackage sharePackage) {
            C7573i.m23587b(sharePackage, "sharePackage");
            StoryVideoContent storyVideoContent = new StoryVideoContent();
            storyVideoContent.setPoster((EncryptUrlModel) sharePackage.f20186l.getSerializable("video_cover"));
            storyVideoContent.setHeight(sharePackage.f20186l.getInt("aweme_height"));
            storyVideoContent.setWidth(sharePackage.f20186l.getInt("aweme_width"));
            if (sharePackage.f20186l.containsKey("video")) {
                storyVideoContent.setVideo((EncryptedVideoContent) C31913m.m103667a(sharePackage.f20186l.getString("video"), EncryptedVideoContent.class));
            }
            return storyVideoContent;
        }

        public final StoryVideoContent obtain(VideoParam videoParam) {
            C7573i.m23587b(videoParam, "videoParam");
            StoryVideoContent storyVideoContent = new StoryVideoContent();
            storyVideoContent.setCheckTexts(videoParam.getCheckTexts());
            storyVideoContent.setLocalCheckPic(videoParam.getCheckPic());
            storyVideoContent.setLocalPoster(videoParam.getThumbnailPath());
            storyVideoContent.setFromGallery(videoParam.getFromGallery());
            storyVideoContent.setLocalVideo(videoParam.getVideoPath());
            storyVideoContent.setMd5(videoParam.getSrcVideoMD5());
            storyVideoContent.setHeight(videoParam.getHeight());
            storyVideoContent.setWidth(videoParam.getWidth());
            storyVideoContent.setMassMsg(0);
            return storyVideoContent;
        }

        public final List<Attachment> obtainAttachmentList(StoryVideoContent storyVideoContent) {
            C7573i.m23587b(storyVideoContent, "storyVideoContent");
            Attachment attachment = new Attachment();
            Attachment attachment2 = new Attachment();
            Attachment attachment3 = new Attachment();
            attachment.setIndex(0);
            attachment2.setIndex(1);
            attachment3.setIndex(2);
            attachment.setLocalPath(storyVideoContent.getLocalCheckPic());
            attachment2.setLocalPath(storyVideoContent.getLocalVideo());
            attachment3.setLocalPath(storyVideoContent.getLocalPoster());
            if (storyVideoContent.getNeedVerify()) {
                attachment.setStatus(-1);
                attachment2.setStatus(-1);
                attachment3.setStatus(-1);
            }
            List<Attachment> arrayList = new ArrayList<>();
            arrayList.add(attachment);
            arrayList.add(attachment2);
            arrayList.add(attachment3);
            return arrayList;
        }

        public final StoryVideoContent obtain(MediaModel mediaModel) {
            C7573i.m23587b(mediaModel, "mediaModel");
            if (!mediaModel.isVideo()) {
                return null;
            }
            StoryVideoContent storyVideoContent = new StoryVideoContent();
            storyVideoContent.setLocalCheckPic(mediaModel.getThumbnail());
            storyVideoContent.setLocalVideo(mediaModel.getFilePath());
            storyVideoContent.setLocalPoster(mediaModel.getThumbnail());
            storyVideoContent.setWidth(mediaModel.getWidth());
            storyVideoContent.setHeight(mediaModel.getHeight());
            storyVideoContent.setFromGallery(1);
            storyVideoContent.setMassMsg(0);
            storyVideoContent.setNeedVerify(true);
            return storyVideoContent;
        }

        public final void updateContentLocal(StoryVideoContent storyVideoContent, Message message) {
            boolean z;
            boolean z2;
            C7573i.m23587b(storyVideoContent, "storyVideoContent");
            C7573i.m23587b(message, "message");
            List attachments = message.getAttachments();
            if (attachments != null) {
                int i = 0;
                for (Object next : attachments) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C7525m.m23465b();
                    }
                    Attachment attachment = (Attachment) next;
                    boolean z3 = true;
                    if (i == 0 && attachment != null) {
                        CharSequence localCheckPic = storyVideoContent.getLocalCheckPic();
                        if (localCheckPic == null || localCheckPic.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            storyVideoContent.setLocalCheckPic(attachment.getLocalPath());
                        }
                    }
                    if (i == 1 && attachment != null) {
                        CharSequence localVideo = storyVideoContent.getLocalVideo();
                        if (localVideo == null || localVideo.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            storyVideoContent.setLocalVideo(attachment.getLocalPath());
                        }
                    }
                    if (i == 2 && attachment != null) {
                        CharSequence localPoster = storyVideoContent.getLocalPoster();
                        if (!(localPoster == null || localPoster.length() == 0)) {
                            z3 = false;
                        }
                        if (z3) {
                            storyVideoContent.setLocalPoster(attachment.getLocalPath());
                        }
                    }
                    i = i2;
                }
            }
        }

        public final void updateAfterVECompile(StoryVideoContent storyVideoContent, Message message, CompileResult compileResult) {
            C7573i.m23587b(storyVideoContent, "storyVideoContent");
            C7573i.m23587b(message, "message");
            C7573i.m23587b(compileResult, "result");
            storyVideoContent.setMd5(compileResult.getVideoMd5());
            storyVideoContent.setLocalVideo(compileResult.getVideoPath());
            storyVideoContent.setLocalCheckPic(compileResult.getCheckPic());
            storyVideoContent.setLocalPoster(compileResult.getThumbnailPath());
            storyVideoContent.setWidth(compileResult.getVideoWidth());
            storyVideoContent.setHeight(compileResult.getVideoHeight());
            List attachments = message.getAttachments();
            if (attachments != null) {
                int size = attachments.size();
                for (int i = 0; i < size; i++) {
                    Attachment attachment = (Attachment) attachments.get(i);
                    if (attachment != null) {
                        attachment.setStatus(0);
                        switch (i) {
                            case 0:
                                attachment.setLocalPath(storyVideoContent.getLocalCheckPic());
                                break;
                            case 1:
                                attachment.setLocalPath(storyVideoContent.getLocalVideo());
                                break;
                            case 2:
                                attachment.setLocalPath(storyVideoContent.getLocalPoster());
                                break;
                        }
                    }
                }
            }
        }
    }

    public static final StoryVideoContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    public static final StoryVideoContent obtain(VideoParam videoParam) {
        return Companion.obtain(videoParam);
    }

    public static final StoryVideoContent obtain(MediaModel mediaModel) {
        return Companion.obtain(mediaModel);
    }

    public static final List<Attachment> obtainAttachmentList(StoryVideoContent storyVideoContent) {
        return Companion.obtainAttachmentList(storyVideoContent);
    }

    public static final void updateAfterVECompile(StoryVideoContent storyVideoContent, Message message, CompileResult compileResult) {
        Companion.updateAfterVECompile(storyVideoContent, message, compileResult);
    }

    public final List<String> getCheckPics() {
        return this.checkPics;
    }

    public final List<String> getCheckTexts() {
        return this.checkTexts;
    }

    public final int getFromGallery() {
        return this.fromGallery;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getLocalCheckPic() {
        return this.localCheckPic;
    }

    public final String getLocalPoster() {
        return this.localPoster;
    }

    public final String getLocalVideo() {
        return this.localVideo;
    }

    public final int getMassMsg() {
        return this.massMsg;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final boolean getNeedVerify() {
        return this.needVerify;
    }

    public final EncryptUrlModel getPoster() {
        return this.poster;
    }

    public final EncryptedVideoContent getVideo() {
        return this.video;
    }

    public final int getWidth() {
        return this.width;
    }

    public final UrlModel getDisplayPoster() {
        if (this.poster == null) {
            return null;
        }
        return EncryptUrlModel.convert(this.poster);
    }

    public final void tryInit() {
        this.msgHint = C6399b.m19921a().getString(R.string.bqo);
    }

    public final List<String> getCheckPicList() {
        if (this.checkPics == null) {
            this.checkPics = new ArrayList();
        }
        List<String> list = this.checkPics;
        if (list == null) {
            C7573i.m23580a();
        }
        return list;
    }

    public final SharePackage generateSharePackage() {
        PureDataSharePackage a = C31821b.m103274a("story_video");
        Bundle bundle = a.f20186l;
        bundle.putSerializable("video_cover", this.poster);
        bundle.putInt("aweme_width", this.width);
        bundle.putInt("aweme_height", this.height);
        bundle.putString("video", C31913m.m103668a(this.video));
        return a;
    }

    public final void setCheckPics(List<String> list) {
        this.checkPics = list;
    }

    public final void setCheckTexts(List<String> list) {
        this.checkTexts = list;
    }

    public final void setFromGallery(int i) {
        this.fromGallery = i;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setLocalCheckPic(String str) {
        this.localCheckPic = str;
    }

    public final void setLocalPoster(String str) {
        this.localPoster = str;
    }

    public final void setLocalVideo(String str) {
        this.localVideo = str;
    }

    public final void setMassMsg(int i) {
        this.massMsg = i;
    }

    public final void setMd5(String str) {
        this.md5 = str;
    }

    public final void setNeedVerify(boolean z) {
        this.needVerify = z;
    }

    public final void setPoster(EncryptUrlModel encryptUrlModel) {
        this.poster = encryptUrlModel;
    }

    public final void setVideo(EncryptedVideoContent encryptedVideoContent) {
        this.video = encryptedVideoContent;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
