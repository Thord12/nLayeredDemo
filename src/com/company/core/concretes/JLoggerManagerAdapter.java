package com.company.core.concretes;

import com.company.core.abstracts.LoggerService;
import com.company.jLogger.concretes.JloggerManager;


public class JLoggerManagerAdapter implements LoggerService {
    @Override
    public void log2System(String message) {
        JloggerManager manager=new JloggerManager();
        manager.log(message);
    }
}
