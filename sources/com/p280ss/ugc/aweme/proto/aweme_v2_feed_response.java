package com.p280ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.aweme_v2_feed_response */
public final class aweme_v2_feed_response extends Message<aweme_v2_feed_response, Builder> {
    public static final ProtoAdapter<aweme_v2_feed_response> ADAPTER = new ProtoAdapter_aweme_v2_feed_response();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public String DebugInfo;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeStructV2#ADAPTER", label = Label.REPEATED, tag = 5)
    public List<AwemeStructV2> aweme_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 15)
    public Integer block_code;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ExtraStructV2#ADAPTER", tag = 9)
    public ExtraStructV2 extra;
    @WireField(adapter = "com.ss.ugc.aweme.proto.GuideWordV2#ADAPTER", tag = 12)
    public GuideWordV2 guide_word;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer has_more;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public Integer home_model;
    @WireField(adapter = "com.ss.ugc.aweme.proto.LogPbStructV2#ADAPTER", tag = 10)
    public LogPbStructV2 log_pb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long max_cursor;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long min_cursor;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeStructV2#ADAPTER", label = Label.REPEATED, tag = 13)
    public List<AwemeStructV2> preload_ads;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeStructV2#ADAPTER", label = Label.REPEATED, tag = 16)
    public List<AwemeStructV2> preload_awemes;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 8)
    public Integer refresh_clear;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public String rid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer status_code;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 14)
    public String status_msg;

    /* renamed from: com.ss.ugc.aweme.proto.aweme_v2_feed_response$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<aweme_v2_feed_response, Builder> {
        public String DebugInfo;
        public List<AwemeStructV2> aweme_list = Internal.newMutableList();
        public Integer block_code;
        public ExtraStructV2 extra;
        public GuideWordV2 guide_word;
        public Integer has_more;
        public Integer home_model;
        public LogPbStructV2 log_pb;
        public Long max_cursor;
        public Long min_cursor;
        public List<AwemeStructV2> preload_ads = Internal.newMutableList();
        public List<AwemeStructV2> preload_awemes = Internal.newMutableList();
        public Integer refresh_clear;
        public String rid;
        public Integer status_code;
        public String status_msg;

        public final aweme_v2_feed_response build() {
            aweme_v2_feed_response aweme_v2_feed_response = new aweme_v2_feed_response(this.status_code, this.min_cursor, this.max_cursor, this.has_more, this.aweme_list, this.rid, this.home_model, this.refresh_clear, this.extra, this.log_pb, this.DebugInfo, this.guide_word, this.preload_ads, this.status_msg, this.block_code, this.preload_awemes, super.buildUnknownFields());
            return aweme_v2_feed_response;
        }

        public final Builder DebugInfo(String str) {
            this.DebugInfo = str;
            return this;
        }

        public final Builder block_code(Integer num) {
            this.block_code = num;
            return this;
        }

        public final Builder extra(ExtraStructV2 extraStructV2) {
            this.extra = extraStructV2;
            return this;
        }

        public final Builder guide_word(GuideWordV2 guideWordV2) {
            this.guide_word = guideWordV2;
            return this;
        }

        public final Builder has_more(Integer num) {
            this.has_more = num;
            return this;
        }

        public final Builder home_model(Integer num) {
            this.home_model = num;
            return this;
        }

        public final Builder log_pb(LogPbStructV2 logPbStructV2) {
            this.log_pb = logPbStructV2;
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

        public final Builder refresh_clear(Integer num) {
            this.refresh_clear = num;
            return this;
        }

        public final Builder rid(String str) {
            this.rid = str;
            return this;
        }

        public final Builder status_code(Integer num) {
            this.status_code = num;
            return this;
        }

        public final Builder status_msg(String str) {
            this.status_msg = str;
            return this;
        }

        public final Builder aweme_list(List<AwemeStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.aweme_list = list;
            return this;
        }

        public final Builder preload_ads(List<AwemeStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.preload_ads = list;
            return this;
        }

        public final Builder preload_awemes(List<AwemeStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.preload_awemes = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.aweme_v2_feed_response$ProtoAdapter_aweme_v2_feed_response */
    static final class ProtoAdapter_aweme_v2_feed_response extends ProtoAdapter<aweme_v2_feed_response> {
        public ProtoAdapter_aweme_v2_feed_response() {
            super(FieldEncoding.LENGTH_DELIMITED, aweme_v2_feed_response.class);
        }

        public final int encodedSize(aweme_v2_feed_response aweme_v2_feed_response) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, aweme_v2_feed_response.status_code) + ProtoAdapter.INT64.encodedSizeWithTag(2, aweme_v2_feed_response.min_cursor) + ProtoAdapter.INT64.encodedSizeWithTag(3, aweme_v2_feed_response.max_cursor) + ProtoAdapter.INT32.encodedSizeWithTag(4, aweme_v2_feed_response.has_more) + AwemeStructV2.ADAPTER.asRepeated().encodedSizeWithTag(5, aweme_v2_feed_response.aweme_list) + ProtoAdapter.STRING.encodedSizeWithTag(6, aweme_v2_feed_response.rid) + ProtoAdapter.INT32.encodedSizeWithTag(7, aweme_v2_feed_response.home_model) + ProtoAdapter.INT32.encodedSizeWithTag(8, aweme_v2_feed_response.refresh_clear) + ExtraStructV2.ADAPTER.encodedSizeWithTag(9, aweme_v2_feed_response.extra) + LogPbStructV2.ADAPTER.encodedSizeWithTag(10, aweme_v2_feed_response.log_pb) + ProtoAdapter.STRING.encodedSizeWithTag(11, aweme_v2_feed_response.DebugInfo) + GuideWordV2.ADAPTER.encodedSizeWithTag(12, aweme_v2_feed_response.guide_word) + AwemeStructV2.ADAPTER.asRepeated().encodedSizeWithTag(13, aweme_v2_feed_response.preload_ads) + ProtoAdapter.STRING.encodedSizeWithTag(14, aweme_v2_feed_response.status_msg) + ProtoAdapter.INT32.encodedSizeWithTag(15, aweme_v2_feed_response.block_code) + AwemeStructV2.ADAPTER.asRepeated().encodedSizeWithTag(16, aweme_v2_feed_response.preload_awemes) + aweme_v2_feed_response.unknownFields().size();
        }

        public final aweme_v2_feed_response decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.status_code((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.min_cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.max_cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.has_more((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.aweme_list.add(AwemeStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.rid((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.home_model((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 8:
                            builder.refresh_clear((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 9:
                            builder.extra((ExtraStructV2) ExtraStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            builder.log_pb((LogPbStructV2) LogPbStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            builder.DebugInfo((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 12:
                            builder.guide_word((GuideWordV2) GuideWordV2.ADAPTER.decode(protoReader));
                            break;
                        case 13:
                            builder.preload_ads.add(AwemeStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 14:
                            builder.status_msg((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            builder.block_code((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 16:
                            builder.preload_awemes.add(AwemeStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, aweme_v2_feed_response aweme_v2_feed_response) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, aweme_v2_feed_response.status_code);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, aweme_v2_feed_response.min_cursor);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, aweme_v2_feed_response.max_cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, aweme_v2_feed_response.has_more);
            AwemeStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, aweme_v2_feed_response.aweme_list);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, aweme_v2_feed_response.rid);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, aweme_v2_feed_response.home_model);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, aweme_v2_feed_response.refresh_clear);
            ExtraStructV2.ADAPTER.encodeWithTag(protoWriter, 9, aweme_v2_feed_response.extra);
            LogPbStructV2.ADAPTER.encodeWithTag(protoWriter, 10, aweme_v2_feed_response.log_pb);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, aweme_v2_feed_response.DebugInfo);
            GuideWordV2.ADAPTER.encodeWithTag(protoWriter, 12, aweme_v2_feed_response.guide_word);
            AwemeStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 13, aweme_v2_feed_response.preload_ads);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, aweme_v2_feed_response.status_msg);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, aweme_v2_feed_response.block_code);
            AwemeStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 16, aweme_v2_feed_response.preload_awemes);
            protoWriter.writeBytes(aweme_v2_feed_response.unknownFields());
        }
    }

    public aweme_v2_feed_response() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.status_code = this.status_code;
        builder.min_cursor = this.min_cursor;
        builder.max_cursor = this.max_cursor;
        builder.has_more = this.has_more;
        builder.aweme_list = Internal.copyOf("aweme_list", this.aweme_list);
        builder.rid = this.rid;
        builder.home_model = this.home_model;
        builder.refresh_clear = this.refresh_clear;
        builder.extra = this.extra;
        builder.log_pb = this.log_pb;
        builder.DebugInfo = this.DebugInfo;
        builder.guide_word = this.guide_word;
        builder.preload_ads = Internal.copyOf("preload_ads", this.preload_ads);
        builder.status_msg = this.status_msg;
        builder.block_code = this.block_code;
        builder.preload_awemes = Internal.copyOf("preload_awemes", this.preload_awemes);
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
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i14 = 0;
        if (this.status_code != null) {
            i = this.status_code.hashCode();
        } else {
            i = 0;
        }
        int i15 = (hashCode + i) * 37;
        if (this.min_cursor != null) {
            i2 = this.min_cursor.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = (i15 + i2) * 37;
        if (this.max_cursor != null) {
            i3 = this.max_cursor.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (i16 + i3) * 37;
        if (this.has_more != null) {
            i4 = this.has_more.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode2 = (((i17 + i4) * 37) + this.aweme_list.hashCode()) * 37;
        if (this.rid != null) {
            i5 = this.rid.hashCode();
        } else {
            i5 = 0;
        }
        int i18 = (hashCode2 + i5) * 37;
        if (this.home_model != null) {
            i6 = this.home_model.hashCode();
        } else {
            i6 = 0;
        }
        int i19 = (i18 + i6) * 37;
        if (this.refresh_clear != null) {
            i7 = this.refresh_clear.hashCode();
        } else {
            i7 = 0;
        }
        int i20 = (i19 + i7) * 37;
        if (this.extra != null) {
            i8 = this.extra.hashCode();
        } else {
            i8 = 0;
        }
        int i21 = (i20 + i8) * 37;
        if (this.log_pb != null) {
            i9 = this.log_pb.hashCode();
        } else {
            i9 = 0;
        }
        int i22 = (i21 + i9) * 37;
        if (this.DebugInfo != null) {
            i10 = this.DebugInfo.hashCode();
        } else {
            i10 = 0;
        }
        int i23 = (i22 + i10) * 37;
        if (this.guide_word != null) {
            i11 = this.guide_word.hashCode();
        } else {
            i11 = 0;
        }
        int hashCode3 = (((i23 + i11) * 37) + this.preload_ads.hashCode()) * 37;
        if (this.status_msg != null) {
            i12 = this.status_msg.hashCode();
        } else {
            i12 = 0;
        }
        int i24 = (hashCode3 + i12) * 37;
        if (this.block_code != null) {
            i14 = this.block_code.hashCode();
        }
        int hashCode4 = ((i24 + i14) * 37) + this.preload_awemes.hashCode();
        this.hashCode = hashCode4;
        return hashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.status_code != null) {
            sb.append(", status_code=");
            sb.append(this.status_code);
        }
        if (this.min_cursor != null) {
            sb.append(", min_cursor=");
            sb.append(this.min_cursor);
        }
        if (this.max_cursor != null) {
            sb.append(", max_cursor=");
            sb.append(this.max_cursor);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (!this.aweme_list.isEmpty()) {
            sb.append(", aweme_list=");
            sb.append(this.aweme_list);
        }
        if (this.rid != null) {
            sb.append(", rid=");
            sb.append(this.rid);
        }
        if (this.home_model != null) {
            sb.append(", home_model=");
            sb.append(this.home_model);
        }
        if (this.refresh_clear != null) {
            sb.append(", refresh_clear=");
            sb.append(this.refresh_clear);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.log_pb != null) {
            sb.append(", log_pb=");
            sb.append(this.log_pb);
        }
        if (this.DebugInfo != null) {
            sb.append(", DebugInfo=");
            sb.append(this.DebugInfo);
        }
        if (this.guide_word != null) {
            sb.append(", guide_word=");
            sb.append(this.guide_word);
        }
        if (!this.preload_ads.isEmpty()) {
            sb.append(", preload_ads=");
            sb.append(this.preload_ads);
        }
        if (this.status_msg != null) {
            sb.append(", status_msg=");
            sb.append(this.status_msg);
        }
        if (this.block_code != null) {
            sb.append(", block_code=");
            sb.append(this.block_code);
        }
        if (!this.preload_awemes.isEmpty()) {
            sb.append(", preload_awemes=");
            sb.append(this.preload_awemes);
        }
        StringBuilder replace = sb.replace(0, 2, "aweme_v2_feed_response{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aweme_v2_feed_response)) {
            return false;
        }
        aweme_v2_feed_response aweme_v2_feed_response = (aweme_v2_feed_response) obj;
        if (!unknownFields().equals(aweme_v2_feed_response.unknownFields()) || !Internal.equals(this.status_code, aweme_v2_feed_response.status_code) || !Internal.equals(this.min_cursor, aweme_v2_feed_response.min_cursor) || !Internal.equals(this.max_cursor, aweme_v2_feed_response.max_cursor) || !Internal.equals(this.has_more, aweme_v2_feed_response.has_more) || !this.aweme_list.equals(aweme_v2_feed_response.aweme_list) || !Internal.equals(this.rid, aweme_v2_feed_response.rid) || !Internal.equals(this.home_model, aweme_v2_feed_response.home_model) || !Internal.equals(this.refresh_clear, aweme_v2_feed_response.refresh_clear) || !Internal.equals(this.extra, aweme_v2_feed_response.extra) || !Internal.equals(this.log_pb, aweme_v2_feed_response.log_pb) || !Internal.equals(this.DebugInfo, aweme_v2_feed_response.DebugInfo) || !Internal.equals(this.guide_word, aweme_v2_feed_response.guide_word) || !this.preload_ads.equals(aweme_v2_feed_response.preload_ads) || !Internal.equals(this.status_msg, aweme_v2_feed_response.status_msg) || !Internal.equals(this.block_code, aweme_v2_feed_response.block_code) || !this.preload_awemes.equals(aweme_v2_feed_response.preload_awemes)) {
            return false;
        }
        return true;
    }

    public aweme_v2_feed_response(Integer num, Long l, Long l2, Integer num2, List<AwemeStructV2> list, String str, Integer num3, Integer num4, ExtraStructV2 extraStructV2, LogPbStructV2 logPbStructV2, String str2, GuideWordV2 guideWordV2, List<AwemeStructV2> list2, String str3, Integer num5, List<AwemeStructV2> list3) {
        this(num, l, l2, num2, list, str, num3, num4, extraStructV2, logPbStructV2, str2, guideWordV2, list2, str3, num5, list3, ByteString.EMPTY);
    }

    public aweme_v2_feed_response(Integer num, Long l, Long l2, Integer num2, List<AwemeStructV2> list, String str, Integer num3, Integer num4, ExtraStructV2 extraStructV2, LogPbStructV2 logPbStructV2, String str2, GuideWordV2 guideWordV2, List<AwemeStructV2> list2, String str3, Integer num5, List<AwemeStructV2> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status_code = num;
        this.min_cursor = l;
        this.max_cursor = l2;
        this.has_more = num2;
        List<AwemeStructV2> list4 = list;
        this.aweme_list = Internal.immutableCopyOf("aweme_list", list);
        this.rid = str;
        this.home_model = num3;
        this.refresh_clear = num4;
        this.extra = extraStructV2;
        this.log_pb = logPbStructV2;
        this.DebugInfo = str2;
        this.guide_word = guideWordV2;
        this.preload_ads = Internal.immutableCopyOf("preload_ads", list2);
        this.status_msg = str3;
        this.block_code = num5;
        this.preload_awemes = Internal.immutableCopyOf("preload_awemes", list3);
    }
}
