package com.p280ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6591a;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commercialize.feed.preload.PreloadData;
import com.p280ss.android.ugc.aweme.commercialize.model.AdHintData;
import com.p280ss.android.ugc.aweme.commercialize.model.AdNodeTrackUrl;
import com.p280ss.android.ugc.aweme.commercialize.model.C25005n;
import com.p280ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.p280ss.android.ugc.aweme.commercialize.model.DouPlusLinkData;
import com.p280ss.android.ugc.aweme.commercialize.model.NativeCardInfo;
import com.p280ss.android.ugc.aweme.commercialize.model.OmVast;
import com.p280ss.android.ugc.aweme.music.model.Music;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeRawAd */
public class AwemeRawAd implements Serializable {
    @C6593c(mo15949a = "hint_data")
    private AdHintData adHintData;
    @C6593c(mo15949a = "ad_id")
    Long adId;
    @C6593c(mo15949a = "ad_more_textual")
    private String adMoreTextual;
    @C6593c(mo15949a = "play_node_track_url")
    List<AdNodeTrackUrl> adNodeTrackUrlList;
    @C6593c(mo15949a = "ad_poi_control")
    boolean adPoiControl;
    @C6593c(mo15949a = "ad_source_type")
    private int adSourceType;
    @C6593c(mo15949a = "ad_tag_position")
    private int adTagPosition;
    @C6593c(mo15949a = "top_icon_list")
    UrlModel adTopIcon;
    @C6593c(mo15949a = "ad_type")
    int adType;
    @C6593c(mo15949a = "aggregation_sdk")
    AggregationSdk aggregationSdk;
    @C6593c(mo15949a = "allow_dsp_autojump")
    private boolean allowDspAutoJump;
    @C6593c(mo15949a = "animation_type")
    private int animationType;
    @C6593c(mo15949a = "app_category")
    String appCategory;
    @C6593c(mo15949a = "app_install")
    String appInstall = "";
    @C6593c(mo15949a = "app_like")
    String appLike;
    @C6593c(mo15949a = "app_name")
    String appName = "";
    @C6593c(mo15949a = "avatar_icon")
    UrlModel avatarIcon;
    @C6593c(mo15949a = "button_style")
    int buttonStyle;
    @C6593c(mo15949a = "button_text")
    String buttonText;
    @C6593c(mo15949a = "card_infos")
    Map<String, CardStruct> cardInfos;
    @C6593c(mo15949a = "card_interaction_seconds")
    private int cardInteractionSeconds;
    @C6591a(mo15945a = false, mo15946b = false)
    boolean cardOnceClick;
    @C6593c(mo15949a = "click_track_url_list")
    UrlModel clickTrackUrlList;
    @C6593c(mo15949a = "comment_area")
    private CommentStruct commentArea;
    @C6593c(mo15949a = "comment_area_switch")
    private boolean commentAreaSwitch;
    @C6593c(mo15949a = "consult_url")
    String consultUrl;
    @C6593c(mo15949a = "context_track_url_list")
    private UrlModel contextTrack;
    private transient boolean contextTrackSent;
    @C6593c(mo15949a = "creative_id")
    Long creativeId;
    @C6593c(mo15949a = "description")
    String description;
    @C6593c(mo15949a = "disable_show_ad_link")
    boolean disableAdLink;
    @C6593c(mo15949a = "disable_ad_show_filter")
    boolean disableAdShowFilter;
    @C6593c(mo15949a = "disable_auto_track_click")
    boolean disableAutoTrackClick;
    @C6593c(mo15949a = "disable_download_dialog")
    int disableDownloadDialog = 1;
    @C6593c(mo15949a = "disable_follow_to_click")
    private int disableFollowToClick;
    @C6593c(mo15949a = "disable_authorpage_button")
    private boolean disableUserprofileAdLabel;
    @C6593c(mo15949a = "display_type")
    Long displayType;
    @C6593c(mo15949a = "link_data")
    private DouPlusLinkData douPlusLinkData;
    @C6593c(mo15949a = "download_url")
    String downloadUrl;
    @C6593c(mo15949a = "effective_play_time")
    Float effectivePlayTime;
    @C6593c(mo15949a = "effective_play_track_url_list")
    UrlModel effectivePlayTrackUrlList;
    @C6593c(mo15949a = "enable_title_click")
    int enableDescClick;
    @C6593c(mo15949a = "enable_filter_same_video")
    private boolean enableFilterSameVideo = true;
    @C6593c(mo15949a = "enable_web_report")
    private boolean enableWebReport;
    @C6593c(mo15949a = "expire_seconds")
    Long expireSeconds;
    @C6593c(mo15949a = "extra_effective_play_action")
    private int extraEffectivePlayAction;
    @C6593c(mo15949a = "feature_label")
    String featureLabel;
    @C6593c(mo15949a = "form_height")
    private int formHeight;
    @C6593c(mo15949a = "form_url")
    private String formUrl;
    @C6593c(mo15949a = "form_width")
    private int formWidth;
    @C6593c(mo15949a = "group_id")
    Long groupId;
    @C6593c(mo15949a = "hide_if_exists")
    int hideIfExists;
    @C6593c(mo15949a = "homepage_bottom_textual")
    private String homepageBottomTextual;
    @C6593c(mo15949a = "icon_image_list")
    private List<UrlModel> iconImageList;
    @C6593c(mo15949a = "image_list")
    List<UrlModel> imageList;
    @C6593c(mo15949a = "image_url")
    private UrlModel imageUrl;
    @C6593c(mo15949a = "instance_phone_id")
    private long instancePhoneId;
    @C6593c(mo15949a = "interaction_seconds")
    int interactionSeconds;
    @C6593c(mo15949a = "interesting_play")
    private AwemePlayFunModel interestingPlay;
    @C6593c(mo15949a = "is_dsp")
    private boolean isDsp;
    @C6593c(mo15949a = "is_preview")
    boolean isPreview;
    @C6593c(mo15949a = "js_actlog_url")
    private String jsActLogUrl;
    @C6593c(mo15949a = "label")
    private AwemeTextLabelModel label;
    @C6593c(mo15949a = "learn_more_bg_color")
    private String learnMoreBgColor;
    @C6593c(mo15949a = "left_slide_click_time")
    private int leftSlideClickDuration;
    @C6593c(mo15949a = "left_slide_click_type")
    private int leftSlideClickType;
    @C6593c(mo15949a = "light_web_url")
    private String lightWebUrl;
    @C6593c(mo15949a = "link_label")
    private AwemeLinkLabel linkLabel;
    @C6593c(mo15949a = "live_room")
    public int liveRoom;
    @C6593c(mo15949a = "log_extra")
    String logExtra;
    @C6593c(mo15949a = "download_mode")
    int mDownloadMode;
    @C6593c(mo15949a = "auto_open")
    int mLinkMode;
    @C6593c(mo15949a = "support_multiple")
    int mSupportMultiple;
    @C6593c(mo15949a = "mask_form_style")
    int maskFormStyle;
    @C6593c(mo15949a = "mp_url")
    private String microAppUrl;
    @C6593c(mo15949a = "music")
    private Music music;
    @C6593c(mo15949a = "native_card_info")
    private NativeCardInfo nativeCardInfo;
    @C6593c(mo15949a = "native_card_type")
    int nativeCardType;
    @C6593c(mo15949a = "vast")
    OmVast omVast;
    @C6593c(mo15949a = "open_system_browser")
    private boolean openSystemBrowser;
    @C6593c(mo15949a = "open_url")
    String openUrl;
    @C6593c(mo15949a = "origin_price")
    String originPrice;
    @C6593c(mo15949a = "outflow_button_style")
    int outFlowButtonStyle;
    @C6593c(mo15949a = "package")
    String packageName;
    private String pageFrom = "";
    @C6593c(mo15949a = "phone_key")
    private String phoneKey;
    @C6593c(mo15949a = "phone_number")
    private String phoneNumber;
    @C6593c(mo15949a = "playover_track_url_list")
    UrlModel playOverTrackUrlList;
    @C6593c(mo15949a = "play_track_url_list")
    UrlModel playTrackUrlList;
    @C6593c(mo15949a = "playback_seconds_track_url")
    private List<C25005n> playbackSecondsTrackList = new ArrayList();
    @C6593c(mo15949a = "pop_ups")
    private boolean popUps;
    @C6593c(mo15949a = "preload_data")
    private PreloadData preloadData;
    @C6593c(mo15949a = "preload_extra_web")
    private int preloadExtraWeb;
    @C6593c(mo15949a = "preload_web")
    private int preloadWeb;
    @C6593c(mo15949a = "price")
    String price;
    @C6593c(mo15949a = "profile_with_webview")
    private int profileWithWebview;
    @C6593c(mo15949a = "promotion_label")
    String promotionLabel;
    @C6593c(mo15949a = "quick_app_url")
    String quickAppUrl;
    @C6593c(mo15949a = "red_open_url")
    private String redOpenUrl;
    @C6593c(mo15949a = "red_url")
    private String redUrl;
    @C6593c(mo15949a = "report_ad_type")
    private int reportAdType;
    @C6593c(mo15949a = "report_enable")
    boolean reportEnable;
    @C6593c(mo15949a = "schema_name")
    String schemaName;
    @C6593c(mo15949a = "raw_search_ad_type")
    private int searchAdType;
    @C6593c(mo15949a = "show_ad_after_interaction")
    boolean showAdAfterInteraction;
    @C6593c(mo15949a = "show_button_color_seconds")
    int showButtonColorSeconds;
    @C6593c(mo15949a = "show_button_seconds")
    private int showButtonSeconds;
    @C6593c(mo15949a = "show_mask_times")
    private int showMaskTimes;
    @C6593c(mo15949a = "show_outflow_mask_times")
    private int showOutflowMaskTimes;
    @C6593c(mo15949a = "show_poi_deil_seconds")
    int showPoiDeilSeconds;
    @C6593c(mo15949a = "show_special_avatar")
    boolean showSpecialAvatar;
    @C6593c(mo15949a = "show_type")
    int showType;
    @C6593c(mo15949a = "slide_action")
    private int slideAction;
    @C6593c(mo15949a = "source")
    String source;
    @C6593c(mo15949a = "splash_info")
    private AwemeSplashInfo splashInfo;
    @C6593c(mo15949a = "system_origin")
    int systemOrigin;
    @C6593c(mo15949a = "tips_type")
    int tipsType;
    @C6593c(mo15949a = "title")
    String title;
    @C6593c(mo15949a = "top_title")
    String topTitle;
    @C6593c(mo15949a = "track_url_list")
    UrlModel trackUrlList;
    @C6593c(mo15949a = "type")
    String type;
    @C6593c(mo15949a = "use_default_color")
    boolean useDefaultColor;
    @C6593c(mo15949a = "use_ordinary_web")
    boolean useOrdinaryWeb = C6399b.m19943s();
    @C6593c(mo15949a = "video_transpose")
    Long videoTranspose;
    @C6593c(mo15949a = "web_title")
    String webTitle;
    @C6593c(mo15949a = "web_type")
    int webType;
    @C6593c(mo15949a = "web_url")
    String webUrl;
    @C6593c(mo15949a = "webview_progress_bar")
    private int webviewProgressBar;
    @C6593c(mo15949a = "webview_type")
    private int webviewType;

