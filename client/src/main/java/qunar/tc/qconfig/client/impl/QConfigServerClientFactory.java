package qunar.tc.qconfig.client.impl;

/**
 * Created by zhaohui.yu
 * 1/29/18
 */
public class QConfigServerClientFactory {

    public static QConfigServerClient create() {
        return new QueueQConfigServerClient(new QConfigHttpServerClient());
    }
}
