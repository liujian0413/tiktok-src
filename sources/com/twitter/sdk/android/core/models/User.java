package com.twitter.sdk.android.core.models;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

public class User implements C46950g, Serializable {
    private static final long serialVersionUID = 4663450696842173958L;
    @C6593c(mo15949a = "contributors_enabled")
    public final boolean contributorsEnabled;
    @C6593c(mo15949a = "created_at")
    public final String createdAt;
    @C6593c(mo15949a = "default_profile")
    public final boolean defaultProfile;
    @C6593c(mo15949a = "default_profile_image")
    public final boolean defaultProfileImage;
    @C6593c(mo15949a = "description")
    public final String description;
    @C6593c(mo15949a = "email")
    public final String email;
    @C6593c(mo15949a = "entities")
    public final C46962r entities;
    @C6593c(mo15949a = "favourites_count")
    public final int favouritesCount;
    @C6593c(mo15949a = "follow_request_sent")
    public final boolean followRequestSent;
    @C6593c(mo15949a = "followers_count")
    public final int followersCount;
    @C6593c(mo15949a = "friends_count")
    public final int friendsCount;
    @C6593c(mo15949a = "geo_enabled")
    public final boolean geoEnabled;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    public final long f120377id;
    @C6593c(mo15949a = "id_str")
    public final String idStr;
    @C6593c(mo15949a = "is_translator")
    public final boolean isTranslator;
    @C6593c(mo15949a = "lang")
    public final String lang;
    @C6593c(mo15949a = "listed_count")
    public final int listedCount;
    @C6593c(mo15949a = "location")
    public final String location;
    @C6593c(mo15949a = "name")
    public final String name;
    @C6593c(mo15949a = "profile_background_color")
    public final String profileBackgroundColor;
    @C6593c(mo15949a = "profile_background_image_url")
    public final String profileBackgroundImageUrl;
    @C6593c(mo15949a = "profile_background_image_url_https")
    public final String profileBackgroundImageUrlHttps;
    @C6593c(mo15949a = "profile_background_tile")
    public final boolean profileBackgroundTile;
    @C6593c(mo15949a = "profile_banner_url")
    public final String profileBannerUrl;
    @C6593c(mo15949a = "profile_image_url")
    public final String profileImageUrl;
    @C6593c(mo15949a = "profile_image_url_https")
    public final String profileImageUrlHttps;
    @C6593c(mo15949a = "profile_link_color")
    public final String profileLinkColor;
    @C6593c(mo15949a = "profile_sidebar_border_color")
    public final String profileSidebarBorderColor;
    @C6593c(mo15949a = "profile_sidebar_fill_color")
    public final String profileSidebarFillColor;
    @C6593c(mo15949a = "profile_text_color")
    public final String profileTextColor;
    @C6593c(mo15949a = "profile_use_background_image")
    public final boolean profileUseBackgroundImage;
    @C6593c(mo15949a = "protected")
    public final boolean protectedUser;
    @C6593c(mo15949a = "screen_name")
    public final String screenName;
    @C6593c(mo15949a = "show_all_inline_media")
    public final boolean showAllInlineMedia;
    @C6593c(mo15949a = "status")
    public final C46959o status;
    @C6593c(mo15949a = "statuses_count")
    public final int statusesCount;
    @C6593c(mo15949a = "time_zone")
    public final String timeZone;
    @C6593c(mo15949a = "url")
    public final String url;
    @C6593c(mo15949a = "utc_offset")
    public final int utcOffset;
    @C6593c(mo15949a = "verified")
    public final boolean verified;
    @C6593c(mo15949a = "withheld_in_countries")
    public final List<String> withheldInCountries;
    @C6593c(mo15949a = "withheld_scope")
    public final String withheldScope;

    public long getId() {
        return this.f120377id;
    }

    public User(boolean z, String str, boolean z2, boolean z3, String str2, String str3, C46962r rVar, int i, boolean z4, int i2, int i3, boolean z5, long j, String str4, boolean z6, String str5, int i4, String str6, String str7, String str8, String str9, String str10, boolean z7, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z8, boolean z9, String str18, boolean z10, C46959o oVar, int i5, String str19, String str20, int i6, boolean z11, List<String> list, String str21) {
        this.contributorsEnabled = z;
        this.createdAt = str;
        this.defaultProfile = z2;
        this.defaultProfileImage = z3;
        this.description = str2;
        this.email = str3;
        this.entities = rVar;
        this.favouritesCount = i;
        this.followRequestSent = z4;
        this.followersCount = i2;
        this.friendsCount = i3;
        this.geoEnabled = z5;
        this.f120377id = j;
        this.idStr = str4;
        this.isTranslator = z6;
        this.lang = str5;
        this.listedCount = i4;
        this.location = str6;
        this.name = str7;
        this.profileBackgroundColor = str8;
        this.profileBackgroundImageUrl = str9;
        this.profileBackgroundImageUrlHttps = str10;
        this.profileBackgroundTile = z7;
        this.profileBannerUrl = str11;
        this.profileImageUrl = str12;
        this.profileImageUrlHttps = str13;
        this.profileLinkColor = str14;
        this.profileSidebarBorderColor = str15;
        this.profileSidebarFillColor = str16;
        this.profileTextColor = str17;
        this.profileUseBackgroundImage = z8;
        this.protectedUser = z9;
        this.screenName = str18;
        this.showAllInlineMedia = z10;
        this.status = oVar;
        this.statusesCount = i5;
        this.timeZone = str19;
        this.url = str20;
        this.utcOffset = i6;
        this.verified = z11;
        this.withheldInCountries = list;
        this.withheldScope = str21;
    }
}
