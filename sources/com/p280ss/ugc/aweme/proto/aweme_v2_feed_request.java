package com.p280ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.aweme_v2_feed_request */
final class aweme_v2_feed_request extends Message<aweme_v2_feed_request, Builder> {
    public static final ProtoAdapter<aweme_v2_feed_request> ADAPTER = new ProtoAdapter_aweme_v2_feed_request();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 10)
    public Integer address_book_access;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public Long aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 18)
    public Integer cached_item_num;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 13)
    public String content_language;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 14)
    public String discard_cids;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 17)
    public String download_sdk_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public Integer feed_style;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 11)
    public Integer gps_access;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 15)
    public Long interest_select_duration;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 19)
    public Integer last_ad_show_interval;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long max_cursor;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long min_cursor;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 9)
    public Integer need_relieve_aweme;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 16)
    public String preload_aweme_ids;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public Integer pull_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 12)
    public String top_view_cid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public String volume;

    /* renamed from: com.ss.ugc.aweme.proto.aweme_v2_feed_request$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<aweme_v2_feed_request, Builder> {
        public Integer address_book_access;
        public Long aweme_id;
        public Integer cached_item_num;
        public String content_language;
        public Integer count;
        public String discard_cids;
        public String download_sdk_info;
        public Integer feed_style;
        public Integer gps_access;
        public Long interest_select_duration;
        public Integer last_ad_show_interval;
        public Long max_cursor;
        public Long min_cursor;
        public Integer need_relieve_aweme;
        public String preload_aweme_ids;
        public Integer pull_type;
        public String top_view_cid;
        public Integer type;
        public String volume;

        public final aweme_v2_feed_request build() {
            aweme_v2_feed_request aweme_v2_feed_request = new aweme_v2_feed_request(this.type, this.max_cursor, this.min_cursor, this.count, this.feed_style, this.aweme_id, this.pull_type, this.volume, this.need_relieve_aweme, this.address_book_access, this.gps_access, this.top_view_cid, this.content_language, this.discard_cids, this.interest_select_duration, this.preload_aweme_ids, this.download_sdk_info, this.cached_item_num, this.last_ad_show_interval, super.buildUnknownFields());
            return aweme_v2_feed_request;
        }

        public final Builder address_book_access(Integer num) {
            this.address_book_access = num;
            return this;
        }

        public final Builder aweme_id(Long l) {
            this.aweme_id = l;
            return this;
        }

        public final Builder cached_item_num(Integer num) {
            this.cached_item_num = num;
            return this;
        }

        public final Builder content_language(String str) {
            this.content_language = str;
            return this;
        }

        public final Builder count(Integer num) {
            this.count = num;
            return this;
        }

        public final Builder discard_cids(String str) {
            this.discard_cids = str;
            return this;
        }

        public final Builder download_sdk_info(String str) {
            this.download_sdk_info = str;
            return this;
        }

        public final Builder feed_style(Integer num) {
            this.feed_style = num;
            return this;
        }

        public final Builder gps_access(Integer num) {
            this.gps_access = num;
            return this;
        }

        public final Builder interest_select_duration(Long l) {
            this.interest_select_duration = l;
            return this;
        }

        public final Builder last_ad_show_interval(Integer num) {
            this.last_ad_show_interval = num;
            return this;
        }

        public final Builder max_cursor(Long l) {
            this.max_cursor = l;
            return this;
        }

        public final Builder min_cursor(Long l) {
            this.min_cursor = l;
            return this;
        }

        public final Builder need_relieve_aweme(Integer num) {
            this.need_relieve_aweme = num;
            return this;
        }

        public final Builder preload_aweme_ids(String str) {
            this.preload_aweme_ids = str;
            return this;
        }

        public final Builder pull_type(Integer num) {
            this.pull_type = num;
            return this;
        }

        public final Builder top_view_cid(String str) {
            this.top_view_cid = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder volume(String str) {
            this.volume = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.aweme_v2_feed_request$ProtoAdapter_aweme_v2_feed_request */
    static final class ProtoAdapter_aweme_v2_feed_request extends ProtoAdapter<aweme_v2_feed_request> {
        public ProtoAdapter_aweme_v2_feed_request() {
            super(FieldEncoding.LENGTH_DELIMITED, aweme_v2_feed_request.class);
        }

        public final int encodedSize(aweme_v2_feed_request aweme_v2_feed_request) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, aweme_v2_feed_request.type) + ProtoAdapter.INT64.encodedSizeWithTag(2, aweme_v2_feed_request.max_cursor) + ProtoAdapter.INT64.encodedSizeWithTag(3, aweme_v2_feed_request.min_cursor) + ProtoAdapter.INT32.encodedSizeWithTag(4, aweme_v2_feed_request.count) + ProtoAdapter.INT32.encodedSizeWithTag(5, aweme_v2_feed_request.feed_style) + ProtoAdapter.INT64.encodedSizeWithTag(6, aweme_v2_feed_request.aweme_id) + ProtoAdapter.INT32.encodedSizeWithTag(7, aweme_v2_feed_request.pull_type) + ProtoAdapter.STRING.encodedSizeWithTag(8, aweme_v2_feed_request.volume) + ProtoAdapter.INT32.encodedSizeWithTag(9, aweme_v2_feed_request.need_relieve_aweme) + ProtoAdapter.INT32.encodedSizeWithTag(10, aweme_v2_feed_request.address_book_access) + ProtoAdapter.INT32.encodedSizeWithTag(11, aweme_v2_feed_request.gps_access) + ProtoAdapter.STRING.encodedSizeWithTag(12, aweme_v2_feed_request.top_view_cid) + ProtoAdapter.STRING.encodedSizeWithTag(13, aweme_v2_feed_request.content_language) + ProtoAdapter.STRING.encodedSizeWithTag(14, aweme_v2_feed_request.discard_cids) + ProtoAdapter.INT64.encodedSizeWithTag(15, aweme_v2_feed_request.interest_select_duration) + ProtoAdapter.STRING.encodedSizeWithTag(16, aweme_v2_feed_request.preload_aweme_ids) + ProtoAdapter.STRING.encodedSizeWithTag(17, aweme_v2_feed_request.download_sdk_info) + ProtoAdapter.INT32.encodedSizeWithTag(18, aweme_v2_feed_request.cached_item_num) + ProtoAdapter.INT32.encodedSizeWithTag(19, aweme_v2_feed_request.last_ad_show_interval) + aweme_v2_feed_request.unknownFields().size();
        }

        public final aweme_v2_feed_request decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.max_cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.min_cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.feed_style((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            builder.aweme_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 7:
                            builder.pull_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 8:
                            builder.volume((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.need_relieve_aweme((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 10:
                            builder.address_book_access((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 11:
                            builder.gps_access((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 12:
                            builder.top_view_cid((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 13:
                            builder.content_language((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 14:
                            builder.discard_cids((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            builder.interest_select_duration((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 16:
                            builder.preload_aweme_ids((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 17:
                            builder.download_sdk_info((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 18:
                            builder.cached_item_num((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 19:
                            builder.last_ad_show_interval((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, aweme_v2_feed_request aweme_v2_feed_request) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, aweme_v2_feed_request.type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, aweme_v2_feed_request.max_cursor);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, aweme_v2_feed_request.min_cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, aweme_v2_feed_request.count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, aweme_v2_feed_request.feed_style);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, aweme_v2_feed_request.aweme_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, aweme_v2_feed_request.pull_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, aweme_v2_feed_request.volume);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, aweme_v2_feed_request.need_relieve_aweme);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, aweme_v2_feed_request.address_book_access);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, aweme_v2_feed_request.gps_access);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, aweme_v2_feed_request.top_view_cid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, aweme_v2_feed_request.content_language);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, aweme_v2_feed_request.discard_cids);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 15, aweme_v2_feed_request.interest_select_duration);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, aweme_v2_feed_request.preload_aweme_ids);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, aweme_v2_feed_request.download_sdk_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 18, aweme_v2_feed_request.cached_item_num);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 19, aweme_v2_feed_request.last_ad_show_interval);
            protoWriter.writeBytes(aweme_v2_feed_request.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.max_cursor = this.max_cursor;
        builder.min_cursor = this.min_cursor;
        builder.count = this.count;
        builder.feed_style = this.feed_style;
        builder.aweme_id = this.aweme_id;
        builder.pull_type = this.pull_type;
        builder.volume = this.volume;
        builder.need_relieve_aweme = this.need_relieve_aweme;
        builder.address_book_access = this.address_book_access;
        builder.gps_access = this.gps_access;
        builder.top_view_cid = this.top_view_cid;
        builder.content_language = this.content_language;
        builder.discard_cids = this.discard_cids;
        builder.interest_select_duration = this.interest_select_duration;
        builder.preload_aweme_ids = this.preload_aweme_ids;
        builder.download_sdk_info = this.download_sdk_info;
        builder.cached_item_num = this.cached_item_num;
        builder.last_ad_show_interval = this.last_ad_show_interval;
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
        int i19 = this.hashCode;
        if (i19 != 0) {
            return i19;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i20 = 0;
        if (this.type != null) {
            i = this.type.hashCode();
        } else {
            i = 0;
        }
        int i21 = (hashCode + i) * 37;
        if (this.max_cursor != null) {
            i2 = this.max_cursor.hashCode();
        } else {
            i2 = 0;
        }
        int i22 = (i21 + i2) * 37;
        if (this.min_cursor != null) {
            i3 = this.min_cursor.hashCode();
        } else {
            i3 = 0;
        }
        int i23 = (i22 + i3) * 37;
        if (this.count != null) {
            i4 = this.count.hashCode();
        } else {
            i4 = 0;
        }
        int i24 = (i23 + i4) * 37;
        if (this.feed_style != null) {
            i5 = this.feed_style.hashCode();
        } else {
            i5 = 0;
        }
        int i25 = (i24 + i5) * 37;
        if (this.aweme_id != null) {
            i6 = this.aweme_id.hashCode();
        } else {
            i6 = 0;
        }
        int i26 = (i25 + i6) * 37;
        if (this.pull_type != null) {
            i7 = this.pull_type.hashCode();
        } else {
            i7 = 0;
        }
        int i27 = (i26 + i7) * 37;
        if (this.volume != null) {
            i8 = this.volume.hashCode();
        } else {
            i8 = 0;
        }
        int i28 = (i27 + i8) * 37;
        if (this.need_relieve_aweme != null) {
            i9 = this.need_relieve_aweme.hashCode();
        } else {
            i9 = 0;
        }
        int i29 = (i28 + i9) * 37;
        if (this.address_book_access != null) {
            i10 = this.address_book_access.hashCode();
        } else {
            i10 = 0;
        }
        int i30 = (i29 + i10) * 37;
        if (this.gps_access != null) {
            i11 = this.gps_access.hashCode();
        } else {
            i11 = 0;
        }
        int i31 = (i30 + i11) * 37;
        if (this.top_view_cid != null) {
            i12 = this.top_view_cid.hashCode();
        } else {
            i12 = 0;
        }
        int i32 = (i31 + i12) * 37;
        if (this.content_language != null) {
            i13 = this.content_language.hashCode();
        } else {
            i13 = 0;
        }
        int i33 = (i32 + i13) * 37;
        if (this.discard_cids != null) {
            i14 = this.discard_cids.hashCode();
        } else {
            i14 = 0;
        }
        int i34 = (i33 + i14) * 37;
        if (this.interest_select_duration != null) {
            i15 = this.interest_select_duration.hashCode();
        } else {
            i15 = 0;
        }
        int i35 = (i34 + i15) * 37;
        if (this.preload_aweme_ids != null) {
            i16 = this.preload_aweme_ids.hashCode();
        } else {
            i16 = 0;
        }
        int i36 = (i35 + i16) * 37;
        if (this.download_sdk_info != null) {
            i17 = this.download_sdk_info.hashCode();
        } else {
            i17 = 0;
        }
        int i37 = (i36 + i17) * 37;
        if (this.cached_item_num != null) {
            i18 = this.cached_item_num.hashCode();
        } else {
            i18 = 0;
        }
        int i38 = (i37 + i18) * 37;
        if (this.last_ad_show_interval != null) {
            i20 = this.last_ad_show_interval.hashCode();
        }
        int i39 = i38 + i20;
        this.hashCode = i39;
        return i39;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.max_cursor != null) {
            sb.append(", max_cursor=");
            sb.append(this.max_cursor);
        }
        if (this.min_cursor != null) {
            sb.append(", min_cursor=");
            sb.append(this.min_cursor);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.feed_style != null) {
            sb.append(", feed_style=");
            sb.append(this.feed_style);
        }
        if (this.aweme_id != null) {
            sb.append(", aweme_id=");
            sb.append(this.aweme_id);
        }
        if (this.pull_type != null) {
            sb.append(", pull_type=");
            sb.append(this.pull_type);
        }
        if (this.volume != null) {
            sb.append(", volume=");
            sb.append(this.volume);
        }
        if (this.need_relieve_aweme != null) {
            sb.append(", need_relieve_aweme=");
            sb.append(this.need_relieve_aweme);
        }
        if (this.address_book_access != null) {
            sb.append(", address_book_access=");
            sb.append(this.address_book_access);
        }
        if (this.gps_access != null) {
            sb.append(", gps_access=");
            sb.append(this.gps_access);
        }
        if (this.top_view_cid != null) {
            sb.append(", top_view_cid=");
            sb.append(this.top_view_cid);
        }
        if (this.content_language != null) {
            sb.append(", content_language=");
            sb.append(this.content_language);
        }
        if (this.discard_cids != null) {
            sb.append(", discard_cids=");
            sb.append(this.discard_cids);
        }
        if (this.interest_select_duration != null) {
            sb.append(", interest_select_duration=");
            sb.append(this.interest_select_duration);
        }
        if (this.preload_aweme_ids != null) {
            sb.append(", preload_aweme_ids=");
            sb.append(this.preload_aweme_ids);
        }
        if (this.download_sdk_info != null) {
            sb.append(", download_sdk_info=");
            sb.append(this.download_sdk_info);
        }
        if (this.cached_item_num != null) {
            sb.append(", cached_item_num=");
            sb.append(this.cached_item_num);
        }
        if (this.last_ad_show_interval != null) {
            sb.append(", last_ad_show_interval=");
            sb.append(this.last_ad_show_interval);
        }
        StringBuilder replace = sb.replace(0, 2, "aweme_v2_feed_request{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aweme_v2_feed_request)) {
            return false;
        }
        aweme_v2_feed_request aweme_v2_feed_request = (aweme_v2_feed_request) obj;
        if (!unknownFields().equals(aweme_v2_feed_request.unknownFields()) || !Internal.equals(this.type, aweme_v2_feed_request.type) || !Internal.equals(this.max_cursor, aweme_v2_feed_request.max_cursor) || !Internal.equals(this.min_cursor, aweme_v2_feed_request.min_cursor) || !Internal.equals(this.count, aweme_v2_feed_request.count) || !Internal.equals(this.feed_style, aweme_v2_feed_request.feed_style) || !Internal.equals(this.aweme_id, aweme_v2_feed_request.aweme_id) || !Internal.equals(this.pull_type, aweme_v2_feed_request.pull_type) || !Internal.equals(this.volume, aweme_v2_feed_request.volume) || !Internal.equals(this.need_relieve_aweme, aweme_v2_feed_request.need_relieve_aweme) || !Internal.equals(this.address_book_access, aweme_v2_feed_request.address_book_access) || !Internal.equals(this.gps_access, aweme_v2_feed_request.gps_access) || !Internal.equals(this.top_view_cid, aweme_v2_feed_request.top_view_cid) || !Internal.equals(this.content_language, aweme_v2_feed_request.content_language) || !Internal.equals(this.discard_cids, aweme_v2_feed_request.discard_cids) || !Internal.equals(this.interest_select_duration, aweme_v2_feed_request.interest_select_duration) || !Internal.equals(this.preload_aweme_ids, aweme_v2_feed_request.preload_aweme_ids) || !Internal.equals(this.download_sdk_info, aweme_v2_feed_request.download_sdk_info) || !Internal.equals(this.cached_item_num, aweme_v2_feed_request.cached_item_num) || !Internal.equals(this.last_ad_show_interval, aweme_v2_feed_request.last_ad_show_interval)) {
            return false;
        }
        return true;
    }

    public aweme_v2_feed_request(Integer num, Long l, Long l2, Integer num2, Integer num3, Long l3, Integer num4, String str, Integer num5, Integer num6, Integer num7, String str2, String str3, String str4, Long l4, String str5, String str6, Integer num8, Integer num9) {
        this(num, l, l2, num2, num3, l3, num4, str, num5, num6, num7, str2, str3, str4, l4, str5, str6, num8, num9, ByteString.EMPTY);
    }

    public aweme_v2_feed_request(Integer num, Long l, Long l2, Integer num2, Integer num3, Long l3, Integer num4, String str, Integer num5, Integer num6, Integer num7, String str2, String str3, String str4, Long l4, String str5, String str6, Integer num8, Integer num9, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = num;
        this.max_cursor = l;
        this.min_cursor = l2;
        this.count = num2;
        this.feed_style = num3;
        this.aweme_id = l3;
        this.pull_type = num4;
        this.volume = str;
        this.need_relieve_aweme = num5;
        this.address_book_access = num6;
        this.gps_access = num7;
        this.top_view_cid = str2;
        this.content_language = str3;
        this.discard_cids = str4;
        this.interest_select_duration = l4;
        this.preload_aweme_ids = str5;
        this.download_sdk_info = str6;
        this.cached_item_num = num8;
        this.last_ad_show_interval = num9;
    }
}
