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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_discover_abtest_modules_LiveSquareEntranceAnimConfig */
public final class C30211xb9e2f2d7 extends Message<C30211xb9e2f2d7, Builder> {
    public static final DefaultValueProtoAdapter<C30211xb9e2f2d7> ADAPTER = new C30212x5c4494ff();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 236091275)
    public final Integer live_square_entrance_anim_duration;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 255157785)
    public final Integer live_square_entrance_anim_frequency;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 33767890)
    public final Integer live_square_entrance_anim_times;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_discover_abtest_modules_LiveSquareEntranceAnimConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<C30211xb9e2f2d7, Builder> {
        public Integer live_square_entrance_anim_duration;
        public Integer live_square_entrance_anim_frequency;
        public Integer live_square_entrance_anim_times;

        public final C30211xb9e2f2d7 build() {
            return new C30211xb9e2f2d7(this.live_square_entrance_anim_frequency, this.live_square_entrance_anim_times, this.live_square_entrance_anim_duration, super.buildUnknownFields());
        }

        public final Builder live_square_entrance_anim_duration(Integer num) {
            this.live_square_entrance_anim_duration = num;
            return this;
        }

        public final Builder live_square_entrance_anim_frequency(Integer num) {
            this.live_square_entrance_anim_frequency = num;
            return this;
        }

        public final Builder live_square_entrance_anim_times(Integer num) {
            this.live_square_entrance_anim_times = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_discover_abtest_modules_LiveSquareEntranceAnimConfig$ProtoAdapter_com_ss_android_ugc_aweme_discover_abtest_modules_LiveSquareEntranceAnimConfig */
    static final class C30212x5c4494ff extends DefaultValueProtoAdapter<C30211xb9e2f2d7> {
        public final C30211xb9e2f2d7 redact(C30211xb9e2f2d7 com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig) {
            return com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig;
        }

        public C30212x5c4494ff() {
            super(FieldEncoding.LENGTH_DELIMITED, C30211xb9e2f2d7.class);
        }

        public final C30211xb9e2f2d7 decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (C30211xb9e2f2d7) null);
        }

        public final int encodedSize(C30211xb9e2f2d7 com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig) {
            return ProtoAdapter.INT32.encodedSizeWithTag(255157785, com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig.live_square_entrance_anim_frequency) + ProtoAdapter.INT32.encodedSizeWithTag(33767890, com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig.live_square_entrance_anim_times) + ProtoAdapter.INT32.encodedSizeWithTag(236091275, com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig.live_square_entrance_anim_duration) + com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, C30211xb9e2f2d7 com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 255157785, com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig.live_square_entrance_anim_frequency);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 33767890, com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig.live_square_entrance_anim_times);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 236091275, com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig.live_square_entrance_anim_duration);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig.unknownFields());
        }

        public final C30211xb9e2f2d7 decode(ProtoReader protoReader, C30211xb9e2f2d7 com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig) throws IOException {
            Builder builder;
            C30211xb9e2f2d7 com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig2 = (C30211xb9e2f2d7) C10938a.m32097a().mo26425a(C30211xb9e2f2d7.class, com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig);
            if (com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig2 != null) {
                builder = com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 33767890) {
                    builder.live_square_entrance_anim_times((Integer) ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 236091275) {
                    builder.live_square_entrance_anim_duration((Integer) ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 255157785) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (MissingRequiredFieldsException e) {
                        if (com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.live_square_entrance_anim_frequency((Integer) ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }
    }

    public final Integer getLiveSquareEntranceAnimDuration() throws NullValueException {
        if (this.live_square_entrance_anim_duration != null) {
            return this.live_square_entrance_anim_duration;
        }
        throw new NullValueException();
    }

    public final Integer getLiveSquareEntranceAnimFrequency() throws NullValueException {
        if (this.live_square_entrance_anim_frequency != null) {
            return this.live_square_entrance_anim_frequency;
        }
        throw new NullValueException();
    }

    public final Integer getLiveSquareEntranceAnimTimes() throws NullValueException {
        if (this.live_square_entrance_anim_times != null) {
            return this.live_square_entrance_anim_times;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.live_square_entrance_anim_frequency = this.live_square_entrance_anim_frequency;
        builder.live_square_entrance_anim_times = this.live_square_entrance_anim_times;
        builder.live_square_entrance_anim_duration = this.live_square_entrance_anim_duration;
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
        if (this.live_square_entrance_anim_frequency != null) {
            i = this.live_square_entrance_anim_frequency.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.live_square_entrance_anim_times != null) {
            i2 = this.live_square_entrance_anim_times.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.live_square_entrance_anim_duration != null) {
            i4 = this.live_square_entrance_anim_duration.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.live_square_entrance_anim_frequency != null) {
            sb.append(", live_square_entrance_anim_frequency=");
            sb.append(this.live_square_entrance_anim_frequency);
        }
        if (this.live_square_entrance_anim_times != null) {
            sb.append(", live_square_entrance_anim_times=");
            sb.append(this.live_square_entrance_anim_times);
        }
        if (this.live_square_entrance_anim_duration != null) {
            sb.append(", live_square_entrance_anim_duration=");
            sb.append(this.live_square_entrance_anim_duration);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_discover_abtest_modules_LiveSquareEntranceAnimConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C30211xb9e2f2d7)) {
            return false;
        }
        C30211xb9e2f2d7 com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig = (C30211xb9e2f2d7) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig.unknownFields()) || !Internal.equals(this.live_square_entrance_anim_frequency, com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig.live_square_entrance_anim_frequency) || !Internal.equals(this.live_square_entrance_anim_times, com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig.live_square_entrance_anim_times) || !Internal.equals(this.live_square_entrance_anim_duration, com_ss_android_ugc_aweme_discover_abtest_modules_livesquareentranceanimconfig.live_square_entrance_anim_duration)) {
            return false;
        }
        return true;
    }

    public C30211xb9e2f2d7(Integer num, Integer num2, Integer num3) {
        this(num, num2, num3, ByteString.EMPTY);
    }

    public C30211xb9e2f2d7(Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.live_square_entrance_anim_frequency = num;
        this.live_square_entrance_anim_times = num2;
        this.live_square_entrance_anim_duration = num3;
    }
}
