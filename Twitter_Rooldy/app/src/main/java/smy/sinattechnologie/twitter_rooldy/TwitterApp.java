package smy.sinattechnologie.twitter_rooldy;

import android.app.Application;
import android.content.Context;

/**
 * Created by Alfonso on 23-Oct-17.
 */

public class RestApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        FlowManager.init(new FlowConfig.Builder(this).build());
        FlowLog.setMinimumLoggingLevel(FlowLog.Level.V);

        RestApplication.context = this;
    }

    public static RestClient getRestClient() {
        return (RestClient) RestClient.getInstance(RestClient.class, RestApplication.context);
    }
}