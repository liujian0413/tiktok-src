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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LiveInnerPushConfig */
public final class LiveInnerPushConfig extends Message<LiveInnerPushConfig, Builder> {
    public static final DefaultValueProtoAdapter<LiveInnerPushConfig> ADAPTER = new ProtoAdapter_LiveInnerPushConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 3)
    public final Integer live_push_display_intervals;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 2)
    public final Integer live_push_display_unclicked_most_times;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 1)
    public final Integer live_push_most_display_times;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LiveInnerPushConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<LiveInnerPushConfig, Builder> {
        public Integer live_push_display_intervals = Integer.valueOf(3);
        public Integer live_push_display_unclicked_most_times = Integer.valueOf(3);
        public Integer live_push_most_display_times = Integer.valueOf(3);

        public final LiveInnerPushConfig build() {
            if (this.live_push_most_display_times != null && this.live_push_display_unclicked_most_times != null && this.live_push_display_intervals != null) {
                return new LiveInnerPushConfig(this.live_push_most_display_times, this.live_push_display_unclicked_most_times, this.live_push_display_intervals, super.buildUnknownFields());
            }
            throw C10939b.m32101a(this.live_push_most_display_times, "live_push_most_display_times", this.live_push_display_unclicked_most_times, "live_push_display_unclicked_most_times", this.live_push_display_intervals, "live_push_display_intervals");
        }

        public final Builder live_push_display_intervals(Integer num) {
            this.live_push_display_intervals = num;
            return this;
        }

        public final Builder live_push_display_unclicked_most_times(Integer num) {
            this.live_push_display_unclicked_most_times = num;
            return this;
        }

        public final Builder live_push_most_display_times(Integer num) {
            this.live_push_most_display_times = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LiveInnerPushConfig$ProtoAdapter_LiveInnerPushConfig */
    static final class ProtoAdapter_LiveInnerPushConfig extends DefaultValueProtoAdapter<LiveInnerPushConfig> {
        public final LiveInnerPushConfig redact(LiveInnerPushConfig liveInnerPushConfig) {
            return liveInnerPushConfig;
        }

        public ProtoAdapter_LiveInnerPushConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, LiveInnerPushConfig.class);
        }

        public final LiveInnerPushConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (LiveInnerPushConfig) null);
        }

        public final int encodedSize(LiveInnerPushConfig liveInnerPushConfig) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, liveInnerPushConfig.live_push_most_display_times) + ProtoAdapter.INT32.encodedSizeWithTag(2, liveInnerPushConfig.live_push_display_unclicked_most_times) + ProtoAdapter.INT32.encodedSizeWithTag(3, liveInnerPushConfig.live_push_display_intervals) + liveInnerPushConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, LiveInnerPushConfig liveInnerPushConfig) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, liveInnerPushConfig.live_push_most_display_times);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, liveInnerPushConfig.live_push_display_unclicked_most_times);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, liveInnerPushConfig.live_push_display_intervals);
            protoWriter.writeBytes(liveInnerPushConfig.unknownFields());
        }

        public final LiveInnerPushConfig decode(ProtoReader protoReader, LiveInnerPushConfig liveInnerPushConfig) throws IOException {
            Builder builder;
            LiveInnerPushConfig liveInnerPushConfig2 = (LiveInnerPushConfig) C10938a.m32097a().mo26425a(LiveInnerPushConfig.class, liveInnerPushConfig);
            if (liveInnerPushConfig2 != null) {
                builder = liveInnerPushConfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.live_push_most_display_times((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.live_push_display_unclicked_most_times((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.live_push_display_intervals((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (liveInnerPushConfig2 != null) {
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

    public final Integer getLivePushDisplayIntervals() {
        return this.live_push_display_intervals;
    }

    public final Integer getLivePushDisplayUnclickedMostTimes() {
        return this.live_push_display_unclicked_most_times;
    }

    public final Integer getLivePushMostDisplayTimes() {
        return this.live_push_most_display_times;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.live_push_most_display_times = this.live_push_most_display_times;
        builder.live_push_display_unclicked_most_times = this.live_push_display_unclicked_most_times;
        builder.live_push_display_intervals = this.live_push_display_intervals;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((unknownFields().hashCode() * 37) + this.live_push_most_display_times.hashCode()) * 37) + this.live_push_display_unclicked_most_times.hashCode()) * 37) + this.live_push_display_intervals.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", live_push_most_display_times=");
        sb.append(this.live_push_most_display_times);
        sb.append(", live_push_display_unclicked_most_times=");
        sb.append(this.live_push_display_unclicked_most_times);
        sb.append(", live_push_display_intervals=");
        sb.append(this.live_push_display_intervals);
        StringBuilder replace = sb.replace(0, 2, "LiveInnerPushConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveInnerPushConfig)) {
            return false;
        }
        LiveInnerPushConfig liveInnerPushConfig = (LiveInnerPushConfig) obj;
        if (!unknownFields().equals(liveInnerPushConfig.unknownFields()) || !this.live_push_most_display_times.equals(liveInnerPushConfig.live_push_most_display_times) || !this.live_push_display_unclicked_most_times.equals(liveInnerPushConfig.live_push_display_unclicked_most_times) || !this.live_push_display_intervals.equals(liveInnerPushConfig.live_push_display_intervals)) {
            return false;
        }
        return true;
    }

    public LiveInnerPushConfig(Integer num, Integer num2, Integer num3) {
        this(num, num2, num3, ByteString.EMPTY);
    }

    public LiveInnerPushConfig(Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.live_push_most_display_times = num;
        this.live_push_display_unclicked_most_times = num2;
        this.live_push_display_intervals = num3;
    }
}
