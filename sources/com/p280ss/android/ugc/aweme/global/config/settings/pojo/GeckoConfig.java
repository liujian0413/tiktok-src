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
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.GeckoConfig */
public final class GeckoConfig extends Message<GeckoConfig, Builder> {
    public static final DefaultValueProtoAdapter<GeckoConfig> ADAPTER = new ProtoAdapter_GeckoConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 6)
    public final List<String> dyc_channel;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 1)
    public final List<String> initial_channel;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 7)
    public final List<String> initial_high_priority_channel;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer rn_context_create_timeout;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean rn_preload_context;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public final Boolean rn_use_snapshot;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public final Boolean use_new_package_now;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.GeckoConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GeckoConfig, Builder> {
        public List<String> dyc_channel = Internal.newMutableList();
        public List<String> initial_channel = Internal.newMutableList();
        public List<String> initial_high_priority_channel = Internal.newMutableList();
        public Integer rn_context_create_timeout;
        public Boolean rn_preload_context;
        public Boolean rn_use_snapshot;
        public Boolean use_new_package_now;

        public final GeckoConfig build() {
            GeckoConfig geckoConfig = new GeckoConfig(this.initial_channel, this.rn_context_create_timeout, this.rn_preload_context, this.use_new_package_now, this.rn_use_snapshot, this.dyc_channel, this.initial_high_priority_channel, super.buildUnknownFields());
            return geckoConfig;
        }

        public final Builder rn_context_create_timeout(Integer num) {
            this.rn_context_create_timeout = num;
            return this;
        }

        public final Builder rn_preload_context(Boolean bool) {
            this.rn_preload_context = bool;
            return this;
        }

        public final Builder rn_use_snapshot(Boolean bool) {
            this.rn_use_snapshot = bool;
            return this;
        }

        public final Builder use_new_package_now(Boolean bool) {
            this.use_new_package_now = bool;
            return this;
        }

        public final Builder dyc_channel(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.dyc_channel = list;
            return this;
        }

        public final Builder initial_channel(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.initial_channel = list;
            return this;
        }

        public final Builder initial_high_priority_channel(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.initial_high_priority_channel = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.GeckoConfig$ProtoAdapter_GeckoConfig */
    static final class ProtoAdapter_GeckoConfig extends DefaultValueProtoAdapter<GeckoConfig> {
        public final GeckoConfig redact(GeckoConfig geckoConfig) {
            return geckoConfig;
        }

        public ProtoAdapter_GeckoConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, GeckoConfig.class);
        }

        public final GeckoConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (GeckoConfig) null);
        }

        public final int encodedSize(GeckoConfig geckoConfig) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, geckoConfig.initial_channel) + ProtoAdapter.INT32.encodedSizeWithTag(2, geckoConfig.rn_context_create_timeout) + ProtoAdapter.BOOL.encodedSizeWithTag(3, geckoConfig.rn_preload_context) + ProtoAdapter.BOOL.encodedSizeWithTag(4, geckoConfig.use_new_package_now) + ProtoAdapter.BOOL.encodedSizeWithTag(5, geckoConfig.rn_use_snapshot) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, geckoConfig.dyc_channel) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, geckoConfig.initial_high_priority_channel) + geckoConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, GeckoConfig geckoConfig) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, geckoConfig.initial_channel);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, geckoConfig.rn_context_create_timeout);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, geckoConfig.rn_preload_context);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, geckoConfig.use_new_package_now);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, geckoConfig.rn_use_snapshot);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, geckoConfig.dyc_channel);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 7, geckoConfig.initial_high_priority_channel);
            protoWriter.writeBytes(geckoConfig.unknownFields());
        }

        public final GeckoConfig decode(ProtoReader protoReader, GeckoConfig geckoConfig) throws IOException {
            Builder builder;
            GeckoConfig geckoConfig2 = (GeckoConfig) C10938a.m32097a().mo26425a(GeckoConfig.class, geckoConfig);
            if (geckoConfig2 != null) {
                builder = geckoConfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<String> newMutableList = Internal.newMutableList();
            List<String> newMutableList2 = Internal.newMutableList();
            List<String> newMutableList3 = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            newMutableList.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.rn_context_create_timeout((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.rn_preload_context((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.use_new_package_now((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 5:
                            builder.rn_use_snapshot((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 6:
                            newMutableList2.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            newMutableList3.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (geckoConfig2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.initial_channel = newMutableList;
                    }
                    if (!newMutableList2.isEmpty()) {
                        builder.dyc_channel = newMutableList2;
                    }
                    if (!newMutableList3.isEmpty()) {
                        builder.initial_high_priority_channel = newMutableList3;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final List<String> getDycChannel() {
        return this.dyc_channel;
    }

    public final List<String> getInitialChannel() {
        return this.initial_channel;
    }

    public final List<String> getInitialHighPriorityChannel() {
        return this.initial_high_priority_channel;
    }

    public final Integer getRnContextCreateTimeout() throws NullValueException {
        if (this.rn_context_create_timeout != null) {
            return this.rn_context_create_timeout;
        }
        throw new NullValueException();
    }

    public final Boolean getRnPreloadContext() throws NullValueException {
        if (this.rn_preload_context != null) {
            return this.rn_preload_context;
        }
        throw new NullValueException();
    }

    public final Boolean getRnUseSnapshot() throws NullValueException {
        if (this.rn_use_snapshot != null) {
            return this.rn_use_snapshot;
        }
        throw new NullValueException();
    }

    public final Boolean getUseNewPackageNow() throws NullValueException {
        if (this.use_new_package_now != null) {
            return this.use_new_package_now;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.initial_channel = Internal.copyOf("initial_channel", this.initial_channel);
        builder.rn_context_create_timeout = this.rn_context_create_timeout;
        builder.rn_preload_context = this.rn_preload_context;
        builder.use_new_package_now = this.use_new_package_now;
        builder.rn_use_snapshot = this.rn_use_snapshot;
        builder.dyc_channel = Internal.copyOf("dyc_channel", this.dyc_channel);
        builder.initial_high_priority_channel = Internal.copyOf("initial_high_priority_channel", this.initial_high_priority_channel);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.initial_channel.hashCode()) * 37;
        int i5 = 0;
        if (this.rn_context_create_timeout != null) {
            i = this.rn_context_create_timeout.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.rn_preload_context != null) {
            i2 = this.rn_preload_context.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.use_new_package_now != null) {
            i3 = this.use_new_package_now.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.rn_use_snapshot != null) {
            i5 = this.rn_use_snapshot.hashCode();
        }
        int hashCode2 = ((((i8 + i5) * 37) + this.dyc_channel.hashCode()) * 37) + this.initial_high_priority_channel.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.initial_channel.isEmpty()) {
            sb.append(", initial_channel=");
            sb.append(this.initial_channel);
        }
        if (this.rn_context_create_timeout != null) {
            sb.append(", rn_context_create_timeout=");
            sb.append(this.rn_context_create_timeout);
        }
        if (this.rn_preload_context != null) {
            sb.append(", rn_preload_context=");
            sb.append(this.rn_preload_context);
        }
        if (this.use_new_package_now != null) {
            sb.append(", use_new_package_now=");
            sb.append(this.use_new_package_now);
        }
        if (this.rn_use_snapshot != null) {
            sb.append(", rn_use_snapshot=");
            sb.append(this.rn_use_snapshot);
        }
        if (!this.dyc_channel.isEmpty()) {
            sb.append(", dyc_channel=");
            sb.append(this.dyc_channel);
        }
        if (!this.initial_high_priority_channel.isEmpty()) {
            sb.append(", initial_high_priority_channel=");
            sb.append(this.initial_high_priority_channel);
        }
        StringBuilder replace = sb.replace(0, 2, "GeckoConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GeckoConfig)) {
            return false;
        }
        GeckoConfig geckoConfig = (GeckoConfig) obj;
        if (!unknownFields().equals(geckoConfig.unknownFields()) || !this.initial_channel.equals(geckoConfig.initial_channel) || !Internal.equals(this.rn_context_create_timeout, geckoConfig.rn_context_create_timeout) || !Internal.equals(this.rn_preload_context, geckoConfig.rn_preload_context) || !Internal.equals(this.use_new_package_now, geckoConfig.use_new_package_now) || !Internal.equals(this.rn_use_snapshot, geckoConfig.rn_use_snapshot) || !this.dyc_channel.equals(geckoConfig.dyc_channel) || !this.initial_high_priority_channel.equals(geckoConfig.initial_high_priority_channel)) {
            return false;
        }
        return true;
    }

    public GeckoConfig(List<String> list, Integer num, Boolean bool, Boolean bool2, Boolean bool3, List<String> list2, List<String> list3) {
        this(list, num, bool, bool2, bool3, list2, list3, ByteString.EMPTY);
    }

    public GeckoConfig(List<String> list, Integer num, Boolean bool, Boolean bool2, Boolean bool3, List<String> list2, List<String> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.initial_channel = Internal.immutableCopyOf("initial_channel", list);
        this.rn_context_create_timeout = num;
        this.rn_preload_context = bool;
        this.use_new_package_now = bool2;
        this.rn_use_snapshot = bool3;
        this.dyc_channel = Internal.immutableCopyOf("dyc_channel", list2);
        this.initial_high_priority_channel = Internal.immutableCopyOf("initial_high_priority_channel", list3);
    }
}
