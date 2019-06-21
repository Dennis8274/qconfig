package qunar.tc.qconfig.common.support;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * Created by pingyang.yang on 2018/11/21
 */
public class ServerLocalContextLoader {

    public static Map<String, String> loadLocalContext() {
        Map<String, String> result = readLocalConf();
        if (result.isEmpty()) {
            throw new IllegalArgumentException("没有找到应用配置文件app-info.properties，请查看");
        }
        return result;
    }

    private static ImmutableMap<String, String> readLocalConf() {
        final ResourceConfig config = ResourceConfig.getOrNull("app-info.properties");
        if (config == null) {
            return ImmutableMap.of();
        } else {
            return ImmutableMap.copyOf(config.getAll());
        }
    }


}
