package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.C10939b;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.pushGuideInfo */
public final class pushGuideInfo extends Message<pushGuideInfo, Builder> {
    public static final DefaultValueProtoAdapter<pushGuideInfo> ADAPTER = new ProtoAdapter_pushGuideInfo();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 1)
    public final Integer close_count_limit;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 2)
    public final Integer showup_interval;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.pushGuideInfo$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<pushGuideInfo, Builder> {
        public Integer close_count_limit = Integer.valueOf(3);
        public Integer showup_interval = Integer.valueOf(15);

        public final pushGuideInfo build() {
            if (this.close_count_limit != null && this.showup_interval != null) {
                return new pushGuideInfo(this.close_count_limit, this.showup_interval, super.buildUnknownFields());
            }
            throw C10939b.m32101a(this.close_count_limit, "close_count_limit", this.showup_interval, "showup_interval");
        }

        public final Builder close_count_limit(Integer num) {
            this.close_count_limit = num;
            return this;
        }

        public final Builder showup_interval(Integer num) {
            this.showup_interval = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.pushGuideInfo$ProtoAdapter_pushGuideInfo */
    static final class ProtoAdapter_pushGuideInfo extends DefaultValueProtoAdapter<pushGuideInfo> {
        public final pushGuideInfo redact(pushGuideInfo pushguideinfo) {
            return pushguideinfo;
        }

        public ProtoAdapter_pushGuideInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, pushGuideInfo.class);
        }

        public final pushGuideInfo decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (pushGuideInfo) null);
        }

        public final int encodedSize(pushGuideInfo pushguideinfo) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, pushguideinfo.close_count_limit) + ProtoAdapter.INT32.encodedSizeWithTag(2, pushguideinfo.showup_interval) + pushguideinfo.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, pushGuideInfo pushguideinfo) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, pushguideinfo.close_count_limit);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pushguideinfo.showup_interval);
            protoWriter.writeBytes(pushguideinfo.unknownFields());
        }

        public final pushGuideInfo decode(ProtoReader protoReader, pushGuideInfo pushguideinfo) throws IOException {
            Builder builder;
            pushGuideInfo pushguideinfo2 = (pushGuideInfo) C10938a.m32097a().mo26425a(pushGuideInfo.class, pushguideinfo);
            if (pushguideinfo2 != null) {
                builder = pushguideinfo2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.close_count_limit((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.showup_interval((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (pushguideinfo2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final Integer getCloseCountLimit() {
        return this.close_count_limit;
    }

    public final Integer getShowupInterval() {
        return this.showup_interval;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.close_count_limit = this.close_count_limit;
        builder.showup_interval = this.showup_interval;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((unknownFields().hashCode() * 37) + this.close_count_limit.hashCode()) * 37) + this.showup_interval.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", close_count_limit=");
        sb.append(this.close_count_limit);
        sb.append(", showup_interval=");
        sb.append(this.showup_interval);
        StringBuilder replace = sb.replace(0, 2, "pushGuideInfo{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pushGuideInfo)) {
            return false;
        }
        pushGuideInfo pushguideinfo = (pushGuideInfo) obj;
        if (!unknownFields().equals(pushguideinfo.unknownFields()) || !this.close_count_limit.equals(pushguideinfo.close_count_limit) || !this.showup_interval.equals(pushguideinfo.showup_interval)) {
            return false;
        }
        return true;
    }

    public pushGuideInfo(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public pushGuideInfo(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.close_count_limit = num;
        this.showup_interval = num2;
    }
}
