package com.p280ss.ugc.aweme.proto;

import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.WebcastRoomStructV2 */
public final class WebcastRoomStructV2 extends Message<WebcastRoomStructV2, Builder> {
    public static final ProtoAdapter<WebcastRoomStructV2> ADAPTER = new ProtoAdapter_WebcastRoomStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.StreamUrlStructV2#ADAPTER", tag = 18)
    public StreamUrlStructV2 additional_stream_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 13)
    public Integer coins;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public Long create_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 11)
    public Integer digg_count;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 15)
    public UrlStructV2 dynamic_cover;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 20)
    public String extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public Long finish_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 14)
    public Boolean in_sandbox;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 21)
    public Boolean live_type_audio;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 26)
    public Boolean live_type_linkmic;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 25)
    public Boolean live_type_normal;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 24)
    public Boolean live_type_official;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 27)
    public Boolean live_type_sandbox;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 23)
    public Boolean live_type_screenshot;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 22)
    public Boolean live_type_third_party;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UserStructV2#ADAPTER", tag = 3)
    public UserStructV2 owner;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 16)
    public UrlStructV2 room_cover;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long room_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 17)
    public String room_type_tag;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ShareStructV2#ADAPTER", tag = 10)
    public ShareStructV2 share_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 8)
    public Long stream_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.StreamUrlStructV2#ADAPTER", tag = 9)
    public StreamUrlStructV2 stream_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 12)
    public Integer total_user_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public Integer user_count;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 19)
    public UrlStructV2 webp_cover;

    /* renamed from: com.ss.ugc.aweme.proto.WebcastRoomStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<WebcastRoomStructV2, Builder> {
        public StreamUrlStructV2 additional_stream_url;
        public Integer coins;
        public Long create_time;
        public Integer digg_count;
        public UrlStructV2 dynamic_cover;
        public String extra;
        public Long finish_time;
        public Boolean in_sandbox;
        public Boolean live_type_audio;
        public Boolean live_type_linkmic;
        public Boolean live_type_normal;
        public Boolean live_type_official;
        public Boolean live_type_sandbox;
        public Boolean live_type_screenshot;
        public Boolean live_type_third_party;
        public UserStructV2 owner;
        public UrlStructV2 room_cover;
        public Long room_id;
        public String room_type_tag;
        public ShareStructV2 share_info;
        public Integer status;
        public Long stream_id;
        public StreamUrlStructV2 stream_url;
        public String title;
        public Integer total_user_count;
        public Integer user_count;
        public UrlStructV2 webp_cover;

        public final WebcastRoomStructV2 build() {
            WebcastRoomStructV2 webcastRoomStructV2 = new WebcastRoomStructV2(this.room_id, this.status, this.owner, this.title, this.user_count, this.create_time, this.finish_time, this.stream_id, this.stream_url, this.share_info, this.digg_count, this.total_user_count, this.coins, this.in_sandbox, this.dynamic_cover, this.room_cover, this.room_type_tag, this.additional_stream_url, this.webp_cover, this.extra, this.live_type_audio, this.live_type_third_party, this.live_type_screenshot, this.live_type_official, this.live_type_normal, this.live_type_linkmic, this.live_type_sandbox, super.buildUnknownFields());
            return webcastRoomStructV2;
        }

        public final Builder additional_stream_url(StreamUrlStructV2 streamUrlStructV2) {
            this.additional_stream_url = streamUrlStructV2;
            return this;
        }

        public final Builder coins(Integer num) {
            this.coins = num;
            return this;
        }

        public final Builder create_time(Long l) {
            this.create_time = l;
            return this;
        }

        public final Builder digg_count(Integer num) {
            this.digg_count = num;
            return this;
        }

        public final Builder dynamic_cover(UrlStructV2 urlStructV2) {
            this.dynamic_cover = urlStructV2;
            return this;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder finish_time(Long l) {
            this.finish_time = l;
            return this;
        }

        public final Builder in_sandbox(Boolean bool) {
            this.in_sandbox = bool;
            return this;
        }

        public final Builder live_type_audio(Boolean bool) {
            this.live_type_audio = bool;
            return this;
        }

        public final Builder live_type_linkmic(Boolean bool) {
            this.live_type_linkmic = bool;
            return this;
        }

        public final Builder live_type_normal(Boolean bool) {
            this.live_type_normal = bool;
            return this;
        }

        public final Builder live_type_official(Boolean bool) {
            this.live_type_official = bool;
            return this;
        }

        public final Builder live_type_sandbox(Boolean bool) {
            this.live_type_sandbox = bool;
            return this;
        }

        public final Builder live_type_screenshot(Boolean bool) {
            this.live_type_screenshot = bool;
            return this;
        }

        public final Builder live_type_third_party(Boolean bool) {
            this.live_type_third_party = bool;
            return this;
        }

        public final Builder owner(UserStructV2 userStructV2) {
            this.owner = userStructV2;
            return this;
        }

        public final Builder room_cover(UrlStructV2 urlStructV2) {
            this.room_cover = urlStructV2;
            return this;
        }

        public final Builder room_id(Long l) {
            this.room_id = l;
            return this;
        }

        public final Builder room_type_tag(String str) {
            this.room_type_tag = str;
            return this;
        }

        public final Builder share_info(ShareStructV2 shareStructV2) {
            this.share_info = shareStructV2;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder stream_id(Long l) {
            this.stream_id = l;
            return this;
        }

        public final Builder stream_url(StreamUrlStructV2 streamUrlStructV2) {
            this.stream_url = streamUrlStructV2;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder total_user_count(Integer num) {
            this.total_user_count = num;
            return this;
        }

        public final Builder user_count(Integer num) {
            this.user_count = num;
            return this;
        }

        public final Builder webp_cover(UrlStructV2 urlStructV2) {
            this.webp_cover = urlStructV2;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.WebcastRoomStructV2$ProtoAdapter_WebcastRoomStructV2 */
    static final class ProtoAdapter_WebcastRoomStructV2 extends ProtoAdapter<WebcastRoomStructV2> {
        public ProtoAdapter_WebcastRoomStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, WebcastRoomStructV2.class);
        }

        public final WebcastRoomStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.room_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.owner((UserStructV2) UserStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.user_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            builder.create_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 7:
                            builder.finish_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 8:
                            builder.stream_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 9:
                            builder.stream_url((StreamUrlStructV2) StreamUrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            builder.share_info((ShareStructV2) ShareStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            builder.digg_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 12:
                            builder.total_user_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 13:
                            builder.coins((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 14:
                            builder.in_sandbox((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 15:
                            builder.dynamic_cover((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 16:
                            builder.room_cover((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 17:
                            builder.room_type_tag((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 18:
                            builder.additional_stream_url((StreamUrlStructV2) StreamUrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            builder.webp_cover((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 20:
                            builder.extra((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 21:
                            builder.live_type_audio((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 22:
                            builder.live_type_third_party((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 23:
                            builder.live_type_screenshot((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 24:
                            builder.live_type_official((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 25:
                            builder.live_type_normal((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                            builder.live_type_linkmic((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                            builder.live_type_sandbox((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final int encodedSize(WebcastRoomStructV2 webcastRoomStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, webcastRoomStructV2.room_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, webcastRoomStructV2.status) + UserStructV2.ADAPTER.encodedSizeWithTag(3, webcastRoomStructV2.owner) + ProtoAdapter.STRING.encodedSizeWithTag(4, webcastRoomStructV2.title) + ProtoAdapter.INT32.encodedSizeWithTag(5, webcastRoomStructV2.user_count) + ProtoAdapter.INT64.encodedSizeWithTag(6, webcastRoomStructV2.create_time) + ProtoAdapter.INT64.encodedSizeWithTag(7, webcastRoomStructV2.finish_time) + ProtoAdapter.INT64.encodedSizeWithTag(8, webcastRoomStructV2.stream_id) + StreamUrlStructV2.ADAPTER.encodedSizeWithTag(9, webcastRoomStructV2.stream_url) + ShareStructV2.ADAPTER.encodedSizeWithTag(10, webcastRoomStructV2.share_info) + ProtoAdapter.INT32.encodedSizeWithTag(11, webcastRoomStructV2.digg_count) + ProtoAdapter.INT32.encodedSizeWithTag(12, webcastRoomStructV2.total_user_count) + ProtoAdapter.INT32.encodedSizeWithTag(13, webcastRoomStructV2.coins) + ProtoAdapter.BOOL.encodedSizeWithTag(14, webcastRoomStructV2.in_sandbox) + UrlStructV2.ADAPTER.encodedSizeWithTag(15, webcastRoomStructV2.dynamic_cover) + UrlStructV2.ADAPTER.encodedSizeWithTag(16, webcastRoomStructV2.room_cover) + ProtoAdapter.STRING.encodedSizeWithTag(17, webcastRoomStructV2.room_type_tag) + StreamUrlStructV2.ADAPTER.encodedSizeWithTag(18, webcastRoomStructV2.additional_stream_url) + UrlStructV2.ADAPTER.encodedSizeWithTag(19, webcastRoomStructV2.webp_cover) + ProtoAdapter.STRING.encodedSizeWithTag(20, webcastRoomStructV2.extra) + ProtoAdapter.BOOL.encodedSizeWithTag(21, webcastRoomStructV2.live_type_audio) + ProtoAdapter.BOOL.encodedSizeWithTag(22, webcastRoomStructV2.live_type_third_party) + ProtoAdapter.BOOL.encodedSizeWithTag(23, webcastRoomStructV2.live_type_screenshot) + ProtoAdapter.BOOL.encodedSizeWithTag(24, webcastRoomStructV2.live_type_official) + ProtoAdapter.BOOL.encodedSizeWithTag(25, webcastRoomStructV2.live_type_normal) + ProtoAdapter.BOOL.encodedSizeWithTag(26, webcastRoomStructV2.live_type_linkmic) + ProtoAdapter.BOOL.encodedSizeWithTag(27, webcastRoomStructV2.live_type_sandbox) + webcastRoomStructV2.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, WebcastRoomStructV2 webcastRoomStructV2) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, webcastRoomStructV2.room_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, webcastRoomStructV2.status);
            UserStructV2.ADAPTER.encodeWithTag(protoWriter, 3, webcastRoomStructV2.owner);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, webcastRoomStructV2.title);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, webcastRoomStructV2.user_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, webcastRoomStructV2.create_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, webcastRoomStructV2.finish_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, webcastRoomStructV2.stream_id);
            StreamUrlStructV2.ADAPTER.encodeWithTag(protoWriter, 9, webcastRoomStructV2.stream_url);
            ShareStructV2.ADAPTER.encodeWithTag(protoWriter, 10, webcastRoomStructV2.share_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, webcastRoomStructV2.digg_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, webcastRoomStructV2.total_user_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, webcastRoomStructV2.coins);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, webcastRoomStructV2.in_sandbox);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 15, webcastRoomStructV2.dynamic_cover);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 16, webcastRoomStructV2.room_cover);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, webcastRoomStructV2.room_type_tag);
            StreamUrlStructV2.ADAPTER.encodeWithTag(protoWriter, 18, webcastRoomStructV2.additional_stream_url);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 19, webcastRoomStructV2.webp_cover);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 20, webcastRoomStructV2.extra);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, webcastRoomStructV2.live_type_audio);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 22, webcastRoomStructV2.live_type_third_party);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, webcastRoomStructV2.live_type_screenshot);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 24, webcastRoomStructV2.live_type_official);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 25, webcastRoomStructV2.live_type_normal);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 26, webcastRoomStructV2.live_type_linkmic);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, webcastRoomStructV2.live_type_sandbox);
            protoWriter.writeBytes(webcastRoomStructV2.unknownFields());
        }
    }

    public WebcastRoomStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.room_id = this.room_id;
        builder.status = this.status;
        builder.owner = this.owner;
        builder.title = this.title;
        builder.user_count = this.user_count;
        builder.create_time = this.create_time;
        builder.finish_time = this.finish_time;
        builder.stream_id = this.stream_id;
        builder.stream_url = this.stream_url;
        builder.share_info = this.share_info;
        builder.digg_count = this.digg_count;
        builder.total_user_count = this.total_user_count;
        builder.coins = this.coins;
        builder.in_sandbox = this.in_sandbox;
        builder.dynamic_cover = this.dynamic_cover;
        builder.room_cover = this.room_cover;
        builder.room_type_tag = this.room_type_tag;
        builder.additional_stream_url = this.additional_stream_url;
        builder.webp_cover = this.webp_cover;
        builder.extra = this.extra;
        builder.live_type_audio = this.live_type_audio;
        builder.live_type_third_party = this.live_type_third_party;
        builder.live_type_screenshot = this.live_type_screenshot;
        builder.live_type_official = this.live_type_official;
        builder.live_type_normal = this.live_type_normal;
        builder.live_type_linkmic = this.live_type_linkmic;
        builder.live_type_sandbox = this.live_type_sandbox;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27 = this.hashCode;
        if (i27 != 0) {
            return i27;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i28 = 0;
        if (this.room_id != null) {
            i = this.room_id.hashCode();
        } else {
            i = 0;
        }
        int i29 = (hashCode + i) * 37;
        if (this.status != null) {
            i2 = this.status.hashCode();
        } else {
            i2 = 0;
        }
        int i30 = (i29 + i2) * 37;
        if (this.owner != null) {
            i3 = this.owner.hashCode();
        } else {
            i3 = 0;
        }
        int i31 = (i30 + i3) * 37;
        if (this.title != null) {
            i4 = this.title.hashCode();
        } else {
            i4 = 0;
        }
        int i32 = (i31 + i4) * 37;
        if (this.user_count != null) {
            i5 = this.user_count.hashCode();
        } else {
            i5 = 0;
        }
        int i33 = (i32 + i5) * 37;
        if (this.create_time != null) {
            i6 = this.create_time.hashCode();
        } else {
            i6 = 0;
        }
        int i34 = (i33 + i6) * 37;
        if (this.finish_time != null) {
            i7 = this.finish_time.hashCode();
        } else {
            i7 = 0;
        }
        int i35 = (i34 + i7) * 37;
        if (this.stream_id != null) {
            i8 = this.stream_id.hashCode();
        } else {
            i8 = 0;
        }
        int i36 = (i35 + i8) * 37;
        if (this.stream_url != null) {
            i9 = this.stream_url.hashCode();
        } else {
            i9 = 0;
        }
        int i37 = (i36 + i9) * 37;
        if (this.share_info != null) {
            i10 = this.share_info.hashCode();
        } else {
            i10 = 0;
        }
        int i38 = (i37 + i10) * 37;
        if (this.digg_count != null) {
            i11 = this.digg_count.hashCode();
        } else {
            i11 = 0;
        }
        int i39 = (i38 + i11) * 37;
        if (this.total_user_count != null) {
            i12 = this.total_user_count.hashCode();
        } else {
            i12 = 0;
        }
        int i40 = (i39 + i12) * 37;
        if (this.coins != null) {
            i13 = this.coins.hashCode();
        } else {
            i13 = 0;
        }
        int i41 = (i40 + i13) * 37;
        if (this.in_sandbox != null) {
            i14 = this.in_sandbox.hashCode();
        } else {
            i14 = 0;
        }
        int i42 = (i41 + i14) * 37;
        if (this.dynamic_cover != null) {
            i15 = this.dynamic_cover.hashCode();
        } else {
            i15 = 0;
        }
        int i43 = (i42 + i15) * 37;
        if (this.room_cover != null) {
            i16 = this.room_cover.hashCode();
        } else {
            i16 = 0;
        }
        int i44 = (i43 + i16) * 37;
        if (this.room_type_tag != null) {
            i17 = this.room_type_tag.hashCode();
        } else {
            i17 = 0;
        }
        int i45 = (i44 + i17) * 37;
        if (this.additional_stream_url != null) {
            i18 = this.additional_stream_url.hashCode();
        } else {
            i18 = 0;
        }
        int i46 = (i45 + i18) * 37;
        if (this.webp_cover != null) {
            i19 = this.webp_cover.hashCode();
        } else {
            i19 = 0;
        }
        int i47 = (i46 + i19) * 37;
        if (this.extra != null) {
            i20 = this.extra.hashCode();
        } else {
            i20 = 0;
        }
        int i48 = (i47 + i20) * 37;
        if (this.live_type_audio != null) {
            i21 = this.live_type_audio.hashCode();
        } else {
            i21 = 0;
        }
        int i49 = (i48 + i21) * 37;
        if (this.live_type_third_party != null) {
            i22 = this.live_type_third_party.hashCode();
        } else {
            i22 = 0;
        }
        int i50 = (i49 + i22) * 37;
        if (this.live_type_screenshot != null) {
            i23 = this.live_type_screenshot.hashCode();
        } else {
            i23 = 0;
        }
        int i51 = (i50 + i23) * 37;
        if (this.live_type_official != null) {
            i24 = this.live_type_official.hashCode();
        } else {
            i24 = 0;
        }
        int i52 = (i51 + i24) * 37;
        if (this.live_type_normal != null) {
            i25 = this.live_type_normal.hashCode();
        } else {
            i25 = 0;
        }
        int i53 = (i52 + i25) * 37;
        if (this.live_type_linkmic != null) {
            i26 = this.live_type_linkmic.hashCode();
        } else {
            i26 = 0;
        }
        int i54 = (i53 + i26) * 37;
        if (this.live_type_sandbox != null) {
            i28 = this.live_type_sandbox.hashCode();
        }
        int i55 = i54 + i28;
        this.hashCode = i55;
        return i55;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.room_id != null) {
            sb.append(", room_id=");
            sb.append(this.room_id);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.owner != null) {
            sb.append(", owner=");
            sb.append(this.owner);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.user_count != null) {
            sb.append(", user_count=");
            sb.append(this.user_count);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.finish_time != null) {
            sb.append(", finish_time=");
            sb.append(this.finish_time);
        }
        if (this.stream_id != null) {
            sb.append(", stream_id=");
            sb.append(this.stream_id);
        }
        if (this.stream_url != null) {
            sb.append(", stream_url=");
            sb.append(this.stream_url);
        }
        if (this.share_info != null) {
            sb.append(", share_info=");
            sb.append(this.share_info);
        }
        if (this.digg_count != null) {
            sb.append(", digg_count=");
            sb.append(this.digg_count);
        }
        if (this.total_user_count != null) {
            sb.append(", total_user_count=");
            sb.append(this.total_user_count);
        }
        if (this.coins != null) {
            sb.append(", coins=");
            sb.append(this.coins);
        }
        if (this.in_sandbox != null) {
            sb.append(", in_sandbox=");
            sb.append(this.in_sandbox);
        }
        if (this.dynamic_cover != null) {
            sb.append(", dynamic_cover=");
            sb.append(this.dynamic_cover);
        }
        if (this.room_cover != null) {
            sb.append(", room_cover=");
            sb.append(this.room_cover);
        }
        if (this.room_type_tag != null) {
            sb.append(", room_type_tag=");
            sb.append(this.room_type_tag);
        }
        if (this.additional_stream_url != null) {
            sb.append(", additional_stream_url=");
            sb.append(this.additional_stream_url);
        }
        if (this.webp_cover != null) {
            sb.append(", webp_cover=");
            sb.append(this.webp_cover);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.live_type_audio != null) {
            sb.append(", live_type_audio=");
            sb.append(this.live_type_audio);
        }
        if (this.live_type_third_party != null) {
            sb.append(", live_type_third_party=");
            sb.append(this.live_type_third_party);
        }
        if (this.live_type_screenshot != null) {
            sb.append(", live_type_screenshot=");
            sb.append(this.live_type_screenshot);
        }
        if (this.live_type_official != null) {
            sb.append(", live_type_official=");
            sb.append(this.live_type_official);
        }
        if (this.live_type_normal != null) {
            sb.append(", live_type_normal=");
            sb.append(this.live_type_normal);
        }
        if (this.live_type_linkmic != null) {
            sb.append(", live_type_linkmic=");
            sb.append(this.live_type_linkmic);
        }
        if (this.live_type_sandbox != null) {
            sb.append(", live_type_sandbox=");
            sb.append(this.live_type_sandbox);
        }
        StringBuilder replace = sb.replace(0, 2, "WebcastRoomStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebcastRoomStructV2)) {
            return false;
        }
        WebcastRoomStructV2 webcastRoomStructV2 = (WebcastRoomStructV2) obj;
        if (!unknownFields().equals(webcastRoomStructV2.unknownFields()) || !Internal.equals(this.room_id, webcastRoomStructV2.room_id) || !Internal.equals(this.status, webcastRoomStructV2.status) || !Internal.equals(this.owner, webcastRoomStructV2.owner) || !Internal.equals(this.title, webcastRoomStructV2.title) || !Internal.equals(this.user_count, webcastRoomStructV2.user_count) || !Internal.equals(this.create_time, webcastRoomStructV2.create_time) || !Internal.equals(this.finish_time, webcastRoomStructV2.finish_time) || !Internal.equals(this.stream_id, webcastRoomStructV2.stream_id) || !Internal.equals(this.stream_url, webcastRoomStructV2.stream_url) || !Internal.equals(this.share_info, webcastRoomStructV2.share_info) || !Internal.equals(this.digg_count, webcastRoomStructV2.digg_count) || !Internal.equals(this.total_user_count, webcastRoomStructV2.total_user_count) || !Internal.equals(this.coins, webcastRoomStructV2.coins) || !Internal.equals(this.in_sandbox, webcastRoomStructV2.in_sandbox) || !Internal.equals(this.dynamic_cover, webcastRoomStructV2.dynamic_cover) || !Internal.equals(this.room_cover, webcastRoomStructV2.room_cover) || !Internal.equals(this.room_type_tag, webcastRoomStructV2.room_type_tag) || !Internal.equals(this.additional_stream_url, webcastRoomStructV2.additional_stream_url) || !Internal.equals(this.webp_cover, webcastRoomStructV2.webp_cover) || !Internal.equals(this.extra, webcastRoomStructV2.extra) || !Internal.equals(this.live_type_audio, webcastRoomStructV2.live_type_audio) || !Internal.equals(this.live_type_third_party, webcastRoomStructV2.live_type_third_party) || !Internal.equals(this.live_type_screenshot, webcastRoomStructV2.live_type_screenshot) || !Internal.equals(this.live_type_official, webcastRoomStructV2.live_type_official) || !Internal.equals(this.live_type_normal, webcastRoomStructV2.live_type_normal) || !Internal.equals(this.live_type_linkmic, webcastRoomStructV2.live_type_linkmic) || !Internal.equals(this.live_type_sandbox, webcastRoomStructV2.live_type_sandbox)) {
            return false;
        }
        return true;
    }

    public WebcastRoomStructV2(Long l, Integer num, UserStructV2 userStructV2, String str, Integer num2, Long l2, Long l3, Long l4, StreamUrlStructV2 streamUrlStructV2, ShareStructV2 shareStructV2, Integer num3, Integer num4, Integer num5, Boolean bool, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, String str2, StreamUrlStructV2 streamUrlStructV22, UrlStructV2 urlStructV23, String str3, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8) {
        this(l, num, userStructV2, str, num2, l2, l3, l4, streamUrlStructV2, shareStructV2, num3, num4, num5, bool, urlStructV2, urlStructV22, str2, streamUrlStructV22, urlStructV23, str3, bool2, bool3, bool4, bool5, bool6, bool7, bool8, ByteString.EMPTY);
    }

    public WebcastRoomStructV2(Long l, Integer num, UserStructV2 userStructV2, String str, Integer num2, Long l2, Long l3, Long l4, StreamUrlStructV2 streamUrlStructV2, ShareStructV2 shareStructV2, Integer num3, Integer num4, Integer num5, Boolean bool, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, String str2, StreamUrlStructV2 streamUrlStructV22, UrlStructV2 urlStructV23, String str3, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.room_id = l;
        this.status = num;
        this.owner = userStructV2;
        this.title = str;
        this.user_count = num2;
        this.create_time = l2;
        this.finish_time = l3;
        this.stream_id = l4;
        this.stream_url = streamUrlStructV2;
        this.share_info = shareStructV2;
        this.digg_count = num3;
        this.total_user_count = num4;
        this.coins = num5;
        this.in_sandbox = bool;
        this.dynamic_cover = urlStructV2;
        this.room_cover = urlStructV22;
        this.room_type_tag = str2;
        this.additional_stream_url = streamUrlStructV22;
        this.webp_cover = urlStructV23;
        this.extra = str3;
        this.live_type_audio = bool2;
        this.live_type_third_party = bool3;
        this.live_type_screenshot = bool4;
        this.live_type_official = bool5;
        this.live_type_normal = bool6;
        this.live_type_linkmic = bool7;
        this.live_type_sandbox = bool8;
    }
}
