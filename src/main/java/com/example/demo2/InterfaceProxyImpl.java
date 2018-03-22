package com.example.demo2;
/**
 * Created by Bartlomiej Wichowski Date: 3/22/2018 Time: 3:00 PM
 */

import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/**
 *
 */
@Service
public class InterfaceProxyImpl implements InterfaceProxy {

    @Override
    public boolean getData() {
        return TransactionSynchronizationManager.isActualTransactionActive();
    }
}
