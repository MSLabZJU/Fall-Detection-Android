package com.tristanhuang.falldetection.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * - ████████╗██████╗ ██╗███████╗████████╗ █████╗ ███╗   ██╗
 * - ╚══██╔══╝██╔══██╗██║██╔════╝╚══██╔══╝██╔══██╗████╗  ██║
 * -    ██║   ██████╔╝██║███████╗   ██║   ███████║██╔██╗ ██║
 * -    ██║   ██╔══██╗██║╚════██║   ██║   ██╔══██║██║╚██╗██║
 * -    ██║   ██║  ██║██║███████║   ██║   ██║  ██║██║ ╚████║
 * -    ╚═╝   ╚═╝  ╚═╝╚═╝╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═══╝
 *
 * @Description TODO
 * @Date October 14, 2018 at 10:45:32 PM GMT+8
 * @Version 1.0
 */
public class TestService extends Service {
    public TestService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     *
     */
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
