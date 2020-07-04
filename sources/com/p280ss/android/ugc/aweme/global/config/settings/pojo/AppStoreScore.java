package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AppStoreScore */
public final class AppStoreScore extends Message<AppStoreScore, Builder> {
    public static final DefaultValueProtoAdapter<AppStoreScore> ADAPTER = new ProtoAdapter_AppStoreScore();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer section;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer switch_;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer threshold;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AppStoreScore$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AppStoreScore, Builder> {
        public Integer section;
        public Integer switch_;
        public Integer threshold;

        public final AppStoreScore build() {
            return new AppStoreScore(this.switch_, this.section, this.threshold, super.buildUnknownFields());
        }

        public final Builder section(Integer num) {
            this.section = num;
            return this;
        }

        public final Builder switch_(Integer num) {
            this.switch_ = num;
            return this;
        }

        public final Builder threshold(Integer num) {
            this.threshold = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AppStoreScore$ProtoAdapter_AppStoreScore */
    static final class ProtoAdapter_AppStoreScore extends DefaultValueProtoAdapter<AppStoreScore> {
        public final AppStoreScore redact(AppStoreScore appStoreScore) {
            return appStoreScore;
        }

        public ProtoAdapter_AppStoreScore() {
            super(FieldEncoding.LENGTH_DELIMITED, AppStoreScore.class);
        }

        public final AppStoreScore decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (AppStoreScore) null);
        }

        public final int encodedSize(AppStoreScore appStoreScore) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, appStoreScore.switch_) + ProtoAdapter.INT32.encodedSizeWithTag(2, appStoreScore.section) + ProtoAdapter.INT32.encodedSizeWithTag(3, appStoreScore.threshold) + appStoreScore.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, AppStoreScore appStoreScore) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, appStoreScore.switch_);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, appStoreScore.section);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, appStoreScore.threshold);
            protoWriter.writeBytes(appStoreScore.unknownFields());
        }

        public final AppStoreScore decode(ProtoReader protoReader, AppStoreScore appStoreScore) throws IOException {
            Builder builder;
            AppStoreScore appStoreScore2 = (AppStoreScore) C10938a.m32097a().mo26425a(AppStoreScore.class, appStoreScore);
            if (appStoreScore2 != null) {
                builder = appStoreScore2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.switch_((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.section((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.threshold((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (appStoreScore2 != null) {
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

    public final Integer getSection() throws NullValueException {
        if (this.section != null) {
            return this.section;
        }
        throw new NullValueException();
    }

    public final Integer getSwitch() throws NullValueException {
        if (this.switch_ != null) {
            return this.switch_;
        }
        throw new NullValueException();
    }

    public final Integer getThreshold() throws NullValueException {
        if (this.threshold != null) {
            return this.threshold;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.switch_ = this.switch_;
        builder.section = this.section;
        builder.threshold = this.threshold;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.switch_ != null) {
            i = this.switch_.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.section != null) {
            i2 = this.section.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.threshold != null) {
            i4 = this.threshold.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.switch_ != null) {
            sb.append(", switch=");
            sb.append(this.switch_);
        }
        if (this.section != null) {
            sb.append(", section=");
            sb.append(this.section);
        }
        if (this.threshold != null) {
            sb.append(", threshold=");
            sb.append(this.threshold);
        }
        StringBuilder replace = sb.replace(0, 2, "AppStoreScore{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppStoreScore)) {
            return false;
        }
        AppStoreScore appStoreScore = (AppStoreScore) obj;
        if (!unknownFields().equals(appStoreScore.unknownFields()) || !Internal.equals(this.switch_, appStoreScore.switch_) || !Internal.equals(this.section, appStoreScore.section) || !Internal.equals(this.threshold, appStoreScore.threshold)) {
            return false;
        }
        return true;
    }

    public AppStoreScore(Integer num, Integer num2, Integer num3) {
        this(num, num2, num3, ByteString.EMPTY);
    }

    public AppStoreScore(Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.switch_ = num;
        this.section = num2;
        this.threshold = num3;
    }
}