    private void vastFromXml() {
    }

    public AdHintData getAdHintData() {
        return this.adHintData;
    }

    public Long getAdId() {
        return this.adId;
    }

    public String getAdMoreTextual() {
        return this.adMoreTextual;
    }

    public List<AdNodeTrackUrl> getAdNodeTrackUrlList() {
        return this.adNodeTrackUrlList;
    }

    public int getAdTagPosition() {
        return this.adTagPosition;
    }

    public UrlModel getAdTopIcon() {
        return this.adTopIcon;
    }

    public int getAdType() {
        return this.adType;
    }

    public AggregationSdk getAggregationSdk() {
        return this.aggregationSdk;
    }

    public int getAnimationType() {
        return this.animationType;
    }

    public String getAppInstall() {
        return this.appInstall;
    }

    public String getAppName() {
        return this.appName;
    }

    public UrlModel getAvatarIcon() {
        return this.avatarIcon;
    }

    public int getButtonStyle() {
        return this.buttonStyle;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public Map<String, CardStruct> getCardInfos() {
        return this.cardInfos;
    }

    public int getCardInteractionSeconds() {
        return this.cardInteractionSeconds;
    }

    public UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public CommentStruct getCommentArea() {
        return this.commentArea;
    }

    public String getConsultUrl() {
        return this.consultUrl;
    }

    public UrlModel getContextTrack() {
        return this.contextTrack;
    }

    public Long getCreativeId() {
        return this.creativeId;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getDisableAutoTrackClick() {
        return this.disableAutoTrackClick;
    }

    public int getDisableFollowToClick() {
        return this.disableFollowToClick;
    }

    public Long getDisplayType() {
        return this.displayType;
    }

    public DouPlusLinkData getDouPlusLinkData() {
        return this.douPlusLinkData;
    }

    public int getDownloadMode() {
        return this.mDownloadMode;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public UrlModel getEffectivePlayTrackUrlList() {
        return this.effectivePlayTrackUrlList;
    }

    public Long getExpireSeconds() {
        return this.expireSeconds;
    }

    public String getFeatureLabel() {
        return this.featureLabel;
    }

    public int getFormHeight() {
        return this.formHeight;
    }

    public String getFormUrl() {
        return this.formUrl;
    }

    public int getFormWidth() {
        return this.formWidth;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public String getHomepageBottomTextual() {
        return this.homepageBottomTextual;
    }

    public List<UrlModel> getIconImageList() {
        return this.iconImageList;
    }

    public List<UrlModel> getImageList() {
        return this.imageList;
    }

    public UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public long getInstancePhoneId() {
        return this.instancePhoneId;
    }

    public int getInteractionSeconds() {
        return this.interactionSeconds;
    }

    public String getJsActLogUrl() {
        return this.jsActLogUrl;
    }

    public AwemeTextLabelModel getLabel() {
        return this.label;
    }

    public String getLearnMoreBgColor() {
        return this.learnMoreBgColor;
    }

    public int getLeftSlideClickDuration() {
        return this.leftSlideClickDuration;
    }

    public int getLeftSlideClickType() {
        return this.leftSlideClickType;
    }

    public String getLightWebUrl() {
        return this.lightWebUrl;
    }

    public AwemeLinkLabel getLinkLabel() {
        return this.linkLabel;
    }

    public int getLinkMode() {
        return this.mLinkMode;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public int getMaskFormStyle() {
        return this.maskFormStyle;
    }

    public String getMicroAppUrl() {
        return this.microAppUrl;
    }

    public Music getMusic() {
        return this.music;
    }

    public NativeCardInfo getNativeCardInfo() {
        return this.nativeCardInfo;
    }

    public int getNativeCardType() {
        return this.nativeCardType;
    }

    public OmVast getOmVast() {
        return this.omVast;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getOriginPrice() {
        return this.originPrice;
    }

    public int getOutFlowButtonStyle() {
        return this.outFlowButtonStyle;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPageFrom() {
        return this.pageFrom;
    }

    public String getPhoneKey() {
        return this.phoneKey;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public AwemePlayFunModel getPlayFunModel() {
        return this.interestingPlay;
    }

    public UrlModel getPlayOverTrackUrlList() {
        return this.playOverTrackUrlList;
    }

    public UrlModel getPlayTrackUrlList() {
        return this.playTrackUrlList;
    }

    public List<C25005n> getPlaybackSecondsTrackList() {
        return this.playbackSecondsTrackList;
    }

    public PreloadData getPreloadData() {
        return this.preloadData;
    }

    public int getPreloadWeb() {
        return this.preloadWeb;
    }

    public String getPrice() {
        return this.price;
    }

    public int getProfileWithWebview() {
        return this.profileWithWebview;
    }

    public String getPromotionLabel() {
        return this.promotionLabel;
    }

    public String getQuickAppUrl() {
        return this.quickAppUrl;
    }

    public String getRedOpenUrl() {
        return this.redOpenUrl;
    }

    public String getRedUrl() {
        return this.redUrl;
    }

    public int getReportAdType() {
        return this.reportAdType;
    }

    public String getSchemaName() {
        return this.schemaName;
    }

    public int getSearchAdType() {
        return this.searchAdType;
    }

    public int getShowButtonColorSeconds() {
        return this.showButtonColorSeconds;
    }

    public int getShowButtonSeconds() {
        return this.showButtonSeconds;
    }

    public int getShowMaskTimes() {
        return this.showMaskTimes;
    }

    public int getShowOutflowMaskTimes() {
        return this.showOutflowMaskTimes;
    }

    public boolean getShowSpecialAvatar() {
        return this.showSpecialAvatar;
    }

    public int getSlideAction() {
        return this.slideAction;
    }

    public String getSource() {
        return this.source;
    }

    public AwemeSplashInfo getSplashInfo() {
        return this.splashInfo;
    }

    public int getSystemOrigin() {
        return this.systemOrigin;
    }

    public int getTipsType() {
        return this.tipsType;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTopTitle() {
        return this.topTitle;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public String getType() {
        return this.type;
    }

    public Long getVideoTranspose() {
        return this.videoTranspose;
    }

    public String getWebTitle() {
        return this.webTitle;
    }

    public int getWebType() {
        return this.webType;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public int getWebviewProgressBar() {
        return this.webviewProgressBar;
    }

    public int getWebviewType() {
        return this.webviewType;
    }

    public boolean isAdPoiControl() {
        return this.adPoiControl;
    }

    public boolean isAllowDspAutoJump() {
        return this.allowDspAutoJump;
    }

    public boolean isCardOnceClick() {
        return this.cardOnceClick;
    }

    public boolean isCommentAreaSwitch() {
        return this.commentAreaSwitch;
    }

    public boolean isContextTrackSent() {
        return this.contextTrackSent;
    }

    public boolean isDiableAdShowFilter() {
        return this.disableAdShowFilter;
    }

    public boolean isDisableAdLink() {
        return this.disableAdLink;
    }

    public boolean isDisableUserprofileAdLabel() {
        return this.disableUserprofileAdLabel;
    }

    public boolean isDsp() {
        return this.isDsp;
    }

    public boolean isEnableFilterSameVideo() {
        return this.enableFilterSameVideo;
    }

    public boolean isEnableWebReport() {
        return this.enableWebReport;
    }

    public boolean isOpenSystemBrowser() {
        return this.openSystemBrowser;
    }

    public boolean isPopUps() {
        return this.popUps;
    }

    public boolean isPreview() {
        return this.isPreview;
    }

    public boolean isReportEnable() {
        return this.reportEnable;
    }

    public boolean isShowAdAfterInteraction() {
        return this.showAdAfterInteraction;
    }

    public boolean isUseDefaultColor() {
        return this.useDefaultColor;
    }

    public boolean isUseOrdinaryWeb() {
        return this.useOrdinaryWeb;
    }

    public boolean allowJumpToPlayStore() {
        if (this.slideAction == 1) {
            return true;
        }
        return false;
    }

    public boolean getEnableDescClick() {
        if (this.enableDescClick != 0) {
            return true;
        }
        return false;
    }

    public int getShowPoiMillisecond() {
        return this.showPoiDeilSeconds * 1000;
    }

    public boolean isAppAd() {
        return isTypeOf("app");
    }

    public boolean isDisableDownloadDialog() {
        if (this.disableDownloadDialog == 1) {
            return true;
        }
        return false;
    }

    public boolean isHardAd() {
        if (this.adSourceType == 1) {
            return true;
        }
        return false;
    }

    public boolean isHideIfExists() {
        if (this.hideIfExists == 1) {
            return true;
        }
        return false;
    }

    public boolean isNewStyleAd() {
        if (this.showType == 1) {
            return true;
        }
        return false;
    }

    public boolean isPreloadExtraWeb() {
        if (this.preloadExtraWeb == 1) {
            return true;
        }
        return false;
    }

    public boolean isSupportMultiple() {
        if (this.mSupportMultiple > 0) {
            return true;
        }
        return false;
    }

    public boolean useEffectivePlayAction() {
        if (this.extraEffectivePlayAction == 1) {
            return true;
        }
        return false;
    }

    public String getCreativeIdStr() {
        if (this.creativeId == null) {
            return null;
        }
        return this.creativeId.toString();
    }

    public boolean isImageValid() {
        if (this.imageList == null || this.imageList.isEmpty()) {
            return false;
        }
        return true;
    }

    public String[] getAppCategory() {
        if (TextUtils.isEmpty(this.appCategory)) {
            return new String[0];
        }
        return this.appCategory.split(" ");
    }

    public float getAppLike() {
        if (TextUtils.isEmpty(this.appLike)) {
            return 0.0f;
        }
        return Float.parseFloat(this.appLike);
    }

    public CardStruct getDefaultCardInfo() {
        if (this.cardInfos == null || !this.cardInfos.containsKey("3")) {
            return null;
        }
        return (CardStruct) this.cardInfos.get("3");
    }

    public Float getEffectivePlayTime() {
        if (this.effectivePlayTime == null || this.effectivePlayTime.floatValue() <= 0.001f) {
            return Float.valueOf(3.0f);
        }
        return this.effectivePlayTime;
    }

    public UrlModel getRedImageUrl() {
        if (C6307b.m19566a((Collection<T>) this.iconImageList)) {
            return null;
        }
        return (UrlModel) this.iconImageList.get(0);
    }

    public boolean isClickTrackUrlListValid() {
        if (this.clickTrackUrlList == null || this.clickTrackUrlList.getUrlList() == null || this.clickTrackUrlList.getUrlList().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean isRightStyle() {
        if (getAdTagPosition() != 2 || this.label == null || TextUtils.isEmpty(this.label.getLabelName())) {
            return false;
        }
        return true;
    }

    public void setAdHintData(AdHintData adHintData2) {
        this.adHintData = adHintData2;
    }

    public void setAdId(Long l) {
        this.adId = l;
    }

    public void setAdMoreTextual(String str) {
        this.adMoreTextual = str;
    }

    public void setAdTagPosition(int i) {
        this.adTagPosition = i;
    }

    public void setAdTopIcon(UrlModel urlModel) {
        this.adTopIcon = urlModel;
    }

    public void setAllowDspAutoJump(boolean z) {
        this.allowDspAutoJump = z;
    }

    public void setAnimationType(int i) {
        this.animationType = i;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAvatarIcon(UrlModel urlModel) {
        this.avatarIcon = urlModel;
    }

    public void setButtonStyle(int i) {
        this.buttonStyle = i;
    }

    public void setButtonText(String str) {
        this.buttonText = str;
    }

    public void setCardOnceClick(boolean z) {
        this.cardOnceClick = z;
    }

    public void setClickTrackUrlList(UrlModel urlModel) {
        this.clickTrackUrlList = urlModel;
    }

    public void setCommentArea(CommentStruct commentStruct) {
        this.commentArea = commentStruct;
    }

    public void setCommentAreaSwitch(boolean z) {
        this.commentAreaSwitch = z;
    }

    public void setContextTrack(UrlModel urlModel) {
        this.contextTrack = urlModel;
    }

    public void setContextTrackSent(boolean z) {
        this.contextTrackSent = z;
    }

    public void setCreativeId(Long l) {
        this.creativeId = l;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDiableAdShowFilter(boolean z) {
        this.disableAdShowFilter = z;
    }

    public void setDisableAdLink(boolean z) {
        this.disableAdLink = z;
    }

    public void setDisableDownloadDialog(int i) {
        this.disableDownloadDialog = i;
    }

    public void setDisableFollowToClick(int i) {
        this.disableFollowToClick = i;
    }

    public void setDisableUserprofileAdLabel(boolean z) {
        this.disableUserprofileAdLabel = z;
    }

    public void setDisplayType(Long l) {
        this.displayType = l;
    }

    public void setDownloadMode(int i) {
        this.mDownloadMode = i;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setDsp(boolean z) {
        this.isDsp = z;
    }

    public void setEffectivePlayTrackUrlList(UrlModel urlModel) {
        this.effectivePlayTrackUrlList = urlModel;
    }

    public void setEnableFilterSameVideo(boolean z) {
        this.enableFilterSameVideo = z;
    }

    public void setExpireSeconds(Long l) {
        this.expireSeconds = l;
    }

    public void setFeatureLabel(String str) {
        this.featureLabel = str;
    }

    public void setFormHeight(int i) {
        this.formHeight = i;
    }

    public void setFormUrl(String str) {
        this.formUrl = str;
    }

    public void setFormWidth(int i) {
        this.formWidth = i;
    }

    public void setGroupId(Long l) {
        this.groupId = l;
    }

    public void setHideIfExists(boolean z) {
        this.hideIfExists = z ? 1 : 0;
    }

    public void setHomepageBottomTextual(String str) {
        this.homepageBottomTextual = str;
    }

    public void setIconImageList(List<UrlModel> list) {
        this.iconImageList = list;
    }

    public void setImageList(List<UrlModel> list) {
        this.imageList = list;
    }

    public void setJsActLogUrl(String str) {
        this.jsActLogUrl = str;
    }

    public void setLabel(AwemeTextLabelModel awemeTextLabelModel) {
        this.label = awemeTextLabelModel;
    }

    public void setLearnMoreBgColor(String str) {
        this.learnMoreBgColor = str;
    }

    public void setLightWebUrl(String str) {
        this.lightWebUrl = str;
    }

    public void setLinkMode(int i) {
        this.mLinkMode = i;
    }

    public void setLogExtra(String str) {
        this.logExtra = str;
    }

    public void setMaskFormStyle(int i) {
        this.maskFormStyle = i;
    }

    public void setMicroAppUrl(String str) {
        this.microAppUrl = str;
    }

    public void setMusic(Music music2) {
        this.music = music2;
    }

    public void setOmVast(OmVast omVast2) {
        this.omVast = omVast2;
    }

    public void setOpenSystemBrowser(boolean z) {
        this.openSystemBrowser = z;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setOriginPrice(String str) {
        this.originPrice = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPageFrom(String str) {
        this.pageFrom = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setPlayOverTrackUrlList(UrlModel urlModel) {
        this.playOverTrackUrlList = urlModel;
    }

    public void setPlayTrackUrlList(UrlModel urlModel) {
        this.playTrackUrlList = urlModel;
    }

    public void setPopUps(boolean z) {
        this.popUps = z;
    }

    public void setPreloadData(PreloadData preloadData2) {
        this.preloadData = preloadData2;
    }

    public void setPreloadWeb(int i) {
        this.preloadWeb = i;
    }

    public void setPreview(boolean z) {
        this.isPreview = z;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setProfileWithWebview(int i) {
        this.profileWithWebview = i;
    }

    public void setRedUrl(String str) {
        this.redUrl = str;
    }

    public void setReportAdType(int i) {
        this.reportAdType = i;
    }

    public void setShowAdAfterInteraction(boolean z) {
        this.showAdAfterInteraction = z;
    }

    public void setShowButtonSeconds(int i) {
        this.showButtonSeconds = i;
    }

    public void setShowMaskTimes(int i) {
        this.showMaskTimes = i;
    }

    public void setShowOutflowMaskTimes(int i) {
        this.showOutflowMaskTimes = i;
    }

    public void setShowSpecialAvatar(boolean z) {
        this.showSpecialAvatar = z;
    }

    public void setSlideAction(int i) {
        this.slideAction = i;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSplashInfo(AwemeSplashInfo awemeSplashInfo) {
        this.splashInfo = awemeSplashInfo;
    }

    public void setSupportMultiple(int i) {
        this.mSupportMultiple = i;
    }

    public void setSystemOrigin(int i) {
        this.systemOrigin = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVideoTranspose(Long l) {
        this.videoTranspose = l;
    }

    public void setWebTitle(String str) {
        this.webTitle = str;
    }

    public void setWebType(int i) {
        this.webType = i;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    public void setWebviewProgressBar(int i) {
        this.webviewProgressBar = i;
    }

    public void setWebviewType(int i) {
        this.webviewType = i;
    }

    public boolean isTypeOf(String str) {
        return TextUtils.equals(this.type, str);
    }
}
